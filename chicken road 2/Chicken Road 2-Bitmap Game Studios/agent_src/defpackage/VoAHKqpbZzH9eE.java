package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.textclassifier.TextClassification;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.collection.MutableScatterSet;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.FocusableNode;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.KeyModifiers;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuItem;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.foundation.text.contextmenu.internal.TextClassificationHelperApi28;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NextFrameEndCallbackQueue;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.composer.gapbuffer.SlotReader;
import androidx.compose.runtime.composer.gapbuffer.SlotTable;
import androidx.compose.runtime.composer.gapbuffer.SlotTableKt;
import androidx.compose.runtime.tooling.ComposeStackTrace;
import androidx.compose.runtime.tooling.ComposeStackTraceBuilderKt;
import androidx.compose.runtime.tooling.CompositionErrorContextImpl;
import androidx.compose.runtime.tooling.ObjectLocation;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.PinnableContainerKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.window.PopupProperties;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.DialogNavigator;
import androidx.window.area.SafeWindowAreaComponentProvider;
import com.door.brass.knob.ui.challenge.ChallengeUiState;
import com.door.brass.knob.ui.challenge.ChallengeViewModel;
import com.door.brass.knob.ui.menu.MenuUiState;
import com.door.brass.knob.ui.menu.MenuViewModel;
import com.door.brass.knob.ui.menudetail.MenuDetailUiState;
import com.door.brass.knob.ui.menudetail.MenuDetailViewModel;
import com.door.brass.knob.ui.navigation.BottomNavItem;
import com.door.brass.knob.ui.splash.SplashDestination;
import com.door.brass.knob.ui.splash.SplashUiState;
import com.door.brass.knob.ui.splash.SplashViewModel;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.serialization.internal.EnumDescriptor;
import kotlinx.serialization.internal.EnumSerializer;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.platform.Platform;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class VoAHKqpbZzH9eE implements Function0 {
    public final /* synthetic */ Object b41X89IqSbKt;
    public final /* synthetic */ Object gmXBnHsR2YSm;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ VoAHKqpbZzH9eE(Http2Connection http2Connection, Ref.ObjectRef objectRef) {
        this.oyjLVtGms9eZwJ0 = 15;
        this.gmXBnHsR2YSm = http2Connection;
        this.b41X89IqSbKt = objectRef;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x01c1, code lost:
    
        if (r1.getReturnType().equals(r0) != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0201, code lost:
    
        if (r1.getReturnType().equals(r0) != false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0525  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object hRNgd2zGCE5kj() {
        Object value;
        ChallengeUiState challengeUiState;
        ChallengeUiState yzPsTade5rL7D3;
        List list;
        long yzPsTade5rL7D32;
        Object value2;
        MenuDetailUiState menuDetailUiState;
        String text;
        Intent intent;
        long j;
        TextLayoutResultProxy oyjLVtGms9eZwJ0;
        LegacyTextFieldState legacyTextFieldState;
        AnnotatedString annotatedString;
        ObjectLocation objectLocation = null;
        r7 = null;
        Http2Stream[] http2StreamArr = null;
        boolean z = true;
        switch (this.oyjLVtGms9eZwJ0) {
            case 0:
                ((Ref.ObjectRef) this.b41X89IqSbKt).oyjLVtGms9eZwJ0 = ((Function0) this.gmXBnHsR2YSm).hRNgd2zGCE5kj();
                return Unit.yzPsTade5rL7D3;
            case 1:
                Channel channel = (Channel) this.b41X89IqSbKt;
                Object obj = this.gmXBnHsR2YSm;
                SpringSpec springSpec = AnimateAsStateKt.yzPsTade5rL7D3;
                channel.uypNJrpDByoB(obj);
                return Unit.yzPsTade5rL7D3;
            case 2:
                ((NavHostController) this.b41X89IqSbKt).yzPsTade5rL7D3(((BottomNavItem) this.gmXBnHsR2YSm).oyjLVtGms9eZwJ0, new MCcLy95b8Awzmw(6));
                return Unit.yzPsTade5rL7D3;
            case 3:
                TextFieldValue textFieldValue = (TextFieldValue) this.b41X89IqSbKt;
                MutableState mutableState = (MutableState) this.gmXBnHsR2YSm;
                TextFieldDecorator textFieldDecorator = BasicTextFieldKt.yzPsTade5rL7D3;
                if (!TextRange.ra306ClFT3HT(textFieldValue.hRNgd2zGCE5kj, ((TextFieldValue) mutableState.getOyjLVtGms9eZwJ0()).hRNgd2zGCE5kj) || !Intrinsics.yzPsTade5rL7D3(textFieldValue.ra306ClFT3HT, ((TextFieldValue) mutableState.getOyjLVtGms9eZwJ0()).ra306ClFT3HT)) {
                    mutableState.setValue(textFieldValue);
                }
                return Unit.yzPsTade5rL7D3;
            case 4:
                ChallengeViewModel challengeViewModel = (ChallengeViewModel) this.b41X89IqSbKt;
                String str = (String) this.gmXBnHsR2YSm;
                str.getClass();
                MutableStateFlow mutableStateFlow = challengeViewModel.ra306ClFT3HT;
                do {
                    value = mutableStateFlow.getValue();
                    challengeUiState = (ChallengeUiState) value;
                    yzPsTade5rL7D3 = ChallengeUiState.yzPsTade5rL7D3(challengeUiState, null, null, str, null, null, false, 251);
                } while (!mutableStateFlow.i7xAcZoXXiIt(value, ChallengeUiState.yzPsTade5rL7D3(yzPsTade5rL7D3, null, ChallengeViewModel.gmXBnHsR2YSm(yzPsTade5rL7D3, challengeUiState.yzPsTade5rL7D3), null, null, null, false, 253)));
                return Unit.yzPsTade5rL7D3;
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                CompositionErrorContextImpl compositionErrorContextImpl = (CompositionErrorContextImpl) this.b41X89IqSbKt;
                Object obj2 = this.gmXBnHsR2YSm;
                GapComposer gapComposer = compositionErrorContextImpl.oyjLVtGms9eZwJ0;
                SlotTable slotTable = gapComposer.ra306ClFT3HT;
                SlotReader i7xAcZoXXiIt = slotTable.i7xAcZoXXiIt();
                int i = 0;
                while (i < slotTable.b41X89IqSbKt) {
                    try {
                        if (i7xAcZoXXiIt.kSPEzfraxudm4i(i)) {
                            Object yRx9jbDCTnXb3 = i7xAcZoXXiIt.yRx9jbDCTnXb3(i);
                            if (yRx9jbDCTnXb3 != obj2) {
                                RememberObserverHolder rememberObserverHolder = yRx9jbDCTnXb3 instanceof RememberObserverHolder ? (RememberObserverHolder) yRx9jbDCTnXb3 : null;
                                if ((rememberObserverHolder != null ? rememberObserverHolder.getYzPsTade5rL7D3() : null) == obj2) {
                                }
                            }
                            ObjectLocation objectLocation2 = new ObjectLocation(i, null);
                            i7xAcZoXXiIt.ra306ClFT3HT();
                            objectLocation = objectLocation2;
                            if (objectLocation != null) {
                                int i2 = objectLocation.yzPsTade5rL7D3;
                                Integer num = objectLocation.hRNgd2zGCE5kj;
                                SlotReader i7xAcZoXXiIt2 = slotTable.i7xAcZoXXiIt();
                                try {
                                    ArrayList ra306ClFT3HT = ComposeStackTraceBuilderKt.ra306ClFT3HT(i7xAcZoXXiIt2, i2, num);
                                    i7xAcZoXXiIt2.ra306ClFT3HT();
                                    list = CollectionsKt.vywRyEooKGLFsX(ra306ClFT3HT, gapComposer.yzUZju8lbdmWa());
                                } finally {
                                }
                            } else {
                                list = EmptyList.oyjLVtGms9eZwJ0;
                            }
                            return new ComposeStackTrace(list, gapComposer.o4ticBN7g1K8jE);
                        }
                        int[] iArr = i7xAcZoXXiIt.hRNgd2zGCE5kj;
                        int i3 = i + 1;
                        int hRNgd2zGCE5kj = (i3 < i7xAcZoXXiIt.ra306ClFT3HT ? iArr[(i3 * 5) + 4] : i7xAcZoXXiIt.b41X89IqSbKt) - SlotTableKt.hRNgd2zGCE5kj(i, iArr);
                        for (int i4 = 0; i4 < hRNgd2zGCE5kj; i4++) {
                            Object Uo5pffGf8LUU = i7xAcZoXXiIt.Uo5pffGf8LUU(i, i4);
                            if (Uo5pffGf8LUU != obj2) {
                                RememberObserverHolder rememberObserverHolder2 = Uo5pffGf8LUU instanceof RememberObserverHolder ? (RememberObserverHolder) Uo5pffGf8LUU : null;
                                if ((rememberObserverHolder2 != null ? rememberObserverHolder2.getYzPsTade5rL7D3() : null) != obj2) {
                                }
                            }
                            objectLocation = new ObjectLocation(i, Integer.valueOf(i4));
                            if (objectLocation != null) {
                            }
                            return new ComposeStackTrace(list, gapComposer.o4ticBN7g1K8jE);
                        }
                        i = i3;
                    } finally {
                    }
                }
                if (objectLocation != null) {
                }
                return new ComposeStackTrace(list, gapComposer.o4ticBN7g1K8jE);
            case WindowInsetsSides.hRNgd2zGCE5kj /* 6 */:
                TextContextMenuDataProvider textContextMenuDataProvider = (TextContextMenuDataProvider) this.b41X89IqSbKt;
                Function0 function0 = (Function0) this.gmXBnHsR2YSm;
                PopupProperties popupProperties = DefaultTextContextMenuDropdownProvider_androidKt.yzPsTade5rL7D3;
                return new IntOffset(IntOffsetKt.hRNgd2zGCE5kj(textContextMenuDataProvider.i((LayoutCoordinates) function0.hRNgd2zGCE5kj())));
            case 7:
                TextContextMenuItem textContextMenuItem = (TextContextMenuItem) this.b41X89IqSbKt;
                TextContextMenuSession textContextMenuSession = (TextContextMenuSession) this.gmXBnHsR2YSm;
                PopupProperties popupProperties2 = DefaultTextContextMenuDropdownProvider_androidKt.yzPsTade5rL7D3;
                textContextMenuItem.oyjLVtGms9eZwJ0.uypNJrpDByoB(textContextMenuSession);
                return Unit.yzPsTade5rL7D3;
            case 8:
                ((DialogNavigator) this.b41X89IqSbKt).b41X89IqSbKt((NavBackStackEntry) this.gmXBnHsR2YSm, false);
                return Unit.yzPsTade5rL7D3;
            case 9:
                EnumSerializer enumSerializer = (EnumSerializer) this.b41X89IqSbKt;
                String str2 = (String) this.gmXBnHsR2YSm;
                Enum[] enumArr = enumSerializer.yzPsTade5rL7D3;
                EnumDescriptor enumDescriptor = new EnumDescriptor(str2, enumArr.length);
                int length = enumArr.length;
                while (r9 < length) {
                    enumDescriptor.Uo5pffGf8LUU(enumArr[r9].name());
                    r9++;
                }
                return enumDescriptor;
            case 10:
                ((r1) this.b41X89IqSbKt).hRNgd2zGCE5kj();
                return Boolean.TRUE;
            case 11:
                ((Ref.ObjectRef) this.b41X89IqSbKt).oyjLVtGms9eZwJ0 = CompositionLocalConsumerModifierNodeKt.yzPsTade5rL7D3((FocusableNode) this.gmXBnHsR2YSm, PinnableContainerKt.yzPsTade5rL7D3);
                return Unit.yzPsTade5rL7D3;
            case KeyModifiers.ra306ClFT3HT /* 12 */:
                GapComposer gapComposer2 = (GapComposer) this.b41X89IqSbKt;
                MovableContentStateReference movableContentStateReference = (MovableContentStateReference) this.gmXBnHsR2YSm;
                gapComposer2.jhOZP2kU3fsYi(movableContentStateReference.yzPsTade5rL7D3, movableContentStateReference.i7xAcZoXXiIt, movableContentStateReference.hRNgd2zGCE5kj);
                return Unit.yzPsTade5rL7D3;
            case 13:
                Http2Connection http2Connection = (Http2Connection) this.b41X89IqSbKt;
                Http2Stream http2Stream = (Http2Stream) this.gmXBnHsR2YSm;
                try {
                    http2Connection.oyjLVtGms9eZwJ0.ra306ClFT3HT(http2Stream);
                } catch (IOException e) {
                    Platform platform = Platform.yzPsTade5rL7D3;
                    Platform.yzPsTade5rL7D3.UEutaskTsxaI("Http2Connection.Listener failure for " + http2Connection.gmXBnHsR2YSm, 4, e);
                    try {
                        http2Stream.b41X89IqSbKt(ErrorCode.i7xAcZoXXiIt, e);
                    } catch (IOException unused) {
                    }
                }
                return Unit.yzPsTade5rL7D3;
            case 14:
                Http2Connection.ReaderRunnable readerRunnable = (Http2Connection.ReaderRunnable) this.b41X89IqSbKt;
                Settings settings = (Settings) this.gmXBnHsR2YSm;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Http2Connection http2Connection2 = Http2Connection.this;
                synchronized (http2Connection2.BD2CRjLJ8EtOqGQ) {
                    synchronized (http2Connection2) {
                        try {
                            Settings settings2 = http2Connection2.pu0JZhzR2Or6;
                            Settings settings3 = new Settings();
                            settings2.getClass();
                            for (int i5 = 0; i5 < 10; i5++) {
                                if (((1 << i5) & settings2.yzPsTade5rL7D3) != 0) {
                                    settings3.hRNgd2zGCE5kj(i5, settings2.hRNgd2zGCE5kj[i5]);
                                }
                            }
                            for (int i6 = 0; i6 < 10; i6++) {
                                if (((1 << i6) & settings.yzPsTade5rL7D3) != 0) {
                                    settings3.hRNgd2zGCE5kj(i6, settings.hRNgd2zGCE5kj[i6]);
                                }
                            }
                            objectRef.oyjLVtGms9eZwJ0 = settings3;
                            yzPsTade5rL7D32 = settings3.yzPsTade5rL7D3() - settings2.yzPsTade5rL7D3();
                            if (yzPsTade5rL7D32 != 0 && !http2Connection2.b41X89IqSbKt.isEmpty()) {
                                http2StreamArr = (Http2Stream[]) http2Connection2.b41X89IqSbKt.values().toArray(new Http2Stream[0]);
                            }
                            Settings settings4 = (Settings) objectRef.oyjLVtGms9eZwJ0;
                            settings4.getClass();
                            http2Connection2.pu0JZhzR2Or6 = settings4;
                            TaskQueue.hRNgd2zGCE5kj(http2Connection2.uypNJrpDByoB, http2Connection2.gmXBnHsR2YSm + " onSettings", 0L, new VoAHKqpbZzH9eE(http2Connection2, objectRef), 6);
                        } finally {
                        }
                    }
                    try {
                        http2Connection2.BD2CRjLJ8EtOqGQ.yzPsTade5rL7D3((Settings) objectRef.oyjLVtGms9eZwJ0);
                    } catch (IOException e2) {
                        ErrorCode errorCode = ErrorCode.i7xAcZoXXiIt;
                        http2Connection2.yzPsTade5rL7D3(errorCode, errorCode, e2);
                    }
                }
                if (http2StreamArr != null) {
                    int length2 = http2StreamArr.length;
                    while (r9 < length2) {
                        Http2Stream http2Stream2 = http2StreamArr[r9];
                        synchronized (http2Stream2) {
                            http2Stream2.Uo5pffGf8LUU += yzPsTade5rL7D32;
                            if (yzPsTade5rL7D32 > 0) {
                                http2Stream2.notifyAll();
                            }
                        }
                        r9++;
                    }
                }
                return Unit.yzPsTade5rL7D3;
            case WindowInsetsSides.b41X89IqSbKt /* 15 */:
                Http2Connection http2Connection3 = (Http2Connection) this.gmXBnHsR2YSm;
                http2Connection3.oyjLVtGms9eZwJ0.yzPsTade5rL7D3(http2Connection3, (Settings) ((Ref.ObjectRef) this.b41X89IqSbKt).oyjLVtGms9eZwJ0);
                return Unit.yzPsTade5rL7D3;
            case 16:
                MenuDetailViewModel menuDetailViewModel = (MenuDetailViewModel) this.b41X89IqSbKt;
                String str3 = (String) this.gmXBnHsR2YSm;
                str3.getClass();
                MutableStateFlow mutableStateFlow2 = menuDetailViewModel.gmXBnHsR2YSm;
                do {
                    value2 = mutableStateFlow2.getValue();
                    menuDetailUiState = (MenuDetailUiState) value2;
                } while (!mutableStateFlow2.i7xAcZoXXiIt(value2, MenuDetailUiState.yzPsTade5rL7D3(menuDetailUiState, null, null, Intrinsics.yzPsTade5rL7D3(menuDetailUiState.ra306ClFT3HT, str3) ? null : str3, null, 251)));
                return Unit.yzPsTade5rL7D3;
            case 17:
                MenuViewModel menuViewModel = (MenuViewModel) this.b41X89IqSbKt;
                String str4 = (String) this.gmXBnHsR2YSm;
                str4.getClass();
                MutableStateFlow mutableStateFlow3 = menuViewModel.ra306ClFT3HT;
                while (true) {
                    Object value3 = mutableStateFlow3.getValue();
                    MenuUiState menuUiState = (MenuUiState) value3;
                    MenuUiState yzPsTade5rL7D33 = MenuUiState.yzPsTade5rL7D3(menuUiState, null, null, null, null, str4, false, 207);
                    String str5 = str4;
                    if (mutableStateFlow3.i7xAcZoXXiIt(value3, MenuUiState.yzPsTade5rL7D3(yzPsTade5rL7D33, null, menuViewModel.gmXBnHsR2YSm(yzPsTade5rL7D33, menuUiState.yzPsTade5rL7D3), null, null, null, false, 253))) {
                        return Unit.yzPsTade5rL7D3;
                    }
                    str4 = str5;
                }
            case 18:
                NextFrameEndCallbackQueue nextFrameEndCallbackQueue = (NextFrameEndCallbackQueue) this.b41X89IqSbKt;
                r5 r5Var = (r5) this.gmXBnHsR2YSm;
                if (nextFrameEndCallbackQueue.yzPsTade5rL7D3.get() == 0) {
                    r5Var.hRNgd2zGCE5kj();
                }
                return Unit.yzPsTade5rL7D3;
            case 19:
                MutableScatterSet mutableScatterSet = (MutableScatterSet) this.b41X89IqSbKt;
                ControlledComposition controlledComposition = (ControlledComposition) this.gmXBnHsR2YSm;
                MutableStateFlow mutableStateFlow4 = Recomposer.BD2CRjLJ8EtOqGQ;
                Object[] objArr = mutableScatterSet.hRNgd2zGCE5kj;
                long[] jArr = mutableScatterSet.yzPsTade5rL7D3;
                int length3 = jArr.length - 2;
                if (length3 >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j2 = jArr[i7];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = 8 - ((~(i7 - length3)) >>> 31);
                            for (int i9 = 0; i9 < i8; i9++) {
                                if ((255 & j2) < 128) {
                                    controlledComposition.UEutaskTsxaI(objArr[(i7 << 3) + i9]);
                                }
                                j2 >>= 8;
                            }
                            if (i8 != 8) {
                            }
                        }
                        if (i7 != length3) {
                            i7++;
                        }
                    }
                }
                return Unit.yzPsTade5rL7D3;
            case 20:
                Class cls = (Class) this.b41X89IqSbKt;
                Method method = (Method) this.gmXBnHsR2YSm;
                String name = method.getName();
                Class<?>[] parameterTypes = method.getParameterTypes();
                Method method2 = cls.getMethod(name, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
                method2.getClass();
                if (Modifier.isPublic(method2.getModifiers())) {
                    Class<?> returnType = method.getReturnType();
                    returnType.getClass();
                    break;
                }
                z = false;
                return Boolean.valueOf(z);
            case 21:
                Object obj3 = this.b41X89IqSbKt;
                SafeWindowAreaComponentProvider safeWindowAreaComponentProvider = (SafeWindowAreaComponentProvider) this.gmXBnHsR2YSm;
                Method method3 = obj3.getClass().getMethod("getWindowAreaComponent", null);
                method3.getClass();
                if (Modifier.isPublic(method3.getModifiers())) {
                    Class<?> loadClass = safeWindowAreaComponentProvider.yzPsTade5rL7D3.loadClass("androidx.window.extensions.area.WindowAreaComponent");
                    loadClass.getClass();
                    break;
                }
                z = false;
                return Boolean.valueOf(z);
            case 22:
                SplashViewModel splashViewModel = (SplashViewModel) this.b41X89IqSbKt;
                if (((SplashUiState) ((State) this.gmXBnHsR2YSm).getOyjLVtGms9eZwJ0()) instanceof SplashUiState.Failed) {
                    splashViewModel.gmXBnHsR2YSm(false);
                }
                return Unit.yzPsTade5rL7D3;
            case 23:
                Context context = (Context) this.b41X89IqSbKt;
                String str6 = ((SplashDestination.Offer) ((SplashDestination) this.gmXBnHsR2YSm)).yzPsTade5rL7D3;
                try {
                    CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                    builder.yzPsTade5rL7D3.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                    CustomTabsIntent yzPsTade5rL7D34 = builder.yzPsTade5rL7D3();
                    Uri parse = Uri.parse(str6);
                    parse.getClass();
                    Intent intent2 = yzPsTade5rL7D34.yzPsTade5rL7D3;
                    intent2.setData(parse);
                    context.startActivity(intent2, yzPsTade5rL7D34.hRNgd2zGCE5kj);
                } catch (Exception e3) {
                    Log.w("SplashScreen", "Could not open the Custom Tab", e3);
                }
                return Unit.yzPsTade5rL7D3;
            case 24:
                Context context2 = (Context) this.b41X89IqSbKt;
                TextClassification textClassification = (TextClassification) this.gmXBnHsR2YSm;
                text = textClassification.getText();
                r9 = text != null ? text.hashCode() : 0;
                intent = textClassification.getIntent();
                TextClassificationHelperApi28.yzPsTade5rL7D3(PendingIntent.getActivity(context2, r9, intent, 201326592));
                return Unit.yzPsTade5rL7D3;
            case 25:
                TextFieldSelectionState textFieldSelectionState = (TextFieldSelectionState) this.b41X89IqSbKt;
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = (TextFieldDecoratorModifierNode) this.gmXBnHsR2YSm;
                if (!textFieldSelectionState.yzPsTade5rL7D3) {
                    FocusableNode focusableNode = textFieldDecoratorModifierNode.elPM8kURv8Fp;
                    if (focusableNode.o2t7oodqU1bUMaS) {
                        focusableNode.ZvpnNpCMEWSR3.zgejW39NNp2D(7);
                    }
                }
                return Unit.yzPsTade5rL7D3;
            case 26:
                TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) this.b41X89IqSbKt;
                long j3 = ((IntSize) ((MutableState) this.gmXBnHsR2YSm).getOyjLVtGms9eZwJ0()).yzPsTade5rL7D3;
                Offset UEutaskTsxaI = textFieldSelectionManager.UEutaskTsxaI();
                long j4 = 9205357640488583168L;
                if (UEutaskTsxaI != null) {
                    long j5 = UEutaskTsxaI.yzPsTade5rL7D3;
                    AnnotatedString yRx9jbDCTnXb32 = textFieldSelectionManager.yRx9jbDCTnXb3();
                    if (yRx9jbDCTnXb32 != null && yRx9jbDCTnXb32.b41X89IqSbKt.length() != 0) {
                        Handle handle = (Handle) ((SnapshotMutableStateImpl) textFieldSelectionManager.FTJ2XS7ULgY8).getOyjLVtGms9eZwJ0();
                        int i10 = handle == null ? -1 : TextFieldSelectionManagerKt.WhenMappings.yzPsTade5rL7D3[handle.ordinal()];
                        if (i10 != -1) {
                            if (i10 == 1 || i10 == 2) {
                                long j6 = textFieldSelectionManager.NIabVTHf6LMJyXq().hRNgd2zGCE5kj;
                                int i11 = TextRange.ra306ClFT3HT;
                                j = j6 >> 32;
                            } else {
                                if (i10 != 3) {
                                    h1.hRNgd2zGCE5kj();
                                    return null;
                                }
                                long j7 = textFieldSelectionManager.NIabVTHf6LMJyXq().hRNgd2zGCE5kj;
                                int i12 = TextRange.ra306ClFT3HT;
                                j = j7 & 4294967295L;
                            }
                            int i13 = (int) j;
                            LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.oyjLVtGms9eZwJ0;
                            if (legacyTextFieldState2 != null && (oyjLVtGms9eZwJ0 = legacyTextFieldState2.oyjLVtGms9eZwJ0()) != null && (legacyTextFieldState = textFieldSelectionManager.oyjLVtGms9eZwJ0) != null && (annotatedString = legacyTextFieldState.yzPsTade5rL7D3.yzPsTade5rL7D3) != null) {
                                int ra306ClFT3HT2 = RangesKt.ra306ClFT3HT(textFieldSelectionManager.hRNgd2zGCE5kj.hRNgd2zGCE5kj(i13), 0, annotatedString.b41X89IqSbKt.length());
                                float intBitsToFloat = Float.intBitsToFloat((int) (oyjLVtGms9eZwJ0.oyjLVtGms9eZwJ0(j5) >> 32));
                                TextLayoutResult textLayoutResult = oyjLVtGms9eZwJ0.yzPsTade5rL7D3;
                                MultiParagraph multiParagraph = textLayoutResult.hRNgd2zGCE5kj;
                                int oyjLVtGms9eZwJ02 = multiParagraph.oyjLVtGms9eZwJ0(ra306ClFT3HT2);
                                float gmXBnHsR2YSm = textLayoutResult.gmXBnHsR2YSm(oyjLVtGms9eZwJ02);
                                float i7xAcZoXXiIt3 = textLayoutResult.i7xAcZoXXiIt(oyjLVtGms9eZwJ02);
                                float hRNgd2zGCE5kj2 = RangesKt.hRNgd2zGCE5kj(intBitsToFloat, Math.min(gmXBnHsR2YSm, i7xAcZoXXiIt3), Math.max(gmXBnHsR2YSm, i7xAcZoXXiIt3));
                                if (IntSize.hRNgd2zGCE5kj(j3, 0L) || Math.abs(intBitsToFloat - hRNgd2zGCE5kj2) <= ((int) (j3 >> 32)) / 2) {
                                    float gmXBnHsR2YSm2 = multiParagraph.gmXBnHsR2YSm(oyjLVtGms9eZwJ02);
                                    j4 = (Float.floatToRawIntBits(hRNgd2zGCE5kj2) << 32) | (Float.floatToRawIntBits(((multiParagraph.hRNgd2zGCE5kj(oyjLVtGms9eZwJ02) - gmXBnHsR2YSm2) / 2.0f) + gmXBnHsR2YSm2) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return new Offset(j4);
            default:
                throw null;
        }
    }

    public /* synthetic */ VoAHKqpbZzH9eE(int i, Object obj, Object obj2) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = obj;
        this.gmXBnHsR2YSm = obj2;
    }
}
