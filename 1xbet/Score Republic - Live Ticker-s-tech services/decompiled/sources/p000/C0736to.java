package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: to */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0736to extends xb1 implements h60 {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f7538n;

    /* JADX INFO: renamed from: o */
    public int f7539o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f7540p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0736to(Object obj, InterfaceC0808vm interfaceC0808vm, int i) {
        super(1, interfaceC0808vm);
        this.f7538n = i;
        this.f7540p = obj;
    }

    @Override // p000.h60
    /* JADX INFO: renamed from: i */
    public final Object mo170i(Object obj) {
        int i = this.f7538n;
        kf1 kf1Var = kf1.f4365a;
        Object obj2 = this.f7540p;
        InterfaceC0808vm interfaceC0808vm = (InterfaceC0808vm) obj;
        switch (i) {
            case 0:
                return new C0736to((j71) obj2, interfaceC0808vm, 0).mo17m(kf1Var);
            default:
                return new C0736to((C0700sp) obj2, interfaceC0808vm, 1).mo17m(kf1Var);
        }
    }

    @Override // p000.AbstractC0243gb
    /* JADX INFO: renamed from: m */
    public final Object mo17m(Object obj) throws IOException {
        Context context;
        int i = this.f7538n;
        Object obj2 = this.f7540p;
        EnumC0513nn enumC0513nn = EnumC0513nn.f5459j;
        switch (i) {
            case 0:
                int i2 = this.f7539o;
                kf1 kf1Var = kf1.f4365a;
                if (i2 != 0) {
                    if (i2 == 1) {
                        wo1.m5395v(obj);
                        return kf1Var;
                    }
                    C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wo1.m5395v(obj);
                j71 j71Var = (j71) obj2;
                this.f7539o = 1;
                SharedPreferences.Editor editorEdit = ((SharedPreferences) j71Var.f3837e.m2847a()).edit();
                LinkedHashSet linkedHashSet = j71Var.f3838f;
                if (linkedHashSet == null) {
                    editorEdit.clear();
                } else {
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        editorEdit.remove((String) it.next());
                    }
                }
                if (!editorEdit.commit()) {
                    C0270h1.m2187c("Unable to delete migrated keys from SharedPreferences.");
                    return null;
                }
                if (((SharedPreferences) j71Var.f3837e.m2847a()).getAll().isEmpty() && (context = j71Var.f3835c) != null) {
                    h71.m2222a(context, j71Var.f3836d);
                }
                if (linkedHashSet != null) {
                    linkedHashSet.clear();
                }
                if (kf1Var == enumC0513nn) {
                    return enumC0513nn;
                }
                return kf1Var;
            default:
                int i3 = this.f7539o;
                if (i3 == 0) {
                    wo1.m5395v(obj);
                    this.f7539o = 1;
                    Object objMo170i = ((C0700sp) obj2).mo170i(this);
                    return objMo170i == enumC0513nn ? enumC0513nn : objMo170i;
                }
                if (i3 == 1) {
                    wo1.m5395v(obj);
                    return obj;
                }
                C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
