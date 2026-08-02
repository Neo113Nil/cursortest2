package z;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: z.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1805c {

    /* renamed from: a, reason: collision with root package name */
    public int f18259a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f18260b = -1;

    /* renamed from: c, reason: collision with root package name */
    public String f18261c = null;

    /* renamed from: d, reason: collision with root package name */
    public HashMap f18262d;

    public static float e(Number number) {
        return number instanceof Float ? ((Float) number).floatValue() : Float.parseFloat(number.toString());
    }

    public abstract AbstractC1805c a();

    public abstract void b(HashSet hashSet);

    public abstract void c(Context context, AttributeSet attributeSet);

    public void d(HashMap hashMap) {
    }
}
