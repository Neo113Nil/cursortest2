package androidx.room;

import com.facebook.C0688a;
import com.facebook.appevents.codeless.g;
import com.facebook.internal.E;
import com.facebook.w;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes3.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                TransactionExecutor.execute$lambda$1$lambda$0((Runnable) obj2, (TransactionExecutor) obj);
                break;
            default:
                String key = (String) obj2;
                com.facebook.appevents.codeless.g this$0 = (com.facebook.appevents.codeless.g) obj;
                if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.codeless.g.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(key, "$tree");
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        E e = E.a;
                        Intrinsics.checkNotNullParameter(key, "key");
                        E.a.getClass();
                        byte[] bytes = key.getBytes(Charsets.UTF_8);
                        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                        String t = E.t("MD5", bytes);
                        C0688a.Companion.getClass();
                        C0688a b = C0688a.b.b();
                        if (t != null && Intrinsics.areEqual(t, this$0.d)) {
                            break;
                        } else {
                            g.a aVar = com.facebook.appevents.codeless.g.Companion;
                            String b2 = w.b();
                            aVar.getClass();
                            this$0.b(g.a.a(key, b, b2), t);
                            break;
                        }
                    } catch (Throwable th) {
                        com.facebook.internal.instrument.crashshield.a.a(th, com.facebook.appevents.codeless.g.class);
                    }
                }
                break;
        }
    }
}
