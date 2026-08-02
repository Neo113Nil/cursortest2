package com.datadog.android.sessionreplay.internal.recorder.obfuscator;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/obfuscator/StringObfuscator;", "", "", "stringValue", "obfuscate", "(Ljava/lang/String;)Ljava/lang/String;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface StringObfuscator {
    public static final char CHARACTER_MASK = 'x';

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.sessionreplay.internal.recorder.obfuscator.StringObfuscator.Companion INSTANCE = com.datadog.android.sessionreplay.internal.recorder.obfuscator.StringObfuscator.Companion.getHighSpeedVideoSizes;

    java.lang.String obfuscate(java.lang.String stringValue);

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/obfuscator/StringObfuscator$Companion;", "", "<init>", "()V", "Lcom/datadog/android/sessionreplay/internal/recorder/obfuscator/StringObfuscator;", "getStringObfuscator", "()Lcom/datadog/android/sessionreplay/internal/recorder/obfuscator/StringObfuscator;", "", "CHARACTER_MASK", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static final char CHARACTER_MASK = 'x';
        static final /* synthetic */ com.datadog.android.sessionreplay.internal.recorder.obfuscator.StringObfuscator.Companion getHighSpeedVideoSizes = new com.datadog.android.sessionreplay.internal.recorder.obfuscator.StringObfuscator.Companion();

        private Companion() {
        }

        public final com.datadog.android.sessionreplay.internal.recorder.obfuscator.StringObfuscator getStringObfuscator() {
            return new com.datadog.android.sessionreplay.internal.recorder.obfuscator.AndroidNStringObfuscator();
        }
    }
}
