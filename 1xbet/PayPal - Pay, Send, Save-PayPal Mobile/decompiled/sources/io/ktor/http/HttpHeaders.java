package io.ktor.http;

@kotlin.Metadata(d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0003\bÊ\u0001\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0086D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012R\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012R\u001a\u0010\u001d\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001e\u0010\u0012R\u001a\u0010\u001f\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b \u0010\u0012R\u001a\u0010!\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\b!\u0010\u0010\u001a\u0004\b\"\u0010\u0012R\u001a\u0010#\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\b#\u0010\u0010\u001a\u0004\b$\u0010\u0012R\u001a\u0010%\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\b%\u0010\u0010\u001a\u0004\b&\u0010\u0012R\u001a\u0010'\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\b'\u0010\u0010\u001a\u0004\b(\u0010\u0012R\u001a\u0010)\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\b)\u0010\u0010\u001a\u0004\b*\u0010\u0012R\u001a\u0010+\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\b+\u0010\u0010\u001a\u0004\b,\u0010\u0012R\u001a\u0010-\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\b-\u0010\u0010\u001a\u0004\b.\u0010\u0012R\u001a\u0010/\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\b/\u0010\u0010\u001a\u0004\b0\u0010\u0012R\u001a\u00101\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\b1\u0010\u0010\u001a\u0004\b2\u0010\u0012R\u001a\u00103\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\b3\u0010\u0010\u001a\u0004\b4\u0010\u0012R\u001a\u00105\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\b5\u0010\u0010\u001a\u0004\b6\u0010\u0012R\u001a\u00107\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\b7\u0010\u0010\u001a\u0004\b8\u0010\u0012R\u001a\u00109\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\b9\u0010\u0010\u001a\u0004\b:\u0010\u0012R\u001a\u0010;\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\b;\u0010\u0010\u001a\u0004\b<\u0010\u0012R\u001a\u0010=\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\b=\u0010\u0010\u001a\u0004\b>\u0010\u0012R\u001a\u0010?\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\b?\u0010\u0010\u001a\u0004\b@\u0010\u0012R\u001a\u0010A\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\bA\u0010\u0010\u001a\u0004\bB\u0010\u0012R\u001a\u0010C\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\bC\u0010\u0010\u001a\u0004\bD\u0010\u0012R\u001a\u0010E\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\bE\u0010\u0010\u001a\u0004\bF\u0010\u0012R\u001a\u0010G\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\bG\u0010\u0010\u001a\u0004\bH\u0010\u0012R\u001a\u0010I\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\bI\u0010\u0010\u001a\u0004\bJ\u0010\u0012R\u001a\u0010K\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\bK\u0010\u0010\u001a\u0004\bL\u0010\u0012R\u001a\u0010M\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\bM\u0010\u0010\u001a\u0004\bN\u0010\u0012R\u001a\u0010O\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\bO\u0010\u0010\u001a\u0004\bP\u0010\u0012R\u001a\u0010Q\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\bQ\u0010\u0010\u001a\u0004\bR\u0010\u0012R\u001a\u0010S\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\bS\u0010\u0010\u001a\u0004\bT\u0010\u0012R\u001a\u0010U\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\bU\u0010\u0010\u001a\u0004\bV\u0010\u0012R\u001a\u0010W\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\bW\u0010\u0010\u001a\u0004\bX\u0010\u0012R\u001a\u0010Y\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\bY\u0010\u0010\u001a\u0004\bZ\u0010\u0012R\u001a\u0010[\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\b[\u0010\u0010\u001a\u0004\b\\\u0010\u0012R\u001a\u0010]\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\b]\u0010\u0010\u001a\u0004\b^\u0010\u0012R\u001a\u0010_\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\b_\u0010\u0010\u001a\u0004\b`\u0010\u0012R\u001a\u0010a\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\ba\u0010\u0010\u001a\u0004\bb\u0010\u0012R\u001a\u0010c\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\bc\u0010\u0010\u001a\u0004\bd\u0010\u0012R\u001a\u0010e\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\be\u0010\u0010\u001a\u0004\bf\u0010\u0012R\u001a\u0010g\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\bg\u0010\u0010\u001a\u0004\bh\u0010\u0012R\u001a\u0010i\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\bi\u0010\u0010\u001a\u0004\bj\u0010\u0012R\u001a\u0010k\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\bk\u0010\u0010\u001a\u0004\bl\u0010\u0012R\u001a\u0010m\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\bm\u0010\u0010\u001a\u0004\bn\u0010\u0012R\u001a\u0010o\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\bo\u0010\u0010\u001a\u0004\bp\u0010\u0012R\u001a\u0010q\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\bq\u0010\u0010\u001a\u0004\br\u0010\u0012R\u001a\u0010s\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\bs\u0010\u0010\u001a\u0004\bt\u0010\u0012R\u001a\u0010u\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\bu\u0010\u0010\u001a\u0004\bv\u0010\u0012R\u001a\u0010w\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\bw\u0010\u0010\u001a\u0004\bx\u0010\u0012R\u001a\u0010y\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\by\u0010\u0010\u001a\u0004\bz\u0010\u0012R\u001a\u0010{\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\b{\u0010\u0010\u001a\u0004\b|\u0010\u0012R\u001a\u0010}\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\b}\u0010\u0010\u001a\u0004\b~\u0010\u0012R\u001b\u0010\u007f\u001a\u00020\u00048\u0007X\u0087D¢\u0006\r\n\u0004\b\u007f\u0010\u0010\u001a\u0005\b\u0080\u0001\u0010\u0012R\u001d\u0010\u0081\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010\u0010\u001a\u0005\b\u0082\u0001\u0010\u0012R\u001d\u0010\u0083\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010\u0010\u001a\u0005\b\u0084\u0001\u0010\u0012R\u001d\u0010\u0085\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010\u0010\u001a\u0005\b\u0086\u0001\u0010\u0012R\u001d\u0010\u0087\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010\u0010\u001a\u0005\b\u0088\u0001\u0010\u0012R\u001d\u0010\u0089\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010\u0010\u001a\u0005\b\u008a\u0001\u0010\u0012R\u001d\u0010\u008b\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010\u0010\u001a\u0005\b\u008c\u0001\u0010\u0012R\u001d\u0010\u008d\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010\u0010\u001a\u0005\b\u008e\u0001\u0010\u0012R\u001d\u0010\u008f\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010\u0010\u001a\u0005\b\u0090\u0001\u0010\u0012R\u001d\u0010\u0091\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010\u0010\u001a\u0005\b\u0092\u0001\u0010\u0012R\u001d\u0010\u0093\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010\u0010\u001a\u0005\b\u0094\u0001\u0010\u0012R\u001d\u0010\u0095\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010\u0010\u001a\u0005\b\u0096\u0001\u0010\u0012R\u001d\u0010\u0097\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010\u0010\u001a\u0005\b\u0098\u0001\u0010\u0012R\u001d\u0010\u0099\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\b\u0099\u0001\u0010\u0010\u001a\u0005\b\u009a\u0001\u0010\u0012R\u001d\u0010\u009b\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010\u0010\u001a\u0005\b\u009c\u0001\u0010\u0012R\u001d\u0010\u009d\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010\u0010\u001a\u0005\b\u009e\u0001\u0010\u0012R\u001d\u0010\u009f\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010\u0010\u001a\u0005\b \u0001\u0010\u0012R\u001d\u0010¡\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\b¡\u0001\u0010\u0010\u001a\u0005\b¢\u0001\u0010\u0012R\u001d\u0010£\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\b£\u0001\u0010\u0010\u001a\u0005\b¤\u0001\u0010\u0012R\u001d\u0010¥\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\b¥\u0001\u0010\u0010\u001a\u0005\b¦\u0001\u0010\u0012R\u001d\u0010§\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\b§\u0001\u0010\u0010\u001a\u0005\b¨\u0001\u0010\u0012R\u001d\u0010©\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\b©\u0001\u0010\u0010\u001a\u0005\bª\u0001\u0010\u0012R\u001d\u0010«\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\b«\u0001\u0010\u0010\u001a\u0005\b¬\u0001\u0010\u0012R\u001d\u0010\u00ad\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\b\u00ad\u0001\u0010\u0010\u001a\u0005\b®\u0001\u0010\u0012R\u001d\u0010¯\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\b¯\u0001\u0010\u0010\u001a\u0005\b°\u0001\u0010\u0012R\u001d\u0010±\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\b±\u0001\u0010\u0010\u001a\u0005\b²\u0001\u0010\u0012R\u001d\u0010³\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\b³\u0001\u0010\u0010\u001a\u0005\b´\u0001\u0010\u0012R\u001d\u0010µ\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\bµ\u0001\u0010\u0010\u001a\u0005\b¶\u0001\u0010\u0012R\u001d\u0010·\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\b·\u0001\u0010\u0010\u001a\u0005\b¸\u0001\u0010\u0012R\u001d\u0010¹\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\b¹\u0001\u0010\u0010\u001a\u0005\bº\u0001\u0010\u0012R\u001d\u0010»\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\b»\u0001\u0010\u0010\u001a\u0005\b¼\u0001\u0010\u0012R\u001d\u0010½\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\b½\u0001\u0010\u0010\u001a\u0005\b¾\u0001\u0010\u0012R\u001d\u0010¿\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\b¿\u0001\u0010\u0010\u001a\u0005\bÀ\u0001\u0010\u0012R\u001d\u0010Á\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\bÁ\u0001\u0010\u0010\u001a\u0005\bÂ\u0001\u0010\u0012R\u001d\u0010Ã\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\bÃ\u0001\u0010\u0010\u001a\u0005\bÄ\u0001\u0010\u0012R\u001d\u0010Å\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\bÅ\u0001\u0010\u0010\u001a\u0005\bÆ\u0001\u0010\u0012R\u001d\u0010Ç\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\bÇ\u0001\u0010\u0010\u001a\u0005\bÈ\u0001\u0010\u0012R\u001d\u0010É\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\bÉ\u0001\u0010\u0010\u001a\u0005\bÊ\u0001\u0010\u0012R\u001d\u0010Ë\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\bË\u0001\u0010\u0010\u001a\u0005\bÌ\u0001\u0010\u0012R\u001d\u0010Í\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\bÍ\u0001\u0010\u0010\u001a\u0005\bÎ\u0001\u0010\u0012R\u001d\u0010Ï\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\bÏ\u0001\u0010\u0010\u001a\u0005\bÐ\u0001\u0010\u0012R\u001d\u0010Ñ\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\bÑ\u0001\u0010\u0010\u001a\u0005\bÒ\u0001\u0010\u0012R\u001d\u0010Ó\u0001\u001a\u00020\u00048\u0007X\u0087D¢\u0006\u000e\n\u0005\bÓ\u0001\u0010\u0010\u001a\u0005\bÔ\u0001\u0010\u0012R\u001e\u0010Ø\u0001\u001a\t\u0012\u0004\u0012\u00020\u00040Õ\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\bÖ\u0001\u0010×\u0001R%\u0010Ü\u0001\u001a\t\u0012\u0004\u0012\u00020\u00040Õ\u00018GX\u0087\u0004¢\u0006\u000f\u0012\u0005\bÛ\u0001\u0010\u0003\u001a\u0006\bÙ\u0001\u0010Ú\u0001R&\u0010Þ\u0001\u001a\t\u0012\u0004\u0012\u00020\u00040Ý\u00018\u0007X\u0087\u0004¢\u0006\u0010\n\u0006\bÞ\u0001\u0010ß\u0001\u001a\u0006\bà\u0001\u0010á\u0001"}, d2 = {"Lio/ktor/http/HttpHeaders;", "", "<init>", "()V", "", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, "", "isUnsafe", "(Ljava/lang/String;)Z", "name", "", "checkHeaderName", "(Ljava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "checkHeaderValue", "Accept", "Ljava/lang/String;", "getAccept", "()Ljava/lang/String;", "AcceptCharset", "getAcceptCharset", "AcceptEncoding", "getAcceptEncoding", "AcceptLanguage", "getAcceptLanguage", "AcceptRanges", "getAcceptRanges", "Age", "getAge", com.google.common.net.HttpHeaders.ALLOW, "getAllow", "ALPN", "getALPN", "AuthenticationInfo", "getAuthenticationInfo", "Authorization", "getAuthorization", "CacheControl", "getCacheControl", com.google.common.net.HttpHeaders.CONNECTION, "getConnection", "ContentDisposition", "getContentDisposition", "ContentEncoding", "getContentEncoding", "ContentLanguage", "getContentLanguage", "ContentLength", "getContentLength", "ContentLocation", "getContentLocation", "ContentRange", "getContentRange", "ContentType", "getContentType", "Cookie", "getCookie", "DASL", "getDASL", com.google.common.net.HttpHeaders.DATE, "getDate", "DAV", "getDAV", "Depth", "getDepth", "Destination", "getDestination", "ETag", "getETag", com.google.common.net.HttpHeaders.EXPECT, "getExpect", com.google.common.net.HttpHeaders.EXPIRES, "getExpires", com.google.common.net.HttpHeaders.FROM, "getFrom", com.google.common.net.HttpHeaders.FORWARDED, "getForwarded", com.google.common.net.HttpHeaders.HOST, "getHost", "HTTP2Settings", "getHTTP2Settings", "If", "getIf", "IfMatch", "getIfMatch", "IfModifiedSince", "getIfModifiedSince", "IfNoneMatch", "getIfNoneMatch", "IfRange", "getIfRange", "IfScheduleTagMatch", "getIfScheduleTagMatch", "IfUnmodifiedSince", "getIfUnmodifiedSince", "LastModified", "getLastModified", "Location", "getLocation", "LockToken", "getLockToken", com.google.common.net.HttpHeaders.LINK, "getLink", "MaxForwards", "getMaxForwards", "MIMEVersion", "getMIMEVersion", "OrderingType", "getOrderingType", com.google.common.net.HttpHeaders.ORIGIN, "getOrigin", "Overwrite", "getOverwrite", "Position", "getPosition", com.google.common.net.HttpHeaders.PRAGMA, "getPragma", "Prefer", "getPrefer", "PreferenceApplied", "getPreferenceApplied", "ProxyAuthenticate", "getProxyAuthenticate", "ProxyAuthenticationInfo", "getProxyAuthenticationInfo", "ProxyAuthorization", "getProxyAuthorization", "PublicKeyPins", "getPublicKeyPins", "PublicKeyPinsReportOnly", "getPublicKeyPinsReportOnly", com.google.common.net.HttpHeaders.RANGE, "getRange", "Referrer", "getReferrer", "RetryAfter", "getRetryAfter", "ScheduleReply", "getScheduleReply", "ScheduleTag", "getScheduleTag", "SecWebSocketAccept", "getSecWebSocketAccept", "SecWebSocketExtensions", "getSecWebSocketExtensions", "SecWebSocketKey", "getSecWebSocketKey", "SecWebSocketProtocol", "getSecWebSocketProtocol", "SecWebSocketVersion", "getSecWebSocketVersion", com.google.common.net.HttpHeaders.SERVER, "getServer", "SetCookie", "getSetCookie", "SLUG", "getSLUG", "StrictTransportSecurity", "getStrictTransportSecurity", com.google.common.net.HttpHeaders.TE, "getTE", "Timeout", "getTimeout", com.google.common.net.HttpHeaders.TRAILER, "getTrailer", "TransferEncoding", "getTransferEncoding", com.google.common.net.HttpHeaders.UPGRADE, "getUpgrade", "UserAgent", "getUserAgent", com.google.common.net.HttpHeaders.VARY, "getVary", com.google.common.net.HttpHeaders.VIA, "getVia", com.google.common.net.HttpHeaders.WARNING, "getWarning", "WWWAuthenticate", "getWWWAuthenticate", "AccessControlAllowOrigin", "getAccessControlAllowOrigin", "AccessControlAllowMethods", "getAccessControlAllowMethods", "AccessControlAllowCredentials", "getAccessControlAllowCredentials", "AccessControlAllowHeaders", "getAccessControlAllowHeaders", "AccessControlRequestMethod", "getAccessControlRequestMethod", "AccessControlRequestHeaders", "getAccessControlRequestHeaders", "AccessControlExposeHeaders", "getAccessControlExposeHeaders", "AccessControlMaxAge", "getAccessControlMaxAge", "XHttpMethodOverride", "getXHttpMethodOverride", "XForwardedHost", "getXForwardedHost", "XForwardedServer", "getXForwardedServer", "XForwardedProto", "getXForwardedProto", "XForwardedFor", "getXForwardedFor", "XForwardedPort", "getXForwardedPort", "XRequestId", "getXRequestId", "XCorrelationId", "getXCorrelationId", "XTotalCount", "getXTotalCount", "", "getHighSpeedVideoFpsRanges", "[Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "getUnsafeHeaders", "()[Ljava/lang/String;", "getUnsafeHeaders$annotations", "UnsafeHeaders", "", "UnsafeHeadersList", "Ljava/util/List;", "getUnsafeHeadersList", "()Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HttpHeaders {
    private static final java.util.List<java.lang.String> UnsafeHeadersList;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final java.lang.String[] getHighResolutionOutputSizeshNQ4ISI;
    public static final io.ktor.http.HttpHeaders INSTANCE = new io.ktor.http.HttpHeaders();
    private static final java.lang.String Accept = "Accept";
    private static final java.lang.String AcceptCharset = com.google.common.net.HttpHeaders.ACCEPT_CHARSET;
    private static final java.lang.String AcceptEncoding = com.google.common.net.HttpHeaders.ACCEPT_ENCODING;
    private static final java.lang.String AcceptLanguage = "Accept-Language";
    private static final java.lang.String AcceptRanges = "Accept-Ranges";
    private static final java.lang.String Age = "Age";
    private static final java.lang.String Allow = com.google.common.net.HttpHeaders.ALLOW;
    private static final java.lang.String ALPN = "ALPN";
    private static final java.lang.String AuthenticationInfo = "Authentication-Info";
    private static final java.lang.String Authorization = "Authorization";
    private static final java.lang.String CacheControl = "Cache-Control";
    private static final java.lang.String Connection = com.google.common.net.HttpHeaders.CONNECTION;
    private static final java.lang.String ContentDisposition = "Content-Disposition";
    private static final java.lang.String ContentEncoding = "Content-Encoding";
    private static final java.lang.String ContentLanguage = com.google.common.net.HttpHeaders.CONTENT_LANGUAGE;
    private static final java.lang.String ContentLength = "Content-Length";
    private static final java.lang.String ContentLocation = com.google.common.net.HttpHeaders.CONTENT_LOCATION;
    private static final java.lang.String ContentRange = "Content-Range";
    private static final java.lang.String ContentType = "Content-Type";
    private static final java.lang.String Cookie = "Cookie";
    private static final java.lang.String DASL = "DASL";
    private static final java.lang.String Date = com.google.common.net.HttpHeaders.DATE;
    private static final java.lang.String DAV = "DAV";
    private static final java.lang.String Depth = "Depth";
    private static final java.lang.String Destination = "Destination";
    private static final java.lang.String ETag = "ETag";
    private static final java.lang.String Expect = com.google.common.net.HttpHeaders.EXPECT;
    private static final java.lang.String Expires = com.google.common.net.HttpHeaders.EXPIRES;
    private static final java.lang.String From = com.google.common.net.HttpHeaders.FROM;
    private static final java.lang.String Forwarded = com.google.common.net.HttpHeaders.FORWARDED;
    private static final java.lang.String Host = com.google.common.net.HttpHeaders.HOST;
    private static final java.lang.String HTTP2Settings = com.google.common.net.HttpHeaders.HTTP2_SETTINGS;
    private static final java.lang.String If = "If";
    private static final java.lang.String IfMatch = com.google.common.net.HttpHeaders.IF_MATCH;
    private static final java.lang.String IfModifiedSince = "If-Modified-Since";
    private static final java.lang.String IfNoneMatch = "If-None-Match";
    private static final java.lang.String IfRange = com.google.common.net.HttpHeaders.IF_RANGE;
    private static final java.lang.String IfScheduleTagMatch = "If-Schedule-Tag-Match";
    private static final java.lang.String IfUnmodifiedSince = com.google.common.net.HttpHeaders.IF_UNMODIFIED_SINCE;
    private static final java.lang.String LastModified = "Last-Modified";
    private static final java.lang.String Location = "Location";
    private static final java.lang.String LockToken = "Lock-Token";
    private static final java.lang.String Link = com.google.common.net.HttpHeaders.LINK;
    private static final java.lang.String MaxForwards = com.google.common.net.HttpHeaders.MAX_FORWARDS;
    private static final java.lang.String MIMEVersion = "MIME-Version";
    private static final java.lang.String OrderingType = "Ordering-Type";
    private static final java.lang.String Origin = com.google.common.net.HttpHeaders.ORIGIN;
    private static final java.lang.String Overwrite = "Overwrite";
    private static final java.lang.String Position = "Position";
    private static final java.lang.String Pragma = com.google.common.net.HttpHeaders.PRAGMA;
    private static final java.lang.String Prefer = "Prefer";
    private static final java.lang.String PreferenceApplied = "Preference-Applied";
    private static final java.lang.String ProxyAuthenticate = com.google.common.net.HttpHeaders.PROXY_AUTHENTICATE;
    private static final java.lang.String ProxyAuthenticationInfo = "Proxy-Authentication-Info";
    private static final java.lang.String ProxyAuthorization = com.google.common.net.HttpHeaders.PROXY_AUTHORIZATION;
    private static final java.lang.String PublicKeyPins = com.google.common.net.HttpHeaders.PUBLIC_KEY_PINS;
    private static final java.lang.String PublicKeyPinsReportOnly = com.google.common.net.HttpHeaders.PUBLIC_KEY_PINS_REPORT_ONLY;
    private static final java.lang.String Range = com.google.common.net.HttpHeaders.RANGE;
    private static final java.lang.String Referrer = com.google.common.net.HttpHeaders.REFERER;
    private static final java.lang.String RetryAfter = "Retry-After";
    private static final java.lang.String ScheduleReply = "Schedule-Reply";
    private static final java.lang.String ScheduleTag = "Schedule-Tag";
    private static final java.lang.String SecWebSocketAccept = "Sec-WebSocket-Accept";
    private static final java.lang.String SecWebSocketExtensions = com.google.common.net.HttpHeaders.SEC_WEBSOCKET_EXTENSIONS;
    private static final java.lang.String SecWebSocketKey = com.google.common.net.HttpHeaders.SEC_WEBSOCKET_KEY;
    private static final java.lang.String SecWebSocketProtocol = com.google.common.net.HttpHeaders.SEC_WEBSOCKET_PROTOCOL;
    private static final java.lang.String SecWebSocketVersion = com.google.common.net.HttpHeaders.SEC_WEBSOCKET_VERSION;
    private static final java.lang.String Server = com.google.common.net.HttpHeaders.SERVER;
    private static final java.lang.String SetCookie = "Set-Cookie";
    private static final java.lang.String SLUG = "SLUG";
    private static final java.lang.String StrictTransportSecurity = com.google.common.net.HttpHeaders.STRICT_TRANSPORT_SECURITY;
    private static final java.lang.String TE = com.google.common.net.HttpHeaders.TE;
    private static final java.lang.String Timeout = "Timeout";
    private static final java.lang.String Trailer = com.google.common.net.HttpHeaders.TRAILER;
    private static final java.lang.String TransferEncoding = com.google.common.net.HttpHeaders.TRANSFER_ENCODING;
    private static final java.lang.String Upgrade = com.google.common.net.HttpHeaders.UPGRADE;
    private static final java.lang.String UserAgent = "User-Agent";
    private static final java.lang.String Vary = com.google.common.net.HttpHeaders.VARY;
    private static final java.lang.String Via = com.google.common.net.HttpHeaders.VIA;
    private static final java.lang.String Warning = com.google.common.net.HttpHeaders.WARNING;
    private static final java.lang.String WWWAuthenticate = com.google.common.net.HttpHeaders.WWW_AUTHENTICATE;
    private static final java.lang.String AccessControlAllowOrigin = com.google.common.net.HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN;
    private static final java.lang.String AccessControlAllowMethods = com.google.common.net.HttpHeaders.ACCESS_CONTROL_ALLOW_METHODS;
    private static final java.lang.String AccessControlAllowCredentials = com.google.common.net.HttpHeaders.ACCESS_CONTROL_ALLOW_CREDENTIALS;
    private static final java.lang.String AccessControlAllowHeaders = com.google.common.net.HttpHeaders.ACCESS_CONTROL_ALLOW_HEADERS;
    private static final java.lang.String AccessControlRequestMethod = com.google.common.net.HttpHeaders.ACCESS_CONTROL_REQUEST_METHOD;
    private static final java.lang.String AccessControlRequestHeaders = com.google.common.net.HttpHeaders.ACCESS_CONTROL_REQUEST_HEADERS;
    private static final java.lang.String AccessControlExposeHeaders = com.google.common.net.HttpHeaders.ACCESS_CONTROL_EXPOSE_HEADERS;
    private static final java.lang.String AccessControlMaxAge = com.google.common.net.HttpHeaders.ACCESS_CONTROL_MAX_AGE;
    private static final java.lang.String XHttpMethodOverride = "X-Http-Method-Override";
    private static final java.lang.String XForwardedHost = com.google.common.net.HttpHeaders.X_FORWARDED_HOST;
    private static final java.lang.String XForwardedServer = "X-Forwarded-Server";
    private static final java.lang.String XForwardedProto = com.google.common.net.HttpHeaders.X_FORWARDED_PROTO;
    private static final java.lang.String XForwardedFor = com.google.common.net.HttpHeaders.X_FORWARDED_FOR;
    private static final java.lang.String XForwardedPort = com.google.common.net.HttpHeaders.X_FORWARDED_PORT;
    private static final java.lang.String XRequestId = com.google.common.net.HttpHeaders.X_REQUEST_ID;
    private static final java.lang.String XCorrelationId = "X-Correlation-ID";
    private static final java.lang.String XTotalCount = "X-Total-Count";

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use UnsafeHeadersList instead.", replaceWith = @kotlin.ReplaceWith(expression = "HttpHeaders.UnsafeHeadersList", imports = {}))
    public static /* synthetic */ void getUnsafeHeaders$annotations() {
    }

    private HttpHeaders() {
    }

    static {
        java.lang.String[] strArr = {com.google.common.net.HttpHeaders.TRANSFER_ENCODING, com.google.common.net.HttpHeaders.UPGRADE};
        getHighResolutionOutputSizeshNQ4ISI = strArr;
        UnsafeHeadersList = kotlin.collections.ArraysKt.asList(strArr);
    }

    public final java.lang.String getAccept() {
        return Accept;
    }

    public final java.lang.String getAcceptCharset() {
        return AcceptCharset;
    }

    public final java.lang.String getAcceptEncoding() {
        return AcceptEncoding;
    }

    public final java.lang.String getAcceptLanguage() {
        return AcceptLanguage;
    }

    public final java.lang.String getAcceptRanges() {
        return AcceptRanges;
    }

    public final java.lang.String getAge() {
        return Age;
    }

    public final java.lang.String getAllow() {
        return Allow;
    }

    public final java.lang.String getALPN() {
        return ALPN;
    }

    public final java.lang.String getAuthenticationInfo() {
        return AuthenticationInfo;
    }

    public final java.lang.String getAuthorization() {
        return Authorization;
    }

    public final java.lang.String getCacheControl() {
        return CacheControl;
    }

    public final java.lang.String getConnection() {
        return Connection;
    }

    public final java.lang.String getContentDisposition() {
        return ContentDisposition;
    }

    public final java.lang.String getContentEncoding() {
        return ContentEncoding;
    }

    public final java.lang.String getContentLanguage() {
        return ContentLanguage;
    }

    public final java.lang.String getContentLength() {
        return ContentLength;
    }

    public final java.lang.String getContentLocation() {
        return ContentLocation;
    }

    public final java.lang.String getContentRange() {
        return ContentRange;
    }

    public final java.lang.String getContentType() {
        return ContentType;
    }

    public final java.lang.String getCookie() {
        return Cookie;
    }

    public final java.lang.String getDASL() {
        return DASL;
    }

    public final java.lang.String getDate() {
        return Date;
    }

    public final java.lang.String getDAV() {
        return DAV;
    }

    public final java.lang.String getDepth() {
        return Depth;
    }

    public final java.lang.String getDestination() {
        return Destination;
    }

    public final java.lang.String getETag() {
        return ETag;
    }

    public final java.lang.String getExpect() {
        return Expect;
    }

    public final java.lang.String getExpires() {
        return Expires;
    }

    public final java.lang.String getFrom() {
        return From;
    }

    public final java.lang.String getForwarded() {
        return Forwarded;
    }

    public final java.lang.String getHost() {
        return Host;
    }

    public final java.lang.String getHTTP2Settings() {
        return HTTP2Settings;
    }

    public final java.lang.String getIf() {
        return If;
    }

    public final java.lang.String getIfMatch() {
        return IfMatch;
    }

    public final java.lang.String getIfModifiedSince() {
        return IfModifiedSince;
    }

    public final java.lang.String getIfNoneMatch() {
        return IfNoneMatch;
    }

    public final java.lang.String getIfRange() {
        return IfRange;
    }

    public final java.lang.String getIfScheduleTagMatch() {
        return IfScheduleTagMatch;
    }

    public final java.lang.String getIfUnmodifiedSince() {
        return IfUnmodifiedSince;
    }

    public final java.lang.String getLastModified() {
        return LastModified;
    }

    public final java.lang.String getLocation() {
        return Location;
    }

    public final java.lang.String getLockToken() {
        return LockToken;
    }

    public final java.lang.String getLink() {
        return Link;
    }

    public final java.lang.String getMaxForwards() {
        return MaxForwards;
    }

    public final java.lang.String getMIMEVersion() {
        return MIMEVersion;
    }

    public final java.lang.String getOrderingType() {
        return OrderingType;
    }

    public final java.lang.String getOrigin() {
        return Origin;
    }

    public final java.lang.String getOverwrite() {
        return Overwrite;
    }

    public final java.lang.String getPosition() {
        return Position;
    }

    public final java.lang.String getPragma() {
        return Pragma;
    }

    public final java.lang.String getPrefer() {
        return Prefer;
    }

    public final java.lang.String getPreferenceApplied() {
        return PreferenceApplied;
    }

    public final java.lang.String getProxyAuthenticate() {
        return ProxyAuthenticate;
    }

    public final java.lang.String getProxyAuthenticationInfo() {
        return ProxyAuthenticationInfo;
    }

    public final java.lang.String getProxyAuthorization() {
        return ProxyAuthorization;
    }

    public final java.lang.String getPublicKeyPins() {
        return PublicKeyPins;
    }

    public final java.lang.String getPublicKeyPinsReportOnly() {
        return PublicKeyPinsReportOnly;
    }

    public final java.lang.String getRange() {
        return Range;
    }

    public final java.lang.String getReferrer() {
        return Referrer;
    }

    public final java.lang.String getRetryAfter() {
        return RetryAfter;
    }

    public final java.lang.String getScheduleReply() {
        return ScheduleReply;
    }

    public final java.lang.String getScheduleTag() {
        return ScheduleTag;
    }

    public final java.lang.String getSecWebSocketAccept() {
        return SecWebSocketAccept;
    }

    public final java.lang.String getSecWebSocketExtensions() {
        return SecWebSocketExtensions;
    }

    public final java.lang.String getSecWebSocketKey() {
        return SecWebSocketKey;
    }

    public final java.lang.String getSecWebSocketProtocol() {
        return SecWebSocketProtocol;
    }

    public final java.lang.String getSecWebSocketVersion() {
        return SecWebSocketVersion;
    }

    public final java.lang.String getServer() {
        return Server;
    }

    public final java.lang.String getSetCookie() {
        return SetCookie;
    }

    public final java.lang.String getSLUG() {
        return SLUG;
    }

    public final java.lang.String getStrictTransportSecurity() {
        return StrictTransportSecurity;
    }

    public final java.lang.String getTE() {
        return TE;
    }

    public final java.lang.String getTimeout() {
        return Timeout;
    }

    public final java.lang.String getTrailer() {
        return Trailer;
    }

    public final java.lang.String getTransferEncoding() {
        return TransferEncoding;
    }

    public final java.lang.String getUpgrade() {
        return Upgrade;
    }

    public final java.lang.String getUserAgent() {
        return UserAgent;
    }

    public final java.lang.String getVary() {
        return Vary;
    }

    public final java.lang.String getVia() {
        return Via;
    }

    public final java.lang.String getWarning() {
        return Warning;
    }

    public final java.lang.String getWWWAuthenticate() {
        return WWWAuthenticate;
    }

    public final java.lang.String getAccessControlAllowOrigin() {
        return AccessControlAllowOrigin;
    }

    public final java.lang.String getAccessControlAllowMethods() {
        return AccessControlAllowMethods;
    }

    public final java.lang.String getAccessControlAllowCredentials() {
        return AccessControlAllowCredentials;
    }

    public final java.lang.String getAccessControlAllowHeaders() {
        return AccessControlAllowHeaders;
    }

    public final java.lang.String getAccessControlRequestMethod() {
        return AccessControlRequestMethod;
    }

    public final java.lang.String getAccessControlRequestHeaders() {
        return AccessControlRequestHeaders;
    }

    public final java.lang.String getAccessControlExposeHeaders() {
        return AccessControlExposeHeaders;
    }

    public final java.lang.String getAccessControlMaxAge() {
        return AccessControlMaxAge;
    }

    public final java.lang.String getXHttpMethodOverride() {
        return XHttpMethodOverride;
    }

    public final java.lang.String getXForwardedHost() {
        return XForwardedHost;
    }

    public final java.lang.String getXForwardedServer() {
        return XForwardedServer;
    }

    public final java.lang.String getXForwardedProto() {
        return XForwardedProto;
    }

    public final java.lang.String getXForwardedFor() {
        return XForwardedFor;
    }

    public final java.lang.String getXForwardedPort() {
        return XForwardedPort;
    }

    public final java.lang.String getXRequestId() {
        return XRequestId;
    }

    public final java.lang.String getXCorrelationId() {
        return XCorrelationId;
    }

    public final java.lang.String getXTotalCount() {
        return XTotalCount;
    }

    public final boolean isUnsafe(java.lang.String header) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(header, "");
        for (java.lang.String str : getHighResolutionOutputSizeshNQ4ISI) {
            if (kotlin.text.StringsKt.equals(str, header, true)) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String[] getUnsafeHeaders() {
        java.lang.String[] strArr = getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(strArr, strArr.length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
        return (java.lang.String[]) copyOf;
    }

    public final java.util.List<java.lang.String> getUnsafeHeadersList() {
        return UnsafeHeadersList;
    }

    public final void checkHeaderName(java.lang.String name2) {
        boolean contains$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        java.lang.String str = name2;
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (kotlin.jvm.internal.Intrinsics.compare((int) charAt, 32) > 0) {
                contains$default = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) "\"(),/:;<=>?@[\\]{}", charAt, false, 2, (java.lang.Object) null);
                if (!contains$default) {
                    i++;
                    i2++;
                }
            }
            throw new io.ktor.http.IllegalHeaderNameException(name2, i2);
        }
    }

    public final void checkHeaderValue(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        java.lang.String str = value;
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (kotlin.jvm.internal.Intrinsics.compare((int) charAt, 32) < 0 && charAt != '\t') {
                throw new io.ktor.http.IllegalHeaderValueException(value, i2);
            }
            i++;
            i2++;
        }
    }
}
