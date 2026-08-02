package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class j71 {

    /* JADX INFO: renamed from: a */
    public final C0257gp f3833a;

    /* JADX INFO: renamed from: b */
    public final k71 f3834b;

    /* JADX INFO: renamed from: c */
    public final Context f3835c;

    /* JADX INFO: renamed from: d */
    public final String f3836d;

    /* JADX INFO: renamed from: e */
    public final jc1 f3837e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashSet f3838f;

    public j71(Context context, String str, Set set, C0257gp c0257gp, k71 k71Var) {
        context.getClass();
        set.getClass();
        pw0 pw0Var = new pw0(context, str, 1);
        this.f3833a = c0257gp;
        this.f3834b = k71Var;
        this.f3835c = context;
        this.f3836d = str;
        this.f3837e = new jc1(pw0Var);
        this.f3838f = set == m71.f4997a ? null : new LinkedHashSet(set);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m2822a(Object obj, AbstractC0882xm abstractC0882xm) {
        i71 i71Var;
        if (abstractC0882xm instanceof i71) {
            i71Var = (i71) abstractC0882xm;
            int i = i71Var.f3456p;
            if ((i & Integer.MIN_VALUE) != 0) {
                i71Var.f3456p = i - Integer.MIN_VALUE;
            } else {
                i71Var = new i71(this, abstractC0882xm);
            }
        } else {
            i71Var = new i71(this, abstractC0882xm);
        }
        Object objMo1490g = i71Var.f3454n;
        int i2 = i71Var.f3456p;
        boolean z = true;
        if (i2 == 0) {
            wo1.m5395v(objMo1490g);
            i71Var.f3453m = this;
            i71Var.f3456p = 1;
            objMo1490g = this.f3833a.mo1490g(obj, i71Var);
            EnumC0513nn enumC0513nn = EnumC0513nn.f5459j;
            if (objMo1490g == enumC0513nn) {
                return enumC0513nn;
            }
        } else {
            if (i2 != 1) {
                C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = i71Var.f3453m;
            wo1.m5395v(objMo1490g);
        }
        if (!((Boolean) objMo1490g).booleanValue()) {
            return Boolean.FALSE;
        }
        LinkedHashSet linkedHashSet = this.f3838f;
        jc1 jc1Var = this.f3837e;
        if (linkedHashSet == null) {
            Map<String, ?> all = ((SharedPreferences) jc1Var.m2847a()).getAll();
            all.getClass();
            if (all.isEmpty()) {
                z = false;
            }
        } else {
            SharedPreferences sharedPreferences = (SharedPreferences) jc1Var.m2847a();
            if (linkedHashSet.isEmpty()) {
                z = false;
            } else {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    if (sharedPreferences.contains((String) it.next())) {
                    }
                }
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
