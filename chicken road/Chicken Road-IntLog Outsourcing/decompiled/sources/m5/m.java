package m5;

import android.media.SoundPool;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final SoundPool f11243a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f11244b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f11245c;

    public m(SoundPool soundPool) {
        this.f11243a = soundPool;
        Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        kotlin.jvm.internal.i.d(synchronizedMap, "synchronizedMap(...)");
        this.f11244b = synchronizedMap;
        Map synchronizedMap2 = Collections.synchronizedMap(new LinkedHashMap());
        kotlin.jvm.internal.i.d(synchronizedMap2, "synchronizedMap(...)");
        this.f11245c = synchronizedMap2;
    }
}
