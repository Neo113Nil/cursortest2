package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.ContainerSource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0002\u008e\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJG\u0010\u0017\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018JE\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJg\u0010%\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b%\u0010&Ji\u0010'\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u00020\u0019*\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b)\u0010*J]\u0010/\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b/\u00100J]\u00101\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b1\u00102JK\u00106\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b6\u00107JK\u00108\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b8\u00109JC\u0010<\u001a\u00020.2\u0006\u0010;\u001a\u00020:2\u0006\u00103\u001a\u00020+2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b<\u0010=J[\u0010D\u001a\u00020.2\u0006\u0010;\u001a\u00020:2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020>2\u0006\u0010C\u001a\u00020@2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\bD\u0010EJc\u0010F\u001a\u00020.2\u0006\u0010;\u001a\u00020:2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020>2\u0006\u0010C\u001a\u00020@2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\bF\u0010GJS\u0010J\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\u0006\u0010I\u001a\u00020H2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\bJ\u0010KJS\u0010L\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\u0006\u0010I\u001a\u00020H2\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\bL\u0010MJK\u0010P\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010N\u001a\u00020\u000f2\u0006\u0010O\u001a\u00020+2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\bP\u0010QJK\u0010R\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010N\u001a\u00020\u000f2\u0006\u0010O\u001a\u00020+2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\bR\u0010SJK\u0010T\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\bT\u00107JK\u0010U\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\bU\u00109Jc\u0010Z\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010V\u001a\u00020\u000f2\u0006\u0010W\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020X2\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\bZ\u0010[Jc\u0010\\\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010V\u001a\u00020\u000f2\u0006\u0010W\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020X2\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\\\u0010]JC\u0010`\u001a\u00020.2\u0006\u0010_\u001a\u00020^2\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b`\u0010aJC\u0010b\u001a\u00020.2\u0006\u0010_\u001a\u00020^2\u0006\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\bb\u0010cJc\u0010h\u001a\u00020.2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020+0d2\u0006\u0010g\u001a\u00020f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\bh\u0010iJc\u0010j\u001a\u00020.2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020+0d2\u0006\u0010g\u001a\u00020f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\bj\u0010kJD\u0010t\u001a\u00020.2\u0006\u0010m\u001a\u00020l2\u0006\u0010o\u001a\u00020n2\u0006\u0010q\u001a\u00020p2\u0006\u00105\u001a\u0002042\u0012\u0010s\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020.0rH\u0086\b¢\u0006\u0004\bt\u0010uR \u0010|\u001a\u00020v8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bw\u0010x\u0012\u0004\b{\u0010\u0003\u001a\u0004\by\u0010zR\u001d\u0010\u0082\u0001\u001a\u00020}8\u0016X\u0096\u0004¢\u0006\u000e\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001b\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001b\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0084\u0001R\u0016\u0010o\u001a\u00020n8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0016\u0010m\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0017\u0010\u008d\u0001\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008b\u0001¨\u0006\u008f\u0001"}, d2 = {"Lcom/goldenboot/saga/zone/SlideDrain;", "Lcom/goldenboot/saga/zone/StepperAdministrator;", "<init>", "()V", "Lcom/goldenboot/saga/zone/ScopedProcess;", "emitStrategy", "()Lcom/goldenboot/saga/zone/ScopedProcess;", "handleFooter", "Lcom/goldenboot/saga/zone/JoystickUseCase;", "drawStyle", "compressVersion", "(Lcom/goldenboot/saga/zone/JoystickUseCase;)Lcom/goldenboot/saga/zone/ScopedProcess;", "Lcom/goldenboot/saga/zone/LayerTunnel;", "brush", "style", "", "alpha", "Landroidx/compose/ui/graphics/LayerUseCase;", "colorFilter", "Landroidx/compose/ui/graphics/FeedbackFlow;", "blendMode", "Lcom/goldenboot/saga/zone/ScopedBroadcaster;", "filterQuality", "storeCharset", "(Lcom/goldenboot/saga/zone/LayerTunnel;Lcom/goldenboot/saga/zone/JoystickUseCase;FLandroidx/compose/ui/graphics/LayerUseCase;II)Lcom/goldenboot/saga/zone/ScopedProcess;", "Lcom/goldenboot/saga/zone/ContainerSource;", "color", "popBlueprint", "(JLcom/goldenboot/saga/zone/JoystickUseCase;FLandroidx/compose/ui/graphics/LayerUseCase;II)Lcom/goldenboot/saga/zone/ScopedProcess;", "strokeWidth", "miter", "Lcom/goldenboot/saga/zone/ListMulticaster;", "cap", "Lcom/goldenboot/saga/zone/RotateFacilitator;", "join", "Lcom/goldenboot/saga/zone/ListenerStage;", "pathEffect", "unlockMessage", "(JFFIILcom/goldenboot/saga/zone/ListenerStage;FLandroidx/compose/ui/graphics/LayerUseCase;II)Lcom/goldenboot/saga/zone/ScopedProcess;", "parseAsset", "(Lcom/goldenboot/saga/zone/LayerTunnel;FFIILcom/goldenboot/saga/zone/ListenerStage;FLandroidx/compose/ui/graphics/LayerUseCase;II)Lcom/goldenboot/saga/zone/ScopedProcess;", "resumeSignature", "(JF)J", "Lcom/goldenboot/saga/zone/RuntimeHeap;", "start", "end", "Lcom/goldenboot/saga/zone/DpadBuilder;", "scatterPayload", "(Lcom/goldenboot/saga/zone/LayerTunnel;JJFILcom/goldenboot/saga/zone/ListenerStage;FLandroidx/compose/ui/graphics/LayerUseCase;I)V", "growCallback", "(JJJFILcom/goldenboot/saga/zone/ListenerStage;FLandroidx/compose/ui/graphics/LayerUseCase;I)V", "topLeft", "Lcom/goldenboot/saga/zone/ShapeSender;", "size", "drawDelta", "(Lcom/goldenboot/saga/zone/LayerTunnel;JJFLcom/goldenboot/saga/zone/JoystickUseCase;Landroidx/compose/ui/graphics/LayerUseCase;I)V", "abortBinding", "(JJJFLcom/goldenboot/saga/zone/JoystickUseCase;Landroidx/compose/ui/graphics/LayerUseCase;I)V", "Lcom/goldenboot/saga/zone/ContextStage;", "image", "protectGauge", "(Lcom/goldenboot/saga/zone/ContextStage;JFLcom/goldenboot/saga/zone/JoystickUseCase;Landroidx/compose/ui/graphics/LayerUseCase;I)V", "Lcom/goldenboot/saga/zone/FontReporter;", "srcOffset", "Lcom/goldenboot/saga/zone/ScaleSaver;", "srcSize", "dstOffset", "dstSize", "gatherCurrency", "(Lcom/goldenboot/saga/zone/ContextStage;JJJJFLcom/goldenboot/saga/zone/JoystickUseCase;Landroidx/compose/ui/graphics/LayerUseCase;I)V", "abortTarget", "(Lcom/goldenboot/saga/zone/ContextStage;JJJJFLcom/goldenboot/saga/zone/JoystickUseCase;Landroidx/compose/ui/graphics/LayerUseCase;II)V", "Lcom/goldenboot/saga/zone/RowIndex;", "cornerRadius", "shrinkSettings", "(Lcom/goldenboot/saga/zone/LayerTunnel;JJJFLcom/goldenboot/saga/zone/JoystickUseCase;Landroidx/compose/ui/graphics/LayerUseCase;I)V", "unpackResult", "(JJJJLcom/goldenboot/saga/zone/JoystickUseCase;FLandroidx/compose/ui/graphics/LayerUseCase;I)V", "radius", "center", "initItem", "(Lcom/goldenboot/saga/zone/LayerTunnel;FJFLcom/goldenboot/saga/zone/JoystickUseCase;Landroidx/compose/ui/graphics/LayerUseCase;I)V", "filterTimer", "(JFJFLcom/goldenboot/saga/zone/JoystickUseCase;Landroidx/compose/ui/graphics/LayerUseCase;I)V", "commitConfig", "growStream", "startAngle", "sweepAngle", "", "useCenter", "popContext", "(Lcom/goldenboot/saga/zone/LayerTunnel;FFZJJFLcom/goldenboot/saga/zone/JoystickUseCase;Landroidx/compose/ui/graphics/LayerUseCase;I)V", "removeFormat", "(JFFZJJFLcom/goldenboot/saga/zone/JoystickUseCase;Landroidx/compose/ui/graphics/LayerUseCase;I)V", "Lcom/goldenboot/saga/zone/ServiceFetcher;", "path", "escapeItem", "(Lcom/goldenboot/saga/zone/ServiceFetcher;JFLcom/goldenboot/saga/zone/JoystickUseCase;Landroidx/compose/ui/graphics/LayerUseCase;I)V", "subscribeEvent", "(Lcom/goldenboot/saga/zone/ServiceFetcher;Lcom/goldenboot/saga/zone/LayerTunnel;FLcom/goldenboot/saga/zone/JoystickUseCase;Landroidx/compose/ui/graphics/LayerUseCase;I)V", "", "points", "Lcom/goldenboot/saga/zone/TypographyTrigger;", "pointMode", "transformSignal", "(Ljava/util/List;IJFILcom/goldenboot/saga/zone/ListenerStage;FLandroidx/compose/ui/graphics/LayerUseCase;I)V", "saveTimezone", "(Ljava/util/List;ILcom/goldenboot/saga/zone/LayerTunnel;FILcom/goldenboot/saga/zone/ListenerStage;FLandroidx/compose/ui/graphics/LayerUseCase;I)V", "Lcom/goldenboot/saga/zone/BackgroundCollection;", "density", "Lcom/goldenboot/saga/zone/LabelCache;", "layoutDirection", "Lcom/goldenboot/saga/zone/PulseCounter;", "canvas", "Lkotlin/Function1;", "block", "updateAction", "(Lcom/goldenboot/saga/zone/BackgroundCollection;Lcom/goldenboot/saga/zone/LabelCache;Lcom/goldenboot/saga/zone/PulseCounter;JLcom/goldenboot/saga/zone/TouchRecord;)V", "Lcom/goldenboot/saga/zone/SlideDrain$ActivityMutator;", "reduceScope", "Lcom/goldenboot/saga/zone/SlideDrain$ActivityMutator;", "connectComponent", "()Lcom/goldenboot/saga/zone/SlideDrain$ActivityMutator;", "startResource", "drawParams", "Lcom/goldenboot/saga/zone/WaveDrain;", "notifyMessage", "Lcom/goldenboot/saga/zone/WaveDrain;", "pollBuffer", "()Lcom/goldenboot/saga/zone/WaveDrain;", "drawContext", "connectPatch", "Lcom/goldenboot/saga/zone/ScopedProcess;", "fillPaint", "attachConfig", "strokePaint", "getLayoutDirection", "()Lcom/goldenboot/saga/zone/LabelCache;", "getDensity", "()F", "formatPosition", "fontScale", "ActivityMutator", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SlideDrain implements StepperAdministrator {

    /* renamed from: attachConfig, reason: from kotlin metadata */
    private ScopedProcess strokePaint;

    /* renamed from: connectPatch, reason: from kotlin metadata */
    private ScopedProcess fillPaint;

    /* renamed from: reduceScope, reason: from kotlin metadata */
    private final DrawParams drawParams = new DrawParams(null, null, null, 0, 15, null);

    /* renamed from: notifyMessage, reason: from kotlin metadata */
    private final WaveDrain drawContext = new BounceHandler();

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\r\"\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010\u000f\"\u0004\b&\u0010'R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010(\u001a\u0004\b)\u0010\u0011\"\u0004\b*\u0010+R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010,\u001a\u0004\b-\u0010\u0013\"\u0004\b.\u0010/¨\u00060"}, d2 = {"Lcom/goldenboot/saga/zone/SlideDrain$ActivityMutator;", "", "Lcom/goldenboot/saga/zone/BackgroundCollection;", "density", "Lcom/goldenboot/saga/zone/LabelCache;", "layoutDirection", "Lcom/goldenboot/saga/zone/PulseCounter;", "canvas", "Lcom/goldenboot/saga/zone/ShapeSender;", "size", "<init>", "(Lcom/goldenboot/saga/zone/BackgroundCollection;Lcom/goldenboot/saga/zone/LabelCache;Lcom/goldenboot/saga/zone/PulseCounter;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "evictLayout", "()Lcom/goldenboot/saga/zone/BackgroundCollection;", "growPayload", "()Lcom/goldenboot/saga/zone/LabelCache;", "injectMetric", "()Lcom/goldenboot/saga/zone/PulseCounter;", "detachStream", "()J", "releaseHeader", "(Lcom/goldenboot/saga/zone/BackgroundCollection;Lcom/goldenboot/saga/zone/LabelCache;Lcom/goldenboot/saga/zone/PulseCounter;J)Lcom/goldenboot/saga/zone/SlideDrain$ActivityMutator;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/goldenboot/saga/zone/BackgroundCollection;", "updateTimer", "connectJob", "(Lcom/goldenboot/saga/zone/BackgroundCollection;)V", "Lcom/goldenboot/saga/zone/LabelCache;", "applyTask", "peekRevision", "(Lcom/goldenboot/saga/zone/LabelCache;)V", "Lcom/goldenboot/saga/zone/PulseCounter;", "flushSample", "drawField", "(Lcom/goldenboot/saga/zone/PulseCounter;)V", "J", "popBlueprint", "serializeOffset", "(J)V", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.SlideDrain$ActivityMutator, reason: from toString */
    public static final /* data */ class DrawParams {

        /* renamed from: detachStream, reason: from kotlin metadata and from toString */
        private long size;

        /* renamed from: evictLayout, reason: from kotlin metadata and from toString */
        private BackgroundCollection density;

        /* renamed from: growPayload, reason: from kotlin metadata and from toString */
        private LabelCache layoutDirection;

        /* renamed from: injectMetric, reason: from kotlin metadata and from toString */
        private PulseCounter canvas;

        public /* synthetic */ DrawParams(BackgroundCollection backgroundCollection, LabelCache labelCache, PulseCounter pulseCounter, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(backgroundCollection, labelCache, pulseCounter, j);
        }

        public static /* synthetic */ DrawParams clipOrigin(DrawParams drawParams, BackgroundCollection backgroundCollection, LabelCache labelCache, PulseCounter pulseCounter, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                backgroundCollection = drawParams.density;
            }
            if ((i & 2) != 0) {
                labelCache = drawParams.layoutDirection;
            }
            if ((i & 4) != 0) {
                pulseCounter = drawParams.canvas;
            }
            if ((i & 8) != 0) {
                j = drawParams.size;
            }
            PulseCounter pulseCounter2 = pulseCounter;
            return drawParams.releaseHeader(backgroundCollection, labelCache, pulseCounter2, j);
        }

        /* renamed from: applyTask, reason: from getter */
        public final LabelCache getLayoutDirection() {
            return this.layoutDirection;
        }

        public final void connectJob(BackgroundCollection backgroundCollection) {
            this.density = backgroundCollection;
        }

        /* renamed from: detachStream, reason: from getter */
        public final long getSize() {
            return this.size;
        }

        public final void drawField(PulseCounter pulseCounter) {
            this.canvas = pulseCounter;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DrawParams)) {
                return false;
            }
            DrawParams drawParams = (DrawParams) other;
            return Intrinsics.areEqual(this.density, drawParams.density) && this.layoutDirection == drawParams.layoutDirection && Intrinsics.areEqual(this.canvas, drawParams.canvas) && ShapeSender.drawField(this.size, drawParams.size);
        }

        /* renamed from: evictLayout, reason: from getter */
        public final BackgroundCollection getDensity() {
            return this.density;
        }

        /* renamed from: flushSample, reason: from getter */
        public final PulseCounter getCanvas() {
            return this.canvas;
        }

        public final LabelCache growPayload() {
            return this.layoutDirection;
        }

        public int hashCode() {
            return (((((this.density.hashCode() * 31) + this.layoutDirection.hashCode()) * 31) + this.canvas.hashCode()) * 31) + ShapeSender.purgeNode(this.size);
        }

        public final PulseCounter injectMetric() {
            return this.canvas;
        }

        public final void peekRevision(LabelCache labelCache) {
            this.layoutDirection = labelCache;
        }

        public final long popBlueprint() {
            return this.size;
        }

        public final DrawParams releaseHeader(BackgroundCollection density, LabelCache layoutDirection, PulseCounter canvas, long size) {
            return new DrawParams(density, layoutDirection, canvas, size, null);
        }

        public final void serializeOffset(long j) {
            this.size = j;
        }

        public String toString() {
            return "DrawParams(density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", canvas=" + this.canvas + ", size=" + ((Object) ShapeSender.decodePath(this.size)) + ')';
        }

        public final BackgroundCollection updateTimer() {
            return this.density;
        }

        private DrawParams(BackgroundCollection backgroundCollection, LabelCache labelCache, PulseCounter pulseCounter, long j) {
            this.density = backgroundCollection;
            this.layoutDirection = labelCache;
            this.canvas = pulseCounter;
            this.size = j;
        }

        public /* synthetic */ DrawParams(BackgroundCollection backgroundCollection, LabelCache labelCache, PulseCounter pulseCounter, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? PublisherFabricator.evictLayout() : backgroundCollection, (i & 2) != 0 ? LabelCache.reduceScope : labelCache, (i & 4) != 0 ? AccentScanner.evictLayout : pulseCounter, (i & 8) != 0 ? ShapeSender.INSTANCE.injectMetric() : j, null);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0003\u0010\u0014R$\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010 \u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u001c8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\t\u0010\u001fR$\u0010&\u001a\u00020!2\u0006\u0010\u0011\u001a\u00020!8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, d2 = {"com/goldenboot/saga/zone/SlideDrain$BounceHandler", "Lcom/goldenboot/saga/zone/WaveDrain;", "Lcom/goldenboot/saga/zone/ToolbarSampler;", "evictLayout", "Lcom/goldenboot/saga/zone/ToolbarSampler;", "clipOrigin", "()Lcom/goldenboot/saga/zone/ToolbarSampler;", "transform", "Lcom/goldenboot/saga/zone/BottomBarEvaluator;", "growPayload", "Lcom/goldenboot/saga/zone/BottomBarEvaluator;", "updateTimer", "()Lcom/goldenboot/saga/zone/BottomBarEvaluator;", "detachStream", "(Lcom/goldenboot/saga/zone/BottomBarEvaluator;)V", "graphicsLayer", "Lcom/goldenboot/saga/zone/PulseCounter;", "value", "applyTask", "()Lcom/goldenboot/saga/zone/PulseCounter;", "(Lcom/goldenboot/saga/zone/PulseCounter;)V", "canvas", "Lcom/goldenboot/saga/zone/ShapeSender;", "releaseHeader", "()J", "flushSample", "(J)V", "size", "Lcom/goldenboot/saga/zone/LabelCache;", "getLayoutDirection", "()Lcom/goldenboot/saga/zone/LabelCache;", "(Lcom/goldenboot/saga/zone/LabelCache;)V", "layoutDirection", "Lcom/goldenboot/saga/zone/BackgroundCollection;", "getDensity", "()Lcom/goldenboot/saga/zone/BackgroundCollection;", "injectMetric", "(Lcom/goldenboot/saga/zone/BackgroundCollection;)V", "density", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BounceHandler implements WaveDrain {

        /* renamed from: evictLayout, reason: from kotlin metadata */
        private final ToolbarSampler transform;

        /* renamed from: growPayload, reason: from kotlin metadata */
        private BottomBarEvaluator graphicsLayer;

        public BounceHandler() {
            ToolbarSampler growPayload;
            growPayload = BackgroundSpawner.growPayload(this);
            this.transform = growPayload;
        }

        @Override // com.goldenboot.saga.zone.WaveDrain
        public PulseCounter applyTask() {
            return SlideDrain.this.getDrawParams().getCanvas();
        }

        @Override // com.goldenboot.saga.zone.WaveDrain
        /* renamed from: clipOrigin, reason: from getter */
        public ToolbarSampler getTransform() {
            return this.transform;
        }

        @Override // com.goldenboot.saga.zone.WaveDrain
        public void detachStream(BottomBarEvaluator bottomBarEvaluator) {
            this.graphicsLayer = bottomBarEvaluator;
        }

        @Override // com.goldenboot.saga.zone.WaveDrain
        public void evictLayout(PulseCounter pulseCounter) {
            SlideDrain.this.getDrawParams().drawField(pulseCounter);
        }

        @Override // com.goldenboot.saga.zone.WaveDrain
        public void flushSample(long j) {
            SlideDrain.this.getDrawParams().serializeOffset(j);
        }

        @Override // com.goldenboot.saga.zone.WaveDrain
        public BackgroundCollection getDensity() {
            return SlideDrain.this.getDrawParams().updateTimer();
        }

        @Override // com.goldenboot.saga.zone.WaveDrain
        public LabelCache getLayoutDirection() {
            return SlideDrain.this.getDrawParams().getLayoutDirection();
        }

        @Override // com.goldenboot.saga.zone.WaveDrain
        public void growPayload(LabelCache labelCache) {
            SlideDrain.this.getDrawParams().peekRevision(labelCache);
        }

        @Override // com.goldenboot.saga.zone.WaveDrain
        public void injectMetric(BackgroundCollection backgroundCollection) {
            SlideDrain.this.getDrawParams().connectJob(backgroundCollection);
        }

        @Override // com.goldenboot.saga.zone.WaveDrain
        public long releaseHeader() {
            return SlideDrain.this.getDrawParams().popBlueprint();
        }

        @Override // com.goldenboot.saga.zone.WaveDrain
        /* renamed from: updateTimer, reason: from getter */
        public BottomBarEvaluator getGraphicsLayer() {
            return this.graphicsLayer;
        }
    }

    public static /* synthetic */ ScopedProcess attachCallback(SlideDrain slideDrain, LayerTunnel layerTunnel, float f, float f2, int i, int i2, ListenerStage listenerStage, float f3, androidx.compose.ui.graphics.LayerUseCase layerUseCase, int i3, int i4, int i5, Object obj) {
        return slideDrain.parseAsset(layerTunnel, f, f2, i, i2, listenerStage, f3, layerUseCase, i3, (i5 & ContentOperation.RotationY) != 0 ? StepperAdministrator.INSTANCE.growPayload() : i4);
    }

    public static /* synthetic */ ScopedProcess bindBody(SlideDrain slideDrain, long j, float f, float f2, int i, int i2, ListenerStage listenerStage, float f3, androidx.compose.ui.graphics.LayerUseCase layerUseCase, int i3, int i4, int i5, Object obj) {
        return slideDrain.unlockMessage(j, f, f2, i, i2, listenerStage, f3, layerUseCase, i3, (i5 & ContentOperation.RotationY) != 0 ? StepperAdministrator.INSTANCE.growPayload() : i4);
    }

    private final ScopedProcess compressVersion(JoystickUseCase drawStyle) {
        if (Intrinsics.areEqual(drawStyle, ConsumerMux.evictLayout)) {
            return emitStrategy();
        }
        if (!(drawStyle instanceof Stroke)) {
            throw new EndpointArchive();
        }
        ScopedProcess handleFooter = handleFooter();
        Stroke stroke = (Stroke) drawStyle;
        if (handleFooter.closePayload() != stroke.getWidth()) {
            handleFooter.normalizeBundle(stroke.getWidth());
        }
        if (!ListMulticaster.flushSample(handleFooter.transformCurrency(), stroke.getCap())) {
            handleFooter.computeTarget(stroke.getCap());
        }
        if (handleFooter.emitStrategy() != stroke.getMiter()) {
            handleFooter.protectGauge(stroke.getMiter());
        }
        if (!RotateFacilitator.flushSample(handleFooter.injectField(), stroke.getJoin())) {
            handleFooter.peekDescriptor(stroke.getJoin());
        }
        if (!Intrinsics.areEqual(handleFooter.getPathEffect(), stroke.getPathEffect())) {
            handleFooter.commitBounds(stroke.getPathEffect());
        }
        return handleFooter;
    }

    private final ScopedProcess emitStrategy() {
        ScopedProcess scopedProcess = this.fillPaint;
        if (scopedProcess != null) {
            return scopedProcess;
        }
        ScopedProcess evictLayout = ScopeHandler.evictLayout();
        evictLayout.growCallback(ItemSupervisor.INSTANCE.evictLayout());
        this.fillPaint = evictLayout;
        return evictLayout;
    }

    private final ScopedProcess handleFooter() {
        ScopedProcess scopedProcess = this.strokePaint;
        if (scopedProcess != null) {
            return scopedProcess;
        }
        ScopedProcess evictLayout = ScopeHandler.evictLayout();
        evictLayout.growCallback(ItemSupervisor.INSTANCE.growPayload());
        this.strokePaint = evictLayout;
        return evictLayout;
    }

    public static /* synthetic */ ScopedProcess injectConstraint(SlideDrain slideDrain, long j, JoystickUseCase joystickUseCase, float f, androidx.compose.ui.graphics.LayerUseCase layerUseCase, int i, int i2, int i3, Object obj) {
        return slideDrain.popBlueprint(j, joystickUseCase, f, layerUseCase, i, (i3 & 32) != 0 ? StepperAdministrator.INSTANCE.growPayload() : i2);
    }

    private final ScopedProcess parseAsset(LayerTunnel brush, float strokeWidth, float miter, int cap, int join, ListenerStage pathEffect, float alpha, androidx.compose.ui.graphics.LayerUseCase colorFilter, int blendMode, int filterQuality) {
        ScopedProcess handleFooter = handleFooter();
        if (brush != null) {
            brush.evictLayout(releaseHeader(), handleFooter, alpha);
        } else if (handleFooter.evictLayout() != alpha) {
            handleFooter.detachStream(alpha);
        }
        if (!Intrinsics.areEqual(handleFooter.getInternalColorFilter(), colorFilter)) {
            handleFooter.updateTimer(colorFilter);
        }
        if (!androidx.compose.ui.graphics.FeedbackFlow.filterPayload(handleFooter.get_blendMode(), blendMode)) {
            handleFooter.injectMetric(blendMode);
        }
        if (handleFooter.closePayload() != strokeWidth) {
            handleFooter.normalizeBundle(strokeWidth);
        }
        if (handleFooter.emitStrategy() != miter) {
            handleFooter.protectGauge(miter);
        }
        if (!ListMulticaster.flushSample(handleFooter.transformCurrency(), cap)) {
            handleFooter.computeTarget(cap);
        }
        if (!RotateFacilitator.flushSample(handleFooter.injectField(), join)) {
            handleFooter.peekDescriptor(join);
        }
        if (!Intrinsics.areEqual(handleFooter.getPathEffect(), pathEffect)) {
            handleFooter.commitBounds(pathEffect);
        }
        if (!ScopedBroadcaster.updateTimer(handleFooter.compressVersion(), filterQuality)) {
            handleFooter.refreshCounter(filterQuality);
        }
        return handleFooter;
    }

    private final ScopedProcess popBlueprint(long color, JoystickUseCase style, float alpha, androidx.compose.ui.graphics.LayerUseCase colorFilter, int blendMode, int filterQuality) {
        ScopedProcess compressVersion = compressVersion(style);
        long resumeSignature = resumeSignature(color, alpha);
        if (!ContainerSource.drawScope(compressVersion.connectJob(), resumeSignature)) {
            compressVersion.serializeTask(resumeSignature);
        }
        if (compressVersion.getInternalShader() != null) {
            compressVersion.purgeMetric(null);
        }
        if (!Intrinsics.areEqual(compressVersion.getInternalColorFilter(), colorFilter)) {
            compressVersion.updateTimer(colorFilter);
        }
        if (!androidx.compose.ui.graphics.FeedbackFlow.filterPayload(compressVersion.get_blendMode(), blendMode)) {
            compressVersion.injectMetric(blendMode);
        }
        if (!ScopedBroadcaster.updateTimer(compressVersion.compressVersion(), filterQuality)) {
            compressVersion.refreshCounter(filterQuality);
        }
        return compressVersion;
    }

    public static /* synthetic */ ScopedProcess queryModel(SlideDrain slideDrain, LayerTunnel layerTunnel, JoystickUseCase joystickUseCase, float f, androidx.compose.ui.graphics.LayerUseCase layerUseCase, int i, int i2, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            i2 = StepperAdministrator.INSTANCE.growPayload();
        }
        return slideDrain.storeCharset(layerTunnel, joystickUseCase, f, layerUseCase, i, i2);
    }

    private final long resumeSignature(long j, float f) {
        return f == 1.0f ? j : ContainerSource.gatherAdapter(j, ContainerSource.findTask(j) * f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    private final ScopedProcess storeCharset(LayerTunnel brush, JoystickUseCase style, float alpha, androidx.compose.ui.graphics.LayerUseCase colorFilter, int blendMode, int filterQuality) {
        ScopedProcess compressVersion = compressVersion(style);
        if (brush != null) {
            brush.evictLayout(releaseHeader(), compressVersion, alpha);
        } else {
            if (compressVersion.getInternalShader() != null) {
                compressVersion.purgeMetric(null);
            }
            long connectJob = compressVersion.connectJob();
            ContainerSource.Companion companion = ContainerSource.INSTANCE;
            if (!ContainerSource.drawScope(connectJob, companion.evictLayout())) {
                compressVersion.serializeTask(companion.evictLayout());
            }
            if (compressVersion.evictLayout() != alpha) {
                compressVersion.detachStream(alpha);
            }
        }
        if (!Intrinsics.areEqual(compressVersion.getInternalColorFilter(), colorFilter)) {
            compressVersion.updateTimer(colorFilter);
        }
        if (!androidx.compose.ui.graphics.FeedbackFlow.filterPayload(compressVersion.get_blendMode(), blendMode)) {
            compressVersion.injectMetric(blendMode);
        }
        if (!ScopedBroadcaster.updateTimer(compressVersion.compressVersion(), filterQuality)) {
            compressVersion.refreshCounter(filterQuality);
        }
        return compressVersion;
    }

    private final ScopedProcess unlockMessage(long color, float strokeWidth, float miter, int cap, int join, ListenerStage pathEffect, float alpha, androidx.compose.ui.graphics.LayerUseCase colorFilter, int blendMode, int filterQuality) {
        ScopedProcess handleFooter = handleFooter();
        long resumeSignature = resumeSignature(color, alpha);
        if (!ContainerSource.drawScope(handleFooter.connectJob(), resumeSignature)) {
            handleFooter.serializeTask(resumeSignature);
        }
        if (handleFooter.getInternalShader() != null) {
            handleFooter.purgeMetric(null);
        }
        if (!Intrinsics.areEqual(handleFooter.getInternalColorFilter(), colorFilter)) {
            handleFooter.updateTimer(colorFilter);
        }
        if (!androidx.compose.ui.graphics.FeedbackFlow.filterPayload(handleFooter.get_blendMode(), blendMode)) {
            handleFooter.injectMetric(blendMode);
        }
        if (handleFooter.closePayload() != strokeWidth) {
            handleFooter.normalizeBundle(strokeWidth);
        }
        if (handleFooter.emitStrategy() != miter) {
            handleFooter.protectGauge(miter);
        }
        if (!ListMulticaster.flushSample(handleFooter.transformCurrency(), cap)) {
            handleFooter.computeTarget(cap);
        }
        if (!RotateFacilitator.flushSample(handleFooter.injectField(), join)) {
            handleFooter.peekDescriptor(join);
        }
        if (!Intrinsics.areEqual(handleFooter.getPathEffect(), pathEffect)) {
            handleFooter.commitBounds(pathEffect);
        }
        if (!ScopedBroadcaster.updateTimer(handleFooter.compressVersion(), filterQuality)) {
            handleFooter.refreshCounter(filterQuality);
        }
        return handleFooter;
    }

    @Override // com.goldenboot.saga.zone.StepperAdministrator
    public void abortBinding(long color, long topLeft, long size, float alpha, JoystickUseCase style, androidx.compose.ui.graphics.LayerUseCase colorFilter, int blendMode) {
        int i = (int) (topLeft >> 32);
        int i2 = (int) (topLeft & 4294967295L);
        this.drawParams.getCanvas().decodePath(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (size >> 32)), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (size & 4294967295L)), injectConstraint(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // com.goldenboot.saga.zone.StepperAdministrator
    public void abortTarget(ContextStage image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, JoystickUseCase style, androidx.compose.ui.graphics.LayerUseCase colorFilter, int blendMode, int filterQuality) {
        this.drawParams.getCanvas().popBlueprint(image, srcOffset, srcSize, dstOffset, dstSize, storeCharset(null, style, alpha, colorFilter, blendMode, filterQuality));
    }

    @Override // com.goldenboot.saga.zone.StepperAdministrator
    public void commitConfig(LayerTunnel brush, long topLeft, long size, float alpha, JoystickUseCase style, androidx.compose.ui.graphics.LayerUseCase colorFilter, int blendMode) {
        int i = (int) (topLeft >> 32);
        int i2 = (int) (topLeft & 4294967295L);
        this.drawParams.getCanvas().parseAsset(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (size >> 32)), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (size & 4294967295L)), queryModel(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    /* renamed from: connectComponent, reason: from getter */
    public final DrawParams getDrawParams() {
        return this.drawParams;
    }

    @Override // com.goldenboot.saga.zone.StepperAdministrator
    public void drawDelta(LayerTunnel brush, long topLeft, long size, float alpha, JoystickUseCase style, androidx.compose.ui.graphics.LayerUseCase colorFilter, int blendMode) {
        int i = (int) (topLeft >> 32);
        int i2 = (int) (topLeft & 4294967295L);
        this.drawParams.getCanvas().decodePath(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (size >> 32)), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (size & 4294967295L)), queryModel(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // com.goldenboot.saga.zone.StepperAdministrator
    public void escapeItem(ServiceFetcher path, long color, float alpha, JoystickUseCase style, androidx.compose.ui.graphics.LayerUseCase colorFilter, int blendMode) {
        this.drawParams.getCanvas().mergeLocale(path, injectConstraint(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // com.goldenboot.saga.zone.StepperAdministrator
    public void filterTimer(long color, float radius, long center, float alpha, JoystickUseCase style, androidx.compose.ui.graphics.LayerUseCase colorFilter, int blendMode) {
        this.drawParams.getCanvas().unlockMessage(center, radius, injectConstraint(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // com.goldenboot.saga.zone.SequenceFacilitator
    /* renamed from: formatPosition */
    public float getFontScale() {
        return this.drawParams.updateTimer().getFontScale();
    }

    @Override // com.goldenboot.saga.zone.StepperAdministrator
    @ReceiverAdministrator
    public /* synthetic */ void gatherCurrency(ContextStage image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, JoystickUseCase style, androidx.compose.ui.graphics.LayerUseCase colorFilter, int blendMode) {
        this.drawParams.getCanvas().popBlueprint(image, srcOffset, srcSize, dstOffset, dstSize, queryModel(this, null, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // com.goldenboot.saga.zone.BackgroundCollection
    public float getDensity() {
        return this.drawParams.updateTimer().getDensity();
    }

    @Override // com.goldenboot.saga.zone.StepperAdministrator
    public LabelCache getLayoutDirection() {
        return this.drawParams.getLayoutDirection();
    }

    @Override // com.goldenboot.saga.zone.StepperAdministrator
    public void growCallback(long color, long start, long end, float strokeWidth, int cap, ListenerStage pathEffect, float alpha, androidx.compose.ui.graphics.LayerUseCase colorFilter, int blendMode) {
        this.drawParams.getCanvas().syncScope(start, end, bindBody(this, color, strokeWidth, 4.0f, cap, RotateFacilitator.INSTANCE.growPayload(), pathEffect, alpha, colorFilter, blendMode, 0, ContentOperation.RotationY, null));
    }

    @Override // com.goldenboot.saga.zone.StepperAdministrator
    public void growStream(long color, long topLeft, long size, float alpha, JoystickUseCase style, androidx.compose.ui.graphics.LayerUseCase colorFilter, int blendMode) {
        int i = (int) (topLeft >> 32);
        int i2 = (int) (topLeft & 4294967295L);
        this.drawParams.getCanvas().parseAsset(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (size >> 32)), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (size & 4294967295L)), injectConstraint(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // com.goldenboot.saga.zone.StepperAdministrator
    public void initItem(LayerTunnel brush, float radius, long center, float alpha, JoystickUseCase style, androidx.compose.ui.graphics.LayerUseCase colorFilter, int blendMode) {
        this.drawParams.getCanvas().unlockMessage(center, radius, queryModel(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // com.goldenboot.saga.zone.StepperAdministrator
    /* renamed from: pollBuffer, reason: from getter */
    public WaveDrain getDrawContext() {
        return this.drawContext;
    }

    @Override // com.goldenboot.saga.zone.StepperAdministrator
    public void popContext(LayerTunnel brush, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, JoystickUseCase style, androidx.compose.ui.graphics.LayerUseCase colorFilter, int blendMode) {
        int i = (int) (topLeft >> 32);
        int i2 = (int) (topLeft & 4294967295L);
        this.drawParams.getCanvas().peekRevision(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (size >> 32)), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (size & 4294967295L)), startAngle, sweepAngle, useCenter, queryModel(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // com.goldenboot.saga.zone.StepperAdministrator
    public void protectGauge(ContextStage image, long topLeft, float alpha, JoystickUseCase style, androidx.compose.ui.graphics.LayerUseCase colorFilter, int blendMode) {
        this.drawParams.getCanvas().bindBody(image, topLeft, queryModel(this, null, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // com.goldenboot.saga.zone.StepperAdministrator
    public void removeFormat(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, JoystickUseCase style, androidx.compose.ui.graphics.LayerUseCase colorFilter, int blendMode) {
        int i = (int) (topLeft >> 32);
        int i2 = (int) (topLeft & 4294967295L);
        this.drawParams.getCanvas().peekRevision(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (size >> 32)), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (size & 4294967295L)), startAngle, sweepAngle, useCenter, injectConstraint(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // com.goldenboot.saga.zone.StepperAdministrator
    public void saveTimezone(List<RuntimeHeap> points, int pointMode, LayerTunnel brush, float strokeWidth, int cap, ListenerStage pathEffect, float alpha, androidx.compose.ui.graphics.LayerUseCase colorFilter, int blendMode) {
        this.drawParams.getCanvas().attachCallback(pointMode, points, attachCallback(this, brush, strokeWidth, 4.0f, cap, RotateFacilitator.INSTANCE.growPayload(), pathEffect, alpha, colorFilter, blendMode, 0, ContentOperation.RotationY, null));
    }

    @Override // com.goldenboot.saga.zone.StepperAdministrator
    public void scatterPayload(LayerTunnel brush, long start, long end, float strokeWidth, int cap, ListenerStage pathEffect, float alpha, androidx.compose.ui.graphics.LayerUseCase colorFilter, int blendMode) {
        this.drawParams.getCanvas().syncScope(start, end, attachCallback(this, brush, strokeWidth, 4.0f, cap, RotateFacilitator.INSTANCE.growPayload(), pathEffect, alpha, colorFilter, blendMode, 0, ContentOperation.RotationY, null));
    }

    @Override // com.goldenboot.saga.zone.StepperAdministrator
    public void shrinkSettings(LayerTunnel brush, long topLeft, long size, long cornerRadius, float alpha, JoystickUseCase style, androidx.compose.ui.graphics.LayerUseCase colorFilter, int blendMode) {
        int i = (int) (topLeft >> 32);
        int i2 = (int) (topLeft & 4294967295L);
        this.drawParams.getCanvas().inflateEdge(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (size >> 32)), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (size & 4294967295L)), Float.intBitsToFloat((int) (cornerRadius >> 32)), Float.intBitsToFloat((int) (cornerRadius & 4294967295L)), queryModel(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // com.goldenboot.saga.zone.StepperAdministrator
    public void subscribeEvent(ServiceFetcher path, LayerTunnel brush, float alpha, JoystickUseCase style, androidx.compose.ui.graphics.LayerUseCase colorFilter, int blendMode) {
        this.drawParams.getCanvas().mergeLocale(path, queryModel(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // com.goldenboot.saga.zone.StepperAdministrator
    public void transformSignal(List<RuntimeHeap> points, int pointMode, long color, float strokeWidth, int cap, ListenerStage pathEffect, float alpha, androidx.compose.ui.graphics.LayerUseCase colorFilter, int blendMode) {
        this.drawParams.getCanvas().attachCallback(pointMode, points, bindBody(this, color, strokeWidth, 4.0f, cap, RotateFacilitator.INSTANCE.growPayload(), pathEffect, alpha, colorFilter, blendMode, 0, ContentOperation.RotationY, null));
    }

    @Override // com.goldenboot.saga.zone.StepperAdministrator
    public void unpackResult(long color, long topLeft, long size, long cornerRadius, JoystickUseCase style, float alpha, androidx.compose.ui.graphics.LayerUseCase colorFilter, int blendMode) {
        int i = (int) (topLeft >> 32);
        int i2 = (int) (topLeft & 4294967295L);
        this.drawParams.getCanvas().inflateEdge(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (size >> 32)), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (size & 4294967295L)), Float.intBitsToFloat((int) (cornerRadius >> 32)), Float.intBitsToFloat((int) (cornerRadius & 4294967295L)), injectConstraint(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    public final void updateAction(BackgroundCollection density, LabelCache layoutDirection, PulseCounter canvas, long size, TouchRecord block) {
        DrawParams drawParams = getDrawParams();
        BackgroundCollection density2 = drawParams.getDensity();
        LabelCache growPayload = drawParams.growPayload();
        PulseCounter injectMetric = drawParams.injectMetric();
        long size2 = drawParams.getSize();
        DrawParams drawParams2 = getDrawParams();
        drawParams2.connectJob(density);
        drawParams2.peekRevision(layoutDirection);
        drawParams2.drawField(canvas);
        drawParams2.serializeOffset(size);
        canvas.reduceScope();
        block.invoke(this);
        canvas.queryModel();
        DrawParams drawParams3 = getDrawParams();
        drawParams3.connectJob(density2);
        drawParams3.peekRevision(growPayload);
        drawParams3.drawField(injectMetric);
        drawParams3.serializeOffset(size2);
    }

    public static /* synthetic */ void startResource() {
    }
}
