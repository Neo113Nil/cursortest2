package X5;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import p6.k;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final int f34096a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34097b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34098c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final Context f34099a;

        /* renamed from: b, reason: collision with root package name */
        ActivityManager f34100b;

        /* renamed from: c, reason: collision with root package name */
        b f34101c;

        /* renamed from: d, reason: collision with root package name */
        float f34102d = 2.0f;

        /* renamed from: e, reason: collision with root package name */
        float f34103e;

        public a(Context context) {
            this.f34103e = 1;
            this.f34099a = context;
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            this.f34100b = activityManager;
            this.f34101c = new b(context.getResources().getDisplayMetrics());
            if (activityManager.isLowRamDevice()) {
                this.f34103e = 0.0f;
            }
        }

        public final i a() {
            return new i(this);
        }

        public final void b(float f7) {
            k.a("Bitmap pool screens must be greater than or equal to 0", f7 >= 0.0f);
            this.f34103e = f7;
        }

        public final void c(float f7) {
            k.a("Memory cache screens must be greater than or equal to 0", f7 >= 0.0f);
            this.f34102d = f7;
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final DisplayMetrics f34104a;

        b(DisplayMetrics displayMetrics) {
            this.f34104a = displayMetrics;
        }

        public final int a() {
            return this.f34104a.heightPixels;
        }

        public final int b() {
            return this.f34104a.widthPixels;
        }
    }

    i(a aVar) {
        Context context = aVar.f34099a;
        ActivityManager activityManager = aVar.f34100b;
        int i11 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        this.f34098c = i11;
        int round = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        b bVar = aVar.f34101c;
        float b11 = bVar.b() * bVar.a() * 4;
        int round2 = Math.round(aVar.f34103e * b11);
        int round3 = Math.round(b11 * aVar.f34102d);
        int i12 = round - i11;
        int i13 = round3 + round2;
        if (i13 <= i12) {
            this.f34097b = round3;
            this.f34096a = round2;
        } else {
            float f7 = i12;
            float f11 = aVar.f34103e;
            float f12 = aVar.f34102d;
            float f13 = f7 / (f11 + f12);
            this.f34097b = Math.round(f12 * f13);
            this.f34096a = Math.round(f13 * aVar.f34103e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb2 = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb2.append(Formatter.formatFileSize(context, this.f34097b));
            sb2.append(", pool size: ");
            sb2.append(Formatter.formatFileSize(context, this.f34096a));
            sb2.append(", byte array size: ");
            sb2.append(Formatter.formatFileSize(context, i11));
            sb2.append(", memory class limited? ");
            sb2.append(i13 > round);
            sb2.append(", max size: ");
            sb2.append(Formatter.formatFileSize(context, round));
            sb2.append(", memoryClass: ");
            sb2.append(activityManager.getMemoryClass());
            sb2.append(", isLowMemoryDevice: ");
            sb2.append(activityManager.isLowRamDevice());
            Log.d("MemorySizeCalculator", sb2.toString());
        }
    }

    public final int a() {
        return this.f34098c;
    }

    public final int b() {
        return this.f34096a;
    }

    public final int c() {
        return this.f34097b;
    }
}
