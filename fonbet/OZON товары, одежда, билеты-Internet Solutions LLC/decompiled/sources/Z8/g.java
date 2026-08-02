package Z8;

import a9.C4962a;
import androidx.annotation.NonNull;
import b9.C5590e;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzws;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes9.dex */
public final class g extends C5590e implements W8.a {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f35698h = 0;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f35699g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(@NonNull W8.b bVar, @NonNull k kVar, @NonNull Executor executor, @NonNull zzwp zzwpVar) {
        super(kVar, executor);
        bVar.getClass();
        boolean f7 = b.f();
        this.f35699g = f7;
        zzrp zzrpVar = new zzrp();
        zzrpVar.zzi(b.c(bVar));
        zzrr zzj = zzrpVar.zzj();
        zzrd zzrdVar = new zzrd();
        zzrdVar.zze(f7 ? zzra.TYPE_THICK : zzra.TYPE_THIN);
        zzrdVar.zzg(zzj);
        zzwpVar.zzd(zzws.zzg(zzrdVar, 1), zzrc.ON_DEVICE_BARCODE_CREATE);
    }

    @Override // b9.C5590e, W8.a
    @NonNull
    public final Task<List<X8.a>> N(@NonNull C4962a c4962a) {
        Task c11 = c(c4962a);
        final int e11 = c4962a.e();
        final int d11 = c4962a.d();
        return c11.onSuccessTask(new SuccessContinuation(e11, d11) { // from class: Z8.e
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                g.this.getClass();
                return Tasks.forResult((List) obj);
            }
        });
    }

    @Override // b9.C5590e, java.io.Closeable, java.lang.AutoCloseable, W8.a
    public final synchronized void close() {
        super.close();
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    public final Feature[] getOptionalFeatures() {
        return this.f35699g ? com.google.mlkit.common.sdkinternal.l.f60042a : new Feature[]{com.google.mlkit.common.sdkinternal.l.f60043b};
    }
}
