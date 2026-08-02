package com.datadog.android.sessionreplay.internal.recorder.obfuscator;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/obfuscator/AndroidNStringObfuscator;", "Lcom/datadog/android/sessionreplay/internal/recorder/obfuscator/StringObfuscator;", "<init>", "()V", "", "stringValue", "obfuscate", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AndroidNStringObfuscator implements com.datadog.android.sessionreplay.internal.recorder.obfuscator.StringObfuscator {
    @Override // com.datadog.android.sessionreplay.internal.recorder.obfuscator.StringObfuscator
    public final java.lang.String obfuscate(java.lang.String stringValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringValue, "");
        final java.lang.StringBuilder sb = new java.lang.StringBuilder(stringValue.length());
        stringValue.codePoints().forEach(new java.util.function.IntConsumer() { // from class: com.datadog.android.sessionreplay.internal.recorder.obfuscator.AndroidNStringObfuscator$$ExternalSyntheticLambda0
            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                com.datadog.android.sessionreplay.internal.recorder.obfuscator.AndroidNStringObfuscator.$r8$lambda$Uk8EQ2R4VwBkSvgPsbtrz7evl7g(sb, i);
            }
        });
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public static /* synthetic */ void $r8$lambda$Uk8EQ2R4VwBkSvgPsbtrz7evl7g(java.lang.StringBuilder sb, int i) {
        if (java.lang.Character.isWhitespace(i)) {
            try {
                sb.append(java.lang.Character.toChars(i));
                return;
            } catch (java.lang.IllegalArgumentException unused) {
                sb.append('x');
                return;
            }
        }
        sb.append('x');
    }
}
