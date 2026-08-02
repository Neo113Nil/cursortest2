package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class y {
    @NotNull
    public static final ArrayList<RecyclerView.C> a(@NotNull h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        ArrayList<RecyclerView.C> mMoveAnimations = hVar.mMoveAnimations;
        Intrinsics.checkNotNullExpressionValue(mMoveAnimations, "mMoveAnimations");
        return mMoveAnimations;
    }
}
