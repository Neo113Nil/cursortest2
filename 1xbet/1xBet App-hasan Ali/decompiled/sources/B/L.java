package B;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.util.Base64;
import g2.C1982f;
import java.io.ByteArrayOutputStream;
import org.json.JSONObject;
import r3.C2350b;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public int f640a;

    /* renamed from: b, reason: collision with root package name */
    public int f641b;

    /* renamed from: c, reason: collision with root package name */
    public Object f642c;

    /* renamed from: d, reason: collision with root package name */
    public Object f643d;

    /* renamed from: e, reason: collision with root package name */
    public Object f644e;

    public int a(long j5) {
        int i = this.f640a + 1;
        long[] jArr = (long[]) this.f642c;
        int length = jArr.length;
        if (i > length) {
            int i5 = length * 2;
            long[] jArr2 = new long[i5];
            int[] iArr = new int[i5];
            X3.l.v0(jArr, jArr2, 0, 0, jArr.length);
            X3.l.x0(0, 0, 14, (int[]) this.f643d, iArr);
            this.f642c = jArr2;
            this.f643d = iArr;
        }
        int i6 = this.f640a;
        this.f640a = i6 + 1;
        int length2 = ((int[]) this.f644e).length;
        if (this.f641b >= length2) {
            int i7 = length2 * 2;
            int[] iArr2 = new int[i7];
            int i8 = 0;
            while (i8 < i7) {
                int i9 = i8 + 1;
                iArr2[i8] = i9;
                i8 = i9;
            }
            X3.l.x0(0, 0, 14, (int[]) this.f644e, iArr2);
            this.f644e = iArr2;
        }
        int i10 = this.f641b;
        int[] iArr3 = (int[]) this.f644e;
        this.f641b = iArr3[i10];
        long[] jArr3 = (long[]) this.f642c;
        jArr3[i6] = j5;
        ((int[]) this.f643d)[i6] = i10;
        iArr3[i10] = i6;
        while (i6 > 0) {
            int i11 = ((i6 + 1) >> 1) - 1;
            if (kotlin.jvm.internal.l.h(jArr3[i11], j5) <= 0) {
                break;
            }
            b(i11, i6);
            i6 = i11;
        }
        return i10;
    }

    public void b(int i, int i5) {
        long[] jArr = (long[]) this.f642c;
        int[] iArr = (int[]) this.f643d;
        int[] iArr2 = (int[]) this.f644e;
        long j5 = jArr[i];
        jArr[i] = jArr[i5];
        jArr[i5] = j5;
        int i6 = iArr[i];
        int i7 = iArr[i5];
        iArr[i] = i7;
        iArr[i5] = i6;
        iArr2[i7] = i;
        iArr2[i6] = i5;
    }

    public JSONObject c() {
        String str;
        String encodeToString;
        ApplicationInfo applicationInfo = (ApplicationInfo) this.f643d;
        Context context = (Context) this.f642c;
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = applicationInfo.packageName;
            T2.H h3 = T2.L.f5672l;
            Context context2 = C2350b.a(context).f17113k;
            jSONObject.put("name", context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(str2, 0)));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", applicationInfo.packageName);
        T2.L l5 = P2.o.f4767B.f4771c;
        Drawable drawable = null;
        try {
            str = T2.L.F(context);
        } catch (RemoteException unused2) {
            str = null;
        }
        jSONObject.put("adMobAppId", str);
        boolean isEmpty = ((String) this.f644e).isEmpty();
        int i = this.f641b;
        int i5 = this.f640a;
        if (isEmpty) {
            try {
                C1982f a5 = C2350b.a(context);
                String str3 = applicationInfo.packageName;
                Context context3 = a5.f17113k;
                ApplicationInfo applicationInfo2 = context3.getPackageManager().getApplicationInfo(str3, 0);
                context3.getPackageManager().getApplicationLabel(applicationInfo2);
                drawable = context3.getPackageManager().getApplicationIcon(applicationInfo2);
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            if (drawable == null) {
                encodeToString = "";
            } else {
                drawable.setBounds(0, 0, i5, i);
                Bitmap createBitmap = Bitmap.createBitmap(i5, i, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(createBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.f644e = encodeToString;
        }
        if (!((String) this.f644e).isEmpty()) {
            jSONObject.put("icon", (String) this.f644e);
            jSONObject.put("iconWidthPx", i5);
            jSONObject.put("iconHeightPx", i);
        }
        return jSONObject;
    }
}
