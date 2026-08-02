package androidx.glance;

import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.unit.DpSize;
import androidx.datastore.preferences.core.Preferences;
import androidx.exifinterface.media.ExifInterface;
import androidx.glance.color.ColorProviders;
import androidx.glance.color.DynamicThemeColorProviders;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0011\u001a\u0002H\u0012\"\u0006\b\u0000\u0010\u0012\u0018\u0001H\u0087\b¢\u0006\u0002\u0010\u0013\u001a&\u0010\u0011\u001a\u0004\u0018\u0001H\u0012\"\u0006\b\u0000\u0010\u0012\u0018\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0015H\u0087\b¢\u0006\u0002\u0010\u0016\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0004\"\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0004\"\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001ø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0004\"\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"LocalColors", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/glance/color/ColorProviders;", "getLocalColors", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalContext", "Landroid/content/Context;", "getLocalContext", "LocalGlanceId", "Landroidx/glance/GlanceId;", "getLocalGlanceId", "LocalSize", "Landroidx/compose/ui/unit/DpSize;", "getLocalSize", "LocalState", "", "getLocalState", "currentState", ExifInterface.GPS_DIRECTION_TRUE, "(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", Constants.KEY, "Landroidx/datastore/preferences/core/Preferences$Key;", "(Landroidx/datastore/preferences/core/Preferences$Key;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCompositionLocals.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositionLocals.kt\nandroidx/glance/CompositionLocalsKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,81:1\n61#1:83\n76#2:82\n76#2:84\n*S KotlinDebug\n*F\n+ 1 CompositionLocals.kt\nandroidx/glance/CompositionLocalsKt\n*L\n72#1:83\n61#1:82\n72#1:84\n*E\n"})
/* loaded from: classes.dex */
public final class CompositionLocalsKt {
    private static final ProvidableCompositionLocal<DpSize> LocalSize = CompositionLocalKt.staticCompositionLocalOf(new Function0<DpSize>() { // from class: androidx.glance.CompositionLocalsKt$LocalSize$1
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ DpSize invoke() {
            return DpSize.m1107boximpl(m1273invokeMYxV2XQ());
        }

        /* renamed from: invoke-MYxV2XQ, reason: not valid java name */
        public final long m1273invokeMYxV2XQ() {
            throw new IllegalStateException("No default size");
        }
    });
    private static final ProvidableCompositionLocal<Context> LocalContext = CompositionLocalKt.staticCompositionLocalOf(new Function0<Context>() { // from class: androidx.glance.CompositionLocalsKt$LocalContext$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Context invoke() {
            throw new IllegalStateException("No default context");
        }
    });
    private static final ProvidableCompositionLocal<Object> LocalState = CompositionLocalKt.compositionLocalOf$default(null, new Function0<Object>() { // from class: androidx.glance.CompositionLocalsKt$LocalState$1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return null;
        }
    }, 1, null);
    private static final ProvidableCompositionLocal<GlanceId> LocalGlanceId = CompositionLocalKt.staticCompositionLocalOf(new Function0<GlanceId>() { // from class: androidx.glance.CompositionLocalsKt$LocalGlanceId$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final GlanceId invoke() {
            throw new IllegalStateException("No default glance id");
        }
    });
    private static final ProvidableCompositionLocal<ColorProviders> LocalColors = CompositionLocalKt.staticCompositionLocalOf(new Function0<ColorProviders>() { // from class: androidx.glance.CompositionLocalsKt$LocalColors$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ColorProviders invoke() {
            return DynamicThemeColorProviders.INSTANCE;
        }
    });

    @Composable
    public static final /* synthetic */ <T> T currentState(Composer composer, int i) {
        composer.startReplaceableGroup(-534706435);
        T t = (T) composer.consume(getLocalState());
        Intrinsics.reifiedOperationMarker(1, ExifInterface.GPS_DIRECTION_TRUE);
        composer.endReplaceableGroup();
        return t;
    }

    public static final ProvidableCompositionLocal<ColorProviders> getLocalColors() {
        return LocalColors;
    }

    public static final ProvidableCompositionLocal<Context> getLocalContext() {
        return LocalContext;
    }

    public static final ProvidableCompositionLocal<GlanceId> getLocalGlanceId() {
        return LocalGlanceId;
    }

    public static final ProvidableCompositionLocal<DpSize> getLocalSize() {
        return LocalSize;
    }

    public static final ProvidableCompositionLocal<Object> getLocalState() {
        return LocalState;
    }

    @Composable
    public static final /* synthetic */ <T> T currentState(Preferences.Key<T> key, Composer composer, int i) {
        composer.startReplaceableGroup(1333953144);
        composer.startReplaceableGroup(-534706435);
        Object consume = composer.consume(getLocalState());
        if (consume != null) {
            composer.endReplaceableGroup();
            T t = (T) ((Preferences) consume).get(key);
            composer.endReplaceableGroup();
            return t;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.datastore.preferences.core.Preferences");
    }
}
