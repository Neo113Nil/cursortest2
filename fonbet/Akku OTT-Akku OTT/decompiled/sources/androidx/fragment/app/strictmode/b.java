package androidx.fragment.app.strictmode;

import com.odehbros.flutter_file_downloader.f;
import com.tekartik.sqflite.d;
import com.tekartik.sqflite.operation.c;
import java.io.File;
import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                FragmentStrictMode.handlePolicyViolation$lambda$1((String) this.b, (Violation) this.c);
                break;
            case 1:
                File file = (File) this.b;
                f fVar = (f) this.c;
                if (file != null) {
                    fVar.d.success(file.getPath());
                    break;
                } else {
                    fVar.d.error("Write file error", "Could not write file at specified path!", null);
                    break;
                }
            default:
                d dVar = (d) this.b;
                com.tekartik.sqflite.operation.a aVar = (c) this.c;
                Object b = aVar.b("inTransaction");
                Boolean bool = b instanceof Boolean ? (Boolean) b : null;
                boolean z = Boolean.TRUE.equals(bool) && aVar.f() && ((Integer) aVar.b("transactionId")) == null;
                if (z) {
                    int i = dVar.k + 1;
                    dVar.k = i;
                    dVar.l = Integer.valueOf(i);
                }
                if (!dVar.f(aVar)) {
                    if (z) {
                        dVar.l = null;
                        break;
                    }
                } else if (!z) {
                    if (Boolean.FALSE.equals(bool)) {
                        dVar.l = null;
                    }
                    aVar.success(null);
                    break;
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("transactionId", dVar.l);
                    aVar.success(hashMap);
                    break;
                }
                break;
        }
    }
}
