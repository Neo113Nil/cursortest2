package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000¨\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B'\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0013\u001a\u00020\u00102\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\u0015\u001a\u00020\u00102\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\"\u0010\u0017\u001a\u00020\u00162\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\"\u0010\u0019\u001a\u00020\u00162\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u00102\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\"\u0010 \u001a\u00020\u00102\u0011\u0010\u001f\u001a\r\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u0011H\u0002¢\u0006\u0004\b \u0010\u0014J*\u0010#\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020!2\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u0011H\u0002¢\u0006\u0004\b#\u0010$J\"\u0010%\u001a\u00020\u00102\u0011\u0010\u001f\u001a\r\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u0011H\u0002¢\u0006\u0004\b%\u0010\u0014J\u000f\u0010&\u001a\u00020\u0010H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010#\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010(J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b,\u0010-J\u0015\u00100\u001a\u00020\u00102\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u000f\u0010 \u001a\u00020\u0010H\u0002¢\u0006\u0004\b \u0010'J\u000f\u00102\u001a\u00020\u0010H\u0002¢\u0006\u0004\b2\u0010'J\u000f\u00103\u001a\u00020\u0010H\u0002¢\u0006\u0004\b3\u0010'J\"\u00104\u001a\u00020\u00102\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u0011H\u0016¢\u0006\u0004\b4\u0010\u0014J\u000f\u00105\u001a\u00020\u0010H\u0000¢\u0006\u0004\b5\u0010'J\u000f\u00106\u001a\u00020\u0010H\u0016¢\u0006\u0004\b6\u0010'J\u001d\u0010:\u001a\u00020\u00102\f\u00109\u001a\b\u0012\u0004\u0012\u00020807H\u0016¢\u0006\u0004\b:\u0010;J\u001d\u0010<\u001a\u00020!2\f\u00109\u001a\b\u0012\u0004\u0012\u00020807H\u0016¢\u0006\u0004\b<\u0010=J\u001d\u0010?\u001a\u00020\u00102\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b?\u0010@J6\u0010G\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u0002080E0D2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020!0AH\u0080\b¢\u0006\u0004\bG\u0010HJ\u001f\u00103\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u0002082\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b3\u0010IJ%\u00102\u001a\u00020\u00102\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u000208072\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b2\u0010JJ\u000f\u0010%\u001a\u00020\u0010H\u0002¢\u0006\u0004\b%\u0010'J\u0017\u0010L\u001a\u00020\u00102\u0006\u0010K\u001a\u000208H\u0016¢\u0006\u0004\bL\u0010MJ\u0017\u0010%\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u000208H\u0002¢\u0006\u0004\b%\u0010MJ\u0017\u0010N\u001a\u00020\u00102\u0006\u0010K\u001a\u000208H\u0016¢\u0006\u0004\bN\u0010MJ\u000f\u0010O\u001a\u00020!H\u0016¢\u0006\u0004\bO\u0010(J+\u0010R\u001a\u00020\u00102\u001a\u0010Q\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020P\u0012\u0006\u0012\u0004\u0018\u00010P0E0DH\u0016¢\u0006\u0004\bR\u0010SJ\u0017\u0010V\u001a\u00020\u00102\u0006\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bV\u0010WJ\u0017\u0010#\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020XH\u0002¢\u0006\u0004\b#\u0010YJ\u000f\u0010Z\u001a\u00020\u0010H\u0016¢\u0006\u0004\bZ\u0010'J\u000f\u0010[\u001a\u00020\u0010H\u0016¢\u0006\u0004\b[\u0010'J\u000f\u0010\\\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\\\u0010'J\u000f\u0010]\u001a\u00020\u0010H\u0016¢\u0006\u0004\b]\u0010'J\u000f\u0010^\u001a\u00020\u0010H\u0016¢\u0006\u0004\b^\u0010'J\u000f\u0010_\u001a\u00020\u0010H\u0016¢\u0006\u0004\b_\u0010'J5\u0010c\u001a\u00028\u0000\"\u0004\b\u0000\u0010`2\b\u0010a\u001a\u0004\u0018\u00010\u00012\u0006\u0010b\u001a\u00020.2\f\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\bc\u0010dJ\u001b\u0010g\u001a\u0004\u0018\u00010e2\b\u0010f\u001a\u0004\u0018\u00010eH\u0016¢\u0006\u0004\bg\u0010hJ!\u0010l\u001a\u00020k2\u0006\u0010i\u001a\u00020F2\b\u0010j\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\bl\u0010mJ\u0017\u0010n\u001a\u00020\u00102\u0006\u0010i\u001a\u00020FH\u0016¢\u0006\u0004\bn\u0010oJ%\u0010r\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010p2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000qH\u0016¢\u0006\u0004\br\u0010sJ!\u0010%\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020F2\b\u0010\"\u001a\u0004\u0018\u000108H\u0002¢\u0006\u0004\b%\u0010tJ)\u00103\u001a\u00020k2\u0006\u0010\u001f\u001a\u00020F2\u0006\u0010\"\u001a\u00020B2\b\u0010u\u001a\u0004\u0018\u000108H\u0002¢\u0006\u0004\b3\u0010vJ\u001f\u0010w\u001a\u00020\u00102\u0006\u0010j\u001a\u0002082\u0006\u0010i\u001a\u00020FH\u0000¢\u0006\u0004\bw\u0010xJ\u001b\u0010z\u001a\u00020\u00102\n\u0010U\u001a\u0006\u0012\u0002\b\u00030yH\u0000¢\u0006\u0004\bz\u0010{J\u001b\u0010}\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u0002080|H\u0002¢\u0006\u0004\b}\u0010~J\u0018\u00102\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u007fH\u0002¢\u0006\u0005\b2\u0010\u0080\u0001J\u0014\u0010\u0081\u0001\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0011\u0010\u0083\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b\u0083\u0001\u0010'J\u0012\u0010\u0084\u0001\u001a\u00020.H\u0000¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001a\u0010\b\u001a\u00020\u00078\u0007¢\u0006\u000f\n\u0005\b\b\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0019\u0010%\u001a\u0006\u0012\u0002\b\u00030\t8\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b%\u0010\u0089\u0001R,\u00103\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u0001080\u008a\u0001j\u000b\u0012\u0006\u0012\u0004\u0018\u000108`\u008b\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001b\u00102\u001a\u000708j\u0003`\u008e\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001d\u0010#\u001a\n\u0012\u0005\u0012\u00030\u0092\u00010\u0091\u00018\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b3\u0010\u0093\u0001R&\u0010\u0094\u0001\u001a\u00020\u007f8\u0001X\u0080\u0004¢\u0006\u0017\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u0012\u0005\b\u0098\u0001\u0010'\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\"\u0010 \u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020F0|8\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001d\u0010\u009d\u0001\u001a\b\u0012\u0004\u0012\u000208078AX\u0080\u0004¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001d\u0010}\u001a\t\u0012\u0004\u0012\u00020F0\u009e\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u001d\u0010¡\u0001\u001a\t\u0012\u0004\u0012\u00020F0\u009e\u00018\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b2\u0010 \u0001R&\u0010&\u001a\u0012\u0012\u0004\u0012\u000208\u0012\b\u0012\u0006\u0012\u0002\b\u00030y0|8\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u009a\u0001R\u001d\u0010£\u0001\u001a\b\u0012\u0004\u0012\u000208078AX\u0080\u0004¢\u0006\b\u001a\u0006\b¢\u0001\u0010\u009c\u0001R\u001d\u0010¦\u0001\u001a\b\u0012\u0004\u0012\u00020F0D8AX\u0080\u0004¢\u0006\b\u001a\u0006\b¤\u0001\u0010¥\u0001R\u0016\u0010\u0081\u0001\u001a\u00020X8\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b#\u0010§\u0001R\u0017\u0010\u009f\u0001\u001a\u00020X8\u0002X\u0083\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010§\u0001R#\u0010\u008f\u0001\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020F0|8\u0002X\u0083\u0004¢\u0006\b\n\u0006\b©\u0001\u0010\u009a\u0001R$\u0010\u0099\u0001\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u0002080|8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b}\u0010\u009a\u0001R/\u0010ª\u0001\u001a\u00020!8\u0001@\u0001X\u0080\u000e¢\u0006\u001e\n\u0006\bª\u0001\u0010«\u0001\u0012\u0005\b¯\u0001\u0010'\u001a\u0005\b¬\u0001\u0010(\"\u0006\b\u00ad\u0001\u0010®\u0001R\u001b\u0010¨\u0001\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u001c\u0010©\u0001\u001a\u0005\u0018\u00010²\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R\u001b\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010µ\u0001R\u0018\u0010³\u0001\u001a\u00020.8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b&\u0010¶\u0001R \u0010¸\u0001\u001a\u00030·\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\b¸\u0001\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001R\u0018\u0010½\u0001\u001a\u00030¼\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R \u0010À\u0001\u001a\u00030¿\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\bÀ\u0001\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001R\u0018\u0010Å\u0001\u001a\u0004\u0018\u00010\u000b8\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b \u0010Ä\u0001R\u0013\u0010\f\u001a\u00020\u000b8G¢\u0006\b\u001a\u0006\bÆ\u0001\u0010Ç\u0001R\u001e\u0010È\u0001\u001a\u00020!8\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\bÈ\u0001\u0010«\u0001\u001a\u0005\bÈ\u0001\u0010(R\u0019\u0010°\u0001\u001a\u00020.8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010¶\u0001R\u0016\u0010É\u0001\u001a\u00020!8CX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¡\u0001\u0010(R3\u0010Ê\u0001\u001a\r\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0017\n\u0006\bÊ\u0001\u0010Ë\u0001\u001a\u0006\bÌ\u0001\u0010Í\u0001\"\u0005\bÎ\u0001\u0010\u0014R\u0016\u0010Ï\u0001\u001a\u00020!8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÏ\u0001\u0010(R\u0016\u0010Ð\u0001\u001a\u00020!8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÐ\u0001\u0010(R\u0016\u0010Ò\u0001\u001a\u00020!8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÑ\u0001\u0010(R\u0016\u0010Ô\u0001\u001a\u00020!8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÓ\u0001\u0010("}, d2 = {"Landroidx/compose/runtime/CompositionImpl;", "Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/ReusableComposition;", "Landroidx/compose/runtime/RecomposeScopeOwner;", "Landroidx/compose/runtime/CompositionServices;", "Landroidx/compose/runtime/PausableComposition;", "Landroidx/compose/runtime/tooling/ObservableComposition;", "Landroidx/compose/runtime/CompositionContext;", "parent", "Landroidx/compose/runtime/Applier;", "applier", "Lkotlin/coroutines/CoroutineContext;", "recomposeContext", "<init>", "(Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/Applier;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "setContentWithReuse", "Landroidx/compose/runtime/PausedComposition;", "setPausableContent", "(Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/PausedComposition;", "setPausableContentWithReuse", "Landroidx/collection/ScatterSet;", "Landroidx/compose/runtime/RememberObserverHolder;", "ignoreSet", "pausedCompositionFinished$runtime", "(Landroidx/collection/ScatterSet;)V", "p0", "Camera2StreamConfigurationMap", "", "p1", "getHighSpeedVideoSizes", "(ZLkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/PausedComposition;", "getHighSpeedVideoFpsRangesFor", "getOutputFormats", "()V", "()Z", "Landroidx/compose/runtime/tooling/CompositionObserver;", "observer", "Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "setObserver", "(Landroidx/compose/runtime/tooling/CompositionObserver;)Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "", "key", "invalidateGroupsWithKey", "(I)V", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "composeContent", "updateMovingInvalidations$runtime", "dispose", "", "", "values", "recordModificationsOf", "(Ljava/util/Set;)V", "observesAnyOf", "(Ljava/util/Set;)Z", "block", "prepareCompose", "(Lkotlin/jvm/functions/Function0;)V", "Lkotlin/Function1;", "Landroidx/compose/runtime/Anchor;", "inGroup", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "extractInvalidationsOfGroup$runtime", "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "(Ljava/lang/Object;Z)V", "(Ljava/util/Set;Z)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "recordReadOf", "(Ljava/lang/Object;)V", "recordWriteOf", "recompose", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "insertMovableContent", "(Ljava/util/List;)V", "Landroidx/compose/runtime/MovableContentState;", "state", "disposeUnusedMovableContent", "(Landroidx/compose/runtime/MovableContentState;)V", "Landroidx/compose/runtime/changelist/ChangeList;", "(Landroidx/compose/runtime/changelist/ChangeList;)V", "applyChanges", "applyLateChanges", "changesApplied", "abandonChanges", "invalidateAll", "verifyConsistent", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "groupIndex", "delegateInvalidations", "(Landroidx/compose/runtime/ControlledComposition;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Landroidx/compose/runtime/ShouldPauseCallback;", "shouldPause", "getAndSetShouldPauseCallback", "(Landroidx/compose/runtime/ShouldPauseCallback;)Landroidx/compose/runtime/ShouldPauseCallback;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "instance", "Landroidx/compose/runtime/InvalidationResult;", "invalidate", "(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;", "recomposeScopeReleased", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "T", "Landroidx/compose/runtime/CompositionServiceKey;", "getCompositionService", "(Landroidx/compose/runtime/CompositionServiceKey;)Ljava/lang/Object;", "(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Z", "p2", "(Landroidx/compose/runtime/RecomposeScopeImpl;Landroidx/compose/runtime/Anchor;Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;", "removeObservation$runtime", "(Ljava/lang/Object;Landroidx/compose/runtime/RecomposeScopeImpl;)V", "Landroidx/compose/runtime/DerivedState;", "removeDerivedStateObservation$runtime", "(Landroidx/compose/runtime/DerivedState;)V", "Landroidx/compose/runtime/collection/ScopeMap;", "getHighSpeedVideoSizesFor", "()Landroidx/collection/MutableScatterMap;", "Landroidx/compose/runtime/SlotTable;", "(Landroidx/compose/runtime/SlotTable;)V", "getInputSizeshNQ4ISI", "()Landroidx/compose/runtime/tooling/CompositionObserver;", "deactivate", "composerStacksSizes$runtime", "()I", "Landroidx/compose/runtime/CompositionContext;", "getParent", "()Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/Applier;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/internal/getHighSpeedVideoSizes;", "getOutputSizes", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/platform/SynchronizedObject;", "getOutputStallDuration", "Ljava/lang/Object;", "", "Landroidx/compose/runtime/RememberObserver;", "Ljava/util/Set;", "slotTable", "Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime", "()Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime$annotations", "getOutputSizeshNQ4ISI", "Landroidx/collection/MutableScatterMap;", "getObservedObjects$runtime", "()Ljava/util/Set;", "observedObjects", "Landroidx/collection/MutableScatterSet;", "getInputFormats", "Landroidx/collection/MutableScatterSet;", "getOutputMinFrameDuration", "getDerivedStateDependencies$runtime", "derivedStateDependencies", "getConditionalScopes$runtime", "()Ljava/util/List;", "conditionalScopes", "Landroidx/compose/runtime/changelist/ChangeList;", "getOutputMinFrameDurationlomOqCM", "getOutputStallDurationlomOqCM", "pendingInvalidScopes", "Z", "getPendingInvalidScopes$runtime", "setPendingInvalidScopes$runtime", "(Z)V", "getPendingInvalidScopes$runtime$annotations", "isOutputSupportedFor", "Landroidx/compose/runtime/ShouldPauseCallback;", "Landroidx/compose/runtime/PausedCompositionImpl;", "toString", "Landroidx/compose/runtime/PausedCompositionImpl;", "Landroidx/compose/runtime/CompositionImpl;", com.visa.cbp.getEncExpo.warmup, "Landroidx/compose/runtime/CompositionObserverHolder;", "observerHolder", "Landroidx/compose/runtime/CompositionObserverHolder;", "getObserverHolder$runtime", "()Landroidx/compose/runtime/CompositionObserverHolder;", "Landroidx/compose/runtime/internal/RememberEventDispatcher;", "unwrapAs", "Landroidx/compose/runtime/internal/RememberEventDispatcher;", "Landroidx/compose/runtime/ComposerImpl;", "composer", "Landroidx/compose/runtime/ComposerImpl;", "getComposer$runtime", "()Landroidx/compose/runtime/ComposerImpl;", "Lkotlin/coroutines/CoroutineContext;", "isOutputSupportedForhNQ4ISI", "getRecomposeContext", "()Lkotlin/coroutines/CoroutineContext;", "isRoot", "getValidOutputFormatsForInputhNQ4ISI", androidx.view.compose.ComposeNavigator.NAME, "Lkotlin/jvm/functions/Function2;", "getComposable", "()Lkotlin/jvm/functions/Function2;", "setComposable", "isComposing", "isDisposed", "getHasPendingChanges", "hasPendingChanges", "getHasInvalidations", "hasInvalidations"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CompositionImpl implements androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.ReusableComposition, androidx.compose.runtime.RecomposeScopeOwner, androidx.compose.runtime.CompositionServices, androidx.compose.runtime.PausableComposition, androidx.compose.runtime.tooling.ObservableComposition {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.coroutines.CoroutineContext isOutputSupportedForhNQ4ISI;
    private kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> composable;
    private final androidx.compose.runtime.ComposerImpl composer;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Set<androidx.compose.runtime.RememberObserver> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.collection.MutableScatterSet<androidx.compose.runtime.RecomposeScopeImpl> getOutputMinFrameDuration;
    private final androidx.compose.runtime.Applier<?> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.runtime.changelist.ChangeList getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> getOutputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final androidx.collection.MutableScatterSet<androidx.compose.runtime.RecomposeScopeImpl> getHighSpeedVideoSizesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> getOutputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private int toString;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private androidx.compose.runtime.CompositionImpl getOutputSizes;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final androidx.compose.runtime.changelist.ChangeList getInputFormats;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicReference<java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> Camera2StreamConfigurationMap;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> getOutputStallDuration;

    /* renamed from: isOutputSupportedFor, reason: from kotlin metadata */
    private androidx.compose.runtime.ShouldPauseCallback getOutputMinFrameDurationlomOqCM;

    /* renamed from: isOutputSupportedForhNQ4ISI, reason: from kotlin metadata */
    private int isOutputSupportedFor;
    private final boolean isRoot;
    private final androidx.compose.runtime.CompositionObserverHolder observerHolder;
    private final androidx.compose.runtime.CompositionContext parent;
    private boolean pendingInvalidScopes;
    private final androidx.compose.runtime.SlotTable slotTable;

    /* renamed from: toString, reason: from kotlin metadata */
    private androidx.compose.runtime.PausedCompositionImpl getOutputStallDurationlomOqCM;
    private final androidx.compose.runtime.internal.RememberEventDispatcher unwrapAs;

    public static /* synthetic */ void getPendingInvalidScopes$runtime$annotations() {
    }

    public static /* synthetic */ void getSlotTable$runtime$annotations() {
    }

    public CompositionImpl(androidx.compose.runtime.CompositionContext compositionContext, androidx.compose.runtime.Applier<?> applier, kotlin.coroutines.CoroutineContext coroutineContext) {
        this.parent = compositionContext;
        this.getHighSpeedVideoFpsRangesFor = applier;
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>(null);
        this.getHighSpeedVideoFpsRanges = new java.lang.Object();
        int i = 0;
        int i2 = 1;
        java.util.Set<androidx.compose.runtime.RememberObserver> asMutableSet = new androidx.collection.MutableScatterSet(i, i2, defaultConstructorMarker).asMutableSet();
        this.getHighSpeedVideoSizes = asMutableSet;
        androidx.compose.runtime.SlotTable slotTable = new androidx.compose.runtime.SlotTable();
        if (compositionContext.getCollectingCallByInformation$runtime()) {
            slotTable.collectCalledByInformation();
        }
        if (compositionContext.getCollectingSourceInformation()) {
            slotTable.collectSourceInformation();
        }
        this.slotTable = slotTable;
        this.Camera2StreamConfigurationMap = androidx.compose.runtime.collection.ScopeMap.m5403constructorimpl$default(null, 1, null);
        this.getHighSpeedVideoSizesFor = new androidx.collection.MutableScatterSet<>(i, i2, defaultConstructorMarker);
        this.getOutputMinFrameDuration = new androidx.collection.MutableScatterSet<>(i, i2, defaultConstructorMarker);
        this.getOutputFormats = androidx.compose.runtime.collection.ScopeMap.m5403constructorimpl$default(null, 1, null);
        androidx.compose.runtime.changelist.ChangeList changeList = new androidx.compose.runtime.changelist.ChangeList();
        this.getInputSizeshNQ4ISI = changeList;
        androidx.compose.runtime.changelist.ChangeList changeList2 = new androidx.compose.runtime.changelist.ChangeList();
        this.getInputFormats = changeList2;
        this.getOutputStallDuration = androidx.compose.runtime.collection.ScopeMap.m5403constructorimpl$default(null, 1, null);
        this.getOutputSizeshNQ4ISI = androidx.compose.runtime.collection.ScopeMap.m5403constructorimpl$default(null, 1, null);
        androidx.compose.runtime.CompositionObserverHolder compositionObserverHolder = new androidx.compose.runtime.CompositionObserverHolder(null, false, compositionContext, 3, null);
        this.observerHolder = compositionObserverHolder;
        this.unwrapAs = new androidx.compose.runtime.internal.RememberEventDispatcher();
        androidx.compose.runtime.ComposerImpl composerImpl = new androidx.compose.runtime.ComposerImpl(applier, compositionContext, slotTable, asMutableSet, changeList, changeList2, compositionObserverHolder, this);
        compositionContext.registerComposer$runtime(composerImpl);
        this.composer = composerImpl;
        this.isOutputSupportedForhNQ4ISI = coroutineContext;
        this.isRoot = compositionContext instanceof androidx.compose.runtime.Recomposer;
        this.composable = androidx.compose.runtime.ComposableSingletons$CompositionKt.INSTANCE.getLambda$954879418$runtime();
    }

    public /* synthetic */ CompositionImpl(androidx.compose.runtime.CompositionContext compositionContext, androidx.compose.runtime.Applier applier, kotlin.coroutines.CoroutineContext coroutineContext, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(compositionContext, applier, (i & 4) != 0 ? null : coroutineContext);
    }

    public final androidx.compose.runtime.CompositionContext getParent() {
        return this.parent;
    }

    /* renamed from: getSlotTable$runtime, reason: from getter */
    public final androidx.compose.runtime.SlotTable getSlotTable() {
        return this.slotTable;
    }

    public final java.util.Set<java.lang.Object> getObservedObjects$runtime() {
        return this.Camera2StreamConfigurationMap.asMap().keySet();
    }

    public final java.util.Set<java.lang.Object> getDerivedStateDependencies$runtime() {
        return this.getOutputFormats.asMap().keySet();
    }

    public final java.util.List<androidx.compose.runtime.RecomposeScopeImpl> getConditionalScopes$runtime() {
        return kotlin.collections.CollectionsKt.toList(this.getOutputMinFrameDuration.asSet());
    }

    /* renamed from: getPendingInvalidScopes$runtime, reason: from getter */
    public final boolean getPendingInvalidScopes() {
        return this.pendingInvalidScopes;
    }

    public final void setPendingInvalidScopes$runtime(boolean z) {
        this.pendingInvalidScopes = z;
    }

    /* renamed from: getObserverHolder$runtime, reason: from getter */
    public final androidx.compose.runtime.CompositionObserverHolder getObserverHolder() {
        return this.observerHolder;
    }

    /* renamed from: getComposer$runtime, reason: from getter */
    public final androidx.compose.runtime.ComposerImpl getComposer() {
        return this.composer;
    }

    public final kotlin.coroutines.CoroutineContext getRecomposeContext() {
        kotlin.coroutines.CoroutineContext coroutineContext = this.isOutputSupportedForhNQ4ISI;
        return coroutineContext == null ? this.parent.getRecomposeCoroutineContext$runtime() : coroutineContext;
    }

    /* renamed from: isRoot, reason: from getter */
    public final boolean getIsRoot() {
        return this.isRoot;
    }

    private final boolean getOutputMinFrameDuration() {
        return this.composer.getAreChildrenComposing$runtime();
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getComposable() {
        return this.composable;
    }

    public final void setComposable(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2) {
        this.composable = function2;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final boolean isComposing() {
        return this.composer.getIsComposing();
    }

    @Override // androidx.compose.runtime.Composition
    public final boolean isDisposed() {
        return this.isOutputSupportedFor == 3;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final boolean getHasPendingChanges() {
        boolean hasPendingChanges$runtime;
        synchronized (this.getHighSpeedVideoFpsRanges) {
            hasPendingChanges$runtime = this.composer.getHasPendingChanges$runtime();
        }
        return hasPendingChanges$runtime;
    }

    @Override // androidx.compose.runtime.Composition
    public final void setContent(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content) {
        boolean highSpeedVideoSizes = getHighSpeedVideoSizes();
        getOutputFormats();
        if (highSpeedVideoSizes) {
            getHighSpeedVideoFpsRangesFor(content);
        } else {
            Camera2StreamConfigurationMap(content);
        }
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public final void setContentWithReuse(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content) {
        getHighSpeedVideoSizes();
        getOutputFormats();
        getHighSpeedVideoFpsRangesFor(content);
    }

    @Override // androidx.compose.runtime.PausableComposition
    public final androidx.compose.runtime.PausedComposition setPausableContent(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content) {
        return getHighSpeedVideoSizes(getHighSpeedVideoSizes(), content);
    }

    @Override // androidx.compose.runtime.PausableComposition
    public final androidx.compose.runtime.PausedComposition setPausableContentWithReuse(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content) {
        getHighSpeedVideoSizes();
        getOutputFormats();
        return getHighSpeedVideoSizes(true, content);
    }

    public final void pausedCompositionFinished$runtime(androidx.collection.ScatterSet<androidx.compose.runtime.RememberObserverHolder> ignoreSet) {
        this.getOutputStallDurationlomOqCM = null;
        if (ignoreSet != null) {
            this.unwrapAs.ignoreForgotten(ignoreSet);
            this.isOutputSupportedFor = 2;
        }
    }

    private final void Camera2StreamConfigurationMap(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> p0) {
        this.composable = p0;
        this.parent.composeInitial$runtime(this, p0);
    }

    private final androidx.compose.runtime.PausedComposition getHighSpeedVideoSizes(boolean p0, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> p1) {
        if (this.getOutputStallDurationlomOqCM != null) {
            androidx.compose.runtime.PreconditionsKt.throwIllegalStateException("A pausable composition is in progress");
        }
        androidx.compose.runtime.PausedCompositionImpl pausedCompositionImpl = new androidx.compose.runtime.PausedCompositionImpl(this, this.parent, this.composer, this.getHighSpeedVideoSizes, p1, p0, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
        this.getOutputStallDurationlomOqCM = pausedCompositionImpl;
        return pausedCompositionImpl;
    }

    private final void getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> p0) {
        this.composer.startReuseFromRoot();
        Camera2StreamConfigurationMap(p0);
        this.composer.endReuseFromRoot();
    }

    private final void getOutputFormats() {
        java.lang.String str;
        int i = this.isOutputSupportedFor;
        if (i != 0) {
            if (i == 1) {
                str = "The composition should be activated before setting content.";
            } else if (i == 2) {
                str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
            } else if (i == 3) {
                str = "The composition is disposed";
            } else {
                str = "";
            }
            androidx.compose.runtime.PreconditionsKt.throwIllegalStateException(str);
        }
        if (this.getOutputStallDurationlomOqCM == null) {
            return;
        }
        androidx.compose.runtime.PreconditionsKt.throwIllegalStateException("A pausable composition is in progress");
    }

    private final boolean getHighSpeedVideoSizes() {
        boolean z;
        synchronized (this.getHighSpeedVideoFpsRanges) {
            z = this.isOutputSupportedFor == 1;
            if (z) {
                this.isOutputSupportedFor = 0;
            }
        }
        return z;
    }

    @Override // androidx.compose.runtime.tooling.ObservableComposition
    public final androidx.compose.runtime.tooling.CompositionObserverHandle setObserver(final androidx.compose.runtime.tooling.CompositionObserver observer) {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            this.observerHolder.setObserver(observer);
            this.observerHolder.setRoot(true);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        return new androidx.compose.runtime.tooling.CompositionObserverHandle() { // from class: androidx.compose.runtime.CompositionImpl$setObserver$2
            @Override // androidx.compose.runtime.tooling.CompositionObserverHandle
            public final void dispose() {
                java.lang.Object obj;
                obj = androidx.compose.runtime.CompositionImpl.this.getHighSpeedVideoFpsRanges;
                androidx.compose.runtime.CompositionImpl compositionImpl = androidx.compose.runtime.CompositionImpl.this;
                androidx.compose.runtime.tooling.CompositionObserver compositionObserver = observer;
                synchronized (obj) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(compositionImpl.getObserverHolder().getObserver(), compositionObserver)) {
                        compositionImpl.getObserverHolder().setObserver(null);
                        compositionImpl.getObserverHolder().setRoot(false);
                    }
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                }
            }
        };
    }

    public final void invalidateGroupsWithKey(int key) {
        java.util.List<androidx.compose.runtime.RecomposeScopeImpl> invalidateGroupsWithKey$runtime;
        synchronized (this.getHighSpeedVideoFpsRanges) {
            invalidateGroupsWithKey$runtime = this.slotTable.invalidateGroupsWithKey$runtime(key);
        }
        if (invalidateGroupsWithKey$runtime != null) {
            int size = invalidateGroupsWithKey$runtime.size();
            for (int i = 0; i < size; i++) {
                if (invalidateGroupsWithKey$runtime.get(i).invalidateForResult(null) != androidx.compose.runtime.InvalidationResult.IGNORED) {
                }
            }
            return;
        }
        if (this.composer.forceRecomposeScopes$runtime()) {
            this.parent.invalidate$runtime(this);
        }
    }

    private final void Camera2StreamConfigurationMap() {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.util.concurrent.atomic.AtomicReference<java.lang.Object> atomicReference = this.getHighResolutionOutputSizeshNQ4ISI;
        obj = androidx.compose.runtime.CompositionKt.getHighSpeedVideoSizes;
        java.lang.Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            obj2 = androidx.compose.runtime.CompositionKt.getHighSpeedVideoSizes;
            if (kotlin.jvm.internal.Intrinsics.areEqual(andSet, obj2)) {
                androidx.compose.runtime.ComposerKt.composeRuntimeError("pending composition has not been applied");
                throw new kotlin.KotlinNothingValueException();
            }
            if (andSet instanceof java.util.Set) {
                getHighSpeedVideoFpsRanges((java.util.Set) andSet, true);
                return;
            }
            if (andSet instanceof java.lang.Object[]) {
                for (java.util.Set<? extends java.lang.Object> set : (java.util.Set[]) andSet) {
                    getHighSpeedVideoFpsRanges(set, true);
                }
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("corrupt pendingModifications drain: ");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            androidx.compose.runtime.ComposerKt.composeRuntimeError(sb.toString());
            throw new kotlin.KotlinNothingValueException();
        }
    }

    private final void getHighSpeedVideoFpsRanges() {
        java.lang.Object obj;
        java.lang.Object andSet = this.getHighResolutionOutputSizeshNQ4ISI.getAndSet(null);
        obj = androidx.compose.runtime.CompositionKt.getHighSpeedVideoSizes;
        if (kotlin.jvm.internal.Intrinsics.areEqual(andSet, obj)) {
            return;
        }
        if (andSet instanceof java.util.Set) {
            getHighSpeedVideoFpsRanges((java.util.Set) andSet, false);
            return;
        }
        if (andSet instanceof java.lang.Object[]) {
            for (java.util.Set<? extends java.lang.Object> set : (java.util.Set[]) andSet) {
                getHighSpeedVideoFpsRanges(set, false);
            }
            return;
        }
        if (andSet == null) {
            if (this.getOutputStallDurationlomOqCM == null) {
                androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("corrupt pendingModifications drain: ");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            androidx.compose.runtime.ComposerKt.composeRuntimeError(sb.toString());
            throw new kotlin.KotlinNothingValueException();
        }
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        java.lang.Object obj;
        java.lang.Object andSet = this.getHighResolutionOutputSizeshNQ4ISI.getAndSet(kotlin.collections.SetsKt.emptySet());
        obj = androidx.compose.runtime.CompositionKt.getHighSpeedVideoSizes;
        if (kotlin.jvm.internal.Intrinsics.areEqual(andSet, obj) || andSet == null) {
            return;
        }
        if (andSet instanceof java.util.Set) {
            getHighSpeedVideoFpsRanges((java.util.Set) andSet, false);
            return;
        }
        if (andSet instanceof java.lang.Object[]) {
            for (java.util.Set<? extends java.lang.Object> set : (java.util.Set[]) andSet) {
                getHighSpeedVideoFpsRanges(set, false);
            }
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("corrupt pendingModifications drain: ");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        androidx.compose.runtime.ComposerKt.composeRuntimeError(sb.toString());
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void composeContent(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content) {
        try {
            synchronized (this.getHighSpeedVideoFpsRanges) {
                Camera2StreamConfigurationMap();
                androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> highSpeedVideoSizesFor = getHighSpeedVideoSizesFor();
                try {
                    this.composer.m5237composeContentZbOJvo$runtime(highSpeedVideoSizesFor, content, this.getOutputMinFrameDurationlomOqCM);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                } catch (java.lang.Throwable th) {
                    this.getOutputSizeshNQ4ISI = highSpeedVideoSizesFor;
                    throw th;
                }
            }
            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th2) {
            try {
                if (!this.getHighSpeedVideoSizes.isEmpty()) {
                    androidx.compose.runtime.internal.RememberEventDispatcher rememberEventDispatcher = this.unwrapAs;
                    try {
                        rememberEventDispatcher.prepare(this.getHighSpeedVideoSizes, this.composer.getErrorContext$runtime());
                        rememberEventDispatcher.dispatchAbandons();
                        rememberEventDispatcher.clear();
                    } catch (java.lang.Throwable th3) {
                        rememberEventDispatcher.clear();
                        throw th3;
                    }
                }
                throw th2;
            } catch (java.lang.Throwable th4) {
                abandonChanges();
                throw th4;
            }
        }
    }

    public final void updateMovingInvalidations$runtime() {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            getHighResolutionOutputSizeshNQ4ISI();
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> highSpeedVideoSizesFor = getHighSpeedVideoSizesFor();
            try {
                this.composer.m5239updateComposerInvalidationsRY85e9Y(highSpeedVideoSizesFor);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            } catch (java.lang.Throwable th) {
                this.getOutputSizeshNQ4ISI = highSpeedVideoSizesFor;
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.Composition
    public final void dispose() {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            if (this.composer.getIsComposing()) {
                androidx.compose.runtime.PreconditionsKt.throwIllegalStateException("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
            }
            if (this.isOutputSupportedFor != 3) {
                this.isOutputSupportedFor = 3;
                this.composable = androidx.compose.runtime.ComposableSingletons$CompositionKt.INSTANCE.getLambda$1918065384$runtime();
                androidx.compose.runtime.changelist.ChangeList deferredChanges = this.composer.getDeferredChanges();
                if (deferredChanges != null) {
                    getHighSpeedVideoSizes(deferredChanges);
                }
                boolean z = this.slotTable.getGroupsSize() > 0;
                if (z || !this.getHighSpeedVideoSizes.isEmpty()) {
                    androidx.compose.runtime.internal.RememberEventDispatcher rememberEventDispatcher = this.unwrapAs;
                    try {
                        rememberEventDispatcher.prepare(this.getHighSpeedVideoSizes, this.composer.getErrorContext$runtime());
                        if (z) {
                            this.getHighSpeedVideoFpsRangesFor.onBeginChanges();
                            androidx.compose.runtime.SlotWriter openWriter = this.slotTable.openWriter();
                            try {
                                androidx.compose.runtime.ComposerKt.removeCurrentGroup(openWriter, this.unwrapAs);
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                openWriter.close(true);
                                this.getHighSpeedVideoFpsRangesFor.clear();
                                this.getHighSpeedVideoFpsRangesFor.onEndChanges();
                                rememberEventDispatcher.dispatchRememberObservers();
                            } catch (java.lang.Throwable th) {
                                openWriter.close(false);
                                throw th;
                            }
                        }
                        rememberEventDispatcher.dispatchAbandons();
                    } finally {
                        rememberEventDispatcher.clear();
                    }
                }
                this.composer.dispose$runtime();
            }
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        }
        this.parent.unregisterComposition$runtime(this);
    }

    @Override // androidx.compose.runtime.Composition
    public final boolean getHasInvalidations() {
        boolean z;
        synchronized (this.getHighSpeedVideoFpsRanges) {
            z = androidx.compose.runtime.collection.ScopeMap.m5408getSizeimpl(this.getOutputSizeshNQ4ISI) > 0;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.Set[]] */
    @Override // androidx.compose.runtime.ControlledComposition
    public final void recordModificationsOf(java.util.Set<? extends java.lang.Object> values) {
        java.lang.Object obj;
        java.util.Set<? extends java.lang.Object> set;
        java.lang.Object obj2;
        do {
            obj = this.getHighResolutionOutputSizeshNQ4ISI.get();
            if (obj != null) {
                obj2 = androidx.compose.runtime.CompositionKt.getHighSpeedVideoSizes;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(obj, obj2)) {
                    if (obj instanceof java.util.Set) {
                        set = new java.util.Set[]{obj, values};
                    } else {
                        if (!(obj instanceof java.lang.Object[])) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("corrupt pendingModifications: ");
                            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
                            throw new java.lang.IllegalStateException(sb.toString().toString());
                        }
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                        set = kotlin.collections.ArraysKt.plus((java.util.Set<? extends java.lang.Object>[]) obj, values);
                    }
                }
            }
            set = values;
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighResolutionOutputSizeshNQ4ISI, obj, set));
        if (obj == null) {
            synchronized (this.getHighSpeedVideoFpsRanges) {
                getHighSpeedVideoFpsRanges();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void prepareCompose(kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        this.composer.prepareCompose$runtime(block);
    }

    public final java.util.List<kotlin.Pair<androidx.compose.runtime.RecomposeScopeImpl, java.lang.Object>> extractInvalidationsOfGroup$runtime(kotlin.jvm.functions.Function1<? super androidx.compose.runtime.Anchor, java.lang.Boolean> inGroup) {
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        int i3;
        long j;
        int i4;
        char c;
        long j2;
        int i5;
        java.lang.Object[] objArr;
        long[] jArr3;
        int i6;
        java.lang.Object[] objArr2;
        long[] jArr4;
        int i7;
        if (androidx.compose.runtime.collection.ScopeMap.m5408getSizeimpl(this.getOutputSizeshNQ4ISI) > 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            androidx.collection.MutableScatterMap mutableScatterMap = this.getOutputSizeshNQ4ISI;
            long[] jArr5 = mutableScatterMap.metadata;
            int length = jArr5.length - 2;
            if (length >= 0) {
                int i8 = 0;
                while (true) {
                    long j3 = jArr5[i8];
                    char c2 = 7;
                    long j4 = -9187201950435737472L;
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8;
                        int i10 = 8 - ((~(i8 - length)) >>> 31);
                        int i11 = 0;
                        while (i11 < i10) {
                            if ((j3 & 255) < 128) {
                                int i12 = (i8 << 3) + i11;
                                java.lang.Object obj = mutableScatterMap.keys[i12];
                                java.lang.Object obj2 = mutableScatterMap.values[i12];
                                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                                if (obj2 instanceof androidx.collection.MutableScatterSet) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
                                    androidx.collection.MutableScatterSet mutableScatterSet = (androidx.collection.MutableScatterSet) obj2;
                                    java.lang.Object[] objArr3 = mutableScatterSet.elements;
                                    long[] jArr6 = mutableScatterSet.metadata;
                                    int length2 = jArr6.length - 2;
                                    if (length2 >= 0) {
                                        jArr2 = jArr5;
                                        i3 = i8;
                                        j = j3;
                                        int i13 = 0;
                                        while (true) {
                                            long j5 = jArr6[i13];
                                            i4 = i10;
                                            c = 7;
                                            j2 = -9187201950435737472L;
                                            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i14 = 8 - ((~(i13 - length2)) >>> 31);
                                                int i15 = 0;
                                                while (i15 < i14) {
                                                    if ((j5 & 255) < 128) {
                                                        jArr4 = jArr6;
                                                        int i16 = (i13 << 3) + i15;
                                                        i6 = length;
                                                        java.lang.Object obj3 = objArr3[i16];
                                                        objArr2 = objArr3;
                                                        androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl = (androidx.compose.runtime.RecomposeScopeImpl) obj;
                                                        i7 = i11;
                                                        androidx.compose.runtime.Anchor anchor = recomposeScopeImpl.getAnchor();
                                                        if (anchor != null && inGroup.invoke(anchor).booleanValue()) {
                                                            arrayList.add(kotlin.TuplesKt.to(recomposeScopeImpl, obj3));
                                                            mutableScatterSet.removeElementAt(i16);
                                                        }
                                                    } else {
                                                        i6 = length;
                                                        objArr2 = objArr3;
                                                        jArr4 = jArr6;
                                                        i7 = i11;
                                                    }
                                                    j5 >>= 8;
                                                    i15++;
                                                    length = i6;
                                                    jArr6 = jArr4;
                                                    objArr3 = objArr2;
                                                    i11 = i7;
                                                }
                                                i2 = length;
                                                objArr = objArr3;
                                                jArr3 = jArr6;
                                                i5 = i11;
                                                if (i14 != 8) {
                                                    break;
                                                }
                                            } else {
                                                i2 = length;
                                                objArr = objArr3;
                                                jArr3 = jArr6;
                                                i5 = i11;
                                            }
                                            if (i13 == length2) {
                                                break;
                                            }
                                            i13++;
                                            i10 = i4;
                                            length = i2;
                                            jArr6 = jArr3;
                                            objArr3 = objArr;
                                            i11 = i5;
                                        }
                                    } else {
                                        jArr2 = jArr5;
                                        i2 = length;
                                        i3 = i8;
                                        j = j3;
                                        i4 = i10;
                                        i5 = i11;
                                        c = 7;
                                        j2 = -9187201950435737472L;
                                    }
                                    if (!mutableScatterSet.isEmpty()) {
                                    }
                                    mutableScatterMap.removeValueAt(i12);
                                } else {
                                    jArr2 = jArr5;
                                    i2 = length;
                                    i3 = i8;
                                    j = j3;
                                    i4 = i10;
                                    c = c2;
                                    i5 = i11;
                                    j2 = -9187201950435737472L;
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
                                    androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl2 = (androidx.compose.runtime.RecomposeScopeImpl) obj;
                                    androidx.compose.runtime.Anchor anchor2 = recomposeScopeImpl2.getAnchor();
                                    if (anchor2 != null && inGroup.invoke(anchor2).booleanValue()) {
                                        arrayList.add(kotlin.TuplesKt.to(recomposeScopeImpl2, obj2));
                                        mutableScatterMap.removeValueAt(i12);
                                    }
                                }
                            } else {
                                jArr2 = jArr5;
                                i2 = length;
                                i3 = i8;
                                j = j3;
                                i4 = i10;
                                c = c2;
                                j2 = j4;
                                i5 = i11;
                            }
                            i11 = i5 + 1;
                            j3 = j >> 8;
                            i9 = 8;
                            c2 = c;
                            j4 = j2;
                            jArr5 = jArr2;
                            i8 = i3;
                            i10 = i4;
                            length = i2;
                        }
                        jArr = jArr5;
                        int i17 = length;
                        int i18 = i8;
                        if (i10 != i9) {
                            break;
                        }
                        i = i18;
                        length = i17;
                    } else {
                        jArr = jArr5;
                        i = i8;
                    }
                    if (i == length) {
                        break;
                    }
                    i8 = i + 1;
                    jArr5 = jArr;
                }
            }
            return arrayList;
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(java.lang.Object p0, boolean p1) {
        java.lang.Object obj = this.Camera2StreamConfigurationMap.get(p0);
        if (obj == null) {
            return;
        }
        if (obj instanceof androidx.collection.MutableScatterSet) {
            androidx.collection.MutableScatterSet mutableScatterSet = (androidx.collection.MutableScatterSet) obj;
            java.lang.Object[] objArr = mutableScatterSet.elements;
            long[] jArr = mutableScatterSet.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl = (androidx.compose.runtime.RecomposeScopeImpl) objArr[(i << 3) + i3];
                            if (!androidx.compose.runtime.collection.ScopeMap.m5410removeimpl(this.getOutputStallDuration, p0, recomposeScopeImpl) && recomposeScopeImpl.invalidateForResult(p0) != androidx.compose.runtime.InvalidationResult.IGNORED) {
                                if (recomposeScopeImpl.isConditional() && !p1) {
                                    this.getOutputMinFrameDuration.add(recomposeScopeImpl);
                                } else {
                                    this.getHighSpeedVideoSizesFor.add(recomposeScopeImpl);
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i == length) {
                    return;
                } else {
                    i++;
                }
            }
        } else {
            androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl2 = (androidx.compose.runtime.RecomposeScopeImpl) obj;
            if (androidx.compose.runtime.collection.ScopeMap.m5410removeimpl(this.getOutputStallDuration, p0, recomposeScopeImpl2) || recomposeScopeImpl2.invalidateForResult(p0) == androidx.compose.runtime.InvalidationResult.IGNORED) {
                return;
            }
            if (recomposeScopeImpl2.isConditional() && !p1) {
                this.getOutputMinFrameDuration.add(recomposeScopeImpl2);
            } else {
                this.getHighSpeedVideoSizesFor.add(recomposeScopeImpl2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cf, code lost:
    
        if (r6.isEmpty() != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ea, code lost:
    
        r0 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e7, code lost:
    
        r1.removeValueAt(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e5, code lost:
    
        if (androidx.compose.runtime.collection.ScopeMap.m5404containsimpl(r31.Camera2StreamConfigurationMap, (androidx.compose.runtime.DerivedState) r6) == false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void getHighSpeedVideoFpsRangesFor() {
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        int i3;
        int i4;
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> mutableScatterMap = this.getOutputFormats;
        long[] jArr3 = mutableScatterMap.metadata;
        int length = jArr3.length - 2;
        long j = 255;
        char c = 7;
        long j2 = -9187201950435737472L;
        int i5 = 8;
        if (length >= 0) {
            int i6 = 0;
            while (true) {
                long j3 = jArr3[i6];
                if ((((~j3) << c) & j3 & j2) != j2) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j3 & j) < 128) {
                            int i9 = (i6 << 3) + i8;
                            java.lang.Object obj = mutableScatterMap.keys[i9];
                            java.lang.Object obj2 = mutableScatterMap.values[i9];
                            if (obj2 instanceof androidx.collection.MutableScatterSet) {
                                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
                                androidx.collection.MutableScatterSet mutableScatterSet = (androidx.collection.MutableScatterSet) obj2;
                                java.lang.Object[] objArr3 = mutableScatterSet.elements;
                                long[] jArr4 = mutableScatterSet.metadata;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    jArr2 = jArr3;
                                    i2 = length;
                                    int i10 = 0;
                                    while (true) {
                                        long j4 = jArr4[i10];
                                        long[] jArr5 = jArr4;
                                        i3 = i6;
                                        if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                            int i12 = 0;
                                            while (i12 < i11) {
                                                if ((j4 & 255) < 128) {
                                                    int i13 = (i10 << 3) + i12;
                                                    objArr2 = objArr3;
                                                    if (!androidx.compose.runtime.collection.ScopeMap.m5404containsimpl(this.Camera2StreamConfigurationMap, (androidx.compose.runtime.DerivedState) objArr3[i13])) {
                                                        mutableScatterSet.removeElementAt(i13);
                                                    }
                                                } else {
                                                    objArr2 = objArr3;
                                                }
                                                j4 >>= 8;
                                                i12++;
                                                objArr3 = objArr2;
                                            }
                                            objArr = objArr3;
                                            if (i11 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr3;
                                        }
                                        if (i10 == length2) {
                                            break;
                                        }
                                        i10++;
                                        i6 = i3;
                                        jArr4 = jArr5;
                                        objArr3 = objArr;
                                        c = 7;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i2 = length;
                                    i3 = i6;
                                }
                            } else {
                                jArr2 = jArr3;
                                i2 = length;
                                i3 = i6;
                                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
                            }
                        } else {
                            jArr2 = jArr3;
                            i2 = length;
                            i3 = i6;
                            i4 = i5;
                        }
                        j3 >>= i4;
                        i8++;
                        i5 = i4;
                        jArr3 = jArr2;
                        length = i2;
                        i6 = i3;
                        j = 255;
                        c = 7;
                    }
                    jArr = jArr3;
                    int i14 = length;
                    int i15 = i6;
                    if (i7 != i5) {
                        break;
                    }
                    length = i14;
                    i = i15;
                } else {
                    jArr = jArr3;
                    i = i6;
                }
                if (i == length) {
                    break;
                }
                i6 = i + 1;
                jArr3 = jArr;
                j = 255;
                c = 7;
                j2 = -9187201950435737472L;
                i5 = 8;
            }
        }
        if (!this.getOutputMinFrameDuration.isNotEmpty()) {
            return;
        }
        androidx.collection.MutableScatterSet<androidx.compose.runtime.RecomposeScopeImpl> mutableScatterSet2 = this.getOutputMinFrameDuration;
        java.lang.Object[] objArr4 = mutableScatterSet2.elements;
        long[] jArr6 = mutableScatterSet2.metadata;
        int length3 = jArr6.length - 2;
        if (length3 < 0) {
            return;
        }
        int i16 = 0;
        while (true) {
            long j5 = jArr6[i16];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i17 = 8 - ((~(i16 - length3)) >>> 31);
                for (int i18 = 0; i18 < i17; i18++) {
                    if ((j5 & 255) < 128) {
                        int i19 = (i16 << 3) + i18;
                        if (!((androidx.compose.runtime.RecomposeScopeImpl) objArr4[i19]).isConditional()) {
                            mutableScatterSet2.removeElementAt(i19);
                        }
                    }
                    j5 >>= 8;
                }
                if (i17 != 8) {
                    return;
                }
            }
            if (i16 == length3) {
                return;
            } else {
                i16++;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.RecomposeScopeOwner
    public final void recordReadOf(java.lang.Object value) {
        androidx.compose.runtime.RecomposeScopeImpl currentRecomposeScope$runtime;
        long[] jArr;
        long[] jArr2;
        int i;
        if (getOutputMinFrameDuration() || (currentRecomposeScope$runtime = this.composer.getCurrentRecomposeScope$runtime()) == null) {
            return;
        }
        currentRecomposeScope$runtime.setUsed(true);
        boolean recordRead = currentRecomposeScope$runtime.recordRead(value);
        androidx.compose.runtime.tooling.CompositionObserver inputSizeshNQ4ISI = getInputSizeshNQ4ISI();
        if (inputSizeshNQ4ISI != null) {
            inputSizeshNQ4ISI.onReadInScope(currentRecomposeScope$runtime, value);
        }
        if (recordRead) {
            return;
        }
        if (value instanceof androidx.compose.runtime.snapshots.StateObjectImpl) {
            androidx.compose.runtime.snapshots.ReaderKind.Companion companion = androidx.compose.runtime.snapshots.ReaderKind.INSTANCE;
            ((androidx.compose.runtime.snapshots.StateObjectImpl) value).m5492recordReadInh_f27i8$runtime(androidx.compose.runtime.snapshots.ReaderKind.m5475constructorimpl(1));
        }
        androidx.compose.runtime.collection.ScopeMap.m5397addimpl(this.Camera2StreamConfigurationMap, value, currentRecomposeScope$runtime);
        if (value instanceof androidx.compose.runtime.DerivedState) {
            androidx.compose.runtime.DerivedState<?> derivedState = (androidx.compose.runtime.DerivedState) value;
            androidx.compose.runtime.DerivedState.Record<?> currentRecord = derivedState.getCurrentRecord();
            androidx.compose.runtime.collection.ScopeMap.m5412removeScopeimpl(this.getOutputFormats, value);
            androidx.collection.ObjectIntMap<androidx.compose.runtime.snapshots.StateObject> dependencies = currentRecord.getDependencies();
            java.lang.Object[] objArr = dependencies.keys;
            long[] jArr3 = dependencies.metadata;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr3[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8;
                        int i4 = 8 - ((~(i2 - length)) >>> 31);
                        int i5 = 0;
                        while (i5 < i4) {
                            if ((j & 255) < 128) {
                                androidx.compose.runtime.snapshots.StateObject stateObject = (androidx.compose.runtime.snapshots.StateObject) objArr[(i2 << 3) + i5];
                                if (stateObject instanceof androidx.compose.runtime.snapshots.StateObjectImpl) {
                                    androidx.compose.runtime.snapshots.ReaderKind.Companion companion2 = androidx.compose.runtime.snapshots.ReaderKind.INSTANCE;
                                    jArr2 = jArr3;
                                    ((androidx.compose.runtime.snapshots.StateObjectImpl) stateObject).m5492recordReadInh_f27i8$runtime(androidx.compose.runtime.snapshots.ReaderKind.m5475constructorimpl(1));
                                } else {
                                    jArr2 = jArr3;
                                }
                                androidx.compose.runtime.collection.ScopeMap.m5397addimpl(this.getOutputFormats, stateObject, value);
                                i = 8;
                            } else {
                                jArr2 = jArr3;
                                i = i3;
                            }
                            j >>= i;
                            i5++;
                            i3 = i;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i4 != i3) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                    jArr3 = jArr;
                }
            }
            currentRecomposeScope$runtime.recordDerivedStateValue(derivedState, currentRecord.getCurrentValue());
        }
    }

    private final void getHighSpeedVideoFpsRangesFor(java.lang.Object p0) {
        java.lang.Object obj = this.Camera2StreamConfigurationMap.get(p0);
        if (obj == null) {
            return;
        }
        if (obj instanceof androidx.collection.MutableScatterSet) {
            androidx.collection.MutableScatterSet mutableScatterSet = (androidx.collection.MutableScatterSet) obj;
            java.lang.Object[] objArr = mutableScatterSet.elements;
            long[] jArr = mutableScatterSet.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl = (androidx.compose.runtime.RecomposeScopeImpl) objArr[(i << 3) + i3];
                            if (recomposeScopeImpl.invalidateForResult(p0) == androidx.compose.runtime.InvalidationResult.IMMINENT) {
                                androidx.compose.runtime.collection.ScopeMap.m5397addimpl(this.getOutputStallDuration, p0, recomposeScopeImpl);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i == length) {
                    return;
                } else {
                    i++;
                }
            }
        } else {
            androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl2 = (androidx.compose.runtime.RecomposeScopeImpl) obj;
            if (recomposeScopeImpl2.invalidateForResult(p0) == androidx.compose.runtime.InvalidationResult.IMMINENT) {
                androidx.compose.runtime.collection.ScopeMap.m5397addimpl(this.getOutputStallDuration, p0, recomposeScopeImpl2);
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void recordWriteOf(java.lang.Object value) {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            getHighSpeedVideoFpsRangesFor(value);
            java.lang.Object obj = this.getOutputFormats.get(value);
            if (obj != null) {
                if (!(obj instanceof androidx.collection.MutableScatterSet)) {
                    getHighSpeedVideoFpsRangesFor((androidx.compose.runtime.DerivedState) obj);
                } else {
                    androidx.collection.MutableScatterSet mutableScatterSet = (androidx.collection.MutableScatterSet) obj;
                    java.lang.Object[] objArr = mutableScatterSet.elements;
                    long[] jArr = mutableScatterSet.metadata;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j) < 128) {
                                        getHighSpeedVideoFpsRangesFor((androidx.compose.runtime.DerivedState) objArr[(i << 3) + i3]);
                                    }
                                    j >>= 8;
                                }
                                if (i2 != 8) {
                                    break;
                                }
                            }
                            if (i == length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final boolean recompose() {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            androidx.compose.runtime.PausedCompositionImpl pausedCompositionImpl = this.getOutputStallDurationlomOqCM;
            if (pausedCompositionImpl != null && !pausedCompositionImpl.isRecomposing$runtime()) {
                pausedCompositionImpl.markIncomplete$runtime();
                pausedCompositionImpl.getPausableApplier$runtime().markRecomposePending();
                return false;
            }
            Camera2StreamConfigurationMap();
            try {
                try {
                    boolean m5238recomposeaFTiNEg$runtime = this.composer.m5238recomposeaFTiNEg$runtime(getHighSpeedVideoSizesFor(), this.getOutputMinFrameDurationlomOqCM);
                    if (!m5238recomposeaFTiNEg$runtime) {
                        getHighSpeedVideoFpsRanges();
                    }
                    return m5238recomposeaFTiNEg$runtime;
                } finally {
                }
            } catch (java.lang.Throwable th) {
                try {
                    if (!this.getHighSpeedVideoSizes.isEmpty()) {
                        androidx.compose.runtime.internal.RememberEventDispatcher rememberEventDispatcher = this.unwrapAs;
                        try {
                            rememberEventDispatcher.prepare(this.getHighSpeedVideoSizes, this.composer.getErrorContext$runtime());
                            rememberEventDispatcher.dispatchAbandons();
                            rememberEventDispatcher.clear();
                        } catch (java.lang.Throwable th2) {
                            rememberEventDispatcher.clear();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (java.lang.Throwable th3) {
                    abandonChanges();
                    throw th3;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void disposeUnusedMovableContent(androidx.compose.runtime.MovableContentState state) {
        androidx.compose.runtime.internal.RememberEventDispatcher rememberEventDispatcher = this.unwrapAs;
        try {
            rememberEventDispatcher.prepare(this.getHighSpeedVideoSizes, this.composer.getErrorContext$runtime());
            androidx.compose.runtime.SlotWriter openWriter = state.getSlotTable().openWriter();
            try {
                androidx.compose.runtime.ComposerKt.removeCurrentGroup(openWriter, this.unwrapAs);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                openWriter.close(true);
                rememberEventDispatcher.dispatchRememberObservers();
            } catch (java.lang.Throwable th) {
                openWriter.close(false);
                throw th;
            }
        } finally {
            rememberEventDispatcher.clear();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x018c, code lost:
    
        if (((androidx.compose.runtime.RecomposeScopeImpl) r15).getValid() == false) goto L82;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void getHighSpeedVideoSizes(androidx.compose.runtime.changelist.ChangeList p0) {
        java.lang.String str;
        androidx.compose.runtime.internal.RememberEventDispatcher rememberEventDispatcher;
        java.lang.Object obj;
        java.lang.Object obj2;
        long[] jArr;
        long[] jArr2;
        int i;
        char c;
        long j;
        int i2;
        long[] jArr3;
        long[] jArr4;
        androidx.compose.runtime.RecordingApplier<java.lang.Object> pausableApplier$runtime;
        androidx.compose.runtime.CompositionImpl compositionImpl = this;
        compositionImpl.unwrapAs.prepare(compositionImpl.getHighSpeedVideoSizes, compositionImpl.composer.getErrorContext$runtime());
        try {
            if (!p0.isEmpty()) {
                androidx.compose.runtime.PausedCompositionImpl pausedCompositionImpl = compositionImpl.getOutputStallDurationlomOqCM;
                androidx.compose.runtime.RecordingApplier<java.lang.Object> recordingApplier = (pausedCompositionImpl == null || (pausableApplier$runtime = pausedCompositionImpl.getPausableApplier$runtime()) == null) ? compositionImpl.getHighSpeedVideoFpsRangesFor : pausableApplier$runtime;
                androidx.compose.runtime.PausedCompositionImpl pausedCompositionImpl2 = compositionImpl.getOutputStallDurationlomOqCM;
                if (kotlin.jvm.internal.Intrinsics.areEqual(recordingApplier, pausedCompositionImpl2 != null ? pausedCompositionImpl2.getPausableApplier$runtime() : null)) {
                    str = "Compose:recordChanges";
                } else {
                    str = "Compose:applyChanges";
                }
                java.lang.Object beginSection = androidx.compose.runtime.internal.Trace.INSTANCE.beginSection(str);
                try {
                    androidx.compose.runtime.PausedCompositionImpl pausedCompositionImpl3 = compositionImpl.getOutputStallDurationlomOqCM;
                    if (pausedCompositionImpl3 == null || (rememberEventDispatcher = pausedCompositionImpl3.getRememberManager()) == null) {
                        rememberEventDispatcher = compositionImpl.unwrapAs;
                    }
                    recordingApplier.onBeginChanges();
                    androidx.compose.runtime.SlotWriter openWriter = compositionImpl.slotTable.openWriter();
                    int i3 = 0;
                    try {
                        p0.executeAndFlushAllPendingChanges(recordingApplier, openWriter, rememberEventDispatcher, compositionImpl.composer.getErrorContext$runtime());
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        openWriter.close(true);
                        recordingApplier.onEndChanges();
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        androidx.compose.runtime.internal.Trace.INSTANCE.endSection(beginSection);
                        compositionImpl.unwrapAs.dispatchRememberObservers();
                        compositionImpl.unwrapAs.dispatchSideEffects();
                        if (compositionImpl.pendingInvalidScopes) {
                            try {
                                java.lang.Object beginSection2 = androidx.compose.runtime.internal.Trace.INSTANCE.beginSection("Compose:unobserve");
                                try {
                                    compositionImpl.pendingInvalidScopes = false;
                                    androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> mutableScatterMap = compositionImpl.Camera2StreamConfigurationMap;
                                    long[] jArr5 = mutableScatterMap.metadata;
                                    int length = jArr5.length - 2;
                                    if (length >= 0) {
                                        int i4 = 0;
                                        while (true) {
                                            try {
                                                long j2 = jArr5[i4];
                                                char c2 = 7;
                                                long j3 = -9187201950435737472L;
                                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i5 = 8;
                                                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                                                    int i7 = i3;
                                                    while (i7 < i6) {
                                                        if ((j2 & 255) < 128) {
                                                            int i8 = (i4 << 3) + i7;
                                                            java.lang.Object obj3 = mutableScatterMap.keys[i8];
                                                            java.lang.Object obj4 = mutableScatterMap.values[i8];
                                                            if (obj4 instanceof androidx.collection.MutableScatterSet) {
                                                                kotlin.jvm.internal.Intrinsics.checkNotNull(obj4, "");
                                                                androidx.collection.MutableScatterSet mutableScatterSet = (androidx.collection.MutableScatterSet) obj4;
                                                                java.lang.Object[] objArr = mutableScatterSet.elements;
                                                                long[] jArr6 = mutableScatterSet.metadata;
                                                                int length2 = jArr6.length - 2;
                                                                if (length2 >= 0) {
                                                                    obj2 = beginSection2;
                                                                    int i9 = 0;
                                                                    while (true) {
                                                                        try {
                                                                            long j4 = jArr6[i9];
                                                                            jArr2 = jArr5;
                                                                            i = length;
                                                                            c = 7;
                                                                            j = -9187201950435737472L;
                                                                            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                                                                int i11 = 0;
                                                                                while (i11 < i10) {
                                                                                    if ((j4 & 255) < 128) {
                                                                                        jArr4 = jArr6;
                                                                                        int i12 = (i9 << 3) + i11;
                                                                                        if (!((androidx.compose.runtime.RecomposeScopeImpl) objArr[i12]).getValid()) {
                                                                                            mutableScatterSet.removeElementAt(i12);
                                                                                        }
                                                                                    } else {
                                                                                        jArr4 = jArr6;
                                                                                    }
                                                                                    j4 >>= 8;
                                                                                    i11++;
                                                                                    jArr6 = jArr4;
                                                                                }
                                                                                jArr3 = jArr6;
                                                                                if (i10 != 8) {
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                jArr3 = jArr6;
                                                                            }
                                                                            if (i9 == length2) {
                                                                                break;
                                                                            }
                                                                            i9++;
                                                                            jArr5 = jArr2;
                                                                            length = i;
                                                                            jArr6 = jArr3;
                                                                        } catch (java.lang.Throwable th) {
                                                                            th = th;
                                                                            obj = obj2;
                                                                            androidx.compose.runtime.internal.Trace.INSTANCE.endSection(obj);
                                                                            throw th;
                                                                        }
                                                                    }
                                                                } else {
                                                                    obj2 = beginSection2;
                                                                    jArr2 = jArr5;
                                                                    i = length;
                                                                    c = c2;
                                                                    j = -9187201950435737472L;
                                                                }
                                                                if (mutableScatterSet.isEmpty()) {
                                                                    mutableScatterMap.removeValueAt(i8);
                                                                }
                                                                i2 = 8;
                                                            } else {
                                                                obj2 = beginSection2;
                                                                jArr2 = jArr5;
                                                                i = length;
                                                                c = c2;
                                                                j = -9187201950435737472L;
                                                                kotlin.jvm.internal.Intrinsics.checkNotNull(obj4, "");
                                                            }
                                                        } else {
                                                            obj2 = beginSection2;
                                                            jArr2 = jArr5;
                                                            i = length;
                                                            c = c2;
                                                            j = j3;
                                                            i2 = i5;
                                                        }
                                                        j2 >>= i2;
                                                        i7++;
                                                        i5 = i2;
                                                        j3 = j;
                                                        c2 = c;
                                                        beginSection2 = obj2;
                                                        jArr5 = jArr2;
                                                        length = i;
                                                    }
                                                    obj2 = beginSection2;
                                                    jArr = jArr5;
                                                    int i13 = length;
                                                    if (i6 != i5) {
                                                        break;
                                                    } else {
                                                        length = i13;
                                                    }
                                                } else {
                                                    obj2 = beginSection2;
                                                    jArr = jArr5;
                                                }
                                                if (i4 == length) {
                                                    break;
                                                }
                                                i4++;
                                                i3 = 0;
                                                beginSection2 = obj2;
                                                jArr5 = jArr;
                                            } catch (java.lang.Throwable th2) {
                                                th = th2;
                                                obj2 = beginSection2;
                                                obj = obj2;
                                                androidx.compose.runtime.internal.Trace.INSTANCE.endSection(obj);
                                                throw th;
                                            }
                                        }
                                    } else {
                                        obj2 = beginSection2;
                                    }
                                    getHighSpeedVideoFpsRangesFor();
                                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                                    androidx.compose.runtime.internal.Trace.INSTANCE.endSection(obj2);
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    obj = beginSection2;
                                }
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                compositionImpl = this;
                                try {
                                    if (compositionImpl.getInputFormats.isEmpty() && compositionImpl.getOutputStallDurationlomOqCM == null) {
                                        compositionImpl.unwrapAs.dispatchAbandons();
                                    }
                                    throw th;
                                } finally {
                                }
                            }
                        }
                        compositionImpl = this;
                        try {
                            if (compositionImpl.getInputFormats.isEmpty() && compositionImpl.getOutputStallDurationlomOqCM == null) {
                                compositionImpl.unwrapAs.dispatchAbandons();
                            }
                        } finally {
                        }
                    } catch (java.lang.Throwable th5) {
                        openWriter.close(false);
                        throw th5;
                    }
                } catch (java.lang.Throwable th6) {
                    androidx.compose.runtime.internal.Trace.INSTANCE.endSection(beginSection);
                    throw th6;
                }
            } else {
                try {
                    if (compositionImpl.getInputFormats.isEmpty() && compositionImpl.getOutputStallDurationlomOqCM == null) {
                        compositionImpl.unwrapAs.dispatchAbandons();
                    }
                } finally {
                }
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void applyChanges() {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            try {
                getHighSpeedVideoSizes(this.getInputSizeshNQ4ISI);
                getHighSpeedVideoFpsRanges();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            } catch (java.lang.Throwable th) {
                try {
                    if (!this.getHighSpeedVideoSizes.isEmpty()) {
                        androidx.compose.runtime.internal.RememberEventDispatcher rememberEventDispatcher = this.unwrapAs;
                        try {
                            rememberEventDispatcher.prepare(this.getHighSpeedVideoSizes, this.composer.getErrorContext$runtime());
                            rememberEventDispatcher.dispatchAbandons();
                            rememberEventDispatcher.clear();
                        } catch (java.lang.Throwable th2) {
                            rememberEventDispatcher.clear();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (java.lang.Throwable th3) {
                    abandonChanges();
                    throw th3;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void applyLateChanges() {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            try {
                if (this.getInputFormats.isNotEmpty()) {
                    getHighSpeedVideoSizes(this.getInputFormats);
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            } catch (java.lang.Throwable th) {
                try {
                    if (!this.getHighSpeedVideoSizes.isEmpty()) {
                        androidx.compose.runtime.internal.RememberEventDispatcher rememberEventDispatcher = this.unwrapAs;
                        try {
                            rememberEventDispatcher.prepare(this.getHighSpeedVideoSizes, this.composer.getErrorContext$runtime());
                            rememberEventDispatcher.dispatchAbandons();
                            rememberEventDispatcher.clear();
                        } catch (java.lang.Throwable th2) {
                            rememberEventDispatcher.clear();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (java.lang.Throwable th3) {
                    abandonChanges();
                    throw th3;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void changesApplied() {
        androidx.compose.runtime.internal.RememberEventDispatcher rememberEventDispatcher;
        synchronized (this.getHighSpeedVideoFpsRanges) {
            try {
                this.composer.changesApplied$runtime();
                if (!this.getHighSpeedVideoSizes.isEmpty()) {
                    rememberEventDispatcher = this.unwrapAs;
                    try {
                        rememberEventDispatcher.prepare(this.getHighSpeedVideoSizes, this.composer.getErrorContext$runtime());
                        rememberEventDispatcher.dispatchAbandons();
                        rememberEventDispatcher.clear();
                    } finally {
                    }
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            } catch (java.lang.Throwable th) {
                try {
                    if (!this.getHighSpeedVideoSizes.isEmpty()) {
                        rememberEventDispatcher = this.unwrapAs;
                        try {
                            rememberEventDispatcher.prepare(this.getHighSpeedVideoSizes, this.composer.getErrorContext$runtime());
                            rememberEventDispatcher.dispatchAbandons();
                            rememberEventDispatcher.clear();
                        } finally {
                        }
                    }
                    throw th;
                } catch (java.lang.Throwable th2) {
                    abandonChanges();
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void abandonChanges() {
        this.getHighResolutionOutputSizeshNQ4ISI.set(null);
        this.getInputSizeshNQ4ISI.clear();
        this.getInputFormats.clear();
        if (this.getHighSpeedVideoSizes.isEmpty()) {
            return;
        }
        androidx.compose.runtime.internal.RememberEventDispatcher rememberEventDispatcher = this.unwrapAs;
        try {
            rememberEventDispatcher.prepare(this.getHighSpeedVideoSizes, this.composer.getErrorContext$runtime());
            rememberEventDispatcher.dispatchAbandons();
        } finally {
            rememberEventDispatcher.clear();
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void invalidateAll() {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            for (java.lang.Object obj : this.slotTable.getSlots()) {
                androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl = obj instanceof androidx.compose.runtime.RecomposeScopeImpl ? (androidx.compose.runtime.RecomposeScopeImpl) obj : null;
                if (recomposeScopeImpl != null) {
                    recomposeScopeImpl.invalidate();
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void verifyConsistent() {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            if (!isComposing()) {
                this.composer.verifyConsistent$runtime();
                this.slotTable.verifyWellFormed();
                getHighSpeedVideoFpsRanges(this.slotTable);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final <R> R delegateInvalidations(androidx.compose.runtime.ControlledComposition to, int groupIndex, kotlin.jvm.functions.Function0<? extends R> block) {
        if (to != null && !kotlin.jvm.internal.Intrinsics.areEqual(to, this) && groupIndex >= 0) {
            this.getOutputSizes = (androidx.compose.runtime.CompositionImpl) to;
            this.toString = groupIndex;
            try {
                return block.invoke();
            } finally {
                this.getOutputSizes = null;
                this.toString = 0;
            }
        }
        return block.invoke();
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final androidx.compose.runtime.ShouldPauseCallback getAndSetShouldPauseCallback(androidx.compose.runtime.ShouldPauseCallback shouldPause) {
        androidx.compose.runtime.ShouldPauseCallback shouldPauseCallback = this.getOutputMinFrameDurationlomOqCM;
        this.getOutputMinFrameDurationlomOqCM = shouldPause;
        return shouldPauseCallback;
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public final androidx.compose.runtime.InvalidationResult invalidate(androidx.compose.runtime.RecomposeScopeImpl scope, java.lang.Object instance) {
        androidx.compose.runtime.tooling.CompositionObserver inputSizeshNQ4ISI;
        androidx.compose.runtime.CompositionImpl compositionImpl;
        if (scope.getDefaultsInScope()) {
            scope.setDefaultsInvalid(true);
        }
        androidx.compose.runtime.Anchor anchor = scope.getAnchor();
        if (anchor == null || !anchor.getValid()) {
            return androidx.compose.runtime.InvalidationResult.IGNORED;
        }
        if (this.slotTable.ownsAnchor(anchor)) {
            if (!scope.getCanRecompose()) {
                return androidx.compose.runtime.InvalidationResult.IGNORED;
            }
            androidx.compose.runtime.InvalidationResult highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(scope, anchor, instance);
            if (highResolutionOutputSizeshNQ4ISI != androidx.compose.runtime.InvalidationResult.IGNORED && (inputSizeshNQ4ISI = getInputSizeshNQ4ISI()) != null) {
                inputSizeshNQ4ISI.onScopeInvalidated(scope, instance);
            }
            return highResolutionOutputSizeshNQ4ISI;
        }
        synchronized (this.getHighSpeedVideoFpsRanges) {
            compositionImpl = this.getOutputSizes;
        }
        if (compositionImpl != null && compositionImpl.getHighSpeedVideoFpsRangesFor(scope, instance)) {
            return androidx.compose.runtime.InvalidationResult.IMMINENT;
        }
        return androidx.compose.runtime.InvalidationResult.IGNORED;
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public final void recomposeScopeReleased(androidx.compose.runtime.RecomposeScopeImpl scope) {
        this.pendingInvalidScopes = true;
        androidx.compose.runtime.tooling.CompositionObserver inputSizeshNQ4ISI = getInputSizeshNQ4ISI();
        if (inputSizeshNQ4ISI != null) {
            inputSizeshNQ4ISI.onScopeDisposed(scope);
        }
    }

    @Override // androidx.compose.runtime.CompositionServices
    public final <T> T getCompositionService(androidx.compose.runtime.CompositionServiceKey<T> key) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(key, androidx.compose.runtime.CompositionKt.getObservableCompositionServiceKey())) {
            return (T) this;
        }
        return null;
    }

    private final boolean getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.RecomposeScopeImpl p0, java.lang.Object p1) {
        return isComposing() && this.composer.tryImminentInvalidation$runtime(p0, p1);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020 A[Catch: all -> 0x00c2, TryCatch #0 {, blocks: (B:5:0x0009, B:7:0x000e, B:11:0x0020, B:52:0x0026, B:14:0x002c, B:17:0x0039, B:18:0x0042, B:22:0x004e, B:25:0x005c, B:27:0x006c, B:29:0x0078, B:31:0x0082, B:35:0x0091, B:45:0x009b, B:47:0x009e, B:50:0x00a3), top: B:4:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab A[LOOP:0: B:2:0x0006->B:59:0x00ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final androidx.compose.runtime.InvalidationResult getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.RecomposeScopeImpl p0, androidx.compose.runtime.Anchor p1, java.lang.Object p2) {
        int i;
        androidx.compose.runtime.CompositionImpl compositionImpl = this;
        while (true) {
            synchronized (compositionImpl.getHighSpeedVideoFpsRanges) {
                androidx.compose.runtime.CompositionImpl compositionImpl2 = compositionImpl.getOutputSizes;
                if (compositionImpl2 != null && compositionImpl.slotTable.groupContainsAnchor(compositionImpl.toString, p1)) {
                    if (compositionImpl2 == null) {
                        if (compositionImpl.getHighSpeedVideoFpsRangesFor(p0, p2)) {
                            return androidx.compose.runtime.InvalidationResult.IMMINENT;
                        }
                        if (p2 == null) {
                            androidx.compose.runtime.collection.ScopeMap.m5414setimpl(compositionImpl.getOutputSizeshNQ4ISI, p0, androidx.compose.runtime.ScopeInvalidated.INSTANCE);
                        } else if (p2 instanceof androidx.compose.runtime.DerivedState) {
                            java.lang.Object obj = compositionImpl.getOutputSizeshNQ4ISI.get(p0);
                            if (obj != null) {
                                if (obj instanceof androidx.collection.MutableScatterSet) {
                                    androidx.collection.MutableScatterSet mutableScatterSet = (androidx.collection.MutableScatterSet) obj;
                                    java.lang.Object[] objArr = mutableScatterSet.elements;
                                    long[] jArr = mutableScatterSet.metadata;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i2 = 0;
                                        while (true) {
                                            long j = jArr[i2];
                                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i3 = 8;
                                                int i4 = 8 - ((~(i2 - length)) >>> 31);
                                                int i5 = 0;
                                                while (i5 < i4) {
                                                    if ((j & 255) >= 128) {
                                                        i = i3;
                                                    } else {
                                                        if (objArr[(i2 << 3) + i5] == androidx.compose.runtime.ScopeInvalidated.INSTANCE) {
                                                            break;
                                                        }
                                                        i = 8;
                                                    }
                                                    j >>= i;
                                                    i5++;
                                                    i3 = i;
                                                }
                                                if (i4 != i3) {
                                                    break;
                                                }
                                            }
                                            if (i2 == length) {
                                                break;
                                            }
                                            i2++;
                                        }
                                    }
                                } else if (obj == androidx.compose.runtime.ScopeInvalidated.INSTANCE) {
                                }
                            }
                            androidx.compose.runtime.collection.ScopeMap.m5397addimpl(compositionImpl.getOutputSizeshNQ4ISI, p0, p2);
                        } else {
                            androidx.compose.runtime.collection.ScopeMap.m5414setimpl(compositionImpl.getOutputSizeshNQ4ISI, p0, androidx.compose.runtime.ScopeInvalidated.INSTANCE);
                        }
                    }
                    if (compositionImpl2 != null) {
                        compositionImpl.parent.invalidate$runtime(compositionImpl);
                        return compositionImpl.isComposing() ? androidx.compose.runtime.InvalidationResult.DEFERRED : androidx.compose.runtime.InvalidationResult.SCHEDULED;
                    }
                    compositionImpl = compositionImpl2;
                }
                compositionImpl2 = null;
                if (compositionImpl2 == null) {
                }
                if (compositionImpl2 != null) {
                }
            }
        }
    }

    public final void removeObservation$runtime(java.lang.Object instance, androidx.compose.runtime.RecomposeScopeImpl scope) {
        androidx.compose.runtime.collection.ScopeMap.m5410removeimpl(this.Camera2StreamConfigurationMap, instance, scope);
    }

    public final void removeDerivedStateObservation$runtime(androidx.compose.runtime.DerivedState<?> state) {
        if (androidx.compose.runtime.collection.ScopeMap.m5404containsimpl(this.Camera2StreamConfigurationMap, state)) {
            return;
        }
        androidx.compose.runtime.collection.ScopeMap.m5412removeScopeimpl(this.getOutputFormats, state);
    }

    private final androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> getHighSpeedVideoSizesFor() {
        androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> mutableScatterMap = this.getOutputSizeshNQ4ISI;
        this.getOutputSizeshNQ4ISI = androidx.compose.runtime.collection.ScopeMap.m5403constructorimpl$default(null, 1, null);
        return mutableScatterMap;
    }

    private static void getHighSpeedVideoFpsRanges(androidx.compose.runtime.SlotTable p0) {
        java.lang.Object[] slots = p0.getSlots();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : slots) {
            androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl = obj instanceof androidx.compose.runtime.RecomposeScopeImpl ? (androidx.compose.runtime.RecomposeScopeImpl) obj : null;
            if (recomposeScopeImpl != null) {
                arrayList.add(recomposeScopeImpl);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl2 = (androidx.compose.runtime.RecomposeScopeImpl) arrayList2.get(i);
            androidx.compose.runtime.Anchor anchor = recomposeScopeImpl2.getAnchor();
            if (anchor != null && !p0.slotsOf$runtime(anchor.toIndexFor(p0)).contains(recomposeScopeImpl2)) {
                int indexOf = kotlin.collections.ArraysKt.indexOf((androidx.compose.runtime.RecomposeScopeImpl[]) p0.getSlots(), recomposeScopeImpl2);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Misaligned anchor ");
                sb.append(anchor);
                sb.append(" in scope ");
                sb.append(recomposeScopeImpl2);
                sb.append(" encountered, scope found at ");
                sb.append(indexOf);
                androidx.compose.runtime.PreconditionsKt.throwIllegalStateException(sb.toString());
            }
        }
    }

    private final androidx.compose.runtime.tooling.CompositionObserver getInputSizeshNQ4ISI() {
        return this.observerHolder.current();
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public final void deactivate() {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            if (this.getOutputStallDurationlomOqCM != null) {
                androidx.compose.runtime.PreconditionsKt.throwIllegalStateException("Deactivate is not supported while pausable composition is in progress");
            }
            boolean z = this.slotTable.getGroupsSize() > 0;
            if (z || !this.getHighSpeedVideoSizes.isEmpty()) {
                java.lang.Object beginSection = androidx.compose.runtime.internal.Trace.INSTANCE.beginSection("Compose:deactivate");
                try {
                    androidx.compose.runtime.internal.RememberEventDispatcher rememberEventDispatcher = this.unwrapAs;
                    try {
                        rememberEventDispatcher.prepare(this.getHighSpeedVideoSizes, this.composer.getErrorContext$runtime());
                        if (z) {
                            this.getHighSpeedVideoFpsRangesFor.onBeginChanges();
                            androidx.compose.runtime.SlotWriter openWriter = this.slotTable.openWriter();
                            try {
                                androidx.compose.runtime.ComposerImplKt.deactivateCurrentGroup(openWriter, this.unwrapAs);
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                openWriter.close(true);
                                this.getHighSpeedVideoFpsRangesFor.onEndChanges();
                                rememberEventDispatcher.dispatchRememberObservers();
                            } catch (java.lang.Throwable th) {
                                openWriter.close(false);
                                throw th;
                            }
                        }
                        rememberEventDispatcher.dispatchAbandons();
                        rememberEventDispatcher.clear();
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    } catch (java.lang.Throwable th2) {
                        rememberEventDispatcher.clear();
                        throw th2;
                    }
                } finally {
                    androidx.compose.runtime.internal.Trace.INSTANCE.endSection(beginSection);
                }
            }
            androidx.compose.runtime.collection.ScopeMap.m5401clearimpl(this.Camera2StreamConfigurationMap);
            androidx.compose.runtime.collection.ScopeMap.m5401clearimpl(this.getOutputFormats);
            androidx.compose.runtime.collection.ScopeMap.m5401clearimpl(this.getOutputSizeshNQ4ISI);
            this.getInputSizeshNQ4ISI.clear();
            this.getInputFormats.clear();
            this.composer.deactivate$runtime();
            this.isOutputSupportedFor = 1;
            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
        }
    }

    public final int composerStacksSizes$runtime() {
        return this.composer.stacksSize$runtime();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        return true;
     */
    @Override // androidx.compose.runtime.ControlledComposition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean observesAnyOf(java.util.Set<? extends java.lang.Object> values) {
        if (values instanceof androidx.compose.runtime.collection.ScatterSetWrapper) {
            androidx.collection.ScatterSet set$runtime = ((androidx.compose.runtime.collection.ScatterSetWrapper) values).getSet$runtime();
            java.lang.Object[] objArr = set$runtime.elements;
            long[] jArr = set$runtime.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                java.lang.Object obj = objArr[(i << 3) + i3];
                                if (androidx.compose.runtime.collection.ScopeMap.m5404containsimpl(this.Camera2StreamConfigurationMap, obj) || androidx.compose.runtime.collection.ScopeMap.m5404containsimpl(this.getOutputFormats, obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        } else {
            for (java.lang.Object obj2 : values) {
                if (androidx.compose.runtime.collection.ScopeMap.m5404containsimpl(this.Camera2StreamConfigurationMap, obj2) || androidx.compose.runtime.collection.ScopeMap.m5404containsimpl(this.getOutputFormats, obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void getHighSpeedVideoFpsRanges(java.util.Set<? extends java.lang.Object> p0, boolean p1) {
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        int i3;
        int i4;
        boolean contains;
        java.lang.Object[] objArr;
        long[] jArr3;
        java.lang.Object[] objArr2;
        long[] jArr4;
        int i5;
        long[] jArr5;
        int i6;
        int i7;
        long j;
        java.lang.Object[] objArr3;
        long[] jArr6;
        java.lang.Object[] objArr4;
        long[] jArr7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        char c = 7;
        long j2 = -9187201950435737472L;
        int i14 = 8;
        if (p0 instanceof androidx.compose.runtime.collection.ScatterSetWrapper) {
            androidx.collection.ScatterSet set$runtime = ((androidx.compose.runtime.collection.ScatterSetWrapper) p0).getSet$runtime();
            java.lang.Object[] objArr5 = set$runtime.elements;
            long[] jArr8 = set$runtime.metadata;
            int length = jArr8.length - 2;
            if (length >= 0) {
                int i15 = 0;
                while (true) {
                    long j3 = jArr8[i15];
                    if ((((~j3) << c) & j3 & j2) != j2) {
                        int i16 = 8 - ((~(i15 - length)) >>> 31);
                        int i17 = 0;
                        while (i17 < i16) {
                            if ((j3 & 255) < 128) {
                                java.lang.Object obj = objArr5[(i15 << 3) + i17];
                                if (obj instanceof androidx.compose.runtime.RecomposeScopeImpl) {
                                    ((androidx.compose.runtime.RecomposeScopeImpl) obj).invalidateForResult(null);
                                    i9 = i16;
                                    i10 = i17;
                                    i13 = i14;
                                    i11 = length;
                                    i12 = i15;
                                } else {
                                    getHighResolutionOutputSizeshNQ4ISI(obj, p1);
                                    java.lang.Object obj2 = this.getOutputFormats.get(obj);
                                    if (obj2 != null) {
                                        if (obj2 instanceof androidx.collection.MutableScatterSet) {
                                            androidx.collection.MutableScatterSet mutableScatterSet = (androidx.collection.MutableScatterSet) obj2;
                                            java.lang.Object[] objArr6 = mutableScatterSet.elements;
                                            long[] jArr9 = mutableScatterSet.metadata;
                                            int length2 = jArr9.length - 2;
                                            if (length2 >= 0) {
                                                i11 = length;
                                                i12 = i15;
                                                int i18 = 0;
                                                while (true) {
                                                    long j4 = jArr9[i18];
                                                    i9 = i16;
                                                    i10 = i17;
                                                    if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                                        for (int i20 = 0; i20 < i19; i20++) {
                                                            if ((j4 & 255) < 128) {
                                                                getHighResolutionOutputSizeshNQ4ISI((androidx.compose.runtime.DerivedState) objArr6[(i18 << 3) + i20], p1);
                                                            }
                                                            j4 >>= 8;
                                                        }
                                                        if (i19 != 8) {
                                                            break;
                                                        }
                                                    }
                                                    if (i18 == length2) {
                                                        break;
                                                    }
                                                    i18++;
                                                    i16 = i9;
                                                    i17 = i10;
                                                    c = 7;
                                                }
                                            }
                                        } else {
                                            i9 = i16;
                                            i10 = i17;
                                            i11 = length;
                                            i12 = i15;
                                            getHighResolutionOutputSizeshNQ4ISI((androidx.compose.runtime.DerivedState) obj2, p1);
                                        }
                                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                        i13 = 8;
                                    }
                                    i9 = i16;
                                    i10 = i17;
                                    i11 = length;
                                    i12 = i15;
                                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                    i13 = 8;
                                }
                            } else {
                                i9 = i16;
                                i10 = i17;
                                i11 = length;
                                i12 = i15;
                                i13 = i14;
                            }
                            j3 >>= i13;
                            i17 = i10 + 1;
                            length = i11;
                            i14 = i13;
                            i15 = i12;
                            i16 = i9;
                            c = 7;
                        }
                        int i21 = length;
                        i8 = i15;
                        if (i16 != i14) {
                            break;
                        } else {
                            length = i21;
                        }
                    } else {
                        i8 = i15;
                    }
                    if (i8 == length) {
                        break;
                    }
                    i15 = i8 + 1;
                    c = 7;
                    j2 = -9187201950435737472L;
                    i14 = 8;
                }
            }
        } else {
            for (java.lang.Object obj3 : p0) {
                if (obj3 instanceof androidx.compose.runtime.RecomposeScopeImpl) {
                    ((androidx.compose.runtime.RecomposeScopeImpl) obj3).invalidateForResult(null);
                } else {
                    getHighResolutionOutputSizeshNQ4ISI(obj3, p1);
                    java.lang.Object obj4 = this.getOutputFormats.get(obj3);
                    if (obj4 != null) {
                        if (obj4 instanceof androidx.collection.MutableScatterSet) {
                            androidx.collection.MutableScatterSet mutableScatterSet2 = (androidx.collection.MutableScatterSet) obj4;
                            java.lang.Object[] objArr7 = mutableScatterSet2.elements;
                            long[] jArr10 = mutableScatterSet2.metadata;
                            int length3 = jArr10.length - 2;
                            if (length3 >= 0) {
                                int i22 = 0;
                                while (true) {
                                    long j5 = jArr10[i22];
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i23 = 8 - ((~(i22 - length3)) >>> 31);
                                        for (int i24 = 0; i24 < i23; i24++) {
                                            if ((j5 & 255) < 128) {
                                                getHighResolutionOutputSizeshNQ4ISI((androidx.compose.runtime.DerivedState) objArr7[(i22 << 3) + i24], p1);
                                            }
                                            j5 >>= 8;
                                        }
                                        if (i23 != 8) {
                                            break;
                                        }
                                    }
                                    if (i22 == length3) {
                                        break;
                                    } else {
                                        i22++;
                                    }
                                }
                            }
                        } else {
                            getHighResolutionOutputSizeshNQ4ISI((androidx.compose.runtime.DerivedState) obj4, p1);
                        }
                    }
                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                }
            }
        }
        androidx.collection.MutableScatterSet<androidx.compose.runtime.RecomposeScopeImpl> mutableScatterSet3 = this.getOutputMinFrameDuration;
        androidx.collection.MutableScatterSet<androidx.compose.runtime.RecomposeScopeImpl> mutableScatterSet4 = this.getHighSpeedVideoSizesFor;
        if (p1 && mutableScatterSet3.isNotEmpty()) {
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> mutableScatterMap = this.Camera2StreamConfigurationMap;
            long[] jArr11 = mutableScatterMap.metadata;
            int length4 = jArr11.length - 2;
            if (length4 >= 0) {
                int i25 = 0;
                while (true) {
                    long j6 = jArr11[i25];
                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i26 = 8 - ((~(i25 - length4)) >>> 31);
                        int i27 = 0;
                        while (i27 < i26) {
                            if ((j6 & 255) < 128) {
                                int i28 = (i25 << 3) + i27;
                                java.lang.Object obj5 = mutableScatterMap.keys[i28];
                                java.lang.Object obj6 = mutableScatterMap.values[i28];
                                if (obj6 instanceof androidx.collection.MutableScatterSet) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj6, "");
                                    androidx.collection.MutableScatterSet mutableScatterSet5 = (androidx.collection.MutableScatterSet) obj6;
                                    java.lang.Object[] objArr8 = mutableScatterSet5.elements;
                                    long[] jArr12 = mutableScatterSet5.metadata;
                                    jArr5 = jArr11;
                                    int length5 = jArr12.length - 2;
                                    if (length5 >= 0) {
                                        i6 = length4;
                                        i7 = i25;
                                        int i29 = 0;
                                        while (true) {
                                            long j7 = jArr12[i29];
                                            j = j6;
                                            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i30 = 8 - ((~(i29 - length5)) >>> 31);
                                                int i31 = 0;
                                                while (i31 < i30) {
                                                    if ((j7 & 255) < 128) {
                                                        jArr7 = jArr12;
                                                        int i32 = (i29 << 3) + i31;
                                                        objArr4 = objArr8;
                                                        androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl = (androidx.compose.runtime.RecomposeScopeImpl) objArr8[i32];
                                                        if (mutableScatterSet3.contains(recomposeScopeImpl) || mutableScatterSet4.contains(recomposeScopeImpl)) {
                                                            mutableScatterSet5.removeElementAt(i32);
                                                        }
                                                    } else {
                                                        objArr4 = objArr8;
                                                        jArr7 = jArr12;
                                                    }
                                                    j7 >>= 8;
                                                    i31++;
                                                    jArr12 = jArr7;
                                                    objArr8 = objArr4;
                                                }
                                                objArr3 = objArr8;
                                                jArr6 = jArr12;
                                                if (i30 != 8) {
                                                    break;
                                                }
                                            } else {
                                                objArr3 = objArr8;
                                                jArr6 = jArr12;
                                            }
                                            if (i29 == length5) {
                                                break;
                                            }
                                            i29++;
                                            j6 = j;
                                            jArr12 = jArr6;
                                            objArr8 = objArr3;
                                        }
                                    } else {
                                        i6 = length4;
                                        i7 = i25;
                                        j = j6;
                                    }
                                    if (!mutableScatterSet5.isEmpty()) {
                                    }
                                    mutableScatterMap.removeValueAt(i28);
                                } else {
                                    jArr5 = jArr11;
                                    i6 = length4;
                                    i7 = i25;
                                    j = j6;
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj6, "");
                                    androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl2 = (androidx.compose.runtime.RecomposeScopeImpl) obj6;
                                    if (!mutableScatterSet3.contains(recomposeScopeImpl2) && !mutableScatterSet4.contains(recomposeScopeImpl2)) {
                                    }
                                    mutableScatterMap.removeValueAt(i28);
                                }
                            } else {
                                jArr5 = jArr11;
                                i6 = length4;
                                i7 = i25;
                                j = j6;
                            }
                            j6 = j >> 8;
                            i27++;
                            length4 = i6;
                            i25 = i7;
                            jArr11 = jArr5;
                        }
                        jArr4 = jArr11;
                        int i33 = length4;
                        int i34 = i25;
                        if (i26 != 8) {
                            break;
                        }
                        length4 = i33;
                        i5 = i34;
                    } else {
                        jArr4 = jArr11;
                        i5 = i25;
                    }
                    if (i5 == length4) {
                        break;
                    }
                    i25 = i5 + 1;
                    jArr11 = jArr4;
                }
            }
            mutableScatterSet3.clear();
            getHighSpeedVideoFpsRangesFor();
            return;
        }
        if (mutableScatterSet4.isNotEmpty()) {
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> mutableScatterMap2 = this.Camera2StreamConfigurationMap;
            long[] jArr13 = mutableScatterMap2.metadata;
            int length6 = jArr13.length - 2;
            if (length6 >= 0) {
                int i35 = 0;
                while (true) {
                    long j8 = jArr13[i35];
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i36 = 8 - ((~(i35 - length6)) >>> 31);
                        int i37 = 0;
                        while (i37 < i36) {
                            if ((j8 & 255) < 128) {
                                int i38 = (i35 << 3) + i37;
                                java.lang.Object obj7 = mutableScatterMap2.keys[i38];
                                java.lang.Object obj8 = mutableScatterMap2.values[i38];
                                if (obj8 instanceof androidx.collection.MutableScatterSet) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                    androidx.collection.MutableScatterSet mutableScatterSet6 = (androidx.collection.MutableScatterSet) obj8;
                                    java.lang.Object[] objArr9 = mutableScatterSet6.elements;
                                    long[] jArr14 = mutableScatterSet6.metadata;
                                    int length7 = jArr14.length - 2;
                                    if (length7 >= 0) {
                                        i2 = length6;
                                        i3 = i35;
                                        int i39 = 0;
                                        while (true) {
                                            long j9 = jArr14[i39];
                                            i4 = i36;
                                            long[] jArr15 = jArr14;
                                            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i40 = 8 - ((~(i39 - length7)) >>> 31);
                                                int i41 = 0;
                                                while (i41 < i40) {
                                                    if ((j9 & 255) < 128) {
                                                        jArr3 = jArr13;
                                                        int i42 = (i39 << 3) + i41;
                                                        objArr2 = objArr9;
                                                        if (mutableScatterSet4.contains((androidx.compose.runtime.RecomposeScopeImpl) objArr9[i42])) {
                                                            mutableScatterSet6.removeElementAt(i42);
                                                        }
                                                    } else {
                                                        jArr3 = jArr13;
                                                        objArr2 = objArr9;
                                                    }
                                                    j9 >>= 8;
                                                    i41++;
                                                    jArr13 = jArr3;
                                                    objArr9 = objArr2;
                                                }
                                                jArr2 = jArr13;
                                                objArr = objArr9;
                                                if (i40 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr13;
                                                objArr = objArr9;
                                            }
                                            if (i39 == length7) {
                                                break;
                                            }
                                            i39++;
                                            i36 = i4;
                                            jArr14 = jArr15;
                                            jArr13 = jArr2;
                                            objArr9 = objArr;
                                        }
                                    } else {
                                        jArr2 = jArr13;
                                        i2 = length6;
                                        i3 = i35;
                                        i4 = i36;
                                    }
                                    contains = mutableScatterSet6.isEmpty();
                                } else {
                                    jArr2 = jArr13;
                                    i2 = length6;
                                    i3 = i35;
                                    i4 = i36;
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj8, "");
                                    contains = mutableScatterSet4.contains((androidx.compose.runtime.RecomposeScopeImpl) obj8);
                                }
                                if (contains) {
                                    mutableScatterMap2.removeValueAt(i38);
                                }
                            } else {
                                jArr2 = jArr13;
                                i2 = length6;
                                i3 = i35;
                                i4 = i36;
                            }
                            j8 >>= 8;
                            i37++;
                            length6 = i2;
                            i35 = i3;
                            i36 = i4;
                            jArr13 = jArr2;
                        }
                        jArr = jArr13;
                        int i43 = length6;
                        int i44 = i35;
                        if (i36 != 8) {
                            break;
                        }
                        length6 = i43;
                        i = i44;
                    } else {
                        jArr = jArr13;
                        i = i35;
                    }
                    if (i == length6) {
                        break;
                    }
                    i35 = i + 1;
                    jArr13 = jArr;
                }
            }
            getHighSpeedVideoFpsRangesFor();
            mutableScatterSet4.clear();
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void insertMovableContent(java.util.List<kotlin.Pair<androidx.compose.runtime.MovableContentStateReference, androidx.compose.runtime.MovableContentStateReference>> references) {
        int size = references.size();
        for (int i = 0; i < size; i++) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(references.get(i).getFirst().getComposition(), this)) {
                androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Check failed");
                break;
            }
        }
        try {
            this.composer.insertMovableContentReferences(references);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            try {
                if (!this.getHighSpeedVideoSizes.isEmpty()) {
                    androidx.compose.runtime.internal.RememberEventDispatcher rememberEventDispatcher = this.unwrapAs;
                    try {
                        rememberEventDispatcher.prepare(this.getHighSpeedVideoSizes, this.composer.getErrorContext$runtime());
                        rememberEventDispatcher.dispatchAbandons();
                        rememberEventDispatcher.clear();
                    } catch (java.lang.Throwable th2) {
                        rememberEventDispatcher.clear();
                        throw th2;
                    }
                }
                throw th;
            } catch (java.lang.Throwable th3) {
                abandonChanges();
                throw th3;
            }
        }
    }
}
