package io.github.sabpaisaandroid.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.t;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0003\b¨\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bñ\u0003\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010,J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010 \u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¢\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010£\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¤\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¥\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¦\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010§\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¨\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010©\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jö\u0003\u0010ª\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u000b\u0010«\u0001\u001a\u00030¬\u0001HÖ\u0001J\u0017\u0010\u00ad\u0001\u001a\u00030®\u00012\n\u0010¯\u0001\u001a\u0005\u0018\u00010°\u0001HÖ\u0003J\u000b\u0010±\u0001\u001a\u00030¬\u0001HÖ\u0001J\n\u0010²\u0001\u001a\u00020\u0003HÖ\u0001J\u001f\u0010³\u0001\u001a\u00030´\u00012\b\u0010µ\u0001\u001a\u00030¶\u00012\b\u0010·\u0001\u001a\u00030¬\u0001HÖ\u0001R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010.\"\u0004\b2\u00100R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010.\"\u0004\b4\u00100R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010.\"\u0004\b6\u00100R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010.\"\u0004\b8\u00100R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010.\"\u0004\b:\u00100R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010.\"\u0004\b<\u00100R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010.\"\u0004\b>\u00100R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010.\"\u0004\b@\u00100R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010.\"\u0004\bB\u00100R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010.\"\u0004\bD\u00100R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010.\"\u0004\bF\u00100R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010.\"\u0004\bH\u00100R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010.\"\u0004\bJ\u00100R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010.\"\u0004\bL\u00100R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010.\"\u0004\bN\u00100R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010.\"\u0004\bP\u00100R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010.\"\u0004\bR\u00100R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010.\"\u0004\bT\u00100R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010.\"\u0004\bV\u00100R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010.\"\u0004\bX\u00100R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010.\"\u0004\bZ\u00100R\u001c\u0010!\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010.\"\u0004\b\\\u00100R\u001c\u0010\"\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010.\"\u0004\b^\u00100R\u001c\u0010#\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010.\"\u0004\b`\u00100R\u001c\u0010$\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010.\"\u0004\bb\u00100R\u001c\u0010%\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010.\"\u0004\bd\u00100R\u001c\u0010&\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010.\"\u0004\bf\u00100R\u001c\u0010'\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010.\"\u0004\bh\u00100R\u001c\u0010(\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010.\"\u0004\bj\u00100R\u001c\u0010)\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010.\"\u0004\bl\u00100R\u001c\u0010*\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010.\"\u0004\bn\u00100R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010.\"\u0004\bp\u00100R\u001c\u0010+\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010.\"\u0004\br\u00100R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010.\"\u0004\bt\u00100R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bu\u0010.\"\u0004\bv\u00100R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010.\"\u0004\bx\u00100R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010.\"\u0004\bz\u00100R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010.\"\u0004\b|\u00100R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u0010.\"\u0004\b~\u00100R\u001d\u0010 \u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010.\"\u0005\b\u0080\u0001\u00100¨\u0006¸\u0001"}, d2 = {"Lio/github/sabpaisaandroid/models/TransactionResponsesModel;", "Landroid/os/Parcelable;", "payerName", "", "payerEmail", "payerMobile", "clientTxnId", "payerAddress", "amount", "clientCode", "paidAmount", "paymentMode", "bankName", "amountType", NotificationCompat.CATEGORY_STATUS, "statusCode", "challanNumber", "sabpaisaTxnId", "sabpaisaMessage", "bankMessage", "bankErrorCode", "sabpaisaErrorCode", "bankTxnId", "transDate", "udf1", "udf2", "udf3", "udf4", "udf5", "udf6", "udf7", "udf8", "udf9", "udf10", "udf11", "udf12", "udf13", "udf14", "udf15", "udf16", "udf17", "udf18", "udf19", "udf20", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "setAmount", "(Ljava/lang/String;)V", "getAmountType", "setAmountType", "getBankErrorCode", "setBankErrorCode", "getBankMessage", "setBankMessage", "getBankName", "setBankName", "getBankTxnId", "setBankTxnId", "getChallanNumber", "setChallanNumber", "getClientCode", "setClientCode", "getClientTxnId", "setClientTxnId", "getPaidAmount", "setPaidAmount", "getPayerAddress", "setPayerAddress", "getPayerEmail", "setPayerEmail", "getPayerMobile", "setPayerMobile", "getPayerName", "setPayerName", "getPaymentMode", "setPaymentMode", "getSabpaisaErrorCode", "setSabpaisaErrorCode", "getSabpaisaMessage", "setSabpaisaMessage", "getSabpaisaTxnId", "setSabpaisaTxnId", "getStatus", "setStatus", "getStatusCode", "setStatusCode", "getTransDate", "setTransDate", "getUdf1", "setUdf1", "getUdf10", "setUdf10", "getUdf11", "setUdf11", "getUdf12", "setUdf12", "getUdf13", "setUdf13", "getUdf14", "setUdf14", "getUdf15", "setUdf15", "getUdf16", "setUdf16", "getUdf17", "setUdf17", "getUdf18", "setUdf18", "getUdf19", "setUdf19", "getUdf2", "setUdf2", "getUdf20", "setUdf20", "getUdf3", "setUdf3", "getUdf4", "setUdf4", "getUdf5", "setUdf5", "getUdf6", "setUdf6", "getUdf7", "setUdf7", "getUdf8", "setUdf8", "getUdf9", "setUdf9", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "gatewayAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransactionResponsesModel implements Parcelable {
    public static final Parcelable.Creator<TransactionResponsesModel> CREATOR = new a();
    private String amount;
    private String amountType;
    private String bankErrorCode;
    private String bankMessage;
    private String bankName;
    private String bankTxnId;
    private String challanNumber;
    private String clientCode;
    private String clientTxnId;
    private String paidAmount;
    private String payerAddress;
    private String payerEmail;
    private String payerMobile;
    private String payerName;
    private String paymentMode;
    private String sabpaisaErrorCode;
    private String sabpaisaMessage;
    private String sabpaisaTxnId;
    private String status;
    private String statusCode;
    private String transDate;
    private String udf1;
    private String udf10;
    private String udf11;
    private String udf12;
    private String udf13;
    private String udf14;
    private String udf15;
    private String udf16;
    private String udf17;
    private String udf18;
    private String udf19;
    private String udf2;
    private String udf20;
    private String udf3;
    private String udf4;
    private String udf5;
    private String udf6;
    private String udf7;
    private String udf8;
    private String udf9;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TransactionResponsesModel> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TransactionResponsesModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransactionResponsesModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TransactionResponsesModel[] newArray(int i) {
            return new TransactionResponsesModel[i];
        }
    }

    public TransactionResponsesModel() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPayerName() {
        return this.payerName;
    }

    /* renamed from: component10, reason: from getter */
    public final String getBankName() {
        return this.bankName;
    }

    /* renamed from: component11, reason: from getter */
    public final String getAmountType() {
        return this.amountType;
    }

    /* renamed from: component12, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component13, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    /* renamed from: component14, reason: from getter */
    public final String getChallanNumber() {
        return this.challanNumber;
    }

    /* renamed from: component15, reason: from getter */
    public final String getSabpaisaTxnId() {
        return this.sabpaisaTxnId;
    }

    /* renamed from: component16, reason: from getter */
    public final String getSabpaisaMessage() {
        return this.sabpaisaMessage;
    }

    /* renamed from: component17, reason: from getter */
    public final String getBankMessage() {
        return this.bankMessage;
    }

    /* renamed from: component18, reason: from getter */
    public final String getBankErrorCode() {
        return this.bankErrorCode;
    }

    /* renamed from: component19, reason: from getter */
    public final String getSabpaisaErrorCode() {
        return this.sabpaisaErrorCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPayerEmail() {
        return this.payerEmail;
    }

    /* renamed from: component20, reason: from getter */
    public final String getBankTxnId() {
        return this.bankTxnId;
    }

    /* renamed from: component21, reason: from getter */
    public final String getTransDate() {
        return this.transDate;
    }

    /* renamed from: component22, reason: from getter */
    public final String getUdf1() {
        return this.udf1;
    }

    /* renamed from: component23, reason: from getter */
    public final String getUdf2() {
        return this.udf2;
    }

    /* renamed from: component24, reason: from getter */
    public final String getUdf3() {
        return this.udf3;
    }

    /* renamed from: component25, reason: from getter */
    public final String getUdf4() {
        return this.udf4;
    }

    /* renamed from: component26, reason: from getter */
    public final String getUdf5() {
        return this.udf5;
    }

    /* renamed from: component27, reason: from getter */
    public final String getUdf6() {
        return this.udf6;
    }

    /* renamed from: component28, reason: from getter */
    public final String getUdf7() {
        return this.udf7;
    }

    /* renamed from: component29, reason: from getter */
    public final String getUdf8() {
        return this.udf8;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPayerMobile() {
        return this.payerMobile;
    }

    /* renamed from: component30, reason: from getter */
    public final String getUdf9() {
        return this.udf9;
    }

    /* renamed from: component31, reason: from getter */
    public final String getUdf10() {
        return this.udf10;
    }

    /* renamed from: component32, reason: from getter */
    public final String getUdf11() {
        return this.udf11;
    }

    /* renamed from: component33, reason: from getter */
    public final String getUdf12() {
        return this.udf12;
    }

    /* renamed from: component34, reason: from getter */
    public final String getUdf13() {
        return this.udf13;
    }

    /* renamed from: component35, reason: from getter */
    public final String getUdf14() {
        return this.udf14;
    }

    /* renamed from: component36, reason: from getter */
    public final String getUdf15() {
        return this.udf15;
    }

    /* renamed from: component37, reason: from getter */
    public final String getUdf16() {
        return this.udf16;
    }

    /* renamed from: component38, reason: from getter */
    public final String getUdf17() {
        return this.udf17;
    }

    /* renamed from: component39, reason: from getter */
    public final String getUdf18() {
        return this.udf18;
    }

    /* renamed from: component4, reason: from getter */
    public final String getClientTxnId() {
        return this.clientTxnId;
    }

    /* renamed from: component40, reason: from getter */
    public final String getUdf19() {
        return this.udf19;
    }

    /* renamed from: component41, reason: from getter */
    public final String getUdf20() {
        return this.udf20;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPayerAddress() {
        return this.payerAddress;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* renamed from: component7, reason: from getter */
    public final String getClientCode() {
        return this.clientCode;
    }

    /* renamed from: component8, reason: from getter */
    public final String getPaidAmount() {
        return this.paidAmount;
    }

    /* renamed from: component9, reason: from getter */
    public final String getPaymentMode() {
        return this.paymentMode;
    }

    public final TransactionResponsesModel copy(String payerName, String payerEmail, String payerMobile, String clientTxnId, String payerAddress, String amount, String clientCode, String paidAmount, String paymentMode, String bankName, String amountType, String status, String statusCode, String challanNumber, String sabpaisaTxnId, String sabpaisaMessage, String bankMessage, String bankErrorCode, String sabpaisaErrorCode, String bankTxnId, String transDate, String udf1, String udf2, String udf3, String udf4, String udf5, String udf6, String udf7, String udf8, String udf9, String udf10, String udf11, String udf12, String udf13, String udf14, String udf15, String udf16, String udf17, String udf18, String udf19, String udf20) {
        return new TransactionResponsesModel(payerName, payerEmail, payerMobile, clientTxnId, payerAddress, amount, clientCode, paidAmount, paymentMode, bankName, amountType, status, statusCode, challanNumber, sabpaisaTxnId, sabpaisaMessage, bankMessage, bankErrorCode, sabpaisaErrorCode, bankTxnId, transDate, udf1, udf2, udf3, udf4, udf5, udf6, udf7, udf8, udf9, udf10, udf11, udf12, udf13, udf14, udf15, udf16, udf17, udf18, udf19, udf20);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionResponsesModel)) {
            return false;
        }
        TransactionResponsesModel transactionResponsesModel = (TransactionResponsesModel) other;
        return Intrinsics.areEqual(this.payerName, transactionResponsesModel.payerName) && Intrinsics.areEqual(this.payerEmail, transactionResponsesModel.payerEmail) && Intrinsics.areEqual(this.payerMobile, transactionResponsesModel.payerMobile) && Intrinsics.areEqual(this.clientTxnId, transactionResponsesModel.clientTxnId) && Intrinsics.areEqual(this.payerAddress, transactionResponsesModel.payerAddress) && Intrinsics.areEqual(this.amount, transactionResponsesModel.amount) && Intrinsics.areEqual(this.clientCode, transactionResponsesModel.clientCode) && Intrinsics.areEqual(this.paidAmount, transactionResponsesModel.paidAmount) && Intrinsics.areEqual(this.paymentMode, transactionResponsesModel.paymentMode) && Intrinsics.areEqual(this.bankName, transactionResponsesModel.bankName) && Intrinsics.areEqual(this.amountType, transactionResponsesModel.amountType) && Intrinsics.areEqual(this.status, transactionResponsesModel.status) && Intrinsics.areEqual(this.statusCode, transactionResponsesModel.statusCode) && Intrinsics.areEqual(this.challanNumber, transactionResponsesModel.challanNumber) && Intrinsics.areEqual(this.sabpaisaTxnId, transactionResponsesModel.sabpaisaTxnId) && Intrinsics.areEqual(this.sabpaisaMessage, transactionResponsesModel.sabpaisaMessage) && Intrinsics.areEqual(this.bankMessage, transactionResponsesModel.bankMessage) && Intrinsics.areEqual(this.bankErrorCode, transactionResponsesModel.bankErrorCode) && Intrinsics.areEqual(this.sabpaisaErrorCode, transactionResponsesModel.sabpaisaErrorCode) && Intrinsics.areEqual(this.bankTxnId, transactionResponsesModel.bankTxnId) && Intrinsics.areEqual(this.transDate, transactionResponsesModel.transDate) && Intrinsics.areEqual(this.udf1, transactionResponsesModel.udf1) && Intrinsics.areEqual(this.udf2, transactionResponsesModel.udf2) && Intrinsics.areEqual(this.udf3, transactionResponsesModel.udf3) && Intrinsics.areEqual(this.udf4, transactionResponsesModel.udf4) && Intrinsics.areEqual(this.udf5, transactionResponsesModel.udf5) && Intrinsics.areEqual(this.udf6, transactionResponsesModel.udf6) && Intrinsics.areEqual(this.udf7, transactionResponsesModel.udf7) && Intrinsics.areEqual(this.udf8, transactionResponsesModel.udf8) && Intrinsics.areEqual(this.udf9, transactionResponsesModel.udf9) && Intrinsics.areEqual(this.udf10, transactionResponsesModel.udf10) && Intrinsics.areEqual(this.udf11, transactionResponsesModel.udf11) && Intrinsics.areEqual(this.udf12, transactionResponsesModel.udf12) && Intrinsics.areEqual(this.udf13, transactionResponsesModel.udf13) && Intrinsics.areEqual(this.udf14, transactionResponsesModel.udf14) && Intrinsics.areEqual(this.udf15, transactionResponsesModel.udf15) && Intrinsics.areEqual(this.udf16, transactionResponsesModel.udf16) && Intrinsics.areEqual(this.udf17, transactionResponsesModel.udf17) && Intrinsics.areEqual(this.udf18, transactionResponsesModel.udf18) && Intrinsics.areEqual(this.udf19, transactionResponsesModel.udf19) && Intrinsics.areEqual(this.udf20, transactionResponsesModel.udf20);
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getAmountType() {
        return this.amountType;
    }

    public final String getBankErrorCode() {
        return this.bankErrorCode;
    }

    public final String getBankMessage() {
        return this.bankMessage;
    }

    public final String getBankName() {
        return this.bankName;
    }

    public final String getBankTxnId() {
        return this.bankTxnId;
    }

    public final String getChallanNumber() {
        return this.challanNumber;
    }

    public final String getClientCode() {
        return this.clientCode;
    }

    public final String getClientTxnId() {
        return this.clientTxnId;
    }

    public final String getPaidAmount() {
        return this.paidAmount;
    }

    public final String getPayerAddress() {
        return this.payerAddress;
    }

    public final String getPayerEmail() {
        return this.payerEmail;
    }

    public final String getPayerMobile() {
        return this.payerMobile;
    }

    public final String getPayerName() {
        return this.payerName;
    }

    public final String getPaymentMode() {
        return this.paymentMode;
    }

    public final String getSabpaisaErrorCode() {
        return this.sabpaisaErrorCode;
    }

    public final String getSabpaisaMessage() {
        return this.sabpaisaMessage;
    }

    public final String getSabpaisaTxnId() {
        return this.sabpaisaTxnId;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getTransDate() {
        return this.transDate;
    }

    public final String getUdf1() {
        return this.udf1;
    }

    public final String getUdf10() {
        return this.udf10;
    }

    public final String getUdf11() {
        return this.udf11;
    }

    public final String getUdf12() {
        return this.udf12;
    }

    public final String getUdf13() {
        return this.udf13;
    }

    public final String getUdf14() {
        return this.udf14;
    }

    public final String getUdf15() {
        return this.udf15;
    }

    public final String getUdf16() {
        return this.udf16;
    }

    public final String getUdf17() {
        return this.udf17;
    }

    public final String getUdf18() {
        return this.udf18;
    }

    public final String getUdf19() {
        return this.udf19;
    }

    public final String getUdf2() {
        return this.udf2;
    }

    public final String getUdf20() {
        return this.udf20;
    }

    public final String getUdf3() {
        return this.udf3;
    }

    public final String getUdf4() {
        return this.udf4;
    }

    public final String getUdf5() {
        return this.udf5;
    }

    public final String getUdf6() {
        return this.udf6;
    }

    public final String getUdf7() {
        return this.udf7;
    }

    public final String getUdf8() {
        return this.udf8;
    }

    public final String getUdf9() {
        return this.udf9;
    }

    public int hashCode() {
        String str = this.payerName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.payerEmail;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.payerMobile;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.clientTxnId;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.payerAddress;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.amount;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.clientCode;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.paidAmount;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.paymentMode;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.bankName;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.amountType;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.status;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.statusCode;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.challanNumber;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.sabpaisaTxnId;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.sabpaisaMessage;
        int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.bankMessage;
        int hashCode17 = (hashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.bankErrorCode;
        int hashCode18 = (hashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.sabpaisaErrorCode;
        int hashCode19 = (hashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.bankTxnId;
        int hashCode20 = (hashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.transDate;
        int hashCode21 = (hashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.udf1;
        int hashCode22 = (hashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.udf2;
        int hashCode23 = (hashCode22 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.udf3;
        int hashCode24 = (hashCode23 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.udf4;
        int hashCode25 = (hashCode24 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.udf5;
        int hashCode26 = (hashCode25 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.udf6;
        int hashCode27 = (hashCode26 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.udf7;
        int hashCode28 = (hashCode27 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.udf8;
        int hashCode29 = (hashCode28 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.udf9;
        int hashCode30 = (hashCode29 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.udf10;
        int hashCode31 = (hashCode30 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.udf11;
        int hashCode32 = (hashCode31 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.udf12;
        int hashCode33 = (hashCode32 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.udf13;
        int hashCode34 = (hashCode33 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.udf14;
        int hashCode35 = (hashCode34 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.udf15;
        int hashCode36 = (hashCode35 + (str36 == null ? 0 : str36.hashCode())) * 31;
        String str37 = this.udf16;
        int hashCode37 = (hashCode36 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.udf17;
        int hashCode38 = (hashCode37 + (str38 == null ? 0 : str38.hashCode())) * 31;
        String str39 = this.udf18;
        int hashCode39 = (hashCode38 + (str39 == null ? 0 : str39.hashCode())) * 31;
        String str40 = this.udf19;
        int hashCode40 = (hashCode39 + (str40 == null ? 0 : str40.hashCode())) * 31;
        String str41 = this.udf20;
        return hashCode40 + (str41 != null ? str41.hashCode() : 0);
    }

    public final void setAmount(String str) {
        this.amount = str;
    }

    public final void setAmountType(String str) {
        this.amountType = str;
    }

    public final void setBankErrorCode(String str) {
        this.bankErrorCode = str;
    }

    public final void setBankMessage(String str) {
        this.bankMessage = str;
    }

    public final void setBankName(String str) {
        this.bankName = str;
    }

    public final void setBankTxnId(String str) {
        this.bankTxnId = str;
    }

    public final void setChallanNumber(String str) {
        this.challanNumber = str;
    }

    public final void setClientCode(String str) {
        this.clientCode = str;
    }

    public final void setClientTxnId(String str) {
        this.clientTxnId = str;
    }

    public final void setPaidAmount(String str) {
        this.paidAmount = str;
    }

    public final void setPayerAddress(String str) {
        this.payerAddress = str;
    }

    public final void setPayerEmail(String str) {
        this.payerEmail = str;
    }

    public final void setPayerMobile(String str) {
        this.payerMobile = str;
    }

    public final void setPayerName(String str) {
        this.payerName = str;
    }

    public final void setPaymentMode(String str) {
        this.paymentMode = str;
    }

    public final void setSabpaisaErrorCode(String str) {
        this.sabpaisaErrorCode = str;
    }

    public final void setSabpaisaMessage(String str) {
        this.sabpaisaMessage = str;
    }

    public final void setSabpaisaTxnId(String str) {
        this.sabpaisaTxnId = str;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public final void setStatusCode(String str) {
        this.statusCode = str;
    }

    public final void setTransDate(String str) {
        this.transDate = str;
    }

    public final void setUdf1(String str) {
        this.udf1 = str;
    }

    public final void setUdf10(String str) {
        this.udf10 = str;
    }

    public final void setUdf11(String str) {
        this.udf11 = str;
    }

    public final void setUdf12(String str) {
        this.udf12 = str;
    }

    public final void setUdf13(String str) {
        this.udf13 = str;
    }

    public final void setUdf14(String str) {
        this.udf14 = str;
    }

    public final void setUdf15(String str) {
        this.udf15 = str;
    }

    public final void setUdf16(String str) {
        this.udf16 = str;
    }

    public final void setUdf17(String str) {
        this.udf17 = str;
    }

    public final void setUdf18(String str) {
        this.udf18 = str;
    }

    public final void setUdf19(String str) {
        this.udf19 = str;
    }

    public final void setUdf2(String str) {
        this.udf2 = str;
    }

    public final void setUdf20(String str) {
        this.udf20 = str;
    }

    public final void setUdf3(String str) {
        this.udf3 = str;
    }

    public final void setUdf4(String str) {
        this.udf4 = str;
    }

    public final void setUdf5(String str) {
        this.udf5 = str;
    }

    public final void setUdf6(String str) {
        this.udf6 = str;
    }

    public final void setUdf7(String str) {
        this.udf7 = str;
    }

    public final void setUdf8(String str) {
        this.udf8 = str;
    }

    public final void setUdf9(String str) {
        this.udf9 = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TransactionResponsesModel(payerName=");
        sb.append(this.payerName);
        sb.append(", payerEmail=");
        sb.append(this.payerEmail);
        sb.append(", payerMobile=");
        sb.append(this.payerMobile);
        sb.append(", clientTxnId=");
        sb.append(this.clientTxnId);
        sb.append(", payerAddress=");
        sb.append(this.payerAddress);
        sb.append(", amount=");
        sb.append(this.amount);
        sb.append(", clientCode=");
        sb.append(this.clientCode);
        sb.append(", paidAmount=");
        sb.append(this.paidAmount);
        sb.append(", paymentMode=");
        sb.append(this.paymentMode);
        sb.append(", bankName=");
        sb.append(this.bankName);
        sb.append(", amountType=");
        sb.append(this.amountType);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", statusCode=");
        sb.append(this.statusCode);
        sb.append(", challanNumber=");
        sb.append(this.challanNumber);
        sb.append(", sabpaisaTxnId=");
        sb.append(this.sabpaisaTxnId);
        sb.append(", sabpaisaMessage=");
        sb.append(this.sabpaisaMessage);
        sb.append(", bankMessage=");
        sb.append(this.bankMessage);
        sb.append(", bankErrorCode=");
        sb.append(this.bankErrorCode);
        sb.append(", sabpaisaErrorCode=");
        sb.append(this.sabpaisaErrorCode);
        sb.append(", bankTxnId=");
        sb.append(this.bankTxnId);
        sb.append(", transDate=");
        sb.append(this.transDate);
        sb.append(", udf1=");
        sb.append(this.udf1);
        sb.append(", udf2=");
        sb.append(this.udf2);
        sb.append(", udf3=");
        sb.append(this.udf3);
        sb.append(", udf4=");
        sb.append(this.udf4);
        sb.append(", udf5=");
        sb.append(this.udf5);
        sb.append(", udf6=");
        sb.append(this.udf6);
        sb.append(", udf7=");
        sb.append(this.udf7);
        sb.append(", udf8=");
        sb.append(this.udf8);
        sb.append(", udf9=");
        sb.append(this.udf9);
        sb.append(", udf10=");
        sb.append(this.udf10);
        sb.append(", udf11=");
        sb.append(this.udf11);
        sb.append(", udf12=");
        sb.append(this.udf12);
        sb.append(", udf13=");
        sb.append(this.udf13);
        sb.append(", udf14=");
        sb.append(this.udf14);
        sb.append(", udf15=");
        sb.append(this.udf15);
        sb.append(", udf16=");
        sb.append(this.udf16);
        sb.append(", udf17=");
        sb.append(this.udf17);
        sb.append(", udf18=");
        sb.append(this.udf18);
        sb.append(", udf19=");
        sb.append(this.udf19);
        sb.append(", udf20=");
        return t.b(')', this.udf20, sb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.payerName);
        parcel.writeString(this.payerEmail);
        parcel.writeString(this.payerMobile);
        parcel.writeString(this.clientTxnId);
        parcel.writeString(this.payerAddress);
        parcel.writeString(this.amount);
        parcel.writeString(this.clientCode);
        parcel.writeString(this.paidAmount);
        parcel.writeString(this.paymentMode);
        parcel.writeString(this.bankName);
        parcel.writeString(this.amountType);
        parcel.writeString(this.status);
        parcel.writeString(this.statusCode);
        parcel.writeString(this.challanNumber);
        parcel.writeString(this.sabpaisaTxnId);
        parcel.writeString(this.sabpaisaMessage);
        parcel.writeString(this.bankMessage);
        parcel.writeString(this.bankErrorCode);
        parcel.writeString(this.sabpaisaErrorCode);
        parcel.writeString(this.bankTxnId);
        parcel.writeString(this.transDate);
        parcel.writeString(this.udf1);
        parcel.writeString(this.udf2);
        parcel.writeString(this.udf3);
        parcel.writeString(this.udf4);
        parcel.writeString(this.udf5);
        parcel.writeString(this.udf6);
        parcel.writeString(this.udf7);
        parcel.writeString(this.udf8);
        parcel.writeString(this.udf9);
        parcel.writeString(this.udf10);
        parcel.writeString(this.udf11);
        parcel.writeString(this.udf12);
        parcel.writeString(this.udf13);
        parcel.writeString(this.udf14);
        parcel.writeString(this.udf15);
        parcel.writeString(this.udf16);
        parcel.writeString(this.udf17);
        parcel.writeString(this.udf18);
        parcel.writeString(this.udf19);
        parcel.writeString(this.udf20);
    }

    public TransactionResponsesModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41) {
        this.payerName = str;
        this.payerEmail = str2;
        this.payerMobile = str3;
        this.clientTxnId = str4;
        this.payerAddress = str5;
        this.amount = str6;
        this.clientCode = str7;
        this.paidAmount = str8;
        this.paymentMode = str9;
        this.bankName = str10;
        this.amountType = str11;
        this.status = str12;
        this.statusCode = str13;
        this.challanNumber = str14;
        this.sabpaisaTxnId = str15;
        this.sabpaisaMessage = str16;
        this.bankMessage = str17;
        this.bankErrorCode = str18;
        this.sabpaisaErrorCode = str19;
        this.bankTxnId = str20;
        this.transDate = str21;
        this.udf1 = str22;
        this.udf2 = str23;
        this.udf3 = str24;
        this.udf4 = str25;
        this.udf5 = str26;
        this.udf6 = str27;
        this.udf7 = str28;
        this.udf8 = str29;
        this.udf9 = str30;
        this.udf10 = str31;
        this.udf11 = str32;
        this.udf12 = str33;
        this.udf13 = str34;
        this.udf14 = str35;
        this.udf15 = str36;
        this.udf16 = str37;
        this.udf17 = str38;
        this.udf18 = str39;
        this.udf19 = str40;
        this.udf20 = str41;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ TransactionResponsesModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(r2, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, (i & 16384) != 0 ? null : str15, (i & 32768) != 0 ? null : str16, (i & 65536) != 0 ? null : str17, (i & 131072) != 0 ? null : str18, (i & 262144) != 0 ? null : str19, (i & 524288) != 0 ? null : str20, (i & 1048576) != 0 ? null : str21, (i & 2097152) != 0 ? null : str22, (i & 4194304) != 0 ? null : str23, (i & 8388608) != 0 ? null : str24, (i & 16777216) != 0 ? null : str25, (i & 33554432) != 0 ? null : str26, (i & 67108864) != 0 ? null : str27, (i & 134217728) != 0 ? null : str28, (i & 268435456) != 0 ? null : str29, (i & 536870912) != 0 ? null : str30, (i & 1073741824) != 0 ? null : str31, (i & Integer.MIN_VALUE) != 0 ? null : str32, (i2 & 1) != 0 ? null : str33, (i2 & 2) != 0 ? null : str34, (i2 & 4) != 0 ? null : str35, (i2 & 8) != 0 ? null : str36, (i2 & 16) != 0 ? null : str37, (i2 & 32) != 0 ? null : str38, (i2 & 64) != 0 ? null : str39, (i2 & 128) != 0 ? null : str40, (i2 & 256) != 0 ? null : str41);
        String str42 = (i & 1) != 0 ? null : str;
    }
}
