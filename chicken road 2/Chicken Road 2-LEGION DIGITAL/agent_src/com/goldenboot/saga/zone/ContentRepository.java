package com.goldenboot.saga.zone;

import android.view.View;
import androidx.compose.ui.RemoteCallback;
import androidx.compose.ui.layout.GradientActivator;
import com.goldenboot.saga.zone.CarouselHelper;
import com.goldenboot.saga.zone.FontReporter;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u008c\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u0000 û\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\b§\u0003¨\u0003©\u0003ª\u0003B\u001b\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u00142\b\b\u0002\u0010\u001d\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000fH\u0002¢\u0006\u0004\b#\u0010\u0011J\u0017\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000fH\u0002¢\u0006\u0004\b(\u0010\u0011J\u000f\u0010)\u001a\u00020\u000fH\u0002¢\u0006\u0004\b)\u0010\u0011J\u000f\u0010*\u001a\u00020\u000fH\u0002¢\u0006\u0004\b*\u0010\u0011J\u000f\u0010+\u001a\u00020\u000fH\u0000¢\u0006\u0004\b+\u0010\u0011J$\u0010.\u001a\u00020\u000f2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000f0,H\u0086\b¢\u0006\u0004\b.\u0010/J*\u00101\u001a\u00020\u000f2\u0018\u0010-\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000f00H\u0086\b¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\n\u0018\u000103j\u0004\u0018\u0001`4H\u0017¢\u0006\u0004\b5\u00106J\u001f\u00108\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0000H\u0000¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u000fH\u0000¢\u0006\u0004\b:\u0010\u0011J\u001f\u0010<\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000bH\u0000¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u000fH\u0000¢\u0006\u0004\b>\u0010\u0011J'\u0010A\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000bH\u0000¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\tH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u000fH\u0000¢\u0006\u0004\bE\u0010\u0011J\u000f\u0010F\u001a\u00020\u000fH\u0000¢\u0006\u0004\bF\u0010\u0011J\u0017\u0010I\u001a\u00020\u000f2\u0006\u0010H\u001a\u00020GH\u0000¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u000fH\u0000¢\u0006\u0004\bK\u0010\u0011J\u000f\u0010L\u001a\u00020\u0014H\u0016¢\u0006\u0004\bL\u0010MJ\u0015\u0010O\u001a\u00020\u000b2\u0006\u0010N\u001a\u00020\u000b¢\u0006\u0004\bO\u0010PJ\u0015\u0010R\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020\u000b¢\u0006\u0004\bR\u0010PJ\u0015\u0010S\u001a\u00020\u000b2\u0006\u0010N\u001a\u00020\u000b¢\u0006\u0004\bS\u0010PJ\u0015\u0010T\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020\u000b¢\u0006\u0004\bT\u0010PJ\u0015\u0010U\u001a\u00020\u000b2\u0006\u0010N\u001a\u00020\u000b¢\u0006\u0004\bU\u0010PJ\u0015\u0010V\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020\u000b¢\u0006\u0004\bV\u0010PJ\u0015\u0010W\u001a\u00020\u000b2\u0006\u0010N\u001a\u00020\u000b¢\u0006\u0004\bW\u0010PJ\u0015\u0010X\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020\u000b¢\u0006\u0004\bX\u0010PJ\u0015\u0010\\\u001a\u00020[2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020\u000fH\u0000¢\u0006\u0004\b^\u0010\u0011J\u000f\u0010_\u001a\u00020\u000fH\u0000¢\u0006\u0004\b_\u0010\u0011J\u001f\u0010b\u001a\u00020\u000f2\u0006\u0010`\u001a\u00020\u000b2\u0006\u0010a\u001a\u00020\u000bH\u0000¢\u0006\u0004\bb\u0010=J\u000f\u0010c\u001a\u00020\u000fH\u0000¢\u0006\u0004\bc\u0010\u0011J\u000f\u0010d\u001a\u00020\u000fH\u0000¢\u0006\u0004\bd\u0010\u0011J!\u0010i\u001a\u00020\u000f2\u0006\u0010f\u001a\u00020e2\b\u0010h\u001a\u0004\u0018\u00010gH\u0000¢\u0006\u0004\bi\u0010jJ3\u0010r\u001a\u00020\u000f2\u0006\u0010l\u001a\u00020k2\u0006\u0010n\u001a\u00020m2\b\b\u0002\u0010p\u001a\u00020o2\b\b\u0002\u0010q\u001a\u00020\tH\u0000¢\u0006\u0004\br\u0010sJ3\u0010u\u001a\u00020\u000f2\u0006\u0010l\u001a\u00020k2\u0006\u0010t\u001a\u00020m2\b\b\u0002\u0010p\u001a\u00020o2\b\b\u0002\u0010q\u001a\u00020\tH\u0000¢\u0006\u0004\bu\u0010sJ\u0017\u0010w\u001a\u00020\u000f2\u0006\u0010v\u001a\u00020\u0000H\u0000¢\u0006\u0004\bw\u0010\u0019J-\u0010{\u001a\u00020\u000f2\b\b\u0002\u0010x\u001a\u00020\t2\b\b\u0002\u0010y\u001a\u00020\t2\b\b\u0002\u0010z\u001a\u00020\tH\u0000¢\u0006\u0004\b{\u0010|J-\u0010}\u001a\u00020\u000f2\b\b\u0002\u0010x\u001a\u00020\t2\b\b\u0002\u0010y\u001a\u00020\t2\b\b\u0002\u0010z\u001a\u00020\tH\u0000¢\u0006\u0004\b}\u0010|J\u000f\u0010~\u001a\u00020\u000fH\u0000¢\u0006\u0004\b~\u0010\u0011J\u000f\u0010\u007f\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u007f\u0010\u0011J\u0011\u0010\u0080\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0005\b\u0080\u0001\u0010\u0011J)\u0010\u0083\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010\u0081\u00012\r\u0010-\u001a\t\u0012\u0004\u0012\u00028\u00000\u0082\u0001H\u0080\b¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u001c\u0010\u0085\u0001\u001a\u00020\u000f2\b\b\u0002\u0010x\u001a\u00020\tH\u0000¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001c\u0010\u0087\u0001\u001a\u00020\u000f2\b\b\u0002\u0010x\u001a\u00020\tH\u0000¢\u0006\u0006\b\u0087\u0001\u0010\u0086\u0001J\u0011\u0010\u0088\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0005\b\u0088\u0001\u0010\u0011J\u001a\u0010\u008b\u0001\u001a\n\u0012\u0005\u0012\u00030\u008a\u00010\u0089\u0001H\u0016¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0011\u0010\u008d\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0005\b\u008d\u0001\u0010\u0011J \u0010\u0090\u0001\u001a\u00020\t2\f\b\u0002\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008e\u0001H\u0000¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J \u0010\u0092\u0001\u001a\u00020\t2\f\b\u0002\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008e\u0001H\u0000¢\u0006\u0006\b\u0092\u0001\u0010\u0091\u0001J\u0011\u0010\u0093\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0005\b\u0093\u0001\u0010\u0011J\u0011\u0010\u0094\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0005\b\u0094\u0001\u0010\u0011J\u0011\u0010\u0095\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0005\b\u0095\u0001\u0010\u0011J\u001b\u0010\u0097\u0001\u001a\u00020\u000f2\t\b\u0002\u0010\u0096\u0001\u001a\u00020\t¢\u0006\u0006\b\u0097\u0001\u0010\u0086\u0001J\u0011\u0010\u0098\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0005\b\u0098\u0001\u0010\u0011J\u0011\u0010\u0099\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u0099\u0001\u0010\u0011J\u0011\u0010\u009a\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u009a\u0001\u0010\u0011J'\u0010\u009c\u0001\u001a\u00020\u000f2\u0013\u0010-\u001a\u000f\u0012\u0005\u0012\u00030\u009b\u0001\u0012\u0004\u0012\u00020\u000f0,H\u0080\b¢\u0006\u0005\b\u009c\u0001\u0010/J'\u0010\u009e\u0001\u001a\u00020\u000f2\u0013\u0010-\u001a\u000f\u0012\u0005\u0012\u00030\u009d\u0001\u0012\u0004\u0012\u00020\u000f0,H\u0080\b¢\u0006\u0005\b\u009e\u0001\u0010/J\u0011\u0010\u009f\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0005\b\u009f\u0001\u0010\u0011J\u0011\u0010 \u0001\u001a\u00020\u000fH\u0000¢\u0006\u0005\b \u0001\u0010\u0011J\u0011\u0010¡\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b¡\u0001\u0010\u0011J\u0011\u0010¢\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b¢\u0001\u0010\u0011J\u0011\u0010£\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b£\u0001\u0010\u0011R\u0016\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010¤\u0001R(\u0010\f\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001R*\u0010²\u0001\u001a\u00030«\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¬\u0001\u0010\u00ad\u0001\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0006\b°\u0001\u0010±\u0001R*\u0010¶\u0001\u001a\u00030³\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¡\u0001\u0010\u00ad\u0001\u001a\u0006\b´\u0001\u0010¯\u0001\"\u0006\bµ\u0001\u0010±\u0001R)\u0010¹\u0001\u001a\u00030«\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bC\u0010\u00ad\u0001\u001a\u0006\b·\u0001\u0010¯\u0001\"\u0006\b¸\u0001\u0010±\u0001R'\u0010¼\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b5\u0010¤\u0001\u001a\u0005\bº\u0001\u0010D\"\u0006\b»\u0001\u0010\u0086\u0001R)\u0010À\u0001\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b½\u0001\u0010¦\u0001\u001a\u0006\b¾\u0001\u0010¨\u0001\"\u0006\b¿\u0001\u0010ª\u0001R(\u0010Ä\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\bÁ\u0001\u0010¤\u0001\u001a\u0005\bÂ\u0001\u0010D\"\u0006\bÃ\u0001\u0010\u0086\u0001R5\u0010Ë\u0001\u001a\u0004\u0018\u00010\u00002\t\u0010Å\u0001\u001a\u0004\u0018\u00010\u00008\u0000@BX\u0080\u000e¢\u0006\u0017\n\u0006\bÆ\u0001\u0010Ç\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0005\bÊ\u0001\u0010\u0019R\u0019\u0010Í\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010¦\u0001R\u001e\u0010Ñ\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000Î\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÏ\u0001\u0010Ð\u0001R\"\u0010Õ\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010Ò\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0001\u0010Ô\u0001R\u0019\u0010×\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÖ\u0001\u0010¤\u0001R\u001a\u0010Ø\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b&\u0010Ç\u0001R,\u0010H\u001a\u0004\u0018\u00010G2\t\u0010Ù\u0001\u001a\u0004\u0018\u00010G8\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0005\bI\u0010Ú\u0001\u001a\u0006\bÛ\u0001\u0010Ü\u0001R2\u0010ä\u0001\u001a\f\u0018\u00010Ý\u0001j\u0005\u0018\u0001`Þ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u001b\u0010ß\u0001\u001a\u0006\bà\u0001\u0010á\u0001\"\u0006\bâ\u0001\u0010ã\u0001R(\u0010\u001d\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u009f\u0001\u0010¦\u0001\u001a\u0006\bå\u0001\u0010¨\u0001\"\u0006\bæ\u0001\u0010ª\u0001R\u0018\u0010ç\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b*\u0010¤\u0001R'\u0010ê\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b\u001e\u0010¤\u0001\u001a\u0005\bè\u0001\u0010D\"\u0006\bé\u0001\u0010\u0086\u0001R\u001b\u0010í\u0001\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bë\u0001\u0010ì\u0001R\u0018\u0010î\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bK\u0010¤\u0001R\u001e\u0010ï\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000Ò\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010Ô\u0001R\u0018\u0010ð\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bi\u0010¤\u0001R4\u0010ö\u0001\u001a\u00030ñ\u00012\b\u0010Ù\u0001\u001a\u00030ñ\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bò\u0001\u0010ó\u0001\u001a\u0006\b¬\u0001\u0010ô\u0001\"\u0006\b¥\u0001\u0010õ\u0001R\u001b\u0010ù\u0001\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b÷\u0001\u0010ø\u0001R4\u0010\u0081\u0002\u001a\u00030ú\u00012\b\u0010Ù\u0001\u001a\u00030ú\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bû\u0001\u0010ü\u0001\u001a\u0006\bý\u0001\u0010þ\u0001\"\u0006\bÿ\u0001\u0010\u0080\u0002R4\u0010\u0088\u0002\u001a\u00030\u0082\u00022\b\u0010Ù\u0001\u001a\u00030\u0082\u00028\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b§\u0001\u0010\u0083\u0002\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002\"\u0006\b\u0086\u0002\u0010\u0087\u0002R4\u0010\u0090\u0002\u001a\u00030\u0089\u00022\b\u0010Ù\u0001\u001a\u00030\u0089\u00028\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b\u008a\u0002\u0010\u008b\u0002\u001a\u0006\b\u008c\u0002\u0010\u008d\u0002\"\u0006\b\u008e\u0002\u0010\u008f\u0002R4\u0010\u0096\u0002\u001a\u00030\u0091\u00022\b\u0010Ù\u0001\u001a\u00030\u0091\u00028\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b\u008b\u0001\u0010\u0092\u0002\u001a\u0006\b½\u0001\u0010\u0093\u0002\"\u0006\b\u0094\u0002\u0010\u0095\u0002R)\u0010\u009d\u0002\u001a\u00030\u0097\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u0015\u0010\u0098\u0002\u001a\u0006\b\u0099\u0002\u0010\u009a\u0002\"\u0006\b\u009b\u0002\u0010\u009c\u0002R\u0019\u0010\u009e\u0002\u001a\u00030\u0097\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b.\u0010\u0098\u0002R.\u0010¢\u0002\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\u001d\n\u0005\b1\u0010¤\u0001\u0012\u0005\b¡\u0002\u0010\u0011\u001a\u0005\b\u009f\u0002\u0010D\"\u0006\b \u0002\u0010\u0086\u0001R \u0010§\u0002\u001a\u00030£\u00028\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010¤\u0002\u001a\u0006\b¥\u0002\u0010¦\u0002R \u0010¬\u0002\u001a\u00030¨\u00028\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010©\u0002\u001a\u0006\bª\u0002\u0010«\u0002R,\u0010´\u0002\u001a\u0005\u0018\u00010\u00ad\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b®\u0002\u0010¯\u0002\u001a\u0006\b°\u0002\u0010±\u0002\"\u0006\b²\u0002\u0010³\u0002R\u001c\u0010·\u0002\u001a\u0005\u0018\u00010\u009d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0002\u0010¶\u0002R(\u0010º\u0002\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u009f\u0002\u0010¤\u0001\u001a\u0005\b¸\u0002\u0010D\"\u0006\b¹\u0002\u0010\u0086\u0001R\u0019\u0010¼\u0002\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0002\u0010»\u0002R\u001b\u0010¾\u0002\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0002\u0010»\u0002R6\u0010Ä\u0002\u001a\u0010\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u000f\u0018\u00010,8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b¿\u0002\u0010À\u0002\u001a\u0006\bÁ\u0002\u0010Â\u0002\"\u0005\bÃ\u0002\u0010/R6\u0010È\u0002\u001a\u0010\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u000f\u0018\u00010,8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\bÅ\u0002\u0010À\u0002\u001a\u0006\bÆ\u0002\u0010Â\u0002\"\u0005\bÇ\u0002\u0010/R(\u0010Ë\u0002\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\bå\u0001\u0010¤\u0001\u001a\u0005\bÉ\u0002\u0010D\"\u0006\bÊ\u0002\u0010\u0086\u0001R2\u0010Ï\u0002\u001a\u00020\u000b2\u0007\u0010Ù\u0001\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bÌ\u0002\u0010¦\u0001\u001a\u0006\bÍ\u0002\u0010¨\u0001\"\u0006\bÎ\u0002\u0010ª\u0001R)\u0010Ð\u0002\u001a\u00020\t2\u0007\u0010Ù\u0001\u001a\u00020\t8\u0016@RX\u0096\u000e¢\u0006\u000f\n\u0006\bÍ\u0002\u0010¤\u0001\u001a\u0005\b\u008a\u0002\u0010DR%\u0010Ô\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000Ò\u00018@X\u0081\u0004¢\u0006\u000f\u0012\u0005\bÓ\u0002\u0010\u0011\u001a\u0006\bÑ\u0002\u0010Ò\u0002R\u001a\u0010Ø\u0002\u001a\u0005\u0018\u00010Õ\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\bÖ\u0002\u0010×\u0002R\u0018\u0010Ü\u0002\u001a\u00030Ù\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\bÚ\u0002\u0010Û\u0002R\u0016\u0010ß\u0002\u001a\u0004\u0018\u00010\t8F¢\u0006\b\u001a\u0006\bÝ\u0002\u0010Þ\u0002R\u001e\u0010à\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000\u0089\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bÌ\u0002\u0010\u008c\u0001R\u001f\u0010â\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00020\u0089\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b¿\u0002\u0010\u008c\u0001R\u001f\u0010ã\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00020\u0089\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b½\u0002\u0010\u008c\u0001R\u001e\u0010å\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000Ò\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bä\u0002\u0010Ò\u0002R\u001e\u0010æ\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000\u0089\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bÅ\u0002\u0010\u008c\u0001R\u0019\u0010è\u0002\u001a\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\b\u001a\u0006\bç\u0002\u0010É\u0001R\u0016\u0010ê\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bé\u0002\u0010DR\u0018\u0010î\u0002\u001a\u00030ë\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bì\u0002\u0010í\u0002R\u001a\u0010ò\u0002\u001a\u0005\u0018\u00010ï\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bð\u0002\u0010ñ\u0002R\u0018\u0010ö\u0002\u001a\u00030ó\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bô\u0002\u0010õ\u0002R\u0018\u0010ø\u0002\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b÷\u0002\u0010\u001cR\u0016\u0010ú\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bù\u0002\u0010DR\u0016\u0010ü\u0002\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bû\u0002\u0010DR\u0016\u0010Q\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\b\u001a\u0006\bý\u0002\u0010¨\u0001R\u0016\u0010N\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\b\u001a\u0006\bþ\u0002\u0010¨\u0001R\u0016\u0010ÿ\u0002\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b®\u0002\u0010DR\u0018\u0010\u0083\u0003\u001a\u00030\u0080\u00038@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0081\u0003\u0010\u0082\u0003R\u0016\u0010\u0084\u0003\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bò\u0001\u0010DR\u0013\u0010\u0086\u0003\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b\u0085\u0003\u0010DR\u0017\u0010\u0088\u0003\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0087\u0003\u0010¨\u0001R\u0018\u0010\u008a\u0003\u001a\u00030\u0097\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0089\u0003\u0010\u009a\u0002R\u0018\u0010\u008c\u0003\u001a\u00030\u0097\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008b\u0003\u0010\u009a\u0002R\u0018\u0010\u008f\u0003\u001a\u00030\u009d\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008d\u0003\u0010\u008e\u0003R\u0018\u0010\u0091\u0003\u001a\u00030\u009d\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0090\u0003\u0010\u008e\u0003R\u001a\u0010\u0093\u0003\u001a\u0005\u0018\u00010\u009d\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0092\u0003\u0010\u008e\u0003R\u0016\u0010\u0094\u0003\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bµ\u0002\u0010DR(\u0010%\u001a\u00020$2\u0007\u0010Ù\u0001\u001a\u00020$8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\b\u0095\u0003\u0010\u0096\u0003\"\u0005\b\u0097\u0003\u0010'R\u0018\u0010\u009a\u0003\u001a\u00030\u0098\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b÷\u0001\u0010\u0099\u0003R\u0016\u0010\u009c\u0003\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u009b\u0003\u0010DR\u0016\u0010\u009e\u0003\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u009d\u0003\u0010DR\u0016\u0010 \u0003\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u009f\u0003\u0010DR\u0016\u0010¢\u0003\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b¡\u0003\u0010DR\u0019\u0010¤\u0003\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\bû\u0001\u0010£\u0003R\u001e\u0010¦\u0003\u001a\t\u0012\u0004\u0012\u00020\u00050\u0089\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¥\u0003\u0010\u008c\u0001¨\u0006«\u0003"}, d2 = {"Lcom/goldenboot/saga/zone/ContentRepository;", "Lcom/goldenboot/saga/zone/MarginBootstrapper;", "Lcom/goldenboot/saga/zone/DimenCollection;", "Lcom/goldenboot/saga/zone/KeyboardWatcher;", "Lcom/goldenboot/saga/zone/ItemEvent;", "Lcom/goldenboot/saga/zone/PressBootstrapper;", "Lcom/goldenboot/saga/zone/AlarmMulticaster;", "Lcom/goldenboot/saga/zone/PublisherToggle;", "Lcom/goldenboot/saga/zone/CarouselHelper$BounceHandler;", "", "isVirtual", "", "semanticsId", "<init>", "(ZI)V", "Lcom/goldenboot/saga/zone/DpadBuilder;", "compressPattern", "()V", "filterTimer", "instance", "", "updateAction", "(Lcom/goldenboot/saga/zone/ContentRepository;)Ljava/lang/String;", "child", "openContent", "(Lcom/goldenboot/saga/zone/ContentRepository;)V", "Lcom/goldenboot/saga/zone/ItemNode;", "flattenPackage", "()Lcom/goldenboot/saga/zone/ItemNode;", "depth", "filterPayload", "(I)Ljava/lang/String;", "Lcom/goldenboot/saga/zone/ListenerBuffer;", "offerHash", "()Lcom/goldenboot/saga/zone/ListenerBuffer;", "renderBounds", "Landroidx/compose/ui/RemoteCallback;", "modifier", "mergeLocale", "(Landroidx/compose/ui/RemoteCallback;)V", "encodeOrigin", "transformCount", "storeCharset", "flushTimer", "Lkotlin/Function1;", "block", "connectComponent", "(Lcom/goldenboot/saga/zone/TouchRecord;)V", "Lkotlin/Function2;", "startResource", "(Lcom/goldenboot/saga/zone/IconExporter;)V", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/InteropView;", "inflateAdapter", "()Landroid/view/View;", "index", "trimState", "(ILcom/goldenboot/saga/zone/ContentRepository;)V", "pauseCurrency", "count", "filterPattern", "(II)V", "injectAsset", "from", "to", "drainComponent", "(III)V", "resetDelta", "()Z", "readHeader", "prependOptions", "Lcom/goldenboot/saga/zone/CarouselHelper;", "owner", "syncScope", "(Lcom/goldenboot/saga/zone/CarouselHelper;)V", "queryModel", "toString", "()Ljava/lang/String;", "height", "insertAsset", "(I)I", "width", "createLayout", "attachVersion", "unwrapKey", "decodeLayout", "pushTask", "saveEntry", "writeRequest", "", "e", "", "pauseNode", "(Ljava/lang/Throwable;)Ljava/lang/Void;", "escapeBounds", "evictOrigin", "x", "y", "decodeOrigin", "lockManifest", "resetComponent", "Lcom/goldenboot/saga/zone/PulseCounter;", "canvas", "Lcom/goldenboot/saga/zone/BottomBarEvaluator;", "graphicsLayer", "unlockMessage", "(Lcom/goldenboot/saga/zone/PulseCounter;Lcom/goldenboot/saga/zone/BottomBarEvaluator;)V", "Lcom/goldenboot/saga/zone/RuntimeHeap;", "pointerPosition", "Lcom/goldenboot/saga/zone/MenuResolver;", "hitTestResult", "Lcom/goldenboot/saga/zone/ServerSnapshot;", "pointerType", "isInLayer", "prependArchive", "(JLcom/goldenboot/saga/zone/MenuResolver;IZ)V", "hitSemanticsEntities", "closeSource", "it", "formatCurrency", "forceRequest", "scheduleMeasureAndLayout", "invalidateIntrinsics", "performLink", "(ZZZ)V", "growState", "queryDescriptor", "updateRule", "prependNode", "T", "Lkotlin/Function0;", "observeNode", "(Lcom/goldenboot/saga/zone/ElevationNode;)Ljava/lang/Object;", "initItem", "(Z)V", "createConstraint", "packPackage", "", "Lcom/goldenboot/saga/zone/ConfigSplitter;", "prepareTask", "()Ljava/util/List;", "openJob", "Lcom/goldenboot/saga/zone/PagerPlanner;", "constraints", "clipRule", "(Lcom/goldenboot/saga/zone/PagerPlanner;)Z", "normalizeRecord", "wrapModel", "wrapConfig", "escapeDelta", "isRootOfInvalidation", "flushHeader", "filterSchema", "reduceScope", "clipOrigin", "Lcom/goldenboot/saga/zone/ClipboardResolver;", "formatPosition", "Lcom/goldenboot/saga/zone/BridgeSerializer;", "resumeSignature", "injectConstraint", "escapeFooter", "attachConfig", "peekRevision", "applyTask", "Z", "notifyMessage", "I", "mapJob", "()I", "writeSnapshot", "(I)V", "Lcom/goldenboot/saga/zone/FontReporter;", "connectPatch", "J", "loadItem", "()J", "growCache", "(J)V", "offsetFromRoot", "Lcom/goldenboot/saga/zone/ScaleSaver;", "transformCurrency", "applyData", "lastSize", "saveSnapshot", "attachTimezone", "outerToInnerOffset", "queryData", "pushOptions", "outerToInnerOffsetDirty", "purgeNode", "connectJob", "flushSample", "compositeKeyHash", "drawRequest", "collectPolicy", "subscribeRule", "isVirtualLookaheadRoot", "newRoot", "gatherAdapter", "Lcom/goldenboot/saga/zone/ContentRepository;", "closePayload", "()Lcom/goldenboot/saga/zone/ContentRepository;", "clearTimer", "lookaheadRoot", "decodePath", "virtualChildrenCount", "Lcom/goldenboot/saga/zone/InsetsFence;", "drawScope", "Lcom/goldenboot/saga/zone/InsetsFence;", "_foldedChildren", "Lcom/goldenboot/saga/zone/PluginScheduler;", "expandArgs", "Lcom/goldenboot/saga/zone/PluginScheduler;", "_unfoldedChildren", "findTask", "unfoldedVirtualChildrenListDirty", "_foldedParent", "value", "Lcom/goldenboot/saga/zone/CarouselHelper;", "syncPool", "()Lcom/goldenboot/saga/zone/CarouselHelper;", "Lcom/goldenboot/saga/zone/TrackballShaper;", "Landroidx/compose/ui/viewinterop/InteropViewFactoryHolder;", "Lcom/goldenboot/saga/zone/TrackballShaper;", "refreshCounter", "()Lcom/goldenboot/saga/zone/TrackballShaper;", "closeCallback", "(Lcom/goldenboot/saga/zone/TrackballShaper;)V", "interopViewFactoryHolder", "computeTarget", "expandSnapshot", "ignoreRemeasureRequests", "queryDigest", "abortModel", "isSemanticsInvalidated", "inflateEdge", "Lcom/goldenboot/saga/zone/ItemNode;", "_semanticsConfiguration", "isCurrentlyCalculatingSemanticsConfiguration", "_zSortedChildren", "zSortedChildrenInvalidated", "Lcom/goldenboot/saga/zone/FlexMaterializer;", "bindBody", "Lcom/goldenboot/saga/zone/FlexMaterializer;", "()Lcom/goldenboot/saga/zone/FlexMaterializer;", "(Lcom/goldenboot/saga/zone/FlexMaterializer;)V", "measurePolicy", "dispatchTimezone", "Lcom/goldenboot/saga/zone/ListenerBuffer;", "intrinsicsPolicy", "Lcom/goldenboot/saga/zone/BackgroundCollection;", "parseAsset", "Lcom/goldenboot/saga/zone/BackgroundCollection;", "getDensity", "()Lcom/goldenboot/saga/zone/BackgroundCollection;", "injectMetric", "(Lcom/goldenboot/saga/zone/BackgroundCollection;)V", "density", "Lcom/goldenboot/saga/zone/LabelCache;", "Lcom/goldenboot/saga/zone/LabelCache;", "getLayoutDirection", "()Lcom/goldenboot/saga/zone/LabelCache;", "growPayload", "(Lcom/goldenboot/saga/zone/LabelCache;)V", "layoutDirection", "Lcom/goldenboot/saga/zone/InitMerger;", "attachCallback", "Lcom/goldenboot/saga/zone/InitMerger;", "getViewConfiguration", "()Lcom/goldenboot/saga/zone/InitMerger;", "releaseHeader", "(Lcom/goldenboot/saga/zone/InitMerger;)V", "viewConfiguration", "Lcom/goldenboot/saga/zone/StateMediator;", "Lcom/goldenboot/saga/zone/StateMediator;", "()Lcom/goldenboot/saga/zone/StateMediator;", "updateTimer", "(Lcom/goldenboot/saga/zone/StateMediator;)V", "compositionLocalMap", "Lcom/goldenboot/saga/zone/ContentRepository$ScopedMigration;", "Lcom/goldenboot/saga/zone/ContentRepository$ScopedMigration;", "compressVersion", "()Lcom/goldenboot/saga/zone/ContentRepository$ScopedMigration;", "resumeOrigin", "(Lcom/goldenboot/saga/zone/ContentRepository$ScopedMigration;)V", "intrinsicsUsageByParent", "previousIntrinsicsUsageByParent", "resolveDelta", "subscribeTask", "resetValue", "canMultiMeasure", "Lcom/goldenboot/saga/zone/MenuPage;", "Lcom/goldenboot/saga/zone/MenuPage;", "executeConfig", "()Lcom/goldenboot/saga/zone/MenuPage;", "nodes", "Lcom/goldenboot/saga/zone/NotificationBarrier;", "Lcom/goldenboot/saga/zone/NotificationBarrier;", "validateOffset", "()Lcom/goldenboot/saga/zone/NotificationBarrier;", "layoutDelegate", "Landroidx/compose/ui/layout/ClipboardState;", "groupArchive", "Landroidx/compose/ui/layout/ClipboardState;", "prepareCount", "()Landroidx/compose/ui/layout/ClipboardState;", "extractPosition", "(Landroidx/compose/ui/layout/ClipboardState;)V", "subcompositionsState", "cancelArchive", "Lcom/goldenboot/saga/zone/BridgeSerializer;", "_innerLayerCoordinator", "protectGauge", "abortBinding", "innerLayerCoordinatorIsDirty", "Landroidx/compose/ui/RemoteCallback;", "_modifier", "serializeTask", "pendingModifier", "injectField", "Lcom/goldenboot/saga/zone/TouchRecord;", "updateConstraint", "()Lcom/goldenboot/saga/zone/TouchRecord;", "flattenKey", "onAttach", "appendKey", "acquireArchive", "shrinkBundle", "onDetach", "appendEvent", "verifyChannel", "needsOnGloballyPositionedDispatch", "locateSignal", "emitStrategy", "closeEntry", "globallyPositionedObservers", "isDeactivated", "unwrapRecord", "()Lcom/goldenboot/saga/zone/PluginScheduler;", "compressBody", "zSortedChildren", "Lcom/goldenboot/saga/zone/SharedJob;", "sortSnapshot", "()Lcom/goldenboot/saga/zone/SharedJob;", "traceContext", "", "protectChannel", "()F", "zIndex", "saveMessage", "()Ljava/lang/Boolean;", "isPlacedInLookahead", "foldedChildren", "Lcom/goldenboot/saga/zone/BreadcrumbMerger;", "childMeasurables", "childLookaheadMeasurables", "measureEndpoint", "_children", "children", "acquireAsset", "parent", "popBlueprint", "isAttached", "Lcom/goldenboot/saga/zone/ContentRepository$EndpointList;", "growCallback", "()Lcom/goldenboot/saga/zone/ContentRepository$EndpointList;", "layoutState", "Lcom/goldenboot/saga/zone/PlatformDelegate;", "commitBounds", "()Lcom/goldenboot/saga/zone/PlatformDelegate;", "lookaheadPassDelegate", "Lcom/goldenboot/saga/zone/SubscriberRegulator;", "formatMessage", "()Lcom/goldenboot/saga/zone/SubscriberRegulator;", "measurePassDelegate", "detachStream", "semanticsConfiguration", "connectPool", "isValidOwnerScope", "handleFooter", "hasFixedInnerContentConstraints", "getWidth", "getHeight", "alignmentLinesRequired", "Lcom/goldenboot/saga/zone/AlphaFacilitator;", "expandScope", "()Lcom/goldenboot/saga/zone/AlphaFacilitator;", "mDrawScope", "isPlaced", "removeSource", "isPlacedByParent", "flattenToken", "placeOrder", "commitKey", "measuredByParent", "subscribeEvent", "measuredByParentInLookahead", "purgeMetric", "()Lcom/goldenboot/saga/zone/BridgeSerializer;", "innerCoordinator", "searchHolder", "outerCoordinator", "removeCount", "innerLayerCoordinator", "applyingModifierOnAttach", "evictLayout", "()Landroidx/compose/ui/RemoteCallback;", "drawField", "Lcom/goldenboot/saga/zone/PagerReducer;", "()Lcom/goldenboot/saga/zone/PagerReducer;", "coordinates", "executeRecord", "measurePending", "peekDescriptor", "layoutPending", "normalizeBundle", "lookaheadMeasurePending", "drawConfig", "lookaheadLayoutPending", "()Lcom/goldenboot/saga/zone/PressBootstrapper;", "parentInfo", "serializeOffset", "childrenInfo", "StylusConverter", "LayerUseCase", "EndpointList", "ScopedMigration", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContentRepository implements MarginBootstrapper, DimenCollection, KeyboardWatcher, ItemEvent, PressBootstrapper, AlarmMulticaster, PublisherToggle, CarouselHelper.BounceHandler {
    public static final int protectGauge = Integer.MAX_VALUE;

    /* renamed from: appendKey, reason: from kotlin metadata */
    private TouchRecord onDetach;

    /* renamed from: attachCallback, reason: from kotlin metadata */
    private InitMerger viewConfiguration;

    /* renamed from: attachConfig, reason: from kotlin metadata */
    private long lastSize;

    /* renamed from: bindBody, reason: from kotlin metadata */
    private FlexMaterializer measurePolicy;

    /* renamed from: cancelArchive, reason: from kotlin metadata */
    private BridgeSerializer _innerLayerCoordinator;

    /* renamed from: computeTarget, reason: from kotlin metadata */
    private boolean needsOnGloballyPositionedDispatch;

    /* renamed from: connectComponent, reason: from kotlin metadata */
    private ScopedMigration previousIntrinsicsUsageByParent;

    /* renamed from: connectPatch, reason: from kotlin metadata */
    private long offsetFromRoot;

    /* renamed from: decodePath, reason: from kotlin metadata */
    private int virtualChildrenCount;

    /* renamed from: dispatchTimezone, reason: from kotlin metadata */
    private ListenerBuffer intrinsicsPolicy;

    /* renamed from: drawRequest, reason: from kotlin metadata */
    private boolean isVirtualLookaheadRoot;

    /* renamed from: drawScope, reason: from kotlin metadata */
    private final InsetsFence<ContentRepository> _foldedChildren;

    /* renamed from: emitStrategy, reason: from kotlin metadata */
    private boolean isDeactivated;

    /* renamed from: expandArgs, reason: from kotlin metadata */
    private PluginScheduler _unfoldedChildren;

    /* renamed from: filterPayload, reason: from kotlin metadata */
    private boolean isSemanticsInvalidated;

    /* renamed from: findTask, reason: from kotlin metadata */
    private boolean unfoldedVirtualChildrenListDirty;

    /* renamed from: flattenPackage, reason: from kotlin metadata */
    private TrackballShaper interopViewFactoryHolder;

    /* renamed from: formatPosition, reason: from kotlin metadata */
    private final MenuPage nodes;

    /* renamed from: gatherAdapter, reason: from kotlin metadata */
    private ContentRepository lookaheadRoot;

    /* renamed from: groupArchive, reason: from kotlin metadata */
    private androidx.compose.ui.layout.ClipboardState subcompositionsState;

    /* renamed from: inflateAdapter, reason: from kotlin metadata */
    private boolean outerToInnerOffsetDirty;

    /* renamed from: inflateEdge, reason: from kotlin metadata */
    private ItemNode _semanticsConfiguration;

    /* renamed from: injectConstraint, reason: from kotlin metadata */
    private int depth;

    /* renamed from: injectField, reason: from kotlin metadata */
    private TouchRecord onAttach;

    /* renamed from: locateSignal, reason: from kotlin metadata */
    private int globallyPositionedObservers;

    /* renamed from: mapJob, reason: from kotlin metadata */
    private LabelCache layoutDirection;

    /* renamed from: mergeLocale, reason: from kotlin metadata */
    private ContentRepository _foldedParent;

    /* renamed from: notifyMessage, reason: from kotlin metadata */
    private int semanticsId;

    /* renamed from: packPackage, reason: from kotlin metadata */
    private final PluginScheduler _zSortedChildren;

    /* renamed from: parseAsset, reason: from kotlin metadata */
    private BackgroundCollection density;

    /* renamed from: prepareTask, reason: from kotlin metadata */
    private StateMediator compositionLocalMap;

    /* renamed from: purgeNode, reason: from kotlin metadata */
    private int compositeKeyHash;

    /* renamed from: queryModel, reason: from kotlin metadata */
    private boolean isCurrentlyCalculatingSemanticsConfiguration;

    /* renamed from: reduceScope, reason: from kotlin metadata */
    private final boolean isVirtual;

    /* renamed from: resetDelta, reason: from kotlin metadata */
    private long outerToInnerOffset;

    /* renamed from: resetValue, reason: from kotlin metadata */
    private androidx.compose.ui.RemoteCallback _modifier;

    /* renamed from: resolveDelta, reason: from kotlin metadata */
    private boolean innerLayerCoordinatorIsDirty;

    /* renamed from: resumeSignature, reason: from kotlin metadata */
    private final NotificationBarrier layoutDelegate;

    /* renamed from: serializeTask, reason: from kotlin metadata */
    private androidx.compose.ui.RemoteCallback pendingModifier;

    /* renamed from: startResource, reason: from kotlin metadata */
    private boolean canMultiMeasure;

    /* renamed from: storeCharset, reason: from kotlin metadata */
    private boolean ignoreRemeasureRequests;

    /* renamed from: syncScope, reason: from kotlin metadata */
    private CarouselHelper owner;

    /* renamed from: unlockMessage, reason: from kotlin metadata */
    private boolean zSortedChildrenInvalidated;

    /* renamed from: updateAction, reason: from kotlin metadata */
    private ScopedMigration intrinsicsUsageByParent;

    /* renamed from: handleFooter, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int purgeMetric = 8;
    private static final StylusConverter removeCount = new FeedbackFlow();
    private static final ElevationNode refreshCounter = ActivityMutator.reduceScope;
    private static final InitMerger compressVersion = new BounceHandler();
    private static final Comparator<ContentRepository> transformCurrency = new Comparator() { // from class: com.goldenboot.saga.zone.DialogScanner
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int gatherAdapter;
            gatherAdapter = ContentRepository.gatherAdapter((ContentRepository) obj, (ContentRepository) obj2);
            return gatherAdapter;
        }
    };

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/goldenboot/saga/zone/ContentRepository;", "evictLayout", "()Lcom/goldenboot/saga/zone/ContentRepository;"}, k = 3, mv = {2, 0, 0})
    public static final class ActivityMutator extends Lambda implements ElevationNode {
        public static final ActivityMutator reduceScope = new ActivityMutator();

        public ActivityMutator() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.goldenboot.saga.zone.ElevationNode
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final ContentRepository invoke() {
            return new ContentRepository(false, 0 == true ? 1 : 0, 3, null);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0004¨\u0006\u0011"}, d2 = {"com/goldenboot/saga/zone/ContentRepository$BounceHandler", "Lcom/goldenboot/saga/zone/InitMerger;", "", "clipOrigin", "()J", "longPressTimeoutMillis", "detachStream", "doubleTapTimeoutMillis", "releaseHeader", "doubleTapMinTimeMillis", "", "connectJob", "()F", "touchSlop", "Lcom/goldenboot/saga/zone/PipelineRecord;", "applyTask", "minimumTouchTargetSize", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BounceHandler implements InitMerger {
        @Override // com.goldenboot.saga.zone.InitMerger
        public long applyTask() {
            return PipelineRecord.INSTANCE.growPayload();
        }

        @Override // com.goldenboot.saga.zone.InitMerger
        public long clipOrigin() {
            return 400L;
        }

        @Override // com.goldenboot.saga.zone.InitMerger
        public float connectJob() {
            return 16.0f;
        }

        @Override // com.goldenboot.saga.zone.InitMerger
        public long detachStream() {
            return 300L;
        }

        @Override // com.goldenboot.saga.zone.InitMerger
        public long releaseHeader() {
            return 40L;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/goldenboot/saga/zone/ContentRepository$EndpointList;", "", "<init>", "(Ljava/lang/String;I)V", "reduceScope", "notifyMessage", "connectPatch", "attachConfig", "resetDelta", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EndpointList {
        private static final /* synthetic */ EndpointList[] inflateAdapter;
        private static final /* synthetic */ ItemProcessor purgeNode;
        public static final EndpointList reduceScope = new EndpointList("Measuring", 0);
        public static final EndpointList notifyMessage = new EndpointList("LookaheadMeasuring", 1);
        public static final EndpointList connectPatch = new EndpointList("LayingOut", 2);
        public static final EndpointList attachConfig = new EndpointList("LookaheadLayingOut", 3);
        public static final EndpointList resetDelta = new EndpointList("Idle", 4);

        static {
            EndpointList[] evictLayout = evictLayout();
            inflateAdapter = evictLayout;
            purgeNode = TranslateConductor.evictLayout(evictLayout);
        }

        private EndpointList(String str, int i) {
        }

        private static final /* synthetic */ EndpointList[] evictLayout() {
            return new EndpointList[]{reduceScope, notifyMessage, connectPatch, attachConfig, resetDelta};
        }

        public static ItemProcessor releaseHeader() {
            return purgeNode;
        }

        public static EndpointList valueOf(String str) {
            return (EndpointList) Enum.valueOf(EndpointList.class, str);
        }

        public static EndpointList[] values() {
            return (EndpointList[]) inflateAdapter.clone();
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/goldenboot/saga/zone/ContentRepository$FeedbackFlow", "Lcom/goldenboot/saga/zone/ContentRepository$StylusConverter;", "Landroidx/compose/ui/layout/PanelUtil;", "", "Lcom/goldenboot/saga/zone/BreadcrumbMerger;", "measurables", "Lcom/goldenboot/saga/zone/PagerPlanner;", "constraints", "", "connectJob", "(Landroidx/compose/ui/layout/PanelUtil;Ljava/util/List;J)Ljava/lang/Void;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FeedbackFlow extends StylusConverter {
        public FeedbackFlow() {
            super("Undefined intrinsics block and it is required");
        }

        public Void connectJob(androidx.compose.ui.layout.PanelUtil panelUtil, List<? extends BreadcrumbMerger> list, long j) {
            throw new IllegalStateException("Undefined measure and it is required");
        }

        @Override // com.goldenboot.saga.zone.FlexMaterializer
        public /* bridge */ /* synthetic */ ContentConfigurator evictLayout(androidx.compose.ui.layout.PanelUtil panelUtil, List list, long j) {
            return (ContentConfigurator) connectJob(panelUtil, list, j);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\u0003R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R*\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0013j\b\u0012\u0004\u0012\u00020\t`\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/goldenboot/saga/zone/ContentRepository$LayerUseCase;", "", "<init>", "()V", "", "NotPlacedPlaceOrder", "I", "injectMetric", "Lkotlin/Function0;", "Lcom/goldenboot/saga/zone/ContentRepository;", "Constructor", "Lcom/goldenboot/saga/zone/ElevationNode;", "evictLayout", "()Lcom/goldenboot/saga/zone/ElevationNode;", "Lcom/goldenboot/saga/zone/InitMerger;", "DummyViewConfiguration", "Lcom/goldenboot/saga/zone/InitMerger;", "growPayload", "()Lcom/goldenboot/saga/zone/InitMerger;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "ZComparator", "Ljava/util/Comparator;", "detachStream", "()Ljava/util/Comparator;", "Lcom/goldenboot/saga/zone/ContentRepository$StylusConverter;", "ErrorMeasurePolicy", "Lcom/goldenboot/saga/zone/ContentRepository$StylusConverter;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.ContentRepository$LayerUseCase, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Comparator<ContentRepository> detachStream() {
            return ContentRepository.transformCurrency;
        }

        public final ElevationNode evictLayout() {
            return ContentRepository.refreshCounter;
        }

        public final InitMerger growPayload() {
            return ContentRepository.compressVersion;
        }

        private Companion() {
        }

        public static /* synthetic */ void injectMetric() {
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/goldenboot/saga/zone/DpadBuilder;", "evictLayout", "()V"}, k = 3, mv = {2, 0, 0})
    public static final class MorphDirector extends Lambda implements ElevationNode {
        final /* synthetic */ Ref.ObjectRef<ItemNode> notifyMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MorphDirector(Ref.ObjectRef<ItemNode> objectRef) {
            super(0);
            this.notifyMessage = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.RemoteCallback$LayerUseCase] */
        /* JADX WARN: Type inference failed for: r3v10 */
        /* JADX WARN: Type inference failed for: r3v11 */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.RemoteCallback$LayerUseCase] */
        /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r3v7 */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference failed for: r3v9 */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v10 */
        /* JADX WARN: Type inference failed for: r4v11 */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v3, types: [com.goldenboot.saga.zone.PluginScheduler] */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX WARN: Type inference failed for: r4v5 */
        /* JADX WARN: Type inference failed for: r4v6, types: [com.goldenboot.saga.zone.PluginScheduler] */
        /* JADX WARN: Type inference failed for: r4v8 */
        /* JADX WARN: Type inference failed for: r4v9 */
        /* JADX WARN: Type inference failed for: r5v7, types: [T, com.goldenboot.saga.zone.ItemNode] */
        public final void evictLayout() {
            MenuPage nodes = ContentRepository.this.getNodes();
            int growPayload = AlphaScheduler.growPayload(8);
            Ref.ObjectRef<ItemNode> objectRef = this.notifyMessage;
            if ((nodes.popBlueprint() & growPayload) != 0) {
                for (RemoteCallback.LayerUseCase tail = nodes.getTail(); tail != null; tail = tail.getParent()) {
                    if ((tail.getKindSet() & growPayload) != 0) {
                        ItemMapper itemMapper = tail;
                        ?? r4 = 0;
                        while (itemMapper != 0) {
                            if (itemMapper instanceof KeyboardReducer) {
                                KeyboardReducer keyboardReducer = (KeyboardReducer) itemMapper;
                                if (keyboardReducer.getIsClearingSemantics()) {
                                    ?? itemNode = new ItemNode();
                                    objectRef.element = itemNode;
                                    itemNode.storeCharset(true);
                                }
                                if (keyboardReducer.savePool()) {
                                    objectRef.element.filterPayload(true);
                                }
                                keyboardReducer.applyData(objectRef.element);
                            } else if ((itemMapper.getKindSet() & growPayload) != 0 && (itemMapper instanceof ItemMapper)) {
                                RemoteCallback.LayerUseCase delegate = itemMapper.getDelegate();
                                int i = 0;
                                itemMapper = itemMapper;
                                r4 = r4;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & growPayload) != 0) {
                                        i++;
                                        r4 = r4;
                                        if (i == 1) {
                                            itemMapper = delegate;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new PluginScheduler(new RemoteCallback.LayerUseCase[16], 0);
                                            }
                                            if (itemMapper != 0) {
                                                r4.growPayload(itemMapper);
                                                itemMapper = 0;
                                            }
                                            r4.growPayload(delegate);
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    itemMapper = itemMapper;
                                    r4 = r4;
                                }
                                if (i == 1) {
                                }
                            }
                            itemMapper = LayoutConstructor.serializeOffset(r4);
                        }
                    }
                }
            }
        }

        @Override // com.goldenboot.saga.zone.ElevationNode
        public /* bridge */ /* synthetic */ Object invoke() {
            evictLayout();
            return DpadBuilder.evictLayout;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class PluginInterpreter {
        public static final /* synthetic */ int[] evictLayout;

        static {
            int[] iArr = new int[EndpointList.values().length];
            try {
                iArr[EndpointList.resetDelta.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            evictLayout = iArr;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/goldenboot/saga/zone/DpadBuilder;", "evictLayout", "()V"}, k = 3, mv = {2, 0, 0})
    public static final class RestoreToggle extends Lambda implements ElevationNode {
        public RestoreToggle() {
            super(0);
        }

        public final void evictLayout() {
            ContentRepository.this.getLayoutDelegate().syncScope();
        }

        @Override // com.goldenboot.saga.zone.ElevationNode
        public /* bridge */ /* synthetic */ Object invoke() {
            evictLayout();
            return DpadBuilder.evictLayout;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/goldenboot/saga/zone/ContentRepository$ScopedMigration;", "", "<init>", "(Ljava/lang/String;I)V", "reduceScope", "notifyMessage", "connectPatch", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ScopedMigration {
        private static final /* synthetic */ ScopedMigration[] attachConfig;
        private static final /* synthetic */ ItemProcessor resetDelta;
        public static final ScopedMigration reduceScope = new ScopedMigration("InMeasureBlock", 0);
        public static final ScopedMigration notifyMessage = new ScopedMigration("InLayoutBlock", 1);
        public static final ScopedMigration connectPatch = new ScopedMigration("NotUsed", 2);

        static {
            ScopedMigration[] evictLayout = evictLayout();
            attachConfig = evictLayout;
            resetDelta = TranslateConductor.evictLayout(evictLayout);
        }

        private ScopedMigration(String str, int i) {
        }

        private static final /* synthetic */ ScopedMigration[] evictLayout() {
            return new ScopedMigration[]{reduceScope, notifyMessage, connectPatch};
        }

        public static ItemProcessor releaseHeader() {
            return resetDelta;
        }

        public static ScopedMigration valueOf(String str) {
            return (ScopedMigration) Enum.valueOf(ScopedMigration.class, str);
        }

        public static ScopedMigration[] values() {
            return (ScopedMigration[]) attachConfig.clone();
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\t\b!\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0010\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ)\u0010\u0011\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ)\u0010\u0012\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/goldenboot/saga/zone/ContentRepository$StylusConverter;", "Lcom/goldenboot/saga/zone/FlexMaterializer;", "", "error", "<init>", "(Ljava/lang/String;)V", "Lcom/goldenboot/saga/zone/ProducerRecovery;", "", "Lcom/goldenboot/saga/zone/FrameRevision;", "measurables", "", "height", "", "drawField", "(Lcom/goldenboot/saga/zone/ProducerRecovery;Ljava/util/List;I)Ljava/lang/Void;", "width", "applyTask", "updateTimer", "clipOrigin", "evictLayout", "Ljava/lang/String;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class StylusConverter implements FlexMaterializer {
        public static final int growPayload = 0;

        /* renamed from: evictLayout, reason: from kotlin metadata */
        private final String error;

        public StylusConverter(String str) {
            this.error = str;
        }

        public Void applyTask(ProducerRecovery producerRecovery, List<? extends FrameRevision> list, int i) {
            throw new IllegalStateException(this.error.toString());
        }

        public Void clipOrigin(ProducerRecovery producerRecovery, List<? extends FrameRevision> list, int i) {
            throw new IllegalStateException(this.error.toString());
        }

        @Override // com.goldenboot.saga.zone.FlexMaterializer
        public /* bridge */ /* synthetic */ int detachStream(ProducerRecovery producerRecovery, List list, int i) {
            return ((Number) drawField(producerRecovery, list, i)).intValue();
        }

        public Void drawField(ProducerRecovery producerRecovery, List<? extends FrameRevision> list, int i) {
            throw new IllegalStateException(this.error.toString());
        }

        @Override // com.goldenboot.saga.zone.FlexMaterializer
        public /* bridge */ /* synthetic */ int growPayload(ProducerRecovery producerRecovery, List list, int i) {
            return ((Number) clipOrigin(producerRecovery, list, i)).intValue();
        }

        @Override // com.goldenboot.saga.zone.FlexMaterializer
        public /* bridge */ /* synthetic */ int injectMetric(ProducerRecovery producerRecovery, List list, int i) {
            return ((Number) updateTimer(producerRecovery, list, i)).intValue();
        }

        @Override // com.goldenboot.saga.zone.FlexMaterializer
        public /* bridge */ /* synthetic */ int releaseHeader(ProducerRecovery producerRecovery, List list, int i) {
            return ((Number) applyTask(producerRecovery, list, i)).intValue();
        }

        public Void updateTimer(ProducerRecovery producerRecovery, List<? extends FrameRevision> list, int i) {
            throw new IllegalStateException(this.error.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContentRepository() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    private final void clearTimer(ContentRepository contentRepository) {
        if (Intrinsics.areEqual(contentRepository, this.lookaheadRoot)) {
            return;
        }
        this.lookaheadRoot = contentRepository;
        if (contentRepository != null) {
            this.layoutDelegate.evictLayout();
            BridgeSerializer wrapped = purgeMetric().getWrapped();
            for (BridgeSerializer searchHolder = searchHolder(); !Intrinsics.areEqual(searchHolder, wrapped) && searchHolder != null; searchHolder = searchHolder.getWrapped()) {
                searchHolder.mergeEvent();
            }
        } else {
            this.layoutDelegate.queryModel();
        }
        queryDescriptor();
    }

    public static /* synthetic */ void closeComponent(ContentRepository contentRepository, long j, MenuResolver menuResolver, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = ServerSnapshot.INSTANCE.detachStream();
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = true;
        }
        contentRepository.closeSource(j, menuResolver, i3, z);
    }

    private final void compressPattern() {
        if (this.unfoldedVirtualChildrenListDirty) {
            this.unfoldedVirtualChildrenListDirty = false;
            PluginScheduler pluginScheduler = this._unfoldedChildren;
            if (pluginScheduler == null) {
                pluginScheduler = new PluginScheduler(new ContentRepository[16], 0);
                this._unfoldedChildren = pluginScheduler;
            }
            pluginScheduler.popBlueprint();
            PluginScheduler vector = this._foldedChildren.getVector();
            Object[] objArr = vector.reduceScope;
            int reduceScope = vector.reduceScope();
            for (int i = 0; i < reduceScope; i++) {
                ContentRepository contentRepository = (ContentRepository) objArr[i];
                if (contentRepository.isVirtual) {
                    pluginScheduler.releaseHeader(pluginScheduler.reduceScope(), contentRepository.measureEndpoint());
                } else {
                    pluginScheduler.growPayload(contentRepository);
                }
            }
            this.layoutDelegate.syncScope();
        }
    }

    public static /* synthetic */ void convertFrame(ContentRepository contentRepository, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        contentRepository.initItem(z);
    }

    private final void encodeOrigin() {
        this.nodes.storeCharset();
    }

    private final String filterPayload(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        PluginScheduler measureEndpoint = measureEndpoint();
        Object[] objArr = measureEndpoint.reduceScope;
        int reduceScope = measureEndpoint.reduceScope();
        for (int i2 = 0; i2 < reduceScope; i2++) {
            sb.append(((ContentRepository) objArr[i2]).filterPayload(depth + 1));
        }
        String sb2 = sb.toString();
        if (depth != 0) {
            return sb2;
        }
        String substring = sb2.substring(0, sb2.length() - 1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    private final void filterTimer() {
        ContentRepository contentRepository;
        if (this.virtualChildrenCount > 0) {
            this.unfoldedVirtualChildrenListDirty = true;
        }
        if (!this.isVirtual || (contentRepository = this._foldedParent) == null) {
            return;
        }
        contentRepository.filterTimer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, com.goldenboot.saga.zone.ItemNode] */
    private final ItemNode flattenPackage() {
        this.isCurrentlyCalculatingSemanticsConfiguration = true;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new ItemNode();
        MenuReceiver.injectMetric(this).getSnapshotObserver().popBlueprint(this, new MorphDirector(objectRef));
        this.isCurrentlyCalculatingSemanticsConfiguration = false;
        return (ItemNode) objectRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int gatherAdapter(ContentRepository contentRepository, ContentRepository contentRepository2) {
        return contentRepository.protectChannel() == contentRepository2.protectChannel() ? Intrinsics.compare(contentRepository.flattenToken(), contentRepository2.flattenToken()) : Float.compare(contentRepository.protectChannel(), contentRepository2.protectChannel());
    }

    public static /* synthetic */ String inflateEdge(ContentRepository contentRepository, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return contentRepository.filterPayload(i);
    }

    private final void mergeLocale(androidx.compose.ui.RemoteCallback modifier) {
        boolean resetDelta = this.nodes.resetDelta(AlphaScheduler.growPayload(16));
        boolean resetDelta2 = this.nodes.resetDelta(AlphaScheduler.growPayload(ContentOperation.RotationZ));
        this._modifier = modifier;
        this.nodes.prepareTask(modifier);
        boolean resetDelta3 = this.nodes.resetDelta(AlphaScheduler.growPayload(16));
        boolean resetDelta4 = this.nodes.resetDelta(AlphaScheduler.growPayload(ContentOperation.RotationZ));
        this.layoutDelegate.resetValue();
        if (this.lookaheadRoot == null && this.nodes.resetDelta(AlphaScheduler.growPayload(ContentOperation.RotationY))) {
            clearTimer(this);
        }
        if (resetDelta == resetDelta3 && resetDelta2 == resetDelta4) {
            return;
        }
        MenuReceiver.injectMetric(this).getRectManager().gatherAdapter(this, resetDelta4, resetDelta3);
    }

    public static /* synthetic */ boolean normalizeMetadata(ContentRepository contentRepository, PagerPlanner pagerPlanner, int i, Object obj) {
        if ((i & 1) != 0) {
            pagerPlanner = contentRepository.layoutDelegate.drawField();
        }
        return contentRepository.clipRule(pagerPlanner);
    }

    private final ListenerBuffer offerHash() {
        ListenerBuffer listenerBuffer = this.intrinsicsPolicy;
        if (listenerBuffer != null) {
            return listenerBuffer;
        }
        ListenerBuffer listenerBuffer2 = new ListenerBuffer(this, getMeasurePolicy());
        this.intrinsicsPolicy = listenerBuffer2;
        return listenerBuffer2;
    }

    private final void openContent(ContentRepository child) {
        if (child.layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            this.layoutDelegate.bindBody(r0.getChildrenAccessingCoordinatesDuringPlacement() - 1);
        }
        if (this.owner != null) {
            child.queryModel();
        }
        child._foldedParent = null;
        if (child.globallyPositionedObservers > 0) {
            closeEntry(this.globallyPositionedObservers - 1);
        }
        child.searchHolder().observeContent(null);
        if (child.isVirtual) {
            this.virtualChildrenCount--;
            PluginScheduler vector = child._foldedChildren.getVector();
            Object[] objArr = vector.reduceScope;
            int reduceScope = vector.reduceScope();
            for (int i = 0; i < reduceScope; i++) {
                ((ContentRepository) objArr[i]).searchHolder().observeContent(null);
            }
        }
        filterTimer();
        pauseCurrency();
    }

    public static /* synthetic */ boolean popDigest(ContentRepository contentRepository, PagerPlanner pagerPlanner, int i, Object obj) {
        if ((i & 1) != 0) {
            pagerPlanner = contentRepository.layoutDelegate.popBlueprint();
        }
        return contentRepository.normalizeRecord(pagerPlanner);
    }

    public static /* synthetic */ void popScope(ContentRepository contentRepository, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        contentRepository.flushHeader(z);
    }

    private final float protectChannel() {
        return formatMessage().savePool();
    }

    private final void renderBounds() {
        queryDescriptor();
        ContentRepository acquireAsset = acquireAsset();
        if (acquireAsset != null) {
            acquireAsset.escapeBounds();
        }
        openJob();
    }

    private final SharedJob sortSnapshot() {
        return (SharedJob) getCompositionLocalMap().injectMetric(InsetsVersion.injectMetric());
    }

    private final void storeCharset() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = ScopedMigration.connectPatch;
        PluginScheduler measureEndpoint = measureEndpoint();
        Object[] objArr = measureEndpoint.reduceScope;
        int reduceScope = measureEndpoint.reduceScope();
        for (int i = 0; i < reduceScope; i++) {
            ContentRepository contentRepository = (ContentRepository) objArr[i];
            if (contentRepository.intrinsicsUsageByParent == ScopedMigration.notifyMessage) {
                contentRepository.storeCharset();
            }
        }
    }

    public static /* synthetic */ void trackOptions(ContentRepository contentRepository, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        contentRepository.createConstraint(z);
    }

    private final void transformCount() {
        long j = this.offsetFromRoot;
        FontReporter.Companion companion = FontReporter.INSTANCE;
        if (FontReporter.drawField(j, companion.evictLayout())) {
            return;
        }
        this.offsetFromRoot = companion.evictLayout();
        PluginScheduler measureEndpoint = measureEndpoint();
        Object[] objArr = measureEndpoint.reduceScope;
        int reduceScope = measureEndpoint.reduceScope();
        for (int i = 0; i < reduceScope; i++) {
            ((ContentRepository) objArr[i]).transformCount();
        }
    }

    public static /* synthetic */ void transformSignal(ContentRepository contentRepository, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        contentRepository.growState(z, z2, z3);
    }

    public static /* synthetic */ void trimCallback(ContentRepository contentRepository, long j, MenuResolver menuResolver, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = ServerSnapshot.INSTANCE.releaseHeader();
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = true;
        }
        contentRepository.prependArchive(j, menuResolver, i3, z);
    }

    public static /* synthetic */ void unwrapView(ContentRepository contentRepository, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        contentRepository.performLink(z, z2, z3);
    }

    private final String updateAction(ContentRepository instance) {
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot insert ");
        sb.append(instance);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(inflateEdge(this, 0, 1, null));
        sb.append(" Other tree: ");
        ContentRepository contentRepository = instance._foldedParent;
        sb.append(contentRepository != null ? inflateEdge(contentRepository, 0, 1, null) : null);
        return sb.toString();
    }

    public final void abortBinding(boolean z) {
        this.innerLayerCoordinatorIsDirty = z;
    }

    public final void abortModel(boolean z) {
        this.isSemanticsInvalidated = z;
    }

    /* renamed from: acquireArchive, reason: from getter */
    public final TouchRecord getOnDetach() {
        return this.onDetach;
    }

    public final ContentRepository acquireAsset() {
        ContentRepository contentRepository = this._foldedParent;
        while (contentRepository != null && contentRepository.isVirtual) {
            contentRepository = contentRepository._foldedParent;
        }
        return contentRepository;
    }

    /* renamed from: appendEvent, reason: from getter */
    public final boolean getNeedsOnGloballyPositionedDispatch() {
        return this.needsOnGloballyPositionedDispatch;
    }

    public final List<ContentRepository> appendKey() {
        return measureEndpoint().applyTask();
    }

    public final void applyData(long j) {
        this.lastSize = j;
    }

    @Override // com.goldenboot.saga.zone.MarginBootstrapper
    public void applyTask() {
        TrackballShaper trackballShaper = this.interopViewFactoryHolder;
        if (trackballShaper != null) {
            trackballShaper.applyTask();
        }
        androidx.compose.ui.layout.ClipboardState clipboardState = this.subcompositionsState;
        if (clipboardState != null) {
            clipboardState.applyTask();
        }
        BridgeSerializer wrapped = purgeMetric().getWrapped();
        for (BridgeSerializer searchHolder = searchHolder(); !Intrinsics.areEqual(searchHolder, wrapped) && searchHolder != null; searchHolder = searchHolder.getWrapped()) {
            searchHolder.cacheScope();
        }
    }

    @Override // com.goldenboot.saga.zone.ItemEvent
    /* renamed from: attachCallback, reason: from getter */
    public boolean getIsDeactivated() {
        return this.isDeactivated;
    }

    @Override // com.goldenboot.saga.zone.MarginBootstrapper
    public void attachConfig() {
        if (!popBlueprint()) {
            PagerBridge.flushSample("onReuse is only expected on attached node");
        }
        TrackballShaper trackballShaper = this.interopViewFactoryHolder;
        if (trackballShaper != null) {
            trackballShaper.attachConfig();
        }
        androidx.compose.ui.layout.ClipboardState clipboardState = this.subcompositionsState;
        if (clipboardState != null) {
            clipboardState.attachConfig();
        }
        this.isCurrentlyCalculatingSemanticsConfiguration = false;
        if (getIsDeactivated()) {
            this.isDeactivated = false;
            if (!WindowMapper.isSemanticAutofillEnabled) {
                prependOptions();
            }
        } else {
            encodeOrigin();
        }
        int semanticsId = getSemanticsId();
        writeSnapshot(FontPartition.detachStream());
        CarouselHelper carouselHelper = this.owner;
        if (carouselHelper != null) {
            carouselHelper.prepareTask(this, semanticsId);
        }
        this.nodes.findTask();
        this.nodes.filterPayload();
        if (WindowMapper.isSemanticAutofillEnabled && this.nodes.resetDelta(AlphaScheduler.growPayload(8))) {
            prependOptions();
        }
        formatCurrency(this);
        CarouselHelper carouselHelper2 = this.owner;
        if (carouselHelper2 != null) {
            carouselHelper2.serializeOffset(this, semanticsId);
        }
    }

    public final void attachTimezone(long j) {
        this.outerToInnerOffset = j;
    }

    public final int attachVersion(int height) {
        return offerHash().clipOrigin(height);
    }

    @Override // com.goldenboot.saga.zone.ItemEvent
    public boolean bindBody() {
        return formatMessage().bindBody();
    }

    public final boolean cancelArchive() {
        return this.pendingModifier != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.RemoteCallback$LayerUseCase] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.RemoteCallback$LayerUseCase] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.goldenboot.saga.zone.PluginScheduler] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.goldenboot.saga.zone.PluginScheduler] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // com.goldenboot.saga.zone.CarouselHelper.BounceHandler
    public void clipOrigin() {
        BridgeSerializer purgeMetric2 = purgeMetric();
        int growPayload = AlphaScheduler.growPayload(ContentOperation.SpotShadowColor);
        boolean popBlueprint = SwipeEmitter.popBlueprint(growPayload);
        RemoteCallback.LayerUseCase packSnapshot = purgeMetric2.packSnapshot();
        if (!popBlueprint && (packSnapshot = packSnapshot.getParent()) == null) {
            return;
        }
        for (RemoteCallback.LayerUseCase formatAsset = purgeMetric2.formatAsset(popBlueprint); formatAsset != null && (formatAsset.getAggregateChildKindSet() & growPayload) != 0; formatAsset = formatAsset.getChild()) {
            if ((formatAsset.getKindSet() & growPayload) != 0) {
                ItemMapper itemMapper = formatAsset;
                ?? r5 = 0;
                while (itemMapper != 0) {
                    if (itemMapper instanceof PublisherMigration) {
                        ((PublisherMigration) itemMapper).parseAsset(purgeMetric());
                    } else if ((itemMapper.getKindSet() & growPayload) != 0 && (itemMapper instanceof ItemMapper)) {
                        RemoteCallback.LayerUseCase delegate = itemMapper.getDelegate();
                        int i = 0;
                        itemMapper = itemMapper;
                        r5 = r5;
                        while (delegate != null) {
                            if ((delegate.getKindSet() & growPayload) != 0) {
                                i++;
                                r5 = r5;
                                if (i == 1) {
                                    itemMapper = delegate;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new PluginScheduler(new RemoteCallback.LayerUseCase[16], 0);
                                    }
                                    if (itemMapper != 0) {
                                        r5.growPayload(itemMapper);
                                        itemMapper = 0;
                                    }
                                    r5.growPayload(delegate);
                                }
                            }
                            delegate = delegate.getChild();
                            itemMapper = itemMapper;
                            r5 = r5;
                        }
                        if (i == 1) {
                        }
                    }
                    itemMapper = LayoutConstructor.serializeOffset(r5);
                }
            }
            if (formatAsset == packSnapshot) {
                return;
            }
        }
    }

    public final boolean clipRule(PagerPlanner constraints) {
        if (constraints == null || this.lookaheadRoot == null) {
            return false;
        }
        PlatformDelegate commitBounds = commitBounds();
        Intrinsics.checkNotNull(commitBounds);
        return commitBounds.prependBundle(constraints.getValue());
    }

    public final void closeCallback(TrackballShaper trackballShaper) {
        this.interopViewFactoryHolder = trackballShaper;
    }

    public final void closeEntry(int i) {
        ContentRepository acquireAsset;
        ContentRepository acquireAsset2;
        int i2 = this.globallyPositionedObservers;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (acquireAsset2 = acquireAsset()) != null) {
                acquireAsset2.closeEntry(acquireAsset2.globallyPositionedObservers + 1);
            }
            if (i == 0 && this.globallyPositionedObservers > 0 && (acquireAsset = acquireAsset()) != null) {
                acquireAsset.closeEntry(acquireAsset.globallyPositionedObservers - 1);
            }
            this.globallyPositionedObservers = i;
        }
    }

    /* renamed from: closePayload, reason: from getter */
    public final ContentRepository getLookaheadRoot() {
        return this.lookaheadRoot;
    }

    public final void closeSource(long pointerPosition, MenuResolver hitSemanticsEntities, int pointerType, boolean isInLayer) {
        searchHolder().syncSample(BridgeSerializer.INSTANCE.growPayload(), BridgeSerializer.inflateScope(searchHolder(), pointerPosition, false, 2, null), hitSemanticsEntities, ServerSnapshot.INSTANCE.detachStream(), isInLayer);
    }

    /* renamed from: collectPolicy, reason: from getter */
    public final boolean getIsVirtualLookaheadRoot() {
        return this.isVirtualLookaheadRoot;
    }

    public final PlatformDelegate commitBounds() {
        return this.layoutDelegate.getLookaheadPassDelegate();
    }

    public final ScopedMigration commitKey() {
        return formatMessage().growPool();
    }

    /* renamed from: compressVersion, reason: from getter */
    public final ScopedMigration getIntrinsicsUsageByParent() {
        return this.intrinsicsUsageByParent;
    }

    /* renamed from: computeTarget, reason: from getter */
    public final int getDepth() {
        return this.depth;
    }

    public final void connectComponent(TouchRecord block) {
        PluginScheduler measureEndpoint = measureEndpoint();
        Object[] objArr = measureEndpoint.reduceScope;
        int reduceScope = measureEndpoint.reduceScope();
        for (int i = 0; i < reduceScope; i++) {
            block.invoke(objArr[i]);
        }
    }

    @Override // com.goldenboot.saga.zone.AlarmMulticaster
    /* renamed from: connectJob, reason: from getter */
    public int getCompositeKeyHash() {
        return this.compositeKeyHash;
    }

    @Override // com.goldenboot.saga.zone.AlarmMulticaster
    /* renamed from: connectPatch, reason: from getter */
    public FlexMaterializer getMeasurePolicy() {
        return this.measurePolicy;
    }

    @Override // com.goldenboot.saga.zone.KeyboardWatcher
    public boolean connectPool() {
        return popBlueprint();
    }

    public final void createConstraint(boolean forceRequest) {
        CarouselHelper carouselHelper;
        if (this.isVirtual || (carouselHelper = this.owner) == null) {
            return;
        }
        carouselHelper.startResource(this, true, forceRequest);
    }

    public final int createLayout(int width) {
        return offerHash().applyTask(width);
    }

    public final int decodeLayout(int height) {
        return offerHash().updateTimer(height);
    }

    public final void decodeOrigin(int x, int y) {
        GradientActivator.ActivityMutator placementScope;
        BridgeSerializer purgeMetric2;
        if (this.intrinsicsUsageByParent == ScopedMigration.connectPatch) {
            storeCharset();
        }
        ContentRepository acquireAsset = acquireAsset();
        if (acquireAsset == null || (purgeMetric2 = acquireAsset.purgeMetric()) == null || (placementScope = purgeMetric2.getPlacementScope()) == null) {
            placementScope = MenuReceiver.injectMetric(this).getPlacementScope();
        }
        GradientActivator.ActivityMutator.drawConfig(placementScope, formatMessage(), x, y, 0.0f, 4, null);
    }

    @Override // com.goldenboot.saga.zone.PressBootstrapper
    public ItemNode detachStream() {
        if (!popBlueprint() || getIsDeactivated() || !this.nodes.resetDelta(AlphaScheduler.growPayload(8))) {
            return null;
        }
        if (!WindowMapper.isSemanticAutofillEnabled && this._semanticsConfiguration == null) {
            this._semanticsConfiguration = flattenPackage();
        }
        return this._semanticsConfiguration;
    }

    @Override // com.goldenboot.saga.zone.ItemEvent
    public PagerReducer dispatchTimezone() {
        return purgeMetric();
    }

    public final void drainComponent(int from, int to, int count) {
        if (from == to) {
            return;
        }
        for (int i = 0; i < count; i++) {
            this._foldedChildren.evictLayout(from > to ? to + i : (to + count) - 2, this._foldedChildren.applyTask(from > to ? from + i : from));
        }
        pauseCurrency();
        filterTimer();
        queryDescriptor();
    }

    public final boolean drawConfig() {
        return this.layoutDelegate.getLookaheadLayoutPending();
    }

    @Override // com.goldenboot.saga.zone.AlarmMulticaster
    public void drawField(androidx.compose.ui.RemoteCallback remoteCallback) {
        if (!(!this.isVirtual || get_modifier() == androidx.compose.ui.RemoteCallback.INSTANCE)) {
            PagerBridge.flushSample("Modifiers are not supported on virtual LayoutNodes");
        }
        if (getIsDeactivated()) {
            PagerBridge.flushSample("modifier is updated when deactivated");
        }
        if (!popBlueprint()) {
            this.pendingModifier = remoteCallback;
            return;
        }
        mergeLocale(remoteCallback);
        if (this.isSemanticsInvalidated) {
            prependOptions();
        }
    }

    /* renamed from: emitStrategy, reason: from getter */
    public final int getGloballyPositionedObservers() {
        return this.globallyPositionedObservers;
    }

    public final void escapeBounds() {
        BridgeSerializer removeCount2 = removeCount();
        if (removeCount2 != null) {
            removeCount2.escapeMetadata();
            return;
        }
        ContentRepository acquireAsset = acquireAsset();
        if (acquireAsset != null) {
            acquireAsset.escapeBounds();
        }
    }

    public final void escapeDelta() {
        this.layoutDelegate.injectConstraint();
    }

    public final void escapeFooter() {
        PluginScheduler measureEndpoint = measureEndpoint();
        Object[] objArr = measureEndpoint.reduceScope;
        int reduceScope = measureEndpoint.reduceScope();
        for (int i = 0; i < reduceScope; i++) {
            ContentRepository contentRepository = (ContentRepository) objArr[i];
            ScopedMigration scopedMigration = contentRepository.previousIntrinsicsUsageByParent;
            contentRepository.intrinsicsUsageByParent = scopedMigration;
            if (scopedMigration != ScopedMigration.connectPatch) {
                contentRepository.escapeFooter();
            }
        }
    }

    @Override // com.goldenboot.saga.zone.AlarmMulticaster
    /* renamed from: evictLayout, reason: from getter */
    public androidx.compose.ui.RemoteCallback get_modifier() {
        return this._modifier;
    }

    public final void evictOrigin() {
        this.layoutDelegate.mergeLocale();
    }

    /* renamed from: executeConfig, reason: from getter */
    public final MenuPage getNodes() {
        return this.nodes;
    }

    public final boolean executeRecord() {
        return this.layoutDelegate.gatherAdapter();
    }

    public final AlphaFacilitator expandScope() {
        return MenuReceiver.injectMetric(this).getSharedDrawScope();
    }

    public final void expandSnapshot(int i) {
        this.depth = i;
    }

    public final void extractPosition(androidx.compose.ui.layout.ClipboardState clipboardState) {
        this.subcompositionsState = clipboardState;
    }

    public final void filterPattern(int index, int count) {
        if (!(count >= 0)) {
            PagerBridge.flushSample("count (" + count + ") must be greater than 0");
        }
        int i = (count + index) - 1;
        if (index > i) {
            return;
        }
        while (true) {
            openContent((ContentRepository) this._foldedChildren.getVector().reduceScope[i]);
            this._foldedChildren.applyTask(i);
            if (i == index) {
                return;
            } else {
                i--;
            }
        }
    }

    public final void filterSchema() {
        this.layoutDelegate.storeCharset();
    }

    public final void flattenKey(TouchRecord touchRecord) {
        this.onAttach = touchRecord;
    }

    public final int flattenToken() {
        return formatMessage().broadcastModule();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.compose.ui.RemoteCallback$LayerUseCase] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.compose.ui.RemoteCallback$LayerUseCase] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.goldenboot.saga.zone.PluginScheduler] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.goldenboot.saga.zone.PluginScheduler] */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void flushHeader(boolean isRootOfInvalidation) {
        ContentRepository acquireAsset;
        if (isRootOfInvalidation && (acquireAsset = acquireAsset()) != null) {
            acquireAsset.escapeBounds();
        }
        prependOptions();
        unwrapView(this, false, false, false, 7, null);
        MenuPage menuPage = this.nodes;
        int growPayload = AlphaScheduler.growPayload(2);
        if ((menuPage.popBlueprint() & growPayload) != 0) {
            for (RemoteCallback.LayerUseCase head = menuPage.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & growPayload) != 0) {
                    ItemMapper itemMapper = head;
                    ?? r5 = 0;
                    while (itemMapper != 0) {
                        if (itemMapper instanceof KeyframeCreator) {
                            ShapeAssembler layer = LayoutConstructor.notifyMessage((KeyframeCreator) itemMapper, AlphaScheduler.growPayload(2)).getLayer();
                            if (layer != null) {
                                layer.invalidate();
                            }
                        } else if ((itemMapper.getKindSet() & growPayload) != 0 && (itemMapper instanceof ItemMapper)) {
                            RemoteCallback.LayerUseCase delegate = itemMapper.getDelegate();
                            int i = 0;
                            itemMapper = itemMapper;
                            r5 = r5;
                            while (delegate != null) {
                                if ((delegate.getKindSet() & growPayload) != 0) {
                                    i++;
                                    r5 = r5;
                                    if (i == 1) {
                                        itemMapper = delegate;
                                    } else {
                                        if (r5 == 0) {
                                            r5 = new PluginScheduler(new RemoteCallback.LayerUseCase[16], 0);
                                        }
                                        if (itemMapper != 0) {
                                            r5.growPayload(itemMapper);
                                            itemMapper = 0;
                                        }
                                        r5.growPayload(delegate);
                                    }
                                }
                                delegate = delegate.getChild();
                                itemMapper = itemMapper;
                                r5 = r5;
                            }
                            if (i == 1) {
                            }
                        }
                        itemMapper = LayoutConstructor.serializeOffset(r5);
                    }
                }
                if ((head.getAggregateChildKindSet() & growPayload) == 0) {
                    break;
                }
            }
        }
        PluginScheduler measureEndpoint = measureEndpoint();
        Object[] objArr = measureEndpoint.reduceScope;
        int reduceScope = measureEndpoint.reduceScope();
        for (int i2 = 0; i2 < reduceScope; i2++) {
            ((ContentRepository) objArr[i2]).flushHeader(false);
        }
    }

    @Override // com.goldenboot.saga.zone.AlarmMulticaster
    public void flushSample(int i) {
        this.compositeKeyHash = i;
    }

    public final void flushTimer() {
        if (this.virtualChildrenCount > 0) {
            compressPattern();
        }
    }

    public final void formatCurrency(ContentRepository it) {
        if (PluginInterpreter.evictLayout[it.growCallback().ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + it.growCallback());
        }
        if (it.normalizeBundle()) {
            transformSignal(it, true, false, false, 6, null);
            return;
        }
        if (it.drawConfig()) {
            it.createConstraint(true);
        }
        if (it.executeRecord()) {
            unwrapView(it, true, false, false, 6, null);
        } else if (it.peekDescriptor()) {
            it.initItem(true);
        }
    }

    public final SubscriberRegulator formatMessage() {
        return this.layoutDelegate.getMeasurePassDelegate();
    }

    public final void formatPosition(TouchRecord block) {
        BridgeSerializer searchHolder = searchHolder();
        BridgeSerializer purgeMetric2 = purgeMetric();
        while (searchHolder != purgeMetric2) {
            Intrinsics.checkNotNull(searchHolder, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            ClipboardResolver clipboardResolver = (ClipboardResolver) searchHolder;
            block.invoke(clipboardResolver);
            searchHolder = clipboardResolver.getWrapped();
        }
    }

    @Override // com.goldenboot.saga.zone.ItemEvent, com.goldenboot.saga.zone.AlarmMulticaster
    public BackgroundCollection getDensity() {
        return this.density;
    }

    @Override // com.goldenboot.saga.zone.ItemEvent
    public int getHeight() {
        return this.layoutDelegate.applyTask();
    }

    @Override // com.goldenboot.saga.zone.ItemEvent, com.goldenboot.saga.zone.AlarmMulticaster
    public LabelCache getLayoutDirection() {
        return this.layoutDirection;
    }

    @Override // com.goldenboot.saga.zone.ItemEvent, com.goldenboot.saga.zone.AlarmMulticaster
    public InitMerger getViewConfiguration() {
        return this.viewConfiguration;
    }

    @Override // com.goldenboot.saga.zone.ItemEvent
    public int getWidth() {
        return this.layoutDelegate.findTask();
    }

    public final boolean groupArchive() {
        AbstractSlot reduceScope;
        ClickDelta injectConstraint;
        NotificationBarrier notificationBarrier = this.layoutDelegate;
        return notificationBarrier.growPayload().injectConstraint().connectJob() || !((reduceScope = notificationBarrier.reduceScope()) == null || (injectConstraint = reduceScope.injectConstraint()) == null || !injectConstraint.connectJob());
    }

    public final void growCache(long j) {
        this.offsetFromRoot = j;
    }

    public final EndpointList growCallback() {
        return this.layoutDelegate.getLayoutState();
    }

    @Override // com.goldenboot.saga.zone.AlarmMulticaster
    public void growPayload(LabelCache labelCache) {
        if (this.layoutDirection != labelCache) {
            this.layoutDirection = labelCache;
            renderBounds();
            for (RemoteCallback.LayerUseCase head = this.nodes.getHead(); head != null; head = head.getChild()) {
                head.applyCounter();
            }
        }
    }

    public final void growState(boolean forceRequest, boolean scheduleMeasureAndLayout, boolean invalidateIntrinsics) {
        if (!(this.lookaheadRoot != null)) {
            PagerBridge.applyTask("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        CarouselHelper carouselHelper = this.owner;
        if (carouselHelper == null || this.ignoreRemeasureRequests || this.isVirtual) {
            return;
        }
        carouselHelper.flushSample(this, true, forceRequest, scheduleMeasureAndLayout);
        if (invalidateIntrinsics) {
            PlatformDelegate commitBounds = commitBounds();
            Intrinsics.checkNotNull(commitBounds);
            commitBounds.broadcastModule(forceRequest);
        }
    }

    public final boolean handleFooter() {
        long peekPattern = purgeMetric().peekPattern();
        return PagerPlanner.serializeOffset(peekPattern) && PagerPlanner.connectJob(peekPattern);
    }

    @Override // com.goldenboot.saga.zone.PublisherToggle
    public View inflateAdapter() {
        TrackballShaper trackballShaper = this.interopViewFactoryHolder;
        if (trackballShaper != null) {
            return trackballShaper.getInteropView();
        }
        return null;
    }

    public final void initItem(boolean forceRequest) {
        CarouselHelper carouselHelper;
        if (this.isVirtual || (carouselHelper = this.owner) == null) {
            return;
        }
        CarouselHelper.mergeLocale(carouselHelper, this, false, forceRequest, 2, null);
    }

    public final void injectAsset() {
        int reduceScope = this._foldedChildren.getVector().reduceScope();
        while (true) {
            reduceScope--;
            if (-1 >= reduceScope) {
                this._foldedChildren.injectMetric();
                return;
            }
            openContent((ContentRepository) this._foldedChildren.getVector().reduceScope[reduceScope]);
        }
    }

    public final void injectConstraint() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = ScopedMigration.connectPatch;
        PluginScheduler measureEndpoint = measureEndpoint();
        Object[] objArr = measureEndpoint.reduceScope;
        int reduceScope = measureEndpoint.reduceScope();
        for (int i = 0; i < reduceScope; i++) {
            ContentRepository contentRepository = (ContentRepository) objArr[i];
            if (contentRepository.intrinsicsUsageByParent != ScopedMigration.connectPatch) {
                contentRepository.injectConstraint();
            }
        }
    }

    public final List<BreadcrumbMerger> injectField() {
        return formatMessage().scheduleTemplate();
    }

    @Override // com.goldenboot.saga.zone.AlarmMulticaster
    public void injectMetric(BackgroundCollection backgroundCollection) {
        if (Intrinsics.areEqual(this.density, backgroundCollection)) {
            return;
        }
        this.density = backgroundCollection;
        renderBounds();
        for (RemoteCallback.LayerUseCase head = this.nodes.getHead(); head != null; head = head.getChild()) {
            head.connectComponent();
        }
    }

    public final int insertAsset(int height) {
        return offerHash().popBlueprint(height);
    }

    /* renamed from: loadItem, reason: from getter */
    public final long getOffsetFromRoot() {
        return this.offsetFromRoot;
    }

    public final List<ContentRepository> locateSignal() {
        return this._foldedChildren.getVector().applyTask();
    }

    public final void lockManifest() {
        if (this.intrinsicsUsageByParent == ScopedMigration.connectPatch) {
            storeCharset();
        }
        formatMessage().sanitizeBounds();
    }

    @Override // com.goldenboot.saga.zone.ItemEvent
    /* renamed from: mapJob, reason: from getter */
    public int getSemanticsId() {
        return this.semanticsId;
    }

    public final PluginScheduler measureEndpoint() {
        flushTimer();
        if (this.virtualChildrenCount == 0) {
            return this._foldedChildren.getVector();
        }
        PluginScheduler pluginScheduler = this._unfoldedChildren;
        Intrinsics.checkNotNull(pluginScheduler);
        return pluginScheduler;
    }

    public final boolean normalizeBundle() {
        return this.layoutDelegate.getLookaheadMeasurePending();
    }

    public final boolean normalizeRecord(PagerPlanner constraints) {
        if (constraints == null) {
            return false;
        }
        if (this.intrinsicsUsageByParent == ScopedMigration.connectPatch) {
            injectConstraint();
        }
        return formatMessage().saveDestination(constraints.getValue());
    }

    @Override // com.goldenboot.saga.zone.AlarmMulticaster
    public void notifyMessage(FlexMaterializer flexMaterializer) {
        if (Intrinsics.areEqual(this.measurePolicy, flexMaterializer)) {
            return;
        }
        this.measurePolicy = flexMaterializer;
        ListenerBuffer listenerBuffer = this.intrinsicsPolicy;
        if (listenerBuffer != null) {
            listenerBuffer.connectJob(getMeasurePolicy());
        }
        queryDescriptor();
    }

    public final <T> T observeNode(ElevationNode block) {
        this.ignoreRemeasureRequests = true;
        T t = (T) block.invoke();
        this.ignoreRemeasureRequests = false;
        return t;
    }

    public final void openJob() {
        BridgeSerializer searchHolder = searchHolder();
        BridgeSerializer purgeMetric2 = purgeMetric();
        while (searchHolder != purgeMetric2) {
            Intrinsics.checkNotNull(searchHolder, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            ClipboardResolver clipboardResolver = (ClipboardResolver) searchHolder;
            ShapeAssembler layer = clipboardResolver.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
            searchHolder = clipboardResolver.getWrapped();
        }
        ShapeAssembler layer2 = purgeMetric().getLayer();
        if (layer2 != null) {
            layer2.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.RemoteCallback$LayerUseCase] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.RemoteCallback$LayerUseCase] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.goldenboot.saga.zone.PluginScheduler] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.goldenboot.saga.zone.PluginScheduler] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void packPackage() {
        if (growCallback() != EndpointList.resetDelta || peekDescriptor() || executeRecord() || getIsDeactivated() || !bindBody()) {
            return;
        }
        MenuPage menuPage = this.nodes;
        int growPayload = AlphaScheduler.growPayload(ContentOperation.RotationX);
        if ((menuPage.popBlueprint() & growPayload) != 0) {
            for (RemoteCallback.LayerUseCase head = menuPage.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & growPayload) != 0) {
                    ItemMapper itemMapper = head;
                    ?? r4 = 0;
                    while (itemMapper != 0) {
                        if (itemMapper instanceof DimenCoordinator) {
                            DimenCoordinator dimenCoordinator = (DimenCoordinator) itemMapper;
                            dimenCoordinator.emitStrategy(LayoutConstructor.notifyMessage(dimenCoordinator, AlphaScheduler.growPayload(ContentOperation.RotationX)));
                        } else if ((itemMapper.getKindSet() & growPayload) != 0 && (itemMapper instanceof ItemMapper)) {
                            RemoteCallback.LayerUseCase delegate = itemMapper.getDelegate();
                            int i = 0;
                            itemMapper = itemMapper;
                            r4 = r4;
                            while (delegate != null) {
                                if ((delegate.getKindSet() & growPayload) != 0) {
                                    i++;
                                    r4 = r4;
                                    if (i == 1) {
                                        itemMapper = delegate;
                                    } else {
                                        if (r4 == 0) {
                                            r4 = new PluginScheduler(new RemoteCallback.LayerUseCase[16], 0);
                                        }
                                        if (itemMapper != 0) {
                                            r4.growPayload(itemMapper);
                                            itemMapper = 0;
                                        }
                                        r4.growPayload(delegate);
                                    }
                                }
                                delegate = delegate.getChild();
                                itemMapper = itemMapper;
                                r4 = r4;
                            }
                            if (i == 1) {
                            }
                        }
                        itemMapper = LayoutConstructor.serializeOffset(r4);
                    }
                }
                if ((head.getAggregateChildKindSet() & growPayload) == 0) {
                    return;
                }
            }
        }
    }

    public final void pauseCurrency() {
        if (!this.isVirtual) {
            this.zSortedChildrenInvalidated = true;
            return;
        }
        ContentRepository acquireAsset = acquireAsset();
        if (acquireAsset != null) {
            acquireAsset.pauseCurrency();
        }
    }

    public final Void pauseNode(Throwable e) {
        SharedJob sortSnapshot = sortSnapshot();
        if (sortSnapshot == null) {
            throw e;
        }
        sortSnapshot.flushSample(e, this);
        throw e;
    }

    public final boolean peekDescriptor() {
        return this.layoutDelegate.peekRevision();
    }

    @Override // com.goldenboot.saga.zone.MarginBootstrapper
    public void peekRevision() {
        TrackballShaper trackballShaper = this.interopViewFactoryHolder;
        if (trackballShaper != null) {
            trackballShaper.peekRevision();
        }
        androidx.compose.ui.layout.ClipboardState clipboardState = this.subcompositionsState;
        if (clipboardState != null) {
            clipboardState.peekRevision();
        }
        this.isDeactivated = true;
        encodeOrigin();
        if (popBlueprint()) {
            if (WindowMapper.isSemanticAutofillEnabled) {
                this._semanticsConfiguration = null;
                this.isSemanticsInvalidated = false;
            } else {
                prependOptions();
            }
        }
        CarouselHelper carouselHelper = this.owner;
        if (carouselHelper != null) {
            carouselHelper.groupArchive(this);
        }
    }

    public final void performLink(boolean forceRequest, boolean scheduleMeasureAndLayout, boolean invalidateIntrinsics) {
        CarouselHelper carouselHelper;
        if (this.ignoreRemeasureRequests || this.isVirtual || (carouselHelper = this.owner) == null) {
            return;
        }
        CarouselHelper.syncScope(carouselHelper, this, false, forceRequest, scheduleMeasureAndLayout, 2, null);
        if (invalidateIntrinsics) {
            formatMessage().encodeManifest(forceRequest);
        }
    }

    @Override // com.goldenboot.saga.zone.ItemEvent
    public boolean popBlueprint() {
        return this.owner != null;
    }

    /* renamed from: prepareCount, reason: from getter */
    public final androidx.compose.ui.layout.ClipboardState getSubcompositionsState() {
        return this.subcompositionsState;
    }

    @Override // com.goldenboot.saga.zone.ItemEvent
    public List<ModifierInfo> prepareTask() {
        return this.nodes.reduceScope();
    }

    public final void prependArchive(long pointerPosition, MenuResolver hitTestResult, int pointerType, boolean isInLayer) {
        searchHolder().syncSample(BridgeSerializer.INSTANCE.evictLayout(), BridgeSerializer.inflateScope(searchHolder(), pointerPosition, false, 2, null), hitTestResult, pointerType, isInLayer);
    }

    public final void prependNode() {
        this.outerToInnerOffsetDirty = true;
        PluginScheduler measureEndpoint = measureEndpoint();
        Object[] objArr = measureEndpoint.reduceScope;
        int reduceScope = measureEndpoint.reduceScope();
        for (int i = 0; i < reduceScope; i++) {
            ((ContentRepository) objArr[i]).transformCount();
        }
    }

    public final void prependOptions() {
        if (this.isCurrentlyCalculatingSemanticsConfiguration) {
            return;
        }
        if (!WindowMapper.isSemanticAutofillEnabled) {
            this._semanticsConfiguration = null;
            MenuReceiver.injectMetric(this).attachCallback();
        } else {
            if (this.nodes.expandArgs() || cancelArchive()) {
                this.isSemanticsInvalidated = true;
                return;
            }
            ItemNode itemNode = this._semanticsConfiguration;
            this._semanticsConfiguration = flattenPackage();
            this.isSemanticsInvalidated = false;
            CarouselHelper injectMetric = MenuReceiver.injectMetric(this);
            injectMetric.getSemanticsOwner().clipOrigin(this, itemNode);
            injectMetric.attachCallback();
        }
    }

    /* renamed from: protectGauge, reason: from getter */
    public final boolean getInnerLayerCoordinatorIsDirty() {
        return this.innerLayerCoordinatorIsDirty;
    }

    public final BridgeSerializer purgeMetric() {
        return this.nodes.getInnerCoordinator();
    }

    @Override // com.goldenboot.saga.zone.AlarmMulticaster
    /* renamed from: purgeNode, reason: from getter */
    public StateMediator getCompositionLocalMap() {
        return this.compositionLocalMap;
    }

    public final void pushOptions(boolean z) {
        this.outerToInnerOffsetDirty = z;
    }

    public final int pushTask(int width) {
        return offerHash().flushSample(width);
    }

    /* renamed from: queryData, reason: from getter */
    public final boolean getOuterToInnerOffsetDirty() {
        return this.outerToInnerOffsetDirty;
    }

    public final void queryDescriptor() {
        if (this.isVirtual) {
            ContentRepository acquireAsset = acquireAsset();
            if (acquireAsset != null) {
                acquireAsset.queryDescriptor();
                return;
            }
            return;
        }
        if (this.lookaheadRoot != null) {
            transformSignal(this, false, false, false, 7, null);
        } else {
            unwrapView(this, false, false, false, 7, null);
        }
    }

    /* renamed from: queryDigest, reason: from getter */
    public final boolean getIsSemanticsInvalidated() {
        return this.isSemanticsInvalidated;
    }

    public final void queryModel() {
        CarouselHelper carouselHelper = this.owner;
        if (carouselHelper == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot detach node that is already detached!  Tree: ");
            ContentRepository acquireAsset = acquireAsset();
            sb.append(acquireAsset != null ? inflateEdge(acquireAsset, 0, 1, null) : null);
            PagerBridge.popBlueprint(sb.toString());
            throw new ShadowBroadcaster();
        }
        ContentRepository acquireAsset2 = acquireAsset();
        if (acquireAsset2 != null) {
            acquireAsset2.escapeBounds();
            acquireAsset2.queryDescriptor();
            SubscriberRegulator formatMessage = formatMessage();
            ScopedMigration scopedMigration = ScopedMigration.connectPatch;
            formatMessage.applyMetric(scopedMigration);
            PlatformDelegate commitBounds = commitBounds();
            if (commitBounds != null) {
                commitBounds.sanitizeBounds(scopedMigration);
            }
        }
        this.layoutDelegate.unlockMessage();
        BridgeSerializer wrapped = purgeMetric().getWrapped();
        for (BridgeSerializer searchHolder = searchHolder(); !Intrinsics.areEqual(searchHolder, wrapped) && searchHolder != null; searchHolder = searchHolder.getWrapped()) {
            searchHolder.detachSample();
        }
        TouchRecord touchRecord = this.onDetach;
        if (touchRecord != null) {
            touchRecord.invoke(carouselHelper);
        }
        if (!WindowMapper.isSemanticAutofillEnabled && this.nodes.resetDelta(AlphaScheduler.growPayload(8))) {
            prependOptions();
        }
        this.nodes.inflateEdge();
        this.ignoreRemeasureRequests = true;
        PluginScheduler vector = this._foldedChildren.getVector();
        Object[] objArr = vector.reduceScope;
        int reduceScope = vector.reduceScope();
        for (int i = 0; i < reduceScope; i++) {
            ((ContentRepository) objArr[i]).queryModel();
        }
        DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
        this.ignoreRemeasureRequests = false;
        this.nodes.mergeLocale();
        carouselHelper.drawScope(this);
        this.owner = null;
        this.offsetFromRoot = FontReporter.INSTANCE.evictLayout();
        clearTimer(null);
        this.depth = 0;
        formatMessage().inflateEndpoint();
        PlatformDelegate commitBounds2 = commitBounds();
        if (commitBounds2 != null) {
            commitBounds2.clipMetric();
        }
        if (WindowMapper.isSemanticAutofillEnabled && this.nodes.resetDelta(AlphaScheduler.growPayload(8))) {
            ItemNode itemNode = this._semanticsConfiguration;
            this._semanticsConfiguration = null;
            this.isSemanticsInvalidated = false;
            carouselHelper.getSemanticsOwner().clipOrigin(this, itemNode);
            carouselHelper.attachCallback();
        }
    }

    public final void readHeader() {
        if (this.isCurrentlyCalculatingSemanticsConfiguration) {
            return;
        }
        MenuReceiver.injectMetric(this).drawField(this);
    }

    @Override // com.goldenboot.saga.zone.DimenCollection
    public void reduceScope() {
        ContentRepository contentRepository;
        if (this.lookaheadRoot != null) {
            contentRepository = this;
            transformSignal(contentRepository, false, false, false, 5, null);
        } else {
            contentRepository = this;
            unwrapView(contentRepository, false, false, false, 5, null);
        }
        PagerPlanner popBlueprint = contentRepository.layoutDelegate.popBlueprint();
        if (popBlueprint != null) {
            CarouselHelper carouselHelper = contentRepository.owner;
            if (carouselHelper != null) {
                carouselHelper.storeCharset(contentRepository, popBlueprint.getValue());
                return;
            }
            return;
        }
        CarouselHelper carouselHelper2 = contentRepository.owner;
        if (carouselHelper2 != null) {
            CarouselHelper.dispatchTimezone(carouselHelper2, false, 1, null);
        }
    }

    /* renamed from: refreshCounter, reason: from getter */
    public final TrackballShaper getInteropViewFactoryHolder() {
        return this.interopViewFactoryHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.RemoteCallback$LayerUseCase] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.RemoteCallback$LayerUseCase] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.goldenboot.saga.zone.PluginScheduler] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.goldenboot.saga.zone.PluginScheduler] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // com.goldenboot.saga.zone.AlarmMulticaster
    public void releaseHeader(InitMerger initMerger) {
        if (Intrinsics.areEqual(this.viewConfiguration, initMerger)) {
            return;
        }
        this.viewConfiguration = initMerger;
        MenuPage menuPage = this.nodes;
        int growPayload = AlphaScheduler.growPayload(16);
        if ((menuPage.popBlueprint() & growPayload) != 0) {
            for (RemoteCallback.LayerUseCase head = menuPage.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & growPayload) != 0) {
                    ItemMapper itemMapper = head;
                    ?? r3 = 0;
                    while (itemMapper != 0) {
                        if (itemMapper instanceof ScrollWork) {
                            ((ScrollWork) itemMapper).popIndex();
                        } else if ((itemMapper.getKindSet() & growPayload) != 0 && (itemMapper instanceof ItemMapper)) {
                            RemoteCallback.LayerUseCase delegate = itemMapper.getDelegate();
                            int i = 0;
                            itemMapper = itemMapper;
                            r3 = r3;
                            while (delegate != null) {
                                if ((delegate.getKindSet() & growPayload) != 0) {
                                    i++;
                                    r3 = r3;
                                    if (i == 1) {
                                        itemMapper = delegate;
                                    } else {
                                        if (r3 == 0) {
                                            r3 = new PluginScheduler(new RemoteCallback.LayerUseCase[16], 0);
                                        }
                                        if (itemMapper != 0) {
                                            r3.growPayload(itemMapper);
                                            itemMapper = 0;
                                        }
                                        r3.growPayload(delegate);
                                    }
                                }
                                delegate = delegate.getChild();
                                itemMapper = itemMapper;
                                r3 = r3;
                            }
                            if (i == 1) {
                            }
                        }
                        itemMapper = LayoutConstructor.serializeOffset(r3);
                    }
                }
                if ((head.getAggregateChildKindSet() & growPayload) == 0) {
                    return;
                }
            }
        }
    }

    public final BridgeSerializer removeCount() {
        if (this.innerLayerCoordinatorIsDirty) {
            BridgeSerializer purgeMetric2 = purgeMetric();
            BridgeSerializer wrappedBy = searchHolder().getWrappedBy();
            this._innerLayerCoordinator = null;
            while (true) {
                if (Intrinsics.areEqual(purgeMetric2, wrappedBy)) {
                    break;
                }
                if ((purgeMetric2 != null ? purgeMetric2.getLayer() : null) != null) {
                    this._innerLayerCoordinator = purgeMetric2;
                    break;
                }
                purgeMetric2 = purgeMetric2 != null ? purgeMetric2.getWrappedBy() : null;
            }
        }
        BridgeSerializer bridgeSerializer = this._innerLayerCoordinator;
        if (bridgeSerializer == null || bridgeSerializer.getLayer() != null) {
            return bridgeSerializer;
        }
        PagerBridge.popBlueprint("layer was not set");
        throw new ShadowBroadcaster();
    }

    public final boolean removeSource() {
        return formatMessage().renderPattern();
    }

    public final void resetComponent() {
        if (this.intrinsicsUsageByParent == ScopedMigration.connectPatch) {
            storeCharset();
        }
        PlatformDelegate commitBounds = commitBounds();
        Intrinsics.checkNotNull(commitBounds);
        commitBounds.inflateEndpoint();
    }

    @Override // com.goldenboot.saga.zone.PressBootstrapper
    public boolean resetDelta() {
        return searchHolder().processValue();
    }

    /* renamed from: resolveDelta, reason: from getter */
    public final boolean getCanMultiMeasure() {
        return this.canMultiMeasure;
    }

    public final void resumeOrigin(ScopedMigration scopedMigration) {
        this.intrinsicsUsageByParent = scopedMigration;
    }

    public final void resumeSignature(TouchRecord block) {
        BridgeSerializer wrapped = purgeMetric().getWrapped();
        for (BridgeSerializer searchHolder = searchHolder(); !Intrinsics.areEqual(searchHolder, wrapped) && searchHolder != null; searchHolder = searchHolder.getWrapped()) {
            block.invoke(searchHolder);
        }
    }

    public final int saveEntry(int height) {
        return offerHash().detachStream(height);
    }

    public final Boolean saveMessage() {
        PlatformDelegate commitBounds = commitBounds();
        if (commitBounds != null) {
            return Boolean.valueOf(commitBounds.bindBody());
        }
        return null;
    }

    /* renamed from: saveSnapshot, reason: from getter */
    public final long getOuterToInnerOffset() {
        return this.outerToInnerOffset;
    }

    public final BridgeSerializer searchHolder() {
        return this.nodes.getOuterCoordinator();
    }

    @Override // com.goldenboot.saga.zone.PressBootstrapper
    public List<PressBootstrapper> serializeOffset() {
        return appendKey();
    }

    public final List<BreadcrumbMerger> serializeTask() {
        PlatformDelegate commitBounds = commitBounds();
        Intrinsics.checkNotNull(commitBounds);
        return commitBounds.drainCache();
    }

    public final void shrinkBundle(TouchRecord touchRecord) {
        this.onDetach = touchRecord;
    }

    public final void startResource(IconExporter block) {
        PluginScheduler measureEndpoint = measureEndpoint();
        Object[] objArr = measureEndpoint.reduceScope;
        int reduceScope = measureEndpoint.reduceScope();
        for (int i = 0; i < reduceScope; i++) {
            block.invoke(Integer.valueOf(i), objArr[i]);
        }
    }

    public final ScopedMigration subscribeEvent() {
        ScopedMigration processFormat;
        PlatformDelegate commitBounds = commitBounds();
        return (commitBounds == null || (processFormat = commitBounds.processFormat()) == null) ? ScopedMigration.connectPatch : processFormat;
    }

    public final void subscribeRule(boolean z) {
        this.isVirtualLookaheadRoot = z;
    }

    public final void subscribeTask(boolean z) {
        this.canMultiMeasure = z;
    }

    /* renamed from: syncPool, reason: from getter */
    public final CarouselHelper getOwner() {
        return this.owner;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011a A[LOOP:0: B:50:0x0118->B:51:0x011a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void syncScope(CarouselHelper owner) {
        boolean z;
        ContentRepository acquireAsset;
        androidx.compose.ui.RemoteCallback remoteCallback;
        ContentRepository contentRepository;
        int reduceScope;
        TouchRecord touchRecord;
        if (!(this.owner == null)) {
            PagerBridge.applyTask("Cannot attach " + this + " as it already is attached.  Tree: " + inflateEdge(this, 0, 1, null));
        }
        ContentRepository contentRepository2 = this._foldedParent;
        if (contentRepository2 != null) {
            if (!Intrinsics.areEqual(contentRepository2 != null ? contentRepository2.owner : null, owner)) {
                z = false;
                if (!z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Attaching to a different owner(");
                    sb.append(owner);
                    sb.append(") than the parent's owner(");
                    ContentRepository acquireAsset2 = acquireAsset();
                    sb.append(acquireAsset2 != null ? acquireAsset2.owner : null);
                    sb.append("). This tree: ");
                    sb.append(inflateEdge(this, 0, 1, null));
                    sb.append(" Parent tree: ");
                    ContentRepository contentRepository3 = this._foldedParent;
                    sb.append(contentRepository3 != null ? inflateEdge(contentRepository3, 0, 1, null) : null);
                    PagerBridge.applyTask(sb.toString());
                }
                acquireAsset = acquireAsset();
                if (acquireAsset == null) {
                    formatMessage().scatterCounter(true);
                    PlatformDelegate commitBounds = commitBounds();
                    if (commitBounds != null) {
                        commitBounds.findRoute();
                    }
                }
                searchHolder().observeContent(acquireAsset == null ? acquireAsset.purgeMetric() : null);
                this.owner = owner;
                this.depth = (acquireAsset == null ? acquireAsset.depth : -1) + 1;
                remoteCallback = this.pendingModifier;
                if (remoteCallback != null) {
                    mergeLocale(remoteCallback);
                }
                this.pendingModifier = null;
                if (!WindowMapper.isSemanticAutofillEnabled && this.nodes.resetDelta(AlphaScheduler.growPayload(8))) {
                    prependOptions();
                }
                owner.notifyMessage(this);
                if (this.isVirtualLookaheadRoot) {
                    ContentRepository contentRepository4 = this._foldedParent;
                    if (contentRepository4 == null || (contentRepository = contentRepository4.lookaheadRoot) == null) {
                        contentRepository = this.lookaheadRoot;
                    }
                    clearTimer(contentRepository);
                    if (this.lookaheadRoot == null && this.nodes.resetDelta(AlphaScheduler.growPayload(ContentOperation.RotationY))) {
                        clearTimer(this);
                    }
                } else {
                    clearTimer(this);
                }
                if (!getIsDeactivated()) {
                    this.nodes.findTask();
                }
                PluginScheduler vector = this._foldedChildren.getVector();
                Object[] objArr = vector.reduceScope;
                reduceScope = vector.reduceScope();
                for (int i = 0; i < reduceScope; i++) {
                    ((ContentRepository) objArr[i]).syncScope(owner);
                }
                if (!getIsDeactivated()) {
                    this.nodes.filterPayload();
                }
                queryDescriptor();
                if (acquireAsset != null) {
                    acquireAsset.queryDescriptor();
                }
                touchRecord = this.onAttach;
                if (touchRecord != null) {
                    touchRecord.invoke(owner);
                }
                this.layoutDelegate.resetValue();
                if (WindowMapper.isSemanticAutofillEnabled && !getIsDeactivated() && this.nodes.resetDelta(AlphaScheduler.growPayload(8))) {
                    prependOptions();
                }
                owner.attachConfig(this);
            }
        }
        z = true;
        if (!z) {
        }
        acquireAsset = acquireAsset();
        if (acquireAsset == null) {
        }
        searchHolder().observeContent(acquireAsset == null ? acquireAsset.purgeMetric() : null);
        this.owner = owner;
        this.depth = (acquireAsset == null ? acquireAsset.depth : -1) + 1;
        remoteCallback = this.pendingModifier;
        if (remoteCallback != null) {
        }
        this.pendingModifier = null;
        if (!WindowMapper.isSemanticAutofillEnabled) {
            prependOptions();
        }
        owner.notifyMessage(this);
        if (this.isVirtualLookaheadRoot) {
        }
        if (!getIsDeactivated()) {
        }
        PluginScheduler vector2 = this._foldedChildren.getVector();
        Object[] objArr2 = vector2.reduceScope;
        reduceScope = vector2.reduceScope();
        while (i < reduceScope) {
        }
        if (!getIsDeactivated()) {
        }
        queryDescriptor();
        if (acquireAsset != null) {
        }
        touchRecord = this.onAttach;
        if (touchRecord != null) {
        }
        this.layoutDelegate.resetValue();
        if (WindowMapper.isSemanticAutofillEnabled) {
            prependOptions();
        }
        owner.attachConfig(this);
    }

    public String toString() {
        return ListInstantiator.growPayload(this, null) + " children: " + appendKey().size() + " measurePolicy: " + getMeasurePolicy() + " deactivated: " + getIsDeactivated();
    }

    /* renamed from: transformCurrency, reason: from getter */
    public final long getLastSize() {
        return this.lastSize;
    }

    public final void trimState(int index, ContentRepository instance) {
        if (!(instance._foldedParent == null || instance.owner == null)) {
            PagerBridge.applyTask(updateAction(instance));
        }
        instance._foldedParent = this;
        this._foldedChildren.evictLayout(index, instance);
        pauseCurrency();
        if (instance.isVirtual) {
            this.virtualChildrenCount++;
        }
        filterTimer();
        CarouselHelper carouselHelper = this.owner;
        if (carouselHelper != null) {
            instance.syncScope(carouselHelper);
        }
        if (instance.layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            NotificationBarrier notificationBarrier = this.layoutDelegate;
            notificationBarrier.bindBody(notificationBarrier.getChildrenAccessingCoordinatesDuringPlacement() + 1);
        }
        if (instance.globallyPositionedObservers > 0) {
            closeEntry(this.globallyPositionedObservers + 1);
        }
    }

    public final void unlockMessage(PulseCounter canvas, BottomBarEvaluator graphicsLayer) {
        try {
            searchHolder().applyMetric(canvas, graphicsLayer);
            DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
        } catch (Throwable th) {
            this.pauseNode(th);
            throw new ShadowBroadcaster();
        }
    }

    public final int unwrapKey(int width) {
        return offerHash().releaseHeader(width);
    }

    public final PluginScheduler unwrapRecord() {
        if (this.zSortedChildrenInvalidated) {
            this._zSortedChildren.popBlueprint();
            PluginScheduler pluginScheduler = this._zSortedChildren;
            pluginScheduler.releaseHeader(pluginScheduler.reduceScope(), measureEndpoint());
            this._zSortedChildren.flattenPackage(transformCurrency);
            this.zSortedChildrenInvalidated = false;
        }
        return this._zSortedChildren;
    }

    /* renamed from: updateConstraint, reason: from getter */
    public final TouchRecord getOnAttach() {
        return this.onAttach;
    }

    public final void updateRule() {
        if (this.globallyPositionedObservers == 0 || peekDescriptor() || executeRecord() || this.needsOnGloballyPositionedDispatch) {
            return;
        }
        MenuReceiver.injectMetric(this).inflateEdge(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.RemoteCallback$LayerUseCase] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.RemoteCallback$LayerUseCase] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.goldenboot.saga.zone.PluginScheduler] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.goldenboot.saga.zone.PluginScheduler] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // com.goldenboot.saga.zone.AlarmMulticaster
    public void updateTimer(StateMediator stateMediator) {
        this.compositionLocalMap = stateMediator;
        injectMetric((BackgroundCollection) stateMediator.injectMetric(TrackballConstructor.peekRevision()));
        growPayload((LabelCache) stateMediator.injectMetric(TrackballConstructor.purgeNode()));
        releaseHeader((InitMerger) stateMediator.injectMetric(TrackballConstructor.flattenPackage()));
        MenuPage menuPage = this.nodes;
        int growPayload = AlphaScheduler.growPayload(ContentOperation.CompositingStrategy);
        if ((menuPage.popBlueprint() & growPayload) != 0) {
            for (RemoteCallback.LayerUseCase head = menuPage.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & growPayload) != 0) {
                    ItemMapper itemMapper = head;
                    ?? r2 = 0;
                    while (itemMapper != 0) {
                        if (itemMapper instanceof TileLatch) {
                            RemoteCallback.LayerUseCase node = ((TileLatch) itemMapper).getNode();
                            if (node.getIsAttached()) {
                                SwipeEmitter.releaseHeader(node);
                            } else {
                                node.compressStrategy(true);
                            }
                        } else if ((itemMapper.getKindSet() & growPayload) != 0 && (itemMapper instanceof ItemMapper)) {
                            RemoteCallback.LayerUseCase delegate = itemMapper.getDelegate();
                            int i = 0;
                            itemMapper = itemMapper;
                            r2 = r2;
                            while (delegate != null) {
                                if ((delegate.getKindSet() & growPayload) != 0) {
                                    i++;
                                    r2 = r2;
                                    if (i == 1) {
                                        itemMapper = delegate;
                                    } else {
                                        if (r2 == 0) {
                                            r2 = new PluginScheduler(new RemoteCallback.LayerUseCase[16], 0);
                                        }
                                        if (itemMapper != 0) {
                                            r2.growPayload(itemMapper);
                                            itemMapper = 0;
                                        }
                                        r2.growPayload(delegate);
                                    }
                                }
                                delegate = delegate.getChild();
                                itemMapper = itemMapper;
                                r2 = r2;
                            }
                            if (i == 1) {
                            }
                        }
                        itemMapper = LayoutConstructor.serializeOffset(r2);
                    }
                }
                if ((head.getAggregateChildKindSet() & growPayload) == 0) {
                    return;
                }
            }
        }
    }

    /* renamed from: validateOffset, reason: from getter */
    public final NotificationBarrier getLayoutDelegate() {
        return this.layoutDelegate;
    }

    public final void verifyChannel(boolean z) {
        this.needsOnGloballyPositionedDispatch = z;
    }

    public final void wrapConfig() {
        this.layoutDelegate.filterPayload();
    }

    public final void wrapModel() {
        this.layoutDelegate.flattenPackage();
    }

    public final int writeRequest(int width) {
        return offerHash().injectMetric(width);
    }

    public void writeSnapshot(int i) {
        this.semanticsId = i;
    }

    public ContentRepository(boolean z, int i) {
        BackgroundCollection backgroundCollection;
        this.isVirtual = z;
        this.semanticsId = i;
        FontReporter.Companion companion = FontReporter.INSTANCE;
        this.offsetFromRoot = companion.evictLayout();
        this.lastSize = ScaleSaver.INSTANCE.evictLayout();
        this.outerToInnerOffset = companion.evictLayout();
        this.outerToInnerOffsetDirty = true;
        this._foldedChildren = new InsetsFence<>(new PluginScheduler(new ContentRepository[16], 0), new RestoreToggle());
        this._zSortedChildren = new PluginScheduler(new ContentRepository[16], 0);
        this.zSortedChildrenInvalidated = true;
        this.measurePolicy = removeCount;
        backgroundCollection = MenuReceiver.growPayload;
        this.density = backgroundCollection;
        this.layoutDirection = LabelCache.reduceScope;
        this.viewConfiguration = compressVersion;
        this.compositionLocalMap = StateMediator.detachStream.evictLayout();
        ScopedMigration scopedMigration = ScopedMigration.connectPatch;
        this.intrinsicsUsageByParent = scopedMigration;
        this.previousIntrinsicsUsageByParent = scopedMigration;
        this.nodes = new MenuPage(this);
        this.layoutDelegate = new NotificationBarrier(this);
        this.innerLayerCoordinatorIsDirty = true;
        this._modifier = androidx.compose.ui.RemoteCallback.INSTANCE;
    }

    @Override // com.goldenboot.saga.zone.ItemEvent
    public PressBootstrapper parseAsset() {
        return acquireAsset();
    }

    public static /* synthetic */ void compressBody() {
    }

    @ReceiverAdministrator
    public static /* synthetic */ void resetValue() {
    }

    public /* synthetic */ ContentRepository(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? FontPartition.detachStream() : i);
    }
}
