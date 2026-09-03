package defpackage;

import android.os.Bundle;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.text.KeyModifiers;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextFieldScrollerPosition;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.foundation.text.input.internal.CursorAnchorInfoController;
import androidx.compose.foundation.text.input.internal.InputMethodManagerImpl;
import androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.material.ripple.AndroidRippleNode;
import androidx.compose.runtime.saveable.SaveableStateRegistryWrapper;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.window.PopupProperties;
import androidx.core.os.BundleKt;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDeepLink;
import androidx.os.Recreator;
import androidx.os.SavedStateRegistryController;
import androidx.os.SavedStateRegistryOwner;
import androidx.room.BaseRoomConnectionManager;
import androidx.room.InvalidationTracker;
import androidx.room.coroutines.PassthroughConnectionPool;
import androidx.window.SafeWindowExtensionsProvider;
import com.door.brass.knob.data.db.AppDatabase_Impl;
import com.door.brass.knob.ui.challenge.ChallengeUiState;
import com.door.brass.knob.ui.challenge.ChallengeViewModel;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.descriptors.ContextAwareKt;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.ws.RealWebSocket;
import okhttp3.internal.ws.WebSocketWriter;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class uY26rxeEAFnDq implements Function0 {
    public final /* synthetic */ Object b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ uY26rxeEAFnDq(int i, Object obj) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object hRNgd2zGCE5kj() {
        Object value;
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        Object obj = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                MCcLy95b8Awzmw mCcLy95b8Awzmw = AnchoredDraggableKt.yzPsTade5rL7D3;
                return Float.valueOf(((Density) obj).rw91HsWWsh17Nm(125.0f));
            case 1:
                DrawModifierNodeKt.yzPsTade5rL7D3((AndroidRippleNode) obj);
                return unit;
            case 2:
                return ((TextContextMenuDataProvider) obj).R();
            case 3:
                return ArrayIteratorKt.yzPsTade5rL7D3((Object[]) obj);
            case 4:
                return Long.valueOf(((SelectionRegistrar) obj).hRNgd2zGCE5kj());
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                return (Rect) obj;
            case WindowInsetsSides.hRNgd2zGCE5kj /* 6 */:
                MutableStateFlow mutableStateFlow = ((ChallengeViewModel) obj).ra306ClFT3HT;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.i7xAcZoXXiIt(value, ChallengeUiState.yzPsTade5rL7D3((ChallengeUiState) value, null, null, null, null, null, false, 239)));
                return unit;
            case 7:
                return ((BaseRoomConnectionManager.DriverWrapper) obj).yzPsTade5rL7D3(":memory:");
            case 8:
                return ((LegacyTextFieldState) obj).oyjLVtGms9eZwJ0();
            case 9:
                return new TextFieldScrollerPosition((Orientation) obj, 0.0f);
            case 10:
                LayoutCoordinates oyjLVtGms9eZwJ0 = ((CursorAnchorInfoController) obj).yzPsTade5rL7D3.oyjLVtGms9eZwJ0();
                if (oyjLVtGms9eZwJ0 != null) {
                    if (!oyjLVtGms9eZwJ0.FsuUJlzzWhYnMlD()) {
                        oyjLVtGms9eZwJ0 = null;
                    }
                    if (oyjLVtGms9eZwJ0 != null) {
                        throw null;
                    }
                }
                return null;
            case 11:
                PopupProperties popupProperties = DefaultTextContextMenuDropdownProvider_androidKt.yzPsTade5rL7D3;
                ((TextContextMenuSession) obj).close();
                return unit;
            case KeyModifiers.ra306ClFT3HT /* 12 */:
                ((Function1) obj).uypNJrpDByoB(Boolean.FALSE);
                return unit;
            case 13:
                Http2Connection http2Connection = (Http2Connection) obj;
                Settings settings = Http2Connection.Yey4RyhSyBRHub;
                http2Connection.getClass();
                try {
                    http2Connection.BD2CRjLJ8EtOqGQ.pu0JZhzR2Or6(2, 0, false);
                } catch (IOException e) {
                    ErrorCode errorCode = ErrorCode.i7xAcZoXXiIt;
                    http2Connection.yzPsTade5rL7D3(errorCode, errorCode, e);
                }
                return unit;
            case 14:
                Object systemService = ((InputMethodManagerImpl) obj).yzPsTade5rL7D3.getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case WindowInsetsSides.b41X89IqSbKt /* 15 */:
                AppDatabase_Impl appDatabase_Impl = ((InvalidationTracker) obj).yzPsTade5rL7D3;
                if (appDatabase_Impl.i7xAcZoXXiIt() && !appDatabase_Impl.FsuUJlzzWhYnMlD()) {
                    r1 = false;
                }
                return Boolean.valueOf(r1);
            case 16:
                DrawModifierNode drawModifierNode = ((LazyLayoutItemAnimator) obj).UEutaskTsxaI;
                if (drawModifierNode != null) {
                    DrawModifierNodeKt.yzPsTade5rL7D3(drawModifierNode);
                }
                return unit;
            case 17:
                return Integer.valueOf(((LazyListState) obj).UEutaskTsxaI().getYRx9jbDCTnXb3());
            case 18:
                return new BaseInputConnection(((LegacyTextInputMethodRequest) obj).yzPsTade5rL7D3, false);
            case 19:
                return ((NavBackStackEntry) obj).MRfxZSx8l5UG62U.hRNgd2zGCE5kj();
            case 20:
                NavDeepLink.Builder builder = new NavDeepLink.Builder();
                builder.yzPsTade5rL7D3 = (String) obj;
                return new NavDeepLink(builder.yzPsTade5rL7D3);
            case 21:
                PassthroughConnectionPool passthroughConnectionPool = (PassthroughConnectionPool) obj;
                return passthroughConnectionPool.oyjLVtGms9eZwJ0.yzPsTade5rL7D3(passthroughConnectionPool.b41X89IqSbKt);
            case 22:
                PolymorphicSerializer polymorphicSerializer = (PolymorphicSerializer) obj;
                return ContextAwareKt.yzPsTade5rL7D3(SerialDescriptorsKt.ra306ClFT3HT("kotlinx.serialization.Polymorphic", PolymorphicKind.OPEN.yzPsTade5rL7D3, new SerialDescriptor[0], new oyjLVtGms9eZwJ0(25, polymorphicSerializer)), polymorphicSerializer.yzPsTade5rL7D3);
            case 23:
                List list = RealWebSocket.BD2CRjLJ8EtOqGQ;
                ((RealWebSocket) obj).i7xAcZoXXiIt();
                return unit;
            case 24:
                List list2 = RealWebSocket.BD2CRjLJ8EtOqGQ;
                _UtilCommonKt.yzPsTade5rL7D3((WebSocketWriter) obj);
                return unit;
            case 25:
                List list3 = RealWebSocket.BD2CRjLJ8EtOqGQ;
                _UtilCommonKt.yzPsTade5rL7D3((Closeable) ((Ref.ObjectRef) obj).oyjLVtGms9eZwJ0);
                return unit;
            case 26:
                ClassLoader classLoader = ((SafeWindowExtensionsProvider) obj).yzPsTade5rL7D3;
                Class<?> loadClass = classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                loadClass.getClass();
                Method declaredMethod = loadClass.getDeclaredMethod("getWindowExtensions", null);
                Class<?> loadClass2 = classLoader.loadClass("androidx.window.extensions.WindowExtensions");
                loadClass2.getClass();
                declaredMethod.getClass();
                return Boolean.valueOf(declaredMethod.getReturnType().equals(loadClass2) && Modifier.isPublic(declaredMethod.getModifiers()));
            case 27:
                SavedStateRegistryController savedStateRegistryController = ((SaveableStateRegistryWrapper) obj).gmXBnHsR2YSm;
                if (savedStateRegistryController == null) {
                    return null;
                }
                Bundle yzPsTade5rL7D3 = BundleKt.yzPsTade5rL7D3((Pair[]) Arrays.copyOf(new Pair[0], 0));
                savedStateRegistryController.hRNgd2zGCE5kj(yzPsTade5rL7D3);
                if (yzPsTade5rL7D3.isEmpty()) {
                    return null;
                }
                return yzPsTade5rL7D3;
            case 28:
                return SavedStateHandleSupport.ra306ClFT3HT((ViewModelStoreOwner) obj);
            default:
                SavedStateRegistryOwner savedStateRegistryOwner = (SavedStateRegistryOwner) obj;
                savedStateRegistryOwner.getOyjLVtGms9eZwJ0().yzPsTade5rL7D3(new Recreator(savedStateRegistryOwner));
                return unit;
        }
    }
}
