package G5;

import A5.r;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import g5.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import q0.g;
import w1.P2;

/* loaded from: classes2.dex */
public final class f implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3064a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3065b;

    public /* synthetic */ f(Object obj, int i7) {
        this.f3064a = i7;
        this.f3065b = obj;
    }

    @Override // A5.r
    public final void error(String str, String str2, Object obj) {
        switch (this.f3064a) {
            case 0:
                Map hashMap = new HashMap();
                if (str2 == null) {
                    str2 = "An unknown error occurred";
                }
                if (obj instanceof Map) {
                    hashMap = (Map) obj;
                }
                ((TaskCompletionSource) ((P2) this.f3065b).f17508b).setException(new e(str, str2, hashMap));
                return;
            default:
                ((g) this.f3065b).d(new Bundle());
                throw null;
        }
    }

    @Override // A5.r
    public final void notImplemented() {
        switch (this.f3064a) {
            case 0:
                return;
            default:
                ((g) this.f3065b).d(new Bundle());
                throw null;
        }
    }

    @Override // A5.r
    public final void success(Object obj) {
        switch (this.f3064a) {
            case 0:
                ((TaskCompletionSource) ((P2) this.f3065b).f17508b).setResult(obj);
                break;
            default:
                List list = (List) ((Map) obj).get("mediaItems");
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(l.a((Map) it.next()));
                }
                ((g) this.f3065b).e(arrayList);
                break;
        }
    }

    private final void a() {
    }
}
