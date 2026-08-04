package G5;

import A5.r;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p049g5.l;
import p117q0.g;
import p155w1.P2;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3065b;

    public /* synthetic */ f(Object obj, int i7) {
        this.f3064a = i7;
        this.f3065b = obj;
    }

    @Override // A5.r
    public final void error(String str, String str2, Object obj) {
        switch (this.f3064a) {
            case 0:
                Map map = new HashMap();
                if (str2 == null) {
                    str2 = "An unknown error occurred";
                }
                if (obj instanceof Map) {
                    map = (Map) obj;
                }
                ((TaskCompletionSource) ((P2) this.f3065b).f17514b).setException(new e(str, str2, map));
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
                ((TaskCompletionSource) ((P2) this.f3065b).f17514b).setResult(obj);
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
