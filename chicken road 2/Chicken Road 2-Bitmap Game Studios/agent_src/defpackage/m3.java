package defpackage;

import androidx.activity.compose.LocalOnBackPressedDispatcherOwner;
import androidx.compose.foundation.OverscrollConfiguration;
import androidx.compose.foundation.OverscrollConfiguration_androidKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.text.KeyModifiers;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProviderKt;
import androidx.compose.foundation.text.selection.DefaultTextSelectionColors_androidKt;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviors_androidKt;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.DefaultModalWideNavigationRailOverride;
import androidx.compose.material3.DefaultNavigationBarOverride;
import androidx.compose.material3.DefaultNavigationRailOverride;
import androidx.compose.material3.DefaultShortNavigationBarOverride;
import androidx.compose.material3.DefaultWideNavigationRailOverride;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.NavigationBarKt;
import androidx.compose.material3.NavigationRailKt;
import androidx.compose.material3.RippleConfiguration;
import androidx.compose.material3.RippleKt;
import androidx.compose.material3.Shapes;
import androidx.compose.material3.ShapesKt;
import androidx.compose.material3.ShortNavigationBarKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.Typography;
import androidx.compose.material3.TypographyKt;
import androidx.compose.material3.WideNavigationRailKt;
import androidx.compose.material3.tokens.TypographyTokensKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.retain.ForgetfulRetainedValuesStore;
import androidx.compose.runtime.retain.LocalRetainedValuesStoreKt;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.text.SpanStyleKt;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.navigationevent.compose.LocalNavigationEventDispatcherOwner;
import androidx.os.compose.LocalSavedStateRegistryOwnerKt;
import java.util.UUID;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.descriptors.StructureKind;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class m3 implements Function0 {
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ m3(int i) {
        this.oyjLVtGms9eZwJ0 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object hRNgd2zGCE5kj() {
        switch (this.oyjLVtGms9eZwJ0) {
            case 0:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = LocalLifecycleOwnerKt.yzPsTade5rL7D3;
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 1:
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = LocalNavigationEventDispatcherOwner.yzPsTade5rL7D3;
                return null;
            case 2:
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal2 = LocalOnBackPressedDispatcherOwner.yzPsTade5rL7D3;
                return null;
            case 3:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = LocalRetainedValuesStoreKt.yzPsTade5rL7D3;
                return ForgetfulRetainedValuesStore.yzPsTade5rL7D3;
            case 4:
                ProvidableCompositionLocal providableCompositionLocal = LocalSavedStateRegistryOwnerKt.yzPsTade5rL7D3;
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal3 = MaterialThemeKt.yzPsTade5rL7D3;
                return Boolean.FALSE;
            case WindowInsetsSides.hRNgd2zGCE5kj /* 6 */:
                return UUID.randomUUID();
            case 7:
                return new SavedStateViewModelFactory();
            case 8:
                float f = NavigationBarKt.yzPsTade5rL7D3;
                return DefaultNavigationBarOverride.yzPsTade5rL7D3;
            case 9:
                int i = NavigationRailKt.yzPsTade5rL7D3;
                return DefaultNavigationRailOverride.yzPsTade5rL7D3;
            case 10:
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
                if (StringsKt.GiTAvmtrM6Bh8SJ("kotlin.Unit")) {
                    yzPsTade5rL7D3.yRx9jbDCTnXb3("Blank serial names are prohibited");
                    return null;
                }
                StructureKind.CLASS r2 = StructureKind.CLASS.yzPsTade5rL7D3;
                StructureKind.OBJECT object = StructureKind.OBJECT.yzPsTade5rL7D3;
                if (object == r2) {
                    yzPsTade5rL7D3.yRx9jbDCTnXb3("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                    return null;
                }
                ClassSerialDescriptorBuilder classSerialDescriptorBuilder = new ClassSerialDescriptorBuilder("kotlin.Unit");
                return new SerialDescriptorImpl("kotlin.Unit", object, classSerialDescriptorBuilder.hRNgd2zGCE5kj.size(), ArraysKt.BD2CRjLJ8EtOqGQ(serialDescriptorArr), classSerialDescriptorBuilder);
            case 11:
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal3 = OverscrollConfiguration_androidKt.yzPsTade5rL7D3;
                return new OverscrollConfiguration();
            case KeyModifiers.ra306ClFT3HT /* 12 */:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal4 = PlatformSelectionBehaviors_androidKt.yzPsTade5rL7D3;
                DefaultScheduler defaultScheduler = Dispatchers.yzPsTade5rL7D3;
                return DefaultIoScheduler.gmXBnHsR2YSm;
            case 13:
                return null;
            case 14:
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal4 = RippleKt.yzPsTade5rL7D3;
                return new RippleConfiguration();
            case WindowInsetsSides.b41X89IqSbKt /* 15 */:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal5 = SaveableStateRegistryKt.yzPsTade5rL7D3;
                return null;
            case 16:
                return new ScrollState(0);
            case 17:
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal5 = SelectionRegistrarKt.yzPsTade5rL7D3;
                return null;
            case 18:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal6 = ShapesKt.yzPsTade5rL7D3;
                return new Shapes();
            case 19:
                int i2 = ShortNavigationBarKt.yzPsTade5rL7D3;
                return DefaultShortNavigationBarOverride.yzPsTade5rL7D3;
            case 20:
                return SpanStyleKt.oyjLVtGms9eZwJ0;
            case 21:
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal6 = SurfaceKt.yzPsTade5rL7D3;
                return new Dp(0.0f);
            case 22:
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal7 = TextContextMenuProviderKt.yzPsTade5rL7D3;
                return null;
            case 23:
                throw null;
            case 24:
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal8 = TextKt.yzPsTade5rL7D3;
                return TypographyTokensKt.yzPsTade5rL7D3;
            case 25:
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal9 = TextSelectionColorsKt.yzPsTade5rL7D3;
                return DefaultTextSelectionColors_androidKt.yzPsTade5rL7D3;
            case 26:
                throw null;
            case 27:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal7 = TypographyKt.yzPsTade5rL7D3;
                return new Typography(null, 32767);
            case 28:
                int i3 = WideNavigationRailKt.yzPsTade5rL7D3;
                return DefaultWideNavigationRailOverride.yzPsTade5rL7D3;
            default:
                int i4 = WideNavigationRailKt.yzPsTade5rL7D3;
                return DefaultModalWideNavigationRailOverride.yzPsTade5rL7D3;
        }
    }

    public /* synthetic */ m3(int i, Object obj) {
        this.oyjLVtGms9eZwJ0 = i;
    }
}
