package y2;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;

/* renamed from: y2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2663a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21188a;

    public /* synthetic */ C2663a(int i) {
        this.f21188a = i;
    }

    @Override // y2.f
    public final g a(Object obj, E2.m mVar) {
        switch (this.f21188a) {
            case 0:
                Uri uri = (Uri) obj;
                if (H2.e.c(uri)) {
                    return new C2664b(uri, mVar, 0);
                }
                return null;
            case 1:
                return new c((Bitmap) obj, mVar, 0);
            case 2:
                return new c((ByteBuffer) obj, mVar, 1);
            case 3:
                Uri uri2 = (Uri) obj;
                if (kotlin.jvm.internal.l.a(uri2.getScheme(), "content")) {
                    return new C2664b(uri2, mVar, 1);
                }
                return null;
            case 4:
                return new c((Drawable) obj, mVar, 2);
            case 5:
                return new h((File) obj);
            default:
                Uri uri3 = (Uri) obj;
                if (kotlin.jvm.internal.l.a(uri3.getScheme(), "android.resource")) {
                    return new C2664b(uri3, mVar, 2);
                }
                return null;
        }
    }
}
