package androidx.compose.runtime;

import androidx.savedstate.SavedStateReaderKt;
import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
public final /* synthetic */ class u {
    public static String a(int i, String str, String str2) {
        return str + i + str2;
    }

    public static KotlinNothingValueException b(String str) {
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        return new KotlinNothingValueException();
    }
}
