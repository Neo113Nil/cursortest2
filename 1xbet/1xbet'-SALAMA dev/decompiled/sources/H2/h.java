package H2;

import D6.y0;
import I2.AbstractC0308p;
import I2.J;
import I2.P;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.zzl;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC0308p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3243a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3244b;

    public /* synthetic */ h(j jVar) {
        this.f3244b = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b7  */
    @Override // I2.AbstractC0308p
    public final void zza() {
        BitmapDrawable bitmapDrawable;
        boolean isAdIdFakeForDebugLogging = false;
        switch (this.f3243a) {
            case 0:
                p145u1.c cVar = E2.o.f1952C.f1976w;
                j jVar = (j) this.f3244b;
                Bitmap bitmap = (Bitmap) ((ConcurrentHashMap) cVar.f16597b).get(Integer.valueOf(jVar.f3260b.f10805F.f10846f));
                if (bitmap != null) {
                    zzl zzlVar = jVar.f3260b.f10805F;
                    boolean z4 = zzlVar.f10844d;
                    Activity activity = jVar.f3259a;
                    if (z4) {
                        float f7 = zzlVar.f10845e;
                        if (f7 <= 0.0f || f7 > 25.0f) {
                            bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                        } else {
                            try {
                                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
                                RenderScript renderScriptCreate = RenderScript.create(activity);
                                ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                                Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
                                Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
                                scriptIntrinsicBlurCreate.setRadius(f7);
                                scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                                scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
                                allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
                                bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapCreateBitmap);
                            } catch (RuntimeException unused) {
                                bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                            }
                        }
                        break;
                    } else {
                        bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                    }
                    P.f3579l.post(new y0(7, this, bitmapDrawable));
                    return;
                }
                return;
            default:
                try {
                    isAdIdFakeForDebugLogging = AdvertisingIdClient.getIsAdIdFakeForDebugLogging((Context) this.f3244b);
                    break;
                } catch (com.google.android.gms.common.e | com.google.android.gms.common.f | IOException | IllegalStateException e7) {
                    int i7 = J.f3546b;
                    J2.j.e("Fail to get isAdIdFakeForDebugLogging", e7);
                }
                synchronized (J2.g.f3814b) {
                    J2.g.f3815c = true;
                    J2.g.f3816d = isAdIdFakeForDebugLogging;
                    break;
                }
                int i8 = J.f3546b;
                J2.j.g("Update ad debug logging enablement as " + isAdIdFakeForDebugLogging);
                return;
        }
    }

    public h(Context context) {
        this.f3244b = context;
    }
}
