package com.goldenboot.saga.zone;

import androidx.compose.ui.layout.GradientActivator;
import com.goldenboot.saga.zone.ContentRepository;
import com.goldenboot.saga.zone.FontReporter;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\n\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ$\u0010\u0011\u001a\u00020\t2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\u000fH\u0082\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J?\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J?\u0010!\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\tH\u0002¢\u0006\u0004\b\"\u0010\u000bJ\u000f\u0010#\u001a\u00020\tH\u0002¢\u0006\u0004\b#\u0010\u000bJ\u000f\u0010$\u001a\u00020\tH\u0000¢\u0006\u0004\b$\u0010\u000bJ\u000f\u0010%\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010\u000bJ\u000f\u0010&\u001a\u00020\tH\u0000¢\u0006\u0004\b&\u0010\u000bJ\u0017\u0010)\u001a\u00020\t2\u0006\u0010(\u001a\u00020'H\u0000¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020-2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b.\u0010/J\u0018\u00103\u001a\u0002022\u0006\u00101\u001a\u000200H\u0096\u0002¢\u0006\u0004\b3\u00104J5\u00105\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t\u0018\u00010\u000fH\u0014¢\u0006\u0004\b5\u00106J'\u00107\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\t2\u0006\u00109\u001a\u00020-H\u0016¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\t¢\u0006\u0004\b<\u0010\u000bJ\u0017\u0010>\u001a\u0002022\u0006\u0010=\u001a\u000202H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u0002022\u0006\u0010=\u001a\u000202H\u0016¢\u0006\u0004\b@\u0010?J\u0017\u0010B\u001a\u0002022\u0006\u0010A\u001a\u000202H\u0016¢\u0006\u0004\bB\u0010?J\u0017\u0010C\u001a\u0002022\u0006\u0010A\u001a\u000202H\u0016¢\u0006\u0004\bC\u0010?J\r\u0010D\u001a\u00020\t¢\u0006\u0004\bD\u0010\u000bJ\r\u0010E\u001a\u00020-¢\u0006\u0004\bE\u0010FJ\u001b\u0010H\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002020GH\u0016¢\u0006\u0004\bH\u0010IJ#\u0010J\u001a\u00020\t2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u000fH\u0016¢\u0006\u0004\bJ\u0010\u0012J\u000f\u0010K\u001a\u00020\tH\u0016¢\u0006\u0004\bK\u0010\u000bJ\u000f\u0010L\u001a\u00020\tH\u0016¢\u0006\u0004\bL\u0010\u000bJ\r\u0010M\u001a\u00020\t¢\u0006\u0004\bM\u0010\u000bJ\u0015\u0010O\u001a\u00020\t2\u0006\u0010N\u001a\u00020-¢\u0006\u0004\bO\u0010;J\r\u0010P\u001a\u00020\t¢\u0006\u0004\bP\u0010\u000bJ\r\u0010Q\u001a\u00020\t¢\u0006\u0004\bQ\u0010\u000bJ\u000f\u0010R\u001a\u00020\tH\u0000¢\u0006\u0004\bR\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010W\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR$\u0010]\u001a\u0002022\u0006\u0010X\u001a\u0002028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R$\u0010`\u001a\u0002022\u0006\u0010X\u001a\u0002028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b^\u0010Z\u001a\u0004\b_\u0010\\R\u0016\u0010b\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010VR$\u0010e\u001a\u00020-2\u0006\u0010X\u001a\u00020-8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bc\u0010V\u001a\u0004\bd\u0010FR\"\u0010m\u001a\u00020f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\"\u0010q\u001a\u00020-8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bn\u0010V\u001a\u0004\bo\u0010F\"\u0004\bp\u0010;R$\u0010v\u001a\u00020\u00172\u0006\u0010X\u001a\u00020\u00178\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR$\u0010y\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0018\u0010|\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0016\u0010~\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010}R\u0017\u0010\u0080\u0001\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010VR/\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0081\u00012\t\u0010X\u001a\u0005\u0018\u00010\u0081\u00018\u0016@RX\u0096\u000e¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R.\u0010\u008a\u0001\u001a\u00020-2\u0006\u0010X\u001a\u00020-8\u0016@PX\u0096\u000e¢\u0006\u0015\n\u0005\b\u0087\u0001\u0010V\u001a\u0005\b\u0088\u0001\u0010F\"\u0005\b\u0089\u0001\u0010;R.\u0010\u008e\u0001\u001a\u00020-2\u0006\u0010X\u001a\u00020-8\u0006@@X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010V\u001a\u0005\b\u008c\u0001\u0010F\"\u0005\b\u008d\u0001\u0010;R'\u0010\u0090\u0001\u001a\u00020-2\u0006\u0010X\u001a\u00020-8\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010V\u001a\u0005\b\u008f\u0001\u0010FR'\u0010\u0092\u0001\u001a\u00020-2\u0006\u0010X\u001a\u00020-8\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010V\u001a\u0005\b\u0091\u0001\u0010FR\u0018\u0010\u0094\u0001\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010VR\u001f\u0010\u0099\u0001\u001a\u00030\u0095\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0005\bz\u0010\u0098\u0001R\u001e\u0010\u009d\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R%\u0010 \u0001\u001a\u00020-8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\bC\u0010V\u001a\u0005\b\u009e\u0001\u0010F\"\u0005\b\u009f\u0001\u0010;R'\u0010£\u0001\u001a\u00020-2\u0006\u0010X\u001a\u00020-8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b¡\u0001\u0010V\u001a\u0005\b¢\u0001\u0010FR\u0018\u0010¥\u0001\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¤\u0001\u0010sR&\u0010«\u0001\u001a\t\u0012\u0004\u0012\u00020\t0¦\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001R\u001d\u0010¬\u0001\u001a\t\u0012\u0004\u0012\u00020\t0¦\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bH\u0010¨\u0001R'\u0010\u001a\u001a\u00020\u00192\u0006\u0010X\u001a\u00020\u00198\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0005\b\u00ad\u0001\u0010}\u001a\u0006\b®\u0001\u0010¯\u0001R\u0018\u0010±\u0001\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b°\u0001\u0010VR&\u0010³\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b²\u0001\u0010xR\u001a\u0010µ\u0001\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b´\u0001\u0010{R\u0018\u0010·\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¶\u0001\u0010sR\u0018\u0010¹\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¸\u0001\u0010}R\u001e\u0010»\u0001\u001a\t\u0012\u0004\u0012\u00020\t0¦\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010¨\u0001R\u0018\u0010½\u0001\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¼\u0001\u0010VR&\u0010Á\u0001\u001a\u00020-8\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b¾\u0001\u0010V\u001a\u0005\b¿\u0001\u0010F\"\u0005\bÀ\u0001\u0010;R\u001a\u0010Å\u0001\u001a\u0005\u0018\u00010Â\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÃ\u0001\u0010Ä\u0001R\u0016\u0010È\u0001\u001a\u0004\u0018\u00010'8F¢\u0006\b\u001a\u0006\bÆ\u0001\u0010Ç\u0001R\u0014\u0010Ë\u0001\u001a\u00020\u00138F¢\u0006\b\u001a\u0006\bÉ\u0001\u0010Ê\u0001R+\u0010Ñ\u0001\u001a\u00030Ì\u00012\u0007\u0010X\u001a\u00030Ì\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÍ\u0001\u0010Î\u0001\"\u0006\bÏ\u0001\u0010Ð\u0001R\u0015\u0010Õ\u0001\u001a\u00030Ò\u00018F¢\u0006\b\u001a\u0006\bÓ\u0001\u0010Ô\u0001R\u0018\u0010×\u0001\u001a\u00030Ò\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÖ\u0001\u0010Ô\u0001R\u001e\u0010Û\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000Ø\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bÙ\u0001\u0010Ú\u0001R\u0016\u0010Ý\u0001\u001a\u0002028VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÜ\u0001\u0010\\R\u0016\u0010Þ\u0001\u001a\u0002028VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010\\R\u0019\u0010á\u0001\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\bß\u0001\u0010à\u0001¨\u0006â\u0001"}, d2 = {"Lcom/goldenboot/saga/zone/SubscriberRegulator;", "Lcom/goldenboot/saga/zone/BreadcrumbMerger;", "Landroidx/compose/ui/layout/GradientActivator;", "Lcom/goldenboot/saga/zone/AbstractSlot;", "Lcom/goldenboot/saga/zone/ShadowBuilder;", "Lcom/goldenboot/saga/zone/NotificationBarrier;", "layoutNodeLayoutDelegate", "<init>", "(Lcom/goldenboot/saga/zone/NotificationBarrier;)V", "Lcom/goldenboot/saga/zone/DpadBuilder;", "resumeRecord", "()V", "observeSnapshot", "clipMetric", "drainCache", "Lkotlin/Function1;", "block", "resetTask", "(Lcom/goldenboot/saga/zone/TouchRecord;)V", "Lcom/goldenboot/saga/zone/ContentRepository;", "node", "unpackCharset", "(Lcom/goldenboot/saga/zone/ContentRepository;)V", "Lcom/goldenboot/saga/zone/FontReporter;", "position", "", "zIndex", "Landroidx/compose/ui/graphics/ScopedMigration;", "layerBlock", "Lcom/goldenboot/saga/zone/BottomBarEvaluator;", "layer", "decodeDigest", "(JFLcom/goldenboot/saga/zone/TouchRecord;Lcom/goldenboot/saga/zone/BottomBarEvaluator;)V", "disconnectFormat", "prependBundle", "injectState", "findRoute", "normalizeRecord", "scheduleHash", "Lcom/goldenboot/saga/zone/PagerPlanner;", "constraints", "removePosition", "(J)V", "prependArchive", "(J)Landroidx/compose/ui/layout/GradientActivator;", "", "saveDestination", "(J)Z", "Lcom/goldenboot/saga/zone/BottomBarActivator;", "alignmentLine", "", "storeCharset", "(Lcom/goldenboot/saga/zone/BottomBarActivator;)I", "observeView", "(JFLcom/goldenboot/saga/zone/TouchRecord;)V", "dispatchLink", "(JFLcom/goldenboot/saga/zone/BottomBarEvaluator;)V", "newMFR", "writeRequest", "(Z)V", "sanitizeBounds", "height", "prepareCount", "(I)I", "protectChannel", "width", "applyData", "attachCallback", "emitCharset", "resumeLink", "()Z", "", "startResource", "()Ljava/util/Map;", "emitStrategy", "requestLayout", "resumeOrigin", "trimEntry", "forceRequest", "encodeManifest", "inflateEndpoint", "pauseComponent", "verifyComponent", "purgeNode", "Lcom/goldenboot/saga/zone/NotificationBarrier;", "drawRequest", "Z", "relayoutWithoutParentInProgress", "value", "gatherAdapter", "I", "popIndex", "()I", "previousPlaceOrder", "decodePath", "broadcastModule", "placeOrder", "drawScope", "measuredOnce", "expandArgs", "dispatchEvent", "placedOnce", "Lcom/goldenboot/saga/zone/ContentRepository$ScopedMigration;", "findTask", "Lcom/goldenboot/saga/zone/ContentRepository$ScopedMigration;", "growPool", "()Lcom/goldenboot/saga/zone/ContentRepository$ScopedMigration;", "applyMetric", "(Lcom/goldenboot/saga/zone/ContentRepository$ScopedMigration;)V", "measuredByParent", "mergeLocale", "confirmSignature", "releaseIndex", "duringAlignmentLinesQuery", "syncScope", "J", "measureTimezone", "()J", "lastPosition", "flattenPackage", "Lcom/goldenboot/saga/zone/TouchRecord;", "lastLayerBlock", "injectConstraint", "Lcom/goldenboot/saga/zone/BottomBarEvaluator;", "lastExplicitLayer", "F", "lastZIndex", "filterPayload", "parentDataDirty", "", "inflateEdge", "Ljava/lang/Object;", "unlockMessage", "()Ljava/lang/Object;", "parentData", "queryModel", "bindBody", "scatterCounter", "isPlaced", "packPackage", "renderPattern", "checkEntry", "isPlacedByParent", "trimOrigin", "measurePending", "attachNode", "layoutPending", "dispatchTimezone", "layoutPendingForAlignment", "Lcom/goldenboot/saga/zone/ClickDelta;", "parseAsset", "Lcom/goldenboot/saga/zone/ClickDelta;", "()Lcom/goldenboot/saga/zone/ClickDelta;", "alignmentLines", "Lcom/goldenboot/saga/zone/PluginScheduler;", "mapJob", "Lcom/goldenboot/saga/zone/PluginScheduler;", "_childDelegates", "insertLocale", "subscribeCounter", "childDelegatesDirty", "prepareTask", "peekField", "layingOutChildren", "updateAction", "performMeasureConstraints", "Lkotlin/Function0;", "connectComponent", "Lcom/goldenboot/saga/zone/ElevationNode;", "detachModel", "()Lcom/goldenboot/saga/zone/ElevationNode;", "performMeasureBlock", "layoutChildrenBlock", "formatPosition", "savePool", "()F", "resumeSignature", "onNodePlacedCalled", "groupArchive", "placeOuterCoordinatorLayerBlock", "cancelArchive", "placeOuterCoordinatorLayer", "resolveDelta", "placeOuterCoordinatorPosition", "resetValue", "placeOuterCoordinatorZIndex", "serializeTask", "placeOuterCoordinatorBlock", "injectField", "needsCoordinatesUpdate", "appendKey", "drawConfig", "mergeEvent", "isPlacedUnderMotionFrameOfReference", "Lcom/goldenboot/saga/zone/PlatformDelegate;", "processFormat", "()Lcom/goldenboot/saga/zone/PlatformDelegate;", "lookaheadPassDelegate", "resolveParams", "()Lcom/goldenboot/saga/zone/PagerPlanner;", "lastConstraints", "broadcastPayload", "()Lcom/goldenboot/saga/zone/ContentRepository;", "layoutNode", "Lcom/goldenboot/saga/zone/ContentRepository$EndpointList;", "fetchOptions", "()Lcom/goldenboot/saga/zone/ContentRepository$EndpointList;", "layoutDigest", "(Lcom/goldenboot/saga/zone/ContentRepository$EndpointList;)V", "layoutState", "Lcom/goldenboot/saga/zone/BridgeSerializer;", "loadSettings", "()Lcom/goldenboot/saga/zone/BridgeSerializer;", "outerCoordinator", "closePayload", "innerCoordinator", "", "scheduleTemplate", "()Ljava/util/List;", "childDelegates", "lockManifest", "measuredWidth", "measuredHeight", "offerHash", "()Lcom/goldenboot/saga/zone/AbstractSlot;", "parentAlignmentLinesOwner", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SubscriberRegulator extends androidx.compose.ui.layout.GradientActivator implements BreadcrumbMerger, AbstractSlot, ShadowBuilder {
    public static final int computeTarget = 8;

    /* renamed from: appendKey, reason: from kotlin metadata */
    private boolean isPlacedUnderMotionFrameOfReference;

    /* renamed from: attachCallback, reason: from kotlin metadata */
    private boolean childDelegatesDirty;

    /* renamed from: bindBody, reason: from kotlin metadata */
    private boolean layoutPending;

    /* renamed from: cancelArchive, reason: from kotlin metadata */
    private BottomBarEvaluator placeOuterCoordinatorLayer;

    /* renamed from: connectComponent, reason: from kotlin metadata */
    private final ElevationNode performMeasureBlock;

    /* renamed from: dispatchTimezone, reason: from kotlin metadata */
    private boolean layoutPendingForAlignment;

    /* renamed from: drawRequest, reason: from kotlin metadata */
    private boolean relayoutWithoutParentInProgress;

    /* renamed from: drawScope, reason: from kotlin metadata */
    private boolean measuredOnce;

    /* renamed from: expandArgs, reason: from kotlin metadata */
    private boolean placedOnce;

    /* renamed from: filterPayload, reason: from kotlin metadata */
    private boolean parentDataDirty;

    /* renamed from: flattenPackage, reason: from kotlin metadata */
    private TouchRecord lastLayerBlock;

    /* renamed from: formatPosition, reason: from kotlin metadata */
    private float zIndex;

    /* renamed from: groupArchive, reason: from kotlin metadata */
    private TouchRecord placeOuterCoordinatorLayerBlock;

    /* renamed from: inflateEdge, reason: from kotlin metadata */
    private Object parentData;

    /* renamed from: injectConstraint, reason: from kotlin metadata */
    private BottomBarEvaluator lastExplicitLayer;

    /* renamed from: injectField, reason: from kotlin metadata */
    private boolean needsCoordinatesUpdate;

    /* renamed from: mapJob, reason: from kotlin metadata */
    private final PluginScheduler _childDelegates;

    /* renamed from: mergeLocale, reason: from kotlin metadata */
    private boolean duringAlignmentLinesQuery;

    /* renamed from: packPackage, reason: from kotlin metadata */
    private boolean isPlacedByParent;

    /* renamed from: parseAsset, reason: from kotlin metadata */
    private final ClickDelta alignmentLines;

    /* renamed from: prepareTask, reason: from kotlin metadata */
    private boolean layingOutChildren;

    /* renamed from: purgeNode, reason: from kotlin metadata */
    private final NotificationBarrier layoutNodeLayoutDelegate;

    /* renamed from: queryModel, reason: from kotlin metadata */
    private boolean isPlaced;

    /* renamed from: resetValue, reason: from kotlin metadata */
    private float placeOuterCoordinatorZIndex;

    /* renamed from: resolveDelta, reason: from kotlin metadata */
    private long placeOuterCoordinatorPosition;

    /* renamed from: resumeSignature, reason: from kotlin metadata */
    private boolean onNodePlacedCalled;

    /* renamed from: serializeTask, reason: from kotlin metadata */
    private final ElevationNode placeOuterCoordinatorBlock;

    /* renamed from: startResource, reason: from kotlin metadata */
    private final ElevationNode layoutChildrenBlock;

    /* renamed from: storeCharset, reason: from kotlin metadata */
    private float lastZIndex;

    /* renamed from: syncScope, reason: from kotlin metadata */
    private long lastPosition;

    /* renamed from: unlockMessage, reason: from kotlin metadata */
    private boolean measurePending;

    /* renamed from: updateAction, reason: from kotlin metadata */
    private long performMeasureConstraints;

    /* renamed from: gatherAdapter, reason: from kotlin metadata */
    private int previousPlaceOrder = Integer.MAX_VALUE;

    /* renamed from: decodePath, reason: from kotlin metadata */
    private int placeOrder = Integer.MAX_VALUE;

    /* renamed from: findTask, reason: from kotlin metadata */
    private ContentRepository.ScopedMigration measuredByParent = ContentRepository.ScopedMigration.connectPatch;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class ActivityMutator {
        public static final /* synthetic */ int[] evictLayout;
        public static final /* synthetic */ int[] growPayload;

        static {
            int[] iArr = new int[ContentRepository.EndpointList.values().length];
            try {
                iArr[ContentRepository.EndpointList.reduceScope.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContentRepository.EndpointList.connectPatch.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            evictLayout = iArr;
            int[] iArr2 = new int[ContentRepository.ScopedMigration.values().length];
            try {
                iArr2[ContentRepository.ScopedMigration.reduceScope.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ContentRepository.ScopedMigration.notifyMessage.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            growPayload = iArr2;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/goldenboot/saga/zone/DpadBuilder;", "evictLayout", "()V"}, k = 3, mv = {2, 0, 0})
    public static final class BounceHandler extends Lambda implements ElevationNode {

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/goldenboot/saga/zone/AbstractSlot;", "it", "Lcom/goldenboot/saga/zone/DpadBuilder;", "evictLayout", "(Lcom/goldenboot/saga/zone/AbstractSlot;)V"}, k = 3, mv = {2, 0, 0})
        public static final class ActivityMutator extends Lambda implements TouchRecord {
            public static final ActivityMutator reduceScope = new ActivityMutator();

            public ActivityMutator() {
                super(1);
            }

            public final void evictLayout(AbstractSlot abstractSlot) {
                abstractSlot.getAlignmentLines().drawScope(false);
            }

            @Override // com.goldenboot.saga.zone.TouchRecord
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                evictLayout((AbstractSlot) obj);
                return DpadBuilder.evictLayout;
            }
        }

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/goldenboot/saga/zone/AbstractSlot;", "it", "Lcom/goldenboot/saga/zone/DpadBuilder;", "evictLayout", "(Lcom/goldenboot/saga/zone/AbstractSlot;)V"}, k = 3, mv = {2, 0, 0})
        /* renamed from: com.goldenboot.saga.zone.SubscriberRegulator$BounceHandler$BounceHandler, reason: collision with other inner class name */
        public static final class C0176BounceHandler extends Lambda implements TouchRecord {
            public static final C0176BounceHandler reduceScope = new C0176BounceHandler();

            public C0176BounceHandler() {
                super(1);
            }

            public final void evictLayout(AbstractSlot abstractSlot) {
                abstractSlot.getAlignmentLines().drawRequest(abstractSlot.getAlignmentLines().getUsedDuringParentLayout());
            }

            @Override // com.goldenboot.saga.zone.TouchRecord
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                evictLayout((AbstractSlot) obj);
                return DpadBuilder.evictLayout;
            }
        }

        public BounceHandler() {
            super(0);
        }

        public final void evictLayout() {
            SubscriberRegulator.this.drainCache();
            SubscriberRegulator.this.emitStrategy(ActivityMutator.reduceScope);
            SubscriberRegulator.this.closePayload().resolveParams().popBlueprint();
            SubscriberRegulator.this.resumeRecord();
            SubscriberRegulator.this.emitStrategy(C0176BounceHandler.reduceScope);
        }

        @Override // com.goldenboot.saga.zone.ElevationNode
        public /* bridge */ /* synthetic */ Object invoke() {
            evictLayout();
            return DpadBuilder.evictLayout;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/goldenboot/saga/zone/AbstractSlot;", "it", "Lcom/goldenboot/saga/zone/DpadBuilder;", "evictLayout", "(Lcom/goldenboot/saga/zone/AbstractSlot;)V"}, k = 3, mv = {2, 0, 0})
    public static final class EndpointList extends Lambda implements TouchRecord {
        public static final EndpointList reduceScope = new EndpointList();

        public EndpointList() {
            super(1);
        }

        public final void evictLayout(AbstractSlot abstractSlot) {
            abstractSlot.getAlignmentLines().expandArgs(false);
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            evictLayout((AbstractSlot) obj);
            return DpadBuilder.evictLayout;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/goldenboot/saga/zone/DpadBuilder;", "evictLayout", "()V"}, k = 3, mv = {2, 0, 0})
    public static final class FeedbackFlow extends Lambda implements ElevationNode {
        public FeedbackFlow() {
            super(0);
        }

        public final void evictLayout() {
            SubscriberRegulator.this.loadSettings().prependArchive(SubscriberRegulator.this.performMeasureConstraints);
        }

        @Override // com.goldenboot.saga.zone.ElevationNode
        public /* bridge */ /* synthetic */ Object invoke() {
            evictLayout();
            return DpadBuilder.evictLayout;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/goldenboot/saga/zone/DpadBuilder;", "evictLayout", "()V"}, k = 3, mv = {2, 0, 0})
    public static final class LayerUseCase extends Lambda implements ElevationNode {
        public LayerUseCase() {
            super(0);
        }

        public final void evictLayout() {
            GradientActivator.ActivityMutator placementScope;
            BridgeSerializer wrappedBy = SubscriberRegulator.this.loadSettings().getWrappedBy();
            if (wrappedBy == null || (placementScope = wrappedBy.getPlacementScope()) == null) {
                placementScope = MenuReceiver.injectMetric(SubscriberRegulator.this.broadcastPayload()).getPlacementScope();
            }
            GradientActivator.ActivityMutator activityMutator = placementScope;
            SubscriberRegulator subscriberRegulator = SubscriberRegulator.this;
            TouchRecord touchRecord = subscriberRegulator.placeOuterCoordinatorLayerBlock;
            BottomBarEvaluator bottomBarEvaluator = subscriberRegulator.placeOuterCoordinatorLayer;
            if (bottomBarEvaluator != null) {
                activityMutator.unwrapKey(subscriberRegulator.loadSettings(), subscriberRegulator.placeOuterCoordinatorPosition, bottomBarEvaluator, subscriberRegulator.placeOuterCoordinatorZIndex);
            } else if (touchRecord == null) {
                activityMutator.connectComponent(subscriberRegulator.loadSettings(), subscriberRegulator.placeOuterCoordinatorPosition, subscriberRegulator.placeOuterCoordinatorZIndex);
            } else {
                activityMutator.writeRequest(subscriberRegulator.loadSettings(), subscriberRegulator.placeOuterCoordinatorPosition, subscriberRegulator.placeOuterCoordinatorZIndex, touchRecord);
            }
        }

        @Override // com.goldenboot.saga.zone.ElevationNode
        public /* bridge */ /* synthetic */ Object invoke() {
            evictLayout();
            return DpadBuilder.evictLayout;
        }
    }

    public SubscriberRegulator(NotificationBarrier notificationBarrier) {
        this.layoutNodeLayoutDelegate = notificationBarrier;
        FontReporter.Companion companion = FontReporter.INSTANCE;
        this.lastPosition = companion.growPayload();
        this.parentDataDirty = true;
        this.alignmentLines = new BadgeHelper(this);
        this._childDelegates = new PluginScheduler(new SubscriberRegulator[16], 0);
        this.childDelegatesDirty = true;
        this.performMeasureConstraints = SubscriberCache.growPayload(0, 0, 0, 0, 15, null);
        this.performMeasureBlock = new FeedbackFlow();
        this.layoutChildrenBlock = new BounceHandler();
        this.placeOuterCoordinatorPosition = companion.growPayload();
        this.placeOuterCoordinatorBlock = new LayerUseCase();
    }

    private final void clipMetric() {
        boolean isPlaced = getIsPlaced();
        scatterCounter(true);
        ContentRepository broadcastPayload = broadcastPayload();
        if (!isPlaced) {
            broadcastPayload.purgeMetric().insertToken();
            if (broadcastPayload.executeRecord()) {
                ContentRepository.unwrapView(broadcastPayload, true, false, false, 6, null);
            } else if (broadcastPayload.normalizeBundle()) {
                ContentRepository.transformSignal(broadcastPayload, true, false, false, 6, null);
            }
        }
        BridgeSerializer wrapped = broadcastPayload.purgeMetric().getWrapped();
        for (BridgeSerializer searchHolder = broadcastPayload.searchHolder(); !Intrinsics.areEqual(searchHolder, wrapped) && searchHolder != null; searchHolder = searchHolder.getWrapped()) {
            if (searchHolder.getLastLayerDrawingWasSkipped()) {
                searchHolder.escapeMetadata();
            }
        }
        PluginScheduler measureEndpoint = broadcastPayload.measureEndpoint();
        Object[] objArr = measureEndpoint.reduceScope;
        int reduceScope = measureEndpoint.reduceScope();
        for (int i = 0; i < reduceScope; i++) {
            ContentRepository contentRepository = (ContentRepository) objArr[i];
            if (contentRepository.flattenToken() != Integer.MAX_VALUE) {
                contentRepository.formatMessage().clipMetric();
                broadcastPayload.formatCurrency(contentRepository);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:3:0x0005, B:5:0x0010, B:8:0x0034, B:10:0x003a, B:12:0x0040, B:14:0x004a, B:18:0x0060, B:20:0x0071, B:21:0x0078, B:22:0x0053, B:23:0x008c, B:25:0x0092, B:29:0x009c, B:30:0x00a1, B:35:0x0019, B:37:0x0021, B:39:0x0029, B:41:0x0031, B:42:0x002d), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071 A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:3:0x0005, B:5:0x0010, B:8:0x0034, B:10:0x003a, B:12:0x0040, B:14:0x004a, B:18:0x0060, B:20:0x0071, B:21:0x0078, B:22:0x0053, B:23:0x008c, B:25:0x0092, B:29:0x009c, B:30:0x00a1, B:35:0x0019, B:37:0x0021, B:39:0x0029, B:41:0x0031, B:42:0x002d), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:3:0x0005, B:5:0x0010, B:8:0x0034, B:10:0x003a, B:12:0x0040, B:14:0x004a, B:18:0x0060, B:20:0x0071, B:21:0x0078, B:22:0x0053, B:23:0x008c, B:25:0x0092, B:29:0x009c, B:30:0x00a1, B:35:0x0019, B:37:0x0021, B:39:0x0029, B:41:0x0031, B:42:0x002d), top: B:2:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void decodeDigest(long position, float zIndex, TouchRecord layerBlock, BottomBarEvaluator layer) {
        PlatformDelegate processFormat;
        PlatformDelegate processFormat2;
        BridgeSerializer wrappedBy;
        GradientActivator.ActivityMutator placementScope;
        ContentRepository acquireAsset;
        ContentRepository broadcastPayload = broadcastPayload();
        boolean z = true;
        try {
            this.isPlacedByParent = true;
            if (FontReporter.drawField(position, this.lastPosition)) {
                if (this.needsCoordinatesUpdate) {
                }
                processFormat = processFormat();
                if (processFormat != null && processFormat.trimOrigin()) {
                    wrappedBy = loadSettings().getWrappedBy();
                    if (wrappedBy != null) {
                        placementScope = wrappedBy.getPlacementScope();
                        if (placementScope != null) {
                        }
                        GradientActivator.ActivityMutator activityMutator = placementScope;
                        PlatformDelegate processFormat3 = processFormat();
                        Intrinsics.checkNotNull(processFormat3);
                        acquireAsset = broadcastPayload().acquireAsset();
                        if (acquireAsset != null) {
                            acquireAsset.getLayoutDelegate().cancelArchive(0);
                        }
                        processFormat3.subscribeCounter(Integer.MAX_VALUE);
                        GradientActivator.ActivityMutator.updateAction(activityMutator, processFormat3, FontReporter.serializeOffset(position), FontReporter.notifyMessage(position), 0.0f, 4, null);
                    }
                    placementScope = MenuReceiver.injectMetric(broadcastPayload()).getPlacementScope();
                    GradientActivator.ActivityMutator activityMutator2 = placementScope;
                    PlatformDelegate processFormat32 = processFormat();
                    Intrinsics.checkNotNull(processFormat32);
                    acquireAsset = broadcastPayload().acquireAsset();
                    if (acquireAsset != null) {
                    }
                    processFormat32.subscribeCounter(Integer.MAX_VALUE);
                    GradientActivator.ActivityMutator.updateAction(activityMutator2, processFormat32, FontReporter.serializeOffset(position), FontReporter.notifyMessage(position), 0.0f, 4, null);
                }
                processFormat2 = processFormat();
                if (processFormat2 != null || processFormat2.getPlacedOnce()) {
                    z = false;
                }
                if (z) {
                    PagerBridge.applyTask("Error: Placement happened before lookahead.");
                }
                disconnectFormat(position, zIndex, layerBlock, layer);
                DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
            }
            if (this.layoutNodeLayoutDelegate.getCoordinatesAccessedDuringModifierPlacement() || this.layoutNodeLayoutDelegate.getCoordinatesAccessedDuringPlacement() || this.needsCoordinatesUpdate) {
                this.layoutPending = true;
                this.needsCoordinatesUpdate = false;
            }
            trimEntry();
            processFormat = processFormat();
            if (processFormat != null) {
                wrappedBy = loadSettings().getWrappedBy();
                if (wrappedBy != null) {
                }
                placementScope = MenuReceiver.injectMetric(broadcastPayload()).getPlacementScope();
                GradientActivator.ActivityMutator activityMutator22 = placementScope;
                PlatformDelegate processFormat322 = processFormat();
                Intrinsics.checkNotNull(processFormat322);
                acquireAsset = broadcastPayload().acquireAsset();
                if (acquireAsset != null) {
                }
                processFormat322.subscribeCounter(Integer.MAX_VALUE);
                GradientActivator.ActivityMutator.updateAction(activityMutator22, processFormat322, FontReporter.serializeOffset(position), FontReporter.notifyMessage(position), 0.0f, 4, null);
            }
            processFormat2 = processFormat();
            if (processFormat2 != null) {
            }
            z = false;
            if (z) {
            }
            disconnectFormat(position, zIndex, layerBlock, layer);
            DpadBuilder dpadBuilder2 = DpadBuilder.evictLayout;
        } catch (Throwable th) {
            broadcastPayload.pauseNode(th);
            throw new ShadowBroadcaster();
        }
    }

    private final void disconnectFormat(long position, float zIndex, TouchRecord layerBlock, BottomBarEvaluator layer) {
        if (broadcastPayload().getIsDeactivated()) {
            PagerBridge.flushSample("place is called on a deactivated node");
        }
        layoutDigest(ContentRepository.EndpointList.connectPatch);
        this.lastPosition = position;
        this.lastZIndex = zIndex;
        this.lastLayerBlock = layerBlock;
        this.lastExplicitLayer = layer;
        this.onNodePlacedCalled = false;
        CarouselHelper injectMetric = MenuReceiver.injectMetric(broadcastPayload());
        if (this.layoutPending || !getIsPlaced()) {
            getAlignmentLines().gatherAdapter(false);
            this.layoutNodeLayoutDelegate.parseAsset(false);
            this.placeOuterCoordinatorLayerBlock = layerBlock;
            this.placeOuterCoordinatorPosition = position;
            this.placeOuterCoordinatorZIndex = zIndex;
            this.placeOuterCoordinatorLayer = layer;
            injectMetric.getSnapshotObserver().injectMetric(broadcastPayload(), false, this.placeOuterCoordinatorBlock);
        } else {
            loadSettings().trackPattern(position, zIndex, layerBlock, layer);
            scheduleHash();
        }
        layoutDigest(ContentRepository.EndpointList.resetDelta);
        this.placedOnce = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void drainCache() {
        this.layoutNodeLayoutDelegate.resolveDelta(0);
        PluginScheduler measureEndpoint = broadcastPayload().measureEndpoint();
        Object[] objArr = measureEndpoint.reduceScope;
        int reduceScope = measureEndpoint.reduceScope();
        for (int i = 0; i < reduceScope; i++) {
            SubscriberRegulator formatMessage = ((ContentRepository) objArr[i]).formatMessage();
            formatMessage.previousPlaceOrder = formatMessage.placeOrder;
            formatMessage.placeOrder = Integer.MAX_VALUE;
            formatMessage.isPlacedByParent = false;
            if (formatMessage.measuredByParent == ContentRepository.ScopedMigration.notifyMessage) {
                formatMessage.measuredByParent = ContentRepository.ScopedMigration.connectPatch;
            }
        }
    }

    private final void injectState() {
        PluginScheduler measureEndpoint = broadcastPayload().measureEndpoint();
        Object[] objArr = measureEndpoint.reduceScope;
        int reduceScope = measureEndpoint.reduceScope();
        for (int i = 0; i < reduceScope; i++) {
            ContentRepository contentRepository = (ContentRepository) objArr[i];
            if (contentRepository.executeRecord() && contentRepository.commitKey() == ContentRepository.ScopedMigration.reduceScope && ContentRepository.popDigest(contentRepository, null, 1, null)) {
                ContentRepository.unwrapView(broadcastPayload(), false, false, false, 7, null);
            }
        }
    }

    private final void observeSnapshot() {
        if (getIsPlaced()) {
            scatterCounter(false);
            ContentRepository broadcastPayload = broadcastPayload();
            BridgeSerializer wrapped = broadcastPayload.purgeMetric().getWrapped();
            for (BridgeSerializer searchHolder = broadcastPayload.searchHolder(); !Intrinsics.areEqual(searchHolder, wrapped) && searchHolder != null; searchHolder = searchHolder.getWrapped()) {
                searchHolder.formatState();
                searchHolder.scatterDescriptor();
            }
            PluginScheduler measureEndpoint = broadcastPayload().measureEndpoint();
            Object[] objArr = measureEndpoint.reduceScope;
            int reduceScope = measureEndpoint.reduceScope();
            for (int i = 0; i < reduceScope; i++) {
                ((ContentRepository) objArr[i]).formatMessage().observeSnapshot();
            }
        }
    }

    private final void prependBundle() {
        ContentRepository.unwrapView(broadcastPayload(), false, false, false, 7, null);
        ContentRepository acquireAsset = broadcastPayload().acquireAsset();
        if (acquireAsset == null || broadcastPayload().getIntrinsicsUsageByParent() != ContentRepository.ScopedMigration.connectPatch) {
            return;
        }
        ContentRepository broadcastPayload = broadcastPayload();
        int i = ActivityMutator.evictLayout[acquireAsset.growCallback().ordinal()];
        broadcastPayload.resumeOrigin(i != 1 ? i != 2 ? acquireAsset.getIntrinsicsUsageByParent() : ContentRepository.ScopedMigration.notifyMessage : ContentRepository.ScopedMigration.reduceScope);
    }

    private final PlatformDelegate processFormat() {
        return this.layoutNodeLayoutDelegate.getLookaheadPassDelegate();
    }

    private final void resetTask(TouchRecord block) {
        PluginScheduler measureEndpoint = broadcastPayload().measureEndpoint();
        Object[] objArr = measureEndpoint.reduceScope;
        int reduceScope = measureEndpoint.reduceScope();
        for (int i = 0; i < reduceScope; i++) {
            block.invoke(((ContentRepository) objArr[i]).formatMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resumeRecord() {
        ContentRepository broadcastPayload = broadcastPayload();
        PluginScheduler measureEndpoint = broadcastPayload.measureEndpoint();
        Object[] objArr = measureEndpoint.reduceScope;
        int reduceScope = measureEndpoint.reduceScope();
        for (int i = 0; i < reduceScope; i++) {
            ContentRepository contentRepository = (ContentRepository) objArr[i];
            if (contentRepository.formatMessage().previousPlaceOrder != contentRepository.flattenToken()) {
                broadcastPayload.pauseCurrency();
                broadcastPayload.escapeBounds();
                if (contentRepository.flattenToken() == Integer.MAX_VALUE) {
                    if (contentRepository.getLayoutDelegate().getDetachedFromParentLookaheadPlacement()) {
                        PlatformDelegate commitBounds = contentRepository.commitBounds();
                        Intrinsics.checkNotNull(commitBounds);
                        commitBounds.encodeManifest(false);
                    }
                    contentRepository.formatMessage().observeSnapshot();
                }
            }
        }
    }

    private final void unpackCharset(ContentRepository node) {
        ContentRepository.ScopedMigration scopedMigration;
        ContentRepository acquireAsset = node.acquireAsset();
        if (acquireAsset == null) {
            this.measuredByParent = ContentRepository.ScopedMigration.connectPatch;
            return;
        }
        if (!(this.measuredByParent == ContentRepository.ScopedMigration.connectPatch || node.getCanMultiMeasure())) {
            PagerBridge.applyTask(StateWorkflow.evictLayout);
        }
        int i = ActivityMutator.evictLayout[acquireAsset.growCallback().ordinal()];
        if (i == 1) {
            scopedMigration = ContentRepository.ScopedMigration.reduceScope;
        } else {
            if (i != 2) {
                throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + acquireAsset.growCallback());
            }
            scopedMigration = ContentRepository.ScopedMigration.notifyMessage;
        }
        this.measuredByParent = scopedMigration;
    }

    @Override // com.goldenboot.saga.zone.FrameRevision
    public int applyData(int width) {
        if (!StateWorkflow.evictLayout(broadcastPayload())) {
            prependBundle();
            return loadSettings().applyData(width);
        }
        PlatformDelegate processFormat = processFormat();
        Intrinsics.checkNotNull(processFormat);
        return processFormat.applyData(width);
    }

    public final void applyMetric(ContentRepository.ScopedMigration scopedMigration) {
        this.measuredByParent = scopedMigration;
    }

    @Override // com.goldenboot.saga.zone.FrameRevision
    public int attachCallback(int width) {
        if (!StateWorkflow.evictLayout(broadcastPayload())) {
            prependBundle();
            return loadSettings().attachCallback(width);
        }
        PlatformDelegate processFormat = processFormat();
        Intrinsics.checkNotNull(processFormat);
        return processFormat.attachCallback(width);
    }

    /* renamed from: attachNode, reason: from getter */
    public final boolean getLayoutPending() {
        return this.layoutPending;
    }

    @Override // com.goldenboot.saga.zone.AbstractSlot
    /* renamed from: bindBody, reason: from getter */
    public boolean getIsPlaced() {
        return this.isPlaced;
    }

    /* renamed from: broadcastModule, reason: from getter */
    public final int getPlaceOrder() {
        return this.placeOrder;
    }

    public final ContentRepository broadcastPayload() {
        return this.layoutNodeLayoutDelegate.getLayoutNode();
    }

    public final void checkEntry(boolean z) {
        this.isPlacedByParent = z;
    }

    @Override // com.goldenboot.saga.zone.AbstractSlot
    public BridgeSerializer closePayload() {
        return broadcastPayload().purgeMetric();
    }

    /* renamed from: confirmSignature, reason: from getter */
    public final boolean getDuringAlignmentLinesQuery() {
        return this.duringAlignmentLinesQuery;
    }

    /* renamed from: detachModel, reason: from getter */
    public final ElevationNode getPerformMeasureBlock() {
        return this.performMeasureBlock;
    }

    /* renamed from: dispatchEvent, reason: from getter */
    public final boolean getPlacedOnce() {
        return this.placedOnce;
    }

    @Override // androidx.compose.ui.layout.GradientActivator
    public void dispatchLink(long position, float zIndex, BottomBarEvaluator layer) {
        decodeDigest(position, zIndex, null, layer);
    }

    @Override // com.goldenboot.saga.zone.ShadowBuilder
    /* renamed from: drawConfig, reason: from getter */
    public boolean getIsPlacedUnderMotionFrameOfReference() {
        return this.isPlacedUnderMotionFrameOfReference;
    }

    public final void emitCharset() {
        this.parentDataDirty = true;
    }

    @Override // com.goldenboot.saga.zone.AbstractSlot
    public void emitStrategy(TouchRecord block) {
        PluginScheduler measureEndpoint = broadcastPayload().measureEndpoint();
        Object[] objArr = measureEndpoint.reduceScope;
        int reduceScope = measureEndpoint.reduceScope();
        for (int i = 0; i < reduceScope; i++) {
            block.invoke(((ContentRepository) objArr[i]).getLayoutDelegate().growPayload());
        }
    }

    public final void encodeManifest(boolean forceRequest) {
        ContentRepository contentRepository;
        ContentRepository acquireAsset = broadcastPayload().acquireAsset();
        ContentRepository.ScopedMigration intrinsicsUsageByParent = broadcastPayload().getIntrinsicsUsageByParent();
        if (acquireAsset == null || intrinsicsUsageByParent == ContentRepository.ScopedMigration.connectPatch) {
            return;
        }
        do {
            contentRepository = acquireAsset;
            if (contentRepository.getIntrinsicsUsageByParent() != intrinsicsUsageByParent) {
                break;
            } else {
                acquireAsset = contentRepository.acquireAsset();
            }
        } while (acquireAsset != null);
        int i = ActivityMutator.growPayload[intrinsicsUsageByParent.ordinal()];
        if (i == 1) {
            ContentRepository.unwrapView(contentRepository, forceRequest, false, false, 6, null);
        } else {
            if (i != 2) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            contentRepository.initItem(forceRequest);
        }
    }

    public final ContentRepository.EndpointList fetchOptions() {
        return this.layoutNodeLayoutDelegate.getLayoutState();
    }

    public final void findRoute() {
        this.layoutNodeLayoutDelegate.attachCallback(true);
    }

    /* renamed from: growPool, reason: from getter */
    public final ContentRepository.ScopedMigration getMeasuredByParent() {
        return this.measuredByParent;
    }

    public final void inflateEndpoint() {
        this.placeOrder = Integer.MAX_VALUE;
        this.previousPlaceOrder = Integer.MAX_VALUE;
        scatterCounter(false);
    }

    @Override // com.goldenboot.saga.zone.AbstractSlot
    /* renamed from: injectConstraint, reason: from getter */
    public ClickDelta getAlignmentLines() {
        return this.alignmentLines;
    }

    /* renamed from: insertLocale, reason: from getter */
    public final boolean getChildDelegatesDirty() {
        return this.childDelegatesDirty;
    }

    public final void layoutDigest(ContentRepository.EndpointList endpointList) {
        this.layoutNodeLayoutDelegate.updateAction(endpointList);
    }

    public final BridgeSerializer loadSettings() {
        return this.layoutNodeLayoutDelegate.expandArgs();
    }

    @Override // androidx.compose.ui.layout.GradientActivator, com.goldenboot.saga.zone.DimenFormatter
    public int lockManifest() {
        return loadSettings().lockManifest();
    }

    /* renamed from: measureTimezone, reason: from getter */
    public final long getLastPosition() {
        return this.lastPosition;
    }

    public void mergeEvent(boolean z) {
        this.isPlacedUnderMotionFrameOfReference = z;
    }

    @Override // com.goldenboot.saga.zone.AbstractSlot
    public void normalizeRecord() {
        this.layingOutChildren = true;
        getAlignmentLines().resetDelta();
        if (this.layoutPending) {
            injectState();
        }
        if (this.layoutPendingForAlignment || (!this.duringAlignmentLinesQuery && !closePayload().getIsPlacingForAlignment() && this.layoutPending)) {
            this.layoutPending = false;
            ContentRepository.EndpointList fetchOptions = fetchOptions();
            layoutDigest(ContentRepository.EndpointList.connectPatch);
            this.layoutNodeLayoutDelegate.mapJob(false);
            ContentRepository broadcastPayload = broadcastPayload();
            MenuReceiver.injectMetric(broadcastPayload).getSnapshotObserver().releaseHeader(broadcastPayload, false, this.layoutChildrenBlock);
            layoutDigest(fetchOptions);
            if (closePayload().getIsPlacingForAlignment() && this.layoutNodeLayoutDelegate.getCoordinatesAccessedDuringPlacement()) {
                requestLayout();
            }
            this.layoutPendingForAlignment = false;
        }
        if (getAlignmentLines().getUsedDuringParentLayout()) {
            getAlignmentLines().drawRequest(true);
        }
        if (getAlignmentLines().getDirty() && getAlignmentLines().connectJob()) {
            getAlignmentLines().attachConfig();
        }
        this.layingOutChildren = false;
    }

    @Override // androidx.compose.ui.layout.GradientActivator
    public void observeView(long position, float zIndex, TouchRecord layerBlock) {
        decodeDigest(position, zIndex, layerBlock, null);
    }

    @Override // com.goldenboot.saga.zone.AbstractSlot
    public AbstractSlot offerHash() {
        NotificationBarrier layoutDelegate;
        ContentRepository acquireAsset = broadcastPayload().acquireAsset();
        if (acquireAsset == null || (layoutDelegate = acquireAsset.getLayoutDelegate()) == null) {
            return null;
        }
        return layoutDelegate.growPayload();
    }

    public final void pauseComponent() {
        this.layoutPending = true;
        this.layoutPendingForAlignment = true;
    }

    /* renamed from: peekField, reason: from getter */
    public final boolean getLayingOutChildren() {
        return this.layingOutChildren;
    }

    /* renamed from: popIndex, reason: from getter */
    public final int getPreviousPlaceOrder() {
        return this.previousPlaceOrder;
    }

    @Override // com.goldenboot.saga.zone.FrameRevision
    public int prepareCount(int height) {
        if (!StateWorkflow.evictLayout(broadcastPayload())) {
            prependBundle();
            return loadSettings().prepareCount(height);
        }
        PlatformDelegate processFormat = processFormat();
        Intrinsics.checkNotNull(processFormat);
        return processFormat.prepareCount(height);
    }

    @Override // com.goldenboot.saga.zone.BreadcrumbMerger
    public androidx.compose.ui.layout.GradientActivator prependArchive(long constraints) {
        ContentRepository.ScopedMigration intrinsicsUsageByParent = broadcastPayload().getIntrinsicsUsageByParent();
        ContentRepository.ScopedMigration scopedMigration = ContentRepository.ScopedMigration.connectPatch;
        if (intrinsicsUsageByParent == scopedMigration) {
            broadcastPayload().injectConstraint();
        }
        if (StateWorkflow.evictLayout(broadcastPayload())) {
            PlatformDelegate processFormat = processFormat();
            Intrinsics.checkNotNull(processFormat);
            processFormat.sanitizeBounds(scopedMigration);
            processFormat.prependArchive(constraints);
        }
        unpackCharset(broadcastPayload());
        saveDestination(constraints);
        return this;
    }

    @Override // com.goldenboot.saga.zone.FrameRevision
    public int protectChannel(int height) {
        if (!StateWorkflow.evictLayout(broadcastPayload())) {
            prependBundle();
            return loadSettings().protectChannel(height);
        }
        PlatformDelegate processFormat = processFormat();
        Intrinsics.checkNotNull(processFormat);
        return processFormat.protectChannel(height);
    }

    public final void releaseIndex(boolean z) {
        this.duringAlignmentLinesQuery = z;
    }

    public final void removePosition(long constraints) {
        ContentRepository.EndpointList fetchOptions = fetchOptions();
        ContentRepository.EndpointList endpointList = ContentRepository.EndpointList.resetDelta;
        if (!(fetchOptions == endpointList)) {
            PagerBridge.applyTask("layout state is not idle before measure starts");
        }
        this.performMeasureConstraints = constraints;
        ContentRepository.EndpointList endpointList2 = ContentRepository.EndpointList.reduceScope;
        layoutDigest(endpointList2);
        this.measurePending = false;
        MenuReceiver.injectMetric(broadcastPayload()).getSnapshotObserver().flushSample(broadcastPayload(), false, this.performMeasureBlock);
        if (fetchOptions() == endpointList2) {
            pauseComponent();
            layoutDigest(endpointList);
        }
    }

    /* renamed from: renderPattern, reason: from getter */
    public final boolean getIsPlacedByParent() {
        return this.isPlacedByParent;
    }

    @Override // com.goldenboot.saga.zone.AbstractSlot
    public void requestLayout() {
        ContentRepository.convertFrame(broadcastPayload(), false, 1, null);
    }

    public final PagerPlanner resolveParams() {
        if (this.measuredOnce) {
            return PagerPlanner.evictLayout(getMeasurementConstraints());
        }
        return null;
    }

    public final boolean resumeLink() {
        if ((getParentData() == null && loadSettings().getParentData() == null) || !this.parentDataDirty) {
            return false;
        }
        this.parentDataDirty = false;
        this.parentData = loadSettings().getParentData();
        return true;
    }

    @Override // com.goldenboot.saga.zone.AbstractSlot
    public void resumeOrigin() {
        ContentRepository.unwrapView(broadcastPayload(), false, false, false, 7, null);
    }

    public final void sanitizeBounds() {
        SubscriberRegulator subscriberRegulator;
        ContentRepository acquireAsset;
        try {
            this.relayoutWithoutParentInProgress = true;
            if (!this.placedOnce) {
                PagerBridge.applyTask("replace called on unplaced item");
            }
            boolean isPlaced = getIsPlaced();
            subscriberRegulator = this;
            try {
                subscriberRegulator.disconnectFormat(this.lastPosition, this.lastZIndex, this.lastLayerBlock, this.lastExplicitLayer);
                if (isPlaced && !subscriberRegulator.onNodePlacedCalled && (acquireAsset = subscriberRegulator.broadcastPayload().acquireAsset()) != null) {
                    ContentRepository.convertFrame(acquireAsset, false, 1, null);
                }
            } catch (Throwable th) {
                th = th;
                try {
                    subscriberRegulator.broadcastPayload().pauseNode(th);
                    throw new ShadowBroadcaster();
                } finally {
                    subscriberRegulator.relayoutWithoutParentInProgress = false;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            subscriberRegulator = this;
        }
    }

    public final boolean saveDestination(long constraints) {
        boolean z;
        long applyTask;
        ContentRepository broadcastPayload = broadcastPayload();
        try {
            if (broadcastPayload().getIsDeactivated()) {
                PagerBridge.flushSample("measure is called on a deactivated node");
            }
            CarouselHelper injectMetric = MenuReceiver.injectMetric(broadcastPayload());
            ContentRepository acquireAsset = broadcastPayload().acquireAsset();
            ContentRepository broadcastPayload2 = broadcastPayload();
            boolean z2 = true;
            if (!broadcastPayload().getCanMultiMeasure() && (acquireAsset == null || !acquireAsset.getCanMultiMeasure())) {
                z = false;
                broadcastPayload2.subscribeTask(z);
                if (!broadcastPayload().executeRecord() && PagerPlanner.flushSample(getMeasurementConstraints(), constraints)) {
                    CarouselHelper.cancelArchive(injectMetric, broadcastPayload(), false, 2, null);
                    broadcastPayload().escapeFooter();
                    return false;
                }
                getAlignmentLines().decodePath(false);
                emitStrategy(EndpointList.reduceScope);
                this.measuredOnce = true;
                applyTask = loadSettings().applyTask();
                connectAttr(constraints);
                removePosition(constraints);
                if (ScaleSaver.updateTimer(loadSettings().applyTask(), applyTask) && loadSettings().getWidth() == getWidth() && loadSettings().getHeight() == getHeight()) {
                    z2 = false;
                }
                wrapMessage(ScaleSaver.releaseHeader((loadSettings().getHeight() & 4294967295L) | (loadSettings().getWidth() << 32)));
                return z2;
            }
            z = true;
            broadcastPayload2.subscribeTask(z);
            if (!broadcastPayload().executeRecord()) {
                CarouselHelper.cancelArchive(injectMetric, broadcastPayload(), false, 2, null);
                broadcastPayload().escapeFooter();
                return false;
            }
            getAlignmentLines().decodePath(false);
            emitStrategy(EndpointList.reduceScope);
            this.measuredOnce = true;
            applyTask = loadSettings().applyTask();
            connectAttr(constraints);
            removePosition(constraints);
            if (ScaleSaver.updateTimer(loadSettings().applyTask(), applyTask)) {
                z2 = false;
            }
            wrapMessage(ScaleSaver.releaseHeader((loadSettings().getHeight() & 4294967295L) | (loadSettings().getWidth() << 32)));
            return z2;
        } catch (Throwable th) {
            broadcastPayload.pauseNode(th);
            throw new ShadowBroadcaster();
        }
    }

    /* renamed from: savePool, reason: from getter */
    public final float getZIndex() {
        return this.zIndex;
    }

    public void scatterCounter(boolean z) {
        this.isPlaced = z;
    }

    public final void scheduleHash() {
        this.onNodePlacedCalled = true;
        ContentRepository acquireAsset = broadcastPayload().acquireAsset();
        float zIndex = closePayload().getZIndex();
        ContentRepository broadcastPayload = broadcastPayload();
        BridgeSerializer searchHolder = broadcastPayload.searchHolder();
        BridgeSerializer purgeMetric = broadcastPayload.purgeMetric();
        while (searchHolder != purgeMetric) {
            Intrinsics.checkNotNull(searchHolder, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            ClipboardResolver clipboardResolver = (ClipboardResolver) searchHolder;
            zIndex += clipboardResolver.getZIndex();
            searchHolder = clipboardResolver.getWrapped();
        }
        if (zIndex != this.zIndex) {
            this.zIndex = zIndex;
            if (acquireAsset != null) {
                acquireAsset.pauseCurrency();
            }
            if (acquireAsset != null) {
                acquireAsset.escapeBounds();
            }
        }
        if (getIsPlaced()) {
            broadcastPayload().purgeMetric().insertToken();
        } else {
            if (acquireAsset != null) {
                acquireAsset.escapeBounds();
            }
            clipMetric();
            if (this.relayoutWithoutParentInProgress && acquireAsset != null) {
                ContentRepository.convertFrame(acquireAsset, false, 1, null);
            }
        }
        if (acquireAsset == null) {
            this.placeOrder = 0;
        } else if (!this.relayoutWithoutParentInProgress && acquireAsset.growCallback() == ContentRepository.EndpointList.connectPatch) {
            if (!(this.placeOrder == Integer.MAX_VALUE)) {
                PagerBridge.applyTask("Place was called on a node which was placed already");
            }
            this.placeOrder = acquireAsset.getLayoutDelegate().getNextChildPlaceOrder();
            NotificationBarrier layoutDelegate = acquireAsset.getLayoutDelegate();
            layoutDelegate.resolveDelta(layoutDelegate.getNextChildPlaceOrder() + 1);
        }
        normalizeRecord();
    }

    public final List<SubscriberRegulator> scheduleTemplate() {
        broadcastPayload().flushTimer();
        if (!this.childDelegatesDirty) {
            return this._childDelegates.applyTask();
        }
        ContentRepository broadcastPayload = broadcastPayload();
        PluginScheduler pluginScheduler = this._childDelegates;
        PluginScheduler measureEndpoint = broadcastPayload.measureEndpoint();
        Object[] objArr = measureEndpoint.reduceScope;
        int reduceScope = measureEndpoint.reduceScope();
        for (int i = 0; i < reduceScope; i++) {
            ContentRepository contentRepository = (ContentRepository) objArr[i];
            if (pluginScheduler.reduceScope() <= i) {
                pluginScheduler.growPayload(contentRepository.getLayoutDelegate().getMeasurePassDelegate());
            } else {
                pluginScheduler.mergeLocale(i, contentRepository.getLayoutDelegate().getMeasurePassDelegate());
            }
        }
        pluginScheduler.drawScope(broadcastPayload.appendKey().size(), pluginScheduler.reduceScope());
        this.childDelegatesDirty = false;
        return this._childDelegates.applyTask();
    }

    @Override // com.goldenboot.saga.zone.AbstractSlot
    public Map<BottomBarActivator, Integer> startResource() {
        if (!this.duringAlignmentLinesQuery) {
            if (fetchOptions() == ContentRepository.EndpointList.reduceScope) {
                getAlignmentLines().decodePath(true);
                if (getAlignmentLines().getDirty()) {
                    pauseComponent();
                }
            } else {
                getAlignmentLines().gatherAdapter(true);
            }
        }
        closePayload().emitCharset(true);
        normalizeRecord();
        closePayload().emitCharset(false);
        return getAlignmentLines().updateTimer();
    }

    @Override // com.goldenboot.saga.zone.DimenFormatter
    public int storeCharset(BottomBarActivator alignmentLine) {
        ContentRepository acquireAsset = broadcastPayload().acquireAsset();
        if ((acquireAsset != null ? acquireAsset.growCallback() : null) == ContentRepository.EndpointList.reduceScope) {
            getAlignmentLines().expandArgs(true);
        } else {
            ContentRepository acquireAsset2 = broadcastPayload().acquireAsset();
            if ((acquireAsset2 != null ? acquireAsset2.growCallback() : null) == ContentRepository.EndpointList.connectPatch) {
                getAlignmentLines().drawScope(true);
            }
        }
        this.duringAlignmentLinesQuery = true;
        int storeCharset = loadSettings().storeCharset(alignmentLine);
        this.duringAlignmentLinesQuery = false;
        return storeCharset;
    }

    public final void subscribeCounter(boolean z) {
        this.childDelegatesDirty = z;
    }

    public final void trimEntry() {
        if (this.layoutNodeLayoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            PluginScheduler measureEndpoint = broadcastPayload().measureEndpoint();
            Object[] objArr = measureEndpoint.reduceScope;
            int reduceScope = measureEndpoint.reduceScope();
            for (int i = 0; i < reduceScope; i++) {
                ContentRepository contentRepository = (ContentRepository) objArr[i];
                NotificationBarrier layoutDelegate = contentRepository.getLayoutDelegate();
                if ((layoutDelegate.getCoordinatesAccessedDuringPlacement() || layoutDelegate.getCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate.peekRevision()) {
                    ContentRepository.convertFrame(contentRepository, false, 1, null);
                }
                layoutDelegate.getMeasurePassDelegate().trimEntry();
            }
        }
    }

    /* renamed from: trimOrigin, reason: from getter */
    public final boolean getMeasurePending() {
        return this.measurePending;
    }

    @Override // com.goldenboot.saga.zone.DimenFormatter, com.goldenboot.saga.zone.FrameRevision
    /* renamed from: unlockMessage, reason: from getter */
    public Object getParentData() {
        return this.parentData;
    }

    @Override // androidx.compose.ui.layout.GradientActivator, com.goldenboot.saga.zone.DimenFormatter
    public int updateAction() {
        return loadSettings().updateAction();
    }

    public final void verifyComponent() {
        this.measurePending = true;
    }

    @Override // com.goldenboot.saga.zone.ShadowBuilder
    public void writeRequest(boolean newMFR) {
        if (newMFR != loadSettings().getIsPlacedUnderMotionFrameOfReference()) {
            loadSettings().encodeManifest(newMFR);
            this.needsCoordinatesUpdate = true;
        }
        mergeEvent(newMFR);
    }
}
