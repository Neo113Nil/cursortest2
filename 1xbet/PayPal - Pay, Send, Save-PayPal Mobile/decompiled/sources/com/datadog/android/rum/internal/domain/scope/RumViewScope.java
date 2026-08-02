package com.datadog.android.rum.internal.domain.scope;

@kotlin.Metadata(d1 = {"\u0000\u008c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b1\b\u0010\u0018\u0000 ë\u00012\u00020\u0001:\u0002ë\u0001Bë\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\u0006\u0010&\u001a\u00020%\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\u0006\u0010*\u001a\u00020)\u0012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0+\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103JQ\u0010?\u001a\u00020:2\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u0002062\"\u0010<\u001a\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020:08\u0012\u0004\u0012\u00020:08j\u0002`;2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\r0=H\u0002¢\u0006\u0004\b?\u0010@J\u001d\u0010A\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bH\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bD\u0010EJS\u0010J\u001a\u0004\u0018\u00010\u00012\u0006\u0010F\u001a\u0002042\u0006\u0010G\u001a\u0002062\"\u0010H\u001a\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020:08\u0012\u0004\u0012\u00020:08j\u0002`;2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\r0=H\u0016¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u001bH\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u001bH\u0002¢\u0006\u0004\bN\u0010MJ\u0017\u0010P\u001a\u00020\u00002\u0006\u0010O\u001a\u00020\tH\u0000¢\u0006\u0004\bP\u0010QJ\u0017\u0010R\u001a\u00020:2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\bR\u0010SJ\u000f\u0010R\u001a\u00020:H\u0002¢\u0006\u0004\bR\u0010TJ[\u0010W\u001a\u00020:2\u0006\u0010F\u001a\u0002042\u0006\u0010G\u001a\u0002062\"\u0010H\u001a\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020:08\u0012\u0004\u0012\u00020:08j\u0002`;2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\r0=2\b\b\u0002\u0010V\u001a\u00020UH\u0000¢\u0006\u0004\bW\u0010XJ_\u0010?\u001a\u00020:2\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u0002062\"\u0010<\u001a\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020:08\u0012\u0004\u0012\u00020:08j\u0002`;2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\r0=2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020:0YH\u0002¢\u0006\u0004\b?\u0010[R\u0014\u0010?\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010`\u001a\u00020^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010_R$\u0010a\u001a\u0004\u0018\u00010\u00018\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR&\u0010h\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010g8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010BR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bN\u0010kR\u0018\u0010N\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b`\u0010mR\"\u0010o\u001a\u00020n8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\u001a\u0010\u0014\u001a\u00020\u00138\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0014\u0010u\u001a\u0004\bv\u0010wR\u0016\u0010R\u001a\u00020^8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b?\u0010_R&\u0010x\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020^0g8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bx\u0010i\u001a\u0004\by\u0010BR\u001a\u0010{\u001a\b\u0012\u0004\u0012\u00020.0+8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bz\u0010kR\u0016\u0010}\u001a\u00020^8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b|\u0010_R\u001b\u0010~\u001a\u00020^8\u0001X\u0081\u0004¢\u0006\r\n\u0004\b~\u0010_\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001b\u0010z\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R+\u0010\u0084\u0001\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0g8\u0001X\u0081\u0004¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010i\u001a\u0005\b\u0085\u0001\u0010BR\u0015\u0010|\u001a\u00020\u00178\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b{\u0010\u0086\u0001R\u001d\u0010\u0012\u001a\u00020\u00118\u0001X\u0081\u0004¢\u0006\u000f\n\u0005\b\u0012\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R&\u0010\u008a\u0001\u001a\u00020n8\u0001@\u0001X\u0081\u000e¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010p\u001a\u0005\b\u008b\u0001\u0010r\"\u0005\b\u008c\u0001\u0010tR\u001b\u0010\u0016\u001a\u00020\u00138\u0001X\u0081\u0004¢\u0006\r\n\u0004\b\u0016\u0010u\u001a\u0005\b\u008d\u0001\u0010wR\u0017\u0010\u0082\u0001\u001a\u00020^8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b}\u0010_R\u001a\u0010\u0091\u0001\u001a\u00030\u008e\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R(\u0010\u0092\u0001\u001a\u00020\u001b8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0005\b\u0094\u0001\u0010M\"\u0006\b\u0095\u0001\u0010\u0096\u0001R$\u0010\u0097\u0001\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b8\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010iR\u0017\u0010\u008f\u0001\u001a\u0002008\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0017\u0010\u0099\u0001\u001a\u00020\u001f8\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R$\u0010\u009b\u0001\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0g8\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b\u009b\u0001\u0010iR\u001d\u0010\b\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\u000f\n\u0005\b\b\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001c\u0010 \u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u0083\u0001R\u001c\u0010¢\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010\u0083\u0001R\u0018\u0010£\u0001\u001a\u00020^8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b¢\u0001\u0010_R&\u0010¡\u0001\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b£\u0001\u0010iR&\u0010¤\u0001\u001a\u00020n8\u0001@\u0001X\u0081\u000e¢\u0006\u0015\n\u0005\b¤\u0001\u0010p\u001a\u0005\b¥\u0001\u0010r\"\u0005\b¦\u0001\u0010tR\u001b\u0010\u0015\u001a\u00020\u00138\u0001X\u0081\u0004¢\u0006\r\n\u0004\b\u0015\u0010u\u001a\u0005\b§\u0001\u0010wR\u0017\u0010\u009f\u0001\u001a\u00020!8\u0002X\u0083\u0004¢\u0006\b\n\u0006\b \u0001\u0010¨\u0001R\u001b\u0010\u0002\u001a\u00020\u00018\u0017X\u0097\u0004¢\u0006\r\n\u0004\b\u0002\u0010b\u001a\u0005\b©\u0001\u0010dR(\u0010ª\u0001\u001a\u00020^8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\bª\u0001\u0010_\u001a\u0006\b«\u0001\u0010\u0080\u0001\"\u0006\b¬\u0001\u0010\u00ad\u0001R(\u0010®\u0001\u001a\u00020^8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\b®\u0001\u0010_\u001a\u0006\b¯\u0001\u0010\u0080\u0001\"\u0006\b°\u0001\u0010\u00ad\u0001R(\u0010±\u0001\u001a\u00020^8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\b±\u0001\u0010_\u001a\u0006\b²\u0001\u0010\u0080\u0001\"\u0006\b³\u0001\u0010\u00ad\u0001R(\u0010´\u0001\u001a\u00020^8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\b´\u0001\u0010_\u001a\u0006\bµ\u0001\u0010\u0080\u0001\"\u0006\b¶\u0001\u0010\u00ad\u0001R(\u0010·\u0001\u001a\u00020^8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\b·\u0001\u0010_\u001a\u0006\b¸\u0001\u0010\u0080\u0001\"\u0006\b¹\u0001\u0010\u00ad\u0001R$\u0010¼\u0001\u001a\u0010\u0012\u0005\u0012\u00030º\u0001\u0012\u0005\u0012\u00030\u0081\u00010g8\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b»\u0001\u0010iR\u0018\u0010½\u0001\u001a\u00020^8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b½\u0001\u0010_R\u0019\u0010»\u0001\u001a\u0004\u0018\u00010'8\u0002X\u0083\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u001d\u0010\u001e\u001a\u00020\u001d8\u0001X\u0081\u0004¢\u0006\u000f\n\u0005\b\u001e\u0010À\u0001\u001a\u0006\bÁ\u0001\u0010Â\u0001R\u0017\u0010Ä\u0001\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010Ã\u0001R\u0016\u0010¾\u0001\u001a\u00020^8\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\bÄ\u0001\u0010_R\u0017\u0010Ç\u0001\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R\u0017\u0010É\u0001\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\b\n\u0006\bÇ\u0001\u0010È\u0001R\u0019\u0010Å\u0001\u001a\u0004\u0018\u00010#8\u0002X\u0083\u0004¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R\u0016\u0010Ë\u0001\u001a\u00020^8\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\bË\u0001\u0010_R(\u0010Ì\u0001\u001a\u00020\u001b8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0006\bÌ\u0001\u0010\u0093\u0001\u001a\u0005\bÍ\u0001\u0010M\"\u0006\bÎ\u0001\u0010\u0096\u0001R(\u0010Ï\u0001\u001a\u00020^8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\bÏ\u0001\u0010_\u001a\u0006\bÐ\u0001\u0010\u0080\u0001\"\u0006\bÑ\u0001\u0010\u00ad\u0001R\u0017\u0010Ò\u0001\u001a\u00020\u001b8\u0002X\u0083\u0004¢\u0006\b\n\u0006\bÒ\u0001\u0010\u0093\u0001R\u001d\u0010\u001a\u001a\u00020\u00198\u0001X\u0081\u0004¢\u0006\u000f\n\u0005\b\u001a\u0010Ó\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001R\u001f\u0010Ö\u0001\u001a\u00020\f8\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\bÖ\u0001\u0010È\u0001\u001a\u0006\b×\u0001\u0010Ø\u0001R(\u0010Ù\u0001\u001a\u00020^8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0005\bÙ\u0001\u0010_\u001a\u0006\bÚ\u0001\u0010\u0080\u0001\"\u0006\bÛ\u0001\u0010\u00ad\u0001R+\u0010Ü\u0001\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0g8\u0001X\u0081\u0004¢\u0006\u000e\n\u0005\bÜ\u0001\u0010i\u001a\u0005\bÝ\u0001\u0010BR\u0019\u0010à\u0001\u001a\u0004\u0018\u00010\u000f8\u0002X\u0083\u0004¢\u0006\b\n\u0006\bÞ\u0001\u0010ß\u0001R\u0017\u0010á\u0001\u001a\u00020%8\u0002X\u0083\u0004¢\u0006\b\n\u0006\bá\u0001\u0010â\u0001R\u001f\u0010ã\u0001\u001a\u00020\f8\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\bã\u0001\u0010È\u0001\u001a\u0006\bä\u0001\u0010Ø\u0001R+\u0010å\u0001\u001a\u0004\u0018\u00010^8\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bå\u0001\u0010æ\u0001\u001a\u0006\bç\u0001\u0010è\u0001\"\u0006\bé\u0001\u0010ê\u0001"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumViewScope;", "Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "parentScope", "Lcom/datadog/android/core/InternalSdkCore;", "sdkCore", "Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;", "sessionEndedMetricDispatcher", "Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey;", "key", "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "", "", "", "initialAttributes", "Lcom/datadog/android/rum/internal/domain/scope/RumViewChangedListener;", "viewChangedListener", "Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "firstPartyHostHeaderTypeResolver", "Lcom/datadog/android/rum/internal/vitals/VitalMonitor;", "cpuVitalMonitor", "memoryVitalMonitor", "frameRateVitalMonitor", "Lcom/datadog/android/rum/internal/FeaturesContextResolver;", "featuresContextResolver", "Lcom/datadog/android/rum/internal/domain/scope/RumViewType;", "type", "", "trackFrustrations", "", "sampleRate", "Lcom/datadog/android/rum/internal/metric/interactiontonextview/InteractionToNextViewMetricResolver;", "interactionToNextViewMetricResolver", "Lcom/datadog/android/rum/internal/metric/networksettled/NetworkSettledMetricResolver;", "networkSettledMetricResolver", "Lcom/datadog/android/rum/internal/metric/slowframes/SlowFramesListener;", "slowFramesListener", "Lcom/datadog/android/rum/internal/metric/ViewMetricDispatcher;", "viewEndedMetricDispatcher", "Lcom/datadog/android/rum/RumSessionType;", "rumSessionTypeOverride", "Lcom/datadog/android/rum/internal/domain/accessibility/AccessibilitySnapshotManager;", "accessibilitySnapshotManager", "Lcom/datadog/android/rum/internal/domain/InfoProvider;", "Lcom/datadog/android/rum/internal/domain/battery/BatteryInfo;", "batteryInfoProvider", "Lcom/datadog/android/rum/internal/domain/display/DisplayInfo;", "displayInfoProvider", "Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;", "insightsCollector", "<init>", "(Lcom/datadog/android/rum/internal/domain/scope/RumScope;Lcom/datadog/android/core/InternalSdkCore;Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey;Lcom/datadog/android/rum/internal/domain/Time;Ljava/util/Map;Lcom/datadog/android/rum/internal/domain/scope/RumViewChangedListener;Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;Lcom/datadog/android/rum/internal/vitals/VitalMonitor;Lcom/datadog/android/rum/internal/vitals/VitalMonitor;Lcom/datadog/android/rum/internal/vitals/VitalMonitor;Lcom/datadog/android/rum/internal/FeaturesContextResolver;Lcom/datadog/android/rum/internal/domain/scope/RumViewType;ZFLcom/datadog/android/rum/internal/metric/interactiontonextview/InteractionToNextViewMetricResolver;Lcom/datadog/android/rum/internal/metric/networksettled/NetworkSettledMetricResolver;Lcom/datadog/android/rum/internal/metric/slowframes/SlowFramesListener;Lcom/datadog/android/rum/internal/metric/ViewMetricDispatcher;Lcom/datadog/android/rum/RumSessionType;Lcom/datadog/android/rum/internal/domain/accessibility/AccessibilitySnapshotManager;Lcom/datadog/android/rum/internal/domain/InfoProvider;Lcom/datadog/android/rum/internal/domain/InfoProvider;Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;)V", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "p0", "Lcom/datadog/android/api/context/DatadogContext;", "p1", "Lkotlin/Function1;", "Lcom/datadog/android/api/storage/EventBatchWriter;", "", "Lcom/datadog/android/api/feature/EventWriteScope;", "p2", "Lcom/datadog/android/api/storage/DataWriter;", "p3", "Camera2StreamConfigurationMap", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;Lcom/datadog/android/api/context/DatadogContext;Lkotlin/jvm/functions/Function1;Lcom/datadog/android/api/storage/DataWriter;)V", "getCustomAttributes", "()Ljava/util/Map;", "Lcom/datadog/android/rum/internal/domain/RumContext;", "getRumContext", "()Lcom/datadog/android/rum/internal/domain/RumContext;", "event", "datadogContext", "writeScope", "writer", "handleEvent", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;Lcom/datadog/android/api/context/DatadogContext;Lkotlin/jvm/functions/Function1;Lcom/datadog/android/api/storage/DataWriter;)Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "isActive", "()Z", "getHighSpeedVideoFpsRanges", "newEventTime", "renew$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumViewScope;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;)V", "()V", "Lcom/datadog/android/api/storage/EventType;", "eventType", "sendViewUpdate$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;Lcom/datadog/android/api/context/DatadogContext;Lkotlin/jvm/functions/Function1;Lcom/datadog/android/api/storage/DataWriter;Lcom/datadog/android/api/storage/EventType;)V", "Lkotlin/Function0;", "p4", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;Lcom/datadog/android/api/context/DatadogContext;Lkotlin/jvm/functions/Function1;Lcom/datadog/android/api/storage/DataWriter;Lkotlin/jvm/functions/Function0;)V", "getHighSpeedVideoSizes", "Lcom/datadog/android/rum/internal/domain/accessibility/AccessibilitySnapshotManager;", "", "J", "getHighSpeedVideoFpsRangesFor", "activeActionScope", "Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "getActiveActionScope$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "setActiveActionScope$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/internal/domain/scope/RumScope;)V", "", "activeResourceScopes", "Ljava/util/Map;", "getActiveResourceScopes$dd_sdk_android_rum_release", "Lcom/datadog/android/rum/internal/domain/InfoProvider;", "", "Ljava/lang/Double;", "Lcom/datadog/android/rum/internal/vitals/VitalListener;", "cpuVitalListener", "Lcom/datadog/android/rum/internal/vitals/VitalListener;", "getCpuVitalListener$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/vitals/VitalListener;", "setCpuVitalListener$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/internal/vitals/VitalListener;)V", "Lcom/datadog/android/rum/internal/vitals/VitalMonitor;", "getCpuVitalMonitor$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/vitals/VitalMonitor;", "customTimings", "getCustomTimings$dd_sdk_android_rum_release", "getHighSpeedVideoSizesFor", "getOutputFormats", "getOutputMinFrameDuration", "getInputSizeshNQ4ISI", "eventTimestamp", "getEventTimestamp$dd_sdk_android_rum_release", "()J", "Lcom/datadog/android/rum/internal/vitals/VitalInfo;", "getInputFormats", "Lcom/datadog/android/rum/internal/vitals/VitalInfo;", "featureFlags", "getFeatureFlags$dd_sdk_android_rum_release", "Lcom/datadog/android/rum/internal/FeaturesContextResolver;", "Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "getFirstPartyHostHeaderTypeResolver$dd_sdk_android_rum_release", "()Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "frameRateVitalListener", "getFrameRateVitalListener$dd_sdk_android_rum_release", "setFrameRateVitalListener$dd_sdk_android_rum_release", "getFrameRateVitalMonitor$dd_sdk_android_rum_release", "", "getOutputStallDuration", com.visa.cbp.getEncExpo.warmup, "getOutputStallDurationlomOqCM", "hasReplay", "Z", "getHasReplay$dd_sdk_android_rum_release", "setHasReplay$dd_sdk_android_rum_release", "(Z)V", "getOutputSizeshNQ4ISI", "Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;", "getOutputMinFrameDurationlomOqCM", "Lcom/datadog/android/rum/internal/metric/interactiontonextview/InteractionToNextViewMetricResolver;", "getOutputSizes", "Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey;", "getKey$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey;", "isOutputSupportedForhNQ4ISI", "toString", "isOutputSupportedFor", "unwrapAs", "getValidOutputFormatsForInputhNQ4ISI", "memoryVitalListener", "getMemoryVitalListener$dd_sdk_android_rum_release", "setMemoryVitalListener$dd_sdk_android_rum_release", "getMemoryVitalMonitor$dd_sdk_android_rum_release", "Lcom/datadog/android/rum/internal/metric/networksettled/NetworkSettledMetricResolver;", "getParentScope", "pendingActionCount", "getPendingActionCount$dd_sdk_android_rum_release", "setPendingActionCount$dd_sdk_android_rum_release", "(J)V", "pendingErrorCount", "getPendingErrorCount$dd_sdk_android_rum_release", "setPendingErrorCount$dd_sdk_android_rum_release", "pendingFrozenFrameCount", "getPendingFrozenFrameCount$dd_sdk_android_rum_release", "setPendingFrozenFrameCount$dd_sdk_android_rum_release", "pendingLongTaskCount", "getPendingLongTaskCount$dd_sdk_android_rum_release", "setPendingLongTaskCount$dd_sdk_android_rum_release", "pendingResourceCount", "getPendingResourceCount$dd_sdk_android_rum_release", "setPendingResourceCount$dd_sdk_android_rum_release", "Lcom/datadog/android/rum/RumPerformanceMetric;", "ArtificialStackFrames", "coroutineCreation", "CoroutineDebuggingKt", "accessartificialFrame", "Lcom/datadog/android/rum/RumSessionType;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getSampleRate$dd_sdk_android_rum_release", "()F", "Lcom/datadog/android/core/InternalSdkCore;", "coroutineBoundary", "a", "Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;", util.h.xy.cb.b.f1091, "Ljava/lang/String;", "_BOUNDARY", "Lcom/datadog/android/rum/internal/metric/slowframes/SlowFramesListener;", "_CREATION", "stopped", "getStopped$dd_sdk_android_rum_release", "setStopped$dd_sdk_android_rum_release", "stoppedNanos", "getStoppedNanos$dd_sdk_android_rum_release", "setStoppedNanos$dd_sdk_android_rum_release", "getARTIFICIAL_FRAME_PACKAGE_NAME", "Lcom/datadog/android/rum/internal/domain/scope/RumViewType;", "getType$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/domain/scope/RumViewType;", "url", "getUrl$dd_sdk_android_rum_release", "()Ljava/lang/String;", "version", "getVersion$dd_sdk_android_rum_release", "setVersion$dd_sdk_android_rum_release", "viewAttributes", "getViewAttributes$dd_sdk_android_rum_release", "c", "Lcom/datadog/android/rum/internal/domain/scope/RumViewChangedListener;", "kernelVersion", "init", "Lcom/datadog/android/rum/internal/metric/ViewMetricDispatcher;", com.datadog.android.rum.internal.domain.event.RumEventMeta.VIEW_ID_KEY, "getViewId$dd_sdk_android_rum_release", "viewLoadingTime", "Ljava/lang/Long;", "getViewLoadingTime$dd_sdk_android_rum_release", "()Ljava/lang/Long;", "setViewLoadingTime$dd_sdk_android_rum_release", "(Ljava/lang/Long;)V", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public class RumViewScope implements com.datadog.android.rum.internal.domain.scope.RumScope {
    public static final java.lang.String ACTION_DROPPED_WARNING = "RUM Action (%s on %s) was dropped, because another action is still active for the same view";
    public static final java.lang.String ADDING_VIEW_LOADING_TIME_DEBUG_MESSAGE_FORMAT = "View loading time %dns added to the view %s";
    public static final java.lang.String NEGATIVE_DURATION_WARNING_MESSAGE = "The computed duration for the view: %s was negative. In order to keep the view we forced it to 1ns.";
    public static final java.lang.String OVERWRITING_VIEW_LOADING_TIME_WARNING_MESSAGE_FORMAT = "View loading time already exists for the view %s. Replacing the existing %d ns view loading time with the new %d ns loading time.";
    public static final java.lang.String SESSION_REPLAY_SAMPLE_RATE_KEY = "session_replay_sample_rate";
    public static final int SLOW_RENDERED_THRESHOLD_FPS = 55;
    public static final java.lang.String TRACE_SAMPLE_RATE = "okhttp_interceptor_sample_rate";
    public static final java.lang.String ZERO_DURATION_WARNING_MESSAGE = "The computed duration for the view: %s was 0. In order to keep the view we forced it to 1ns.";

    /* renamed from: ArtificialStackFrames, reason: from kotlin metadata */
    private final java.util.Map<com.datadog.android.rum.RumPerformanceMetric, com.datadog.android.rum.internal.vitals.VitalInfo> coroutineCreation;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private long getHighResolutionOutputSizeshNQ4ISI;
    private long CoroutineDebuggingKt;

    /* renamed from: _BOUNDARY, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.metric.slowframes.SlowFramesListener a;
    private final long _CREATION;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.datadog.android.rum.internal.metric.SessionMetricDispatcher b;

    /* renamed from: accessartificialFrame, reason: from kotlin metadata */
    private final com.datadog.android.rum.RumSessionType ArtificialStackFrames;
    private com.datadog.android.rum.internal.domain.scope.RumScope activeActionScope;
    private final java.util.Map<java.lang.Object, com.datadog.android.rum.internal.domain.scope.RumScope> activeResourceScopes;

    /* renamed from: b, reason: from kotlin metadata */
    private final java.lang.String _BOUNDARY;

    /* renamed from: c, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.domain.scope.RumViewChangedListener kernelVersion;

    /* renamed from: coroutineBoundary, reason: from kotlin metadata */
    private final long accessartificialFrame;

    /* renamed from: coroutineCreation, reason: from kotlin metadata */
    private final com.datadog.android.core.InternalSdkCore coroutineBoundary;
    private com.datadog.android.rum.internal.vitals.VitalListener cpuVitalListener;
    private final com.datadog.android.rum.internal.vitals.VitalMonitor cpuVitalMonitor;
    private final java.util.Map<java.lang.String, java.lang.Long> customTimings;
    private final long eventTimestamp;
    private final java.util.Map<java.lang.String, java.lang.Object> featureFlags;
    private final com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver firstPartyHostHeaderTypeResolver;
    private com.datadog.android.rum.internal.vitals.VitalListener frameRateVitalListener;
    private final com.datadog.android.rum.internal.vitals.VitalMonitor frameRateVitalMonitor;
    private final boolean getARTIFICIAL_FRAME_PACKAGE_NAME;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private long getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.domain.InfoProvider<com.datadog.android.rum.internal.domain.battery.BatteryInfo> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private java.lang.Double getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.domain.accessibility.AccessibilitySnapshotManager Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.domain.InfoProvider<com.datadog.android.rum.internal.domain.display.DisplayInfo> getOutputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private com.datadog.android.rum.internal.vitals.VitalInfo getHighSpeedVideoSizesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private long getInputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.FeaturesContextResolver getOutputMinFrameDuration;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private long getInputSizeshNQ4ISI;
    private final com.datadog.android.rum.internal.metric.interactiontonextview.InteractionToNextViewMetricResolver getOutputMinFrameDurationlomOqCM;
    private final java.util.Map<java.lang.String, java.lang.Object> getOutputSizes;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector getOutputStallDuration;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private int getOutputStallDurationlomOqCM;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, java.lang.Object> getOutputSizeshNQ4ISI;

    /* renamed from: getValidOutputFormatsForInputhNQ4ISI, reason: from kotlin metadata */
    private java.util.Map<java.lang.String, ? extends java.lang.Object> isOutputSupportedFor;
    private boolean hasReplay;
    private final com.datadog.android.rum.internal.metric.ViewMetricDispatcher init;

    /* renamed from: isOutputSupportedFor, reason: from kotlin metadata */
    private com.datadog.android.rum.internal.vitals.VitalInfo unwrapAs;

    /* renamed from: isOutputSupportedForhNQ4ISI, reason: from kotlin metadata */
    private com.datadog.android.rum.internal.vitals.VitalInfo toString;
    private final com.datadog.android.rum.internal.domain.scope.RumScopeKey key;
    private com.datadog.android.rum.internal.vitals.VitalListener memoryVitalListener;
    private final com.datadog.android.rum.internal.vitals.VitalMonitor memoryVitalMonitor;
    private final com.datadog.android.rum.internal.domain.scope.RumScope parentScope;
    private long pendingActionCount;
    private long pendingErrorCount;
    private long pendingFrozenFrameCount;
    private long pendingLongTaskCount;
    private long pendingResourceCount;
    private final float sampleRate;
    private boolean stopped;
    private long stoppedNanos;

    /* renamed from: toString, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.metric.networksettled.NetworkSettledMetricResolver isOutputSupportedForhNQ4ISI;
    private final com.datadog.android.rum.internal.domain.scope.RumViewType type;

    /* renamed from: unwrapAs, reason: from kotlin metadata */
    private long getValidOutputFormatsForInputhNQ4ISI;
    private final java.lang.String url;
    private long version;
    private final java.util.Map<java.lang.String, java.lang.Object> viewAttributes;
    private final java.lang.String viewId;
    private java.lang.Long viewLoadingTime;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.rum.internal.domain.scope.RumViewScope.Companion INSTANCE = new com.datadog.android.rum.internal.domain.scope.RumViewScope.Companion(null);
    private static final long ONE_SECOND_NS = java.util.concurrent.TimeUnit.SECONDS.toNanos(1);
    private static final long FROZEN_FRAME_THRESHOLD_NS = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(700);

    public RumViewScope(com.datadog.android.rum.internal.domain.scope.RumScope rumScope, com.datadog.android.core.InternalSdkCore internalSdkCore, com.datadog.android.rum.internal.metric.SessionMetricDispatcher sessionMetricDispatcher, com.datadog.android.rum.internal.domain.scope.RumScopeKey rumScopeKey, com.datadog.android.rum.internal.domain.Time time, java.util.Map<java.lang.String, ? extends java.lang.Object> map, com.datadog.android.rum.internal.domain.scope.RumViewChangedListener rumViewChangedListener, com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver firstPartyHostHeaderTypeResolver, com.datadog.android.rum.internal.vitals.VitalMonitor vitalMonitor, com.datadog.android.rum.internal.vitals.VitalMonitor vitalMonitor2, com.datadog.android.rum.internal.vitals.VitalMonitor vitalMonitor3, com.datadog.android.rum.internal.FeaturesContextResolver featuresContextResolver, com.datadog.android.rum.internal.domain.scope.RumViewType rumViewType, boolean z, float f, com.datadog.android.rum.internal.metric.interactiontonextview.InteractionToNextViewMetricResolver interactionToNextViewMetricResolver, com.datadog.android.rum.internal.metric.networksettled.NetworkSettledMetricResolver networkSettledMetricResolver, com.datadog.android.rum.internal.metric.slowframes.SlowFramesListener slowFramesListener, com.datadog.android.rum.internal.metric.ViewMetricDispatcher viewMetricDispatcher, com.datadog.android.rum.RumSessionType rumSessionType, com.datadog.android.rum.internal.domain.accessibility.AccessibilitySnapshotManager accessibilitySnapshotManager, com.datadog.android.rum.internal.domain.InfoProvider<com.datadog.android.rum.internal.domain.battery.BatteryInfo> infoProvider, com.datadog.android.rum.internal.domain.InfoProvider<com.datadog.android.rum.internal.domain.display.DisplayInfo> infoProvider2, com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector insightsCollector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalSdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionMetricDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumScopeKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstPartyHostHeaderTypeResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vitalMonitor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vitalMonitor2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vitalMonitor3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featuresContextResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumViewType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interactionToNextViewMetricResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkSettledMetricResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewMetricDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessibilitySnapshotManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(infoProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(infoProvider2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(insightsCollector, "");
        this.parentScope = rumScope;
        this.coroutineBoundary = internalSdkCore;
        this.b = sessionMetricDispatcher;
        this.key = rumScopeKey;
        this.getOutputSizeshNQ4ISI = map;
        this.kernelVersion = rumViewChangedListener;
        this.firstPartyHostHeaderTypeResolver = firstPartyHostHeaderTypeResolver;
        this.cpuVitalMonitor = vitalMonitor;
        this.memoryVitalMonitor = vitalMonitor2;
        this.frameRateVitalMonitor = vitalMonitor3;
        this.getOutputMinFrameDuration = featuresContextResolver;
        this.type = rumViewType;
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = z;
        this.sampleRate = f;
        this.getOutputMinFrameDurationlomOqCM = interactionToNextViewMetricResolver;
        this.isOutputSupportedForhNQ4ISI = networkSettledMetricResolver;
        this.a = slowFramesListener;
        this.init = viewMetricDispatcher;
        this.ArtificialStackFrames = rumSessionType;
        this.Camera2StreamConfigurationMap = accessibilitySnapshotManager;
        this.getHighSpeedVideoSizes = infoProvider;
        this.getOutputFormats = infoProvider2;
        this.getOutputStallDuration = insightsCollector;
        this.url = kotlin.text.StringsKt.replace$default(rumScopeKey.getUrl(), com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, kotlinx.io.files.FileSystemKt.UnixPathSeparator, false, 4, (java.lang.Object) null);
        this.viewAttributes = kotlin.collections.MapsKt.toMutableMap(map);
        this.getOutputSizes = new java.util.LinkedHashMap();
        this.isOutputSupportedFor = kotlin.collections.MapsKt.emptyMap();
        this._BOUNDARY = getParentScope().getGetHighSpeedVideoSizes().getSessionId();
        java.lang.String obj = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        this.viewId = obj;
        long nanoTime = time.getNanoTime();
        this._CREATION = nanoTime;
        this.stoppedNanos = time.getNanoTime();
        long serverTimeOffsetMs = internalSdkCore.getTime().getServerTimeOffsetMs();
        this.accessartificialFrame = serverTimeOffsetMs;
        this.eventTimestamp = time.getTimestamp() + serverTimeOffsetMs;
        this.activeResourceScopes = new java.util.LinkedHashMap();
        this.version = 1L;
        this.customTimings = new java.util.LinkedHashMap();
        this.featureFlags = new java.util.LinkedHashMap();
        this.cpuVitalListener = new com.datadog.android.rum.internal.vitals.VitalListener() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$cpuVitalListener$1

            /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
            private double getHighSpeedVideoFpsRanges = Double.NaN;

            @Override // com.datadog.android.rum.internal.vitals.VitalListener
            public final void onVitalUpdate(com.datadog.android.rum.internal.vitals.VitalInfo info) {
                com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector insightsCollector2;
                java.lang.Double d;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "");
                if (java.lang.Double.isNaN(this.getHighSpeedVideoFpsRanges)) {
                    this.getHighSpeedVideoFpsRanges = info.getMaxValue();
                    return;
                }
                com.datadog.android.rum.internal.domain.scope.RumViewScope.this.getHighSpeedVideoFpsRanges = java.lang.Double.valueOf(info.getMaxValue() - this.getHighSpeedVideoFpsRanges);
                insightsCollector2 = com.datadog.android.rum.internal.domain.scope.RumViewScope.this.getOutputStallDuration;
                d = com.datadog.android.rum.internal.domain.scope.RumViewScope.this.getHighSpeedVideoFpsRanges;
                insightsCollector2.onCpuVital(d);
            }
        };
        this.memoryVitalListener = new com.datadog.android.rum.internal.vitals.VitalListener() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$memoryVitalListener$1
            @Override // com.datadog.android.rum.internal.vitals.VitalListener
            public final void onVitalUpdate(com.datadog.android.rum.internal.vitals.VitalInfo info) {
                com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector insightsCollector2;
                com.datadog.android.rum.internal.vitals.VitalInfo vitalInfo;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "");
                com.datadog.android.rum.internal.domain.scope.RumViewScope.this.unwrapAs = info;
                insightsCollector2 = com.datadog.android.rum.internal.domain.scope.RumViewScope.this.getOutputStallDuration;
                vitalInfo = com.datadog.android.rum.internal.domain.scope.RumViewScope.this.unwrapAs;
                insightsCollector2.onMemoryVital(vitalInfo != null ? java.lang.Double.valueOf(vitalInfo.getMeanValue()) : null);
            }
        };
        this.frameRateVitalListener = new com.datadog.android.rum.internal.vitals.VitalListener() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$frameRateVitalListener$1
            @Override // com.datadog.android.rum.internal.vitals.VitalListener
            public final void onVitalUpdate(com.datadog.android.rum.internal.vitals.VitalInfo info) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "");
                com.datadog.android.rum.internal.domain.scope.RumViewScope.this.toString = info;
            }
        };
        this.coroutineCreation = new java.util.LinkedHashMap();
        vitalMonitor.register(this.cpuVitalListener);
        vitalMonitor2.register(this.memoryVitalListener);
        vitalMonitor3.register(this.frameRateVitalListener);
        com.datadog.android.rum.internal.domain.RumContext getHighSpeedVideoSizes = getParentScope().getGetHighSpeedVideoSizes();
        if (getHighSpeedVideoSizes.getSyntheticsTestId() != null) {
            getHighSpeedVideoSizes.getApplicationId();
            getHighSpeedVideoSizes.getSessionId();
        }
        networkSettledMetricResolver.viewWasCreated(time.getNanoTime());
        interactionToNextViewMetricResolver.onViewCreated(obj, time.getNanoTime());
        if (slowFramesListener != null) {
            slowFramesListener.onViewCreated(obj, nanoTime);
        }
        insightsCollector.onNewView(rumScopeKey.getUrl());
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public com.datadog.android.rum.internal.domain.scope.RumScope getParentScope() {
        return this.parentScope;
    }

    /* renamed from: getKey$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.internal.domain.scope.RumScopeKey getKey() {
        return this.key;
    }

    /* renamed from: getFirstPartyHostHeaderTypeResolver$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver getFirstPartyHostHeaderTypeResolver() {
        return this.firstPartyHostHeaderTypeResolver;
    }

    /* renamed from: getCpuVitalMonitor$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.internal.vitals.VitalMonitor getCpuVitalMonitor() {
        return this.cpuVitalMonitor;
    }

    /* renamed from: getMemoryVitalMonitor$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.internal.vitals.VitalMonitor getMemoryVitalMonitor() {
        return this.memoryVitalMonitor;
    }

    /* renamed from: getFrameRateVitalMonitor$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.internal.vitals.VitalMonitor getFrameRateVitalMonitor() {
        return this.frameRateVitalMonitor;
    }

    public /* synthetic */ RumViewScope(com.datadog.android.rum.internal.domain.scope.RumScope rumScope, com.datadog.android.core.InternalSdkCore internalSdkCore, com.datadog.android.rum.internal.metric.SessionMetricDispatcher sessionMetricDispatcher, com.datadog.android.rum.internal.domain.scope.RumScopeKey rumScopeKey, com.datadog.android.rum.internal.domain.Time time, java.util.Map map, com.datadog.android.rum.internal.domain.scope.RumViewChangedListener rumViewChangedListener, com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver firstPartyHostHeaderTypeResolver, com.datadog.android.rum.internal.vitals.VitalMonitor vitalMonitor, com.datadog.android.rum.internal.vitals.VitalMonitor vitalMonitor2, com.datadog.android.rum.internal.vitals.VitalMonitor vitalMonitor3, com.datadog.android.rum.internal.FeaturesContextResolver featuresContextResolver, com.datadog.android.rum.internal.domain.scope.RumViewType rumViewType, boolean z, float f, com.datadog.android.rum.internal.metric.interactiontonextview.InteractionToNextViewMetricResolver interactionToNextViewMetricResolver, com.datadog.android.rum.internal.metric.networksettled.NetworkSettledMetricResolver networkSettledMetricResolver, com.datadog.android.rum.internal.metric.slowframes.SlowFramesListener slowFramesListener, com.datadog.android.rum.internal.metric.ViewMetricDispatcher viewMetricDispatcher, com.datadog.android.rum.RumSessionType rumSessionType, com.datadog.android.rum.internal.domain.accessibility.AccessibilitySnapshotManager accessibilitySnapshotManager, com.datadog.android.rum.internal.domain.InfoProvider infoProvider, com.datadog.android.rum.internal.domain.InfoProvider infoProvider2, com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector insightsCollector, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(rumScope, internalSdkCore, sessionMetricDispatcher, rumScopeKey, time, map, rumViewChangedListener, firstPartyHostHeaderTypeResolver, vitalMonitor, vitalMonitor2, vitalMonitor3, (i & 2048) != 0 ? new com.datadog.android.rum.internal.FeaturesContextResolver() : featuresContextResolver, (i & 4096) != 0 ? com.datadog.android.rum.internal.domain.scope.RumViewType.FOREGROUND : rumViewType, z, f, interactionToNextViewMetricResolver, networkSettledMetricResolver, slowFramesListener, viewMetricDispatcher, rumSessionType, accessibilitySnapshotManager, infoProvider, infoProvider2, insightsCollector);
    }

    /* renamed from: getType$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.internal.domain.scope.RumViewType getType() {
        return this.type;
    }

    /* renamed from: getSampleRate$dd_sdk_android_rum_release, reason: from getter */
    public final float getSampleRate() {
        return this.sampleRate;
    }

    /* renamed from: getUrl$dd_sdk_android_rum_release, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getViewAttributes$dd_sdk_android_rum_release() {
        return this.viewAttributes;
    }

    /* renamed from: getViewId$dd_sdk_android_rum_release, reason: from getter */
    public final java.lang.String getViewId() {
        return this.viewId;
    }

    /* renamed from: getStoppedNanos$dd_sdk_android_rum_release, reason: from getter */
    public final long getStoppedNanos() {
        return this.stoppedNanos;
    }

    public final void setStoppedNanos$dd_sdk_android_rum_release(long j) {
        this.stoppedNanos = j;
    }

    /* renamed from: getViewLoadingTime$dd_sdk_android_rum_release, reason: from getter */
    public final java.lang.Long getViewLoadingTime() {
        return this.viewLoadingTime;
    }

    public final void setViewLoadingTime$dd_sdk_android_rum_release(java.lang.Long l) {
        this.viewLoadingTime = l;
    }

    /* renamed from: getEventTimestamp$dd_sdk_android_rum_release, reason: from getter */
    public final long getEventTimestamp() {
        return this.eventTimestamp;
    }

    /* renamed from: getActiveActionScope$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.internal.domain.scope.RumScope getActiveActionScope() {
        return this.activeActionScope;
    }

    public final void setActiveActionScope$dd_sdk_android_rum_release(com.datadog.android.rum.internal.domain.scope.RumScope rumScope) {
        this.activeActionScope = rumScope;
    }

    public final java.util.Map<java.lang.Object, com.datadog.android.rum.internal.domain.scope.RumScope> getActiveResourceScopes$dd_sdk_android_rum_release() {
        return this.activeResourceScopes;
    }

    /* renamed from: getPendingResourceCount$dd_sdk_android_rum_release, reason: from getter */
    public final long getPendingResourceCount() {
        return this.pendingResourceCount;
    }

    public final void setPendingResourceCount$dd_sdk_android_rum_release(long j) {
        this.pendingResourceCount = j;
    }

    /* renamed from: getPendingActionCount$dd_sdk_android_rum_release, reason: from getter */
    public final long getPendingActionCount() {
        return this.pendingActionCount;
    }

    public final void setPendingActionCount$dd_sdk_android_rum_release(long j) {
        this.pendingActionCount = j;
    }

    /* renamed from: getPendingErrorCount$dd_sdk_android_rum_release, reason: from getter */
    public final long getPendingErrorCount() {
        return this.pendingErrorCount;
    }

    public final void setPendingErrorCount$dd_sdk_android_rum_release(long j) {
        this.pendingErrorCount = j;
    }

    /* renamed from: getPendingLongTaskCount$dd_sdk_android_rum_release, reason: from getter */
    public final long getPendingLongTaskCount() {
        return this.pendingLongTaskCount;
    }

    public final void setPendingLongTaskCount$dd_sdk_android_rum_release(long j) {
        this.pendingLongTaskCount = j;
    }

    /* renamed from: getPendingFrozenFrameCount$dd_sdk_android_rum_release, reason: from getter */
    public final long getPendingFrozenFrameCount() {
        return this.pendingFrozenFrameCount;
    }

    public final void setPendingFrozenFrameCount$dd_sdk_android_rum_release(long j) {
        this.pendingFrozenFrameCount = j;
    }

    /* renamed from: getVersion$dd_sdk_android_rum_release, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    public final void setVersion$dd_sdk_android_rum_release(long j) {
        this.version = j;
    }

    public final java.util.Map<java.lang.String, java.lang.Long> getCustomTimings$dd_sdk_android_rum_release() {
        return this.customTimings;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getFeatureFlags$dd_sdk_android_rum_release() {
        return this.featureFlags;
    }

    /* renamed from: getHasReplay$dd_sdk_android_rum_release, reason: from getter */
    public final boolean getHasReplay() {
        return this.hasReplay;
    }

    public final void setHasReplay$dd_sdk_android_rum_release(boolean z) {
        this.hasReplay = z;
    }

    /* renamed from: getStopped$dd_sdk_android_rum_release, reason: from getter */
    public final boolean getStopped() {
        return this.stopped;
    }

    public final void setStopped$dd_sdk_android_rum_release(boolean z) {
        this.stopped = z;
    }

    /* renamed from: getCpuVitalListener$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.internal.vitals.VitalListener getCpuVitalListener() {
        return this.cpuVitalListener;
    }

    public final void setCpuVitalListener$dd_sdk_android_rum_release(com.datadog.android.rum.internal.vitals.VitalListener vitalListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vitalListener, "");
        this.cpuVitalListener = vitalListener;
    }

    /* renamed from: getMemoryVitalListener$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.internal.vitals.VitalListener getMemoryVitalListener() {
        return this.memoryVitalListener;
    }

    public final void setMemoryVitalListener$dd_sdk_android_rum_release(com.datadog.android.rum.internal.vitals.VitalListener vitalListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vitalListener, "");
        this.memoryVitalListener = vitalListener;
    }

    /* renamed from: getFrameRateVitalListener$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.internal.vitals.VitalListener getFrameRateVitalListener() {
        return this.frameRateVitalListener;
    }

    public final void setFrameRateVitalListener$dd_sdk_android_rum_release(com.datadog.android.rum.internal.vitals.VitalListener vitalListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vitalListener, "");
        this.frameRateVitalListener = vitalListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x087e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0868  */
    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.datadog.android.rum.internal.domain.scope.RumScope handleEvent(com.datadog.android.rum.internal.domain.scope.RumRawEvent event, final com.datadog.android.api.context.DatadogContext datadogContext, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>, kotlin.Unit> writeScope, com.datadog.android.api.storage.DataWriter<java.lang.Object> writer) {
        com.datadog.android.rum.internal.domain.scope.RumScope rumScope;
        final long j;
        com.datadog.android.rum.internal.domain.scope.RumScope rumScope2;
        boolean z;
        java.lang.String str;
        java.lang.Throwable throwable;
        java.lang.String str2;
        java.lang.String message;
        boolean z2;
        java.lang.Class<?> cls;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        if (!(event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.ResourceSent)) {
            if (!(event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.ActionSent)) {
                if (!(event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.ErrorSent)) {
                    if (!(event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.LongTaskSent)) {
                        if (!(event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.ResourceDropped)) {
                            if (!(event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.ActionDropped)) {
                                if (!(event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.ErrorDropped)) {
                                    if (!(event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.LongTaskDropped)) {
                                        if (!(event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartView)) {
                                            if (!(event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopView)) {
                                                if (!(event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartAction)) {
                                                    if (!(event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartResource)) {
                                                        if (!(event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddError)) {
                                                            if (!(event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddLongTask)) {
                                                                if (!(event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.SetInternalViewAttribute)) {
                                                                    if (event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddFeatureFlagEvaluation) {
                                                                        com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddFeatureFlagEvaluation addFeatureFlagEvaluation = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddFeatureFlagEvaluation) event;
                                                                        if (!this.stopped && !kotlin.jvm.internal.Intrinsics.areEqual(addFeatureFlagEvaluation.getValue(), this.featureFlags.get(addFeatureFlagEvaluation.getName()))) {
                                                                            this.featureFlags.put(addFeatureFlagEvaluation.getName(), addFeatureFlagEvaluation.getValue());
                                                                            sendViewUpdate$dd_sdk_android_rum_release$default(this, addFeatureFlagEvaluation, datadogContext, writeScope, writer, null, 16, null);
                                                                            getHighResolutionOutputSizeshNQ4ISI();
                                                                        }
                                                                    } else if (event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddFeatureFlagEvaluations) {
                                                                        com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddFeatureFlagEvaluations addFeatureFlagEvaluations = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddFeatureFlagEvaluations) event;
                                                                        if (!this.stopped) {
                                                                            boolean z3 = false;
                                                                            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : addFeatureFlagEvaluations.getFeatureFlags().entrySet()) {
                                                                                java.lang.String key = entry.getKey();
                                                                                java.lang.Object value = entry.getValue();
                                                                                if (!kotlin.jvm.internal.Intrinsics.areEqual(value, this.featureFlags.get(key))) {
                                                                                    this.featureFlags.put(key, value);
                                                                                    z3 = true;
                                                                                }
                                                                            }
                                                                            if (z3) {
                                                                                sendViewUpdate$dd_sdk_android_rum_release$default(this, addFeatureFlagEvaluations, datadogContext, writeScope, writer, null, 16, null);
                                                                                getHighResolutionOutputSizeshNQ4ISI();
                                                                            }
                                                                        }
                                                                    } else if (!(event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddCustomTiming)) {
                                                                        if (!(event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopSession)) {
                                                                            if (!(event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.UpdatePerformanceMetric)) {
                                                                                if (!(event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.UpdateExternalRefreshRate)) {
                                                                                    if (!(event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddViewLoadingTime)) {
                                                                                        rumScope = null;
                                                                                        if (!(event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddViewAttributes)) {
                                                                                            if (!(event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.RemoveViewAttributes)) {
                                                                                                if (!(event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartFeatureOperation)) {
                                                                                                    if (!(event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopFeatureOperation)) {
                                                                                                        Camera2StreamConfigurationMap(event, datadogContext, writeScope, writer);
                                                                                                    } else {
                                                                                                        final com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopFeatureOperation stopFeatureOperation = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopFeatureOperation) event;
                                                                                                        if (!this.stopped) {
                                                                                                            com.datadog.android.rum.internal.utils.SdkCoreExtKt.newRumEventWriteOperation$default(this.coroutineBoundary, datadogContext, writeScope, writer, null, new kotlin.jvm.functions.Function0<java.lang.Object>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onStopFeatureOperation$1
                                                                                                                @Override // kotlin.jvm.functions.Function0
                                                                                                                public final java.lang.Object invoke() {
                                                                                                                    com.datadog.android.rum.internal.domain.scope.RumViewScope rumViewScope = com.datadog.android.rum.internal.domain.scope.RumViewScope.this;
                                                                                                                    com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopFeatureOperation stopFeatureOperation2 = stopFeatureOperation;
                                                                                                                    com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopFeatureOperation stopFeatureOperation3 = stopFeatureOperation2;
                                                                                                                    com.datadog.android.api.context.DatadogContext datadogContext2 = datadogContext;
                                                                                                                    java.lang.String name2 = stopFeatureOperation2.getName();
                                                                                                                    java.lang.String operationKey = stopFeatureOperation.getOperationKey();
                                                                                                                    com.datadog.android.rum.model.VitalOperationStepEvent.StepType stepType = com.datadog.android.rum.model.VitalOperationStepEvent.StepType.END;
                                                                                                                    com.datadog.android.rum.featureoperations.FailureReason failureReason = stopFeatureOperation.getFailureReason();
                                                                                                                    return com.datadog.android.rum.internal.domain.scope.RumViewScope.access$newVitalEvent(rumViewScope, stopFeatureOperation3, datadogContext2, name2, operationKey, stepType, failureReason != null ? com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toSchemaFailureReason(failureReason) : null, stopFeatureOperation.getAttributes());
                                                                                                                }

                                                                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                                                {
                                                                                                                    super(0);
                                                                                                                }
                                                                                                            }, 8, null).submit();
                                                                                                            sendViewUpdate$dd_sdk_android_rum_release$default(this, stopFeatureOperation, datadogContext, writeScope, writer, null, 16, null);
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    final com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartFeatureOperation startFeatureOperation = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartFeatureOperation) event;
                                                                                                    if (!this.stopped) {
                                                                                                        com.datadog.android.rum.internal.utils.SdkCoreExtKt.newRumEventWriteOperation$default(this.coroutineBoundary, datadogContext, writeScope, writer, null, new kotlin.jvm.functions.Function0<java.lang.Object>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onStartFeatureOperation$1
                                                                                                            @Override // kotlin.jvm.functions.Function0
                                                                                                            public final java.lang.Object invoke() {
                                                                                                                com.datadog.android.rum.internal.domain.scope.RumViewScope rumViewScope = com.datadog.android.rum.internal.domain.scope.RumViewScope.this;
                                                                                                                com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartFeatureOperation startFeatureOperation2 = startFeatureOperation;
                                                                                                                return com.datadog.android.rum.internal.domain.scope.RumViewScope.access$newVitalEvent(rumViewScope, startFeatureOperation2, datadogContext, startFeatureOperation2.getName(), startFeatureOperation.getOperationKey(), com.datadog.android.rum.model.VitalOperationStepEvent.StepType.START, null, startFeatureOperation.getAttributes());
                                                                                                            }

                                                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                                            {
                                                                                                                super(0);
                                                                                                            }
                                                                                                        }, 8, null).submit();
                                                                                                        sendViewUpdate$dd_sdk_android_rum_release$default(this, startFeatureOperation, datadogContext, writeScope, writer, null, 16, null);
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                java.util.Iterator<T> it = ((com.datadog.android.rum.internal.domain.scope.RumRawEvent.RemoveViewAttributes) event).getAttributes().iterator();
                                                                                                while (it.hasNext()) {
                                                                                                    this.viewAttributes.remove((java.lang.String) it.next());
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            this.viewAttributes.putAll(((com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddViewAttributes) event).getAttributes());
                                                                                        }
                                                                                    } else {
                                                                                        com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddViewLoadingTime addViewLoadingTime = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddViewLoadingTime) event;
                                                                                        if (!this.stopped && (this.viewLoadingTime == null || addViewLoadingTime.getOverwrite())) {
                                                                                            com.datadog.android.api.InternalLogger internalLogger = this.coroutineBoundary.getInternalLogger();
                                                                                            final java.lang.String name2 = this.key.getName();
                                                                                            final java.lang.Long l = this.viewLoadingTime;
                                                                                            final long nanoTime = addViewLoadingTime.getEventTime().getNanoTime() - this._CREATION;
                                                                                            if (l == null) {
                                                                                                j = nanoTime;
                                                                                                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.DEBUG, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$updateViewLoadingTime$1
                                                                                                    @Override // kotlin.jvm.functions.Function0
                                                                                                    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                                                                                                    public final java.lang.String invoke() {
                                                                                                        java.util.Locale locale = java.util.Locale.US;
                                                                                                        long j2 = nanoTime;
                                                                                                        java.lang.String format = java.lang.String.format(locale, com.datadog.android.rum.internal.domain.scope.RumViewScope.ADDING_VIEW_LOADING_TIME_DEBUG_MESSAGE_FORMAT, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(j2), name2}, 2));
                                                                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                                                                                                        return format;
                                                                                                    }

                                                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                                    {
                                                                                                        super(0);
                                                                                                    }
                                                                                                }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                                                                                                rumScope2 = null;
                                                                                                com.datadog.android.api.InternalLogger.DefaultImpls.logApiUsage$default(internalLogger, 0.0f, new kotlin.jvm.functions.Function0<com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$updateViewLoadingTime$2
                                                                                                    @Override // kotlin.jvm.functions.Function0
                                                                                                    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                                                                                                    public final com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage invoke() {
                                                                                                        return new com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.AddViewLoadingTime(false, false, false, null, 8, null);
                                                                                                    }
                                                                                                }, 1, null);
                                                                                            } else {
                                                                                                j = nanoTime;
                                                                                                rumScope2 = null;
                                                                                                if (addViewLoadingTime.getOverwrite()) {
                                                                                                    rumScope = null;
                                                                                                    com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$updateViewLoadingTime$3
                                                                                                        @Override // kotlin.jvm.functions.Function0
                                                                                                        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                                                                                                        public final java.lang.String invoke() {
                                                                                                            java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.rum.internal.domain.scope.RumViewScope.OVERWRITING_VIEW_LOADING_TIME_WARNING_MESSAGE_FORMAT, java.util.Arrays.copyOf(new java.lang.Object[]{name2, l, java.lang.Long.valueOf(j)}, 3));
                                                                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                                                                                                            return format;
                                                                                                        }

                                                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                                        {
                                                                                                            super(0);
                                                                                                        }
                                                                                                    }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                                                                                                    com.datadog.android.api.InternalLogger.DefaultImpls.logApiUsage$default(internalLogger, 0.0f, new kotlin.jvm.functions.Function0<com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$updateViewLoadingTime$4
                                                                                                        @Override // kotlin.jvm.functions.Function0
                                                                                                        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                                                                                                        public final com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage invoke() {
                                                                                                            return new com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.AddViewLoadingTime(true, false, false, null, 8, null);
                                                                                                        }
                                                                                                    }, 1, null);
                                                                                                    this.viewLoadingTime = java.lang.Long.valueOf(j);
                                                                                                    this.init.onViewLoadingTimeResolved(j);
                                                                                                    sendViewUpdate$dd_sdk_android_rum_release$default(this, addViewLoadingTime, datadogContext, writeScope, writer, null, 16, null);
                                                                                                }
                                                                                            }
                                                                                            rumScope = rumScope2;
                                                                                            this.viewLoadingTime = java.lang.Long.valueOf(j);
                                                                                            this.init.onViewLoadingTimeResolved(j);
                                                                                            sendViewUpdate$dd_sdk_android_rum_release$default(this, addViewLoadingTime, datadogContext, writeScope, writer, null, 16, null);
                                                                                        }
                                                                                    }
                                                                                    if (getHighSpeedVideoFpsRanges()) {
                                                                                        com.datadog.android.api.feature.FeatureSdkCore.DefaultImpls.updateFeatureContext$default(this.coroutineBoundary, "session-replay", false, new kotlin.jvm.functions.Function1<java.util.Map<java.lang.String, java.lang.Object>, kotlin.Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$handleEvent$1
                                                                                            @Override // kotlin.jvm.functions.Function1
                                                                                            public final /* synthetic */ kotlin.Unit invoke(java.util.Map<java.lang.String, java.lang.Object> map) {
                                                                                                getHighSpeedVideoFpsRangesFor(map);
                                                                                                return kotlin.Unit.INSTANCE;
                                                                                            }

                                                                                            public final void getHighSpeedVideoFpsRangesFor(java.util.Map<java.lang.String, java.lang.Object> map) {
                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
                                                                                                map.remove(com.datadog.android.rum.internal.domain.scope.RumViewScope.this.getViewId());
                                                                                            }

                                                                                            {
                                                                                                super(1);
                                                                                            }
                                                                                        }, 2, null);
                                                                                        return rumScope;
                                                                                    }
                                                                                    return this;
                                                                                }
                                                                                com.datadog.android.rum.internal.domain.scope.RumRawEvent.UpdateExternalRefreshRate updateExternalRefreshRate = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.UpdateExternalRefreshRate) event;
                                                                                if (!this.stopped && updateExternalRefreshRate.getFrameTimeSeconds() > 0.0d) {
                                                                                    double frameTimeSeconds = 1.0d / updateExternalRefreshRate.getFrameTimeSeconds();
                                                                                    com.datadog.android.rum.internal.vitals.VitalInfo vitalInfo = this.getHighSpeedVideoSizesFor;
                                                                                    if (vitalInfo == null) {
                                                                                        vitalInfo = com.datadog.android.rum.internal.vitals.VitalInfo.INSTANCE.getEMPTY();
                                                                                    }
                                                                                    int sampleCount = vitalInfo.getSampleCount() + 1;
                                                                                    this.getHighSpeedVideoSizesFor = new com.datadog.android.rum.internal.vitals.VitalInfo(sampleCount, java.lang.Math.min(frameTimeSeconds, vitalInfo.getMinValue()), java.lang.Math.max(frameTimeSeconds, vitalInfo.getMaxValue()), ((vitalInfo.getSampleCount() * vitalInfo.getMeanValue()) + frameTimeSeconds) / sampleCount);
                                                                                }
                                                                            } else {
                                                                                com.datadog.android.rum.internal.domain.scope.RumRawEvent.UpdatePerformanceMetric updatePerformanceMetric = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.UpdatePerformanceMetric) event;
                                                                                if (!this.stopped) {
                                                                                    double value2 = updatePerformanceMetric.getValue();
                                                                                    com.datadog.android.rum.internal.vitals.VitalInfo vitalInfo2 = this.coroutineCreation.get(updatePerformanceMetric.getMetric());
                                                                                    if (vitalInfo2 == null) {
                                                                                        vitalInfo2 = com.datadog.android.rum.internal.vitals.VitalInfo.INSTANCE.getEMPTY();
                                                                                    }
                                                                                    int sampleCount2 = vitalInfo2.getSampleCount() + 1;
                                                                                    this.coroutineCreation.put(updatePerformanceMetric.getMetric(), new com.datadog.android.rum.internal.vitals.VitalInfo(sampleCount2, java.lang.Math.min(value2, vitalInfo2.getMinValue()), java.lang.Math.max(value2, vitalInfo2.getMaxValue()), ((vitalInfo2.getSampleCount() * vitalInfo2.getMeanValue()) + value2) / sampleCount2));
                                                                                }
                                                                            }
                                                                        } else {
                                                                            Camera2StreamConfigurationMap((com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopSession) event, datadogContext, writeScope, writer, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$stopScope$1
                                                                                public final void getHighSpeedVideoSizes() {
                                                                                }

                                                                                @Override // kotlin.jvm.functions.Function0
                                                                                public final /* synthetic */ kotlin.Unit invoke() {
                                                                                    getHighSpeedVideoSizes();
                                                                                    return kotlin.Unit.INSTANCE;
                                                                                }
                                                                            });
                                                                        }
                                                                    } else {
                                                                        com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddCustomTiming addCustomTiming = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddCustomTiming) event;
                                                                        if (!this.stopped) {
                                                                            this.customTimings.put(addCustomTiming.getName(), java.lang.Long.valueOf(java.lang.Math.max(addCustomTiming.getEventTime().getNanoTime() - this._CREATION, 1L)));
                                                                            sendViewUpdate$dd_sdk_android_rum_release$default(this, addCustomTiming, datadogContext, writeScope, writer, null, 16, null);
                                                                        }
                                                                    }
                                                                } else {
                                                                    com.datadog.android.rum.internal.domain.scope.RumRawEvent.SetInternalViewAttribute setInternalViewAttribute = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.SetInternalViewAttribute) event;
                                                                    if (!this.stopped) {
                                                                        this.getOutputSizes.put(setInternalViewAttribute.getKey(), setInternalViewAttribute.getValue());
                                                                    }
                                                                }
                                                            } else {
                                                                final com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddLongTask addLongTask = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddLongTask) event;
                                                                Camera2StreamConfigurationMap(addLongTask, datadogContext, writeScope, writer);
                                                                if (!this.stopped) {
                                                                    this.getOutputStallDuration.onLongTask(addLongTask.getDurationNs());
                                                                    final com.datadog.android.rum.internal.domain.RumContext getHighSpeedVideoSizes = getGetHighSpeedVideoSizes();
                                                                    final java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(getCustomAttributes());
                                                                    mutableMap.put(com.datadog.android.rum.RumAttributes.LONG_TASK_TARGET, addLongTask.getTarget());
                                                                    long timestamp = addLongTask.getEventTime().getTimestamp();
                                                                    long j2 = this.accessartificialFrame;
                                                                    boolean z4 = addLongTask.getDurationNs() > FROZEN_FRAME_THRESHOLD_NS;
                                                                    com.datadog.android.rum.internal.metric.slowframes.SlowFramesListener slowFramesListener = this.a;
                                                                    if (slowFramesListener != null) {
                                                                        slowFramesListener.onAddLongTask(addLongTask.getDurationNs());
                                                                    }
                                                                    if (!this.hasReplay) {
                                                                        com.datadog.android.rum.internal.FeaturesContextResolver featuresContextResolver = this.getOutputMinFrameDuration;
                                                                        java.lang.String viewId = getHighSpeedVideoSizes.getViewId();
                                                                        if (!featuresContextResolver.resolveViewHasReplay(datadogContext, viewId != null ? viewId : "")) {
                                                                            z = false;
                                                                            this.hasReplay = z;
                                                                            final long j3 = timestamp + j2;
                                                                            final boolean z5 = z4;
                                                                            com.datadog.android.rum.internal.utils.WriteOperation newRumEventWriteOperation$default = com.datadog.android.rum.internal.utils.SdkCoreExtKt.newRumEventWriteOperation$default(this.coroutineBoundary, datadogContext, writeScope, writer, null, new kotlin.jvm.functions.Function0<java.lang.Object>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onAddLongTask$1
                                                                                @Override // kotlin.jvm.functions.Function0
                                                                                public final java.lang.Object invoke() {
                                                                                    com.datadog.android.rum.RumSessionType rumSessionType;
                                                                                    com.datadog.android.rum.model.LongTaskEvent.LongTaskEventSessionType longTaskEventSessionType;
                                                                                    com.datadog.android.core.InternalSdkCore internalSdkCore;
                                                                                    com.datadog.android.rum.RumSessionType rumSessionType2;
                                                                                    java.lang.String syntheticsResultId;
                                                                                    com.datadog.android.api.context.UserInfo userInfo = com.datadog.android.api.context.DatadogContext.this.getUserInfo();
                                                                                    java.lang.String syntheticsTestId = getHighSpeedVideoSizes.getSyntheticsTestId();
                                                                                    com.datadog.android.rum.model.LongTaskEvent.Synthetics synthetics = (syntheticsTestId == null || kotlin.text.StringsKt.isBlank(syntheticsTestId) || (syntheticsResultId = getHighSpeedVideoSizes.getSyntheticsResultId()) == null || kotlin.text.StringsKt.isBlank(syntheticsResultId)) ? null : new com.datadog.android.rum.model.LongTaskEvent.Synthetics(getHighSpeedVideoSizes.getSyntheticsTestId(), getHighSpeedVideoSizes.getSyntheticsResultId(), null, 4, null);
                                                                                    rumSessionType = this.ArtificialStackFrames;
                                                                                    if (rumSessionType != null) {
                                                                                        rumSessionType2 = this.ArtificialStackFrames;
                                                                                        longTaskEventSessionType = com.datadog.android.rum.internal.RumSessionTypeExtKt.toLongTask(rumSessionType2);
                                                                                    } else if (synthetics == null) {
                                                                                        longTaskEventSessionType = com.datadog.android.rum.model.LongTaskEvent.LongTaskEventSessionType.USER;
                                                                                    } else {
                                                                                        longTaskEventSessionType = com.datadog.android.rum.model.LongTaskEvent.LongTaskEventSessionType.SYNTHETICS;
                                                                                    }
                                                                                    long j4 = j3;
                                                                                    long millis = java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(addLongTask.getDurationNs());
                                                                                    com.datadog.android.rum.model.LongTaskEvent.LongTask longTask = new com.datadog.android.rum.model.LongTaskEvent.LongTask(java.util.UUID.randomUUID().toString(), null, null, addLongTask.getDurationNs(), null, null, null, null, java.lang.Boolean.valueOf(z5), null, 758, null);
                                                                                    java.lang.String actionId = getHighSpeedVideoSizes.getActionId();
                                                                                    com.datadog.android.rum.model.LongTaskEvent.Action action = actionId != null ? new com.datadog.android.rum.model.LongTaskEvent.Action(kotlin.collections.CollectionsKt.listOf(actionId)) : null;
                                                                                    java.lang.String viewId2 = getHighSpeedVideoSizes.getViewId();
                                                                                    java.lang.String str3 = viewId2 == null ? "" : viewId2;
                                                                                    java.lang.String viewName = getHighSpeedVideoSizes.getViewName();
                                                                                    java.lang.String viewUrl = getHighSpeedVideoSizes.getViewUrl();
                                                                                    com.datadog.android.rum.model.LongTaskEvent.LongTaskEventView longTaskEventView = new com.datadog.android.rum.model.LongTaskEvent.LongTaskEventView(str3, null, viewUrl == null ? "" : viewUrl, viewName, 2, null);
                                                                                    com.datadog.android.rum.model.LongTaskEvent.Usr usr = com.datadog.android.rum.internal.utils.RuntimeUtilsKt.hasUserData(userInfo) ? new com.datadog.android.rum.model.LongTaskEvent.Usr(userInfo.getId(), userInfo.getName(), userInfo.getEmail(), userInfo.getAnonymousId(), kotlin.collections.MapsKt.toMutableMap(userInfo.getAdditionalProperties())) : null;
                                                                                    com.datadog.android.api.context.AccountInfo accountInfo = com.datadog.android.api.context.DatadogContext.this.getAccountInfo();
                                                                                    com.datadog.android.rum.model.LongTaskEvent.Account account = accountInfo != null ? new com.datadog.android.rum.model.LongTaskEvent.Account(accountInfo.getId(), accountInfo.getName(), kotlin.collections.MapsKt.toMutableMap(accountInfo.getExtraInfo())) : null;
                                                                                    com.datadog.android.rum.model.LongTaskEvent.Connectivity longTaskConnectivity = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toLongTaskConnectivity(com.datadog.android.api.context.DatadogContext.this.getNetworkInfo());
                                                                                    com.datadog.android.rum.model.LongTaskEvent.Application application = new com.datadog.android.rum.model.LongTaskEvent.Application(getHighSpeedVideoSizes.getApplicationId(), null, 2, null);
                                                                                    com.datadog.android.rum.model.LongTaskEvent.LongTaskEventSession longTaskEventSession = new com.datadog.android.rum.model.LongTaskEvent.LongTaskEventSession(getHighSpeedVideoSizes.getSessionId(), longTaskEventSessionType, java.lang.Boolean.valueOf(this.getHasReplay()));
                                                                                    com.datadog.android.rum.model.LongTaskEvent.LongTaskEventSource.Companion companion = com.datadog.android.rum.model.LongTaskEvent.LongTaskEventSource.INSTANCE;
                                                                                    java.lang.String source = com.datadog.android.api.context.DatadogContext.this.getSource();
                                                                                    internalSdkCore = this.coroutineBoundary;
                                                                                    com.datadog.android.rum.model.LongTaskEvent.LongTaskEventSource tryFromSource = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.tryFromSource(companion, source, internalSdkCore.getInternalLogger());
                                                                                    com.datadog.android.rum.model.LongTaskEvent.Os os = new com.datadog.android.rum.model.LongTaskEvent.Os(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsName(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsVersion(), null, com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsMajorVersion(), 4, null);
                                                                                    com.datadog.android.rum.model.LongTaskEvent.Device device = new com.datadog.android.rum.model.LongTaskEvent.Device(com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toLongTaskSchemaType(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceType()), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceName(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceModel(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceBrand(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getArchitecture(), null, null, null, null, null, null, java.lang.Integer.valueOf(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLogicalCpuCount()), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getTotalRam(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().isLowRam(), 2016, null);
                                                                                    com.datadog.android.rum.model.LongTaskEvent.Context context = new com.datadog.android.rum.model.LongTaskEvent.Context(mutableMap);
                                                                                    return new com.datadog.android.rum.model.LongTaskEvent(j4 - millis, application, com.datadog.android.api.context.DatadogContext.this.getService(), com.datadog.android.api.context.DatadogContext.this.getVersion(), java.lang.String.valueOf(com.datadog.android.api.context.DatadogContext.this.getVersionCode()), com.datadog.android.api.context.DatadogContext.this.getAppBuildId(), com.datadog.android.rum.internal.utils.RumTagsUtilsKt.buildDDTagsString(com.datadog.android.api.context.DatadogContext.this), longTaskEventSession, tryFromSource, longTaskEventView, usr, account, longTaskConnectivity, null, synthetics, null, os, device, new com.datadog.android.rum.model.LongTaskEvent.Dd(new com.datadog.android.rum.model.LongTaskEvent.DdSession(null, com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toLongTaskSessionPrecondition(getHighSpeedVideoSizes.getSessionStartReason()), 1, null), new com.datadog.android.rum.model.LongTaskEvent.Configuration(java.lang.Float.valueOf(this.getSampleRate()), null, null, null, 14, null), null, null, null, null, 60, null), context, action, null, longTask, 2138112, null);
                                                                                }

                                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                {
                                                                                    super(0);
                                                                                }
                                                                            }, 8, null);
                                                                            final com.datadog.android.rum.internal.monitor.StorageEvent storageEvent = !z4 ? com.datadog.android.rum.internal.monitor.StorageEvent.FrozenFrame.INSTANCE : com.datadog.android.rum.internal.monitor.StorageEvent.LongTask.INSTANCE;
                                                                            newRumEventWriteOperation$default.onError(new kotlin.jvm.functions.Function1<com.datadog.android.rum.internal.monitor.AdvancedRumMonitor, kotlin.Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onAddLongTask$2$1
                                                                                public final void getHighResolutionOutputSizeshNQ4ISI(com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor) {
                                                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advancedRumMonitor, "");
                                                                                    java.lang.String viewId2 = com.datadog.android.rum.internal.domain.RumContext.this.getViewId();
                                                                                    advancedRumMonitor.eventDropped(viewId2 != null ? viewId2 : "", storageEvent);
                                                                                }

                                                                                @Override // kotlin.jvm.functions.Function1
                                                                                public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor) {
                                                                                    getHighResolutionOutputSizeshNQ4ISI(advancedRumMonitor);
                                                                                    return kotlin.Unit.INSTANCE;
                                                                                }

                                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                {
                                                                                    super(1);
                                                                                }
                                                                            });
                                                                            newRumEventWriteOperation$default.onSuccess(new kotlin.jvm.functions.Function1<com.datadog.android.rum.internal.monitor.AdvancedRumMonitor, kotlin.Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onAddLongTask$2$2
                                                                                public final void getHighResolutionOutputSizeshNQ4ISI(com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor) {
                                                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advancedRumMonitor, "");
                                                                                    java.lang.String viewId2 = com.datadog.android.rum.internal.domain.RumContext.this.getViewId();
                                                                                    advancedRumMonitor.eventSent(viewId2 != null ? viewId2 : "", storageEvent);
                                                                                }

                                                                                @Override // kotlin.jvm.functions.Function1
                                                                                public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor) {
                                                                                    getHighResolutionOutputSizeshNQ4ISI(advancedRumMonitor);
                                                                                    return kotlin.Unit.INSTANCE;
                                                                                }

                                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                {
                                                                                    super(1);
                                                                                }
                                                                            });
                                                                            newRumEventWriteOperation$default.submit();
                                                                            this.pendingLongTaskCount++;
                                                                            if (z4) {
                                                                                this.pendingFrozenFrameCount++;
                                                                            }
                                                                        }
                                                                    }
                                                                    z = true;
                                                                    this.hasReplay = z;
                                                                    final long j32 = timestamp + j2;
                                                                    final boolean z52 = z4;
                                                                    com.datadog.android.rum.internal.utils.WriteOperation newRumEventWriteOperation$default2 = com.datadog.android.rum.internal.utils.SdkCoreExtKt.newRumEventWriteOperation$default(this.coroutineBoundary, datadogContext, writeScope, writer, null, new kotlin.jvm.functions.Function0<java.lang.Object>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onAddLongTask$1
                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public final java.lang.Object invoke() {
                                                                            com.datadog.android.rum.RumSessionType rumSessionType;
                                                                            com.datadog.android.rum.model.LongTaskEvent.LongTaskEventSessionType longTaskEventSessionType;
                                                                            com.datadog.android.core.InternalSdkCore internalSdkCore;
                                                                            com.datadog.android.rum.RumSessionType rumSessionType2;
                                                                            java.lang.String syntheticsResultId;
                                                                            com.datadog.android.api.context.UserInfo userInfo = com.datadog.android.api.context.DatadogContext.this.getUserInfo();
                                                                            java.lang.String syntheticsTestId = getHighSpeedVideoSizes.getSyntheticsTestId();
                                                                            com.datadog.android.rum.model.LongTaskEvent.Synthetics synthetics = (syntheticsTestId == null || kotlin.text.StringsKt.isBlank(syntheticsTestId) || (syntheticsResultId = getHighSpeedVideoSizes.getSyntheticsResultId()) == null || kotlin.text.StringsKt.isBlank(syntheticsResultId)) ? null : new com.datadog.android.rum.model.LongTaskEvent.Synthetics(getHighSpeedVideoSizes.getSyntheticsTestId(), getHighSpeedVideoSizes.getSyntheticsResultId(), null, 4, null);
                                                                            rumSessionType = this.ArtificialStackFrames;
                                                                            if (rumSessionType != null) {
                                                                                rumSessionType2 = this.ArtificialStackFrames;
                                                                                longTaskEventSessionType = com.datadog.android.rum.internal.RumSessionTypeExtKt.toLongTask(rumSessionType2);
                                                                            } else if (synthetics == null) {
                                                                                longTaskEventSessionType = com.datadog.android.rum.model.LongTaskEvent.LongTaskEventSessionType.USER;
                                                                            } else {
                                                                                longTaskEventSessionType = com.datadog.android.rum.model.LongTaskEvent.LongTaskEventSessionType.SYNTHETICS;
                                                                            }
                                                                            long j4 = j32;
                                                                            long millis = java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(addLongTask.getDurationNs());
                                                                            com.datadog.android.rum.model.LongTaskEvent.LongTask longTask = new com.datadog.android.rum.model.LongTaskEvent.LongTask(java.util.UUID.randomUUID().toString(), null, null, addLongTask.getDurationNs(), null, null, null, null, java.lang.Boolean.valueOf(z52), null, 758, null);
                                                                            java.lang.String actionId = getHighSpeedVideoSizes.getActionId();
                                                                            com.datadog.android.rum.model.LongTaskEvent.Action action = actionId != null ? new com.datadog.android.rum.model.LongTaskEvent.Action(kotlin.collections.CollectionsKt.listOf(actionId)) : null;
                                                                            java.lang.String viewId2 = getHighSpeedVideoSizes.getViewId();
                                                                            java.lang.String str3 = viewId2 == null ? "" : viewId2;
                                                                            java.lang.String viewName = getHighSpeedVideoSizes.getViewName();
                                                                            java.lang.String viewUrl = getHighSpeedVideoSizes.getViewUrl();
                                                                            com.datadog.android.rum.model.LongTaskEvent.LongTaskEventView longTaskEventView = new com.datadog.android.rum.model.LongTaskEvent.LongTaskEventView(str3, null, viewUrl == null ? "" : viewUrl, viewName, 2, null);
                                                                            com.datadog.android.rum.model.LongTaskEvent.Usr usr = com.datadog.android.rum.internal.utils.RuntimeUtilsKt.hasUserData(userInfo) ? new com.datadog.android.rum.model.LongTaskEvent.Usr(userInfo.getId(), userInfo.getName(), userInfo.getEmail(), userInfo.getAnonymousId(), kotlin.collections.MapsKt.toMutableMap(userInfo.getAdditionalProperties())) : null;
                                                                            com.datadog.android.api.context.AccountInfo accountInfo = com.datadog.android.api.context.DatadogContext.this.getAccountInfo();
                                                                            com.datadog.android.rum.model.LongTaskEvent.Account account = accountInfo != null ? new com.datadog.android.rum.model.LongTaskEvent.Account(accountInfo.getId(), accountInfo.getName(), kotlin.collections.MapsKt.toMutableMap(accountInfo.getExtraInfo())) : null;
                                                                            com.datadog.android.rum.model.LongTaskEvent.Connectivity longTaskConnectivity = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toLongTaskConnectivity(com.datadog.android.api.context.DatadogContext.this.getNetworkInfo());
                                                                            com.datadog.android.rum.model.LongTaskEvent.Application application = new com.datadog.android.rum.model.LongTaskEvent.Application(getHighSpeedVideoSizes.getApplicationId(), null, 2, null);
                                                                            com.datadog.android.rum.model.LongTaskEvent.LongTaskEventSession longTaskEventSession = new com.datadog.android.rum.model.LongTaskEvent.LongTaskEventSession(getHighSpeedVideoSizes.getSessionId(), longTaskEventSessionType, java.lang.Boolean.valueOf(this.getHasReplay()));
                                                                            com.datadog.android.rum.model.LongTaskEvent.LongTaskEventSource.Companion companion = com.datadog.android.rum.model.LongTaskEvent.LongTaskEventSource.INSTANCE;
                                                                            java.lang.String source = com.datadog.android.api.context.DatadogContext.this.getSource();
                                                                            internalSdkCore = this.coroutineBoundary;
                                                                            com.datadog.android.rum.model.LongTaskEvent.LongTaskEventSource tryFromSource = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.tryFromSource(companion, source, internalSdkCore.getInternalLogger());
                                                                            com.datadog.android.rum.model.LongTaskEvent.Os os = new com.datadog.android.rum.model.LongTaskEvent.Os(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsName(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsVersion(), null, com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsMajorVersion(), 4, null);
                                                                            com.datadog.android.rum.model.LongTaskEvent.Device device = new com.datadog.android.rum.model.LongTaskEvent.Device(com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toLongTaskSchemaType(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceType()), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceName(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceModel(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceBrand(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getArchitecture(), null, null, null, null, null, null, java.lang.Integer.valueOf(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLogicalCpuCount()), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getTotalRam(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().isLowRam(), 2016, null);
                                                                            com.datadog.android.rum.model.LongTaskEvent.Context context = new com.datadog.android.rum.model.LongTaskEvent.Context(mutableMap);
                                                                            return new com.datadog.android.rum.model.LongTaskEvent(j4 - millis, application, com.datadog.android.api.context.DatadogContext.this.getService(), com.datadog.android.api.context.DatadogContext.this.getVersion(), java.lang.String.valueOf(com.datadog.android.api.context.DatadogContext.this.getVersionCode()), com.datadog.android.api.context.DatadogContext.this.getAppBuildId(), com.datadog.android.rum.internal.utils.RumTagsUtilsKt.buildDDTagsString(com.datadog.android.api.context.DatadogContext.this), longTaskEventSession, tryFromSource, longTaskEventView, usr, account, longTaskConnectivity, null, synthetics, null, os, device, new com.datadog.android.rum.model.LongTaskEvent.Dd(new com.datadog.android.rum.model.LongTaskEvent.DdSession(null, com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toLongTaskSessionPrecondition(getHighSpeedVideoSizes.getSessionStartReason()), 1, null), new com.datadog.android.rum.model.LongTaskEvent.Configuration(java.lang.Float.valueOf(this.getSampleRate()), null, null, null, 14, null), null, null, null, null, 60, null), context, action, null, longTask, 2138112, null);
                                                                        }

                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(0);
                                                                        }
                                                                    }, 8, null);
                                                                    final com.datadog.android.rum.internal.monitor.StorageEvent storageEvent2 = !z4 ? com.datadog.android.rum.internal.monitor.StorageEvent.FrozenFrame.INSTANCE : com.datadog.android.rum.internal.monitor.StorageEvent.LongTask.INSTANCE;
                                                                    newRumEventWriteOperation$default2.onError(new kotlin.jvm.functions.Function1<com.datadog.android.rum.internal.monitor.AdvancedRumMonitor, kotlin.Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onAddLongTask$2$1
                                                                        public final void getHighResolutionOutputSizeshNQ4ISI(com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor) {
                                                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advancedRumMonitor, "");
                                                                            java.lang.String viewId2 = com.datadog.android.rum.internal.domain.RumContext.this.getViewId();
                                                                            advancedRumMonitor.eventDropped(viewId2 != null ? viewId2 : "", storageEvent2);
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor) {
                                                                            getHighResolutionOutputSizeshNQ4ISI(advancedRumMonitor);
                                                                            return kotlin.Unit.INSTANCE;
                                                                        }

                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(1);
                                                                        }
                                                                    });
                                                                    newRumEventWriteOperation$default2.onSuccess(new kotlin.jvm.functions.Function1<com.datadog.android.rum.internal.monitor.AdvancedRumMonitor, kotlin.Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onAddLongTask$2$2
                                                                        public final void getHighResolutionOutputSizeshNQ4ISI(com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor) {
                                                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advancedRumMonitor, "");
                                                                            java.lang.String viewId2 = com.datadog.android.rum.internal.domain.RumContext.this.getViewId();
                                                                            advancedRumMonitor.eventSent(viewId2 != null ? viewId2 : "", storageEvent2);
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor) {
                                                                            getHighResolutionOutputSizeshNQ4ISI(advancedRumMonitor);
                                                                            return kotlin.Unit.INSTANCE;
                                                                        }

                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(1);
                                                                        }
                                                                    });
                                                                    newRumEventWriteOperation$default2.submit();
                                                                    this.pendingLongTaskCount++;
                                                                    if (z4) {
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            final com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddError addError = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddError) event;
                                                            com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddError addError2 = addError;
                                                            Camera2StreamConfigurationMap(addError2, datadogContext, writeScope, writer);
                                                            if (!this.stopped) {
                                                                final com.datadog.android.rum.internal.domain.RumContext getHighSpeedVideoSizes2 = getGetHighSpeedVideoSizes();
                                                                final java.util.Map mutableMap2 = kotlin.collections.MapsKt.toMutableMap(getCustomAttributes());
                                                                mutableMap2.putAll(addError.getAttributes());
                                                                java.lang.Object remove = mutableMap2.remove(com.datadog.android.rum.RumAttributes.INTERNAL_ERROR_IS_CRASH);
                                                                boolean z6 = kotlin.jvm.internal.Intrinsics.areEqual(remove instanceof java.lang.Boolean ? (java.lang.Boolean) remove : null, java.lang.Boolean.TRUE) || addError.isFatal();
                                                                java.lang.Object remove2 = mutableMap2.remove("_dd.error.fingerprint");
                                                                java.lang.String str3 = remove2 instanceof java.lang.String ? (java.lang.String) remove2 : null;
                                                                if (this.getHighResolutionOutputSizeshNQ4ISI <= 0 || !z6) {
                                                                    java.lang.String type = addError.getType();
                                                                    if (type == null) {
                                                                        java.lang.Throwable throwable2 = addError.getThrowable();
                                                                        if (throwable2 == null || (cls = throwable2.getClass()) == null) {
                                                                            str = null;
                                                                            throwable = addError.getThrowable();
                                                                            if (throwable != null || (str2 = throwable.getMessage()) == null) {
                                                                                str2 = "";
                                                                            }
                                                                            if (kotlin.text.StringsKt.isBlank(str2) && !kotlin.jvm.internal.Intrinsics.areEqual(addError.getMessage(), str2)) {
                                                                                java.lang.String message2 = addError.getMessage();
                                                                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                                                sb.append(message2);
                                                                                sb.append(": ");
                                                                                sb.append(str2);
                                                                                message = sb.toString();
                                                                            } else {
                                                                                message = addError.getMessage();
                                                                            }
                                                                            final java.lang.String str4 = message;
                                                                            final java.util.Map mutableMap3 = kotlin.collections.MapsKt.toMutableMap(this.featureFlags);
                                                                            com.datadog.android.api.storage.EventType eventType = !z6 ? com.datadog.android.api.storage.EventType.CRASH : com.datadog.android.api.storage.EventType.DEFAULT;
                                                                            final com.datadog.android.rum.internal.domain.battery.BatteryInfo camera2StreamConfigurationMap = this.getHighSpeedVideoSizes.getCamera2StreamConfigurationMap();
                                                                            final com.datadog.android.rum.internal.domain.display.DisplayInfo camera2StreamConfigurationMap2 = this.getOutputFormats.getCamera2StreamConfigurationMap();
                                                                            if (!this.hasReplay) {
                                                                                com.datadog.android.rum.internal.FeaturesContextResolver featuresContextResolver2 = this.getOutputMinFrameDuration;
                                                                                java.lang.String viewId2 = getHighSpeedVideoSizes2.getViewId();
                                                                                if (!featuresContextResolver2.resolveViewHasReplay(datadogContext, viewId2 != null ? viewId2 : "")) {
                                                                                    z2 = false;
                                                                                    this.hasReplay = z2;
                                                                                    final boolean z7 = z6;
                                                                                    final java.lang.String str5 = str3;
                                                                                    final java.lang.String str6 = str;
                                                                                    com.datadog.android.rum.internal.utils.WriteOperation newRumEventWriteOperation = com.datadog.android.rum.internal.utils.SdkCoreExtKt.newRumEventWriteOperation(this.coroutineBoundary, datadogContext, writeScope, writer, eventType, new kotlin.jvm.functions.Function0<java.lang.Object>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onAddError$1
                                                                                        /* JADX WARN: Removed duplicated region for block: B:22:0x00d9 A[LOOP:0: B:20:0x00d3->B:22:0x00d9, LOOP_END] */
                                                                                        /* JADX WARN: Removed duplicated region for block: B:26:0x0102  */
                                                                                        /* JADX WARN: Removed duplicated region for block: B:29:0x010f  */
                                                                                        /* JADX WARN: Removed duplicated region for block: B:32:0x015a  */
                                                                                        /* JADX WARN: Removed duplicated region for block: B:35:0x0172  */
                                                                                        /* JADX WARN: Removed duplicated region for block: B:38:0x0185  */
                                                                                        /* JADX WARN: Removed duplicated region for block: B:41:0x019f  */
                                                                                        /* JADX WARN: Removed duplicated region for block: B:44:0x01ca  */
                                                                                        /* JADX WARN: Removed duplicated region for block: B:48:0x01e2  */
                                                                                        /* JADX WARN: Removed duplicated region for block: B:49:0x01c0  */
                                                                                        /* JADX WARN: Removed duplicated region for block: B:50:0x0188  */
                                                                                        /* JADX WARN: Removed duplicated region for block: B:51:0x0175  */
                                                                                        /* JADX WARN: Removed duplicated region for block: B:52:0x0166  */
                                                                                        /* JADX WARN: Removed duplicated region for block: B:53:0x0122  */
                                                                                        @Override // kotlin.jvm.functions.Function0
                                                                                        /*
                                                                                            Code decompiled incorrectly, please refer to instructions dump.
                                                                                        */
                                                                                        public final java.lang.Object invoke() {
                                                                                            com.datadog.android.rum.RumSessionType rumSessionType;
                                                                                            com.datadog.android.rum.model.ErrorEvent.ErrorEventSessionType errorEventSessionType;
                                                                                            long j4;
                                                                                            java.lang.String str7;
                                                                                            java.util.ArrayList arrayList;
                                                                                            com.datadog.android.core.InternalSdkCore internalSdkCore;
                                                                                            com.datadog.android.rum.RumSessionType rumSessionType2;
                                                                                            java.lang.String syntheticsResultId;
                                                                                            com.datadog.android.api.context.UserInfo userInfo = com.datadog.android.api.context.DatadogContext.this.getUserInfo();
                                                                                            java.lang.String syntheticsTestId = getHighSpeedVideoSizes2.getSyntheticsTestId();
                                                                                            com.datadog.android.rum.model.ErrorEvent.Synthetics synthetics = (syntheticsTestId == null || kotlin.text.StringsKt.isBlank(syntheticsTestId) || (syntheticsResultId = getHighSpeedVideoSizes2.getSyntheticsResultId()) == null || kotlin.text.StringsKt.isBlank(syntheticsResultId)) ? null : new com.datadog.android.rum.model.ErrorEvent.Synthetics(getHighSpeedVideoSizes2.getSyntheticsTestId(), getHighSpeedVideoSizes2.getSyntheticsResultId(), null, 4, null);
                                                                                            rumSessionType = this.ArtificialStackFrames;
                                                                                            if (rumSessionType != null) {
                                                                                                rumSessionType2 = this.ArtificialStackFrames;
                                                                                                errorEventSessionType = com.datadog.android.rum.internal.RumSessionTypeExtKt.toError(rumSessionType2);
                                                                                            } else if (synthetics == null) {
                                                                                                errorEventSessionType = com.datadog.android.rum.model.ErrorEvent.ErrorEventSessionType.USER;
                                                                                            } else {
                                                                                                errorEventSessionType = com.datadog.android.rum.model.ErrorEvent.ErrorEventSessionType.SYNTHETICS;
                                                                                            }
                                                                                            java.lang.String appBuildId = com.datadog.android.api.context.DatadogContext.this.getAppBuildId();
                                                                                            long timestamp2 = addError.getEventTime().getTimestamp();
                                                                                            j4 = this.accessartificialFrame;
                                                                                            com.datadog.android.rum.model.ErrorEvent.Context context = new com.datadog.android.rum.model.ErrorEvent.Context(mutableMap3);
                                                                                            java.lang.String obj = java.util.UUID.randomUUID().toString();
                                                                                            com.datadog.android.rum.model.ErrorEvent.ErrorSource schemaSource = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toSchemaSource(addError.getSource());
                                                                                            java.lang.String stacktrace = addError.getStacktrace();
                                                                                            if (stacktrace == null) {
                                                                                                java.lang.Throwable throwable3 = addError.getThrowable();
                                                                                                if (throwable3 == null) {
                                                                                                    str7 = null;
                                                                                                    com.datadog.android.rum.model.ErrorEvent.SourceType schemaSourceType = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toSchemaSourceType(addError.getSourceType());
                                                                                                    com.datadog.android.rum.model.ErrorEvent.Category access$tryFrom = com.datadog.android.rum.internal.domain.scope.RumViewScope.access$tryFrom(this, com.datadog.android.rum.model.ErrorEvent.Category.INSTANCE, addError);
                                                                                                    java.util.List<com.datadog.android.core.feature.event.ThreadDump> threads = addError.getThreads();
                                                                                                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(threads, 10));
                                                                                                    for (com.datadog.android.core.feature.event.ThreadDump threadDump : threads) {
                                                                                                        arrayList2.add(new com.datadog.android.rum.model.ErrorEvent.Thread(threadDump.getName(), threadDump.getCrashed(), threadDump.getStack(), threadDump.getState()));
                                                                                                    }
                                                                                                    arrayList = arrayList2;
                                                                                                    if (arrayList.isEmpty()) {
                                                                                                        arrayList = null;
                                                                                                    }
                                                                                                    java.util.ArrayList arrayList3 = arrayList;
                                                                                                    java.lang.Long timeSinceAppStartNs = addError.getTimeSinceAppStartNs();
                                                                                                    com.datadog.android.rum.model.ErrorEvent.Error error = new com.datadog.android.rum.model.ErrorEvent.Error(obj, str4, schemaSource, str7, null, java.lang.Boolean.valueOf(z7), str5, str6, access$tryFrom, null, null, schemaSourceType, null, arrayList3, null, null, null, null, timeSinceAppStartNs == null ? java.lang.Long.valueOf(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(timeSinceAppStartNs.longValue())) : null, 251408, null);
                                                                                                    java.lang.String actionId = getHighSpeedVideoSizes2.getActionId();
                                                                                                    com.datadog.android.rum.model.ErrorEvent.Action action = actionId == null ? new com.datadog.android.rum.model.ErrorEvent.Action(kotlin.collections.CollectionsKt.listOf(actionId)) : null;
                                                                                                    java.lang.String viewId3 = getHighSpeedVideoSizes2.getViewId();
                                                                                                    java.lang.String str8 = viewId3 != null ? "" : viewId3;
                                                                                                    java.lang.String viewName = getHighSpeedVideoSizes2.getViewName();
                                                                                                    java.lang.String viewUrl = getHighSpeedVideoSizes2.getViewUrl();
                                                                                                    com.datadog.android.rum.model.ErrorEvent.ErrorEventView errorEventView = new com.datadog.android.rum.model.ErrorEvent.ErrorEventView(str8, null, viewUrl != null ? "" : viewUrl, viewName, null, 18, null);
                                                                                                    com.datadog.android.rum.model.ErrorEvent.Usr usr = !com.datadog.android.rum.internal.utils.RuntimeUtilsKt.hasUserData(userInfo) ? new com.datadog.android.rum.model.ErrorEvent.Usr(userInfo.getId(), userInfo.getName(), userInfo.getEmail(), userInfo.getAnonymousId(), kotlin.collections.MapsKt.toMutableMap(userInfo.getAdditionalProperties())) : null;
                                                                                                    com.datadog.android.api.context.AccountInfo accountInfo = com.datadog.android.api.context.DatadogContext.this.getAccountInfo();
                                                                                                    com.datadog.android.rum.model.ErrorEvent.Account account = accountInfo == null ? new com.datadog.android.rum.model.ErrorEvent.Account(accountInfo.getId(), accountInfo.getName(), kotlin.collections.MapsKt.toMutableMap(accountInfo.getExtraInfo())) : null;
                                                                                                    com.datadog.android.rum.model.ErrorEvent.Connectivity errorConnectivity = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toErrorConnectivity(com.datadog.android.api.context.DatadogContext.this.getNetworkInfo());
                                                                                                    com.datadog.android.rum.model.ErrorEvent.Application application = new com.datadog.android.rum.model.ErrorEvent.Application(getHighSpeedVideoSizes2.getApplicationId(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLocaleInfo().getCurrentLocale());
                                                                                                    com.datadog.android.rum.model.ErrorEvent.ErrorEventSession errorEventSession = new com.datadog.android.rum.model.ErrorEvent.ErrorEventSession(getHighSpeedVideoSizes2.getSessionId(), errorEventSessionType, java.lang.Boolean.valueOf(this.getHasReplay()));
                                                                                                    com.datadog.android.rum.model.ErrorEvent.ErrorEventSource.Companion companion = com.datadog.android.rum.model.ErrorEvent.ErrorEventSource.INSTANCE;
                                                                                                    java.lang.String source = com.datadog.android.api.context.DatadogContext.this.getSource();
                                                                                                    internalSdkCore = this.coroutineBoundary;
                                                                                                    return new com.datadog.android.rum.model.ErrorEvent(j4 + timestamp2, application, com.datadog.android.api.context.DatadogContext.this.getService(), com.datadog.android.api.context.DatadogContext.this.getVersion(), java.lang.String.valueOf(com.datadog.android.api.context.DatadogContext.this.getVersionCode()), appBuildId, com.datadog.android.rum.internal.utils.RumTagsUtilsKt.buildDDTagsString(com.datadog.android.api.context.DatadogContext.this), errorEventSession, com.datadog.android.rum.internal.domain.scope.RumEventExtKt.tryFromSource(companion, source, internalSdkCore.getInternalLogger()), errorEventView, usr, account, errorConnectivity, null, synthetics, null, new com.datadog.android.rum.model.ErrorEvent.Os(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsName(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsVersion(), null, com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsMajorVersion(), 4, null), new com.datadog.android.rum.model.ErrorEvent.Device(com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toErrorSchemaType(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceType()), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceName(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceModel(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceBrand(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getArchitecture(), null, com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLocaleInfo().getLocales(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLocaleInfo().getTimeZone(), camera2StreamConfigurationMap.getBatteryLevel(), camera2StreamConfigurationMap.getLowPowerMode(), camera2StreamConfigurationMap2.getScreenBrightness(), java.lang.Integer.valueOf(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLogicalCpuCount()), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getTotalRam(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().isLowRam(), 32, null), new com.datadog.android.rum.model.ErrorEvent.Dd(new com.datadog.android.rum.model.ErrorEvent.DdSession(null, com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toErrorSessionPrecondition(getHighSpeedVideoSizes2.getSessionStartReason()), 1, null), new com.datadog.android.rum.model.ErrorEvent.Configuration(java.lang.Float.valueOf(this.getSampleRate()), null, null, null, 14, null), null, null, 12, null), new com.datadog.android.rum.model.ErrorEvent.Context(mutableMap2), action, null, error, null, context, 10526720, null);
                                                                                                }
                                                                                                stacktrace = com.datadog.android.internal.utils.ThrowableExtKt.loggableStackTrace(throwable3);
                                                                                            }
                                                                                            str7 = stacktrace;
                                                                                            com.datadog.android.rum.model.ErrorEvent.SourceType schemaSourceType2 = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toSchemaSourceType(addError.getSourceType());
                                                                                            com.datadog.android.rum.model.ErrorEvent.Category access$tryFrom2 = com.datadog.android.rum.internal.domain.scope.RumViewScope.access$tryFrom(this, com.datadog.android.rum.model.ErrorEvent.Category.INSTANCE, addError);
                                                                                            java.util.List<com.datadog.android.core.feature.event.ThreadDump> threads2 = addError.getThreads();
                                                                                            java.util.ArrayList arrayList22 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(threads2, 10));
                                                                                            while (r9.hasNext()) {
                                                                                            }
                                                                                            arrayList = arrayList22;
                                                                                            if (arrayList.isEmpty()) {
                                                                                            }
                                                                                            java.util.ArrayList arrayList32 = arrayList;
                                                                                            java.lang.Long timeSinceAppStartNs2 = addError.getTimeSinceAppStartNs();
                                                                                            if (timeSinceAppStartNs2 == null) {
                                                                                            }
                                                                                            com.datadog.android.rum.model.ErrorEvent.Error error2 = new com.datadog.android.rum.model.ErrorEvent.Error(obj, str4, schemaSource, str7, null, java.lang.Boolean.valueOf(z7), str5, str6, access$tryFrom2, null, null, schemaSourceType2, null, arrayList32, null, null, null, null, timeSinceAppStartNs2 == null ? java.lang.Long.valueOf(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(timeSinceAppStartNs2.longValue())) : null, 251408, null);
                                                                                            java.lang.String actionId2 = getHighSpeedVideoSizes2.getActionId();
                                                                                            if (actionId2 == null) {
                                                                                            }
                                                                                            java.lang.String viewId32 = getHighSpeedVideoSizes2.getViewId();
                                                                                            if (viewId32 != null) {
                                                                                            }
                                                                                            java.lang.String viewName2 = getHighSpeedVideoSizes2.getViewName();
                                                                                            java.lang.String viewUrl2 = getHighSpeedVideoSizes2.getViewUrl();
                                                                                            com.datadog.android.rum.model.ErrorEvent.ErrorEventView errorEventView2 = new com.datadog.android.rum.model.ErrorEvent.ErrorEventView(str8, null, viewUrl2 != null ? "" : viewUrl2, viewName2, null, 18, null);
                                                                                            if (!com.datadog.android.rum.internal.utils.RuntimeUtilsKt.hasUserData(userInfo)) {
                                                                                            }
                                                                                            com.datadog.android.api.context.AccountInfo accountInfo2 = com.datadog.android.api.context.DatadogContext.this.getAccountInfo();
                                                                                            if (accountInfo2 == null) {
                                                                                            }
                                                                                            com.datadog.android.rum.model.ErrorEvent.Connectivity errorConnectivity2 = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toErrorConnectivity(com.datadog.android.api.context.DatadogContext.this.getNetworkInfo());
                                                                                            com.datadog.android.rum.model.ErrorEvent.Application application2 = new com.datadog.android.rum.model.ErrorEvent.Application(getHighSpeedVideoSizes2.getApplicationId(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLocaleInfo().getCurrentLocale());
                                                                                            com.datadog.android.rum.model.ErrorEvent.ErrorEventSession errorEventSession2 = new com.datadog.android.rum.model.ErrorEvent.ErrorEventSession(getHighSpeedVideoSizes2.getSessionId(), errorEventSessionType, java.lang.Boolean.valueOf(this.getHasReplay()));
                                                                                            com.datadog.android.rum.model.ErrorEvent.ErrorEventSource.Companion companion2 = com.datadog.android.rum.model.ErrorEvent.ErrorEventSource.INSTANCE;
                                                                                            java.lang.String source2 = com.datadog.android.api.context.DatadogContext.this.getSource();
                                                                                            internalSdkCore = this.coroutineBoundary;
                                                                                            return new com.datadog.android.rum.model.ErrorEvent(j4 + timestamp2, application2, com.datadog.android.api.context.DatadogContext.this.getService(), com.datadog.android.api.context.DatadogContext.this.getVersion(), java.lang.String.valueOf(com.datadog.android.api.context.DatadogContext.this.getVersionCode()), appBuildId, com.datadog.android.rum.internal.utils.RumTagsUtilsKt.buildDDTagsString(com.datadog.android.api.context.DatadogContext.this), errorEventSession2, com.datadog.android.rum.internal.domain.scope.RumEventExtKt.tryFromSource(companion2, source2, internalSdkCore.getInternalLogger()), errorEventView2, usr, account, errorConnectivity2, null, synthetics, null, new com.datadog.android.rum.model.ErrorEvent.Os(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsName(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsVersion(), null, com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsMajorVersion(), 4, null), new com.datadog.android.rum.model.ErrorEvent.Device(com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toErrorSchemaType(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceType()), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceName(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceModel(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceBrand(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getArchitecture(), null, com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLocaleInfo().getLocales(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLocaleInfo().getTimeZone(), camera2StreamConfigurationMap.getBatteryLevel(), camera2StreamConfigurationMap.getLowPowerMode(), camera2StreamConfigurationMap2.getScreenBrightness(), java.lang.Integer.valueOf(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLogicalCpuCount()), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getTotalRam(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().isLowRam(), 32, null), new com.datadog.android.rum.model.ErrorEvent.Dd(new com.datadog.android.rum.model.ErrorEvent.DdSession(null, com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toErrorSessionPrecondition(getHighSpeedVideoSizes2.getSessionStartReason()), 1, null), new com.datadog.android.rum.model.ErrorEvent.Configuration(java.lang.Float.valueOf(this.getSampleRate()), null, null, null, 14, null), null, null, 12, null), new com.datadog.android.rum.model.ErrorEvent.Context(mutableMap2), action, null, error2, null, context, 10526720, null);
                                                                                        }

                                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                        {
                                                                                            super(0);
                                                                                        }
                                                                                    });
                                                                                    if (!z6) {
                                                                                        newRumEventWriteOperation.onError(new kotlin.jvm.functions.Function1<com.datadog.android.rum.internal.monitor.AdvancedRumMonitor, kotlin.Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onAddError$2$1
                                                                                            public final void getHighSpeedVideoFpsRangesFor(com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor) {
                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advancedRumMonitor, "");
                                                                                                java.lang.String viewId3 = com.datadog.android.rum.internal.domain.RumContext.this.getViewId();
                                                                                                advancedRumMonitor.eventDropped(viewId3 != null ? viewId3 : "", new com.datadog.android.rum.internal.monitor.StorageEvent.Error(null, null, 3, null));
                                                                                            }

                                                                                            @Override // kotlin.jvm.functions.Function1
                                                                                            public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor) {
                                                                                                getHighSpeedVideoFpsRangesFor(advancedRumMonitor);
                                                                                                return kotlin.Unit.INSTANCE;
                                                                                            }

                                                                                            {
                                                                                                super(1);
                                                                                            }
                                                                                        });
                                                                                        newRumEventWriteOperation.onSuccess(new kotlin.jvm.functions.Function1<com.datadog.android.rum.internal.monitor.AdvancedRumMonitor, kotlin.Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onAddError$2$2
                                                                                            public final void getHighSpeedVideoFpsRangesFor(com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor) {
                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advancedRumMonitor, "");
                                                                                                java.lang.String viewId3 = com.datadog.android.rum.internal.domain.RumContext.this.getViewId();
                                                                                                advancedRumMonitor.eventSent(viewId3 != null ? viewId3 : "", new com.datadog.android.rum.internal.monitor.StorageEvent.Error(null, null, 3, null));
                                                                                            }

                                                                                            @Override // kotlin.jvm.functions.Function1
                                                                                            public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor) {
                                                                                                getHighSpeedVideoFpsRangesFor(advancedRumMonitor);
                                                                                                return kotlin.Unit.INSTANCE;
                                                                                            }

                                                                                            {
                                                                                                super(1);
                                                                                            }
                                                                                        });
                                                                                    }
                                                                                    newRumEventWriteOperation.submit();
                                                                                    if (z6) {
                                                                                        this.getInputSizeshNQ4ISI++;
                                                                                        this.getHighResolutionOutputSizeshNQ4ISI++;
                                                                                        sendViewUpdate$dd_sdk_android_rum_release(addError2, datadogContext, writeScope, writer, eventType);
                                                                                    } else {
                                                                                        this.pendingErrorCount++;
                                                                                    }
                                                                                }
                                                                            }
                                                                            z2 = true;
                                                                            this.hasReplay = z2;
                                                                            final boolean z72 = z6;
                                                                            final java.lang.String str52 = str3;
                                                                            final java.lang.String str62 = str;
                                                                            com.datadog.android.rum.internal.utils.WriteOperation newRumEventWriteOperation2 = com.datadog.android.rum.internal.utils.SdkCoreExtKt.newRumEventWriteOperation(this.coroutineBoundary, datadogContext, writeScope, writer, eventType, new kotlin.jvm.functions.Function0<java.lang.Object>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onAddError$1
                                                                                /* JADX WARN: Removed duplicated region for block: B:22:0x00d9 A[LOOP:0: B:20:0x00d3->B:22:0x00d9, LOOP_END] */
                                                                                /* JADX WARN: Removed duplicated region for block: B:26:0x0102  */
                                                                                /* JADX WARN: Removed duplicated region for block: B:29:0x010f  */
                                                                                /* JADX WARN: Removed duplicated region for block: B:32:0x015a  */
                                                                                /* JADX WARN: Removed duplicated region for block: B:35:0x0172  */
                                                                                /* JADX WARN: Removed duplicated region for block: B:38:0x0185  */
                                                                                /* JADX WARN: Removed duplicated region for block: B:41:0x019f  */
                                                                                /* JADX WARN: Removed duplicated region for block: B:44:0x01ca  */
                                                                                /* JADX WARN: Removed duplicated region for block: B:48:0x01e2  */
                                                                                /* JADX WARN: Removed duplicated region for block: B:49:0x01c0  */
                                                                                /* JADX WARN: Removed duplicated region for block: B:50:0x0188  */
                                                                                /* JADX WARN: Removed duplicated region for block: B:51:0x0175  */
                                                                                /* JADX WARN: Removed duplicated region for block: B:52:0x0166  */
                                                                                /* JADX WARN: Removed duplicated region for block: B:53:0x0122  */
                                                                                @Override // kotlin.jvm.functions.Function0
                                                                                /*
                                                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                                                */
                                                                                public final java.lang.Object invoke() {
                                                                                    com.datadog.android.rum.RumSessionType rumSessionType;
                                                                                    com.datadog.android.rum.model.ErrorEvent.ErrorEventSessionType errorEventSessionType;
                                                                                    long j4;
                                                                                    java.lang.String str7;
                                                                                    java.util.ArrayList arrayList;
                                                                                    com.datadog.android.core.InternalSdkCore internalSdkCore;
                                                                                    com.datadog.android.rum.RumSessionType rumSessionType2;
                                                                                    java.lang.String syntheticsResultId;
                                                                                    com.datadog.android.api.context.UserInfo userInfo = com.datadog.android.api.context.DatadogContext.this.getUserInfo();
                                                                                    java.lang.String syntheticsTestId = getHighSpeedVideoSizes2.getSyntheticsTestId();
                                                                                    com.datadog.android.rum.model.ErrorEvent.Synthetics synthetics = (syntheticsTestId == null || kotlin.text.StringsKt.isBlank(syntheticsTestId) || (syntheticsResultId = getHighSpeedVideoSizes2.getSyntheticsResultId()) == null || kotlin.text.StringsKt.isBlank(syntheticsResultId)) ? null : new com.datadog.android.rum.model.ErrorEvent.Synthetics(getHighSpeedVideoSizes2.getSyntheticsTestId(), getHighSpeedVideoSizes2.getSyntheticsResultId(), null, 4, null);
                                                                                    rumSessionType = this.ArtificialStackFrames;
                                                                                    if (rumSessionType != null) {
                                                                                        rumSessionType2 = this.ArtificialStackFrames;
                                                                                        errorEventSessionType = com.datadog.android.rum.internal.RumSessionTypeExtKt.toError(rumSessionType2);
                                                                                    } else if (synthetics == null) {
                                                                                        errorEventSessionType = com.datadog.android.rum.model.ErrorEvent.ErrorEventSessionType.USER;
                                                                                    } else {
                                                                                        errorEventSessionType = com.datadog.android.rum.model.ErrorEvent.ErrorEventSessionType.SYNTHETICS;
                                                                                    }
                                                                                    java.lang.String appBuildId = com.datadog.android.api.context.DatadogContext.this.getAppBuildId();
                                                                                    long timestamp2 = addError.getEventTime().getTimestamp();
                                                                                    j4 = this.accessartificialFrame;
                                                                                    com.datadog.android.rum.model.ErrorEvent.Context context = new com.datadog.android.rum.model.ErrorEvent.Context(mutableMap3);
                                                                                    java.lang.String obj = java.util.UUID.randomUUID().toString();
                                                                                    com.datadog.android.rum.model.ErrorEvent.ErrorSource schemaSource = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toSchemaSource(addError.getSource());
                                                                                    java.lang.String stacktrace = addError.getStacktrace();
                                                                                    if (stacktrace == null) {
                                                                                        java.lang.Throwable throwable3 = addError.getThrowable();
                                                                                        if (throwable3 == null) {
                                                                                            str7 = null;
                                                                                            com.datadog.android.rum.model.ErrorEvent.SourceType schemaSourceType2 = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toSchemaSourceType(addError.getSourceType());
                                                                                            com.datadog.android.rum.model.ErrorEvent.Category access$tryFrom2 = com.datadog.android.rum.internal.domain.scope.RumViewScope.access$tryFrom(this, com.datadog.android.rum.model.ErrorEvent.Category.INSTANCE, addError);
                                                                                            java.util.List<com.datadog.android.core.feature.event.ThreadDump> threads2 = addError.getThreads();
                                                                                            java.util.ArrayList arrayList22 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(threads2, 10));
                                                                                            for (com.datadog.android.core.feature.event.ThreadDump threadDump : threads2) {
                                                                                                arrayList22.add(new com.datadog.android.rum.model.ErrorEvent.Thread(threadDump.getName(), threadDump.getCrashed(), threadDump.getStack(), threadDump.getState()));
                                                                                            }
                                                                                            arrayList = arrayList22;
                                                                                            if (arrayList.isEmpty()) {
                                                                                                arrayList = null;
                                                                                            }
                                                                                            java.util.ArrayList arrayList32 = arrayList;
                                                                                            java.lang.Long timeSinceAppStartNs2 = addError.getTimeSinceAppStartNs();
                                                                                            com.datadog.android.rum.model.ErrorEvent.Error error2 = new com.datadog.android.rum.model.ErrorEvent.Error(obj, str4, schemaSource, str7, null, java.lang.Boolean.valueOf(z72), str52, str62, access$tryFrom2, null, null, schemaSourceType2, null, arrayList32, null, null, null, null, timeSinceAppStartNs2 == null ? java.lang.Long.valueOf(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(timeSinceAppStartNs2.longValue())) : null, 251408, null);
                                                                                            java.lang.String actionId2 = getHighSpeedVideoSizes2.getActionId();
                                                                                            com.datadog.android.rum.model.ErrorEvent.Action action = actionId2 == null ? new com.datadog.android.rum.model.ErrorEvent.Action(kotlin.collections.CollectionsKt.listOf(actionId2)) : null;
                                                                                            java.lang.String viewId32 = getHighSpeedVideoSizes2.getViewId();
                                                                                            java.lang.String str8 = viewId32 != null ? "" : viewId32;
                                                                                            java.lang.String viewName2 = getHighSpeedVideoSizes2.getViewName();
                                                                                            java.lang.String viewUrl2 = getHighSpeedVideoSizes2.getViewUrl();
                                                                                            com.datadog.android.rum.model.ErrorEvent.ErrorEventView errorEventView2 = new com.datadog.android.rum.model.ErrorEvent.ErrorEventView(str8, null, viewUrl2 != null ? "" : viewUrl2, viewName2, null, 18, null);
                                                                                            com.datadog.android.rum.model.ErrorEvent.Usr usr = !com.datadog.android.rum.internal.utils.RuntimeUtilsKt.hasUserData(userInfo) ? new com.datadog.android.rum.model.ErrorEvent.Usr(userInfo.getId(), userInfo.getName(), userInfo.getEmail(), userInfo.getAnonymousId(), kotlin.collections.MapsKt.toMutableMap(userInfo.getAdditionalProperties())) : null;
                                                                                            com.datadog.android.api.context.AccountInfo accountInfo2 = com.datadog.android.api.context.DatadogContext.this.getAccountInfo();
                                                                                            com.datadog.android.rum.model.ErrorEvent.Account account = accountInfo2 == null ? new com.datadog.android.rum.model.ErrorEvent.Account(accountInfo2.getId(), accountInfo2.getName(), kotlin.collections.MapsKt.toMutableMap(accountInfo2.getExtraInfo())) : null;
                                                                                            com.datadog.android.rum.model.ErrorEvent.Connectivity errorConnectivity2 = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toErrorConnectivity(com.datadog.android.api.context.DatadogContext.this.getNetworkInfo());
                                                                                            com.datadog.android.rum.model.ErrorEvent.Application application2 = new com.datadog.android.rum.model.ErrorEvent.Application(getHighSpeedVideoSizes2.getApplicationId(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLocaleInfo().getCurrentLocale());
                                                                                            com.datadog.android.rum.model.ErrorEvent.ErrorEventSession errorEventSession2 = new com.datadog.android.rum.model.ErrorEvent.ErrorEventSession(getHighSpeedVideoSizes2.getSessionId(), errorEventSessionType, java.lang.Boolean.valueOf(this.getHasReplay()));
                                                                                            com.datadog.android.rum.model.ErrorEvent.ErrorEventSource.Companion companion2 = com.datadog.android.rum.model.ErrorEvent.ErrorEventSource.INSTANCE;
                                                                                            java.lang.String source2 = com.datadog.android.api.context.DatadogContext.this.getSource();
                                                                                            internalSdkCore = this.coroutineBoundary;
                                                                                            return new com.datadog.android.rum.model.ErrorEvent(j4 + timestamp2, application2, com.datadog.android.api.context.DatadogContext.this.getService(), com.datadog.android.api.context.DatadogContext.this.getVersion(), java.lang.String.valueOf(com.datadog.android.api.context.DatadogContext.this.getVersionCode()), appBuildId, com.datadog.android.rum.internal.utils.RumTagsUtilsKt.buildDDTagsString(com.datadog.android.api.context.DatadogContext.this), errorEventSession2, com.datadog.android.rum.internal.domain.scope.RumEventExtKt.tryFromSource(companion2, source2, internalSdkCore.getInternalLogger()), errorEventView2, usr, account, errorConnectivity2, null, synthetics, null, new com.datadog.android.rum.model.ErrorEvent.Os(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsName(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsVersion(), null, com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsMajorVersion(), 4, null), new com.datadog.android.rum.model.ErrorEvent.Device(com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toErrorSchemaType(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceType()), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceName(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceModel(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceBrand(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getArchitecture(), null, com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLocaleInfo().getLocales(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLocaleInfo().getTimeZone(), camera2StreamConfigurationMap.getBatteryLevel(), camera2StreamConfigurationMap.getLowPowerMode(), camera2StreamConfigurationMap2.getScreenBrightness(), java.lang.Integer.valueOf(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLogicalCpuCount()), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getTotalRam(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().isLowRam(), 32, null), new com.datadog.android.rum.model.ErrorEvent.Dd(new com.datadog.android.rum.model.ErrorEvent.DdSession(null, com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toErrorSessionPrecondition(getHighSpeedVideoSizes2.getSessionStartReason()), 1, null), new com.datadog.android.rum.model.ErrorEvent.Configuration(java.lang.Float.valueOf(this.getSampleRate()), null, null, null, 14, null), null, null, 12, null), new com.datadog.android.rum.model.ErrorEvent.Context(mutableMap2), action, null, error2, null, context, 10526720, null);
                                                                                        }
                                                                                        stacktrace = com.datadog.android.internal.utils.ThrowableExtKt.loggableStackTrace(throwable3);
                                                                                    }
                                                                                    str7 = stacktrace;
                                                                                    com.datadog.android.rum.model.ErrorEvent.SourceType schemaSourceType22 = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toSchemaSourceType(addError.getSourceType());
                                                                                    com.datadog.android.rum.model.ErrorEvent.Category access$tryFrom22 = com.datadog.android.rum.internal.domain.scope.RumViewScope.access$tryFrom(this, com.datadog.android.rum.model.ErrorEvent.Category.INSTANCE, addError);
                                                                                    java.util.List<com.datadog.android.core.feature.event.ThreadDump> threads22 = addError.getThreads();
                                                                                    java.util.ArrayList arrayList222 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(threads22, 10));
                                                                                    while (r9.hasNext()) {
                                                                                    }
                                                                                    arrayList = arrayList222;
                                                                                    if (arrayList.isEmpty()) {
                                                                                    }
                                                                                    java.util.ArrayList arrayList322 = arrayList;
                                                                                    java.lang.Long timeSinceAppStartNs22 = addError.getTimeSinceAppStartNs();
                                                                                    if (timeSinceAppStartNs22 == null) {
                                                                                    }
                                                                                    com.datadog.android.rum.model.ErrorEvent.Error error22 = new com.datadog.android.rum.model.ErrorEvent.Error(obj, str4, schemaSource, str7, null, java.lang.Boolean.valueOf(z72), str52, str62, access$tryFrom22, null, null, schemaSourceType22, null, arrayList322, null, null, null, null, timeSinceAppStartNs22 == null ? java.lang.Long.valueOf(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(timeSinceAppStartNs22.longValue())) : null, 251408, null);
                                                                                    java.lang.String actionId22 = getHighSpeedVideoSizes2.getActionId();
                                                                                    if (actionId22 == null) {
                                                                                    }
                                                                                    java.lang.String viewId322 = getHighSpeedVideoSizes2.getViewId();
                                                                                    if (viewId322 != null) {
                                                                                    }
                                                                                    java.lang.String viewName22 = getHighSpeedVideoSizes2.getViewName();
                                                                                    java.lang.String viewUrl22 = getHighSpeedVideoSizes2.getViewUrl();
                                                                                    com.datadog.android.rum.model.ErrorEvent.ErrorEventView errorEventView22 = new com.datadog.android.rum.model.ErrorEvent.ErrorEventView(str8, null, viewUrl22 != null ? "" : viewUrl22, viewName22, null, 18, null);
                                                                                    if (!com.datadog.android.rum.internal.utils.RuntimeUtilsKt.hasUserData(userInfo)) {
                                                                                    }
                                                                                    com.datadog.android.api.context.AccountInfo accountInfo22 = com.datadog.android.api.context.DatadogContext.this.getAccountInfo();
                                                                                    if (accountInfo22 == null) {
                                                                                    }
                                                                                    com.datadog.android.rum.model.ErrorEvent.Connectivity errorConnectivity22 = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toErrorConnectivity(com.datadog.android.api.context.DatadogContext.this.getNetworkInfo());
                                                                                    com.datadog.android.rum.model.ErrorEvent.Application application22 = new com.datadog.android.rum.model.ErrorEvent.Application(getHighSpeedVideoSizes2.getApplicationId(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLocaleInfo().getCurrentLocale());
                                                                                    com.datadog.android.rum.model.ErrorEvent.ErrorEventSession errorEventSession22 = new com.datadog.android.rum.model.ErrorEvent.ErrorEventSession(getHighSpeedVideoSizes2.getSessionId(), errorEventSessionType, java.lang.Boolean.valueOf(this.getHasReplay()));
                                                                                    com.datadog.android.rum.model.ErrorEvent.ErrorEventSource.Companion companion22 = com.datadog.android.rum.model.ErrorEvent.ErrorEventSource.INSTANCE;
                                                                                    java.lang.String source22 = com.datadog.android.api.context.DatadogContext.this.getSource();
                                                                                    internalSdkCore = this.coroutineBoundary;
                                                                                    return new com.datadog.android.rum.model.ErrorEvent(j4 + timestamp2, application22, com.datadog.android.api.context.DatadogContext.this.getService(), com.datadog.android.api.context.DatadogContext.this.getVersion(), java.lang.String.valueOf(com.datadog.android.api.context.DatadogContext.this.getVersionCode()), appBuildId, com.datadog.android.rum.internal.utils.RumTagsUtilsKt.buildDDTagsString(com.datadog.android.api.context.DatadogContext.this), errorEventSession22, com.datadog.android.rum.internal.domain.scope.RumEventExtKt.tryFromSource(companion22, source22, internalSdkCore.getInternalLogger()), errorEventView22, usr, account, errorConnectivity22, null, synthetics, null, new com.datadog.android.rum.model.ErrorEvent.Os(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsName(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsVersion(), null, com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsMajorVersion(), 4, null), new com.datadog.android.rum.model.ErrorEvent.Device(com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toErrorSchemaType(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceType()), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceName(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceModel(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceBrand(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getArchitecture(), null, com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLocaleInfo().getLocales(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLocaleInfo().getTimeZone(), camera2StreamConfigurationMap.getBatteryLevel(), camera2StreamConfigurationMap.getLowPowerMode(), camera2StreamConfigurationMap2.getScreenBrightness(), java.lang.Integer.valueOf(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLogicalCpuCount()), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getTotalRam(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().isLowRam(), 32, null), new com.datadog.android.rum.model.ErrorEvent.Dd(new com.datadog.android.rum.model.ErrorEvent.DdSession(null, com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toErrorSessionPrecondition(getHighSpeedVideoSizes2.getSessionStartReason()), 1, null), new com.datadog.android.rum.model.ErrorEvent.Configuration(java.lang.Float.valueOf(this.getSampleRate()), null, null, null, 14, null), null, null, 12, null), new com.datadog.android.rum.model.ErrorEvent.Context(mutableMap2), action, null, error22, null, context, 10526720, null);
                                                                                }

                                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                {
                                                                                    super(0);
                                                                                }
                                                                            });
                                                                            if (!z6) {
                                                                            }
                                                                            newRumEventWriteOperation2.submit();
                                                                            if (z6) {
                                                                            }
                                                                        } else {
                                                                            type = cls.getCanonicalName();
                                                                        }
                                                                    }
                                                                    str = type;
                                                                    throwable = addError.getThrowable();
                                                                    if (throwable != null) {
                                                                    }
                                                                    str2 = "";
                                                                    if (kotlin.text.StringsKt.isBlank(str2)) {
                                                                    }
                                                                    message = addError.getMessage();
                                                                    final java.lang.String str42 = message;
                                                                    final java.util.Map<java.lang.String, java.lang.Object> mutableMap32 = kotlin.collections.MapsKt.toMutableMap(this.featureFlags);
                                                                    com.datadog.android.api.storage.EventType eventType2 = !z6 ? com.datadog.android.api.storage.EventType.CRASH : com.datadog.android.api.storage.EventType.DEFAULT;
                                                                    final com.datadog.android.rum.internal.domain.battery.BatteryInfo camera2StreamConfigurationMap3 = this.getHighSpeedVideoSizes.getCamera2StreamConfigurationMap();
                                                                    final com.datadog.android.rum.internal.domain.display.DisplayInfo camera2StreamConfigurationMap22 = this.getOutputFormats.getCamera2StreamConfigurationMap();
                                                                    if (!this.hasReplay) {
                                                                    }
                                                                    z2 = true;
                                                                    this.hasReplay = z2;
                                                                    final boolean z722 = z6;
                                                                    final java.lang.String str522 = str3;
                                                                    final java.lang.String str622 = str;
                                                                    com.datadog.android.rum.internal.utils.WriteOperation newRumEventWriteOperation22 = com.datadog.android.rum.internal.utils.SdkCoreExtKt.newRumEventWriteOperation(this.coroutineBoundary, datadogContext, writeScope, writer, eventType2, new kotlin.jvm.functions.Function0<java.lang.Object>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onAddError$1
                                                                        /* JADX WARN: Removed duplicated region for block: B:22:0x00d9 A[LOOP:0: B:20:0x00d3->B:22:0x00d9, LOOP_END] */
                                                                        /* JADX WARN: Removed duplicated region for block: B:26:0x0102  */
                                                                        /* JADX WARN: Removed duplicated region for block: B:29:0x010f  */
                                                                        /* JADX WARN: Removed duplicated region for block: B:32:0x015a  */
                                                                        /* JADX WARN: Removed duplicated region for block: B:35:0x0172  */
                                                                        /* JADX WARN: Removed duplicated region for block: B:38:0x0185  */
                                                                        /* JADX WARN: Removed duplicated region for block: B:41:0x019f  */
                                                                        /* JADX WARN: Removed duplicated region for block: B:44:0x01ca  */
                                                                        /* JADX WARN: Removed duplicated region for block: B:48:0x01e2  */
                                                                        /* JADX WARN: Removed duplicated region for block: B:49:0x01c0  */
                                                                        /* JADX WARN: Removed duplicated region for block: B:50:0x0188  */
                                                                        /* JADX WARN: Removed duplicated region for block: B:51:0x0175  */
                                                                        /* JADX WARN: Removed duplicated region for block: B:52:0x0166  */
                                                                        /* JADX WARN: Removed duplicated region for block: B:53:0x0122  */
                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        /*
                                                                            Code decompiled incorrectly, please refer to instructions dump.
                                                                        */
                                                                        public final java.lang.Object invoke() {
                                                                            com.datadog.android.rum.RumSessionType rumSessionType;
                                                                            com.datadog.android.rum.model.ErrorEvent.ErrorEventSessionType errorEventSessionType;
                                                                            long j4;
                                                                            java.lang.String str7;
                                                                            java.util.ArrayList arrayList;
                                                                            com.datadog.android.core.InternalSdkCore internalSdkCore;
                                                                            com.datadog.android.rum.RumSessionType rumSessionType2;
                                                                            java.lang.String syntheticsResultId;
                                                                            com.datadog.android.api.context.UserInfo userInfo = com.datadog.android.api.context.DatadogContext.this.getUserInfo();
                                                                            java.lang.String syntheticsTestId = getHighSpeedVideoSizes2.getSyntheticsTestId();
                                                                            com.datadog.android.rum.model.ErrorEvent.Synthetics synthetics = (syntheticsTestId == null || kotlin.text.StringsKt.isBlank(syntheticsTestId) || (syntheticsResultId = getHighSpeedVideoSizes2.getSyntheticsResultId()) == null || kotlin.text.StringsKt.isBlank(syntheticsResultId)) ? null : new com.datadog.android.rum.model.ErrorEvent.Synthetics(getHighSpeedVideoSizes2.getSyntheticsTestId(), getHighSpeedVideoSizes2.getSyntheticsResultId(), null, 4, null);
                                                                            rumSessionType = this.ArtificialStackFrames;
                                                                            if (rumSessionType != null) {
                                                                                rumSessionType2 = this.ArtificialStackFrames;
                                                                                errorEventSessionType = com.datadog.android.rum.internal.RumSessionTypeExtKt.toError(rumSessionType2);
                                                                            } else if (synthetics == null) {
                                                                                errorEventSessionType = com.datadog.android.rum.model.ErrorEvent.ErrorEventSessionType.USER;
                                                                            } else {
                                                                                errorEventSessionType = com.datadog.android.rum.model.ErrorEvent.ErrorEventSessionType.SYNTHETICS;
                                                                            }
                                                                            java.lang.String appBuildId = com.datadog.android.api.context.DatadogContext.this.getAppBuildId();
                                                                            long timestamp2 = addError.getEventTime().getTimestamp();
                                                                            j4 = this.accessartificialFrame;
                                                                            com.datadog.android.rum.model.ErrorEvent.Context context = new com.datadog.android.rum.model.ErrorEvent.Context(mutableMap32);
                                                                            java.lang.String obj = java.util.UUID.randomUUID().toString();
                                                                            com.datadog.android.rum.model.ErrorEvent.ErrorSource schemaSource = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toSchemaSource(addError.getSource());
                                                                            java.lang.String stacktrace = addError.getStacktrace();
                                                                            if (stacktrace == null) {
                                                                                java.lang.Throwable throwable3 = addError.getThrowable();
                                                                                if (throwable3 == null) {
                                                                                    str7 = null;
                                                                                    com.datadog.android.rum.model.ErrorEvent.SourceType schemaSourceType22 = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toSchemaSourceType(addError.getSourceType());
                                                                                    com.datadog.android.rum.model.ErrorEvent.Category access$tryFrom22 = com.datadog.android.rum.internal.domain.scope.RumViewScope.access$tryFrom(this, com.datadog.android.rum.model.ErrorEvent.Category.INSTANCE, addError);
                                                                                    java.util.List<com.datadog.android.core.feature.event.ThreadDump> threads22 = addError.getThreads();
                                                                                    java.util.ArrayList arrayList222 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(threads22, 10));
                                                                                    for (com.datadog.android.core.feature.event.ThreadDump threadDump : threads22) {
                                                                                        arrayList222.add(new com.datadog.android.rum.model.ErrorEvent.Thread(threadDump.getName(), threadDump.getCrashed(), threadDump.getStack(), threadDump.getState()));
                                                                                    }
                                                                                    arrayList = arrayList222;
                                                                                    if (arrayList.isEmpty()) {
                                                                                        arrayList = null;
                                                                                    }
                                                                                    java.util.ArrayList arrayList322 = arrayList;
                                                                                    java.lang.Long timeSinceAppStartNs22 = addError.getTimeSinceAppStartNs();
                                                                                    com.datadog.android.rum.model.ErrorEvent.Error error22 = new com.datadog.android.rum.model.ErrorEvent.Error(obj, str42, schemaSource, str7, null, java.lang.Boolean.valueOf(z722), str522, str622, access$tryFrom22, null, null, schemaSourceType22, null, arrayList322, null, null, null, null, timeSinceAppStartNs22 == null ? java.lang.Long.valueOf(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(timeSinceAppStartNs22.longValue())) : null, 251408, null);
                                                                                    java.lang.String actionId22 = getHighSpeedVideoSizes2.getActionId();
                                                                                    com.datadog.android.rum.model.ErrorEvent.Action action = actionId22 == null ? new com.datadog.android.rum.model.ErrorEvent.Action(kotlin.collections.CollectionsKt.listOf(actionId22)) : null;
                                                                                    java.lang.String viewId322 = getHighSpeedVideoSizes2.getViewId();
                                                                                    java.lang.String str8 = viewId322 != null ? "" : viewId322;
                                                                                    java.lang.String viewName22 = getHighSpeedVideoSizes2.getViewName();
                                                                                    java.lang.String viewUrl22 = getHighSpeedVideoSizes2.getViewUrl();
                                                                                    com.datadog.android.rum.model.ErrorEvent.ErrorEventView errorEventView22 = new com.datadog.android.rum.model.ErrorEvent.ErrorEventView(str8, null, viewUrl22 != null ? "" : viewUrl22, viewName22, null, 18, null);
                                                                                    com.datadog.android.rum.model.ErrorEvent.Usr usr = !com.datadog.android.rum.internal.utils.RuntimeUtilsKt.hasUserData(userInfo) ? new com.datadog.android.rum.model.ErrorEvent.Usr(userInfo.getId(), userInfo.getName(), userInfo.getEmail(), userInfo.getAnonymousId(), kotlin.collections.MapsKt.toMutableMap(userInfo.getAdditionalProperties())) : null;
                                                                                    com.datadog.android.api.context.AccountInfo accountInfo22 = com.datadog.android.api.context.DatadogContext.this.getAccountInfo();
                                                                                    com.datadog.android.rum.model.ErrorEvent.Account account = accountInfo22 == null ? new com.datadog.android.rum.model.ErrorEvent.Account(accountInfo22.getId(), accountInfo22.getName(), kotlin.collections.MapsKt.toMutableMap(accountInfo22.getExtraInfo())) : null;
                                                                                    com.datadog.android.rum.model.ErrorEvent.Connectivity errorConnectivity22 = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toErrorConnectivity(com.datadog.android.api.context.DatadogContext.this.getNetworkInfo());
                                                                                    com.datadog.android.rum.model.ErrorEvent.Application application22 = new com.datadog.android.rum.model.ErrorEvent.Application(getHighSpeedVideoSizes2.getApplicationId(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLocaleInfo().getCurrentLocale());
                                                                                    com.datadog.android.rum.model.ErrorEvent.ErrorEventSession errorEventSession22 = new com.datadog.android.rum.model.ErrorEvent.ErrorEventSession(getHighSpeedVideoSizes2.getSessionId(), errorEventSessionType, java.lang.Boolean.valueOf(this.getHasReplay()));
                                                                                    com.datadog.android.rum.model.ErrorEvent.ErrorEventSource.Companion companion22 = com.datadog.android.rum.model.ErrorEvent.ErrorEventSource.INSTANCE;
                                                                                    java.lang.String source22 = com.datadog.android.api.context.DatadogContext.this.getSource();
                                                                                    internalSdkCore = this.coroutineBoundary;
                                                                                    return new com.datadog.android.rum.model.ErrorEvent(j4 + timestamp2, application22, com.datadog.android.api.context.DatadogContext.this.getService(), com.datadog.android.api.context.DatadogContext.this.getVersion(), java.lang.String.valueOf(com.datadog.android.api.context.DatadogContext.this.getVersionCode()), appBuildId, com.datadog.android.rum.internal.utils.RumTagsUtilsKt.buildDDTagsString(com.datadog.android.api.context.DatadogContext.this), errorEventSession22, com.datadog.android.rum.internal.domain.scope.RumEventExtKt.tryFromSource(companion22, source22, internalSdkCore.getInternalLogger()), errorEventView22, usr, account, errorConnectivity22, null, synthetics, null, new com.datadog.android.rum.model.ErrorEvent.Os(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsName(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsVersion(), null, com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsMajorVersion(), 4, null), new com.datadog.android.rum.model.ErrorEvent.Device(com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toErrorSchemaType(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceType()), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceName(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceModel(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceBrand(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getArchitecture(), null, com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLocaleInfo().getLocales(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLocaleInfo().getTimeZone(), camera2StreamConfigurationMap3.getBatteryLevel(), camera2StreamConfigurationMap3.getLowPowerMode(), camera2StreamConfigurationMap22.getScreenBrightness(), java.lang.Integer.valueOf(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLogicalCpuCount()), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getTotalRam(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().isLowRam(), 32, null), new com.datadog.android.rum.model.ErrorEvent.Dd(new com.datadog.android.rum.model.ErrorEvent.DdSession(null, com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toErrorSessionPrecondition(getHighSpeedVideoSizes2.getSessionStartReason()), 1, null), new com.datadog.android.rum.model.ErrorEvent.Configuration(java.lang.Float.valueOf(this.getSampleRate()), null, null, null, 14, null), null, null, 12, null), new com.datadog.android.rum.model.ErrorEvent.Context(mutableMap2), action, null, error22, null, context, 10526720, null);
                                                                                }
                                                                                stacktrace = com.datadog.android.internal.utils.ThrowableExtKt.loggableStackTrace(throwable3);
                                                                            }
                                                                            str7 = stacktrace;
                                                                            com.datadog.android.rum.model.ErrorEvent.SourceType schemaSourceType222 = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toSchemaSourceType(addError.getSourceType());
                                                                            com.datadog.android.rum.model.ErrorEvent.Category access$tryFrom222 = com.datadog.android.rum.internal.domain.scope.RumViewScope.access$tryFrom(this, com.datadog.android.rum.model.ErrorEvent.Category.INSTANCE, addError);
                                                                            java.util.List<com.datadog.android.core.feature.event.ThreadDump> threads222 = addError.getThreads();
                                                                            java.util.ArrayList arrayList2222 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(threads222, 10));
                                                                            while (r9.hasNext()) {
                                                                            }
                                                                            arrayList = arrayList2222;
                                                                            if (arrayList.isEmpty()) {
                                                                            }
                                                                            java.util.ArrayList arrayList3222 = arrayList;
                                                                            java.lang.Long timeSinceAppStartNs222 = addError.getTimeSinceAppStartNs();
                                                                            if (timeSinceAppStartNs222 == null) {
                                                                            }
                                                                            com.datadog.android.rum.model.ErrorEvent.Error error222 = new com.datadog.android.rum.model.ErrorEvent.Error(obj, str42, schemaSource, str7, null, java.lang.Boolean.valueOf(z722), str522, str622, access$tryFrom222, null, null, schemaSourceType222, null, arrayList3222, null, null, null, null, timeSinceAppStartNs222 == null ? java.lang.Long.valueOf(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(timeSinceAppStartNs222.longValue())) : null, 251408, null);
                                                                            java.lang.String actionId222 = getHighSpeedVideoSizes2.getActionId();
                                                                            if (actionId222 == null) {
                                                                            }
                                                                            java.lang.String viewId3222 = getHighSpeedVideoSizes2.getViewId();
                                                                            if (viewId3222 != null) {
                                                                            }
                                                                            java.lang.String viewName222 = getHighSpeedVideoSizes2.getViewName();
                                                                            java.lang.String viewUrl222 = getHighSpeedVideoSizes2.getViewUrl();
                                                                            com.datadog.android.rum.model.ErrorEvent.ErrorEventView errorEventView222 = new com.datadog.android.rum.model.ErrorEvent.ErrorEventView(str8, null, viewUrl222 != null ? "" : viewUrl222, viewName222, null, 18, null);
                                                                            if (!com.datadog.android.rum.internal.utils.RuntimeUtilsKt.hasUserData(userInfo)) {
                                                                            }
                                                                            com.datadog.android.api.context.AccountInfo accountInfo222 = com.datadog.android.api.context.DatadogContext.this.getAccountInfo();
                                                                            if (accountInfo222 == null) {
                                                                            }
                                                                            com.datadog.android.rum.model.ErrorEvent.Connectivity errorConnectivity222 = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toErrorConnectivity(com.datadog.android.api.context.DatadogContext.this.getNetworkInfo());
                                                                            com.datadog.android.rum.model.ErrorEvent.Application application222 = new com.datadog.android.rum.model.ErrorEvent.Application(getHighSpeedVideoSizes2.getApplicationId(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLocaleInfo().getCurrentLocale());
                                                                            com.datadog.android.rum.model.ErrorEvent.ErrorEventSession errorEventSession222 = new com.datadog.android.rum.model.ErrorEvent.ErrorEventSession(getHighSpeedVideoSizes2.getSessionId(), errorEventSessionType, java.lang.Boolean.valueOf(this.getHasReplay()));
                                                                            com.datadog.android.rum.model.ErrorEvent.ErrorEventSource.Companion companion222 = com.datadog.android.rum.model.ErrorEvent.ErrorEventSource.INSTANCE;
                                                                            java.lang.String source222 = com.datadog.android.api.context.DatadogContext.this.getSource();
                                                                            internalSdkCore = this.coroutineBoundary;
                                                                            return new com.datadog.android.rum.model.ErrorEvent(j4 + timestamp2, application222, com.datadog.android.api.context.DatadogContext.this.getService(), com.datadog.android.api.context.DatadogContext.this.getVersion(), java.lang.String.valueOf(com.datadog.android.api.context.DatadogContext.this.getVersionCode()), appBuildId, com.datadog.android.rum.internal.utils.RumTagsUtilsKt.buildDDTagsString(com.datadog.android.api.context.DatadogContext.this), errorEventSession222, com.datadog.android.rum.internal.domain.scope.RumEventExtKt.tryFromSource(companion222, source222, internalSdkCore.getInternalLogger()), errorEventView222, usr, account, errorConnectivity222, null, synthetics, null, new com.datadog.android.rum.model.ErrorEvent.Os(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsName(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsVersion(), null, com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsMajorVersion(), 4, null), new com.datadog.android.rum.model.ErrorEvent.Device(com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toErrorSchemaType(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceType()), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceName(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceModel(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceBrand(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getArchitecture(), null, com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLocaleInfo().getLocales(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLocaleInfo().getTimeZone(), camera2StreamConfigurationMap3.getBatteryLevel(), camera2StreamConfigurationMap3.getLowPowerMode(), camera2StreamConfigurationMap22.getScreenBrightness(), java.lang.Integer.valueOf(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLogicalCpuCount()), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getTotalRam(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().isLowRam(), 32, null), new com.datadog.android.rum.model.ErrorEvent.Dd(new com.datadog.android.rum.model.ErrorEvent.DdSession(null, com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toErrorSessionPrecondition(getHighSpeedVideoSizes2.getSessionStartReason()), 1, null), new com.datadog.android.rum.model.ErrorEvent.Configuration(java.lang.Float.valueOf(this.getSampleRate()), null, null, null, 14, null), null, null, 12, null), new com.datadog.android.rum.model.ErrorEvent.Context(mutableMap2), action, null, error222, null, context, 10526720, null);
                                                                        }

                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(0);
                                                                        }
                                                                    });
                                                                    if (!z6) {
                                                                    }
                                                                    newRumEventWriteOperation22.submit();
                                                                    if (z6) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartResource startResource = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartResource) event;
                                                        Camera2StreamConfigurationMap(startResource, datadogContext, writeScope, writer);
                                                        if (!this.stopped) {
                                                            this.activeResourceScopes.put(startResource.getKey(), com.datadog.android.rum.internal.domain.scope.RumResourceScope.INSTANCE.fromEvent(this, this.coroutineBoundary, startResource, this.firstPartyHostHeaderTypeResolver, this.accessartificialFrame, this.getOutputMinFrameDuration, this.sampleRate, this.isOutputSupportedForhNQ4ISI, this.ArtificialStackFrames, this.getOutputStallDuration));
                                                            this.pendingResourceCount++;
                                                        }
                                                    }
                                                    rumScope = null;
                                                    if (getHighSpeedVideoFpsRanges()) {
                                                    }
                                                } else {
                                                    final com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartAction startAction = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartAction) event;
                                                    Camera2StreamConfigurationMap(startAction, datadogContext, writeScope, writer);
                                                    if (!this.stopped) {
                                                        if (this.activeActionScope != null) {
                                                            if (startAction.getType() == com.datadog.android.rum.RumActionType.CUSTOM && !startAction.getWaitForStop()) {
                                                                com.datadog.android.rum.internal.domain.scope.RumScope fromEvent = com.datadog.android.rum.internal.domain.scope.RumActionScope.INSTANCE.fromEvent(this, this.coroutineBoundary, startAction, this.accessartificialFrame, this.getOutputMinFrameDuration, this.getARTIFICIAL_FRAME_PACKAGE_NAME, this.sampleRate, this.ArtificialStackFrames, this.getOutputStallDuration);
                                                                this.pendingActionCount++;
                                                                fromEvent.handleEvent(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.SendCustomActionNow(null, 1, null), datadogContext, writeScope, writer);
                                                            } else {
                                                                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.coroutineBoundary.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onStartAction$1
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                                                                    public final java.lang.String invoke() {
                                                                        java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.rum.internal.domain.scope.RumViewScope.ACTION_DROPPED_WARNING, java.util.Arrays.copyOf(new java.lang.Object[]{com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartAction.this.getType(), com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartAction.this.getName()}, 2));
                                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                                                                        return format;
                                                                    }

                                                                    {
                                                                        super(0);
                                                                    }
                                                                }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                                                            }
                                                        } else {
                                                            this.activeActionScope = com.datadog.android.rum.internal.domain.scope.RumActionScope.INSTANCE.fromEvent(this, this.coroutineBoundary, startAction, this.accessartificialFrame, this.getOutputMinFrameDuration, this.getARTIFICIAL_FRAME_PACKAGE_NAME, this.sampleRate, this.ArtificialStackFrames, this.getOutputStallDuration);
                                                            this.pendingActionCount++;
                                                        }
                                                    }
                                                }
                                            } else {
                                                final com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopView stopView = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopView) event;
                                                com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopView stopView2 = stopView;
                                                Camera2StreamConfigurationMap(stopView2, datadogContext, writeScope, writer);
                                                if (kotlin.jvm.internal.Intrinsics.areEqual(stopView.getKey().getId(), this.key.getId()) && !this.stopped) {
                                                    Camera2StreamConfigurationMap(stopView2, datadogContext, writeScope, writer, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onStopView$1
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final /* synthetic */ kotlin.Unit invoke() {
                                                            getHighResolutionOutputSizeshNQ4ISI();
                                                            return kotlin.Unit.INSTANCE;
                                                        }

                                                        public final void getHighResolutionOutputSizeshNQ4ISI() {
                                                            com.datadog.android.rum.internal.domain.scope.RumViewScope.this.getViewAttributes$dd_sdk_android_rum_release().putAll(stopView.getAttributes());
                                                            com.datadog.android.rum.internal.domain.scope.RumViewScope rumViewScope = com.datadog.android.rum.internal.domain.scope.RumViewScope.this;
                                                            rumViewScope.isOutputSupportedFor = kotlin.collections.MapsKt.toMap(rumViewScope.getParentScope().getCustomAttributes());
                                                        }

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(0);
                                                        }
                                                    });
                                                }
                                            }
                                        } else {
                                            Camera2StreamConfigurationMap((com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartView) event, datadogContext, writeScope, writer, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onStartView$1
                                                @Override // kotlin.jvm.functions.Function0
                                                public final /* synthetic */ kotlin.Unit invoke() {
                                                    getHighSpeedVideoSizes();
                                                    return kotlin.Unit.INSTANCE;
                                                }

                                                public final void getHighSpeedVideoSizes() {
                                                    com.datadog.android.rum.internal.domain.scope.RumViewScope rumViewScope = com.datadog.android.rum.internal.domain.scope.RumViewScope.this;
                                                    rumViewScope.isOutputSupportedFor = kotlin.collections.MapsKt.toMap(rumViewScope.getParentScope().getCustomAttributes());
                                                }

                                                {
                                                    super(0);
                                                }
                                            });
                                        }
                                    } else {
                                        com.datadog.android.rum.internal.domain.scope.RumRawEvent.LongTaskDropped longTaskDropped = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.LongTaskDropped) event;
                                        if (kotlin.jvm.internal.Intrinsics.areEqual(longTaskDropped.getViewId(), this.viewId)) {
                                            this.pendingLongTaskCount--;
                                            if (longTaskDropped.isFrozenFrame()) {
                                                this.pendingFrozenFrameCount--;
                                            }
                                        }
                                    }
                                } else {
                                    com.datadog.android.rum.internal.domain.scope.RumRawEvent.ErrorDropped errorDropped = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.ErrorDropped) event;
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(errorDropped.getViewId(), this.viewId)) {
                                        this.pendingErrorCount--;
                                        if (errorDropped.getResourceId() != null) {
                                            this.isOutputSupportedForhNQ4ISI.resourceWasDropped(errorDropped.getResourceId());
                                        }
                                    }
                                }
                            } else if (kotlin.jvm.internal.Intrinsics.areEqual(((com.datadog.android.rum.internal.domain.scope.RumRawEvent.ActionDropped) event).getViewId(), this.viewId)) {
                                this.pendingActionCount--;
                            }
                        } else {
                            com.datadog.android.rum.internal.domain.scope.RumRawEvent.ResourceDropped resourceDropped = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.ResourceDropped) event;
                            if (kotlin.jvm.internal.Intrinsics.areEqual(resourceDropped.getViewId(), this.viewId)) {
                                this.isOutputSupportedForhNQ4ISI.resourceWasDropped(resourceDropped.getResourceId());
                                this.pendingResourceCount--;
                            }
                        }
                    } else {
                        com.datadog.android.rum.internal.domain.scope.RumRawEvent.LongTaskSent longTaskSent = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.LongTaskSent) event;
                        if (kotlin.jvm.internal.Intrinsics.areEqual(longTaskSent.getViewId(), this.viewId)) {
                            this.pendingLongTaskCount--;
                            this.getValidOutputFormatsForInputhNQ4ISI++;
                            if (longTaskSent.isFrozenFrame()) {
                                this.pendingFrozenFrameCount--;
                                this.getInputFormats++;
                            }
                            sendViewUpdate$dd_sdk_android_rum_release$default(this, longTaskSent, datadogContext, writeScope, writer, null, 16, null);
                        }
                    }
                } else {
                    com.datadog.android.rum.internal.domain.scope.RumRawEvent.ErrorSent errorSent = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.ErrorSent) event;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(errorSent.getViewId(), this.viewId)) {
                        this.pendingErrorCount--;
                        this.getInputSizeshNQ4ISI++;
                        if (errorSent.getResourceId() != null && errorSent.getResourceEndTimestampInNanos() != null) {
                            this.isOutputSupportedForhNQ4ISI.resourceWasStopped(new com.datadog.android.rum.internal.metric.networksettled.InternalResourceContext(errorSent.getResourceId(), errorSent.getResourceEndTimestampInNanos().longValue()));
                        }
                        sendViewUpdate$dd_sdk_android_rum_release$default(this, errorSent, datadogContext, writeScope, writer, null, 16, null);
                    }
                }
            } else {
                com.datadog.android.rum.internal.domain.scope.RumRawEvent.ActionSent actionSent = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.ActionSent) event;
                if (kotlin.jvm.internal.Intrinsics.areEqual(actionSent.getViewId(), this.viewId)) {
                    this.pendingActionCount--;
                    this.getHighSpeedVideoFpsRangesFor++;
                    this.getOutputStallDurationlomOqCM += actionSent.getFrustrationCount();
                    this.getOutputMinFrameDurationlomOqCM.onActionSent(new com.datadog.android.rum.internal.metric.interactiontonextview.InternalInteractionContext(actionSent.getViewId(), actionSent.getType(), actionSent.getEventEndTimestampInNanos()));
                    sendViewUpdate$dd_sdk_android_rum_release$default(this, actionSent, datadogContext, writeScope, writer, null, 16, null);
                }
            }
        } else {
            com.datadog.android.rum.internal.domain.scope.RumRawEvent.ResourceSent resourceSent = (com.datadog.android.rum.internal.domain.scope.RumRawEvent.ResourceSent) event;
            if (kotlin.jvm.internal.Intrinsics.areEqual(resourceSent.getViewId(), this.viewId)) {
                this.pendingResourceCount--;
                this.CoroutineDebuggingKt++;
                this.isOutputSupportedForhNQ4ISI.resourceWasStopped(new com.datadog.android.rum.internal.metric.networksettled.InternalResourceContext(resourceSent.getResourceId(), resourceSent.getResourceEndTimestampInNanos()));
                sendViewUpdate$dd_sdk_android_rum_release$default(this, resourceSent, datadogContext, writeScope, writer, null, 16, null);
            }
        }
        rumScope = null;
        if (getHighSpeedVideoFpsRanges()) {
        }
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    /* renamed from: getRumContext */
    public com.datadog.android.rum.internal.domain.RumContext getGetHighSpeedVideoSizes() {
        com.datadog.android.rum.internal.domain.RumContext copy;
        com.datadog.android.rum.internal.domain.RumContext getHighSpeedVideoSizes = getParentScope().getGetHighSpeedVideoSizes();
        java.lang.String str = this.viewId;
        java.lang.String name2 = this.key.getName();
        java.lang.String str2 = this.url;
        com.datadog.android.rum.internal.domain.scope.RumScope rumScope = this.activeActionScope;
        com.datadog.android.rum.internal.domain.scope.RumActionScope rumActionScope = rumScope instanceof com.datadog.android.rum.internal.domain.scope.RumActionScope ? (com.datadog.android.rum.internal.domain.scope.RumActionScope) rumScope : null;
        copy = getHighSpeedVideoSizes.copy((r34 & 1) != 0 ? getHighSpeedVideoSizes.applicationId : null, (r34 & 2) != 0 ? getHighSpeedVideoSizes.sessionId : null, (r34 & 4) != 0 ? getHighSpeedVideoSizes.isSessionActive : false, (r34 & 8) != 0 ? getHighSpeedVideoSizes.viewId : str, (r34 & 16) != 0 ? getHighSpeedVideoSizes.viewName : name2, (r34 & 32) != 0 ? getHighSpeedVideoSizes.viewUrl : str2, (r34 & 64) != 0 ? getHighSpeedVideoSizes.actionId : rumActionScope != null ? rumActionScope.getActionId() : null, (r34 & 128) != 0 ? getHighSpeedVideoSizes.sessionState : null, (r34 & 256) != 0 ? getHighSpeedVideoSizes.sessionStartReason : null, (r34 & 512) != 0 ? getHighSpeedVideoSizes.viewType : this.type, (r34 & 1024) != 0 ? getHighSpeedVideoSizes.syntheticsTestId : null, (r34 & 2048) != 0 ? getHighSpeedVideoSizes.syntheticsResultId : null, (r34 & 4096) != 0 ? getHighSpeedVideoSizes.viewTimestamp : this.eventTimestamp, (r34 & 8192) != 0 ? getHighSpeedVideoSizes.viewTimestampOffset : this.accessartificialFrame, (r34 & 16384) != 0 ? getHighSpeedVideoSizes.hasReplay : this.hasReplay);
        return copy;
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public java.util.Map<java.lang.String, java.lang.Object> getCustomAttributes() {
        if (!this.stopped) {
            return kotlin.collections.MapsKt.plus(getParentScope().getCustomAttributes(), this.viewAttributes);
        }
        return kotlin.collections.MapsKt.plus(this.isOutputSupportedFor, this.viewAttributes);
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    /* renamed from: isActive */
    public boolean getIsActive() {
        return !this.stopped;
    }

    public final com.datadog.android.rum.internal.domain.scope.RumViewScope renew$dd_sdk_android_rum_release(com.datadog.android.rum.internal.domain.Time newEventTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newEventTime, "");
        return new com.datadog.android.rum.internal.domain.scope.RumViewScope(this, this.coroutineBoundary, this.b, this.key, newEventTime, this.getOutputSizeshNQ4ISI, this.kernelVersion, this.firstPartyHostHeaderTypeResolver, this.cpuVitalMonitor, this.memoryVitalMonitor, this.frameRateVitalMonitor, this.getOutputMinFrameDuration, this.type, this.getARTIFICIAL_FRAME_PACKAGE_NAME, this.sampleRate, this.getOutputMinFrameDurationlomOqCM, this.isOutputSupportedForhNQ4ISI, this.a, this.init, this.ArtificialStackFrames, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getOutputFormats, this.getOutputStallDuration);
    }

    private final void Camera2StreamConfigurationMap(com.datadog.android.rum.internal.domain.scope.RumRawEvent p0, com.datadog.android.api.context.DatadogContext p1, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>, kotlin.Unit> p2, com.datadog.android.api.storage.DataWriter<java.lang.Object> p3, kotlin.jvm.functions.Function0<kotlin.Unit> p4) {
        if (this.stopped) {
            return;
        }
        p4.invoke();
        this.stopped = true;
        getHighResolutionOutputSizeshNQ4ISI(p0);
        sendViewUpdate$dd_sdk_android_rum_release$default(this, p0, p1, p2, p3, null, 16, null);
        Camera2StreamConfigurationMap(p0, p1, p2, p3);
        getHighResolutionOutputSizeshNQ4ISI();
        this.cpuVitalMonitor.unregister(this.cpuVitalListener);
        this.memoryVitalMonitor.unregister(this.memoryVitalListener);
        this.frameRateVitalMonitor.unregister(this.frameRateVitalListener);
        this.isOutputSupportedForhNQ4ISI.viewWasStopped();
    }

    public static /* synthetic */ void sendViewUpdate$dd_sdk_android_rum_release$default(com.datadog.android.rum.internal.domain.scope.RumViewScope rumViewScope, com.datadog.android.rum.internal.domain.scope.RumRawEvent rumRawEvent, com.datadog.android.api.context.DatadogContext datadogContext, kotlin.jvm.functions.Function1 function1, com.datadog.android.api.storage.DataWriter dataWriter, com.datadog.android.api.storage.EventType eventType, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendViewUpdate");
        }
        if ((i & 16) != 0) {
            eventType = com.datadog.android.api.storage.EventType.DEFAULT;
        }
        rumViewScope.sendViewUpdate$dd_sdk_android_rum_release(rumRawEvent, datadogContext, function1, dataWriter, eventType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Long] */
    public final void sendViewUpdate$dd_sdk_android_rum_release(com.datadog.android.rum.internal.domain.scope.RumRawEvent event, final com.datadog.android.api.context.DatadogContext datadogContext, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>, kotlin.Unit> writeScope, com.datadog.android.api.storage.DataWriter<java.lang.Object> writer, com.datadog.android.api.storage.EventType eventType) {
        long j;
        com.datadog.android.rum.model.ViewEvent.CustomTimings customTimings;
        java.lang.Boolean valueOf;
        long j2;
        com.datadog.android.rum.internal.vitals.VitalInfo vitalInfo;
        long j3;
        java.util.ArrayList arrayList;
        java.util.List<com.datadog.android.rum.internal.domain.state.SlowFrameRecord> slowFramesRecords;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "");
        final boolean highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        final java.lang.Long resolveMetric = this.isOutputSupportedForhNQ4ISI.resolveMetric();
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = this.getOutputMinFrameDurationlomOqCM.resolveMetric(this.viewId);
        com.datadog.android.rum.internal.metric.ViewInitializationMetricsState state = this.getOutputMinFrameDurationlomOqCM.getState(this.viewId);
        if (objectRef.element == 0 && state.getNoValueReason() == com.datadog.android.rum.internal.metric.NoValueReason.InteractionToNextView.DISABLED) {
            java.lang.Object obj = this.getOutputSizes.get(com.datadog.android.rum.RumAttributes.CUSTOM_INV_VALUE);
            objectRef.element = obj instanceof java.lang.Long ? (java.lang.Long) obj : 0;
        }
        long j4 = this.version + 1;
        this.version = j4;
        long j5 = this.getHighSpeedVideoFpsRangesFor;
        final long j6 = this.getInputSizeshNQ4ISI;
        final long j7 = this.CoroutineDebuggingKt;
        final long j8 = this.getHighResolutionOutputSizeshNQ4ISI;
        final long j9 = this.getValidOutputFormatsForInputhNQ4ISI;
        final long j10 = this.getInputFormats;
        final java.lang.Double d = this.getHighSpeedVideoFpsRanges;
        final int i = this.getOutputStallDurationlomOqCM;
        com.datadog.android.rum.internal.vitals.VitalInfo vitalInfo2 = this.coroutineCreation.get(com.datadog.android.rum.RumPerformanceMetric.FLUTTER_BUILD_TIME);
        final com.datadog.android.rum.model.ViewEvent.FlutterBuildTime access$toPerformanceMetric = vitalInfo2 != null ? com.datadog.android.rum.internal.domain.scope.RumViewScope.Companion.access$toPerformanceMetric(INSTANCE, vitalInfo2) : null;
        com.datadog.android.rum.internal.vitals.VitalInfo vitalInfo3 = this.coroutineCreation.get(com.datadog.android.rum.RumPerformanceMetric.FLUTTER_RASTER_TIME);
        final com.datadog.android.rum.model.ViewEvent.FlutterBuildTime access$toPerformanceMetric2 = vitalInfo3 != null ? com.datadog.android.rum.internal.domain.scope.RumViewScope.Companion.access$toPerformanceMetric(INSTANCE, vitalInfo3) : null;
        com.datadog.android.rum.internal.vitals.VitalInfo vitalInfo4 = this.coroutineCreation.get(com.datadog.android.rum.RumPerformanceMetric.JS_FRAME_TIME);
        final com.datadog.android.rum.model.ViewEvent.FlutterBuildTime access$toInversePerformanceMetric = vitalInfo4 != null ? com.datadog.android.rum.internal.domain.scope.RumViewScope.Companion.access$toInversePerformanceMetric(INSTANCE, vitalInfo4) : null;
        if (!this.stopped) {
            getHighResolutionOutputSizeshNQ4ISI(event);
        }
        long j11 = this.stoppedNanos - this._CREATION;
        final com.datadog.android.rum.internal.domain.RumContext getHighSpeedVideoSizes = getGetHighSpeedVideoSizes();
        if (this.customTimings.isEmpty()) {
            j = j5;
            customTimings = null;
        } else {
            j = j5;
            customTimings = new com.datadog.android.rum.model.ViewEvent.CustomTimings(new java.util.LinkedHashMap(this.customTimings));
        }
        com.datadog.android.rum.internal.vitals.VitalInfo vitalInfo5 = this.unwrapAs;
        com.datadog.android.rum.internal.vitals.VitalInfo vitalInfo6 = this.getHighSpeedVideoSizesFor;
        if (vitalInfo6 == null) {
            vitalInfo6 = this.toString;
        }
        final com.datadog.android.rum.internal.vitals.VitalInfo vitalInfo7 = vitalInfo6;
        if (vitalInfo7 == null) {
            valueOf = null;
        } else {
            valueOf = java.lang.Boolean.valueOf(vitalInfo7.getMeanValue() < 55.0d);
        }
        boolean booleanValue = valueOf != null ? valueOf.booleanValue() : false;
        final java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(this.featureFlags);
        final java.util.Map mutableMap2 = kotlin.collections.MapsKt.toMutableMap(getCustomAttributes());
        com.datadog.android.rum.internal.metric.slowframes.SlowFramesListener slowFramesListener = this.a;
        com.datadog.android.rum.internal.domain.state.ViewUIPerformanceReport.Snapshot resolveReport = slowFramesListener != null ? slowFramesListener.resolveReport(this.viewId, highSpeedVideoFpsRanges, j11) : null;
        if (resolveReport == null || (slowFramesRecords = resolveReport.getSlowFramesRecords()) == null) {
            j2 = j11;
            vitalInfo = vitalInfo5;
            j3 = j4;
            arrayList = null;
        } else {
            java.util.List<com.datadog.android.rum.internal.domain.state.SlowFrameRecord> list = slowFramesRecords;
            j2 = j11;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.datadog.android.rum.internal.domain.state.SlowFrameRecord slowFrameRecord = (com.datadog.android.rum.internal.domain.state.SlowFrameRecord) it.next();
                arrayList2.add(new com.datadog.android.rum.model.ViewEvent.SlowFrame(slowFrameRecord.getStartTimestampNs() - this._CREATION, slowFrameRecord.getDurationNs()));
                vitalInfo5 = vitalInfo5;
                it = it;
                j4 = j4;
            }
            vitalInfo = vitalInfo5;
            j3 = j4;
            arrayList = arrayList2;
        }
        java.lang.Double valueOf2 = (!highSpeedVideoFpsRanges || resolveReport == null) ? null : java.lang.Double.valueOf(resolveReport.freezeFramesRate(this.stoppedNanos));
        java.lang.Double valueOf3 = (!highSpeedVideoFpsRanges || resolveReport == null) ? null : java.lang.Double.valueOf(resolveReport.slowFramesRate(this.stoppedNanos));
        this.getOutputStallDuration.onSlowFrameRate(resolveReport != null ? java.lang.Double.valueOf(resolveReport.slowFramesRate(this.stoppedNanos)) : null);
        if (highSpeedVideoFpsRanges && getGetHighSpeedVideoSizes().getSessionState() != com.datadog.android.rum.internal.domain.scope.RumSessionScope.State.NOT_TRACKED) {
            this.init.sendViewEnded(this.getOutputMinFrameDurationlomOqCM.getState(this.viewId), this.isOutputSupportedForhNQ4ISI.getState());
        }
        com.datadog.android.rum.internal.domain.accessibility.AccessibilityInfo ifChanged = this.Camera2StreamConfigurationMap.getIfChanged();
        com.datadog.android.rum.model.ViewEvent.Accessibility accessibility = ifChanged != null ? new com.datadog.android.rum.model.ViewEvent.Accessibility(ifChanged.getTextSize(), ifChanged.isScreenReaderEnabled(), null, null, null, null, ifChanged.isColorInversionEnabled(), null, null, null, null, ifChanged.isClosedCaptioningEnabled(), null, null, ifChanged.isReducedAnimationsEnabled(), null, null, ifChanged.isScreenPinningEnabled(), null, null, null, ifChanged.isRtlEnabled(), 1947580, null) : null;
        final com.datadog.android.rum.internal.domain.battery.BatteryInfo camera2StreamConfigurationMap = this.getHighSpeedVideoSizes.getCamera2StreamConfigurationMap();
        final com.datadog.android.rum.internal.domain.display.DisplayInfo camera2StreamConfigurationMap2 = this.getOutputFormats.getCamera2StreamConfigurationMap();
        java.lang.Object obj2 = this.getOutputSizes.get(com.datadog.android.rum.RumAttributes.FLUTTER_FIRST_BUILD_COMPLETE);
        java.lang.Number number = obj2 instanceof java.lang.Number ? (java.lang.Number) obj2 : null;
        com.datadog.android.rum.model.ViewEvent.Performance performance = number != null ? new com.datadog.android.rum.model.ViewEvent.Performance(null, null, null, null, null, new com.datadog.android.rum.model.ViewEvent.Fbc(number.longValue()), 31, null) : null;
        java.lang.String viewId = getHighSpeedVideoSizes.getViewId();
        java.lang.String str = viewId == null ? "" : viewId;
        this.hasReplay = this.hasReplay || this.getOutputMinFrameDuration.resolveViewHasReplay(datadogContext, str);
        final long resolveViewRecordsCount = this.getOutputMinFrameDuration.resolveViewRecordsCount(datadogContext, str);
        final long j12 = j2;
        final com.datadog.android.rum.internal.vitals.VitalInfo vitalInfo8 = vitalInfo;
        final java.lang.String str2 = str;
        final long j13 = j;
        final com.datadog.android.rum.model.ViewEvent.CustomTimings customTimings2 = customTimings;
        final boolean z = booleanValue;
        final java.util.ArrayList arrayList3 = arrayList;
        final java.lang.Double d2 = valueOf3;
        final java.lang.Double d3 = valueOf2;
        final com.datadog.android.rum.model.ViewEvent.Performance performance2 = performance;
        final com.datadog.android.rum.model.ViewEvent.Accessibility accessibility2 = accessibility;
        final long j14 = j3;
        com.datadog.android.rum.internal.utils.SdkCoreExtKt.newRumEventWriteOperation(this.coroutineBoundary, datadogContext, writeScope, writer, eventType, new kotlin.jvm.functions.Function0<java.lang.Object>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$sendViewUpdate$1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.datadog.android.rum.RumSessionType rumSessionType;
                com.datadog.android.rum.model.ViewEvent.ViewEventSessionType viewEventSessionType;
                com.datadog.android.rum.model.ViewEvent.Resource resource;
                java.lang.Double d4;
                com.datadog.android.core.InternalSdkCore internalSdkCore;
                com.datadog.android.rum.internal.metric.SessionMetricDispatcher sessionMetricDispatcher;
                java.lang.String str3;
                java.lang.Double d5;
                com.datadog.android.rum.RumSessionType rumSessionType2;
                java.lang.String syntheticsResultId;
                com.datadog.android.api.context.UserInfo userInfo = com.datadog.android.api.context.DatadogContext.this.getUserInfo();
                com.datadog.android.rum.model.ViewEvent.ReplayStats replayStats = new com.datadog.android.rum.model.ViewEvent.ReplayStats(java.lang.Long.valueOf(resolveViewRecordsCount), null, null, 6, null);
                java.lang.String syntheticsTestId = getHighSpeedVideoSizes.getSyntheticsTestId();
                com.datadog.android.rum.model.ViewEvent.Synthetics synthetics = (syntheticsTestId == null || kotlin.text.StringsKt.isBlank(syntheticsTestId) || (syntheticsResultId = getHighSpeedVideoSizes.getSyntheticsResultId()) == null || kotlin.text.StringsKt.isBlank(syntheticsResultId)) ? null : new com.datadog.android.rum.model.ViewEvent.Synthetics(getHighSpeedVideoSizes.getSyntheticsTestId(), getHighSpeedVideoSizes.getSyntheticsResultId(), null, 4, null);
                rumSessionType = this.ArtificialStackFrames;
                if (rumSessionType != null) {
                    rumSessionType2 = this.ArtificialStackFrames;
                    viewEventSessionType = com.datadog.android.rum.internal.RumSessionTypeExtKt.toView(rumSessionType2);
                } else if (synthetics == null) {
                    viewEventSessionType = com.datadog.android.rum.model.ViewEvent.ViewEventSessionType.USER;
                } else {
                    viewEventSessionType = com.datadog.android.rum.model.ViewEvent.ViewEventSessionType.SYNTHETICS;
                }
                com.datadog.android.rum.model.ViewEvent.ViewEventSessionType viewEventSessionType2 = viewEventSessionType;
                long eventTimestamp = this.getEventTimestamp();
                com.datadog.android.rum.model.ViewEvent.Context context = new com.datadog.android.rum.model.ViewEvent.Context(mutableMap);
                java.lang.String viewName = getHighSpeedVideoSizes.getViewName();
                java.lang.String viewUrl = getHighSpeedVideoSizes.getViewUrl();
                if (viewUrl == null) {
                    viewUrl = "";
                }
                java.lang.String str4 = viewUrl;
                com.datadog.android.rum.model.ViewEvent.Action action = new com.datadog.android.rum.model.ViewEvent.Action(j13);
                com.datadog.android.rum.model.ViewEvent.Resource resource2 = new com.datadog.android.rum.model.ViewEvent.Resource(j7);
                com.datadog.android.rum.model.ViewEvent.Error error = new com.datadog.android.rum.model.ViewEvent.Error(j6);
                com.datadog.android.rum.model.ViewEvent.Crash crash = new com.datadog.android.rum.model.ViewEvent.Crash(j8);
                com.datadog.android.rum.model.ViewEvent.LongTask longTask = new com.datadog.android.rum.model.ViewEvent.LongTask(j9);
                com.datadog.android.rum.model.ViewEvent.FrozenFrame frozenFrame = new com.datadog.android.rum.model.ViewEvent.FrozenFrame(j10);
                boolean z2 = highSpeedVideoFpsRanges;
                if (j12 < com.datadog.android.rum.internal.domain.scope.RumViewScope.INSTANCE.getONE_SECOND_NS$dd_sdk_android_rum_release() || (d5 = d) == null) {
                    resource = resource2;
                    d4 = null;
                } else {
                    resource = resource2;
                    d4 = java.lang.Double.valueOf((d5.doubleValue() * com.datadog.android.rum.internal.domain.scope.RumViewScope.INSTANCE.getONE_SECOND_NS$dd_sdk_android_rum_release()) / j12);
                }
                com.datadog.android.rum.internal.vitals.VitalInfo vitalInfo9 = vitalInfo8;
                java.lang.Double valueOf4 = vitalInfo9 != null ? java.lang.Double.valueOf(vitalInfo9.getMeanValue()) : null;
                com.datadog.android.rum.internal.vitals.VitalInfo vitalInfo10 = vitalInfo8;
                java.lang.Double valueOf5 = vitalInfo10 != null ? java.lang.Double.valueOf(vitalInfo10.getMaxValue()) : null;
                com.datadog.android.rum.internal.vitals.VitalInfo vitalInfo11 = vitalInfo7;
                java.lang.Double valueOf6 = vitalInfo11 != null ? java.lang.Double.valueOf(vitalInfo11.getMeanValue()) : null;
                com.datadog.android.rum.internal.vitals.VitalInfo vitalInfo12 = vitalInfo7;
                java.lang.Double valueOf7 = vitalInfo12 != null ? java.lang.Double.valueOf(vitalInfo12.getMinValue()) : null;
                com.datadog.android.rum.model.ViewEvent.Frustration frustration = new com.datadog.android.rum.model.ViewEvent.Frustration(i);
                java.lang.Long l = objectRef.element;
                com.datadog.android.rum.model.ViewEvent.ViewEventView viewEventView = new com.datadog.android.rum.model.ViewEvent.ViewEventView(str2, null, str4, viewName, this.getViewLoadingTime(), resolveMetric, l, null, j12, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, customTimings2, java.lang.Boolean.valueOf(!z2), java.lang.Boolean.valueOf(z), action, error, crash, longTask, frozenFrame, arrayList3, resource, frustration, null, valueOf4, valueOf5, d, d4, valueOf6, valueOf7, d2, d3, access$toPerformanceMetric, access$toPerformanceMetric2, access$toInversePerformanceMetric, performance2, accessibility2, 67108482, 32, null);
                com.datadog.android.rum.model.ViewEvent.Usr usr = com.datadog.android.rum.internal.utils.RuntimeUtilsKt.hasUserData(userInfo) ? new com.datadog.android.rum.model.ViewEvent.Usr(userInfo.getId(), userInfo.getName(), userInfo.getEmail(), userInfo.getAnonymousId(), kotlin.collections.MapsKt.toMutableMap(userInfo.getAdditionalProperties())) : null;
                com.datadog.android.api.context.AccountInfo accountInfo = com.datadog.android.api.context.DatadogContext.this.getAccountInfo();
                com.datadog.android.rum.model.ViewEvent.Account account = accountInfo != null ? new com.datadog.android.rum.model.ViewEvent.Account(accountInfo.getId(), accountInfo.getName(), kotlin.collections.MapsKt.toMutableMap(accountInfo.getExtraInfo())) : null;
                com.datadog.android.rum.model.ViewEvent.Application application = new com.datadog.android.rum.model.ViewEvent.Application(getHighSpeedVideoSizes.getApplicationId(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLocaleInfo().getCurrentLocale());
                com.datadog.android.rum.model.ViewEvent.ViewEventSession viewEventSession = new com.datadog.android.rum.model.ViewEvent.ViewEventSession(getHighSpeedVideoSizes.getSessionId(), viewEventSessionType2, java.lang.Boolean.valueOf(this.getHasReplay()), java.lang.Boolean.valueOf(getHighSpeedVideoSizes.isSessionActive()), null, 16, null);
                com.datadog.android.rum.model.ViewEvent.ViewEventSource.Companion companion = com.datadog.android.rum.model.ViewEvent.ViewEventSource.INSTANCE;
                java.lang.String source = com.datadog.android.api.context.DatadogContext.this.getSource();
                internalSdkCore = this.coroutineBoundary;
                com.datadog.android.rum.model.ViewEvent.ViewEventSource tryFromSource = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.tryFromSource(companion, source, internalSdkCore.getInternalLogger());
                com.datadog.android.rum.model.ViewEvent.Os os = new com.datadog.android.rum.model.ViewEvent.Os(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsName(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsVersion(), null, com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getOsMajorVersion(), 4, null);
                com.datadog.android.rum.model.ViewEvent.Device device = new com.datadog.android.rum.model.ViewEvent.Device(com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toViewSchemaType(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceType()), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceName(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceModel(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getDeviceBrand(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getArchitecture(), null, com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLocaleInfo().getLocales(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLocaleInfo().getTimeZone(), camera2StreamConfigurationMap.getBatteryLevel(), camera2StreamConfigurationMap.getLowPowerMode(), camera2StreamConfigurationMap2.getScreenBrightness(), java.lang.Integer.valueOf(com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getLogicalCpuCount()), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().getTotalRam(), com.datadog.android.api.context.DatadogContext.this.getDeviceInfo().isLowRam(), 32, null);
                com.datadog.android.rum.model.ViewEvent.Context context2 = new com.datadog.android.rum.model.ViewEvent.Context(mutableMap2);
                com.datadog.android.rum.model.ViewEvent viewEvent = new com.datadog.android.rum.model.ViewEvent(eventTimestamp, application, com.datadog.android.api.context.DatadogContext.this.getService(), com.datadog.android.api.context.DatadogContext.this.getVersion(), java.lang.String.valueOf(com.datadog.android.api.context.DatadogContext.this.getVersionCode()), com.datadog.android.api.context.DatadogContext.this.getAppBuildId(), com.datadog.android.rum.internal.utils.RumTagsUtilsKt.buildDDTagsString(com.datadog.android.api.context.DatadogContext.this), viewEventSession, tryFromSource, viewEventView, usr, account, com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toViewConnectivity(com.datadog.android.api.context.DatadogContext.this.getNetworkInfo()), null, synthetics, null, os, device, new com.datadog.android.rum.model.ViewEvent.Dd(new com.datadog.android.rum.model.ViewEvent.DdSession(null, com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toViewSessionPrecondition(getHighSpeedVideoSizes.getSessionStartReason()), 1, null), new com.datadog.android.rum.model.ViewEvent.Configuration(java.lang.Float.valueOf(this.getSampleRate()), com.datadog.android.rum.internal.domain.scope.RumViewScope.access$resolveSessionReplaySampleRate(this, com.datadog.android.api.context.DatadogContext.this), null, com.datadog.android.rum.internal.domain.scope.RumViewScope.access$resolveTraceSampleRate(this, com.datadog.android.api.context.DatadogContext.this), null, 20, null), null, null, j14, null, replayStats, null, null, 428, null), context2, null, context, null, 5283840, null);
                com.datadog.android.rum.internal.domain.scope.RumViewScope rumViewScope = this;
                sessionMetricDispatcher = rumViewScope.b;
                str3 = rumViewScope._BOUNDARY;
                sessionMetricDispatcher.onViewTracked(str3, viewEvent);
                return viewEvent;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }).submit();
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(com.datadog.android.rum.internal.domain.scope.RumRawEvent p0) {
        long nanoTime = p0.getEventTime().getNanoTime();
        this.stoppedNanos = nanoTime;
        long j = nanoTime - this._CREATION;
        this.init.onDurationResolved(j);
        if (j != 0) {
            if (j < 0) {
                this.coroutineBoundary.getInternalLogger().log(com.datadog.android.api.InternalLogger.Level.WARN, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.USER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$resolveViewDuration$2
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.rum.internal.domain.scope.RumViewScope.NEGATIVE_DURATION_WARNING_MESSAGE, java.util.Arrays.copyOf(new java.lang.Object[]{com.datadog.android.rum.internal.domain.scope.RumViewScope.this.getKey().getName()}, 1));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                        return format;
                    }

                    {
                        super(0);
                    }
                }, (java.lang.Throwable) null, false, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("view.start_ns", java.lang.Long.valueOf(this._CREATION)), kotlin.TuplesKt.to("view.end_ns", java.lang.Long.valueOf(p0.getEventTime().getNanoTime())), kotlin.TuplesKt.to(com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.VIEW_NAME, this.key.getName())));
                this.stoppedNanos = this._CREATION + 1;
                return;
            }
            return;
        }
        if ((this.type != com.datadog.android.rum.internal.domain.scope.RumViewType.BACKGROUND || !(p0 instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddError) || !((com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddError) p0).isFatal()) && !(p0 instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartView)) {
            this.coroutineBoundary.getInternalLogger().log(com.datadog.android.api.InternalLogger.Level.WARN, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.USER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$resolveViewDuration$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.rum.internal.domain.scope.RumViewScope.ZERO_DURATION_WARNING_MESSAGE, java.util.Arrays.copyOf(new java.lang.Object[]{com.datadog.android.rum.internal.domain.scope.RumViewScope.this.getKey().getName()}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                {
                    super(0);
                }
            }, (java.lang.Throwable) null, false, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.VIEW_NAME, this.key.getName())));
        }
        this.stoppedNanos = this._CREATION + 1;
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        com.datadog.android.rum.internal.domain.scope.RumViewChangedListener rumViewChangedListener = this.kernelVersion;
        if (rumViewChangedListener != null) {
            rumViewChangedListener.onViewChanged(new com.datadog.android.rum.internal.domain.scope.RumViewInfo(this.key, this.viewAttributes, getIsActive()));
        }
    }

    private final boolean getHighSpeedVideoFpsRanges() {
        return this.stopped && this.activeResourceScopes.isEmpty() && ((this.pendingActionCount + this.pendingResourceCount) + this.pendingErrorCount) + this.pendingLongTaskCount <= 0;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¹\u0001\u0010*\u001a\u00020)2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\"2\u0006\u0010(\u001a\u00020'H\u0000¢\u0006\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0000X\u0080T¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020,8\u0000X\u0080T¢\u0006\u0006\n\u0004\b/\u0010.R\u001a\u00101\u001a\u0002008\u0001X\u0080\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u00105\u001a\u00020,8\u0000X\u0081T¢\u0006\u0006\n\u0004\b5\u0010.R\u001a\u00106\u001a\u0002008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b7\u00104R\u0014\u00108\u001a\u00020,8\u0000X\u0081T¢\u0006\u0006\n\u0004\b8\u0010.R\u0014\u00109\u001a\u00020,8\u0000X\u0081T¢\u0006\u0006\n\u0004\b9\u0010.R\u0014\u0010;\u001a\u00020:8\u0000X\u0081T¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020,8\u0000X\u0081T¢\u0006\u0006\n\u0004\b=\u0010.R\u0014\u0010>\u001a\u00020,8\u0000X\u0081T¢\u0006\u0006\n\u0004\b>\u0010."}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumViewScope$Companion;", "", "<init>", "()V", "Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "parentScope", "Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;", "sessionEndedMetricDispatcher", "Lcom/datadog/android/core/InternalSdkCore;", "sdkCore", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartView;", "event", "Lcom/datadog/android/rum/internal/domain/scope/RumViewChangedListener;", "viewChangedListener", "Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "firstPartyHostHeaderTypeResolver", "Lcom/datadog/android/rum/internal/vitals/VitalMonitor;", "cpuVitalMonitor", "memoryVitalMonitor", "frameRateVitalMonitor", "", "trackFrustrations", "", "sampleRate", "Lcom/datadog/android/rum/internal/metric/interactiontonextview/InteractionToNextViewMetricResolver;", "interactionToNextViewMetricResolver", "Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;", "networkSettledResourceIdentifier", "Lcom/datadog/android/rum/internal/metric/slowframes/SlowFramesListener;", "slowFramesListener", "Lcom/datadog/android/rum/RumSessionType;", "rumSessionTypeOverride", "Lcom/datadog/android/rum/internal/domain/accessibility/AccessibilitySnapshotManager;", "accessibilitySnapshotManager", "Lcom/datadog/android/rum/internal/domain/InfoProvider;", "Lcom/datadog/android/rum/internal/domain/battery/BatteryInfo;", "batteryInfoProvider", "Lcom/datadog/android/rum/internal/domain/display/DisplayInfo;", "displayInfoProvider", "Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;", "insightsCollector", "Lcom/datadog/android/rum/internal/domain/scope/RumViewScope;", "fromEvent$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/internal/domain/scope/RumScope;Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;Lcom/datadog/android/core/InternalSdkCore;Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartView;Lcom/datadog/android/rum/internal/domain/scope/RumViewChangedListener;Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;Lcom/datadog/android/rum/internal/vitals/VitalMonitor;Lcom/datadog/android/rum/internal/vitals/VitalMonitor;Lcom/datadog/android/rum/internal/vitals/VitalMonitor;ZFLcom/datadog/android/rum/internal/metric/interactiontonextview/InteractionToNextViewMetricResolver;Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;Lcom/datadog/android/rum/internal/metric/slowframes/SlowFramesListener;Lcom/datadog/android/rum/RumSessionType;Lcom/datadog/android/rum/internal/domain/accessibility/AccessibilitySnapshotManager;Lcom/datadog/android/rum/internal/domain/InfoProvider;Lcom/datadog/android/rum/internal/domain/InfoProvider;Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;)Lcom/datadog/android/rum/internal/domain/scope/RumViewScope;", "", "ACTION_DROPPED_WARNING", "Ljava/lang/String;", "ADDING_VIEW_LOADING_TIME_DEBUG_MESSAGE_FORMAT", "", "FROZEN_FRAME_THRESHOLD_NS", "J", "getFROZEN_FRAME_THRESHOLD_NS$dd_sdk_android_rum_release", "()J", "NEGATIVE_DURATION_WARNING_MESSAGE", "ONE_SECOND_NS", "getONE_SECOND_NS$dd_sdk_android_rum_release", "OVERWRITING_VIEW_LOADING_TIME_WARNING_MESSAGE_FORMAT", "SESSION_REPLAY_SAMPLE_RATE_KEY", "", "SLOW_RENDERED_THRESHOLD_FPS", com.visa.cbp.getEncExpo.warmup, "TRACE_SAMPLE_RATE", "ZERO_DURATION_WARNING_MESSAGE"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final long getONE_SECOND_NS$dd_sdk_android_rum_release() {
            return com.datadog.android.rum.internal.domain.scope.RumViewScope.ONE_SECOND_NS;
        }

        public final long getFROZEN_FRAME_THRESHOLD_NS$dd_sdk_android_rum_release() {
            return com.datadog.android.rum.internal.domain.scope.RumViewScope.FROZEN_FRAME_THRESHOLD_NS;
        }

        public final com.datadog.android.rum.internal.domain.scope.RumViewScope fromEvent$dd_sdk_android_rum_release(com.datadog.android.rum.internal.domain.scope.RumScope parentScope, com.datadog.android.rum.internal.metric.SessionMetricDispatcher sessionEndedMetricDispatcher, com.datadog.android.core.InternalSdkCore sdkCore, com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartView event, com.datadog.android.rum.internal.domain.scope.RumViewChangedListener viewChangedListener, com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver firstPartyHostHeaderTypeResolver, com.datadog.android.rum.internal.vitals.VitalMonitor cpuVitalMonitor, com.datadog.android.rum.internal.vitals.VitalMonitor memoryVitalMonitor, com.datadog.android.rum.internal.vitals.VitalMonitor frameRateVitalMonitor, boolean trackFrustrations, float sampleRate, com.datadog.android.rum.internal.metric.interactiontonextview.InteractionToNextViewMetricResolver interactionToNextViewMetricResolver, com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier networkSettledResourceIdentifier, com.datadog.android.rum.internal.metric.slowframes.SlowFramesListener slowFramesListener, com.datadog.android.rum.RumSessionType rumSessionTypeOverride, com.datadog.android.rum.internal.domain.accessibility.AccessibilitySnapshotManager accessibilitySnapshotManager, com.datadog.android.rum.internal.domain.InfoProvider<com.datadog.android.rum.internal.domain.battery.BatteryInfo> batteryInfoProvider, com.datadog.android.rum.internal.domain.InfoProvider<com.datadog.android.rum.internal.domain.display.DisplayInfo> displayInfoProvider, com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector insightsCollector) {
            com.datadog.android.internal.attributes.ViewScopeInstrumentationType viewScopeInstrumentationType;
            com.datadog.android.internal.attributes.ViewScopeInstrumentationType.Custom custom;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentScope, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionEndedMetricDispatcher, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstPartyHostHeaderTypeResolver, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpuVitalMonitor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(memoryVitalMonitor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameRateVitalMonitor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interactionToNextViewMetricResolver, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkSettledResourceIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessibilitySnapshotManager, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batteryInfoProvider, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayInfoProvider, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(insightsCollector, "");
            com.datadog.android.rum.internal.metric.networksettled.NetworkSettledMetricResolver networkSettledMetricResolver = new com.datadog.android.rum.internal.metric.networksettled.NetworkSettledMetricResolver(networkSettledResourceIdentifier, sdkCore.getInternalLogger());
            com.datadog.android.rum.internal.domain.scope.RumViewType rumViewType = com.datadog.android.rum.internal.domain.scope.RumViewType.FOREGROUND;
            com.datadog.android.api.InternalLogger internalLogger = sdkCore.getInternalLogger();
            java.lang.Object obj = event.getAttributes().get(com.datadog.android.rum.RumAttributes.INTERNAL_INSTRUMENTATION_TYPE);
            java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            java.lang.String str2 = str;
            if (str2 != null && !kotlin.text.StringsKt.isBlank(str2)) {
                custom = com.datadog.android.internal.attributes.ViewScopeInstrumentationType.Custom.INSTANCE.create(str);
            } else {
                java.lang.Object obj2 = event.getAttributes().get(com.datadog.android.internal.attributes.LocalAttribute.Key.VIEW_SCOPE_INSTRUMENTATION_TYPE.toString());
                if (!(obj2 instanceof com.datadog.android.internal.attributes.ViewScopeInstrumentationType)) {
                    viewScopeInstrumentationType = null;
                    return new com.datadog.android.rum.internal.domain.scope.RumViewScope(parentScope, sdkCore, sessionEndedMetricDispatcher, event.getKey(), event.getEventTime(), event.getAttributes(), viewChangedListener, firstPartyHostHeaderTypeResolver, cpuVitalMonitor, memoryVitalMonitor, frameRateVitalMonitor, null, rumViewType, trackFrustrations, sampleRate, interactionToNextViewMetricResolver, networkSettledMetricResolver, slowFramesListener, new com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher(rumViewType, internalLogger, viewScopeInstrumentationType, 0.0f, 8, null), rumSessionTypeOverride, accessibilitySnapshotManager, batteryInfoProvider, displayInfoProvider, insightsCollector, 2048, null);
                }
                custom = (com.datadog.android.internal.attributes.ViewScopeInstrumentationType) obj2;
            }
            viewScopeInstrumentationType = custom;
            return new com.datadog.android.rum.internal.domain.scope.RumViewScope(parentScope, sdkCore, sessionEndedMetricDispatcher, event.getKey(), event.getEventTime(), event.getAttributes(), viewChangedListener, firstPartyHostHeaderTypeResolver, cpuVitalMonitor, memoryVitalMonitor, frameRateVitalMonitor, null, rumViewType, trackFrustrations, sampleRate, interactionToNextViewMetricResolver, networkSettledMetricResolver, slowFramesListener, new com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher(rumViewType, internalLogger, viewScopeInstrumentationType, 0.0f, 8, null), rumSessionTypeOverride, accessibilitySnapshotManager, batteryInfoProvider, displayInfoProvider, insightsCollector, 2048, null);
        }

        public static final /* synthetic */ com.datadog.android.rum.model.ViewEvent.FlutterBuildTime access$toInversePerformanceMetric(com.datadog.android.rum.internal.domain.scope.RumViewScope.Companion companion, com.datadog.android.rum.internal.vitals.VitalInfo vitalInfo) {
            double maxValue = vitalInfo.getMaxValue();
            java.lang.Double valueOf = java.lang.Double.valueOf((maxValue == 0.0d ? 0.0d : 1.0d / maxValue) * java.util.concurrent.TimeUnit.SECONDS.toNanos(1L));
            double minValue = vitalInfo.getMinValue();
            java.lang.Double valueOf2 = java.lang.Double.valueOf((minValue == 0.0d ? 0.0d : 1.0d / minValue) * java.util.concurrent.TimeUnit.SECONDS.toNanos(1L));
            double meanValue = vitalInfo.getMeanValue();
            return new com.datadog.android.rum.model.ViewEvent.FlutterBuildTime(valueOf, valueOf2, java.lang.Double.valueOf((meanValue != 0.0d ? 1.0d / meanValue : 0.0d) * java.util.concurrent.TimeUnit.SECONDS.toNanos(1L)), null, 8, null);
        }

        public static final /* synthetic */ com.datadog.android.rum.model.ViewEvent.FlutterBuildTime access$toPerformanceMetric(com.datadog.android.rum.internal.domain.scope.RumViewScope.Companion companion, com.datadog.android.rum.internal.vitals.VitalInfo vitalInfo) {
            return new com.datadog.android.rum.model.ViewEvent.FlutterBuildTime(java.lang.Double.valueOf(vitalInfo.getMinValue()), java.lang.Double.valueOf(vitalInfo.getMaxValue()), java.lang.Double.valueOf(vitalInfo.getMeanValue()), null, 8, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ com.datadog.android.rum.model.VitalOperationStepEvent access$newVitalEvent(com.datadog.android.rum.internal.domain.scope.RumViewScope rumViewScope, com.datadog.android.rum.internal.domain.scope.RumRawEvent rumRawEvent, com.datadog.android.api.context.DatadogContext datadogContext, java.lang.String str, java.lang.String str2, com.datadog.android.rum.model.VitalOperationStepEvent.StepType stepType, com.datadog.android.rum.model.VitalOperationStepEvent.FailureReason failureReason, java.util.Map map) {
        com.datadog.android.rum.model.VitalOperationStepEvent.VitalOperationStepEventSessionType vitalOperationStepEventSessionType;
        java.lang.String syntheticsResultId;
        com.datadog.android.rum.internal.domain.RumContext getHighSpeedVideoSizes = rumViewScope.getGetHighSpeedVideoSizes();
        java.lang.String syntheticsTestId = getHighSpeedVideoSizes.getSyntheticsTestId();
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        com.datadog.android.rum.model.VitalOperationStepEvent.Synthetics synthetics = (syntheticsTestId == null || kotlin.text.StringsKt.isBlank(syntheticsTestId) || (syntheticsResultId = getHighSpeedVideoSizes.getSyntheticsResultId()) == null || kotlin.text.StringsKt.isBlank(syntheticsResultId)) ? null : new com.datadog.android.rum.model.VitalOperationStepEvent.Synthetics(getHighSpeedVideoSizes.getSyntheticsTestId(), getHighSpeedVideoSizes.getSyntheticsResultId(), null, 4, null);
        com.datadog.android.rum.internal.FeaturesContextResolver featuresContextResolver = rumViewScope.getOutputMinFrameDuration;
        java.lang.String viewId = getHighSpeedVideoSizes.getViewId();
        if (viewId == null) {
            viewId = "";
        }
        boolean resolveViewHasReplay = featuresContextResolver.resolveViewHasReplay(datadogContext, viewId);
        com.datadog.android.rum.RumSessionType rumSessionType = rumViewScope.ArtificialStackFrames;
        if (rumSessionType != null) {
            vitalOperationStepEventSessionType = com.datadog.android.rum.internal.RumSessionTypeExtKt.toVital(rumSessionType);
        } else if (synthetics == null) {
            vitalOperationStepEventSessionType = com.datadog.android.rum.model.VitalOperationStepEvent.VitalOperationStepEventSessionType.USER;
        } else {
            vitalOperationStepEventSessionType = com.datadog.android.rum.model.VitalOperationStepEvent.VitalOperationStepEventSessionType.SYNTHETICS;
        }
        com.datadog.android.rum.internal.domain.battery.BatteryInfo camera2StreamConfigurationMap = rumViewScope.getHighSpeedVideoSizes.getCamera2StreamConfigurationMap();
        com.datadog.android.rum.internal.domain.display.DisplayInfo camera2StreamConfigurationMap2 = rumViewScope.getOutputFormats.getCamera2StreamConfigurationMap();
        com.datadog.android.api.context.UserInfo userInfo = datadogContext.getUserInfo();
        long timestamp = rumRawEvent.getEventTime().getTimestamp();
        long j = rumViewScope.accessartificialFrame;
        java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(rumViewScope.getCustomAttributes());
        mutableMap.putAll(map);
        com.datadog.android.rum.model.VitalOperationStepEvent.Context context = new com.datadog.android.rum.model.VitalOperationStepEvent.Context(mutableMap);
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        com.datadog.android.rum.model.VitalOperationStepEvent.Dd dd = new com.datadog.android.rum.model.VitalOperationStepEvent.Dd(new com.datadog.android.rum.model.VitalOperationStepEvent.DdSession(objArr2 == true ? 1 : 0, com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toVitalOperationStepSessionPrecondition(getHighSpeedVideoSizes.getSessionStartReason()), 1, objArr == true ? 1 : 0), new com.datadog.android.rum.model.VitalOperationStepEvent.Configuration(java.lang.Float.valueOf(rumViewScope.sampleRate), null, null, null, 14, defaultConstructorMarker), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 12, defaultConstructorMarker);
        com.datadog.android.rum.model.VitalOperationStepEvent.Application application = new com.datadog.android.rum.model.VitalOperationStepEvent.Application(getHighSpeedVideoSizes.getApplicationId(), datadogContext.getDeviceInfo().getLocaleInfo().getCurrentLocale());
        com.datadog.android.rum.model.VitalOperationStepEvent.VitalOperationStepEventSession vitalOperationStepEventSession = new com.datadog.android.rum.model.VitalOperationStepEvent.VitalOperationStepEventSession(getHighSpeedVideoSizes.getSessionId(), vitalOperationStepEventSessionType, java.lang.Boolean.valueOf(resolveViewHasReplay));
        java.lang.String viewId2 = getHighSpeedVideoSizes.getViewId();
        java.lang.String str3 = viewId2 == null ? "" : viewId2;
        java.lang.String viewName = getHighSpeedVideoSizes.getViewName();
        java.lang.String viewUrl = getHighSpeedVideoSizes.getViewUrl();
        com.datadog.android.rum.model.VitalOperationStepEvent.VitalOperationStepEventView vitalOperationStepEventView = new com.datadog.android.rum.model.VitalOperationStepEvent.VitalOperationStepEventView(str3, null, viewUrl == null ? "" : viewUrl, viewName, 2, null);
        com.datadog.android.rum.model.VitalOperationStepEvent.VitalOperationStepEventSource tryFromSource = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.tryFromSource(com.datadog.android.rum.model.VitalOperationStepEvent.VitalOperationStepEventSource.INSTANCE, datadogContext.getSource(), rumViewScope.coroutineBoundary.getInternalLogger());
        com.datadog.android.api.context.AccountInfo accountInfo = datadogContext.getAccountInfo();
        com.datadog.android.rum.model.VitalOperationStepEvent.Account account = accountInfo != null ? new com.datadog.android.rum.model.VitalOperationStepEvent.Account(accountInfo.getId(), accountInfo.getName(), kotlin.collections.MapsKt.toMutableMap(accountInfo.getExtraInfo())) : null;
        com.datadog.android.rum.model.VitalOperationStepEvent.Usr usr = com.datadog.android.rum.internal.utils.RuntimeUtilsKt.hasUserData(userInfo) ? new com.datadog.android.rum.model.VitalOperationStepEvent.Usr(userInfo.getId(), userInfo.getName(), userInfo.getEmail(), userInfo.getAnonymousId(), kotlin.collections.MapsKt.toMutableMap(userInfo.getAdditionalProperties())) : null;
        com.datadog.android.rum.model.VitalOperationStepEvent.Device device = new com.datadog.android.rum.model.VitalOperationStepEvent.Device(com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toVitalOperationStepSchemaType(datadogContext.getDeviceInfo().getDeviceType()), datadogContext.getDeviceInfo().getDeviceName(), datadogContext.getDeviceInfo().getDeviceModel(), datadogContext.getDeviceInfo().getDeviceBrand(), datadogContext.getDeviceInfo().getArchitecture(), null, datadogContext.getDeviceInfo().getLocaleInfo().getLocales(), datadogContext.getDeviceInfo().getLocaleInfo().getTimeZone(), camera2StreamConfigurationMap.getBatteryLevel(), camera2StreamConfigurationMap.getLowPowerMode(), camera2StreamConfigurationMap2.getScreenBrightness(), java.lang.Integer.valueOf(datadogContext.getDeviceInfo().getLogicalCpuCount()), datadogContext.getDeviceInfo().getTotalRam(), datadogContext.getDeviceInfo().isLowRam(), 32, null);
        java.lang.String str4 = null;
        com.datadog.android.rum.model.VitalOperationStepEvent.Os os = new com.datadog.android.rum.model.VitalOperationStepEvent.Os(datadogContext.getDeviceInfo().getOsName(), datadogContext.getDeviceInfo().getOsVersion(), str4, datadogContext.getDeviceInfo().getOsMajorVersion(), 4, 0 == true ? 1 : 0);
        com.datadog.android.rum.model.VitalOperationStepEvent.Connectivity vitalOperationStepConnectivity = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toVitalOperationStepConnectivity(datadogContext.getNetworkInfo());
        java.lang.String version = datadogContext.getVersion();
        int versionCode = datadogContext.getVersionCode();
        java.lang.String appBuildId = datadogContext.getAppBuildId();
        java.lang.String service = datadogContext.getService();
        java.lang.String buildDDTagsString = com.datadog.android.rum.internal.utils.RumTagsUtilsKt.buildDDTagsString(datadogContext);
        java.lang.String obj = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return new com.datadog.android.rum.model.VitalOperationStepEvent(timestamp + j, application, service, version, java.lang.String.valueOf(versionCode), appBuildId, buildDDTagsString, vitalOperationStepEventSession, tryFromSource, vitalOperationStepEventView, usr, account, vitalOperationStepConnectivity, null, synthetics, null, os, device, dd, context, null, new com.datadog.android.rum.model.VitalOperationStepEvent.Vital(obj, str, str4, str2, stepType, failureReason, 4, null), 1089536, null);
    }

    public static final /* synthetic */ java.lang.Long access$resolveSessionReplaySampleRate(com.datadog.android.rum.internal.domain.scope.RumViewScope rumViewScope, com.datadog.android.api.context.DatadogContext datadogContext) {
        java.util.Map<java.lang.String, java.lang.Object> map = datadogContext.getFeaturesContext().get("session-replay");
        java.lang.Object obj = map != null ? map.get("session_replay_sample_rate") : null;
        if (obj instanceof java.lang.Long) {
            return (java.lang.Long) obj;
        }
        return null;
    }

    public static final /* synthetic */ java.lang.Float access$resolveTraceSampleRate(com.datadog.android.rum.internal.domain.scope.RumViewScope rumViewScope, com.datadog.android.api.context.DatadogContext datadogContext) {
        java.util.Map<java.lang.String, java.lang.Object> map = datadogContext.getFeaturesContext().get("tracing");
        java.lang.Object obj = map != null ? map.get("okhttp_interceptor_sample_rate") : null;
        if (obj instanceof java.lang.Float) {
            return (java.lang.Float) obj;
        }
        return null;
    }

    public static final /* synthetic */ com.datadog.android.rum.model.ErrorEvent.Category access$tryFrom(com.datadog.android.rum.internal.domain.scope.RumViewScope rumViewScope, com.datadog.android.rum.model.ErrorEvent.Category.Companion companion, com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddError addError) {
        if (addError.getThrowable() != null) {
            return addError.getThrowable() instanceof com.datadog.android.rum.internal.anr.ANRException ? com.datadog.android.rum.model.ErrorEvent.Category.ANR : com.datadog.android.rum.model.ErrorEvent.Category.EXCEPTION;
        }
        if (addError.getStacktrace() != null) {
            return com.datadog.android.rum.model.ErrorEvent.Category.EXCEPTION;
        }
        return null;
    }

    private final void Camera2StreamConfigurationMap(com.datadog.android.rum.internal.domain.scope.RumRawEvent p0, com.datadog.android.api.context.DatadogContext p1, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>, kotlin.Unit> p2, com.datadog.android.api.storage.DataWriter<java.lang.Object> p3) {
        java.util.Iterator<java.util.Map.Entry<java.lang.Object, com.datadog.android.rum.internal.domain.scope.RumScope>> it = this.activeResourceScopes.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().handleEvent(p0, p1, p2, p3) == null) {
                if ((p0 instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResourceWithError) || (p0 instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResourceWithStackTrace)) {
                    this.pendingResourceCount--;
                    this.pendingErrorCount++;
                }
                it.remove();
            }
        }
        com.datadog.android.rum.internal.domain.scope.RumScope rumScope = this.activeActionScope;
        if (rumScope == null || rumScope.handleEvent(p0, p1, p2, p3) != null) {
            return;
        }
        this.activeActionScope = null;
    }
}
