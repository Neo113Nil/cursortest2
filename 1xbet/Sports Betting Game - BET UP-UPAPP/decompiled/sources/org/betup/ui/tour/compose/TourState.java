package org.betup.ui.tour.compose;

import android.graphics.Rect;
import android.util.Log;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.local.entity.OddType;
import org.betup.ui.tour.compose.HomeTourSteps;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: TourState.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0010\u0006\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\bT\n\u0002\u0010\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010Ç\u0001\u001a\u00030È\u0001J\b\u0010É\u0001\u001a\u00030È\u0001J\u0007\u0010Ê\u0001\u001a\u00020\rJ\b\u0010ó\u0001\u001a\u00030È\u0001J\b\u0010ô\u0001\u001a\u00030È\u0001J\u0007\u0010õ\u0001\u001a\u00020\rJ\b\u0010ö\u0001\u001a\u00030È\u0001J\b\u0010÷\u0001\u001a\u00030È\u0001J\u0013\u0010ø\u0001\u001a\u00030È\u00012\u0007\u0010ù\u0001\u001a\u00020\u0005H\u0002J\u001c\u0010ú\u0001\u001a\u00030È\u00012\u0007\u0010û\u0001\u001a\u00020\u00052\u0007\u0010ü\u0001\u001a\u00020eH\u0002J\u0007\u0010ý\u0001\u001a\u00020\rJ\b\u0010þ\u0001\u001a\u00030È\u0001J\u0007\u0010ÿ\u0001\u001a\u00020\rJ\t\u0010\u0080\u0002\u001a\u0004\u0018\u00010\u0005J\b\u0010\u0081\u0002\u001a\u00030È\u0001R/\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R+\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R+\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011R+\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u001a8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR/\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010\u0004\u001a\u0004\u0018\u00010!8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R/\u0010(\u001a\u0004\u0018\u00010!2\b\u0010\u0004\u001a\u0004\u0018\u00010!8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\f\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R/\u0010,\u001a\u0004\u0018\u00010!2\b\u0010\u0004\u001a\u0004\u0018\u00010!8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010\f\u001a\u0004\b-\u0010$\"\u0004\b.\u0010&R+\u00100\u001a\u00020!2\u0006\u0010\u0004\u001a\u00020!8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R+\u00106\u001a\u00020!2\u0006\u0010\u0004\u001a\u00020!8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010\f\u001a\u0004\b7\u00102\"\u0004\b8\u00104R+\u0010:\u001a\u00020!2\u0006\u0010\u0004\u001a\u00020!8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010\f\u001a\u0004\b;\u00102\"\u0004\b<\u00104R+\u0010?\u001a\u00020>2\u0006\u0010\u0004\u001a\u00020>8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010\f\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR+\u0010E\u001a\u00020>2\u0006\u0010\u0004\u001a\u00020>8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010\f\u001a\u0004\bF\u0010A\"\u0004\bG\u0010CR+\u0010I\u001a\u00020>2\u0006\u0010\u0004\u001a\u00020>8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bL\u0010\f\u001a\u0004\bJ\u0010A\"\u0004\bK\u0010CR/\u0010M\u001a\u0004\u0018\u00010!2\b\u0010\u0004\u001a\u0004\u0018\u00010!8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bP\u0010\f\u001a\u0004\bN\u0010$\"\u0004\bO\u0010&R/\u0010Q\u001a\u0004\u0018\u00010!2\b\u0010\u0004\u001a\u0004\u0018\u00010!8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bT\u0010\f\u001a\u0004\bR\u0010$\"\u0004\bS\u0010&R/\u0010U\u001a\u0004\u0018\u00010!2\b\u0010\u0004\u001a\u0004\u0018\u00010!8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bX\u0010\f\u001a\u0004\bV\u0010$\"\u0004\bW\u0010&R/\u0010Y\u001a\u0004\u0018\u00010!2\b\u0010\u0004\u001a\u0004\u0018\u00010!8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\\\u0010\f\u001a\u0004\bZ\u0010$\"\u0004\b[\u0010&R/\u0010]\u001a\u0004\u0018\u00010!2\b\u0010\u0004\u001a\u0004\u0018\u00010!8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b`\u0010\f\u001a\u0004\b^\u0010$\"\u0004\b_\u0010&R+\u0010a\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bd\u0010\f\u001a\u0004\bb\u0010\u000f\"\u0004\bc\u0010\u0011R/\u0010f\u001a\u0004\u0018\u00010e2\b\u0010\u0004\u001a\u0004\u0018\u00010e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bk\u0010\f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR/\u0010m\u001a\u0004\u0018\u00010l2\b\u0010\u0004\u001a\u0004\u0018\u00010l8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\br\u0010\f\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR/\u0010t\u001a\u0004\u0018\u00010s2\b\u0010\u0004\u001a\u0004\u0018\u00010s8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\by\u0010\f\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR/\u0010z\u001a\u0004\u0018\u00010l2\b\u0010\u0004\u001a\u0004\u0018\u00010l8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b}\u0010\f\u001a\u0004\b{\u0010o\"\u0004\b|\u0010qR1\u0010~\u001a\u0004\u0018\u00010l2\b\u0010\u0004\u001a\u0004\u0018\u00010l8F@FX\u0086\u008e\u0002¢\u0006\u0014\n\u0005\b\u0081\u0001\u0010\f\u001a\u0004\b\u007f\u0010o\"\u0005\b\u0080\u0001\u0010qR3\u0010\u0082\u0001\u001a\u0004\u0018\u00010l2\b\u0010\u0004\u001a\u0004\u0018\u00010l8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010\f\u001a\u0005\b\u0083\u0001\u0010o\"\u0005\b\u0084\u0001\u0010qR3\u0010\u0086\u0001\u001a\u0004\u0018\u00010l2\b\u0010\u0004\u001a\u0004\u0018\u00010l8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0089\u0001\u0010\f\u001a\u0005\b\u0087\u0001\u0010o\"\u0005\b\u0088\u0001\u0010qR3\u0010\u008a\u0001\u001a\u0004\u0018\u00010l2\b\u0010\u0004\u001a\u0004\u0018\u00010l8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u008d\u0001\u0010\f\u001a\u0005\b\u008b\u0001\u0010o\"\u0005\b\u008c\u0001\u0010qR3\u0010\u008e\u0001\u001a\u0004\u0018\u00010l2\b\u0010\u0004\u001a\u0004\u0018\u00010l8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0091\u0001\u0010\f\u001a\u0005\b\u008f\u0001\u0010o\"\u0005\b\u0090\u0001\u0010qR3\u0010\u0092\u0001\u001a\u0004\u0018\u00010l2\b\u0010\u0004\u001a\u0004\u0018\u00010l8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0095\u0001\u0010\f\u001a\u0005\b\u0093\u0001\u0010o\"\u0005\b\u0094\u0001\u0010qR3\u0010\u0096\u0001\u001a\u0004\u0018\u00010l2\b\u0010\u0004\u001a\u0004\u0018\u00010l8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0099\u0001\u0010\f\u001a\u0005\b\u0097\u0001\u0010o\"\u0005\b\u0098\u0001\u0010qR3\u0010\u009a\u0001\u001a\u0004\u0018\u00010l2\b\u0010\u0004\u001a\u0004\u0018\u00010l8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u009d\u0001\u0010\f\u001a\u0005\b\u009b\u0001\u0010o\"\u0005\b\u009c\u0001\u0010qR3\u0010\u009e\u0001\u001a\u0004\u0018\u00010l2\b\u0010\u0004\u001a\u0004\u0018\u00010l8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b¡\u0001\u0010\f\u001a\u0005\b\u009f\u0001\u0010o\"\u0005\b \u0001\u0010qR3\u0010¢\u0001\u001a\u0004\u0018\u00010l2\b\u0010\u0004\u001a\u0004\u0018\u00010l8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b¥\u0001\u0010\f\u001a\u0005\b£\u0001\u0010o\"\u0005\b¤\u0001\u0010qR3\u0010¦\u0001\u001a\u0004\u0018\u00010l2\b\u0010\u0004\u001a\u0004\u0018\u00010l8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b©\u0001\u0010\f\u001a\u0005\b§\u0001\u0010o\"\u0005\b¨\u0001\u0010qR3\u0010ª\u0001\u001a\u0004\u0018\u00010l2\b\u0010\u0004\u001a\u0004\u0018\u00010l8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u00ad\u0001\u0010\f\u001a\u0005\b«\u0001\u0010o\"\u0005\b¬\u0001\u0010qR3\u0010®\u0001\u001a\u0004\u0018\u00010l2\b\u0010\u0004\u001a\u0004\u0018\u00010l8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b±\u0001\u0010\f\u001a\u0005\b¯\u0001\u0010o\"\u0005\b°\u0001\u0010qR3\u0010²\u0001\u001a\u0004\u0018\u00010l2\b\u0010\u0004\u001a\u0004\u0018\u00010l8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\bµ\u0001\u0010\f\u001a\u0005\b³\u0001\u0010o\"\u0005\b´\u0001\u0010qR3\u0010¶\u0001\u001a\u0004\u0018\u00010l2\b\u0010\u0004\u001a\u0004\u0018\u00010l8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b¹\u0001\u0010\f\u001a\u0005\b·\u0001\u0010o\"\u0005\b¸\u0001\u0010qR3\u0010º\u0001\u001a\u0004\u0018\u00010l2\b\u0010\u0004\u001a\u0004\u0018\u00010l8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b½\u0001\u0010\f\u001a\u0005\b»\u0001\u0010o\"\u0005\b¼\u0001\u0010qR/\u0010¾\u0001\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\bÀ\u0001\u0010\f\u001a\u0005\b¾\u0001\u0010\u000f\"\u0005\b¿\u0001\u0010\u0011R/\u0010Á\u0001\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\bÃ\u0001\u0010\f\u001a\u0005\bÁ\u0001\u0010\u000f\"\u0005\bÂ\u0001\u0010\u0011R/\u0010Ä\u0001\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\bÆ\u0001\u0010\f\u001a\u0005\bÄ\u0001\u0010\u000f\"\u0005\bÅ\u0001\u0010\u0011R3\u0010Ë\u0001\u001a\u0004\u0018\u00010l2\b\u0010\u0004\u001a\u0004\u0018\u00010l8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\bÎ\u0001\u0010\f\u001a\u0005\bÌ\u0001\u0010o\"\u0005\bÍ\u0001\u0010qR/\u0010Ï\u0001\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\bÑ\u0001\u0010\f\u001a\u0005\bÏ\u0001\u0010\u000f\"\u0005\bÐ\u0001\u0010\u0011R3\u0010Ò\u0001\u001a\u0004\u0018\u00010l2\b\u0010\u0004\u001a\u0004\u0018\u00010l8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\bÕ\u0001\u0010\f\u001a\u0005\bÓ\u0001\u0010o\"\u0005\bÔ\u0001\u0010qR/\u0010Ö\u0001\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\bØ\u0001\u0010\f\u001a\u0005\bÖ\u0001\u0010\u000f\"\u0005\b×\u0001\u0010\u0011R3\u0010Ù\u0001\u001a\u0004\u0018\u00010l2\b\u0010\u0004\u001a\u0004\u0018\u00010l8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\bÜ\u0001\u0010\f\u001a\u0005\bÚ\u0001\u0010o\"\u0005\bÛ\u0001\u0010qR/\u0010Ý\u0001\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\bß\u0001\u0010\f\u001a\u0005\bÝ\u0001\u0010\u000f\"\u0005\bÞ\u0001\u0010\u0011R/\u0010à\u0001\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\bã\u0001\u0010\f\u001a\u0005\bá\u0001\u0010\u000f\"\u0005\bâ\u0001\u0010\u0011R7\u0010å\u0001\u001a\u0005\u0018\u00010ä\u00012\t\u0010\u0004\u001a\u0005\u0018\u00010ä\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\bê\u0001\u0010\f\u001a\u0006\bæ\u0001\u0010ç\u0001\"\u0006\bè\u0001\u0010é\u0001R3\u0010ë\u0001\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0004\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\bî\u0001\u0010\f\u001a\u0005\bì\u0001\u0010\u001d\"\u0005\bí\u0001\u0010\u001fR3\u0010ï\u0001\u001a\u0004\u0018\u00010l2\b\u0010\u0004\u001a\u0004\u0018\u00010l8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\bò\u0001\u0010\f\u001a\u0005\bð\u0001\u0010o\"\u0005\bñ\u0001\u0010q¨\u0006\u0082\u0002"}, d2 = {"Lorg/betup/ui/tour/compose/TourState;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "<set-?>", "Lorg/betup/ui/tour/compose/TourStep;", "currentStep", "getCurrentStep", "()Lorg/betup/ui/tour/compose/TourStep;", "setCurrentStep", "(Lorg/betup/ui/tour/compose/TourStep;)V", "currentStep$delegate", "Landroidx/compose/runtime/MutableState;", "", "isTourActive", "()Z", "setTourActive", "(Z)V", "isTourActive$delegate", "isOverlayVisible", "setOverlayVisible", "isOverlayVisible$delegate", "canProceed", "getCanProceed", "setCanProceed", "canProceed$delegate", "", "tourVariant", "getTourVariant", "()Ljava/lang/String;", "setTourVariant", "(Ljava/lang/String;)V", "tourVariant$delegate", "", "tourSportId", "getTourSportId", "()Ljava/lang/Long;", "setTourSportId", "(Ljava/lang/Long;)V", "tourSportId$delegate", "tourLeagueId", "getTourLeagueId", "setTourLeagueId", "tourLeagueId$delegate", "tourMatchId", "getTourMatchId", "setTourMatchId", "tourMatchId$delegate", "tourSkipRewardBetcoins", "getTourSkipRewardBetcoins", "()J", "setTourSkipRewardBetcoins", "(J)V", "tourSkipRewardBetcoins$delegate", "tourCompleteBonusBetcoins", "getTourCompleteBonusBetcoins", "setTourCompleteBonusBetcoins", "tourCompleteBonusBetcoins$delegate", "tourDemoStakeBetcoins", "getTourDemoStakeBetcoins", "setTourDemoStakeBetcoins", "tourDemoStakeBetcoins$delegate", "", "tourCoefficientWin1", "getTourCoefficientWin1", "()D", "setTourCoefficientWin1", "(D)V", "tourCoefficientWin1$delegate", "tourCoefficientDraw", "getTourCoefficientDraw", "setTourCoefficientDraw", "tourCoefficientDraw$delegate", "tourCoefficientWin2", "getTourCoefficientWin2", "setTourCoefficientWin2", "tourCoefficientWin2$delegate", "selectedSportId", "getSelectedSportId", "setSelectedSportId", "selectedSportId$delegate", "selectedLeagueId", "getSelectedLeagueId", "setSelectedLeagueId", "selectedLeagueId$delegate", "selectedMatchId", "getSelectedMatchId", "setSelectedMatchId", "selectedMatchId$delegate", "selectedBetId", "getSelectedBetId", "setSelectedBetId", "selectedBetId$delegate", IronSourceConstants.EVENTS_REWARD_AMOUNT, "getRewardAmount", "setRewardAmount", "rewardAmount$delegate", "betWon", "getBetWon", "setBetWon", "betWon$delegate", "", "placedBetId", "getPlacedBetId", "()Ljava/lang/Integer;", "setPlacedBetId", "(Ljava/lang/Integer;)V", "placedBetId$delegate", "Landroid/graphics/Rect;", "sportsButtonBounds", "getSportsButtonBounds", "()Landroid/graphics/Rect;", "setSportsButtonBounds", "(Landroid/graphics/Rect;)V", "sportsButtonBounds$delegate", "Lorg/betup/ui/tour/compose/HomeTourSteps$SkipContext;", "homeTourSkipContext", "getHomeTourSkipContext", "()Lorg/betup/ui/tour/compose/HomeTourSteps$SkipContext;", "setHomeTourSkipContext", "(Lorg/betup/ui/tour/compose/HomeTourSteps$SkipContext;)V", "homeTourSkipContext$delegate", "homeWinRateBounds", "getHomeWinRateBounds", "setHomeWinRateBounds", "homeWinRateBounds$delegate", "homeGlobalRankBounds", "getHomeGlobalRankBounds", "setHomeGlobalRankBounds", "homeGlobalRankBounds$delegate", "homeBestStreakBounds", "getHomeBestStreakBounds", "setHomeBestStreakBounds", "homeBestStreakBounds$delegate", "specialOfferBounds", "getSpecialOfferBounds", "setSpecialOfferBounds", "specialOfferBounds$delegate", "videoRewardBounds", "getVideoRewardBounds", "setVideoRewardBounds", "videoRewardBounds$delegate", "dailyQuestsBounds", "getDailyQuestsBounds", "setDailyQuestsBounds", "dailyQuestsBounds$delegate", "battlesButtonBounds", "getBattlesButtonBounds", "setBattlesButtonBounds", "battlesButtonBounds$delegate", "competitionsButtonBounds", "getCompetitionsButtonBounds", "setCompetitionsButtonBounds", "competitionsButtonBounds$delegate", "topMatchesButtonBounds", "getTopMatchesButtonBounds", "setTopMatchesButtonBounds", "topMatchesButtonBounds$delegate", "minigamesButtonBounds", "getMinigamesButtonBounds", "setMinigamesButtonBounds", "minigamesButtonBounds$delegate", "rankingButtonBounds", "getRankingButtonBounds", "setRankingButtonBounds", "rankingButtonBounds$delegate", "tvBetButtonBounds", "getTvBetButtonBounds", "setTvBetButtonBounds", "tvBetButtonBounds$delegate", "flashBetButtonBounds", "getFlashBetButtonBounds", "setFlashBetButtonBounds", "flashBetButtonBounds$delegate", "liveArenaSectionBounds", "getLiveArenaSectionBounds", "setLiveArenaSectionBounds", "liveArenaSectionBounds$delegate", "moreMatchesSectionBounds", "getMoreMatchesSectionBounds", "setMoreMatchesSectionBounds", "moreMatchesSectionBounds$delegate", "bottomTabBounds", "getBottomTabBounds", "setBottomTabBounds", "bottomTabBounds$delegate", "sportItemBounds", "getSportItemBounds", "setSportItemBounds", "sportItemBounds$delegate", "isSportScrollComplete", "setSportScrollComplete", "isSportScrollComplete$delegate", "isHomeScrollComplete", "setHomeScrollComplete", "isHomeScrollComplete$delegate", "isDemoWinRewardDialogBlockingHomeTour", "setDemoWinRewardDialogBlockingHomeTour", "isDemoWinRewardDialogBlockingHomeTour$delegate", "onDemoWinRewardDialogShown", "", "onDemoWinRewardDialogDismissed", "isHomeTourPresentationAllowed", "leagueItemBounds", "getLeagueItemBounds", "setLeagueItemBounds", "leagueItemBounds$delegate", "isLeagueScrollComplete", "setLeagueScrollComplete", "isLeagueScrollComplete$delegate", "matchItemBounds", "getMatchItemBounds", "setMatchItemBounds", "matchItemBounds$delegate", "isMatchScrollComplete", "setMatchScrollComplete", "isMatchScrollComplete$delegate", "betSectionBounds", "getBetSectionBounds", "setBetSectionBounds", "betSectionBounds$delegate", "isBetSectionReady", "setBetSectionReady", "isBetSectionReady$delegate", "requestShowSkipDialog", "getRequestShowSkipDialog", "setRequestShowSkipDialog", "requestShowSkipDialog$delegate", "Lorg/betup/model/local/entity/OddType;", "tourSelectedOddType", "getTourSelectedOddType", "()Lorg/betup/model/local/entity/OddType;", "setTourSelectedOddType", "(Lorg/betup/model/local/entity/OddType;)V", "tourSelectedOddType$delegate", "tourSelectedDemoBet", "getTourSelectedDemoBet", "setTourSelectedDemoBet", "tourSelectedDemoBet$delegate", "baseMatchItemBounds", "getBaseMatchItemBounds", "setBaseMatchItemBounds", "baseMatchItemBounds$delegate", "startTour", "nextStep", "previousStep", "completeTour", "clearHomeHighlightBounds", "prepareHomeTourStep", "step", "advanceHomeTourStep", "anchor", "direction", "skipInvisibleHomeStepIfNeeded", "skipTour", "getIsTourActiveValue", "getCurrentStepValue", "resetTour", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TourState {
    public static final int $stable = 0;

    /* renamed from: currentStep$delegate, reason: from kotlin metadata */
    private final MutableState currentStep = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: isTourActive$delegate, reason: from kotlin metadata */
    private final MutableState isTourActive = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    /* renamed from: isOverlayVisible$delegate, reason: from kotlin metadata */
    private final MutableState isOverlayVisible = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    /* renamed from: canProceed$delegate, reason: from kotlin metadata */
    private final MutableState canProceed = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    /* renamed from: tourVariant$delegate, reason: from kotlin metadata */
    private final MutableState tourVariant = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TourConfig.TOUR_VARIANT, null, 2, null);

    /* renamed from: tourSportId$delegate, reason: from kotlin metadata */
    private final MutableState tourSportId = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: tourLeagueId$delegate, reason: from kotlin metadata */
    private final MutableState tourLeagueId = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: tourMatchId$delegate, reason: from kotlin metadata */
    private final MutableState tourMatchId = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: tourSkipRewardBetcoins$delegate, reason: from kotlin metadata */
    private final MutableState tourSkipRewardBetcoins = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(1000L, null, 2, null);

    /* renamed from: tourCompleteBonusBetcoins$delegate, reason: from kotlin metadata */
    private final MutableState tourCompleteBonusBetcoins = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(10000L, null, 2, null);

    /* renamed from: tourDemoStakeBetcoins$delegate, reason: from kotlin metadata */
    private final MutableState tourDemoStakeBetcoins = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(1000L, null, 2, null);

    /* renamed from: tourCoefficientWin1$delegate, reason: from kotlin metadata */
    private final MutableState tourCoefficientWin1 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Double.valueOf(2.2d), null, 2, null);

    /* renamed from: tourCoefficientDraw$delegate, reason: from kotlin metadata */
    private final MutableState tourCoefficientDraw = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Double.valueOf(3.5d), null, 2, null);

    /* renamed from: tourCoefficientWin2$delegate, reason: from kotlin metadata */
    private final MutableState tourCoefficientWin2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Double.valueOf(2.5d), null, 2, null);

    /* renamed from: selectedSportId$delegate, reason: from kotlin metadata */
    private final MutableState selectedSportId = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: selectedLeagueId$delegate, reason: from kotlin metadata */
    private final MutableState selectedLeagueId = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: selectedMatchId$delegate, reason: from kotlin metadata */
    private final MutableState selectedMatchId = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: selectedBetId$delegate, reason: from kotlin metadata */
    private final MutableState selectedBetId = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: rewardAmount$delegate, reason: from kotlin metadata */
    private final MutableState rewardAmount = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: betWon$delegate, reason: from kotlin metadata */
    private final MutableState betWon = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    /* renamed from: placedBetId$delegate, reason: from kotlin metadata */
    private final MutableState placedBetId = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: sportsButtonBounds$delegate, reason: from kotlin metadata */
    private final MutableState sportsButtonBounds = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: homeTourSkipContext$delegate, reason: from kotlin metadata */
    private final MutableState homeTourSkipContext = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: homeWinRateBounds$delegate, reason: from kotlin metadata */
    private final MutableState homeWinRateBounds = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: homeGlobalRankBounds$delegate, reason: from kotlin metadata */
    private final MutableState homeGlobalRankBounds = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: homeBestStreakBounds$delegate, reason: from kotlin metadata */
    private final MutableState homeBestStreakBounds = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: specialOfferBounds$delegate, reason: from kotlin metadata */
    private final MutableState specialOfferBounds = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: videoRewardBounds$delegate, reason: from kotlin metadata */
    private final MutableState videoRewardBounds = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: dailyQuestsBounds$delegate, reason: from kotlin metadata */
    private final MutableState dailyQuestsBounds = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: battlesButtonBounds$delegate, reason: from kotlin metadata */
    private final MutableState battlesButtonBounds = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: competitionsButtonBounds$delegate, reason: from kotlin metadata */
    private final MutableState competitionsButtonBounds = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: topMatchesButtonBounds$delegate, reason: from kotlin metadata */
    private final MutableState topMatchesButtonBounds = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: minigamesButtonBounds$delegate, reason: from kotlin metadata */
    private final MutableState minigamesButtonBounds = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: rankingButtonBounds$delegate, reason: from kotlin metadata */
    private final MutableState rankingButtonBounds = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: tvBetButtonBounds$delegate, reason: from kotlin metadata */
    private final MutableState tvBetButtonBounds = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: flashBetButtonBounds$delegate, reason: from kotlin metadata */
    private final MutableState flashBetButtonBounds = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: liveArenaSectionBounds$delegate, reason: from kotlin metadata */
    private final MutableState liveArenaSectionBounds = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: moreMatchesSectionBounds$delegate, reason: from kotlin metadata */
    private final MutableState moreMatchesSectionBounds = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: bottomTabBounds$delegate, reason: from kotlin metadata */
    private final MutableState bottomTabBounds = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: sportItemBounds$delegate, reason: from kotlin metadata */
    private final MutableState sportItemBounds = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: isSportScrollComplete$delegate, reason: from kotlin metadata */
    private final MutableState isSportScrollComplete = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    /* renamed from: isHomeScrollComplete$delegate, reason: from kotlin metadata */
    private final MutableState isHomeScrollComplete = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    /* renamed from: isDemoWinRewardDialogBlockingHomeTour$delegate, reason: from kotlin metadata */
    private final MutableState isDemoWinRewardDialogBlockingHomeTour = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    /* renamed from: leagueItemBounds$delegate, reason: from kotlin metadata */
    private final MutableState leagueItemBounds = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: isLeagueScrollComplete$delegate, reason: from kotlin metadata */
    private final MutableState isLeagueScrollComplete = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    /* renamed from: matchItemBounds$delegate, reason: from kotlin metadata */
    private final MutableState matchItemBounds = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: isMatchScrollComplete$delegate, reason: from kotlin metadata */
    private final MutableState isMatchScrollComplete = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    /* renamed from: betSectionBounds$delegate, reason: from kotlin metadata */
    private final MutableState betSectionBounds = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: isBetSectionReady$delegate, reason: from kotlin metadata */
    private final MutableState isBetSectionReady = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    /* renamed from: requestShowSkipDialog$delegate, reason: from kotlin metadata */
    private final MutableState requestShowSkipDialog = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    /* renamed from: tourSelectedOddType$delegate, reason: from kotlin metadata */
    private final MutableState tourSelectedOddType = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: tourSelectedDemoBet$delegate, reason: from kotlin metadata */
    private final MutableState tourSelectedDemoBet = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: baseMatchItemBounds$delegate, reason: from kotlin metadata */
    private final MutableState baseMatchItemBounds = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* compiled from: TourState.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TourStep.values().length];
            try {
                iArr[TourStep.WELCOME_INTRO_V2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TourStep.CHOOSE_FAVORITE_SPORTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TourStep.CHOOSE_ODDS_FORMAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TourStep.DEMO_MATCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TourStep.DEMO_BET_CONFIRM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TourStep.DEMO_MATCH_SIMULATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TourStep.DEMO_MATCH_WON.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TourStep.CLICK_HOME_WIN_RATE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TourStep.CLICK_HOME_GLOBAL_RANK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[TourStep.CLICK_HOME_BEST_STREAK.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[TourStep.CLICK_SPECIAL_OFFER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[TourStep.CLICK_VIDEO_REWARD.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[TourStep.CLICK_DAILY_QUESTS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[TourStep.CLICK_COMPETITIONS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[TourStep.CLICK_BATTLES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[TourStep.CLICK_MINIGAMES.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[TourStep.CLICK_LIVE_ARENA.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[TourStep.CLICK_TOP_MATCHES.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[TourStep.CLICK_RANKING.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[TourStep.CLICK_FLASH_BET.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[TourStep.CLICK_TV_BET.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[TourStep.CLICK_BOTTOM_SPORTS.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[TourStep.CLICK_BOTTOM_MY_BETS.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[TourStep.CLICK_BOTTOM_SHOP.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[TourStep.CLICK_BOTTOM_MENU.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[TourStep.WELCOME_2.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[TourStep.WELCOME_1.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[TourStep.CLICK_SPORT.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[TourStep.SELECT_SPORT.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[TourStep.SELECT_LEAGUE.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[TourStep.SELECT_MATCH.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[TourStep.SELECT_BET.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[TourStep.PLACE_BET.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[TourStep.BET_PLACED.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[TourStep.BET_WON.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[TourStep.COMPLETED.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TourStep getCurrentStep() {
        return (TourStep) this.currentStep.getValue();
    }

    public final void setCurrentStep(TourStep tourStep) {
        this.currentStep.setValue(tourStep);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isTourActive() {
        return ((Boolean) this.isTourActive.getValue()).booleanValue();
    }

    public final void setTourActive(boolean z) {
        this.isTourActive.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isOverlayVisible() {
        return ((Boolean) this.isOverlayVisible.getValue()).booleanValue();
    }

    public final void setOverlayVisible(boolean z) {
        this.isOverlayVisible.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getCanProceed() {
        return ((Boolean) this.canProceed.getValue()).booleanValue();
    }

    public final void setCanProceed(boolean z) {
        this.canProceed.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getTourVariant() {
        return (String) this.tourVariant.getValue();
    }

    public final void setTourVariant(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tourVariant.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Long getTourSportId() {
        return (Long) this.tourSportId.getValue();
    }

    public final void setTourSportId(Long l) {
        this.tourSportId.setValue(l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Long getTourLeagueId() {
        return (Long) this.tourLeagueId.getValue();
    }

    public final void setTourLeagueId(Long l) {
        this.tourLeagueId.setValue(l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Long getTourMatchId() {
        return (Long) this.tourMatchId.getValue();
    }

    public final void setTourMatchId(Long l) {
        this.tourMatchId.setValue(l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long getTourSkipRewardBetcoins() {
        return ((Number) this.tourSkipRewardBetcoins.getValue()).longValue();
    }

    public final void setTourSkipRewardBetcoins(long j) {
        this.tourSkipRewardBetcoins.setValue(Long.valueOf(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long getTourCompleteBonusBetcoins() {
        return ((Number) this.tourCompleteBonusBetcoins.getValue()).longValue();
    }

    public final void setTourCompleteBonusBetcoins(long j) {
        this.tourCompleteBonusBetcoins.setValue(Long.valueOf(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long getTourDemoStakeBetcoins() {
        return ((Number) this.tourDemoStakeBetcoins.getValue()).longValue();
    }

    public final void setTourDemoStakeBetcoins(long j) {
        this.tourDemoStakeBetcoins.setValue(Long.valueOf(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final double getTourCoefficientWin1() {
        return ((Number) this.tourCoefficientWin1.getValue()).doubleValue();
    }

    public final void setTourCoefficientWin1(double d) {
        this.tourCoefficientWin1.setValue(Double.valueOf(d));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final double getTourCoefficientDraw() {
        return ((Number) this.tourCoefficientDraw.getValue()).doubleValue();
    }

    public final void setTourCoefficientDraw(double d) {
        this.tourCoefficientDraw.setValue(Double.valueOf(d));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final double getTourCoefficientWin2() {
        return ((Number) this.tourCoefficientWin2.getValue()).doubleValue();
    }

    public final void setTourCoefficientWin2(double d) {
        this.tourCoefficientWin2.setValue(Double.valueOf(d));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Long getSelectedSportId() {
        return (Long) this.selectedSportId.getValue();
    }

    public final void setSelectedSportId(Long l) {
        this.selectedSportId.setValue(l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Long getSelectedLeagueId() {
        return (Long) this.selectedLeagueId.getValue();
    }

    public final void setSelectedLeagueId(Long l) {
        this.selectedLeagueId.setValue(l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Long getSelectedMatchId() {
        return (Long) this.selectedMatchId.getValue();
    }

    public final void setSelectedMatchId(Long l) {
        this.selectedMatchId.setValue(l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Long getSelectedBetId() {
        return (Long) this.selectedBetId.getValue();
    }

    public final void setSelectedBetId(Long l) {
        this.selectedBetId.setValue(l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Long getRewardAmount() {
        return (Long) this.rewardAmount.getValue();
    }

    public final void setRewardAmount(Long l) {
        this.rewardAmount.setValue(l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getBetWon() {
        return ((Boolean) this.betWon.getValue()).booleanValue();
    }

    public final void setBetWon(boolean z) {
        this.betWon.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Integer getPlacedBetId() {
        return (Integer) this.placedBetId.getValue();
    }

    public final void setPlacedBetId(Integer num) {
        this.placedBetId.setValue(num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Rect getSportsButtonBounds() {
        return (Rect) this.sportsButtonBounds.getValue();
    }

    public final void setSportsButtonBounds(Rect rect) {
        this.sportsButtonBounds.setValue(rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final HomeTourSteps.SkipContext getHomeTourSkipContext() {
        return (HomeTourSteps.SkipContext) this.homeTourSkipContext.getValue();
    }

    public final void setHomeTourSkipContext(HomeTourSteps.SkipContext skipContext) {
        this.homeTourSkipContext.setValue(skipContext);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Rect getHomeWinRateBounds() {
        return (Rect) this.homeWinRateBounds.getValue();
    }

    public final void setHomeWinRateBounds(Rect rect) {
        this.homeWinRateBounds.setValue(rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Rect getHomeGlobalRankBounds() {
        return (Rect) this.homeGlobalRankBounds.getValue();
    }

    public final void setHomeGlobalRankBounds(Rect rect) {
        this.homeGlobalRankBounds.setValue(rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Rect getHomeBestStreakBounds() {
        return (Rect) this.homeBestStreakBounds.getValue();
    }

    public final void setHomeBestStreakBounds(Rect rect) {
        this.homeBestStreakBounds.setValue(rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Rect getSpecialOfferBounds() {
        return (Rect) this.specialOfferBounds.getValue();
    }

    public final void setSpecialOfferBounds(Rect rect) {
        this.specialOfferBounds.setValue(rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Rect getVideoRewardBounds() {
        return (Rect) this.videoRewardBounds.getValue();
    }

    public final void setVideoRewardBounds(Rect rect) {
        this.videoRewardBounds.setValue(rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Rect getDailyQuestsBounds() {
        return (Rect) this.dailyQuestsBounds.getValue();
    }

    public final void setDailyQuestsBounds(Rect rect) {
        this.dailyQuestsBounds.setValue(rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Rect getBattlesButtonBounds() {
        return (Rect) this.battlesButtonBounds.getValue();
    }

    public final void setBattlesButtonBounds(Rect rect) {
        this.battlesButtonBounds.setValue(rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Rect getCompetitionsButtonBounds() {
        return (Rect) this.competitionsButtonBounds.getValue();
    }

    public final void setCompetitionsButtonBounds(Rect rect) {
        this.competitionsButtonBounds.setValue(rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Rect getTopMatchesButtonBounds() {
        return (Rect) this.topMatchesButtonBounds.getValue();
    }

    public final void setTopMatchesButtonBounds(Rect rect) {
        this.topMatchesButtonBounds.setValue(rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Rect getMinigamesButtonBounds() {
        return (Rect) this.minigamesButtonBounds.getValue();
    }

    public final void setMinigamesButtonBounds(Rect rect) {
        this.minigamesButtonBounds.setValue(rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Rect getRankingButtonBounds() {
        return (Rect) this.rankingButtonBounds.getValue();
    }

    public final void setRankingButtonBounds(Rect rect) {
        this.rankingButtonBounds.setValue(rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Rect getTvBetButtonBounds() {
        return (Rect) this.tvBetButtonBounds.getValue();
    }

    public final void setTvBetButtonBounds(Rect rect) {
        this.tvBetButtonBounds.setValue(rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Rect getFlashBetButtonBounds() {
        return (Rect) this.flashBetButtonBounds.getValue();
    }

    public final void setFlashBetButtonBounds(Rect rect) {
        this.flashBetButtonBounds.setValue(rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Rect getLiveArenaSectionBounds() {
        return (Rect) this.liveArenaSectionBounds.getValue();
    }

    public final void setLiveArenaSectionBounds(Rect rect) {
        this.liveArenaSectionBounds.setValue(rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Rect getMoreMatchesSectionBounds() {
        return (Rect) this.moreMatchesSectionBounds.getValue();
    }

    public final void setMoreMatchesSectionBounds(Rect rect) {
        this.moreMatchesSectionBounds.setValue(rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Rect getBottomTabBounds() {
        return (Rect) this.bottomTabBounds.getValue();
    }

    public final void setBottomTabBounds(Rect rect) {
        this.bottomTabBounds.setValue(rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Rect getSportItemBounds() {
        return (Rect) this.sportItemBounds.getValue();
    }

    public final void setSportItemBounds(Rect rect) {
        this.sportItemBounds.setValue(rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isSportScrollComplete() {
        return ((Boolean) this.isSportScrollComplete.getValue()).booleanValue();
    }

    public final void setSportScrollComplete(boolean z) {
        this.isSportScrollComplete.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isHomeScrollComplete() {
        return ((Boolean) this.isHomeScrollComplete.getValue()).booleanValue();
    }

    public final void setHomeScrollComplete(boolean z) {
        this.isHomeScrollComplete.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDemoWinRewardDialogBlockingHomeTour() {
        return ((Boolean) this.isDemoWinRewardDialogBlockingHomeTour.getValue()).booleanValue();
    }

    public final void setDemoWinRewardDialogBlockingHomeTour(boolean z) {
        this.isDemoWinRewardDialogBlockingHomeTour.setValue(Boolean.valueOf(z));
    }

    public final void onDemoWinRewardDialogShown() {
        setDemoWinRewardDialogBlockingHomeTour(true);
    }

    public final void onDemoWinRewardDialogDismissed() {
        setDemoWinRewardDialogBlockingHomeTour(false);
    }

    public final boolean isHomeTourPresentationAllowed() {
        return !isDemoWinRewardDialogBlockingHomeTour();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Rect getLeagueItemBounds() {
        return (Rect) this.leagueItemBounds.getValue();
    }

    public final void setLeagueItemBounds(Rect rect) {
        this.leagueItemBounds.setValue(rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isLeagueScrollComplete() {
        return ((Boolean) this.isLeagueScrollComplete.getValue()).booleanValue();
    }

    public final void setLeagueScrollComplete(boolean z) {
        this.isLeagueScrollComplete.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Rect getMatchItemBounds() {
        return (Rect) this.matchItemBounds.getValue();
    }

    public final void setMatchItemBounds(Rect rect) {
        this.matchItemBounds.setValue(rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isMatchScrollComplete() {
        return ((Boolean) this.isMatchScrollComplete.getValue()).booleanValue();
    }

    public final void setMatchScrollComplete(boolean z) {
        this.isMatchScrollComplete.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Rect getBetSectionBounds() {
        return (Rect) this.betSectionBounds.getValue();
    }

    public final void setBetSectionBounds(Rect rect) {
        this.betSectionBounds.setValue(rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isBetSectionReady() {
        return ((Boolean) this.isBetSectionReady.getValue()).booleanValue();
    }

    public final void setBetSectionReady(boolean z) {
        this.isBetSectionReady.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getRequestShowSkipDialog() {
        return ((Boolean) this.requestShowSkipDialog.getValue()).booleanValue();
    }

    public final void setRequestShowSkipDialog(boolean z) {
        this.requestShowSkipDialog.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final OddType getTourSelectedOddType() {
        return (OddType) this.tourSelectedOddType.getValue();
    }

    public final void setTourSelectedOddType(OddType oddType) {
        this.tourSelectedOddType.setValue(oddType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getTourSelectedDemoBet() {
        return (String) this.tourSelectedDemoBet.getValue();
    }

    public final void setTourSelectedDemoBet(String str) {
        this.tourSelectedDemoBet.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Rect getBaseMatchItemBounds() {
        return (Rect) this.baseMatchItemBounds.getValue();
    }

    public final void setBaseMatchItemBounds(Rect rect) {
        this.baseMatchItemBounds.setValue(rect);
    }

    public final void startTour() {
        Log.d("TourFlow", "TourState - startTour() called, tourVariant=" + getTourVariant());
        setTourActive(true);
        setCurrentStep(Intrinsics.areEqual(getTourVariant(), TourConfig.TOUR_VARIANT) ? TourStep.WELCOME_INTRO_V2 : TourStep.WELCOME_1);
        setOverlayVisible(true);
        setCanProceed(false);
        Log.d("TourFlow", "TourState - Tour started - isTourActive: " + isTourActive() + ", isOverlayVisible: " + isOverlayVisible() + ", currentStep: " + getCurrentStep());
    }

    public final void nextStep() {
        TourStep currentStep = getCurrentStep();
        if (currentStep == TourStep.WELCOME_INTRO_V2) {
            setCurrentStep(TourStep.CHOOSE_FAVORITE_SPORTS);
            setCanProceed(false);
            setOverlayVisible(true);
        } else if (currentStep == TourStep.CHOOSE_FAVORITE_SPORTS) {
            setCurrentStep(TourStep.CHOOSE_ODDS_FORMAT);
            setCanProceed(false);
            setOverlayVisible(true);
        } else if (currentStep == TourStep.CHOOSE_ODDS_FORMAT) {
            setCurrentStep(TourStep.DEMO_MATCH);
            setCanProceed(false);
            setOverlayVisible(true);
        } else if (currentStep == TourStep.DEMO_MATCH) {
            setCurrentStep(TourStep.DEMO_BET_CONFIRM);
            setCanProceed(false);
            setOverlayVisible(true);
        } else if (currentStep == TourStep.DEMO_BET_CONFIRM) {
            setCurrentStep(TourStep.DEMO_MATCH_SIMULATION);
        } else if (currentStep == TourStep.DEMO_MATCH_SIMULATION) {
            setCurrentStep(TourStep.DEMO_MATCH_WON);
            onDemoWinRewardDialogShown();
        } else if (currentStep == TourStep.DEMO_MATCH_WON) {
            onDemoWinRewardDialogDismissed();
            advanceHomeTourStep(TourStep.DEMO_MATCH_WON, 1);
        } else if (currentStep != null && HomeTourSteps.INSTANCE.isHomeV2HighlightStep(currentStep)) {
            advanceHomeTourStep(currentStep, 1);
        } else {
            TourStep[] values = TourStep.values();
            TourStep currentStep2 = getCurrentStep();
            int indexOf = currentStep2 != null ? ArraysKt.indexOf(values, currentStep2) : -1;
            if (indexOf >= 0 && indexOf < values.length - 1) {
                setCurrentStep(values[indexOf + 1]);
                setCanProceed(false);
                if (getCurrentStep() == TourStep.SELECT_SPORT || getCurrentStep() == TourStep.SELECT_LEAGUE || getCurrentStep() == TourStep.SELECT_MATCH) {
                    setOverlayVisible(true);
                    Log.d("TourFlow", "TourState - Moved to " + getCurrentStep() + " - showing overlay");
                } else if (getCurrentStep() == TourStep.SELECT_BET) {
                    setOverlayVisible(true);
                    Log.d("TourFlow", "TourState - Moved to SELECT_BET - overlay will be shown in MatchDetailsScreen");
                }
                if (getCurrentStep() == TourStep.SELECT_SPORT) {
                    setSportScrollComplete(false);
                    Log.d("TourFlow", "TourState - Moved to SELECT_SPORT - reset isSportScrollComplete, isOverlayVisible: " + isOverlayVisible());
                }
                if (getCurrentStep() == TourStep.SELECT_LEAGUE) {
                    setLeagueScrollComplete(false);
                    Log.d("TourFlow", "TourState - Moved to SELECT_LEAGUE - reset isLeagueScrollComplete, isOverlayVisible: " + isOverlayVisible());
                }
                if (getCurrentStep() == TourStep.SELECT_MATCH) {
                    setMatchScrollComplete(false);
                    Log.d("TourFlow", "TourState - Moved to SELECT_MATCH - reset isMatchScrollComplete, isOverlayVisible: " + isOverlayVisible());
                }
                if (getCurrentStep() == TourStep.SELECT_BET) {
                    setBetSectionReady(false);
                    Log.d("TourFlow", "TourState - Moved to SELECT_BET - reset isBetSectionReady, isOverlayVisible: " + isOverlayVisible());
                }
                if (getCurrentStep() == TourStep.BET_PLACED) {
                    setCanProceed(false);
                    setOverlayVisible(true);
                    Log.d("TourFlow", "TourState - Moved to BET_PLACED - reset canProceed, isOverlayVisible: " + isOverlayVisible());
                }
            }
        }
        Log.d("TourFlow", "TourState - nextStep: " + currentStep + " -> " + getCurrentStep() + ", isOverlayVisible: " + isOverlayVisible());
    }

    public final boolean previousStep() {
        TourStep tourStep;
        TourStep currentStep = getCurrentStep();
        boolean z = false;
        if (currentStep == null) {
            return false;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[currentStep.ordinal()]) {
            case 1:
                return z;
            case 2:
                tourStep = TourStep.WELCOME_INTRO_V2;
                break;
            case 3:
                tourStep = TourStep.CHOOSE_FAVORITE_SPORTS;
                break;
            case 4:
                tourStep = TourStep.CHOOSE_ODDS_FORMAT;
                break;
            case 5:
                tourStep = TourStep.DEMO_MATCH;
                break;
            case 6:
                tourStep = TourStep.DEMO_BET_CONFIRM;
                break;
            case 7:
                tourStep = TourStep.DEMO_MATCH_SIMULATION;
                break;
            case 8:
                tourStep = TourStep.DEMO_MATCH_WON;
                break;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                HomeTourSteps.SkipContext homeTourSkipContext = getHomeTourSkipContext();
                tourStep = homeTourSkipContext != null ? HomeTourSteps.INSTANCE.advanceFrom(currentStep, -1, homeTourSkipContext) : null;
                if (tourStep == null) {
                    tourStep = TourStep.DEMO_MATCH_WON;
                    break;
                }
                break;
            case 22:
                HomeTourSteps.SkipContext homeTourSkipContext2 = getHomeTourSkipContext();
                if (homeTourSkipContext2 == null || (tourStep = HomeTourSteps.INSTANCE.advanceFrom(currentStep, -1, homeTourSkipContext2)) == null) {
                    tourStep = TourStep.CLICK_TV_BET;
                    break;
                }
                break;
            case 23:
                tourStep = TourStep.CLICK_BOTTOM_SPORTS;
                break;
            case 24:
                tourStep = TourStep.CLICK_BOTTOM_MY_BETS;
                break;
            case 25:
                tourStep = TourStep.CLICK_BOTTOM_SHOP;
                break;
            case 26:
                if (!Intrinsics.areEqual(getTourVariant(), TourConfig.TOUR_VARIANT)) {
                    tourStep = TourStep.WELCOME_1;
                    break;
                } else {
                    tourStep = TourStep.CLICK_BOTTOM_MENU;
                    break;
                }
            case 27:
                return false;
            case 28:
                tourStep = TourStep.WELCOME_2;
                break;
            case 29:
                tourStep = TourStep.CLICK_SPORT;
                break;
            case 30:
                tourStep = TourStep.SELECT_SPORT;
                break;
            case 31:
                tourStep = TourStep.SELECT_LEAGUE;
                break;
            case 32:
                tourStep = TourStep.SELECT_MATCH;
                break;
            case 33:
                tourStep = TourStep.SELECT_BET;
                break;
            case 34:
                tourStep = TourStep.PLACE_BET;
                break;
            case 35:
                tourStep = TourStep.BET_PLACED;
                break;
            case 36:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
        setCurrentStep(tourStep);
        setCanProceed(false);
        z = true;
        setOverlayVisible(true);
        if (tourStep == TourStep.DEMO_MATCH_WON) {
            onDemoWinRewardDialogShown();
        } else if (HomeTourSteps.INSTANCE.isHomeV2HighlightStep(tourStep)) {
            onDemoWinRewardDialogDismissed();
            prepareHomeTourStep(tourStep);
        }
        Log.d("TourFlow", "TourState - previousStep: " + currentStep + " -> " + tourStep);
        return z;
    }

    public final void completeTour() {
        setTourActive(false);
        setCurrentStep(TourStep.COMPLETED);
        setOverlayVisible(false);
    }

    public final void clearHomeHighlightBounds() {
        setHomeWinRateBounds(null);
        setHomeGlobalRankBounds(null);
        setHomeBestStreakBounds(null);
        setSpecialOfferBounds(null);
        setVideoRewardBounds(null);
        setDailyQuestsBounds(null);
        setCompetitionsButtonBounds(null);
        setBattlesButtonBounds(null);
        setMinigamesButtonBounds(null);
        setTopMatchesButtonBounds(null);
        setRankingButtonBounds(null);
        setTvBetButtonBounds(null);
        setFlashBetButtonBounds(null);
        setLiveArenaSectionBounds(null);
        setMoreMatchesSectionBounds(null);
    }

    private final void prepareHomeTourStep(TourStep step) {
        clearHomeHighlightBounds();
        if (HomeTourScroll.INSTANCE.isBottomTabStep(step)) {
            setBottomTabBounds(null);
            setHomeScrollComplete(true);
        } else if (HomeTourScroll.INSTANCE.requiresScroll(step)) {
            setHomeScrollComplete(false);
        } else {
            setHomeScrollComplete(true);
        }
    }

    private final void advanceHomeTourStep(TourStep anchor, int direction) {
        HomeTourSteps.SkipContext homeTourSkipContext = getHomeTourSkipContext();
        TourStep advanceFrom = homeTourSkipContext != null ? HomeTourSteps.INSTANCE.advanceFrom(anchor, direction, homeTourSkipContext) : null;
        if (advanceFrom != null) {
            setCurrentStep(advanceFrom);
            setCanProceed(false);
            setOverlayVisible(true);
            prepareHomeTourStep(advanceFrom);
            return;
        }
        if (direction > 0) {
            setCurrentStep(TourStep.CLICK_BOTTOM_SPORTS);
            setCanProceed(false);
            setOverlayVisible(true);
            prepareHomeTourStep(TourStep.CLICK_BOTTOM_SPORTS);
        }
    }

    public final boolean skipInvisibleHomeStepIfNeeded() {
        TourStep currentStep;
        HomeTourSteps.SkipContext homeTourSkipContext;
        TourStep advanceFrom;
        if (isDemoWinRewardDialogBlockingHomeTour() || (currentStep = getCurrentStep()) == null || (homeTourSkipContext = getHomeTourSkipContext()) == null || !HomeTourSteps.INSTANCE.shouldSkipStep(currentStep, homeTourSkipContext) || (advanceFrom = HomeTourSteps.INSTANCE.advanceFrom(currentStep, 1, homeTourSkipContext)) == null) {
            return false;
        }
        setCurrentStep(advanceFrom);
        setCanProceed(false);
        setOverlayVisible(true);
        prepareHomeTourStep(advanceFrom);
        return true;
    }

    public final void skipTour() {
        setTourActive(false);
        setCurrentStep(null);
        setOverlayVisible(false);
        setDemoWinRewardDialogBlockingHomeTour(false);
        setTourSelectedOddType(null);
        setTourSelectedDemoBet(null);
    }

    public final boolean getIsTourActiveValue() {
        return isTourActive();
    }

    public final TourStep getCurrentStepValue() {
        return getCurrentStep();
    }

    public final void resetTour() {
        Log.d("TourFlow", "TourState - resetTour() called - resetting tour state");
        setTourActive(false);
        setCurrentStep(null);
        setOverlayVisible(false);
        setDemoWinRewardDialogBlockingHomeTour(false);
        setCanProceed(false);
        setSelectedSportId(null);
        setSelectedLeagueId(null);
        setSelectedMatchId(null);
        setSelectedBetId(null);
        setRewardAmount(null);
        setBetWon(false);
        setTourSelectedOddType(null);
        setTourSelectedDemoBet(null);
        setSportScrollComplete(false);
        setHomeScrollComplete(false);
        setLeagueScrollComplete(false);
        setMatchScrollComplete(false);
        setBetSectionReady(false);
    }
}
