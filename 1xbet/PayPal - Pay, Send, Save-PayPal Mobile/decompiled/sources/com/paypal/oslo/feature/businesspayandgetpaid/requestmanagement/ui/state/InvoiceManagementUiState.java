package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010\b\n\u0002\b,\b\u0080\b\u0018\u00002\u00020\u0001BÅ\u0003\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\"\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020(0#\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020,0#\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010.\u0012\b\b\u0002\u00101\u001a\u00020\u0005¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u00105J\u0010\u00107\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b9\u00108J\u0010\u0010:\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b:\u00108J\u0012\u0010;\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b=\u00108J\u0010\u0010>\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b>\u00108J\u0010\u0010?\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b?\u00108J\u0010\u0010@\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b@\u00108J\u0010\u0010A\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bA\u00108J\u0010\u0010B\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bB\u00108J\u0010\u0010C\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bC\u00108J\u0012\u0010D\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bF\u00105J\u0010\u0010G\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bG\u00105J\u0012\u0010H\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bH\u00105J\u0010\u0010I\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bI\u00108J\u0010\u0010J\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bJ\u00105J\u0012\u0010K\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bK\u00105J\u0012\u0010L\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bL\u00105J\u0012\u0010M\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bM\u00105J\u0012\u0010N\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bN\u00105J\u0010\u0010O\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bO\u00105J\u0012\u0010P\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bP\u00105J\u0012\u0010Q\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bQ\u00105J\u0012\u0010R\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bR\u00105J\u0012\u0010S\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bS\u00105J\u0010\u0010T\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bT\u00105J\u0016\u0010U\u001a\b\u0012\u0004\u0012\u00020$0#HÆ\u0003¢\u0006\u0004\bU\u0010VJ\u0012\u0010W\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bW\u00105J\u0012\u0010X\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bX\u00105J\u0016\u0010Y\u001a\b\u0012\u0004\u0012\u00020(0#HÆ\u0003¢\u0006\u0004\bY\u0010VJ\u0012\u0010Z\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bZ\u00105J\u0012\u0010[\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b[\u00105J\u0016\u0010\\\u001a\b\u0012\u0004\u0012\u00020,0#HÆ\u0003¢\u0006\u0004\b\\\u0010VJ\u0012\u0010]\u001a\u0004\u0018\u00010.HÆ\u0003¢\u0006\u0004\b]\u0010^J\u0012\u0010_\u001a\u0004\u0018\u00010.HÆ\u0003¢\u0006\u0004\b_\u0010^J\u0010\u0010`\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b`\u00108JÎ\u0003\u0010a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\"\u001a\u00020\u00022\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020(0#2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020,0#2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.2\n\b\u0002\u00100\u001a\u0004\u0018\u00010.2\b\b\u0002\u00101\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\ba\u0010bJ\u001a\u0010d\u001a\u00020\u00052\b\u0010c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bd\u0010eJ\u0010\u0010g\u001a\u00020fHÖ\u0001¢\u0006\u0004\bg\u0010hJ\u0010\u0010i\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bi\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010j\u001a\u0004\bk\u00105R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010j\u001a\u0004\bl\u00105R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010m\u001a\u0004\b\u0006\u00108R\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010m\u001a\u0004\b\u0007\u00108R\u001a\u0010\b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010m\u001a\u0004\b\b\u00108R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010n\u001a\u0004\bo\u0010<R\u001a\u0010\u000b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010m\u001a\u0004\bp\u00108R\u001a\u0010\f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010m\u001a\u0004\bq\u00108R\u001a\u0010\r\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010m\u001a\u0004\br\u00108R\u001a\u0010\u000e\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010m\u001a\u0004\bs\u00108R\u001a\u0010\u000f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010m\u001a\u0004\bt\u00108R\u001a\u0010\u0010\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010m\u001a\u0004\bu\u00108R\u001a\u0010\u0011\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010m\u001a\u0004\bv\u00108R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010w\u001a\u0004\bx\u0010ER\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010j\u001a\u0004\by\u00105R\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010j\u001a\u0004\bz\u00105R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010j\u001a\u0004\b{\u00105R\u001a\u0010\u0017\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010m\u001a\u0004\b|\u00108R\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010j\u001a\u0004\b}\u00105R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010j\u001a\u0004\b~\u00105R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010j\u001a\u0004\b\u007f\u00105R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\r\n\u0004\b\u001b\u0010j\u001a\u0005\b\u0080\u0001\u00105R\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\r\n\u0004\b\u001c\u0010j\u001a\u0005\b\u0081\u0001\u00105R\u001b\u0010\u001d\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\r\n\u0004\b\u001d\u0010j\u001a\u0005\b\u0082\u0001\u00105R\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\r\n\u0004\b\u001e\u0010j\u001a\u0005\b\u0083\u0001\u00105R\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\r\n\u0004\b\u001f\u0010j\u001a\u0005\b\u0084\u0001\u00105R\u001d\u0010 \u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\r\n\u0004\b \u0010j\u001a\u0005\b\u0085\u0001\u00105R\u001d\u0010!\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\r\n\u0004\b!\u0010j\u001a\u0005\b\u0086\u0001\u00105R\u001b\u0010\"\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\r\n\u0004\b\"\u0010j\u001a\u0005\b\u0087\u0001\u00105R\"\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b%\u0010\u0088\u0001\u001a\u0005\b\u0089\u0001\u0010VR\u001d\u0010&\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\r\n\u0004\b&\u0010j\u001a\u0005\b\u008a\u0001\u00105R\u001d\u0010'\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\r\n\u0004\b'\u0010j\u001a\u0005\b\u008b\u0001\u00105R\"\u0010)\u001a\b\u0012\u0004\u0012\u00020(0#8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b)\u0010\u0088\u0001\u001a\u0005\b\u008c\u0001\u0010VR\u001d\u0010*\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\r\n\u0004\b*\u0010j\u001a\u0005\b\u008d\u0001\u00105R\u001d\u0010+\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\r\n\u0004\b+\u0010j\u001a\u0005\b\u008e\u0001\u00105R\"\u0010-\u001a\b\u0012\u0004\u0012\u00020,0#8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b-\u0010\u0088\u0001\u001a\u0005\b\u008f\u0001\u0010VR\u001e\u0010/\u001a\u0004\u0018\u00010.8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b/\u0010\u0090\u0001\u001a\u0005\b\u0091\u0001\u0010^R\u001e\u00100\u001a\u0004\u0018\u00010.8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b0\u0010\u0090\u0001\u001a\u0005\b\u0092\u0001\u0010^R\u001a\u00101\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010m\u001a\u0004\b1\u00108"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/InvoiceManagementUiState;", "", "", "id", "invoiceNumber", "", "isLoading", "isSendingReminder", "isCancelling", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsError;", "error", "invoiceCancelled", "cancelInvoiceAllowed", "showCancelConfirmation", "sendCopyOnCancel", "sendReminderAllowed", "showReminderConfirmation", "sendCopyOnReminder", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/InvoiceStatusUiState;", "status", "customerName", "amountDueFormatted", "tipAmountFormatted", "tipsAllowed", "amountPaidFormatted", "refundedFormatted", "paidAfterRefundFormatted", "invoiceDate", "dueDate", "subtotalFormatted", "itemsDiscountFormatted", "invoiceDiscountFormatted", "shippingFeeFormatted", "taxAmountFormatted", "totalAmountFormatted", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/LineItem;", "items", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.NOTE, "customerEmail", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Recipient$RecipientPhoneNumber;", "customerPhones", "customerPhoneFormatted", "shareUrl", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/invoiceaction/InvoiceAction;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Rule;", "autoCancelRule", "earlyPaymentDiscountRule", "isEarlyPaymentDiscountExpired", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZZLcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsError;ZZZZZZZLcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/InvoiceStatusUiState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Rule;Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Rule;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "component5", "component6", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsError;", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/InvoiceStatusUiState;", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "()Ljava/util/List;", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Rule;", "component38", "component39", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZZLcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsError;ZZZZZZZLcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/InvoiceStatusUiState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Rule;Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Rule;Z)Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/InvoiceManagementUiState;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getInvoiceNumber", "Z", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsError;", "getError", "getInvoiceCancelled", "getCancelInvoiceAllowed", "getShowCancelConfirmation", "getSendCopyOnCancel", "getSendReminderAllowed", "getShowReminderConfirmation", "getSendCopyOnReminder", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/InvoiceStatusUiState;", "getStatus", "getCustomerName", "getAmountDueFormatted", "getTipAmountFormatted", "getTipsAllowed", "getAmountPaidFormatted", "getRefundedFormatted", "getPaidAfterRefundFormatted", "getInvoiceDate", "getDueDate", "getSubtotalFormatted", "getItemsDiscountFormatted", "getInvoiceDiscountFormatted", "getShippingFeeFormatted", "getTaxAmountFormatted", "getTotalAmountFormatted", "Ljava/util/List;", "getItems", "getNote", "getCustomerEmail", "getCustomerPhones", "getCustomerPhoneFormatted", "getShareUrl", "getActions", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Rule;", "getAutoCancelRule", "getEarlyPaymentDiscountRule"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class InvoiceManagementUiState {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.invoiceaction.InvoiceAction> actions;
    private final java.lang.String amountDueFormatted;
    private final java.lang.String amountPaidFormatted;
    private final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Rule autoCancelRule;
    private final boolean cancelInvoiceAllowed;
    private final java.lang.String customerEmail;
    private final java.lang.String customerName;
    private final java.lang.String customerPhoneFormatted;
    private final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientPhoneNumber> customerPhones;
    private final java.lang.String dueDate;
    private final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Rule earlyPaymentDiscountRule;
    private final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsError error;
    private final java.lang.String id;
    private final boolean invoiceCancelled;
    private final java.lang.String invoiceDate;
    private final java.lang.String invoiceDiscountFormatted;
    private final java.lang.String invoiceNumber;
    private final boolean isCancelling;
    private final boolean isEarlyPaymentDiscountExpired;
    private final boolean isLoading;
    private final boolean isSendingReminder;
    private final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> items;
    private final java.lang.String itemsDiscountFormatted;
    private final java.lang.String note;
    private final java.lang.String paidAfterRefundFormatted;
    private final java.lang.String refundedFormatted;
    private final boolean sendCopyOnCancel;
    private final boolean sendCopyOnReminder;
    private final boolean sendReminderAllowed;
    private final java.lang.String shareUrl;
    private final java.lang.String shippingFeeFormatted;
    private final boolean showCancelConfirmation;
    private final boolean showReminderConfirmation;
    private final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceStatusUiState status;
    private final java.lang.String subtotalFormatted;
    private final java.lang.String taxAmountFormatted;
    private final java.lang.String tipAmountFormatted;
    private final boolean tipsAllowed;
    private final java.lang.String totalAmountFormatted;

    /* JADX WARN: Multi-variable type inference failed */
    public InvoiceManagementUiState(java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsError invoiceDetailsError, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceStatusUiState invoiceStatusUiState, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z11, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15, java.lang.String str16, java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> list, java.lang.String str17, java.lang.String str18, java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientPhoneNumber> list2, java.lang.String str19, java.lang.String str20, java.util.List<? extends com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.invoiceaction.InvoiceAction> list3, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Rule rule, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Rule rule2, boolean z12) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str11, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str16, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
        this.id = str;
        this.invoiceNumber = str2;
        this.isLoading = z;
        this.isSendingReminder = z2;
        this.isCancelling = z3;
        this.error = invoiceDetailsError;
        this.invoiceCancelled = z4;
        this.cancelInvoiceAllowed = z5;
        this.showCancelConfirmation = z6;
        this.sendCopyOnCancel = z7;
        this.sendReminderAllowed = z8;
        this.showReminderConfirmation = z9;
        this.sendCopyOnReminder = z10;
        this.status = invoiceStatusUiState;
        this.customerName = str3;
        this.amountDueFormatted = str4;
        this.tipAmountFormatted = str5;
        this.tipsAllowed = z11;
        this.amountPaidFormatted = str6;
        this.refundedFormatted = str7;
        this.paidAfterRefundFormatted = str8;
        this.invoiceDate = str9;
        this.dueDate = str10;
        this.subtotalFormatted = str11;
        this.itemsDiscountFormatted = str12;
        this.invoiceDiscountFormatted = str13;
        this.shippingFeeFormatted = str14;
        this.taxAmountFormatted = str15;
        this.totalAmountFormatted = str16;
        this.items = list;
        this.note = str17;
        this.customerEmail = str18;
        this.customerPhones = list2;
        this.customerPhoneFormatted = str19;
        this.shareUrl = str20;
        this.actions = list3;
        this.autoCancelRule = rule;
        this.earlyPaymentDiscountRule = rule2;
        this.isEarlyPaymentDiscountExpired = z12;
    }

    public /* synthetic */ InvoiceManagementUiState(java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsError invoiceDetailsError, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceStatusUiState invoiceStatusUiState, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z11, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15, java.lang.String str16, java.util.List list, java.lang.String str17, java.lang.String str18, java.util.List list2, java.lang.String str19, java.lang.String str20, java.util.List list3, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Rule rule, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Rule rule2, boolean z12, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? null : invoiceDetailsError, (i & 64) != 0 ? false : z4, (i & 128) != 0 ? false : z5, (i & 256) != 0 ? false : z6, (i & 512) != 0 ? true : z7, (i & 1024) != 0 ? false : z8, (i & 2048) != 0 ? false : z9, (i & 4096) == 0 ? z10 : true, (i & 8192) != 0 ? null : invoiceStatusUiState, (i & 16384) != 0 ? null : str3, (i & 32768) != 0 ? "$0.00" : str4, (i & 65536) != 0 ? null : str5, (i & 131072) != 0 ? false : z11, (i & 262144) != 0 ? "$0.00" : str6, (i & 524288) != 0 ? null : str7, (i & 1048576) != 0 ? null : str8, (i & 2097152) != 0 ? null : str9, (i & 4194304) != 0 ? null : str10, (i & 8388608) != 0 ? "$0.00" : str11, (i & 16777216) != 0 ? null : str12, (i & 33554432) != 0 ? null : str13, (i & 67108864) != 0 ? null : str14, (i & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : str15, (i & 268435456) == 0 ? str16 : "$0.00", (i & 536870912) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 1073741824) != 0 ? null : str17, (i & Integer.MIN_VALUE) != 0 ? null : str18, (i2 & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i2 & 2) != 0 ? null : str19, (i2 & 4) != 0 ? null : str20, (i2 & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list3, (i2 & 16) != 0 ? null : rule, (i2 & 32) != 0 ? null : rule2, (i2 & 64) != 0 ? false : z12);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getInvoiceNumber() {
        return this.invoiceNumber;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isSendingReminder() {
        return this.isSendingReminder;
    }

    public final boolean isCancelling() {
        return this.isCancelling;
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsError getError() {
        return this.error;
    }

    public final boolean getInvoiceCancelled() {
        return this.invoiceCancelled;
    }

    public final boolean getCancelInvoiceAllowed() {
        return this.cancelInvoiceAllowed;
    }

    public final boolean getShowCancelConfirmation() {
        return this.showCancelConfirmation;
    }

    public final boolean getSendCopyOnCancel() {
        return this.sendCopyOnCancel;
    }

    public final boolean getSendReminderAllowed() {
        return this.sendReminderAllowed;
    }

    public final boolean getShowReminderConfirmation() {
        return this.showReminderConfirmation;
    }

    public final boolean getSendCopyOnReminder() {
        return this.sendCopyOnReminder;
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceStatusUiState getStatus() {
        return this.status;
    }

    public final java.lang.String getCustomerName() {
        return this.customerName;
    }

    public final java.lang.String getAmountDueFormatted() {
        return this.amountDueFormatted;
    }

    public final java.lang.String getTipAmountFormatted() {
        return this.tipAmountFormatted;
    }

    public final boolean getTipsAllowed() {
        return this.tipsAllowed;
    }

    public final java.lang.String getAmountPaidFormatted() {
        return this.amountPaidFormatted;
    }

    public final java.lang.String getRefundedFormatted() {
        return this.refundedFormatted;
    }

    public final java.lang.String getPaidAfterRefundFormatted() {
        return this.paidAfterRefundFormatted;
    }

    public final java.lang.String getInvoiceDate() {
        return this.invoiceDate;
    }

    public final java.lang.String getDueDate() {
        return this.dueDate;
    }

    public final java.lang.String getSubtotalFormatted() {
        return this.subtotalFormatted;
    }

    public final java.lang.String getItemsDiscountFormatted() {
        return this.itemsDiscountFormatted;
    }

    public final java.lang.String getInvoiceDiscountFormatted() {
        return this.invoiceDiscountFormatted;
    }

    public final java.lang.String getShippingFeeFormatted() {
        return this.shippingFeeFormatted;
    }

    public final java.lang.String getTaxAmountFormatted() {
        return this.taxAmountFormatted;
    }

    public final java.lang.String getTotalAmountFormatted() {
        return this.totalAmountFormatted;
    }

    public final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> getItems() {
        return this.items;
    }

    public final java.lang.String getNote() {
        return this.note;
    }

    public final java.lang.String getCustomerEmail() {
        return this.customerEmail;
    }

    public final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientPhoneNumber> getCustomerPhones() {
        return this.customerPhones;
    }

    public final java.lang.String getCustomerPhoneFormatted() {
        return this.customerPhoneFormatted;
    }

    public final java.lang.String getShareUrl() {
        return this.shareUrl;
    }

    public final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.invoiceaction.InvoiceAction> getActions() {
        return this.actions;
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Rule getAutoCancelRule() {
        return this.autoCancelRule;
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Rule getEarlyPaymentDiscountRule() {
        return this.earlyPaymentDiscountRule;
    }

    public final boolean isEarlyPaymentDiscountExpired() {
        return this.isEarlyPaymentDiscountExpired;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.invoiceNumber;
        boolean z = this.isLoading;
        boolean z2 = this.isSendingReminder;
        boolean z3 = this.isCancelling;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsError invoiceDetailsError = this.error;
        boolean z4 = this.invoiceCancelled;
        boolean z5 = this.cancelInvoiceAllowed;
        boolean z6 = this.showCancelConfirmation;
        boolean z7 = this.sendCopyOnCancel;
        boolean z8 = this.sendReminderAllowed;
        boolean z9 = this.showReminderConfirmation;
        boolean z10 = this.sendCopyOnReminder;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceStatusUiState invoiceStatusUiState = this.status;
        java.lang.String str3 = this.customerName;
        java.lang.String str4 = this.amountDueFormatted;
        java.lang.String str5 = this.tipAmountFormatted;
        boolean z11 = this.tipsAllowed;
        java.lang.String str6 = this.amountPaidFormatted;
        java.lang.String str7 = this.refundedFormatted;
        java.lang.String str8 = this.paidAfterRefundFormatted;
        java.lang.String str9 = this.invoiceDate;
        java.lang.String str10 = this.dueDate;
        java.lang.String str11 = this.subtotalFormatted;
        java.lang.String str12 = this.itemsDiscountFormatted;
        java.lang.String str13 = this.invoiceDiscountFormatted;
        java.lang.String str14 = this.shippingFeeFormatted;
        java.lang.String str15 = this.taxAmountFormatted;
        java.lang.String str16 = this.totalAmountFormatted;
        java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> list = this.items;
        java.lang.String str17 = this.note;
        java.lang.String str18 = this.customerEmail;
        java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientPhoneNumber> list2 = this.customerPhones;
        java.lang.String str19 = this.customerPhoneFormatted;
        java.lang.String str20 = this.shareUrl;
        java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.invoiceaction.InvoiceAction> list3 = this.actions;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Rule rule = this.autoCancelRule;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Rule rule2 = this.earlyPaymentDiscountRule;
        boolean z12 = this.isEarlyPaymentDiscountExpired;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InvoiceManagementUiState(id=");
        sb.append(str);
        sb.append(", invoiceNumber=");
        sb.append(str2);
        sb.append(", isLoading=");
        sb.append(z);
        sb.append(", isSendingReminder=");
        sb.append(z2);
        sb.append(", isCancelling=");
        sb.append(z3);
        sb.append(", error=");
        sb.append(invoiceDetailsError);
        sb.append(", invoiceCancelled=");
        sb.append(z4);
        sb.append(", cancelInvoiceAllowed=");
        sb.append(z5);
        sb.append(", showCancelConfirmation=");
        sb.append(z6);
        sb.append(", sendCopyOnCancel=");
        sb.append(z7);
        sb.append(", sendReminderAllowed=");
        sb.append(z8);
        sb.append(", showReminderConfirmation=");
        sb.append(z9);
        sb.append(", sendCopyOnReminder=");
        sb.append(z10);
        sb.append(", status=");
        sb.append(invoiceStatusUiState);
        sb.append(", customerName=");
        sb.append(str3);
        sb.append(", amountDueFormatted=");
        sb.append(str4);
        sb.append(", tipAmountFormatted=");
        sb.append(str5);
        sb.append(", tipsAllowed=");
        sb.append(z11);
        sb.append(", amountPaidFormatted=");
        sb.append(str6);
        sb.append(", refundedFormatted=");
        sb.append(str7);
        sb.append(", paidAfterRefundFormatted=");
        sb.append(str8);
        sb.append(", invoiceDate=");
        sb.append(str9);
        sb.append(", dueDate=");
        sb.append(str10);
        sb.append(", subtotalFormatted=");
        sb.append(str11);
        sb.append(", itemsDiscountFormatted=");
        sb.append(str12);
        sb.append(", invoiceDiscountFormatted=");
        sb.append(str13);
        sb.append(", shippingFeeFormatted=");
        sb.append(str14);
        sb.append(", taxAmountFormatted=");
        sb.append(str15);
        sb.append(", totalAmountFormatted=");
        sb.append(str16);
        sb.append(", items=");
        sb.append(list);
        sb.append(", note=");
        sb.append(str17);
        sb.append(", customerEmail=");
        sb.append(str18);
        sb.append(", customerPhones=");
        sb.append(list2);
        sb.append(", customerPhoneFormatted=");
        sb.append(str19);
        sb.append(", shareUrl=");
        sb.append(str20);
        sb.append(", actions=");
        sb.append(list3);
        sb.append(", autoCancelRule=");
        sb.append(rule);
        sb.append(", earlyPaymentDiscountRule=");
        sb.append(rule2);
        sb.append(", isEarlyPaymentDiscountExpired=");
        sb.append(z12);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        java.lang.String str = this.invoiceNumber;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int hashCode3 = java.lang.Boolean.hashCode(this.isLoading);
        int hashCode4 = java.lang.Boolean.hashCode(this.isSendingReminder);
        int hashCode5 = java.lang.Boolean.hashCode(this.isCancelling);
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsError invoiceDetailsError = this.error;
        int hashCode6 = invoiceDetailsError == null ? 0 : invoiceDetailsError.hashCode();
        int hashCode7 = java.lang.Boolean.hashCode(this.invoiceCancelled);
        int hashCode8 = java.lang.Boolean.hashCode(this.cancelInvoiceAllowed);
        int hashCode9 = java.lang.Boolean.hashCode(this.showCancelConfirmation);
        int hashCode10 = java.lang.Boolean.hashCode(this.sendCopyOnCancel);
        int hashCode11 = java.lang.Boolean.hashCode(this.sendReminderAllowed);
        int hashCode12 = java.lang.Boolean.hashCode(this.showReminderConfirmation);
        int hashCode13 = java.lang.Boolean.hashCode(this.sendCopyOnReminder);
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceStatusUiState invoiceStatusUiState = this.status;
        int hashCode14 = invoiceStatusUiState == null ? 0 : invoiceStatusUiState.hashCode();
        java.lang.String str2 = this.customerName;
        int hashCode15 = str2 == null ? 0 : str2.hashCode();
        int hashCode16 = this.amountDueFormatted.hashCode();
        java.lang.String str3 = this.tipAmountFormatted;
        int hashCode17 = str3 == null ? 0 : str3.hashCode();
        int hashCode18 = java.lang.Boolean.hashCode(this.tipsAllowed);
        int hashCode19 = this.amountPaidFormatted.hashCode();
        java.lang.String str4 = this.refundedFormatted;
        int hashCode20 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.paidAfterRefundFormatted;
        int hashCode21 = str5 == null ? 0 : str5.hashCode();
        java.lang.String str6 = this.invoiceDate;
        int hashCode22 = str6 == null ? 0 : str6.hashCode();
        java.lang.String str7 = this.dueDate;
        int hashCode23 = str7 == null ? 0 : str7.hashCode();
        int hashCode24 = this.subtotalFormatted.hashCode();
        java.lang.String str8 = this.itemsDiscountFormatted;
        int hashCode25 = str8 == null ? 0 : str8.hashCode();
        java.lang.String str9 = this.invoiceDiscountFormatted;
        int hashCode26 = str9 == null ? 0 : str9.hashCode();
        java.lang.String str10 = this.shippingFeeFormatted;
        int hashCode27 = str10 == null ? 0 : str10.hashCode();
        java.lang.String str11 = this.taxAmountFormatted;
        int hashCode28 = str11 == null ? 0 : str11.hashCode();
        int hashCode29 = this.totalAmountFormatted.hashCode();
        int hashCode30 = this.items.hashCode();
        java.lang.String str12 = this.note;
        int hashCode31 = str12 == null ? 0 : str12.hashCode();
        java.lang.String str13 = this.customerEmail;
        int hashCode32 = str13 == null ? 0 : str13.hashCode();
        int hashCode33 = this.customerPhones.hashCode();
        java.lang.String str14 = this.customerPhoneFormatted;
        int hashCode34 = str14 == null ? 0 : str14.hashCode();
        java.lang.String str15 = this.shareUrl;
        int hashCode35 = str15 == null ? 0 : str15.hashCode();
        int hashCode36 = this.actions.hashCode();
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Rule rule = this.autoCancelRule;
        int hashCode37 = rule == null ? 0 : rule.hashCode();
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Rule rule2 = this.earlyPaymentDiscountRule;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + hashCode20) * 31) + hashCode21) * 31) + hashCode22) * 31) + hashCode23) * 31) + hashCode24) * 31) + hashCode25) * 31) + hashCode26) * 31) + hashCode27) * 31) + hashCode28) * 31) + hashCode29) * 31) + hashCode30) * 31) + hashCode31) * 31) + hashCode32) * 31) + hashCode33) * 31) + hashCode34) * 31) + hashCode35) * 31) + hashCode36) * 31) + hashCode37) * 31) + (rule2 != null ? rule2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.isEarlyPaymentDiscountExpired);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState)) {
            return false;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState invoiceManagementUiState = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, invoiceManagementUiState.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.invoiceNumber, invoiceManagementUiState.invoiceNumber) && this.isLoading == invoiceManagementUiState.isLoading && this.isSendingReminder == invoiceManagementUiState.isSendingReminder && this.isCancelling == invoiceManagementUiState.isCancelling && kotlin.jvm.internal.Intrinsics.areEqual(this.error, invoiceManagementUiState.error) && this.invoiceCancelled == invoiceManagementUiState.invoiceCancelled && this.cancelInvoiceAllowed == invoiceManagementUiState.cancelInvoiceAllowed && this.showCancelConfirmation == invoiceManagementUiState.showCancelConfirmation && this.sendCopyOnCancel == invoiceManagementUiState.sendCopyOnCancel && this.sendReminderAllowed == invoiceManagementUiState.sendReminderAllowed && this.showReminderConfirmation == invoiceManagementUiState.showReminderConfirmation && this.sendCopyOnReminder == invoiceManagementUiState.sendCopyOnReminder && kotlin.jvm.internal.Intrinsics.areEqual(this.status, invoiceManagementUiState.status) && kotlin.jvm.internal.Intrinsics.areEqual(this.customerName, invoiceManagementUiState.customerName) && kotlin.jvm.internal.Intrinsics.areEqual(this.amountDueFormatted, invoiceManagementUiState.amountDueFormatted) && kotlin.jvm.internal.Intrinsics.areEqual(this.tipAmountFormatted, invoiceManagementUiState.tipAmountFormatted) && this.tipsAllowed == invoiceManagementUiState.tipsAllowed && kotlin.jvm.internal.Intrinsics.areEqual(this.amountPaidFormatted, invoiceManagementUiState.amountPaidFormatted) && kotlin.jvm.internal.Intrinsics.areEqual(this.refundedFormatted, invoiceManagementUiState.refundedFormatted) && kotlin.jvm.internal.Intrinsics.areEqual(this.paidAfterRefundFormatted, invoiceManagementUiState.paidAfterRefundFormatted) && kotlin.jvm.internal.Intrinsics.areEqual(this.invoiceDate, invoiceManagementUiState.invoiceDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.dueDate, invoiceManagementUiState.dueDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.subtotalFormatted, invoiceManagementUiState.subtotalFormatted) && kotlin.jvm.internal.Intrinsics.areEqual(this.itemsDiscountFormatted, invoiceManagementUiState.itemsDiscountFormatted) && kotlin.jvm.internal.Intrinsics.areEqual(this.invoiceDiscountFormatted, invoiceManagementUiState.invoiceDiscountFormatted) && kotlin.jvm.internal.Intrinsics.areEqual(this.shippingFeeFormatted, invoiceManagementUiState.shippingFeeFormatted) && kotlin.jvm.internal.Intrinsics.areEqual(this.taxAmountFormatted, invoiceManagementUiState.taxAmountFormatted) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalAmountFormatted, invoiceManagementUiState.totalAmountFormatted) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, invoiceManagementUiState.items) && kotlin.jvm.internal.Intrinsics.areEqual(this.note, invoiceManagementUiState.note) && kotlin.jvm.internal.Intrinsics.areEqual(this.customerEmail, invoiceManagementUiState.customerEmail) && kotlin.jvm.internal.Intrinsics.areEqual(this.customerPhones, invoiceManagementUiState.customerPhones) && kotlin.jvm.internal.Intrinsics.areEqual(this.customerPhoneFormatted, invoiceManagementUiState.customerPhoneFormatted) && kotlin.jvm.internal.Intrinsics.areEqual(this.shareUrl, invoiceManagementUiState.shareUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.actions, invoiceManagementUiState.actions) && kotlin.jvm.internal.Intrinsics.areEqual(this.autoCancelRule, invoiceManagementUiState.autoCancelRule) && kotlin.jvm.internal.Intrinsics.areEqual(this.earlyPaymentDiscountRule, invoiceManagementUiState.earlyPaymentDiscountRule) && this.isEarlyPaymentDiscountExpired == invoiceManagementUiState.isEarlyPaymentDiscountExpired;
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState copy(java.lang.String id, java.lang.String invoiceNumber, boolean isLoading, boolean isSendingReminder, boolean isCancelling, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsError error, boolean invoiceCancelled, boolean cancelInvoiceAllowed, boolean showCancelConfirmation, boolean sendCopyOnCancel, boolean sendReminderAllowed, boolean showReminderConfirmation, boolean sendCopyOnReminder, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceStatusUiState status, java.lang.String customerName, java.lang.String amountDueFormatted, java.lang.String tipAmountFormatted, boolean tipsAllowed, java.lang.String amountPaidFormatted, java.lang.String refundedFormatted, java.lang.String paidAfterRefundFormatted, java.lang.String invoiceDate, java.lang.String dueDate, java.lang.String subtotalFormatted, java.lang.String itemsDiscountFormatted, java.lang.String invoiceDiscountFormatted, java.lang.String shippingFeeFormatted, java.lang.String taxAmountFormatted, java.lang.String totalAmountFormatted, java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> items, java.lang.String note, java.lang.String customerEmail, java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientPhoneNumber> customerPhones, java.lang.String customerPhoneFormatted, java.lang.String shareUrl, java.util.List<? extends com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.invoiceaction.InvoiceAction> actions, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Rule autoCancelRule, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Rule earlyPaymentDiscountRule, boolean isEarlyPaymentDiscountExpired) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountDueFormatted, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountPaidFormatted, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subtotalFormatted, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAmountFormatted, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customerPhones, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actions, "");
        return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState(id, invoiceNumber, isLoading, isSendingReminder, isCancelling, error, invoiceCancelled, cancelInvoiceAllowed, showCancelConfirmation, sendCopyOnCancel, sendReminderAllowed, showReminderConfirmation, sendCopyOnReminder, status, customerName, amountDueFormatted, tipAmountFormatted, tipsAllowed, amountPaidFormatted, refundedFormatted, paidAfterRefundFormatted, invoiceDate, dueDate, subtotalFormatted, itemsDiscountFormatted, invoiceDiscountFormatted, shippingFeeFormatted, taxAmountFormatted, totalAmountFormatted, items, note, customerEmail, customerPhones, customerPhoneFormatted, shareUrl, actions, autoCancelRule, earlyPaymentDiscountRule, isEarlyPaymentDiscountExpired);
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getShowCancelConfirmation() {
        return this.showCancelConfirmation;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getCancelInvoiceAllowed() {
        return this.cancelInvoiceAllowed;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getInvoiceCancelled() {
        return this.invoiceCancelled;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsError getError() {
        return this.error;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsCancelling() {
        return this.isCancelling;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsSendingReminder() {
        return this.isSendingReminder;
    }

    /* renamed from: component39, reason: from getter */
    public final boolean getIsEarlyPaymentDiscountExpired() {
        return this.isEarlyPaymentDiscountExpired;
    }

    /* renamed from: component38, reason: from getter */
    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Rule getEarlyPaymentDiscountRule() {
        return this.earlyPaymentDiscountRule;
    }

    /* renamed from: component37, reason: from getter */
    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Rule getAutoCancelRule() {
        return this.autoCancelRule;
    }

    public final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.invoiceaction.InvoiceAction> component36() {
        return this.actions;
    }

    /* renamed from: component35, reason: from getter */
    public final java.lang.String getShareUrl() {
        return this.shareUrl;
    }

    /* renamed from: component34, reason: from getter */
    public final java.lang.String getCustomerPhoneFormatted() {
        return this.customerPhoneFormatted;
    }

    public final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientPhoneNumber> component33() {
        return this.customerPhones;
    }

    /* renamed from: component32, reason: from getter */
    public final java.lang.String getCustomerEmail() {
        return this.customerEmail;
    }

    /* renamed from: component31, reason: from getter */
    public final java.lang.String getNote() {
        return this.note;
    }

    public final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> component30() {
        return this.items;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component29, reason: from getter */
    public final java.lang.String getTotalAmountFormatted() {
        return this.totalAmountFormatted;
    }

    /* renamed from: component28, reason: from getter */
    public final java.lang.String getTaxAmountFormatted() {
        return this.taxAmountFormatted;
    }

    /* renamed from: component27, reason: from getter */
    public final java.lang.String getShippingFeeFormatted() {
        return this.shippingFeeFormatted;
    }

    /* renamed from: component26, reason: from getter */
    public final java.lang.String getInvoiceDiscountFormatted() {
        return this.invoiceDiscountFormatted;
    }

    /* renamed from: component25, reason: from getter */
    public final java.lang.String getItemsDiscountFormatted() {
        return this.itemsDiscountFormatted;
    }

    /* renamed from: component24, reason: from getter */
    public final java.lang.String getSubtotalFormatted() {
        return this.subtotalFormatted;
    }

    /* renamed from: component23, reason: from getter */
    public final java.lang.String getDueDate() {
        return this.dueDate;
    }

    /* renamed from: component22, reason: from getter */
    public final java.lang.String getInvoiceDate() {
        return this.invoiceDate;
    }

    /* renamed from: component21, reason: from getter */
    public final java.lang.String getPaidAfterRefundFormatted() {
        return this.paidAfterRefundFormatted;
    }

    /* renamed from: component20, reason: from getter */
    public final java.lang.String getRefundedFormatted() {
        return this.refundedFormatted;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getInvoiceNumber() {
        return this.invoiceNumber;
    }

    /* renamed from: component19, reason: from getter */
    public final java.lang.String getAmountPaidFormatted() {
        return this.amountPaidFormatted;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getTipsAllowed() {
        return this.tipsAllowed;
    }

    /* renamed from: component17, reason: from getter */
    public final java.lang.String getTipAmountFormatted() {
        return this.tipAmountFormatted;
    }

    /* renamed from: component16, reason: from getter */
    public final java.lang.String getAmountDueFormatted() {
        return this.amountDueFormatted;
    }

    /* renamed from: component15, reason: from getter */
    public final java.lang.String getCustomerName() {
        return this.customerName;
    }

    /* renamed from: component14, reason: from getter */
    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceStatusUiState getStatus() {
        return this.status;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getSendCopyOnReminder() {
        return this.sendCopyOnReminder;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getShowReminderConfirmation() {
        return this.showReminderConfirmation;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getSendReminderAllowed() {
        return this.sendReminderAllowed;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getSendCopyOnCancel() {
        return this.sendCopyOnCancel;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public InvoiceManagementUiState() {
        this(null, null, false, false, false, null, false, false, false, false, false, false, false, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -1, 127, null);
    }
}
