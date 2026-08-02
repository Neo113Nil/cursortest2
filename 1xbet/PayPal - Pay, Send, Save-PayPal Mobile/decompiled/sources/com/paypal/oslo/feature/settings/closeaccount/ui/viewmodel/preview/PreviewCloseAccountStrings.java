package com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.preview;

@kotlin.Metadata(d1 = {"\u0000\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0003\bÜ\u0001\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0019\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u001a\u0010\u001d\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u001a\u0010\u001f\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u001a\u0010#\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u001a\u0010%\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u001a\u0010'\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\bR\u001a\u0010)\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\bR\u001a\u0010+\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u001a\u0010-\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b.\u0010\bR\u001a\u0010/\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b/\u0010\u0006\u001a\u0004\b0\u0010\bR\u001a\u00101\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR\u001a\u00103\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\bR\u001a\u00105\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b5\u0010\u0006\u001a\u0004\b6\u0010\bR\u001a\u00107\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR\u001a\u00109\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b9\u0010\u0006\u001a\u0004\b:\u0010\bR\u001a\u0010;\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b;\u0010\u0006\u001a\u0004\b<\u0010\bR\u001a\u0010=\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b>\u0010\bR\u001a\u0010?\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\b@\u0010\bR\u001a\u0010A\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\bA\u0010\u0006\u001a\u0004\bB\u0010\bR\u001a\u0010C\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\bC\u0010\u0006\u001a\u0004\bD\u0010\bR\u001a\u0010E\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\bE\u0010\u0006\u001a\u0004\bF\u0010\bR\u001a\u0010G\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\bG\u0010\u0006\u001a\u0004\bH\u0010\bR\u001a\u0010I\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\bI\u0010\u0006\u001a\u0004\bJ\u0010\bR\u001a\u0010K\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\bK\u0010\u0006\u001a\u0004\bL\u0010\bR\u001a\u0010M\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\bM\u0010\u0006\u001a\u0004\bN\u0010\bR\u001a\u0010O\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\bO\u0010\u0006\u001a\u0004\bP\u0010\bR\u001a\u0010Q\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\bQ\u0010\u0006\u001a\u0004\bR\u0010\bR\u001a\u0010S\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\bS\u0010\u0006\u001a\u0004\bT\u0010\bR\u001a\u0010U\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\bU\u0010\u0006\u001a\u0004\bV\u0010\bR\u001a\u0010W\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\bW\u0010\u0006\u001a\u0004\bX\u0010\bR\u001a\u0010Y\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\bY\u0010\u0006\u001a\u0004\bZ\u0010\bR\u001a\u0010[\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b[\u0010\u0006\u001a\u0004\b\\\u0010\bR\u001a\u0010]\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b]\u0010\u0006\u001a\u0004\b^\u0010\bR\u001a\u0010_\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b_\u0010\u0006\u001a\u0004\b`\u0010\bR\u001a\u0010a\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\ba\u0010\u0006\u001a\u0004\bb\u0010\bR\u001a\u0010c\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\bc\u0010\u0006\u001a\u0004\bd\u0010\bR\u001a\u0010e\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\be\u0010\u0006\u001a\u0004\bf\u0010\bR\u001a\u0010g\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\bg\u0010\u0006\u001a\u0004\bh\u0010\bR\u001a\u0010i\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\bi\u0010\u0006\u001a\u0004\bj\u0010\bR\u001a\u0010k\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\bk\u0010\u0006\u001a\u0004\bl\u0010\bR\u001a\u0010m\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\bm\u0010\u0006\u001a\u0004\bn\u0010\bR\u001a\u0010o\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\bo\u0010\u0006\u001a\u0004\bp\u0010\bR\u001a\u0010q\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\bq\u0010\u0006\u001a\u0004\br\u0010\bR\u001a\u0010s\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\bs\u0010\u0006\u001a\u0004\bt\u0010\bR\u001a\u0010u\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\bu\u0010\u0006\u001a\u0004\bv\u0010\bR\u001a\u0010w\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\bw\u0010\u0006\u001a\u0004\bx\u0010\bR\u001a\u0010y\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\by\u0010\u0006\u001a\u0004\bz\u0010\bR\u001a\u0010{\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b{\u0010\u0006\u001a\u0004\b|\u0010\bR\u001a\u0010}\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b}\u0010\u0006\u001a\u0004\b~\u0010\bR\u001b\u0010\u007f\u001a\u00020\u00048\u0017X\u0097D¢\u0006\r\n\u0004\b\u007f\u0010\u0006\u001a\u0005\b\u0080\u0001\u0010\bR\u001d\u0010\u0081\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010\u0006\u001a\u0005\b\u0082\u0001\u0010\bR\u001d\u0010\u0083\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010\u0006\u001a\u0005\b\u0084\u0001\u0010\bR\u001d\u0010\u0085\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010\u0006\u001a\u0005\b\u0086\u0001\u0010\bR\u001d\u0010\u0087\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010\u0006\u001a\u0005\b\u0088\u0001\u0010\bR\u001d\u0010\u0089\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010\u0006\u001a\u0005\b\u008a\u0001\u0010\bR\u001d\u0010\u008b\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010\u0006\u001a\u0005\b\u008c\u0001\u0010\bR\u001d\u0010\u008d\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010\u0006\u001a\u0005\b\u008e\u0001\u0010\bR\u001d\u0010\u008f\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010\u0006\u001a\u0005\b\u0090\u0001\u0010\bR\u001d\u0010\u0091\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010\u0006\u001a\u0005\b\u0092\u0001\u0010\bR\u001d\u0010\u0093\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010\u0006\u001a\u0005\b\u0094\u0001\u0010\bR\u001d\u0010\u0095\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010\u0006\u001a\u0005\b\u0096\u0001\u0010\bR\u001d\u0010\u0097\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010\u0006\u001a\u0005\b\u0098\u0001\u0010\bR\u001d\u0010\u0099\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\b\u0099\u0001\u0010\u0006\u001a\u0005\b\u009a\u0001\u0010\bR\u001d\u0010\u009b\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010\u0006\u001a\u0005\b\u009c\u0001\u0010\bR\u001d\u0010\u009d\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010\u0006\u001a\u0005\b\u009e\u0001\u0010\bR\u001d\u0010\u009f\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010\u0006\u001a\u0005\b \u0001\u0010\bR\u001d\u0010¡\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\b¡\u0001\u0010\u0006\u001a\u0005\b¢\u0001\u0010\bR\u001d\u0010£\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\b£\u0001\u0010\u0006\u001a\u0005\b¤\u0001\u0010\bR\u001d\u0010¥\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\b¥\u0001\u0010\u0006\u001a\u0005\b¦\u0001\u0010\bR\u001d\u0010§\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\b§\u0001\u0010\u0006\u001a\u0005\b¨\u0001\u0010\bR\u001d\u0010©\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\b©\u0001\u0010\u0006\u001a\u0005\bª\u0001\u0010\bR\u001d\u0010«\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\b«\u0001\u0010\u0006\u001a\u0005\b¬\u0001\u0010\bR\u001d\u0010\u00ad\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\b\u00ad\u0001\u0010\u0006\u001a\u0005\b®\u0001\u0010\bR\u001d\u0010¯\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\b¯\u0001\u0010\u0006\u001a\u0005\b°\u0001\u0010\bR\u001d\u0010±\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\b±\u0001\u0010\u0006\u001a\u0005\b²\u0001\u0010\bR\u001d\u0010³\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\b³\u0001\u0010\u0006\u001a\u0005\b´\u0001\u0010\bR\u001d\u0010µ\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\bµ\u0001\u0010\u0006\u001a\u0005\b¶\u0001\u0010\bR\u001d\u0010·\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\b·\u0001\u0010\u0006\u001a\u0005\b¸\u0001\u0010\bR\u001d\u0010¹\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\b¹\u0001\u0010\u0006\u001a\u0005\bº\u0001\u0010\bR\u001d\u0010»\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\b»\u0001\u0010\u0006\u001a\u0005\b¼\u0001\u0010\bR\u001d\u0010½\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\b½\u0001\u0010\u0006\u001a\u0005\b¾\u0001\u0010\bR\u001d\u0010¿\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\b¿\u0001\u0010\u0006\u001a\u0005\bÀ\u0001\u0010\bR\u001d\u0010Á\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\bÁ\u0001\u0010\u0006\u001a\u0005\bÂ\u0001\u0010\bR\u001d\u0010Ã\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\bÃ\u0001\u0010\u0006\u001a\u0005\bÄ\u0001\u0010\bR\u001d\u0010Å\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\bÅ\u0001\u0010\u0006\u001a\u0005\bÆ\u0001\u0010\bR\u001d\u0010Ç\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\bÇ\u0001\u0010\u0006\u001a\u0005\bÈ\u0001\u0010\bR\u001d\u0010É\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\bÉ\u0001\u0010\u0006\u001a\u0005\bÊ\u0001\u0010\bR\u001d\u0010Ë\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\bË\u0001\u0010\u0006\u001a\u0005\bÌ\u0001\u0010\bR\u001d\u0010Í\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\bÍ\u0001\u0010\u0006\u001a\u0005\bÎ\u0001\u0010\bR\u001d\u0010Ï\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\bÏ\u0001\u0010\u0006\u001a\u0005\bÐ\u0001\u0010\bR\u001d\u0010Ñ\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\bÑ\u0001\u0010\u0006\u001a\u0005\bÒ\u0001\u0010\bR\u001d\u0010Ó\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\bÓ\u0001\u0010\u0006\u001a\u0005\bÔ\u0001\u0010\bR\u001d\u0010Õ\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\bÕ\u0001\u0010\u0006\u001a\u0005\bÖ\u0001\u0010\bR\u001d\u0010×\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\b×\u0001\u0010\u0006\u001a\u0005\bØ\u0001\u0010\bR\u001d\u0010Ù\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\bÙ\u0001\u0010\u0006\u001a\u0005\bÚ\u0001\u0010\bR\u001d\u0010Û\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\bÛ\u0001\u0010\u0006\u001a\u0005\bÜ\u0001\u0010\bR\u001d\u0010Ý\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\bÝ\u0001\u0010\u0006\u001a\u0005\bÞ\u0001\u0010\bR\u001d\u0010ß\u0001\u001a\u00020\u00048\u0017X\u0097D¢\u0006\u000e\n\u0005\bß\u0001\u0010\u0006\u001a\u0005\bà\u0001\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/viewmodel/preview/PreviewCloseAccountStrings;", "Lcom/paypal/oslo/feature/settings/domain/util/CloseAccountStrings;", "<init>", "()V", "", "continue", "Ljava/lang/String;", "getContinue", "()Ljava/lang/String;", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "getCancel", "confirm", "getConfirm", "closeAccount", "getCloseAccount", "l2EligibleBeforeClose", "getL2EligibleBeforeClose", "l2EligibleSendEmail", "getL2EligibleSendEmail", "l2EligiblePrimaryEmail", "getL2EligiblePrimaryEmail", "l2EligibleChangeEmail", "getL2EligibleChangeEmail", "l2EligibleWeCanHelp", "getL2EligibleWeCanHelp", "l2EligibleWeCanHelpReOpened", "getL2EligibleWeCanHelpReOpened", "l2EligibleOnceClosed", "getL2EligibleOnceClosed", "l2EligibleIfYouDeleteData", "getL2EligibleIfYouDeleteData", "l2EligibleYourFeedbackMatters", "getL2EligibleYourFeedbackMatters", "l2EligibleYourShareFeedback", "getL2EligibleYourShareFeedback", "l2IneligibleTitle", "getL2IneligibleTitle", "l2IneligibleWeWereUnableToClose", "getL2IneligibleWeWereUnableToClose", "l2IneligibleGenericErrorDesc", "getL2IneligibleGenericErrorDesc", "l2IneligibleDescription", "getL2IneligibleDescription", "l2IneligibleThingsToDo", "getL2IneligibleThingsToDo", "l2IneligiblePayOutstandingBalances", "getL2IneligiblePayOutstandingBalances", "l2IneligiblePayOutstandingAmount", "getL2IneligiblePayOutstandingAmount", "l2IneligibleClosePaypalCredit", "getL2IneligibleClosePaypalCredit", "l2IneligibleWaitPendingTransactions", "getL2IneligibleWaitPendingTransactions", "l2IneligibleTransferYourFunds", "getL2IneligibleTransferYourFunds", "l2IneligiblePayOffAnyOpenPaymentPlans", "getL2IneligiblePayOffAnyOpenPaymentPlans", "l2IneligibleResolveAccountLimitation", "getL2IneligibleResolveAccountLimitation", "l2IneligibleCloseAnyOpenPools", "getL2IneligibleCloseAnyOpenPools", "l2IneligibleTransferRemainingBalance", "getL2IneligibleTransferRemainingBalance", "l2IneligibleIfYouNeedHelp", "getL2IneligibleIfYouNeedHelp", "l2IneligibleBeforeYouCloseYourAccount", "getL2IneligibleBeforeYouCloseYourAccount", "l2IneligibleYouCanChangeYourEmail", "getL2IneligibleYouCanChangeYourEmail", "l2IneligibleSorryYouCannotCloseAccount", "getL2IneligibleSorryYouCannotCloseAccount", "l2IneligibleSorryYouCannotCloseAccountRecurringSub", "getL2IneligibleSorryYouCannotCloseAccountRecurringSub", "l2IneligibleThereChargeback", "getL2IneligibleThereChargeback", "l2IneligibleTherePreApprovedPayment", "getL2IneligibleTherePreApprovedPayment", "l2IneligibleYouHaveGiftCard", "getL2IneligibleYouHaveGiftCard", "l2IneligibleSomeoneSentYouPayment", "getL2IneligibleSomeoneSentYouPayment", "l2IneligiblePendingTransactionSubscription", "getL2IneligiblePendingTransactionSubscription", "l2IneligibleUnresolvedActions", "getL2IneligibleUnresolvedActions", "l2IneligibleTryAgainLater", "getL2IneligibleTryAgainLater", "l2IneligibleSorry", "getL2IneligibleSorry", "l2IneligibleAreYouSureClose", "getL2IneligibleAreYouSureClose", "l2IneligibleOnceYouClosePaypal", "getL2IneligibleOnceYouClosePaypal", "l2IneligibleShopPayOrReceive", "getL2IneligibleShopPayOrReceive", "l2IneligibleTakeAdvantage", "getL2IneligibleTakeAdvantage", "l2IneligibleViewYourTransaction", "getL2IneligibleViewYourTransaction", "l2IneligibleIfYouHaveScheduledIncomplete", "getL2IneligibleIfYouHaveScheduledIncomplete", "l2IneligibleIfYouLikeCloseAccountContact", "getL2IneligibleIfYouLikeCloseAccountContact", "l2IneligibleIfYouLikeCloseXoomAccount", "getL2IneligibleIfYouLikeCloseXoomAccount", "redeemYourPayPalRewardsPoints", "getRedeemYourPayPalRewardsPoints", "redeemYourPayPalRewardsPointsDescription", "getRedeemYourPayPalRewardsPointsDescription", "somethingThatNeedsToBeResolved", "getSomethingThatNeedsToBeResolved", "linkLetUsKnow", "getLinkLetUsKnow", "linkHelpCenter", "getLinkHelpCenter", "linkSettings", "getLinkSettings", "linkWallet", "getLinkWallet", "linkTransactions", "getLinkTransactions", "linkSubscriptions", "getLinkSubscriptions", "linkResolutionCenter", "getLinkResolutionCenter", "linkContactUs", "getLinkContactUs", "linkDeleteYourData", "getLinkDeleteYourData", "linkPassword", "getLinkPassword", "linkReviewYourLinkedBanks", "getLinkReviewYourLinkedBanks", "linkClosingYourXoomAccount", "getLinkClosingYourXoomAccount", "linkCloseYourAccount", "getLinkCloseYourAccount", "linkCustomerService", "getLinkCustomerService", "l3IneligiblePaymentTransferred", "getL3IneligiblePaymentTransferred", "l3IneligibleToReceivePayment", "getL3IneligibleToReceivePayment", "l3IneligiblePayDueAmount", "getL3IneligiblePayDueAmount", "l3IneligibleContactCustomerSer", "getL3IneligibleContactCustomerSer", "l3IneligibleHelpClosePaypalCredit", "getL3IneligibleHelpClosePaypalCredit", "l3IneligibleKeepPaypalCredit", "getL3IneligibleKeepPaypalCredit", "l2IneligibleBusinessHelpContactUs", "getL2IneligibleBusinessHelpContactUs", "l2IneligibleBusinessClosingAccount", "getL2IneligibleBusinessClosingAccount", "l2IneligibleBusinessNote", "getL2IneligibleBusinessNote", "l2IneligibleBusinessReasonOne", "getL2IneligibleBusinessReasonOne", "l2IneligibleBusinessReasonTwo", "getL2IneligibleBusinessReasonTwo", "l2IneligibleBusinessConfirmation", "getL2IneligibleBusinessConfirmation", "l2IneligibleBusinessContactUs", "getL2IneligibleBusinessContactUs", "l2IneligibleBusinessReasonTitle", "getL2IneligibleBusinessReasonTitle", "l2IneligibleBusinessDoYouCloseAccount", "getL2IneligibleBusinessDoYouCloseAccount", "l2IneligibleBusinessPlsEnterConcern", "getL2IneligibleBusinessPlsEnterConcern", "l2IneligibleBusinessComments", "getL2IneligibleBusinessComments", "l2IneligibleBusinessEnterComments", "getL2IneligibleBusinessEnterComments", "l2IneligibleBusinessChooseReasons", "getL2IneligibleBusinessChooseReasons", "l2EligibleBusinessTitle", "getL2EligibleBusinessTitle", "l2EligibleBusinessHelpCenterContactUs", "getL2EligibleBusinessHelpCenterContactUs", "l2EligibleBusinessClosingAccountFinal", "getL2EligibleBusinessClosingAccountFinal", "l2EligibleBusinessCheckProcessingNote", "getL2EligibleBusinessCheckProcessingNote", "l2EligibleBusinessNoteLabel", "getL2EligibleBusinessNoteLabel", "l2EligibleBusinessReasonTitle", "getL2EligibleBusinessReasonTitle", "l2EligibleBusinessReasonDescription", "getL2EligibleBusinessReasonDescription", "l2EligibleBusinessChooseReasons", "getL2EligibleBusinessChooseReasons", "l2EligibleBusinessReasonHaveAnotherAccount", "getL2EligibleBusinessReasonHaveAnotherAccount", "l2EligibleBusinessReasonDontUseAnymore", "getL2EligibleBusinessReasonDontUseAnymore", "l2EligibleBusinessReasonSwitchingService", "getL2EligibleBusinessReasonSwitchingService", "l2EligibleBusinessReasonPrivacyConcern", "getL2EligibleBusinessReasonPrivacyConcern", "l2EligibleBusinessReasonNotSatisfied", "getL2EligibleBusinessReasonNotSatisfied", "l2EligibleBusinessCommentsLabel", "getL2EligibleBusinessCommentsLabel", "l2EligibleBusinessCommentsDescription", "getL2EligibleBusinessCommentsDescription", "l2EligibleBusinessEnterComments", "getL2EligibleBusinessEnterComments", "l2EligibleBusinessDoYouWantToClose", "getL2EligibleBusinessDoYouWantToClose", "l2EligibleBusinessForgotPassword", "getL2EligibleBusinessForgotPassword", "l2EligibleBusinessContactUsTitle", "getL2EligibleBusinessContactUsTitle", "l2EligibleBusinessSatisfactionImportant", "getL2EligibleBusinessSatisfactionImportant", "l2EligibleBusinessPleaseContactUs", "getL2EligibleBusinessPleaseContactUs", "l2EligibleBusinessStillCloseConfirm", "getL2EligibleBusinessStillCloseConfirm", "l2EligibleBusinessErrorTitle", "getL2EligibleBusinessErrorTitle", "l2EligibleBusinessErrorMessage", "getL2EligibleBusinessErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PreviewCloseAccountStrings implements com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.preview.PreviewCloseAccountStrings INSTANCE = new com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.preview.PreviewCloseAccountStrings();
    private static final java.lang.String continue = "Continue";
    private static final java.lang.String cancel = com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_CANCEL;
    private static final java.lang.String confirm = "Confirm";
    private static final java.lang.String closeAccount = "Close Account";
    private static final java.lang.String l2EligibleBeforeClose = "Before you close your account";
    private static final java.lang.String l2EligibleSendEmail = "We'll send the final docs related to your account to your email address.";
    private static final java.lang.String l2EligiblePrimaryEmail = "Primary email";
    private static final java.lang.String l2EligibleChangeEmail = "You can change your primary email address in settings.";
    private static final java.lang.String l2EligibleWeCanHelp = "If there's anything we can help you with, please contact us.";
    private static final java.lang.String l2EligibleWeCanHelpReOpened = "If there's anything we can help you with, please contact us. Once it's closed, you won't be able to use this PayPal account or see your past transactions. It can't be re-opened.";
    private static final java.lang.String l2EligibleOnceClosed = "Once it's closed, you won't be able to use this PayPal account or see your past transactions. It can't be re-opened.";
    private static final java.lang.String l2EligibleIfYouDeleteData = "If you'd like, you could ask us to delete your data before closing the account.";
    private static final java.lang.String l2EligibleYourFeedbackMatters = "Your feedback matters. Tell us why you're closing your account.";
    private static final java.lang.String l2EligibleYourShareFeedback = "Share your feedback (optional)";
    private static final java.lang.String l2IneligibleTitle = "First, take care of open items";
    private static final java.lang.String l2IneligibleWeWereUnableToClose = "We were unable to close your PayPal account";
    private static final java.lang.String l2IneligibleGenericErrorDesc = "Here are the most common reasons that prevent account closure. Make sure that your account doesn't have any of the following before trying again:";
    private static final java.lang.String l2IneligibleDescription = "Once you're done, you can come back to close your PayPal account.";
    private static final java.lang.String l2IneligibleThingsToDo = "Things to do to close your account:";
    private static final java.lang.String l2IneligiblePayOutstandingBalances = "Pay outstanding balances";
    private static final java.lang.String l2IneligiblePayOutstandingAmount = "Pay outstanding amount";
    private static final java.lang.String l2IneligibleClosePaypalCredit = "Close PayPal Credit";
    private static final java.lang.String l2IneligibleWaitPendingTransactions = "Wait for pending transactions";
    private static final java.lang.String l2IneligibleTransferYourFunds = "Transfer your funds";
    private static final java.lang.String l2IneligiblePayOffAnyOpenPaymentPlans = "Pay off any open payment plans or loans.";
    private static final java.lang.String l2IneligibleResolveAccountLimitation = "Resolve account limitation";
    private static final java.lang.String l2IneligibleCloseAnyOpenPools = "Close any open pools";
    private static final java.lang.String l2IneligibleTransferRemainingBalance = "Transfer remaining balance in your pools";
    private static final java.lang.String l2IneligibleIfYouNeedHelp = "Let us know if you need help or have any questions.";
    private static final java.lang.String l2IneligibleBeforeYouCloseYourAccount = "Before you close your account";
    private static final java.lang.String l2IneligibleYouCanChangeYourEmail = "You can change your primary email address in settings.";
    private static final java.lang.String l2IneligibleSorryYouCannotCloseAccount = "Sorry, you cannot close your account";
    private static final java.lang.String l2IneligibleSorryYouCannotCloseAccountRecurringSub = "Sorry, you can't close this account while there is a recurring subscription associated with it.";
    private static final java.lang.String l2IneligibleThereChargeback = "There is a chargeback pending";
    private static final java.lang.String l2IneligibleTherePreApprovedPayment = "There is a pre-approved payment pending";
    private static final java.lang.String l2IneligibleYouHaveGiftCard = "You have a gift card balance";
    private static final java.lang.String l2IneligibleSomeoneSentYouPayment = "Someone sent you a payment";
    private static final java.lang.String l2IneligiblePendingTransactionSubscription = "Pending transactions or subscriptions";
    private static final java.lang.String l2IneligibleUnresolvedActions = "Unresolved actions in the Resolution Center";
    private static final java.lang.String l2IneligibleTryAgainLater = "We are not able to process your request.\nPlease try again later.";
    private static final java.lang.String l2IneligibleSorry = "Sorry";
    private static final java.lang.String l2IneligibleAreYouSureClose = "Are you sure you want to close your account?";
    private static final java.lang.String l2IneligibleOnceYouClosePaypal = "Once you close your PayPal account, you'll no longer be able to:";
    private static final java.lang.String l2IneligibleShopPayOrReceive = "Shop, pay, or receive money with PayPal";
    private static final java.lang.String l2IneligibleTakeAdvantage = "Take advantage of benefits like Direct Deposit and PayPal Debit Mastercard®";
    private static final java.lang.String l2IneligibleViewYourTransaction = "View your transaction history";
    private static final java.lang.String l2IneligibleIfYouHaveScheduledIncomplete = "Also, if you have scheduled or incomplete transactions, they'll be canceled. You won't be able to reopen this PayPal account.";
    private static final java.lang.String l2IneligibleIfYouLikeCloseAccountContact = "Learn more about how to close your account.";
    private static final java.lang.String l2IneligibleIfYouLikeCloseXoomAccount = "Learn more about closing your Xoom account";
    private static final java.lang.String redeemYourPayPalRewardsPoints = "Redeem your PayPal Rewards points";
    private static final java.lang.String redeemYourPayPalRewardsPointsDescription = "Redeem points for money in your PayPal balance or use points at PayPal online checkout when paying for a purchase.";
    private static final java.lang.String somethingThatNeedsToBeResolved = "There's something that needs to be resolved. Please contact customer service and we'll help you with it.";
    private static final java.lang.String linkLetUsKnow = "Let us know";
    private static final java.lang.String linkHelpCenter = "Help Center";
    private static final java.lang.String linkSettings = "settings";
    private static final java.lang.String linkWallet = "Wallet";
    private static final java.lang.String linkTransactions = "transactions";
    private static final java.lang.String linkSubscriptions = "subscriptions";
    private static final java.lang.String linkResolutionCenter = "Resolution Center";
    private static final java.lang.String linkContactUs = "contact us";
    private static final java.lang.String linkDeleteYourData = "delete your data";
    private static final java.lang.String linkPassword = "Password";
    private static final java.lang.String linkReviewYourLinkedBanks = "Review your linked banks";
    private static final java.lang.String linkClosingYourXoomAccount = "closing your Xoom account";
    private static final java.lang.String linkCloseYourAccount = "close your account";
    private static final java.lang.String linkCustomerService = "customer service";
    private static final java.lang.String l3IneligiblePaymentTransferred = "Payment transferred";
    private static final java.lang.String l3IneligibleToReceivePayment = "To receive payment";
    private static final java.lang.String l3IneligiblePayDueAmount = "Pay due amount";
    private static final java.lang.String l3IneligibleContactCustomerSer = "Contact customer service";
    private static final java.lang.String l3IneligibleHelpClosePaypalCredit = "Help close PayPal Credit";
    private static final java.lang.String l3IneligibleKeepPaypalCredit = "Keep PayPal Credit";
    private static final java.lang.String l2IneligibleBusinessHelpContactUs = "PayPal strives for complete customer satisfaction. If you're having problems with your account, please see our Help Center or Contact Us.";
    private static final java.lang.String l2IneligibleBusinessClosingAccount = "Closing your account is final and both your account history and reputation number will be lost.";
    private static final java.lang.String l2IneligibleBusinessNote = "Note: There is a check processing fee of $1.50 USD (or the equivalent amount if your balance is in another currency). If your balance is the equivalent of $1.50 USD or less, you will not receive a check.";
    private static final java.lang.String l2IneligibleBusinessReasonOne = "I have another PayPal account";
    private static final java.lang.String l2IneligibleBusinessReasonTwo = "I don't use PayPal anymore";
    private static final java.lang.String l2IneligibleBusinessConfirmation = "Do you want to close your account?";
    private static final java.lang.String l2IneligibleBusinessContactUs = com.paypal.oslo.feature.consumerprivacy.ui.compose.connectedApps.ConnectedAppsBannerKt.ContactUsLinkText;
    private static final java.lang.String l2IneligibleBusinessReasonTitle = "Reason for closing account";
    private static final java.lang.String l2IneligibleBusinessDoYouCloseAccount = "Do you want to close your account?";
    private static final java.lang.String l2IneligibleBusinessPlsEnterConcern = "Please enter thoughts or concerns about the PayPal service.";
    private static final java.lang.String l2IneligibleBusinessComments = "Comments";
    private static final java.lang.String l2IneligibleBusinessEnterComments = "Enter comments";
    private static final java.lang.String l2IneligibleBusinessChooseReasons = "Choose reasons (up to 3)";
    private static final java.lang.String l2EligibleBusinessTitle = "Close account";
    private static final java.lang.String l2EligibleBusinessHelpCenterContactUs = "PayPal strives for complete customer satisfaction. If you're having problems with your account, please see our Help Center or Contact Us.";
    private static final java.lang.String l2EligibleBusinessClosingAccountFinal = "Closing your account is final and both your account history and reputation number will be lost.";
    private static final java.lang.String l2EligibleBusinessCheckProcessingNote = "Note: There is a check processing fee of $1.50 USD (or the equivalent amount if your balance is in another currency). If your balance is the equivalent of $1.50 USD or less, you will not receive a check.";
    private static final java.lang.String l2EligibleBusinessNoteLabel = "Note:";
    private static final java.lang.String l2EligibleBusinessReasonTitle = "Reason for closing account";
    private static final java.lang.String l2EligibleBusinessReasonDescription = "We're sorry to see you go. Customer satisfaction is very important to us. The answers you provide here can make a difference in how we're able to improve our customers' experiences.";
    private static final java.lang.String l2EligibleBusinessChooseReasons = "Choose reasons (up to 3)";
    private static final java.lang.String l2EligibleBusinessReasonHaveAnotherAccount = "I have another PayPal account";
    private static final java.lang.String l2EligibleBusinessReasonDontUseAnymore = "I don't use PayPal anymore";
    private static final java.lang.String l2EligibleBusinessReasonSwitchingService = "I'm switching to another payment service";
    private static final java.lang.String l2EligibleBusinessReasonPrivacyConcern = "I'm concerned about my privacy";
    private static final java.lang.String l2EligibleBusinessReasonNotSatisfied = "I'm not satisfied with PayPal's services";
    private static final java.lang.String l2EligibleBusinessCommentsLabel = "Comments";
    private static final java.lang.String l2EligibleBusinessCommentsDescription = "Please enter thoughts or concerns about the PayPal service.";
    private static final java.lang.String l2EligibleBusinessEnterComments = "Enter comments";
    private static final java.lang.String l2EligibleBusinessDoYouWantToClose = "Do you want to close your account?";
    private static final java.lang.String l2EligibleBusinessForgotPassword = "Forgot your password? Recover your Password by entering any email address you have registered with your PayPal account. We will email instructions to reset your password to that address. If you no longer have access to any of the email addresses you added to your PayPal account, you will still be able to regain access to your account online.";
    private static final java.lang.String l2EligibleBusinessContactUsTitle = com.paypal.oslo.feature.consumerprivacy.ui.compose.connectedApps.ConnectedAppsBannerKt.ContactUsLinkText;
    private static final java.lang.String l2EligibleBusinessSatisfactionImportant = "Your satisfaction and continued use of our service is important to us.";
    private static final java.lang.String l2EligibleBusinessPleaseContactUs = "Please contact us to discuss and resolve any account concerns that you may have.";
    private static final java.lang.String l2EligibleBusinessStillCloseConfirm = "If you wish, you can still choose to close your account by clicking Confirm.";
    private static final java.lang.String l2EligibleBusinessErrorTitle = "Sorry";
    private static final java.lang.String l2EligibleBusinessErrorMessage = "We are not able to process your request.\nPlease try again later.";

    private PreviewCloseAccountStrings() {
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getContinue() {
        return continue;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getCancel() {
        return cancel;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getConfirm() {
        return confirm;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getCloseAccount() {
        return closeAccount;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2EligibleBeforeClose() {
        return l2EligibleBeforeClose;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2EligibleSendEmail() {
        return l2EligibleSendEmail;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2EligiblePrimaryEmail() {
        return l2EligiblePrimaryEmail;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2EligibleChangeEmail() {
        return l2EligibleChangeEmail;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2EligibleWeCanHelp() {
        return l2EligibleWeCanHelp;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2EligibleWeCanHelpReOpened() {
        return l2EligibleWeCanHelpReOpened;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2EligibleOnceClosed() {
        return l2EligibleOnceClosed;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2EligibleIfYouDeleteData() {
        return l2EligibleIfYouDeleteData;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2EligibleYourFeedbackMatters() {
        return l2EligibleYourFeedbackMatters;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2EligibleYourShareFeedback() {
        return l2EligibleYourShareFeedback;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleTitle() {
        return l2IneligibleTitle;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleWeWereUnableToClose() {
        return l2IneligibleWeWereUnableToClose;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleGenericErrorDesc() {
        return l2IneligibleGenericErrorDesc;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleDescription() {
        return l2IneligibleDescription;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleThingsToDo() {
        return l2IneligibleThingsToDo;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligiblePayOutstandingBalances() {
        return l2IneligiblePayOutstandingBalances;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligiblePayOutstandingAmount() {
        return l2IneligiblePayOutstandingAmount;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleClosePaypalCredit() {
        return l2IneligibleClosePaypalCredit;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleWaitPendingTransactions() {
        return l2IneligibleWaitPendingTransactions;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleTransferYourFunds() {
        return l2IneligibleTransferYourFunds;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligiblePayOffAnyOpenPaymentPlans() {
        return l2IneligiblePayOffAnyOpenPaymentPlans;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleResolveAccountLimitation() {
        return l2IneligibleResolveAccountLimitation;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleCloseAnyOpenPools() {
        return l2IneligibleCloseAnyOpenPools;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleTransferRemainingBalance() {
        return l2IneligibleTransferRemainingBalance;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleIfYouNeedHelp() {
        return l2IneligibleIfYouNeedHelp;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleBeforeYouCloseYourAccount() {
        return l2IneligibleBeforeYouCloseYourAccount;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleYouCanChangeYourEmail() {
        return l2IneligibleYouCanChangeYourEmail;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleSorryYouCannotCloseAccount() {
        return l2IneligibleSorryYouCannotCloseAccount;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleSorryYouCannotCloseAccountRecurringSub() {
        return l2IneligibleSorryYouCannotCloseAccountRecurringSub;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleThereChargeback() {
        return l2IneligibleThereChargeback;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleTherePreApprovedPayment() {
        return l2IneligibleTherePreApprovedPayment;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleYouHaveGiftCard() {
        return l2IneligibleYouHaveGiftCard;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleSomeoneSentYouPayment() {
        return l2IneligibleSomeoneSentYouPayment;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligiblePendingTransactionSubscription() {
        return l2IneligiblePendingTransactionSubscription;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleUnresolvedActions() {
        return l2IneligibleUnresolvedActions;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleTryAgainLater() {
        return l2IneligibleTryAgainLater;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleSorry() {
        return l2IneligibleSorry;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleAreYouSureClose() {
        return l2IneligibleAreYouSureClose;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleOnceYouClosePaypal() {
        return l2IneligibleOnceYouClosePaypal;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleShopPayOrReceive() {
        return l2IneligibleShopPayOrReceive;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleTakeAdvantage() {
        return l2IneligibleTakeAdvantage;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleViewYourTransaction() {
        return l2IneligibleViewYourTransaction;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleIfYouHaveScheduledIncomplete() {
        return l2IneligibleIfYouHaveScheduledIncomplete;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleIfYouLikeCloseAccountContact() {
        return l2IneligibleIfYouLikeCloseAccountContact;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleIfYouLikeCloseXoomAccount() {
        return l2IneligibleIfYouLikeCloseXoomAccount;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getRedeemYourPayPalRewardsPoints() {
        return redeemYourPayPalRewardsPoints;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getRedeemYourPayPalRewardsPointsDescription() {
        return redeemYourPayPalRewardsPointsDescription;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getSomethingThatNeedsToBeResolved() {
        return somethingThatNeedsToBeResolved;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getLinkLetUsKnow() {
        return linkLetUsKnow;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getLinkHelpCenter() {
        return linkHelpCenter;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getLinkSettings() {
        return linkSettings;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getLinkWallet() {
        return linkWallet;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getLinkTransactions() {
        return linkTransactions;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getLinkSubscriptions() {
        return linkSubscriptions;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getLinkResolutionCenter() {
        return linkResolutionCenter;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getLinkContactUs() {
        return linkContactUs;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getLinkDeleteYourData() {
        return linkDeleteYourData;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getLinkPassword() {
        return linkPassword;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getLinkReviewYourLinkedBanks() {
        return linkReviewYourLinkedBanks;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getLinkClosingYourXoomAccount() {
        return linkClosingYourXoomAccount;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getLinkCloseYourAccount() {
        return linkCloseYourAccount;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getLinkCustomerService() {
        return linkCustomerService;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL3IneligiblePaymentTransferred() {
        return l3IneligiblePaymentTransferred;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL3IneligibleToReceivePayment() {
        return l3IneligibleToReceivePayment;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL3IneligiblePayDueAmount() {
        return l3IneligiblePayDueAmount;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL3IneligibleContactCustomerSer() {
        return l3IneligibleContactCustomerSer;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL3IneligibleHelpClosePaypalCredit() {
        return l3IneligibleHelpClosePaypalCredit;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL3IneligibleKeepPaypalCredit() {
        return l3IneligibleKeepPaypalCredit;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleBusinessHelpContactUs() {
        return l2IneligibleBusinessHelpContactUs;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleBusinessClosingAccount() {
        return l2IneligibleBusinessClosingAccount;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleBusinessNote() {
        return l2IneligibleBusinessNote;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleBusinessReasonOne() {
        return l2IneligibleBusinessReasonOne;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleBusinessReasonTwo() {
        return l2IneligibleBusinessReasonTwo;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleBusinessConfirmation() {
        return l2IneligibleBusinessConfirmation;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleBusinessContactUs() {
        return l2IneligibleBusinessContactUs;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleBusinessReasonTitle() {
        return l2IneligibleBusinessReasonTitle;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleBusinessDoYouCloseAccount() {
        return l2IneligibleBusinessDoYouCloseAccount;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleBusinessPlsEnterConcern() {
        return l2IneligibleBusinessPlsEnterConcern;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleBusinessComments() {
        return l2IneligibleBusinessComments;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleBusinessEnterComments() {
        return l2IneligibleBusinessEnterComments;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2IneligibleBusinessChooseReasons() {
        return l2IneligibleBusinessChooseReasons;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2EligibleBusinessTitle() {
        return l2EligibleBusinessTitle;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2EligibleBusinessHelpCenterContactUs() {
        return l2EligibleBusinessHelpCenterContactUs;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2EligibleBusinessClosingAccountFinal() {
        return l2EligibleBusinessClosingAccountFinal;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2EligibleBusinessCheckProcessingNote() {
        return l2EligibleBusinessCheckProcessingNote;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2EligibleBusinessNoteLabel() {
        return l2EligibleBusinessNoteLabel;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2EligibleBusinessReasonTitle() {
        return l2EligibleBusinessReasonTitle;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2EligibleBusinessReasonDescription() {
        return l2EligibleBusinessReasonDescription;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2EligibleBusinessChooseReasons() {
        return l2EligibleBusinessChooseReasons;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2EligibleBusinessReasonHaveAnotherAccount() {
        return l2EligibleBusinessReasonHaveAnotherAccount;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2EligibleBusinessReasonDontUseAnymore() {
        return l2EligibleBusinessReasonDontUseAnymore;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2EligibleBusinessReasonSwitchingService() {
        return l2EligibleBusinessReasonSwitchingService;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2EligibleBusinessReasonPrivacyConcern() {
        return l2EligibleBusinessReasonPrivacyConcern;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2EligibleBusinessReasonNotSatisfied() {
        return l2EligibleBusinessReasonNotSatisfied;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2EligibleBusinessCommentsLabel() {
        return l2EligibleBusinessCommentsLabel;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2EligibleBusinessCommentsDescription() {
        return l2EligibleBusinessCommentsDescription;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2EligibleBusinessEnterComments() {
        return l2EligibleBusinessEnterComments;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2EligibleBusinessDoYouWantToClose() {
        return l2EligibleBusinessDoYouWantToClose;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2EligibleBusinessForgotPassword() {
        return l2EligibleBusinessForgotPassword;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2EligibleBusinessContactUsTitle() {
        return l2EligibleBusinessContactUsTitle;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2EligibleBusinessSatisfactionImportant() {
        return l2EligibleBusinessSatisfactionImportant;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2EligibleBusinessPleaseContactUs() {
        return l2EligibleBusinessPleaseContactUs;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2EligibleBusinessStillCloseConfirm() {
        return l2EligibleBusinessStillCloseConfirm;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2EligibleBusinessErrorTitle() {
        return l2EligibleBusinessErrorTitle;
    }

    @Override // com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings
    public final java.lang.String getL2EligibleBusinessErrorMessage() {
        return l2EligibleBusinessErrorMessage;
    }
}
