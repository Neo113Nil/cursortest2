package H2;

import android.media.SoundPool;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final SoundPool f539a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f540b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f541c;

    public m(SoundPool soundPool) {
        this.f539a = soundPool;
        Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        kotlin.jvm.internal.j.d(synchronizedMap, "synchronizedMap(...)");
        this.f540b = synchronizedMap;
        Map synchronizedMap2 = Collections.synchronizedMap(new LinkedHashMap());
        kotlin.jvm.internal.j.d(synchronizedMap2, "synchronizedMap(...)");
        this.f541c = synchronizedMap2;
    }
}
