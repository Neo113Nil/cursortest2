package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard;

@kotlin.Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b8\b\u0081\b\u0018\u0000 ´\u00012\u00020\u0001:\u0004µ\u0001´\u0001B÷\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\b\u0010+\u001a\u0004\u0018\u00010)\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\b\u0010.\u001a\u0004\u0018\u00010)¢\u0006\u0004\b/\u00100Bÿ\u0002\b\u0010\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00103\u001a\u000201\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\b\u0010+\u001a\u0004\u0018\u00010)\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\b\u0010.\u001a\u0004\u0018\u00010)\u0012\u0006\u00104\u001a\u00020&\u0012\u0006\u00105\u001a\u00020&\u0012\u0006\u00106\u001a\u00020&\u0012\u0006\u00107\u001a\u00020&\u0012\u0006\u00108\u001a\u00020&\u0012\u0006\u00109\u001a\u00020&\u0012\u0006\u0010:\u001a\u00020&\u0012\u0006\u0010;\u001a\u00020&\u0012\u0006\u0010<\u001a\u00020&\u0012\u0006\u0010=\u001a\u00020&\u0012\u0006\u0010>\u001a\u00020&\u0012\u0006\u0010?\u001a\u00020&\u0012\u0006\u0010@\u001a\u00020&\u0012\b\u0010B\u001a\u0004\u0018\u00010A¢\u0006\u0004\b/\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0012\u0010J\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0012\u0010L\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0012\u0010N\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0012\u0010P\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\bP\u0010QJ\u0012\u0010R\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\bR\u0010SJ\u0012\u0010T\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bT\u0010UJ\u0012\u0010V\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bV\u0010KJ\u0012\u0010W\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bW\u0010XJ\u0012\u0010Y\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\bY\u0010ZJ\u0016\u0010[\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019HÆ\u0003¢\u0006\u0004\b[\u0010\\J\u0010\u0010]\u001a\u00020\u001cHÆ\u0003¢\u0006\u0004\b]\u0010^J\u0010\u0010_\u001a\u00020\u001eHÆ\u0003¢\u0006\u0004\b_\u0010`J\u0012\u0010a\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\ba\u0010bJ\u0012\u0010c\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0004\bc\u0010dJ\u0012\u0010e\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0004\be\u0010fJ\u0010\u0010g\u001a\u00020&HÆ\u0003¢\u0006\u0004\bg\u0010hJ\u0012\u0010i\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bi\u0010GJ\u0012\u0010j\u001a\u0004\u0018\u00010)HÆ\u0003¢\u0006\u0004\bj\u0010kJ\u0012\u0010l\u001a\u0004\u0018\u00010)HÆ\u0003¢\u0006\u0004\bl\u0010kJ\u0012\u0010m\u001a\u0004\u0018\u00010,HÆ\u0003¢\u0006\u0004\bm\u0010nJ\u0012\u0010o\u001a\u0004\u0018\u00010)HÆ\u0003¢\u0006\u0004\bo\u0010kJ®\u0002\u0010p\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010'\u001a\u00020&2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010)HÆ\u0001¢\u0006\u0004\bp\u0010qJ\u001a\u0010s\u001a\u00020&2\b\u0010r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bs\u0010tJ\u0010\u0010u\u001a\u000201HÖ\u0001¢\u0006\u0004\bu\u0010vJ\u0010\u0010w\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bw\u0010GJ'\u0010~\u001a\u00020}2\u0006\u0010x\u001a\u00020\u00002\u0006\u0010z\u001a\u00020y2\u0006\u0010|\u001a\u00020{H\u0001¢\u0006\u0004\b~\u0010\u007fR\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\u000e\n\u0005\b\u0003\u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u0010ER\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0005\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010GR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0007\u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010IR\u001e\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\t\u0010\u0086\u0001\u001a\u0005\b\u0087\u0001\u0010KR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u000b\u0010\u0088\u0001\u001a\u0005\b\u0089\u0001\u0010MR\u001e\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\r\u0010\u008a\u0001\u001a\u0005\b\u008b\u0001\u0010OR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u000f\u0010\u008c\u0001\u001a\u0005\b\u008d\u0001\u0010QR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0011\u0010\u008e\u0001\u001a\u0005\b\u008f\u0001\u0010SR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0013\u0010\u0090\u0001\u001a\u0005\b\u0091\u0001\u0010UR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0014\u0010\u0086\u0001\u001a\u0005\b\u0092\u0001\u0010KR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0016\u0010\u0093\u0001\u001a\u0005\b\u0094\u0001\u0010XR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0018\u0010\u0095\u0001\u001a\u0005\b\u0096\u0001\u0010ZR\"\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001b\u0010\u0097\u0001\u001a\u0005\b\u0098\u0001\u0010\\R\u001c\u0010\u001d\u001a\u00020\u001c8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001d\u0010\u0099\u0001\u001a\u0005\b\u009a\u0001\u0010^R\u001c\u0010\u001f\u001a\u00020\u001e8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001f\u0010\u009b\u0001\u001a\u0005\b\u009c\u0001\u0010`R\u001e\u0010!\u001a\u0004\u0018\u00010 8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b!\u0010\u009d\u0001\u001a\u0005\b\u009e\u0001\u0010bR\u001e\u0010#\u001a\u0004\u0018\u00010\"8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b#\u0010\u009f\u0001\u001a\u0005\b \u0001\u0010dR\u001e\u0010%\u001a\u0004\u0018\u00010$8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b%\u0010¡\u0001\u001a\u0005\b¢\u0001\u0010fR%\u0010'\u001a\u00020&8\u0007@\u0007X\u0087\u000e¢\u0006\u0015\n\u0005\b'\u0010£\u0001\u001a\u0004\b'\u0010h\"\u0006\b¤\u0001\u0010¥\u0001R(\u0010(\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0016\n\u0005\b(\u0010\u0082\u0001\u001a\u0005\b¦\u0001\u0010G\"\u0006\b§\u0001\u0010¨\u0001R(\u0010*\u001a\u0004\u0018\u00010)8\u0007@\u0007X\u0087\u000e¢\u0006\u0016\n\u0005\b*\u0010©\u0001\u001a\u0005\bª\u0001\u0010k\"\u0006\b«\u0001\u0010¬\u0001R(\u0010+\u001a\u0004\u0018\u00010)8\u0007@\u0007X\u0087\u000e¢\u0006\u0016\n\u0005\b+\u0010©\u0001\u001a\u0005\b\u00ad\u0001\u0010k\"\u0006\b®\u0001\u0010¬\u0001R\u001e\u0010-\u001a\u0004\u0018\u00010,8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b-\u0010¯\u0001\u001a\u0005\b°\u0001\u0010nR\u001e\u0010.\u001a\u0004\u0018\u00010)8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b.\u0010©\u0001\u001a\u0005\b±\u0001\u0010kR\u001b\u00104\u001a\u00020&8\u0007X\u0087\u0004¢\u0006\r\n\u0005\b4\u0010£\u0001\u001a\u0004\b4\u0010hR\u001b\u00105\u001a\u00020&8\u0007X\u0087\u0004¢\u0006\r\n\u0005\b5\u0010£\u0001\u001a\u0004\b5\u0010hR\u001b\u00106\u001a\u00020&8\u0007X\u0087\u0004¢\u0006\r\n\u0005\b6\u0010£\u0001\u001a\u0004\b6\u0010hR\u001b\u00107\u001a\u00020&8\u0007X\u0087\u0004¢\u0006\r\n\u0005\b7\u0010£\u0001\u001a\u0004\b7\u0010hR\u001b\u00108\u001a\u00020&8\u0007X\u0087\u0004¢\u0006\r\n\u0005\b8\u0010£\u0001\u001a\u0004\b8\u0010hR\u001b\u00109\u001a\u00020&8\u0007X\u0087\u0004¢\u0006\r\n\u0005\b9\u0010£\u0001\u001a\u0004\b9\u0010hR\u001c\u0010:\u001a\u00020&8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b:\u0010£\u0001\u001a\u0005\b²\u0001\u0010hR\u001c\u0010;\u001a\u00020&8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b;\u0010£\u0001\u001a\u0005\b³\u0001\u0010hR\u001b\u0010<\u001a\u00020&8\u0007X\u0087\u0004¢\u0006\r\n\u0005\b<\u0010£\u0001\u001a\u0004\b<\u0010hR\u001b\u0010=\u001a\u00020&8\u0007X\u0087\u0004¢\u0006\r\n\u0005\b=\u0010£\u0001\u001a\u0004\b=\u0010hR\u001b\u0010>\u001a\u00020&8\u0007X\u0087\u0004¢\u0006\r\n\u0005\b>\u0010£\u0001\u001a\u0004\b>\u0010hR\u001b\u0010?\u001a\u00020&8\u0007X\u0087\u0004¢\u0006\r\n\u0005\b?\u0010£\u0001\u001a\u0004\b?\u0010hR\u001b\u0010@\u001a\u00020&8\u0007X\u0087\u0004¢\u0006\r\n\u0005\b@\u0010£\u0001\u001a\u0004\b@\u0010h"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountAPRs;", "aprs", "", "creditAccountId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CreditInstrument;", "creditInstrument", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "creditLimit", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/LostStolenPageSummary;", "creditLostStolenContent", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/CustomerProfileDetails;", "customerProfileOverview", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CustomerServiceContact;", "customerServiceContact", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/RevolvingCardIcon;", "cardArtImage", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/AutopayOverview;", "autopayOverview", "temporaryCreditLimit", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/WalletOverview;", "walletOverview", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/PaymentSecurityInfo;", "paymentSecurityInfo", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ProvisionedWalletToken;", "provisionedTokens", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ExternalWalletEligibilityStatus;", "externalWalletStatus", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ExternalWalletEligibilityReason;", "externalWalletReason", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/notifications/NotificationPreferences;", "statementDeliveryInfo", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "productIdentifier", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/PushToWalletProvisioningData;", "pushToWalletProvisioningData", "", "isWorldUser", "pdfUrl", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrl;", "paymentSecurityUrl", "eSignConsentUrl", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/ProductFeatureEligibility;", "productFeatureEligibility", "cardHolderTermsUrl", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountAPRs;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CreditInstrument;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/LostStolenPageSummary;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/CustomerProfileDetails;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CustomerServiceContact;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/RevolvingCardIcon;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/AutopayOverview;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/WalletOverview;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/PaymentSecurityInfo;Ljava/util/List;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ExternalWalletEligibilityStatus;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ExternalWalletEligibilityReason;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/notifications/NotificationPreferences;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/PushToWalletProvisioningData;ZLjava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrl;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrl;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/ProductFeatureEligibility;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrl;)V", "", "seen0", "seen1", "isAutopayErrorState", "isAutopayEnabled", "isAutopayEligible", "isDayZeroForAutopay", "isAutopayNotSetup", "isStatementDeliveryErrorState", "hasVirtualOrPhysicalCard", "hasPhysicalCard", "isCardFrozen", "isPushToWalletEligible", "isPushToWalletCardActive", "isPushToWalletFinishSetupRequired", "isPushToWalletErrorState", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountAPRs;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CreditInstrument;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/LostStolenPageSummary;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/CustomerProfileDetails;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CustomerServiceContact;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/RevolvingCardIcon;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/AutopayOverview;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/WalletOverview;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/PaymentSecurityInfo;Ljava/util/List;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ExternalWalletEligibilityStatus;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ExternalWalletEligibilityReason;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/notifications/NotificationPreferences;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/PushToWalletProvisioningData;ZLjava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrl;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrl;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/ProductFeatureEligibility;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrl;ZZZZZZZZZZZZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountAPRs;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CreditInstrument;", "component4", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "component5", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/LostStolenPageSummary;", "component6", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/CustomerProfileDetails;", "component7", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CustomerServiceContact;", "component8", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/RevolvingCardIcon;", "component9", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/AutopayOverview;", "component10", "component11", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/WalletOverview;", "component12", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/PaymentSecurityInfo;", "component13", "()Ljava/util/List;", "component14", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ExternalWalletEligibilityStatus;", "component15", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ExternalWalletEligibilityReason;", "component16", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/notifications/NotificationPreferences;", "component17", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "component18", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/PushToWalletProvisioningData;", "component19", "()Z", "component20", "component21", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrl;", "component22", "component23", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/ProductFeatureEligibility;", "component24", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountAPRs;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CreditInstrument;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/LostStolenPageSummary;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/CustomerProfileDetails;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CustomerServiceContact;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/RevolvingCardIcon;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/AutopayOverview;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/WalletOverview;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/PaymentSecurityInfo;Ljava/util/List;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ExternalWalletEligibilityStatus;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ExternalWalletEligibilityReason;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/notifications/NotificationPreferences;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/PushToWalletProvisioningData;ZLjava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrl;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrl;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/ProductFeatureEligibility;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrl;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$revolvingcredit_servicing_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountAPRs;", "getAprs", "Ljava/lang/String;", "getCreditAccountId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CreditInstrument;", "getCreditInstrument", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "getCreditLimit", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/LostStolenPageSummary;", "getCreditLostStolenContent", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/CustomerProfileDetails;", "getCustomerProfileOverview", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CustomerServiceContact;", "getCustomerServiceContact", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/RevolvingCardIcon;", "getCardArtImage", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/AutopayOverview;", "getAutopayOverview", "getTemporaryCreditLimit", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/WalletOverview;", "getWalletOverview", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/PaymentSecurityInfo;", "getPaymentSecurityInfo", "Ljava/util/List;", "getProvisionedTokens", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ExternalWalletEligibilityStatus;", "getExternalWalletStatus", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ExternalWalletEligibilityReason;", "getExternalWalletReason", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/notifications/NotificationPreferences;", "getStatementDeliveryInfo", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getProductIdentifier", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/PushToWalletProvisioningData;", "getPushToWalletProvisioningData", "Z", "setWorldUser", "(Z)V", "getPdfUrl", "setPdfUrl", "(Ljava/lang/String;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrl;", "getPaymentSecurityUrl", "setPaymentSecurityUrl", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrl;)V", "getESignConsentUrl", "setESignConsentUrl", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/security/ProductFeatureEligibility;", "getProductFeatureEligibility", "getCardHolderTermsUrl", "getHasVirtualOrPhysicalCard", "getHasPhysicalCard", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class ManageCardDetails {
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountAPRs aprs;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.RevolvingCardIcon cardArtImage;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl cardHolderTermsUrl;
    private final java.lang.String creditAccountId;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument creditInstrument;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount creditLimit;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.LostStolenPageSummary creditLostStolenContent;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails customerProfileOverview;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact customerServiceContact;
    private com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl eSignConsentUrl;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason externalWalletReason;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus externalWalletStatus;
    private final boolean hasPhysicalCard;
    private final boolean hasVirtualOrPhysicalCard;
    private final boolean isAutopayEligible;
    private final boolean isAutopayEnabled;
    private final boolean isAutopayErrorState;
    private final boolean isAutopayNotSetup;
    private final boolean isCardFrozen;
    private final boolean isDayZeroForAutopay;
    private final boolean isPushToWalletCardActive;
    private final boolean isPushToWalletEligible;
    private final boolean isPushToWalletErrorState;
    private final boolean isPushToWalletFinishSetupRequired;
    private final boolean isStatementDeliveryErrorState;
    private boolean isWorldUser;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityInfo paymentSecurityInfo;
    private com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl paymentSecurityUrl;
    private java.lang.String pdfUrl;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibility productFeatureEligibility;
    private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier productIdentifier;
    private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken> provisionedTokens;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.PushToWalletProvisioningData pushToWalletProvisioningData;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferences statementDeliveryInfo;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount temporaryCreditLimit;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletOverview walletOverview;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails.m18148$r8$lambda$vfrJKUHuCnqnXTqU8eKjy9D__Y();
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus.values());
            return createSimpleEnumSerializer;
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason.values());
            return createSimpleEnumSerializer;
        }
    }), null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.INSTANCE.serializer();
            return serializer;
        }
    }), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails> serializer() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ManageCardDetails(int i, int i2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountAPRs accountAPRs, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument creditInstrument, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.LostStolenPageSummary lostStolenPageSummary, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails customerProfileDetails, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact customerServiceContact, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.RevolvingCardIcon revolvingCardIcon, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletOverview walletOverview, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityInfo paymentSecurityInfo, java.util.List list, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus externalWalletEligibilityStatus, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason externalWalletEligibilityReason, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferences notificationPreferences, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.PushToWalletProvisioningData pushToWalletProvisioningData, boolean z, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibility productFeatureEligibility, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        boolean z15;
        boolean z16;
        boolean z17;
        java.lang.Boolean enrollmentEligible;
        boolean z18 = false;
        if (16711679 != (i & 16711679)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwArrayMissingFieldException(new int[]{i, i2}, new int[]{16711679, 0}, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails$$serializer.INSTANCE.getDescriptor());
        }
        this.aprs = accountAPRs;
        this.creditAccountId = str;
        this.creditInstrument = creditInstrument;
        this.creditLimit = currencyAmount;
        this.creditLostStolenContent = lostStolenPageSummary;
        this.customerProfileOverview = customerProfileDetails;
        this.customerServiceContact = customerServiceContact;
        this.cardArtImage = revolvingCardIcon;
        this.autopayOverview = autopayOverview;
        this.temporaryCreditLimit = currencyAmount2;
        this.walletOverview = walletOverview;
        this.paymentSecurityInfo = paymentSecurityInfo;
        this.provisionedTokens = list;
        this.externalWalletStatus = externalWalletEligibilityStatus;
        this.externalWalletReason = externalWalletEligibilityReason;
        this.statementDeliveryInfo = notificationPreferences;
        if ((65536 & i) == 0) {
            this.productIdentifier = null;
        } else {
            this.productIdentifier = creditProductIdentifier;
        }
        this.pushToWalletProvisioningData = pushToWalletProvisioningData;
        this.isWorldUser = z;
        this.pdfUrl = str2;
        this.paymentSecurityUrl = contentUrl;
        this.eSignConsentUrl = contentUrl2;
        this.productFeatureEligibility = productFeatureEligibility;
        this.cardHolderTermsUrl = contentUrl3;
        this.isAutopayErrorState = (16777216 & i) == 0 ? autopayOverview == null : z2;
        boolean enrolled = (33554432 & i) == 0 ? autopayOverview != null ? autopayOverview.getEnrolled() : false : z3;
        this.isAutopayEnabled = enrolled;
        boolean booleanValue = (67108864 & i) == 0 ? (autopayOverview == null || (enrollmentEligible = autopayOverview.getEnrollmentEligible()) == null) ? false : enrollmentEligible.booleanValue() : z4;
        this.isAutopayEligible = booleanValue;
        this.isDayZeroForAutopay = (134217728 & i) == 0 ? (booleanValue || enrolled) ? false : true : z5;
        this.isAutopayNotSetup = (268435456 & i) == 0 ? booleanValue && !enrolled : z6;
        this.isStatementDeliveryErrorState = (536870912 & i) == 0 ? notificationPreferences == null || com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferencesKt.getChannels(notificationPreferences, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceId.STATEMENT_DELIVERY_CHANNELS).isEmpty() : z7;
        if ((1073741824 & i) == 0) {
            if ((creditInstrument != null ? creditInstrument.getType() : null) != com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType.VIRTUAL) {
                if ((creditInstrument != null ? creditInstrument.getType() : null) != com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType.PHYSICAL) {
                    z15 = false;
                }
            }
            z15 = true;
        } else {
            z15 = z8;
        }
        this.hasVirtualOrPhysicalCard = z15;
        if ((Integer.MIN_VALUE & i) == 0) {
            z16 = (creditInstrument != null ? creditInstrument.getType() : null) == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType.PHYSICAL;
        } else {
            z16 = z9;
        }
        this.hasPhysicalCard = z16;
        if ((i2 & 1) == 0) {
            z17 = (creditInstrument != null ? creditInstrument.getStatus() : null) == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus.FROZEN;
        } else {
            z17 = z10;
        }
        this.isCardFrozen = z17;
        this.isPushToWalletEligible = (i2 & 2) == 0 ? externalWalletEligibilityStatus == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus.ELIGIBLE && externalWalletEligibilityReason == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason.CARD_NOT_IN_WALLET : z11;
        this.isPushToWalletCardActive = (i2 & 4) == 0 ? externalWalletEligibilityReason == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason.CARD_IN_WALLET : z12;
        this.isPushToWalletFinishSetupRequired = (i2 & 8) == 0 ? externalWalletEligibilityReason == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason.CARD_PENDING_ACTIVATION : z13;
        if ((i2 & 16) != 0) {
            this.isPushToWalletErrorState = z14;
            return;
        }
        if (externalWalletEligibilityStatus == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus.UNKNOWN && externalWalletEligibilityReason == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason.UNKNOWN) {
            z18 = true;
        }
        this.isPushToWalletErrorState = z18;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ManageCardDetails(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountAPRs accountAPRs, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument creditInstrument, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.LostStolenPageSummary lostStolenPageSummary, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails customerProfileDetails, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact customerServiceContact, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.RevolvingCardIcon revolvingCardIcon, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletOverview walletOverview, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityInfo paymentSecurityInfo, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken> list, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus externalWalletEligibilityStatus, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason externalWalletEligibilityReason, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferences notificationPreferences, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.PushToWalletProvisioningData pushToWalletProvisioningData, boolean z, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibility productFeatureEligibility, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl3) {
        boolean z2;
        java.lang.Boolean enrollmentEligible;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalWalletEligibilityStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalWalletEligibilityReason, "");
        this.aprs = accountAPRs;
        this.creditAccountId = str;
        this.creditInstrument = creditInstrument;
        this.creditLimit = currencyAmount;
        this.creditLostStolenContent = lostStolenPageSummary;
        this.customerProfileOverview = customerProfileDetails;
        this.customerServiceContact = customerServiceContact;
        this.cardArtImage = revolvingCardIcon;
        this.autopayOverview = autopayOverview;
        this.temporaryCreditLimit = currencyAmount2;
        this.walletOverview = walletOverview;
        this.paymentSecurityInfo = paymentSecurityInfo;
        this.provisionedTokens = list;
        this.externalWalletStatus = externalWalletEligibilityStatus;
        this.externalWalletReason = externalWalletEligibilityReason;
        this.statementDeliveryInfo = notificationPreferences;
        this.productIdentifier = creditProductIdentifier;
        this.pushToWalletProvisioningData = pushToWalletProvisioningData;
        this.isWorldUser = z;
        this.pdfUrl = str2;
        this.paymentSecurityUrl = contentUrl;
        this.eSignConsentUrl = contentUrl2;
        this.productFeatureEligibility = productFeatureEligibility;
        this.cardHolderTermsUrl = contentUrl3;
        this.isAutopayErrorState = autopayOverview == null;
        boolean enrolled = autopayOverview != null ? autopayOverview.getEnrolled() : false;
        this.isAutopayEnabled = enrolled;
        boolean booleanValue = (autopayOverview == null || (enrollmentEligible = autopayOverview.getEnrollmentEligible()) == null) ? false : enrollmentEligible.booleanValue();
        this.isAutopayEligible = booleanValue;
        this.isDayZeroForAutopay = (booleanValue || enrolled) ? false : true;
        this.isAutopayNotSetup = booleanValue && !enrolled;
        this.isStatementDeliveryErrorState = notificationPreferences == null || com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferencesKt.getChannels(notificationPreferences, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceId.STATEMENT_DELIVERY_CHANNELS).isEmpty();
        if ((creditInstrument != null ? creditInstrument.getType() : null) != com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType.VIRTUAL) {
            if ((creditInstrument != null ? creditInstrument.getType() : null) != com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType.PHYSICAL) {
                z2 = false;
                this.hasVirtualOrPhysicalCard = z2;
                this.hasPhysicalCard = (creditInstrument == null ? creditInstrument.getType() : null) != com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType.PHYSICAL;
                this.isCardFrozen = (creditInstrument != null ? creditInstrument.getStatus() : null) != com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus.FROZEN;
                this.isPushToWalletEligible = externalWalletEligibilityStatus != com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus.ELIGIBLE && externalWalletEligibilityReason == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason.CARD_NOT_IN_WALLET;
                this.isPushToWalletCardActive = externalWalletEligibilityReason != com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason.CARD_IN_WALLET;
                this.isPushToWalletFinishSetupRequired = externalWalletEligibilityReason != com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason.CARD_PENDING_ACTIVATION;
                this.isPushToWalletErrorState = externalWalletEligibilityStatus != com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus.UNKNOWN && externalWalletEligibilityReason == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason.UNKNOWN;
            }
        }
        z2 = true;
        this.hasVirtualOrPhysicalCard = z2;
        this.hasPhysicalCard = (creditInstrument == null ? creditInstrument.getType() : null) != com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType.PHYSICAL;
        this.isCardFrozen = (creditInstrument != null ? creditInstrument.getStatus() : null) != com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus.FROZEN;
        this.isPushToWalletEligible = externalWalletEligibilityStatus != com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus.ELIGIBLE && externalWalletEligibilityReason == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason.CARD_NOT_IN_WALLET;
        this.isPushToWalletCardActive = externalWalletEligibilityReason != com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason.CARD_IN_WALLET;
        this.isPushToWalletFinishSetupRequired = externalWalletEligibilityReason != com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason.CARD_PENDING_ACTIVATION;
        this.isPushToWalletErrorState = externalWalletEligibilityStatus != com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus.UNKNOWN && externalWalletEligibilityReason == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason.UNKNOWN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0288, code lost:
    
        if (r7.isPushToWalletFinishSetupRequired != (r7.externalWalletReason == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason.CARD_PENDING_ACTIVATION)) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0129, code lost:
    
        if (r7.isAutopayErrorState != (r7.autopayOverview == null)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0144, code lost:
    
        if (r1 != (r2 != null ? r2.getEnrolled() : false)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0165, code lost:
    
        if (r1 != ((r2 == null || (r2 = r2.getEnrollmentEligible()) == null) ? false : r2.booleanValue())) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0181, code lost:
    
        if (r7.isDayZeroForAutopay != ((r7.isAutopayEligible || r7.isAutopayEnabled) ? false : true)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x019d, code lost:
    
        if (r7.isAutopayNotSetup != (r7.isAutopayEligible && !r7.isAutopayEnabled)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01c1, code lost:
    
        if (r1 != (r2 == null || com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferencesKt.getChannels(r2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceId.STATEMENT_DELIVERY_CHANNELS).isEmpty())) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01f2, code lost:
    
        if (r1 == r5) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0214, code lost:
    
        if (r1 != ((r5 != null ? r5.getType() : null) == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType.PHYSICAL)) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0234, code lost:
    
        if (r1 != ((r5 != null ? r5.getStatus() : null) == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus.FROZEN)) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0254, code lost:
    
        if (r7.isPushToWalletEligible != (r7.externalWalletStatus == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus.ELIGIBLE && r7.externalWalletReason == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason.CARD_NOT_IN_WALLET)) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x026e, code lost:
    
        if (r7.isPushToWalletCardActive != (r7.externalWalletReason == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason.CARD_IN_WALLET)) goto L121;
     */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$revolvingcredit_servicing_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        boolean z;
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        boolean z2 = false;
        output.encodeNullableSerializableElement(serialDesc, 0, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountAPRs$$serializer.INSTANCE, self.aprs);
        output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.creditAccountId);
        output.encodeNullableSerializableElement(serialDesc, 2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument$$serializer.INSTANCE, self.creditInstrument);
        output.encodeNullableSerializableElement(serialDesc, 3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, self.creditLimit);
        output.encodeNullableSerializableElement(serialDesc, 4, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.LostStolenPageSummary$$serializer.INSTANCE, self.creditLostStolenContent);
        output.encodeNullableSerializableElement(serialDesc, 5, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails$$serializer.INSTANCE, self.customerProfileOverview);
        output.encodeNullableSerializableElement(serialDesc, 6, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact$$serializer.INSTANCE, self.customerServiceContact);
        output.encodeNullableSerializableElement(serialDesc, 7, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.RevolvingCardIcon$$serializer.INSTANCE, self.cardArtImage);
        output.encodeNullableSerializableElement(serialDesc, 8, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview$$serializer.INSTANCE, self.autopayOverview);
        output.encodeNullableSerializableElement(serialDesc, 9, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, self.temporaryCreditLimit);
        output.encodeNullableSerializableElement(serialDesc, 10, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletOverview$$serializer.INSTANCE, self.walletOverview);
        output.encodeNullableSerializableElement(serialDesc, 11, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityInfo$$serializer.INSTANCE, self.paymentSecurityInfo);
        output.encodeSerializableElement(serialDesc, 12, lazyArr[12].getValue(), self.provisionedTokens);
        output.encodeSerializableElement(serialDesc, 13, lazyArr[13].getValue(), self.externalWalletStatus);
        output.encodeSerializableElement(serialDesc, 14, lazyArr[14].getValue(), self.externalWalletReason);
        output.encodeNullableSerializableElement(serialDesc, 15, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferences$$serializer.INSTANCE, self.statementDeliveryInfo);
        if (output.shouldEncodeElementDefault(serialDesc, 16) || self.productIdentifier != null) {
            output.encodeNullableSerializableElement(serialDesc, 16, lazyArr[16].getValue(), self.productIdentifier);
        }
        output.encodeNullableSerializableElement(serialDesc, 17, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.PushToWalletProvisioningData$$serializer.INSTANCE, self.pushToWalletProvisioningData);
        output.encodeBooleanElement(serialDesc, 18, self.isWorldUser);
        output.encodeNullableSerializableElement(serialDesc, 19, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.pdfUrl);
        output.encodeNullableSerializableElement(serialDesc, 20, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl$$serializer.INSTANCE, self.paymentSecurityUrl);
        output.encodeNullableSerializableElement(serialDesc, 21, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl$$serializer.INSTANCE, self.eSignConsentUrl);
        output.encodeNullableSerializableElement(serialDesc, 22, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibility$$serializer.INSTANCE, self.productFeatureEligibility);
        output.encodeNullableSerializableElement(serialDesc, 23, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl$$serializer.INSTANCE, self.cardHolderTermsUrl);
        if (!output.shouldEncodeElementDefault(serialDesc, 24)) {
        }
        output.encodeBooleanElement(serialDesc, 24, self.isAutopayErrorState);
        if (!output.shouldEncodeElementDefault(serialDesc, 25)) {
            boolean z3 = self.isAutopayEnabled;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview = self.autopayOverview;
        }
        output.encodeBooleanElement(serialDesc, 25, self.isAutopayEnabled);
        if (!output.shouldEncodeElementDefault(serialDesc, 26)) {
            boolean z4 = self.isAutopayEligible;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview2 = self.autopayOverview;
        }
        output.encodeBooleanElement(serialDesc, 26, self.isAutopayEligible);
        if (!output.shouldEncodeElementDefault(serialDesc, 27)) {
        }
        output.encodeBooleanElement(serialDesc, 27, self.isDayZeroForAutopay);
        if (!output.shouldEncodeElementDefault(serialDesc, 28)) {
        }
        output.encodeBooleanElement(serialDesc, 28, self.isAutopayNotSetup);
        if (!output.shouldEncodeElementDefault(serialDesc, 29)) {
            boolean z5 = self.isStatementDeliveryErrorState;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferences notificationPreferences = self.statementDeliveryInfo;
        }
        output.encodeBooleanElement(serialDesc, 29, self.isStatementDeliveryErrorState);
        if (!output.shouldEncodeElementDefault(serialDesc, 30)) {
            boolean z6 = self.hasVirtualOrPhysicalCard;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument creditInstrument = self.creditInstrument;
            if ((creditInstrument != null ? creditInstrument.getType() : null) != com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType.VIRTUAL) {
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument creditInstrument2 = self.creditInstrument;
                if ((creditInstrument2 != null ? creditInstrument2.getType() : null) != com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType.PHYSICAL) {
                    z = false;
                }
            }
            z = true;
        }
        output.encodeBooleanElement(serialDesc, 30, self.hasVirtualOrPhysicalCard);
        if (!output.shouldEncodeElementDefault(serialDesc, 31)) {
            boolean z7 = self.hasPhysicalCard;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument creditInstrument3 = self.creditInstrument;
        }
        output.encodeBooleanElement(serialDesc, 31, self.hasPhysicalCard);
        if (!output.shouldEncodeElementDefault(serialDesc, 32)) {
            boolean z8 = self.isCardFrozen;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument creditInstrument4 = self.creditInstrument;
        }
        output.encodeBooleanElement(serialDesc, 32, self.isCardFrozen);
        if (!output.shouldEncodeElementDefault(serialDesc, 33)) {
        }
        output.encodeBooleanElement(serialDesc, 33, self.isPushToWalletEligible);
        if (!output.shouldEncodeElementDefault(serialDesc, 34)) {
        }
        output.encodeBooleanElement(serialDesc, 34, self.isPushToWalletCardActive);
        if (!output.shouldEncodeElementDefault(serialDesc, 35)) {
        }
        output.encodeBooleanElement(serialDesc, 35, self.isPushToWalletFinishSetupRequired);
        if (!output.shouldEncodeElementDefault(serialDesc, 36)) {
            boolean z9 = self.isPushToWalletErrorState;
            if (self.externalWalletStatus == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus.UNKNOWN && self.externalWalletReason == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason.UNKNOWN) {
                z2 = true;
            }
            if (z9 == z2) {
                return;
            }
        }
        output.encodeBooleanElement(serialDesc, 36, self.isPushToWalletErrorState);
    }

    public /* synthetic */ ManageCardDetails(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountAPRs accountAPRs, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument creditInstrument, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.LostStolenPageSummary lostStolenPageSummary, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails customerProfileDetails, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact customerServiceContact, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.RevolvingCardIcon revolvingCardIcon, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletOverview walletOverview, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityInfo paymentSecurityInfo, java.util.List list, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus externalWalletEligibilityStatus, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason externalWalletEligibilityReason, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferences notificationPreferences, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.PushToWalletProvisioningData pushToWalletProvisioningData, boolean z, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibility productFeatureEligibility, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(accountAPRs, str, creditInstrument, currencyAmount, lostStolenPageSummary, customerProfileDetails, customerServiceContact, revolvingCardIcon, autopayOverview, currencyAmount2, walletOverview, paymentSecurityInfo, list, externalWalletEligibilityStatus, externalWalletEligibilityReason, notificationPreferences, (i & 65536) != 0 ? null : creditProductIdentifier, pushToWalletProvisioningData, z, str2, contentUrl, contentUrl2, productFeatureEligibility, contentUrl3);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountAPRs getAprs() {
        return this.aprs;
    }

    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument getCreditInstrument() {
        return this.creditInstrument;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getCreditLimit() {
        return this.creditLimit;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.LostStolenPageSummary getCreditLostStolenContent() {
        return this.creditLostStolenContent;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails getCustomerProfileOverview() {
        return this.customerProfileOverview;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact getCustomerServiceContact() {
        return this.customerServiceContact;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.RevolvingCardIcon getCardArtImage() {
        return this.cardArtImage;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview getAutopayOverview() {
        return this.autopayOverview;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getTemporaryCreditLimit() {
        return this.temporaryCreditLimit;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletOverview getWalletOverview() {
        return this.walletOverview;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityInfo getPaymentSecurityInfo() {
        return this.paymentSecurityInfo;
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken> getProvisionedTokens() {
        return this.provisionedTokens;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus getExternalWalletStatus() {
        return this.externalWalletStatus;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason getExternalWalletReason() {
        return this.externalWalletReason;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferences getStatementDeliveryInfo() {
        return this.statementDeliveryInfo;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getProductIdentifier() {
        return this.productIdentifier;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.PushToWalletProvisioningData getPushToWalletProvisioningData() {
        return this.pushToWalletProvisioningData;
    }

    public final boolean isWorldUser() {
        return this.isWorldUser;
    }

    public final void setWorldUser(boolean z) {
        this.isWorldUser = z;
    }

    public final java.lang.String getPdfUrl() {
        return this.pdfUrl;
    }

    public final void setPdfUrl(java.lang.String str) {
        this.pdfUrl = str;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl getPaymentSecurityUrl() {
        return this.paymentSecurityUrl;
    }

    public final void setPaymentSecurityUrl(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl) {
        this.paymentSecurityUrl = contentUrl;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl getESignConsentUrl() {
        return this.eSignConsentUrl;
    }

    public final void setESignConsentUrl(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl) {
        this.eSignConsentUrl = contentUrl;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibility getProductFeatureEligibility() {
        return this.productFeatureEligibility;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl getCardHolderTermsUrl() {
        return this.cardHolderTermsUrl;
    }

    /* renamed from: isAutopayErrorState, reason: from getter */
    public final boolean getIsAutopayErrorState() {
        return this.isAutopayErrorState;
    }

    /* renamed from: isAutopayEnabled, reason: from getter */
    public final boolean getIsAutopayEnabled() {
        return this.isAutopayEnabled;
    }

    /* renamed from: isAutopayEligible, reason: from getter */
    public final boolean getIsAutopayEligible() {
        return this.isAutopayEligible;
    }

    /* renamed from: isDayZeroForAutopay, reason: from getter */
    public final boolean getIsDayZeroForAutopay() {
        return this.isDayZeroForAutopay;
    }

    /* renamed from: isAutopayNotSetup, reason: from getter */
    public final boolean getIsAutopayNotSetup() {
        return this.isAutopayNotSetup;
    }

    /* renamed from: isStatementDeliveryErrorState, reason: from getter */
    public final boolean getIsStatementDeliveryErrorState() {
        return this.isStatementDeliveryErrorState;
    }

    public final boolean getHasVirtualOrPhysicalCard() {
        return this.hasVirtualOrPhysicalCard;
    }

    public final boolean getHasPhysicalCard() {
        return this.hasPhysicalCard;
    }

    /* renamed from: isCardFrozen, reason: from getter */
    public final boolean getIsCardFrozen() {
        return this.isCardFrozen;
    }

    /* renamed from: isPushToWalletEligible, reason: from getter */
    public final boolean getIsPushToWalletEligible() {
        return this.isPushToWalletEligible;
    }

    /* renamed from: isPushToWalletCardActive, reason: from getter */
    public final boolean getIsPushToWalletCardActive() {
        return this.isPushToWalletCardActive;
    }

    /* renamed from: isPushToWalletFinishSetupRequired, reason: from getter */
    public final boolean getIsPushToWalletFinishSetupRequired() {
        return this.isPushToWalletFinishSetupRequired;
    }

    /* renamed from: isPushToWalletErrorState, reason: from getter */
    public final boolean getIsPushToWalletErrorState() {
        return this.isPushToWalletErrorState;
    }

    /* renamed from: $r8$lambda$vfrJKUHuCnqnXTqU8e-Kjy9D__Y, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m18148$r8$lambda$vfrJKUHuCnqnXTqU8eKjy9D__Y() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken$$serializer.INSTANCE);
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountAPRs accountAPRs = this.aprs;
        java.lang.String str = this.creditAccountId;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument creditInstrument = this.creditInstrument;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = this.creditLimit;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.LostStolenPageSummary lostStolenPageSummary = this.creditLostStolenContent;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails customerProfileDetails = this.customerProfileOverview;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact customerServiceContact = this.customerServiceContact;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.RevolvingCardIcon revolvingCardIcon = this.cardArtImage;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview = this.autopayOverview;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2 = this.temporaryCreditLimit;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletOverview walletOverview = this.walletOverview;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityInfo paymentSecurityInfo = this.paymentSecurityInfo;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken> list = this.provisionedTokens;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus externalWalletEligibilityStatus = this.externalWalletStatus;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason externalWalletEligibilityReason = this.externalWalletReason;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferences notificationPreferences = this.statementDeliveryInfo;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.productIdentifier;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.PushToWalletProvisioningData pushToWalletProvisioningData = this.pushToWalletProvisioningData;
        boolean z = this.isWorldUser;
        java.lang.String str2 = this.pdfUrl;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl = this.paymentSecurityUrl;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl2 = this.eSignConsentUrl;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibility productFeatureEligibility = this.productFeatureEligibility;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl3 = this.cardHolderTermsUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ManageCardDetails(aprs=");
        sb.append(accountAPRs);
        sb.append(", creditAccountId=");
        sb.append(str);
        sb.append(", creditInstrument=");
        sb.append(creditInstrument);
        sb.append(", creditLimit=");
        sb.append(currencyAmount);
        sb.append(", creditLostStolenContent=");
        sb.append(lostStolenPageSummary);
        sb.append(", customerProfileOverview=");
        sb.append(customerProfileDetails);
        sb.append(", customerServiceContact=");
        sb.append(customerServiceContact);
        sb.append(", cardArtImage=");
        sb.append(revolvingCardIcon);
        sb.append(", autopayOverview=");
        sb.append(autopayOverview);
        sb.append(", temporaryCreditLimit=");
        sb.append(currencyAmount2);
        sb.append(", walletOverview=");
        sb.append(walletOverview);
        sb.append(", paymentSecurityInfo=");
        sb.append(paymentSecurityInfo);
        sb.append(", provisionedTokens=");
        sb.append(list);
        sb.append(", externalWalletStatus=");
        sb.append(externalWalletEligibilityStatus);
        sb.append(", externalWalletReason=");
        sb.append(externalWalletEligibilityReason);
        sb.append(", statementDeliveryInfo=");
        sb.append(notificationPreferences);
        sb.append(", productIdentifier=");
        sb.append(creditProductIdentifier);
        sb.append(", pushToWalletProvisioningData=");
        sb.append(pushToWalletProvisioningData);
        sb.append(", isWorldUser=");
        sb.append(z);
        sb.append(", pdfUrl=");
        sb.append(str2);
        sb.append(", paymentSecurityUrl=");
        sb.append(contentUrl);
        sb.append(", eSignConsentUrl=");
        sb.append(contentUrl2);
        sb.append(", productFeatureEligibility=");
        sb.append(productFeatureEligibility);
        sb.append(", cardHolderTermsUrl=");
        sb.append(contentUrl3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountAPRs accountAPRs = this.aprs;
        int hashCode = accountAPRs == null ? 0 : accountAPRs.hashCode();
        java.lang.String str = this.creditAccountId;
        int hashCode2 = str == null ? 0 : str.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument creditInstrument = this.creditInstrument;
        int hashCode3 = creditInstrument == null ? 0 : creditInstrument.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = this.creditLimit;
        int hashCode4 = currencyAmount == null ? 0 : currencyAmount.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.LostStolenPageSummary lostStolenPageSummary = this.creditLostStolenContent;
        int hashCode5 = lostStolenPageSummary == null ? 0 : lostStolenPageSummary.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails customerProfileDetails = this.customerProfileOverview;
        int hashCode6 = customerProfileDetails == null ? 0 : customerProfileDetails.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact customerServiceContact = this.customerServiceContact;
        int hashCode7 = customerServiceContact == null ? 0 : customerServiceContact.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.RevolvingCardIcon revolvingCardIcon = this.cardArtImage;
        int hashCode8 = revolvingCardIcon == null ? 0 : revolvingCardIcon.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview = this.autopayOverview;
        int hashCode9 = autopayOverview == null ? 0 : autopayOverview.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2 = this.temporaryCreditLimit;
        int hashCode10 = currencyAmount2 == null ? 0 : currencyAmount2.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletOverview walletOverview = this.walletOverview;
        int hashCode11 = walletOverview == null ? 0 : walletOverview.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityInfo paymentSecurityInfo = this.paymentSecurityInfo;
        int hashCode12 = paymentSecurityInfo == null ? 0 : paymentSecurityInfo.hashCode();
        int hashCode13 = this.provisionedTokens.hashCode();
        int hashCode14 = this.externalWalletStatus.hashCode();
        int hashCode15 = this.externalWalletReason.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferences notificationPreferences = this.statementDeliveryInfo;
        int hashCode16 = notificationPreferences == null ? 0 : notificationPreferences.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.productIdentifier;
        int hashCode17 = creditProductIdentifier == null ? 0 : creditProductIdentifier.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.PushToWalletProvisioningData pushToWalletProvisioningData = this.pushToWalletProvisioningData;
        int hashCode18 = pushToWalletProvisioningData == null ? 0 : pushToWalletProvisioningData.hashCode();
        int hashCode19 = java.lang.Boolean.hashCode(this.isWorldUser);
        java.lang.String str2 = this.pdfUrl;
        int hashCode20 = str2 == null ? 0 : str2.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl = this.paymentSecurityUrl;
        int hashCode21 = contentUrl == null ? 0 : contentUrl.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl2 = this.eSignConsentUrl;
        int hashCode22 = contentUrl2 == null ? 0 : contentUrl2.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibility productFeatureEligibility = this.productFeatureEligibility;
        int hashCode23 = productFeatureEligibility == null ? 0 : productFeatureEligibility.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl3 = this.cardHolderTermsUrl;
        return (((((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + hashCode20) * 31) + hashCode21) * 31) + hashCode22) * 31) + hashCode23) * 31) + (contentUrl3 != null ? contentUrl3.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.aprs, manageCardDetails.aprs) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, manageCardDetails.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditInstrument, manageCardDetails.creditInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditLimit, manageCardDetails.creditLimit) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditLostStolenContent, manageCardDetails.creditLostStolenContent) && kotlin.jvm.internal.Intrinsics.areEqual(this.customerProfileOverview, manageCardDetails.customerProfileOverview) && kotlin.jvm.internal.Intrinsics.areEqual(this.customerServiceContact, manageCardDetails.customerServiceContact) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardArtImage, manageCardDetails.cardArtImage) && kotlin.jvm.internal.Intrinsics.areEqual(this.autopayOverview, manageCardDetails.autopayOverview) && kotlin.jvm.internal.Intrinsics.areEqual(this.temporaryCreditLimit, manageCardDetails.temporaryCreditLimit) && kotlin.jvm.internal.Intrinsics.areEqual(this.walletOverview, manageCardDetails.walletOverview) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentSecurityInfo, manageCardDetails.paymentSecurityInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.provisionedTokens, manageCardDetails.provisionedTokens) && this.externalWalletStatus == manageCardDetails.externalWalletStatus && this.externalWalletReason == manageCardDetails.externalWalletReason && kotlin.jvm.internal.Intrinsics.areEqual(this.statementDeliveryInfo, manageCardDetails.statementDeliveryInfo) && this.productIdentifier == manageCardDetails.productIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.pushToWalletProvisioningData, manageCardDetails.pushToWalletProvisioningData) && this.isWorldUser == manageCardDetails.isWorldUser && kotlin.jvm.internal.Intrinsics.areEqual(this.pdfUrl, manageCardDetails.pdfUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentSecurityUrl, manageCardDetails.paymentSecurityUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.eSignConsentUrl, manageCardDetails.eSignConsentUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.productFeatureEligibility, manageCardDetails.productFeatureEligibility) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardHolderTermsUrl, manageCardDetails.cardHolderTermsUrl);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails copy(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountAPRs aprs, java.lang.String creditAccountId, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument creditInstrument, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount creditLimit, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.LostStolenPageSummary creditLostStolenContent, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails customerProfileOverview, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact customerServiceContact, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.RevolvingCardIcon cardArtImage, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount temporaryCreditLimit, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletOverview walletOverview, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityInfo paymentSecurityInfo, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken> provisionedTokens, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus externalWalletStatus, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason externalWalletReason, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferences statementDeliveryInfo, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier productIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.PushToWalletProvisioningData pushToWalletProvisioningData, boolean isWorldUser, java.lang.String pdfUrl, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl paymentSecurityUrl, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl eSignConsentUrl, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibility productFeatureEligibility, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl cardHolderTermsUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provisionedTokens, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalWalletStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalWalletReason, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails(aprs, creditAccountId, creditInstrument, creditLimit, creditLostStolenContent, customerProfileOverview, customerServiceContact, cardArtImage, autopayOverview, temporaryCreditLimit, walletOverview, paymentSecurityInfo, provisionedTokens, externalWalletStatus, externalWalletReason, statementDeliveryInfo, productIdentifier, pushToWalletProvisioningData, isWorldUser, pdfUrl, paymentSecurityUrl, eSignConsentUrl, productFeatureEligibility, cardHolderTermsUrl);
    }

    /* renamed from: component9, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview getAutopayOverview() {
        return this.autopayOverview;
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.RevolvingCardIcon getCardArtImage() {
        return this.cardArtImage;
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact getCustomerServiceContact() {
        return this.customerServiceContact;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.CustomerProfileDetails getCustomerProfileOverview() {
        return this.customerProfileOverview;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.LostStolenPageSummary getCreditLostStolenContent() {
        return this.creditLostStolenContent;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getCreditLimit() {
        return this.creditLimit;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditInstrument getCreditInstrument() {
        return this.creditInstrument;
    }

    /* renamed from: component24, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl getCardHolderTermsUrl() {
        return this.cardHolderTermsUrl;
    }

    /* renamed from: component23, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.ProductFeatureEligibility getProductFeatureEligibility() {
        return this.productFeatureEligibility;
    }

    /* renamed from: component22, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl getESignConsentUrl() {
        return this.eSignConsentUrl;
    }

    /* renamed from: component21, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl getPaymentSecurityUrl() {
        return this.paymentSecurityUrl;
    }

    /* renamed from: component20, reason: from getter */
    public final java.lang.String getPdfUrl() {
        return this.pdfUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getIsWorldUser() {
        return this.isWorldUser;
    }

    /* renamed from: component18, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.PushToWalletProvisioningData getPushToWalletProvisioningData() {
        return this.pushToWalletProvisioningData;
    }

    /* renamed from: component17, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getProductIdentifier() {
        return this.productIdentifier;
    }

    /* renamed from: component16, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferences getStatementDeliveryInfo() {
        return this.statementDeliveryInfo;
    }

    /* renamed from: component15, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason getExternalWalletReason() {
        return this.externalWalletReason;
    }

    /* renamed from: component14, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus getExternalWalletStatus() {
        return this.externalWalletStatus;
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken> component13() {
        return this.provisionedTokens;
    }

    /* renamed from: component12, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.security.PaymentSecurityInfo getPaymentSecurityInfo() {
        return this.paymentSecurityInfo;
    }

    /* renamed from: component11, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletOverview getWalletOverview() {
        return this.walletOverview;
    }

    /* renamed from: component10, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getTemporaryCreditLimit() {
        return this.temporaryCreditLimit;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountAPRs getAprs() {
        return this.aprs;
    }
}
