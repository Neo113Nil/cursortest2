package p169z;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: z.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1062c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18265a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18266b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f18267c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap f18268d;

    public static float e(Number number) {
        return number instanceof Float ? ((Float) number).floatValue() : Float.parseFloat(number.toString());
    }

    public abstract AbstractC1062c a();

    public abstract void b(HashSet hashSet);

    public abstract void c(Context context, AttributeSet attributeSet);

    public void d(HashMap map) {
    }
}
