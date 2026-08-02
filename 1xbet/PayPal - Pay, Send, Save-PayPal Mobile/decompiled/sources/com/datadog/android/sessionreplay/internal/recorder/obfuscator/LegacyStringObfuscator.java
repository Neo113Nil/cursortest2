package com.datadog.android.sessionreplay.internal.recorder.obfuscator;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/obfuscator/LegacyStringObfuscator;", "Lcom/datadog/android/sessionreplay/internal/recorder/obfuscator/StringObfuscator;", "<init>", "()V", "", "stringValue", "obfuscate", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LegacyStringObfuscator implements com.datadog.android.sessionreplay.internal.recorder.obfuscator.StringObfuscator {
    @Override // com.datadog.android.sessionreplay.internal.recorder.obfuscator.StringObfuscator
    public final java.lang.String obfuscate(java.lang.String stringValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringValue, "");
        int length = stringValue.length();
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            char charAt = stringValue.charAt(i);
            if (!java.lang.Character.isWhitespace((int) charAt)) {
                charAt = 'x';
            }
            cArr[i] = charAt;
        }
        return new java.lang.String(cArr);
    }
}
