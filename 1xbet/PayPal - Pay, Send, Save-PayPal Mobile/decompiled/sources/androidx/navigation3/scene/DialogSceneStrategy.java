package androidx.navigation3.scene;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\rB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n*\b\u0012\u0004\u0012\u00028\u00000\u00062\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/navigation3/scene/DialogSceneStrategy;", "", "T", "Landroidx/navigation3/scene/SceneStrategy;", "<init>", "()V", "Landroidx/navigation3/scene/SceneStrategyScope;", "", "Landroidx/navigation3/runtime/NavEntry;", "entries", "Landroidx/navigation3/scene/Scene;", "calculateScene", "(Landroidx/navigation3/scene/SceneStrategyScope;Ljava/util/List;)Landroidx/navigation3/scene/Scene;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DialogSceneStrategy<T> implements androidx.navigation3.scene.SceneStrategy<T> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.navigation3.scene.DialogSceneStrategy.Companion INSTANCE = new androidx.navigation3.scene.DialogSceneStrategy.Companion(null);

    @Override // androidx.navigation3.scene.SceneStrategy
    public final androidx.navigation3.scene.Scene<T> calculateScene(androidx.navigation3.scene.SceneStrategyScope<T> sceneStrategyScope, java.util.List<androidx.navigation3.runtime.NavEntry<T>> list) {
        java.util.Map<java.lang.String, java.lang.Object> metadata;
        androidx.navigation3.runtime.NavEntry navEntry = (androidx.navigation3.runtime.NavEntry) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) list);
        androidx.compose.ui.window.DialogProperties dialogProperties = (navEntry == null || (metadata = navEntry.getMetadata()) == null) ? null : (androidx.compose.ui.window.DialogProperties) androidx.navigation3.runtime.NavMetadataKt.get(metadata, androidx.navigation3.scene.DialogSceneStrategy.Companion.DialogKey.INSTANCE);
        return dialogProperties != null ? new androidx.navigation3.scene.DialogScene(navEntry.getContentKey(), navEntry, kotlin.collections.CollectionsKt.dropLast(list, 1), kotlin.collections.CollectionsKt.dropLast(list, 1), dialogProperties, sceneStrategyScope.getOnBack()) : null;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/navigation3/scene/DialogSceneStrategy$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/window/DialogProperties;", "dialogProperties", "", "", androidx.view.compose.DialogNavigator.NAME, "(Landroidx/compose/ui/window/DialogProperties;)Ljava/util/Map;", "DialogKey"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/navigation3/scene/DialogSceneStrategy$Companion$DialogKey;", "Landroidx/navigation3/runtime/NavMetadataKey;", "Landroidx/compose/ui/window/DialogProperties;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class DialogKey implements androidx.navigation3.runtime.NavMetadataKey<androidx.compose.ui.window.DialogProperties> {
            public static final int $stable = 0;
            public static final androidx.navigation3.scene.DialogSceneStrategy.Companion.DialogKey INSTANCE = new androidx.navigation3.scene.DialogSceneStrategy.Companion.DialogKey();

            private DialogKey() {
            }
        }

        public static /* synthetic */ java.util.Map dialog$default(androidx.navigation3.scene.DialogSceneStrategy.Companion companion, androidx.compose.ui.window.DialogProperties dialogProperties, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                dialogProperties = new androidx.compose.ui.window.DialogProperties(false, false, false, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            }
            return companion.dialog(dialogProperties);
        }

        public final java.util.Map<java.lang.String, java.lang.Object> dialog(androidx.compose.ui.window.DialogProperties dialogProperties) {
            androidx.navigation3.runtime.MetadataScope metadataScope = new androidx.navigation3.runtime.MetadataScope();
            metadataScope.put(androidx.navigation3.scene.DialogSceneStrategy.Companion.DialogKey.INSTANCE, dialogProperties);
            return metadataScope.build();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
