package Q1;

import android.view.inputmethod.ExtractedText;
import org.jetbrains.annotations.NotNull;

/* renamed from: Q1.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3851u {
    @NotNull
    public static final ExtractedText a(@NotNull K k11) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = k11.f();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = k11.f().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = K1.Q.h(k11.e());
        extractedText.selectionEnd = K1.Q.g(k11.e());
        extractedText.flags = !kotlin.text.h.u(k11.f(), '\n') ? 1 : 0;
        return extractedText;
    }
}
