package V00;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.n;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class a {
    public static final Object a(@NotNull n reader, @NotNull JsonAdapter jsonAdapter) {
        Intrinsics.checkNotNullParameter(jsonAdapter, "<this>");
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.p() == n.b.STRING ? jsonAdapter.fromJson(reader.nextString()) : jsonAdapter.fromJson(reader);
    }
}
