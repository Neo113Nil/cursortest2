package D1;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface E0 extends InterfaceC2807j {
    void applySemantics(@NotNull I1.D d11);

    default boolean getShouldClearDescendantSemantics() {
        return false;
    }

    default boolean getShouldMergeDescendantSemantics() {
        return false;
    }
}
