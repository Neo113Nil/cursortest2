package sg.bigo.ads.X;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* loaded from: classes3.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12594a;
    public RenderScript b;
    public ScriptIntrinsicBlur c;
    public Allocation d;
    public Allocation e;

    public c(Context context) {
        this.f12594a = context;
    }

    @Override // sg.bigo.ads.X.b
    public final void a(Bitmap bitmap, Bitmap bitmap2) {
        RenderScript renderScript = this.b;
        if (renderScript == null || this.c == null) {
            return;
        }
        if (this.d == null) {
            this.d = Allocation.createFromBitmap(renderScript, bitmap);
        }
        if (this.e == null) {
            this.e = Allocation.createFromBitmap(this.b, bitmap2);
        }
        this.d.copyFrom(bitmap);
        this.c.setInput(this.d);
        this.c.forEach(this.e);
        this.e.copyTo(bitmap2);
    }

    public final boolean a(float f) {
        if (this.b == null || this.c == null) {
            try {
                RenderScript create = RenderScript.create(this.f12594a);
                this.b = create;
                this.c = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            } catch (Exception unused) {
                a();
                return false;
            }
        }
        this.c.setRadius(f);
        return true;
    }

    @Override // sg.bigo.ads.X.b
    public final boolean a(Bitmap bitmap, float f) {
        if (!a(f)) {
            return false;
        }
        Allocation createFromBitmap = Allocation.createFromBitmap(this.b, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
        this.d = createFromBitmap;
        this.e = Allocation.createTyped(this.b, createFromBitmap.getType());
        return true;
    }

    @Override // sg.bigo.ads.X.b
    public final void a() {
        ScriptIntrinsicBlur scriptIntrinsicBlur = this.c;
        if (scriptIntrinsicBlur != null) {
            scriptIntrinsicBlur.destroy();
            this.c = null;
        }
        RenderScript renderScript = this.b;
        if (renderScript != null) {
            renderScript.destroy();
            this.b = null;
        }
        Allocation allocation = this.d;
        if (allocation != null) {
            allocation.destroy();
            this.d = null;
        }
        Allocation allocation2 = this.e;
        if (allocation2 != null) {
            allocation2.destroy();
            this.e = null;
        }
    }
}
