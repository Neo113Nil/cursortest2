package S2;

import T2.L;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.google.android.gms.internal.ads.C0568Cd;
import com.google.android.gms.internal.ads.C1071hd;
import com.google.android.gms.internal.ads.C1543s1;
import e2.C1930k;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class i extends J2.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5327b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5328c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i, Object obj) {
        super(1);
        this.f5327b = i;
        this.f5328c = obj;
    }

    private final void m() {
        boolean z3;
        try {
            z3 = N2.b.b((Context) this.f5328c);
        } catch (j3.g | IOException | IllegalStateException e3) {
            U2.j.g("Fail to get isAdIdFakeForDebugLogging", e3);
            z3 = false;
        }
        synchronized (U2.g.f5868b) {
            U2.g.f5869c = true;
            U2.g.f5870d = z3;
        }
        U2.j.i("Update ad debug logging enablement as " + z3);
    }

    @Override // J2.a
    public final void k() {
        BitmapDrawable bitmapDrawable;
        switch (this.f5327b) {
            case 0:
                C1930k c1930k = P2.o.f4767B.f4788v;
                d dVar = (d) this.f5328c;
                Bitmap bitmap = (Bitmap) ((ConcurrentHashMap) c1930k.f16910l).get(Integer.valueOf(dVar.f5299m.f7460y.f4747p));
                if (bitmap != null) {
                    P2.h hVar = dVar.f5299m.f7460y;
                    boolean z3 = hVar.f4745n;
                    Activity activity = dVar.f5298l;
                    if (z3) {
                        float f = hVar.f4746o;
                        if (f > 0.0f && f <= 25.0f) {
                            try {
                                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
                                Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
                                RenderScript create = RenderScript.create(activity);
                                ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                                Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
                                Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
                                create2.setRadius(f);
                                create2.setInput(createFromBitmap);
                                create2.forEach(createFromBitmap2);
                                createFromBitmap2.copyTo(createBitmap);
                                bitmapDrawable = new BitmapDrawable(activity.getResources(), createBitmap);
                            } catch (RuntimeException unused) {
                                bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                            }
                            L.f5672l.post(new D3.h(11, this, bitmapDrawable, false));
                            return;
                        }
                    }
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                    L.f5672l.post(new D3.h(11, this, bitmapDrawable, false));
                    return;
                }
                return;
            case 1:
                m();
                return;
            default:
                C0568Cd c0568Cd = (C0568Cd) this.f5328c;
                C1071hd c1071hd = new C1071hd(c0568Cd.f8013e, c0568Cd.f.f5852k);
                synchronized (((C0568Cd) this.f5328c).f8009a) {
                    try {
                        C1543s1 c1543s1 = P2.o.f4767B.f4778l;
                        C1543s1.s(((C0568Cd) this.f5328c).f8015h, c1071hd);
                    } catch (IllegalArgumentException e3) {
                        U2.j.j("Cannot config CSI reporter.", e3);
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        super(1);
        this.f5327b = 1;
        this.f5328c = context;
    }
}
