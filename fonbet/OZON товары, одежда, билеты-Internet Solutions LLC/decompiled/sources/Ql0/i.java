package Ql0;

import Sc.r;
import Sc.s;
import Ve.EnumC4801z0;
import Ve.Fl;
import Ve.Fm;
import Ve.InterfaceC4228f1;
import Ve.InterfaceC4370k;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboe;
import com.squareup.moshi.JsonAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.RedirectActivity;
import yl0.InterfaceC10918c;

/* loaded from: classes4.dex */
public final class i implements InterfaceC10918c, zbkf {
    public static final String b(JsonAdapter jsonAdapter, Object obj) {
        if (obj != null) {
            return jsonAdapter.toJson(obj);
        }
        return null;
    }

    public static final Object c(JsonAdapter jsonAdapter, String str) {
        Object a11;
        try {
            r.Companion companion = r.INSTANCE;
            a11 = str != null ? jsonAdapter.fromJson(str) : null;
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (a11 instanceof r.b) {
            return null;
        }
        return a11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        if (r2 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (r10 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x006d -> B:13:0x004c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007e -> B:11:0x0081). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(ArrayList arrayList, RedirectActivity redirectActivity, kotlin.coroutines.jvm.internal.c cVar) {
        Fl fl2;
        int i11;
        Iterator it;
        InterfaceC4228f1 interfaceC4228f1;
        Object obj;
        if (cVar instanceof Fl) {
            fl2 = (Fl) cVar;
            int i12 = fl2.f29019i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                fl2.f29019i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = fl2.f29017g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = fl2.f29019i;
                if (i11 != 0) {
                    s.b(obj2);
                    it = arrayList.iterator();
                    if (!it.hasNext()) {
                    }
                } else if (i11 == 1) {
                    InterfaceC4228f1 interfaceC4228f12 = fl2.f29016f;
                    Iterator it2 = fl2.f29015e;
                    RedirectActivity redirectActivity2 = fl2.f29014d;
                    s.b(obj2);
                    interfaceC4228f1 = interfaceC4228f12;
                    it = it2;
                    redirectActivity = redirectActivity2;
                    obj = obj2;
                    if (((Boolean) obj).booleanValue()) {
                        EnumC4801z0 enumC4801z0 = EnumC4801z0.f32616b;
                        fl2.f29014d = redirectActivity;
                        fl2.f29015e = it;
                        fl2.f29016f = null;
                        fl2.f29019i = 2;
                        obj2 = interfaceC4228f1.b(redirectActivity, enumC4801z0, fl2);
                    }
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = fl2.f29015e;
                    redirectActivity = fl2.f29014d;
                    s.b(obj2);
                    InterfaceC4370k interfaceC4370k = (InterfaceC4370k) obj2;
                    if (interfaceC4370k.a()) {
                        return interfaceC4370k;
                    }
                    if (!it.hasNext()) {
                        Intrinsics.checkNotNullParameter("All authentication methods failed", "errorMessage");
                        return new Fm();
                    }
                    interfaceC4228f1 = (InterfaceC4228f1) it.next();
                    fl2.f29014d = redirectActivity;
                    fl2.f29015e = it;
                    fl2.f29016f = interfaceC4228f1;
                    fl2.f29019i = 1;
                    obj = interfaceC4228f1.a(redirectActivity, fl2);
                }
            }
        }
        fl2 = new Fl(this, cVar);
        Object obj22 = fl2.f29017g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = fl2.f29019i;
        if (i11 != 0) {
        }
    }

    @Override // yl0.InterfaceC10918c
    public void onComplete() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkf
    public Object zba(Object obj) {
        return ((zboe) obj).zba();
    }
}
