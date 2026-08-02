package Z8;

import a9.C4962a;
import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.util.Log;
import b9.C5587b;
import b9.C5588c;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_common.zzaf;
import com.google.android.gms.internal.mlkit_vision_barcode.zzah;
import com.google.android.gms.internal.mlkit_vision_barcode.zzaj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzal;
import com.google.android.gms.internal.mlkit_vision_barcode.zzan;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import java.util.ArrayList;

/* loaded from: classes9.dex */
final class p implements l {

    /* renamed from: a, reason: collision with root package name */
    private boolean f35726a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f35727b;

    /* renamed from: c, reason: collision with root package name */
    private final zzah f35728c;

    /* renamed from: d, reason: collision with root package name */
    private final zzwp f35729d;

    /* renamed from: e, reason: collision with root package name */
    private zzaj f35730e;

    p(Context context, W8.b bVar, zzwp zzwpVar) {
        zzah zzahVar = new zzah();
        this.f35728c = zzahVar;
        this.f35727b = context;
        zzahVar.zza = bVar.a();
        this.f35729d = zzwpVar;
    }

    @Override // Z8.l
    public final ArrayList a(C4962a c4962a) throws R8.a {
        zzu[] zzf;
        if (this.f35730e == null) {
            zzc();
        }
        zzaj zzajVar = this.f35730e;
        if (zzajVar == null) {
            throw new R8.a("Error initializing the legacy barcode scanner.", 14);
        }
        zzaj zzajVar2 = (zzaj) Preconditions.checkNotNull(zzajVar);
        zzan zzanVar = new zzan(c4962a.e(), c4962a.d(), 0, 0L, C5587b.a(0));
        try {
            int c11 = c4962a.c();
            if (c11 == -1) {
                zzf = zzajVar2.zzf(ObjectWrapper.wrap(c4962a.b()), zzanVar);
            } else if (c11 == 17) {
                zzf = zzajVar2.zze(ObjectWrapper.wrap(null), zzanVar);
            } else if (c11 == 35) {
                Image.Plane[] planeArr = (Image.Plane[]) Preconditions.checkNotNull(null);
                zzanVar.zza = planeArr[0].getRowStride();
                zzf = zzajVar2.zze(ObjectWrapper.wrap(planeArr[0].getBuffer()), zzanVar);
            } else {
                if (c11 != 842094169) {
                    throw new R8.a("Unsupported image format: " + c4962a.c(), 3);
                }
                zzf = zzajVar2.zze(ObjectWrapper.wrap(C5588c.a(c4962a)), zzanVar);
            }
            ArrayList arrayList = new ArrayList();
            for (zzu zzuVar : zzf) {
                arrayList.add(new X8.a(new o(zzuVar)));
            }
            return arrayList;
        } catch (RemoteException e11) {
            throw new R8.a("Failed to detect with legacy barcode detector", e11);
        }
    }

    @Override // Z8.l
    public final void zzb() {
        zzaj zzajVar = this.f35730e;
        if (zzajVar != null) {
            try {
                zzajVar.zzd();
            } catch (RemoteException e11) {
                Log.e("LegacyBarcodeScanner", "Failed to release legacy barcode detector.", e11);
            }
            this.f35730e = null;
        }
    }

    @Override // Z8.l
    public final boolean zzc() throws R8.a {
        Context context = this.f35727b;
        if (this.f35730e != null) {
            return false;
        }
        try {
            zzaj zzd = zzal.zza(DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.vision.dynamite").instantiate("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).zzd(ObjectWrapper.wrap(context), this.f35728c);
            this.f35730e = zzd;
            zzwp zzwpVar = this.f35729d;
            if (zzd == null && !this.f35726a) {
                Log.d("LegacyBarcodeScanner", "Request optional module download.");
                Feature[] featureArr = com.google.mlkit.common.sdkinternal.l.f60042a;
                com.google.mlkit.common.sdkinternal.l.b(context, zzaf.zzh("barcode"));
                this.f35726a = true;
                b.e(zzwpVar, zzrb.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new R8.a("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            b.e(zzwpVar, zzrb.NO_ERROR);
            return false;
        } catch (RemoteException e11) {
            throw new R8.a("Failed to create legacy barcode detector.", e11);
        } catch (DynamiteModule.LoadingException e12) {
            throw new R8.a("Failed to load deprecated vision dynamite module.", e12);
        }
    }
}
