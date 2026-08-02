package defpackage;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.node.LayoutNode;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nComposeLayoutNodeBoundsHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeLayoutNodeBoundsHelper.kt\nComposeLayoutNodeBoundsHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,42:1\n1#2:43\n*E\n"})
/* loaded from: classes.dex */
public final class a {
    public final com.amplitude.common.a a;

    @SourceDebugExtension({"SMAP\nComposeLayoutNodeBoundsHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeLayoutNodeBoundsHelper.kt\nComposeLayoutNodeBoundsHelper$getLayoutNodeWindowBounds$attachedModifier$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,42:1\n1#2:43\n*E\n"})
    /* renamed from: a$a, reason: collision with other inner class name */
    public static final class C0000a extends Lambda implements Function0<ModifierInfo> {
        public final /* synthetic */ List<ModifierInfo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0000a(List<ModifierInfo> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ModifierInfo invoke() {
            Object obj;
            Iterator<T> it = this.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((ModifierInfo) obj).getCoordinates().isAttached()) {
                    break;
                }
            }
            return (ModifierInfo) obj;
        }
    }

    public a(com.amplitude.common.a logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.a = logger;
    }

    public static final ModifierInfo b(Lazy<ModifierInfo> lazy) {
        return lazy.getValue();
    }

    public final Rect a(LayoutNode layoutNode) {
        LayoutCoordinates coordinates;
        try {
            List modifierInfo = layoutNode.getModifierInfo();
            Object firstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) modifierInfo);
            ModifierInfo modifierInfo2 = (ModifierInfo) firstOrNull;
            if (modifierInfo2 == null || (coordinates = modifierInfo2.getCoordinates()) == null || !coordinates.isAttached()) {
                firstOrNull = null;
            }
            ModifierInfo modifierInfo3 = (ModifierInfo) firstOrNull;
            Lazy lazy = LazyKt.lazy(new C0000a(modifierInfo));
            if (modifierInfo3 == null) {
                modifierInfo3 = b(lazy);
            }
            LayoutCoordinates coordinates2 = modifierInfo3 != null ? modifierInfo3.getCoordinates() : null;
            if (coordinates2 == null) {
                coordinates2 = layoutNode.getCoordinates();
            }
            return LayoutCoordinatesKt.boundsInWindow(coordinates2);
        } catch (Exception unused) {
            this.a.d("Could not fetch position for LayoutNode");
            return null;
        }
    }
}
