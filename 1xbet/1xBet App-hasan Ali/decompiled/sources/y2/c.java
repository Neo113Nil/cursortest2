package y2;

import L4.C0226i;
import a.AbstractC0444a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import b2.p;
import java.nio.ByteBuffer;
import v2.o;

/* loaded from: classes.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21192a;

    /* renamed from: b, reason: collision with root package name */
    public final E2.m f21193b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f21194c;

    public /* synthetic */ c(Object obj, E2.m mVar, int i) {
        this.f21192a = i;
        this.f21194c = obj;
        this.f21193b = mVar;
    }

    @Override // y2.g
    public final Object a(a4.c cVar) {
        v2.e eVar = v2.e.f20403l;
        E2.m mVar = this.f21193b;
        Object obj = this.f21194c;
        switch (this.f21192a) {
            case 0:
                return new d(new BitmapDrawable(mVar.f1462a.getResources(), (Bitmap) obj), false, eVar);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                try {
                    C0226i c0226i = new C0226i();
                    c0226i.write(byteBuffer);
                    byteBuffer.position(0);
                    Context context = mVar.f1462a;
                    return new m(new o(c0226i, null), null, eVar);
                } catch (Throwable th) {
                    byteBuffer.position(0);
                    throw th;
                }
            default:
                Drawable drawable = (Drawable) obj;
                Bitmap.Config config = H2.e.f2284a;
                boolean z3 = (drawable instanceof VectorDrawable) || (drawable instanceof p);
                if (z3) {
                    drawable = new BitmapDrawable(mVar.f1462a.getResources(), AbstractC0444a.x(drawable, mVar.f1463b, mVar.f1465d, mVar.f1466e, mVar.f));
                }
                return new d(drawable, z3, eVar);
        }
    }
}
