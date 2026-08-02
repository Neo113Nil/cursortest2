package androidx.media3.common.audio;

import android.util.Pair;
import androidx.annotation.IntRange;
import androidx.fragment.app.u;
import androidx.media3.common.audio.DefaultGainProvider;
import androidx.media3.common.audio.GainProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.collect.AbstractC0975x;
import com.google.common.collect.V;
import com.google.common.collect.e0;
import com.google.common.collect.x0;
import java.util.Iterator;
import java.util.Map;

@UnstableApi
/* loaded from: classes3.dex */
public final class DefaultGainProvider implements GainProcessor.GainProvider {
    private static final float GAIN_UNSET = -3.4028235E38f;
    private final float defaultGain;
    private final x0<Long, com.google.common.base.f<Pair<Long, Integer>, Float>> gainMap;
    public static final FadeProvider FADE_IN_LINEAR = new k();
    public static final FadeProvider FADE_OUT_LINEAR = new l();
    public static final FadeProvider FADE_IN_EQUAL_POWER = new m();
    public static final FadeProvider FADE_OUT_EQUAL_POWER = new u();

    public static final class Builder {
        private final float defaultGain;
        private final x0<Long, com.google.common.base.f<Pair<Long, Integer>, Float>> gainMap;

        /* JADX WARN: Multi-variable type inference failed */
        public Builder(float f) {
            x0<Long, com.google.common.base.f<Pair<Long, Integer>, Float>> x0Var = new x0<>();
            this.gainMap = x0Var;
            this.defaultGain = f;
            x0Var.c(e0.c, new n(0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Float lambda$addFadeAt$1(long j, FadeProvider fadeProvider, long j2, Pair pair) {
            int intValue = ((Integer) pair.second).intValue();
            return Float.valueOf(fadeProvider.getGainFactorAt(((Long) pair.first).longValue() - Util.durationUsToSampleCount(j, intValue), Util.durationUsToSampleCount(j2, intValue)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Float lambda$new$0(Pair pair) {
            return Float.valueOf(-3.4028235E38f);
        }

        public Builder addFadeAt(@IntRange(from = 0) final long j, @IntRange(from = 1) final long j2, final FadeProvider fadeProvider) {
            Assertions.checkArgument(j >= 0);
            Assertions.checkArgument(j2 > 1);
            this.gainMap.c(new e0<>(new AbstractC0975x.c(Long.valueOf(j)), new AbstractC0975x.c(Long.valueOf(j + j2))), new com.google.common.base.f() { // from class: androidx.media3.common.audio.o
                @Override // com.google.common.base.f
                public final Object apply(Object obj) {
                    Float lambda$addFadeAt$1;
                    lambda$addFadeAt$1 = DefaultGainProvider.Builder.lambda$addFadeAt$1(j, fadeProvider, j2, (Pair) obj);
                    return lambda$addFadeAt$1;
                }
            });
            return this;
        }

        public DefaultGainProvider build() {
            return new DefaultGainProvider(this.gainMap, this.defaultGain);
        }
    }

    public interface FadeProvider {
        float getGainFactorAt(@IntRange(from = 0) long j, @IntRange(from = 1) long j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$static$0(long j, long j2) {
        return j / j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$static$1(long j, long j2) {
        return (j2 - j) / j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$static$2(long j, long j2) {
        return (float) Math.sin((j * 1.5707963267948966d) / j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$static$3(long j, long j2) {
        return (float) Math.cos((j * 1.5707963267948966d) / j2);
    }

    @Override // androidx.media3.common.audio.GainProcessor.GainProvider
    public float getGainFactorAtSamplePosition(@IntRange(from = 0) long j, @IntRange(from = 1) int i) {
        Assertions.checkState(i > 0);
        Assertions.checkArgument(j >= 0);
        Map.Entry b = this.gainMap.b(Long.valueOf(Util.sampleCountToDurationUs(j, i)));
        float floatValue = ((Float) ((com.google.common.base.f) Assertions.checkNotNull((com.google.common.base.f) (b == null ? null : b.getValue()))).apply(Pair.create(Long.valueOf(j), Integer.valueOf(i)))).floatValue();
        return floatValue == -3.4028235E38f ? this.defaultGain : floatValue;
    }

    @Override // androidx.media3.common.audio.GainProcessor.GainProvider
    public long isUnityUntil(@IntRange(from = 0) long j, @IntRange(from = 1) int i) {
        Assertions.checkState(i > 0);
        Assertions.checkArgument(j >= 0);
        Map.Entry entry = (Map.Entry) Assertions.checkNotNull(this.gainMap.b(Long.valueOf(Util.sampleCountToDurationUs(j, i))));
        float floatValue = ((Float) ((com.google.common.base.f) entry.getValue()).apply(Pair.create(Long.valueOf(j), Integer.valueOf(i)))).floatValue();
        if (floatValue == 1.0f) {
            return j + 1;
        }
        if (this.defaultGain != 1.0f || floatValue != -3.4028235E38f) {
            return -9223372036854775807L;
        }
        if (((e0) entry.getKey()).b != AbstractC0975x.a.b) {
            return Util.durationUsToSampleCount(((Long) ((e0) entry.getKey()).b.d()).longValue(), i);
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DefaultGainProvider(x0<Long, com.google.common.base.f<Pair<Long, Integer>, Float>> x0Var, float f) {
        x0<Long, com.google.common.base.f<Pair<Long, Integer>, Float>> x0Var2 = new x0<>();
        this.gainMap = x0Var2;
        Iterator it = new V.b.a().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            x0Var2.c((e0) entry.getKey(), entry.getValue());
        }
        this.defaultGain = f;
    }
}
