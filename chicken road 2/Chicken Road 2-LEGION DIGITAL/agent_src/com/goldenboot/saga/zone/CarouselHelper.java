package com.goldenboot.saga.zone;

import android.view.View;
import androidx.compose.ui.layout.GradientActivator;
import com.goldenboot.saga.zone.AlarmHook;
import com.goldenboot.saga.zone.FeatureConverter;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u0084\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u0000 Ý\u00012\u00020\u0001:\u0004Þ\u0001ß\u0001J5\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H&¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0019\u0010\u000eJ\u0019\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\u0004H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH&¢\u0006\u0004\b\u001f\u0010 J!\u0010!\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b!\u0010\"JE\u0010+\u001a\u00020*2\u001a\u0010&\u001a\u0016\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020\b0#2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0'2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010%H&¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\bH&¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b/\u0010\u000eJ\u0017\u00100\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b0\u0010\u000eJ\u001f\u00103\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b5\u00104J\u001b\u00109\u001a\u00020\b2\n\u00108\u001a\u000606j\u0002`7H'¢\u0006\u0004\b9\u0010:J\u001d\u0010<\u001a\u00020\b2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\b0'H&¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\bH&¢\u0006\u0004\b>\u0010.J\u0017\u0010@\u001a\u00020\b2\u0006\u0010;\u001a\u00020?H&¢\u0006\u0004\b@\u0010AJ4\u0010G\u001a\u00020D2\"\u0010F\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020B\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0C\u0012\u0006\u0012\u0004\u0018\u00010E0#H¦@¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\bH\u0016¢\u0006\u0004\bI\u0010.J\u000f\u0010J\u001a\u00020\bH\u0016¢\u0006\u0004\bJ\u0010.J\u000f\u0010K\u001a\u00020\bH\u0016¢\u0006\u0004\bK\u0010.J\u000f\u0010L\u001a\u00020\bH\u0016¢\u0006\u0004\bL\u0010.J\u0017\u0010O\u001a\u00020\b2\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\u0013H\u0016¢\u0006\u0004\bR\u0010SR\u001a\u0010X\u001a\u00020T8&X§\u0004¢\u0006\f\u0012\u0004\bW\u0010.\u001a\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00020\\8&X¦\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8&X¦\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0014\u0010g\u001a\u00020d8&X¦\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u0014\u0010k\u001a\u00020h8&X¦\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0014\u0010o\u001a\u00020l8&X¦\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0014\u0010s\u001a\u00020p8&X¦\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0014\u0010w\u001a\u00020t8&X¦\u0004¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0014\u0010{\u001a\u00020x8&X¦\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0014\u0010\u007f\u001a\u00020|8&X¦\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~R\u0018\u0010\u0083\u0001\u001a\u00030\u0080\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0084\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001a\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0088\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001a\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008c\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u0093\u0001\u001a\u00030\u0090\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0018\u0010\u0097\u0001\u001a\u00030\u0094\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\u009b\u0001\u001a\u00030\u0098\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0018\u0010\u009f\u0001\u001a\u00030\u009c\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0018\u0010£\u0001\u001a\u00030 \u00018&X¦\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001R\u0018\u0010§\u0001\u001a\u00030¤\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b¥\u0001\u0010¦\u0001R\u0018\u0010«\u0001\u001a\u00030¨\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b©\u0001\u0010ª\u0001R\u0018\u0010¯\u0001\u001a\u00030¬\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u00ad\u0001\u0010®\u0001R\u0018\u0010³\u0001\u001a\u00030°\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b±\u0001\u0010²\u0001R\u0018\u0010·\u0001\u001a\u00030´\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bµ\u0001\u0010¶\u0001R)\u0010¼\u0001\u001a\u00020\u00042\u0007\u0010¸\u0001\u001a\u00020\u00048&@gX¦\u000e¢\u0006\u000f\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0005\b»\u0001\u0010\u001cR\u0018\u0010À\u0001\u001a\u00030½\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b¾\u0001\u0010¿\u0001R\u0018\u0010Ä\u0001\u001a\u00030Á\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bÂ\u0001\u0010Ã\u0001R\u0018\u0010È\u0001\u001a\u00030Å\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bÆ\u0001\u0010Ç\u0001R\u0018\u0010Ì\u0001\u001a\u00030É\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bÊ\u0001\u0010Ë\u0001R\u0018\u0010Ð\u0001\u001a\u00030Í\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bÎ\u0001\u0010Ï\u0001R\u0018\u0010Ô\u0001\u001a\u00030Ñ\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÒ\u0001\u0010Ó\u0001R\u0018\u0010Ø\u0001\u001a\u00030Õ\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bÖ\u0001\u0010×\u0001R\u001a\u0010Ü\u0001\u001a\u0005\u0018\u00010Ù\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÚ\u0001\u0010Û\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006à\u0001À\u0006\u0001"}, d2 = {"Lcom/goldenboot/saga/zone/CarouselHelper;", "Lcom/goldenboot/saga/zone/DrawableDelegate;", "Lcom/goldenboot/saga/zone/ContentRepository;", "layoutNode", "", "affectsLookahead", "forceRequest", "scheduleMeasureAndLayout", "Lcom/goldenboot/saga/zone/DpadBuilder;", "flushSample", "(Lcom/goldenboot/saga/zone/ContentRepository;ZZZ)V", "startResource", "(Lcom/goldenboot/saga/zone/ContentRepository;ZZ)V", "inflateEdge", "(Lcom/goldenboot/saga/zone/ContentRepository;)V", "node", "notifyMessage", "attachConfig", "drawScope", "Lcom/goldenboot/saga/zone/RuntimeHeap;", "localPosition", "applyTask", "(J)J", "positionInWindow", "popBlueprint", "drawField", "sendPointerUpdate", "evictLayout", "(Z)V", "Lcom/goldenboot/saga/zone/PagerPlanner;", "constraints", "storeCharset", "(Lcom/goldenboot/saga/zone/ContentRepository;J)V", "packPackage", "(Lcom/goldenboot/saga/zone/ContentRepository;Z)V", "Lkotlin/Function2;", "Lcom/goldenboot/saga/zone/PulseCounter;", "Lcom/goldenboot/saga/zone/BottomBarEvaluator;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "explicitLayer", "Lcom/goldenboot/saga/zone/ShapeAssembler;", "gatherAdapter", "(Lcom/goldenboot/saga/zone/IconExporter;Lcom/goldenboot/saga/zone/ElevationNode;Lcom/goldenboot/saga/zone/BottomBarEvaluator;)Lcom/goldenboot/saga/zone/ShapeAssembler;", "attachCallback", "()V", "flattenPackage", "groupArchive", "", "oldSemanticsId", "prepareTask", "(Lcom/goldenboot/saga/zone/ContentRepository;I)V", "serializeOffset", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/InteropView;", "view", "connectPatch", "(Landroid/view/View;)V", "listener", "findTask", "(Lcom/goldenboot/saga/zone/ElevationNode;)V", "mapJob", "Lcom/goldenboot/saga/zone/CarouselHelper$BounceHandler;", "connectComponent", "(Lcom/goldenboot/saga/zone/CarouselHelper$BounceHandler;)V", "Lcom/goldenboot/saga/zone/FeatureProvider;", "Lcom/goldenboot/saga/zone/ServiceRegulator;", "", "", "session", "resetValue", "(Lcom/goldenboot/saga/zone/IconExporter;Lcom/goldenboot/saga/zone/ServiceRegulator;)Ljava/lang/Object;", "purgeNode", "resolveDelta", "releaseHeader", "connectJob", "", "frameRate", "reduceScope", "(F)V", "delta", "decodePath", "(J)V", "Lcom/goldenboot/saga/zone/AlarmHook$BounceHandler;", "getFontLoader", "()Lcom/goldenboot/saga/zone/AlarmHook$BounceHandler;", "getFontLoader$annotations", "fontLoader", "getRoot", "()Lcom/goldenboot/saga/zone/ContentRepository;", "root", "Lcom/goldenboot/saga/zone/FramePresenter;", "getLayoutNodes", "()Lcom/goldenboot/saga/zone/FramePresenter;", "layoutNodes", "Lcom/goldenboot/saga/zone/AlphaFacilitator;", "getSharedDrawScope", "()Lcom/goldenboot/saga/zone/AlphaFacilitator;", "sharedDrawScope", "Lcom/goldenboot/saga/zone/EndpointWriter;", "getRootForTest", "()Lcom/goldenboot/saga/zone/EndpointWriter;", "rootForTest", "Lcom/goldenboot/saga/zone/PluginProcess;", "getHapticFeedBack", "()Lcom/goldenboot/saga/zone/PluginProcess;", "hapticFeedBack", "Lcom/goldenboot/saga/zone/PaddingCounter;", "getInputModeManager", "()Lcom/goldenboot/saga/zone/PaddingCounter;", "inputModeManager", "Lcom/goldenboot/saga/zone/ServerRollback;", "getClipboardManager", "()Lcom/goldenboot/saga/zone/ServerRollback;", "clipboardManager", "Lcom/goldenboot/saga/zone/PointerImpl;", "getClipboard", "()Lcom/goldenboot/saga/zone/PointerImpl;", "clipboard", "Lcom/goldenboot/saga/zone/LifecycleMulticaster;", "getAccessibilityManager", "()Lcom/goldenboot/saga/zone/LifecycleMulticaster;", "accessibilityManager", "Lcom/goldenboot/saga/zone/LayerBenchmark;", "getGraphicsContext", "()Lcom/goldenboot/saga/zone/LayerBenchmark;", "graphicsContext", "Lcom/goldenboot/saga/zone/SpringVersion;", "getTextToolbar", "()Lcom/goldenboot/saga/zone/SpringVersion;", "textToolbar", "Lcom/goldenboot/saga/zone/PlatformBeacon;", "getAutofillTree", "()Lcom/goldenboot/saga/zone/PlatformBeacon;", "autofillTree", "Lcom/goldenboot/saga/zone/ObserverPresenter;", "getAutofill", "()Lcom/goldenboot/saga/zone/ObserverPresenter;", "autofill", "Lcom/goldenboot/saga/zone/ContentChain;", "getAutofillManager", "()Lcom/goldenboot/saga/zone/ContentChain;", "autofillManager", "Lcom/goldenboot/saga/zone/BackgroundCollection;", "getDensity", "()Lcom/goldenboot/saga/zone/BackgroundCollection;", "density", "Lcom/goldenboot/saga/zone/SlotChunk;", "getTextInputService", "()Lcom/goldenboot/saga/zone/SlotChunk;", "textInputService", "Lcom/goldenboot/saga/zone/JoystickCheckpoint;", "getSoftwareKeyboardController", "()Lcom/goldenboot/saga/zone/JoystickCheckpoint;", "softwareKeyboardController", "Lcom/goldenboot/saga/zone/DrawerCycle;", "getPointerIconService", "()Lcom/goldenboot/saga/zone/DrawerCycle;", "pointerIconService", "Lcom/goldenboot/saga/zone/ResponseMeter;", "getSemanticsOwner", "()Lcom/goldenboot/saga/zone/ResponseMeter;", "semanticsOwner", "Lcom/goldenboot/saga/zone/ScopeStore;", "getFocusOwner", "()Lcom/goldenboot/saga/zone/ScopeStore;", "focusOwner", "Lcom/goldenboot/saga/zone/SelectionQueue;", "getWindowInfo", "()Lcom/goldenboot/saga/zone/SelectionQueue;", "windowInfo", "Lcom/goldenboot/saga/zone/BackgroundRing;", "getRectManager", "()Lcom/goldenboot/saga/zone/BackgroundRing;", "rectManager", "Lcom/goldenboot/saga/zone/FeatureConverter$BounceHandler;", "getFontFamilyResolver", "()Lcom/goldenboot/saga/zone/FeatureConverter$BounceHandler;", "fontFamilyResolver", "Lcom/goldenboot/saga/zone/LabelCache;", "getLayoutDirection", "()Lcom/goldenboot/saga/zone/LabelCache;", "layoutDirection", "value", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "showLayoutBounds", "", "getMeasureIteration", "()J", "measureIteration", "Lcom/goldenboot/saga/zone/InitMerger;", "getViewConfiguration", "()Lcom/goldenboot/saga/zone/InitMerger;", "viewConfiguration", "Lcom/goldenboot/saga/zone/ProxyInitializer;", "getSnapshotObserver", "()Lcom/goldenboot/saga/zone/ProxyInitializer;", "snapshotObserver", "Lcom/goldenboot/saga/zone/RowNegotiator;", "getModifierLocalManager", "()Lcom/goldenboot/saga/zone/RowNegotiator;", "modifierLocalManager", "Lcom/goldenboot/saga/zone/LongPressGateway;", "getCoroutineContext", "()Lcom/goldenboot/saga/zone/LongPressGateway;", "coroutineContext", "Landroidx/compose/ui/layout/GradientActivator$ActivityMutator;", "getPlacementScope", "()Landroidx/compose/ui/layout/GradientActivator$ActivityMutator;", "placementScope", "Lcom/goldenboot/saga/zone/MenuMolder;", "getDragAndDropManager", "()Lcom/goldenboot/saga/zone/MenuMolder;", "dragAndDropManager", "Lcom/goldenboot/saga/zone/WidgetPhase;", "getOutOfFrameExecutor", "()Lcom/goldenboot/saga/zone/WidgetPhase;", "outOfFrameExecutor", "peekRevision", "ActivityMutator", "BounceHandler", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CarouselHelper extends DrawableDelegate {

    /* renamed from: peekRevision, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.evictLayout;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\u0005\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/goldenboot/saga/zone/CarouselHelper$ActivityMutator;", "", "<init>", "()V", "", "growPayload", "Z", "evictLayout", "()Z", "(Z)V", "enableExtraAssertions", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.CarouselHelper$ActivityMutator, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion evictLayout = new Companion();

        /* renamed from: growPayload, reason: from kotlin metadata */
        private static boolean enableExtraAssertions;

        private Companion() {
        }

        public final boolean evictLayout() {
            return enableExtraAssertions;
        }

        public final void growPayload(boolean z) {
            enableExtraAssertions = z;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/goldenboot/saga/zone/CarouselHelper$BounceHandler;", "", "Lcom/goldenboot/saga/zone/DpadBuilder;", "clipOrigin", "()V", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface BounceHandler {
        void clipOrigin();
    }

    static /* synthetic */ void cancelArchive(CarouselHelper carouselHelper, ContentRepository contentRepository, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        carouselHelper.packPackage(contentRepository, z);
    }

    static /* synthetic */ void dispatchTimezone(CarouselHelper carouselHelper, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        carouselHelper.evictLayout(z);
    }

    static /* synthetic */ void mergeLocale(CarouselHelper carouselHelper, ContentRepository contentRepository, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        carouselHelper.startResource(contentRepository, z, z2);
    }

    static /* synthetic */ void syncScope(CarouselHelper carouselHelper, ContentRepository contentRepository, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = true;
        }
        carouselHelper.flushSample(contentRepository, z, z2, z3);
    }

    static /* synthetic */ ShapeAssembler updateTimer(CarouselHelper carouselHelper, IconExporter iconExporter, ElevationNode elevationNode, BottomBarEvaluator bottomBarEvaluator, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLayer");
        }
        if ((i & 4) != 0) {
            bottomBarEvaluator = null;
        }
        return carouselHelper.gatherAdapter(iconExporter, elevationNode, bottomBarEvaluator);
    }

    long applyTask(long localPosition);

    void attachCallback();

    void attachConfig(ContentRepository node);

    void connectComponent(BounceHandler listener);

    void connectPatch(View view);

    void drawField(ContentRepository node);

    void drawScope(ContentRepository node);

    void evictLayout(boolean sendPointerUpdate);

    void findTask(ElevationNode listener);

    void flattenPackage(ContentRepository layoutNode);

    void flushSample(ContentRepository layoutNode, boolean affectsLookahead, boolean forceRequest, boolean scheduleMeasureAndLayout);

    ShapeAssembler gatherAdapter(IconExporter drawBlock, ElevationNode invalidateParentLayer, BottomBarEvaluator explicitLayer);

    LifecycleMulticaster getAccessibilityManager();

    ObserverPresenter getAutofill();

    ContentChain getAutofillManager();

    PlatformBeacon getAutofillTree();

    PointerImpl getClipboard();

    ServerRollback getClipboardManager();

    LongPressGateway getCoroutineContext();

    BackgroundCollection getDensity();

    MenuMolder getDragAndDropManager();

    ScopeStore getFocusOwner();

    FeatureConverter.BounceHandler getFontFamilyResolver();

    AlarmHook.BounceHandler getFontLoader();

    LayerBenchmark getGraphicsContext();

    PluginProcess getHapticFeedBack();

    PaddingCounter getInputModeManager();

    LabelCache getLayoutDirection();

    FramePresenter getLayoutNodes();

    long getMeasureIteration();

    RowNegotiator getModifierLocalManager();

    default WidgetPhase getOutOfFrameExecutor() {
        return null;
    }

    default GradientActivator.ActivityMutator getPlacementScope() {
        return androidx.compose.ui.layout.LongPressPipe.growPayload(this);
    }

    DrawerCycle getPointerIconService();

    BackgroundRing getRectManager();

    ContentRepository getRoot();

    EndpointWriter getRootForTest();

    ResponseMeter getSemanticsOwner();

    AlphaFacilitator getSharedDrawScope();

    boolean getShowLayoutBounds();

    ProxyInitializer getSnapshotObserver();

    JoystickCheckpoint getSoftwareKeyboardController();

    SlotChunk getTextInputService();

    SpringVersion getTextToolbar();

    InitMerger getViewConfiguration();

    SelectionQueue getWindowInfo();

    void groupArchive(ContentRepository layoutNode);

    void inflateEdge(ContentRepository layoutNode);

    void mapJob();

    void notifyMessage(ContentRepository node);

    void packPackage(ContentRepository layoutNode, boolean affectsLookahead);

    long popBlueprint(long positionInWindow);

    Object resetValue(IconExporter iconExporter, ServiceRegulator serviceRegulator);

    void setShowLayoutBounds(boolean z);

    void startResource(ContentRepository layoutNode, boolean affectsLookahead, boolean forceRequest);

    void storeCharset(ContentRepository layoutNode, long constraints);

    @ReceiverAdministrator
    static /* synthetic */ void getFontLoader$annotations() {
    }

    default void connectJob() {
    }

    default void purgeNode() {
    }

    default void releaseHeader() {
    }

    default void resolveDelta() {
    }

    default void decodePath(long delta) {
    }

    default void reduceScope(float frameRate) {
    }

    default void prepareTask(ContentRepository layoutNode, int oldSemanticsId) {
    }

    default void serializeOffset(ContentRepository layoutNode, int oldSemanticsId) {
    }
}
