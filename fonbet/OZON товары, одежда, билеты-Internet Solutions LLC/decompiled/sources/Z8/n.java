package Z8;

import a9.C4962a;
import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import b9.C5587b;
import b9.C5589d;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
final class n implements l {

    /* renamed from: h, reason: collision with root package name */
    private static final zzcs f35717h = zzcs.zzh("com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite");

    /* renamed from: a, reason: collision with root package name */
    private boolean f35718a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f35719b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f35720c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f35721d;

    /* renamed from: e, reason: collision with root package name */
    private final W8.b f35722e;

    /* renamed from: f, reason: collision with root package name */
    private final zzwp f35723f;

    /* renamed from: g, reason: collision with root package name */
    private zzyl f35724g;

    n(Context context, W8.b bVar, zzwp zzwpVar) {
        this.f35721d = context;
        this.f35722e = bVar;
        this.f35723f = zzwpVar;
    }

    static boolean b(Context context) {
        return DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) > 0;
    }

    @Override // Z8.l
    public final ArrayList a(C4962a c4962a) throws R8.a {
        if (this.f35724g == null) {
            zzc();
        }
        zzyl zzylVar = (zzyl) Preconditions.checkNotNull(this.f35724g);
        if (!this.f35718a) {
            try {
                zzylVar.zze();
                this.f35718a = true;
            } catch (RemoteException e11) {
                throw new R8.a("Failed to init barcode scanner.", e11);
            }
        }
        int e12 = c4962a.e();
        if (c4962a.c() == 35) {
            e12 = ((Image.Plane[]) Preconditions.checkNotNull(null))[0].getRowStride();
        }
        zzyu zzyuVar = new zzyu(c4962a.c(), e12, c4962a.d(), C5587b.a(0), SystemClock.elapsedRealtime());
        C5589d.b().getClass();
        try {
            List zzd = zzylVar.zzd(C5589d.a(c4962a), zzyuVar);
            ArrayList arrayList = new ArrayList();
            Iterator it = zzd.iterator();
            while (it.hasNext()) {
                arrayList.add(new X8.a(new m((zzyb) it.next())));
            }
            return arrayList;
        } catch (RemoteException e13) {
            throw new R8.a("Failed to run barcode scanner.", e13);
        }
    }

    final zzyl c(DynamiteModule.VersionPolicy versionPolicy, String str, String str2) throws DynamiteModule.LoadingException, RemoteException {
        Context context = this.f35721d;
        zzyo zza = zzyn.zza(DynamiteModule.load(context, versionPolicy, str).instantiate(str2));
        IObjectWrapper wrap = ObjectWrapper.wrap(context);
        W8.b bVar = this.f35722e;
        return zza.zzd(wrap, new zzyd(bVar.a(), bVar.c()));
    }

    @Override // Z8.l
    public final void zzb() {
        zzyl zzylVar = this.f35724g;
        if (zzylVar != null) {
            try {
                zzylVar.zzf();
            } catch (RemoteException e11) {
                Log.e("DecoupledBarcodeScanner", "Failed to release barcode scanner.", e11);
            }
            this.f35724g = null;
            this.f35718a = false;
        }
    }

    @Override // Z8.l
    public final boolean zzc() throws R8.a {
        if (this.f35724g != null) {
            return this.f35719b;
        }
        Context context = this.f35721d;
        boolean b11 = b(context);
        zzwp zzwpVar = this.f35723f;
        if (b11) {
            this.f35719b = true;
            try {
                this.f35724g = c(DynamiteModule.PREFER_LOCAL, ModuleDescriptor.MODULE_ID, "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (RemoteException e11) {
                throw new R8.a("Failed to create thick barcode scanner.", e11);
            } catch (DynamiteModule.LoadingException e12) {
                throw new R8.a("Failed to load the bundled barcode module.", e12);
            }
        } else {
            this.f35719b = false;
            if (!com.google.mlkit.common.sdkinternal.l.a(context, f35717h)) {
                if (!this.f35720c) {
                    com.google.mlkit.common.sdkinternal.l.b(context, zzcs.zzh("barcode", "tflite_dynamite"));
                    this.f35720c = true;
                }
                b.e(zzwpVar, zzrb.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new R8.a("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.f35724g = c(DynamiteModule.PREFER_REMOTE, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (RemoteException | DynamiteModule.LoadingException e13) {
                b.e(zzwpVar, zzrb.OPTIONAL_MODULE_INIT_ERROR);
                throw new R8.a("Failed to create thin barcode scanner.", e13);
            }
        }
        b.e(zzwpVar, zzrb.NO_ERROR);
        return this.f35719b;
    }
}
