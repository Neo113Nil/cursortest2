package io.appmetrica.analytics.location.impl;

import android.location.Location;
import com.onesignal.inAppMessages.internal.prompt.InAppMessagePromptTypes;
import io.appmetrica.analytics.coreutils.internal.cache.SynchronizedDataCache;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class m extends SynchronizedDataCache {

    /* renamed from: d, reason: collision with root package name */
    public static final long f9718d = 200;

    /* renamed from: e, reason: collision with root package name */
    public static final long f9719e = 50;

    /* renamed from: a, reason: collision with root package name */
    public final l f9721a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f9716b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c, reason: collision with root package name */
    public static final long f9717c = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: f, reason: collision with root package name */
    public static final List<String> f9720f = Arrays.asList("gps", "network");

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m() {
        this(r1, r2, 2 * r2);
        l lVar = new l(f9717c);
        long j2 = f9716b;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.cache.DataCache
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean shouldUpdate(Location location) {
        return f9720f.contains(location.getProvider()) && (this.mCachedData.isEmpty() || this.mCachedData.shouldUpdateData() || a(location, (Location) this.mCachedData.getData(), this.f9721a.f9715a, 200L));
    }

    public m(l lVar, long j2, long j6) {
        super(j2, j6, InAppMessagePromptTypes.LOCATION_PROMPT_KEY);
        this.f9721a = lVar;
    }

    public static boolean a(Location location, Location location2, long j2, long j6) {
        boolean equals;
        if (location2 == null) {
            return true;
        }
        if (location == null) {
            return false;
        }
        long time = location.getTime() - location2.getTime();
        boolean z = time > j2;
        boolean z5 = time < (-j2);
        boolean z6 = time > 0;
        if (z) {
            return true;
        }
        if (z5) {
            return false;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z7 = accuracy > 0;
        boolean z8 = accuracy < 0;
        boolean z9 = ((long) accuracy) > j6;
        String provider = location.getProvider();
        String provider2 = location2.getProvider();
        if (provider == null) {
            equals = provider2 == null;
        } else {
            equals = provider.equals(provider2);
        }
        if (z8) {
            return true;
        }
        if (!z6 || z7) {
            return z6 && !z9 && equals;
        }
        return true;
    }
}
