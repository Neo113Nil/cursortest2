package androidx.camera.core.impl;

import android.util.ArrayMap;
import android.util.Pair;
import androidx.annotation.NonNull;
import java.util.Set;

/* loaded from: classes8.dex */
public class X0 {

    /* renamed from: b, reason: collision with root package name */
    private static final X0 f38237b = new X0(new ArrayMap());

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f38238c = 0;

    /* renamed from: a, reason: collision with root package name */
    protected final ArrayMap f38239a;

    protected X0(@NonNull ArrayMap arrayMap) {
        this.f38239a = arrayMap;
    }

    @NonNull
    public static X0 a(@NonNull Pair<String, Object> pair) {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put((String) pair.first, pair.second);
        return new X0(arrayMap);
    }

    @NonNull
    public static X0 b() {
        return f38237b;
    }

    public final Object c(@NonNull String str) {
        return this.f38239a.get(str);
    }

    @NonNull
    public final Set<String> d() {
        return this.f38239a.keySet();
    }

    @NonNull
    public final String toString() {
        return "android.hardware.camera2.CaptureRequest.setTag.CX";
    }
}
