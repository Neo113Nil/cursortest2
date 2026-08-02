package Z8;

import android.graphics.Point;
import android.graphics.Rect;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyb;

/* loaded from: classes9.dex */
public final class m implements Y8.a {

    /* renamed from: a, reason: collision with root package name */
    private final zzyb f35716a;

    public m(zzyb zzybVar) {
        this.f35716a = zzybVar;
    }

    @Override // Y8.a
    public final int a() {
        return this.f35716a.zzb();
    }

    @Override // Y8.a
    public final byte[] b() {
        return this.f35716a.zzn();
    }

    @Override // Y8.a
    public final Rect c() {
        Point[] zzo = this.f35716a.zzo();
        if (zzo == null) {
            return null;
        }
        int i11 = LinearLayoutManager.INVALID_OFFSET;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MIN_VALUE;
        for (Point point : zzo) {
            i12 = Math.min(i12, point.x);
            i11 = Math.max(i11, point.x);
            i13 = Math.min(i13, point.y);
            i14 = Math.max(i14, point.y);
        }
        return new Rect(i12, i13, i11, i14);
    }

    @Override // Y8.a
    public final String d() {
        return this.f35716a.zzm();
    }

    @Override // Y8.a
    public final Point[] e() {
        return this.f35716a.zzo();
    }

    @Override // Y8.a
    public final int g() {
        return this.f35716a.zza();
    }
}
