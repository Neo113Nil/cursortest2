package Z8;

import android.graphics.Point;
import android.graphics.Rect;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;

/* loaded from: classes9.dex */
public final class o implements Y8.a {

    /* renamed from: a, reason: collision with root package name */
    private final zzu f35725a;

    public o(zzu zzuVar) {
        this.f35725a = zzuVar;
    }

    @Override // Y8.a
    public final int a() {
        return this.f35725a.zzd;
    }

    @Override // Y8.a
    public final byte[] b() {
        return this.f35725a.zzo;
    }

    @Override // Y8.a
    public final Rect c() {
        zzu zzuVar = this.f35725a;
        if (zzuVar.zze == null) {
            return null;
        }
        int i11 = 0;
        int i12 = LinearLayoutManager.INVALID_OFFSET;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MAX_VALUE;
        int i15 = Integer.MIN_VALUE;
        while (true) {
            Point[] pointArr = zzuVar.zze;
            if (i11 >= pointArr.length) {
                return new Rect(i13, i14, i12, i15);
            }
            Point point = pointArr[i11];
            i13 = Math.min(i13, point.x);
            i12 = Math.max(i12, point.x);
            i14 = Math.min(i14, point.y);
            i15 = Math.max(i15, point.y);
            i11++;
        }
    }

    @Override // Y8.a
    public final String d() {
        return this.f35725a.zzb;
    }

    @Override // Y8.a
    public final Point[] e() {
        return this.f35725a.zze;
    }

    @Override // Y8.a
    public final int g() {
        return this.f35725a.zza;
    }
}
