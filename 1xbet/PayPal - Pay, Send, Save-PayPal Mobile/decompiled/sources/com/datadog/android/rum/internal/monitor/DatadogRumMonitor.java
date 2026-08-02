package com.datadog.android.rum.internal.monitor;

@kotlin.Metadata(d1 = {"\u0000\u008e\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u0000 \u0086\u00022\u00020\u00012\u00020\u0002:\u0002\u0086\u0002Bë\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\u0006\u0010(\u001a\u00020'\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)\u0012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0)\u0012\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0.\u0012\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J5\u0010>\u001a\u00020=2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020\u00032\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0;H\u0016¢\u0006\u0004\b>\u0010?J!\u0010B\u001a\u00020=2\u0006\u0010@\u001a\u00020\u00032\b\u0010A\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\bB\u0010CJ5\u0010L\u001a\u00020=2\u0006\u0010D\u001a\u00020\u00032\u0006\u0010F\u001a\u00020E2\u0006\u0010H\u001a\u00020G2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020J0IH\u0016¢\u0006\u0004\bL\u0010MJ?\u0010N\u001a\u00020=2\u0006\u0010D\u001a\u00020\u00032\u0006\u0010F\u001a\u00020E2\b\u0010H\u001a\u0004\u0018\u00010G2\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0;H\u0016¢\u0006\u0004\bN\u0010OJ?\u0010Q\u001a\u00020=2\u0006\u0010D\u001a\u00020\u00032\u0006\u0010F\u001a\u00020E2\b\u0010P\u001a\u0004\u0018\u00010\u00032\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0;H\u0016¢\u0006\u0004\bQ\u0010RJ\u001f\u0010S\u001a\u00020=2\u0006\u0010:\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\rH\u0016¢\u0006\u0004\bS\u0010CJ#\u0010U\u001a\u00020=2\u0012\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0;H\u0016¢\u0006\u0004\bU\u0010VJ\u001f\u0010Z\u001a\u00020=2\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020\u0003H\u0016¢\u0006\u0004\bZ\u0010[J\u001f\u0010^\u001a\u00020=2\u0006\u0010@\u001a\u00020\r2\u0006\u0010]\u001a\u00020\\H\u0016¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020=H\u0016¢\u0006\u0004\b`\u0010aJ\u0017\u0010b\u001a\u00020=2\u0006\u0010:\u001a\u00020\u0003H\u0016¢\u0006\u0004\bb\u0010cJ%\u0010d\u001a\u00020=2\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0;H\u0016¢\u0006\u0004\bd\u0010VJ\u0017\u0010f\u001a\u00020=2\u0006\u0010e\u001a\u00020\tH\u0016¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020=H\u0016¢\u0006\u0004\bh\u0010aJ\u000f\u0010j\u001a\u00020iH\u0002¢\u0006\u0004\bj\u0010kJ\u000f\u0010l\u001a\u00020=H\u0000¢\u0006\u0004\bl\u0010aJ\u0017\u0010o\u001a\u00020=2\u0006\u0010n\u001a\u00020mH\u0016¢\u0006\u0004\bo\u0010pJ\u001f\u0010t\u001a\u00020=2\u0006\u0010q\u001a\u00020\u00032\u0006\u0010s\u001a\u00020rH\u0016¢\u0006\u0004\bt\u0010uJ\u001f\u0010v\u001a\u00020=2\u0006\u0010q\u001a\u00020\u00032\u0006\u0010s\u001a\u00020rH\u0016¢\u0006\u0004\bv\u0010uJ?\u0010z\u001a\u00020=2\u0006\u0010:\u001a\u00020\u00032\b\u0010w\u001a\u0004\u0018\u00010\u00032\u0006\u0010y\u001a\u00020x2\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0;H\u0016¢\u0006\u0004\bz\u0010{J!\u0010~\u001a\u00020\t2\u0006\u0010|\u001a\u00020\u00032\b\u0010}\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b~\u0010\u007fJ \u0010\u0080\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0;H\u0016¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J*\u0010\u0084\u0001\u001a\u00020=2\u0016\u0010\u0083\u0001\u001a\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020=0\u0082\u0001H\u0016¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0013\u0010\u0087\u0001\u001a\u00030\u0086\u0001H\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J'\u0010j\u001a\u00030\u0086\u00012\u0014\u0010|\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0;H\u0002¢\u0006\u0005\bj\u0010\u0089\u0001J\u001b\u0010\u008b\u0001\u001a\u00020=2\u0007\u0010s\u001a\u00030\u008a\u0001H\u0000¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0011\u0010\u008d\u0001\u001a\u00020=H\u0000¢\u0006\u0005\b\u008d\u0001\u0010aJ\u0011\u0010\u008e\u0001\u001a\u00020=H\u0016¢\u0006\u0005\b\u008e\u0001\u0010aJ\u0019\u0010\u008f\u0001\u001a\u00020=2\u0006\u0010@\u001a\u00020\u0003H\u0016¢\u0006\u0005\b\u008f\u0001\u0010cJ!\u0010\u0091\u0001\u001a\u00020=2\r\u0010<\u001a\t\u0012\u0004\u0012\u00020\u00030\u0090\u0001H\u0016¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0011\u0010\u0093\u0001\u001a\u00020=H\u0016¢\u0006\u0005\b\u0093\u0001\u0010aJ\u001b\u0010\u0095\u0001\u001a\u00020=2\u0007\u00109\u001a\u00030\u0094\u0001H\u0016¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u0011\u0010\u0097\u0001\u001a\u00020=H\u0016¢\u0006\u0005\b\u0097\u0001\u0010aJ\u001c\u0010\u009a\u0001\u001a\u00020=2\b\u0010\u0099\u0001\u001a\u00030\u0098\u0001H\u0016¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u001c\u0010\u009e\u0001\u001a\u00020=2\b\u0010\u009d\u0001\u001a\u00030\u009c\u0001H\u0016¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u001c\u0010¢\u0001\u001a\u00020=2\b\u0010¡\u0001\u001a\u00030 \u0001H\u0016¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u0011\u0010¤\u0001\u001a\u00020=H\u0016¢\u0006\u0005\b¤\u0001\u0010aJ\u001e\u0010§\u0001\u001a\u00020=2\n\u0010¦\u0001\u001a\u0005\u0018\u00010¥\u0001H\u0016¢\u0006\u0006\b§\u0001\u0010¨\u0001J#\u0010©\u0001\u001a\u00020=2\u0006\u0010@\u001a\u00020\u00032\b\u0010A\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0005\b©\u0001\u0010CJ$\u0010¬\u0001\u001a\u00020=2\u0007\u0010ª\u0001\u001a\u00020\u00032\u0007\u0010«\u0001\u001a\u00020\u0003H\u0016¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J\u0011\u0010®\u0001\u001a\u00020=H\u0016¢\u0006\u0005\b®\u0001\u0010aJ7\u0010¯\u0001\u001a\u00020=2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020\u00032\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0;H\u0016¢\u0006\u0005\b¯\u0001\u0010?J:\u0010°\u0001\u001a\u00020=2\u0006\u0010:\u001a\u00020\u00032\b\u0010w\u001a\u0004\u0018\u00010\u00032\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0;H\u0016¢\u0006\u0006\b°\u0001\u0010±\u0001JD\u0010¶\u0001\u001a\u00020=2\u0007\u0010@\u001a\u00030²\u00012\b\u0010´\u0001\u001a\u00030³\u00012\u0007\u0010µ\u0001\u001a\u00020\u00032\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0;H\u0016¢\u0006\u0006\b¶\u0001\u0010·\u0001JC\u0010¶\u0001\u001a\u00020=2\u0006\u0010@\u001a\u00020\u00032\b\u0010´\u0001\u001a\u00030³\u00012\u0007\u0010µ\u0001\u001a\u00020\u00032\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0;H\u0016¢\u0006\u0006\b¶\u0001\u0010¸\u0001J8\u0010¹\u0001\u001a\u00020=2\u0006\u0010@\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u00032\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0;H\u0016¢\u0006\u0006\b¹\u0001\u0010º\u0001J7\u0010»\u0001\u001a\u00020=2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020\u00032\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0;H\u0016¢\u0006\u0005\b»\u0001\u0010?JR\u0010Á\u0001\u001a\u00020=2\u0007\u0010@\u001a\u00030²\u00012\n\u0010½\u0001\u001a\u0005\u0018\u00010¼\u00012\t\u0010¾\u0001\u001a\u0004\u0018\u00010W2\b\u0010À\u0001\u001a\u00030¿\u00012\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0;H\u0016¢\u0006\u0006\bÁ\u0001\u0010Â\u0001JQ\u0010Á\u0001\u001a\u00020=2\u0006\u0010@\u001a\u00020\u00032\n\u0010½\u0001\u001a\u0005\u0018\u00010¼\u00012\t\u0010¾\u0001\u001a\u0004\u0018\u00010W2\b\u0010À\u0001\u001a\u00030¿\u00012\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0;H\u0016¢\u0006\u0006\bÁ\u0001\u0010Ã\u0001Ja\u0010Æ\u0001\u001a\u00020=2\u0007\u0010@\u001a\u00030²\u00012\n\u0010½\u0001\u001a\u0005\u0018\u00010¼\u00012\u0006\u0010D\u001a\u00020\u00032\u0006\u0010F\u001a\u00020E2\u0007\u0010Ä\u0001\u001a\u00020\u00032\t\u0010Å\u0001\u001a\u0004\u0018\u00010\u00032\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0;H\u0016¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001JU\u0010Æ\u0001\u001a\u00020=2\u0007\u0010@\u001a\u00030²\u00012\n\u0010½\u0001\u001a\u0005\u0018\u00010¼\u00012\u0006\u0010D\u001a\u00020\u00032\u0006\u0010F\u001a\u00020E2\u0006\u0010H\u001a\u00020G2\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0;H\u0016¢\u0006\u0006\bÆ\u0001\u0010È\u0001J`\u0010Æ\u0001\u001a\u00020=2\u0006\u0010@\u001a\u00020\u00032\n\u0010½\u0001\u001a\u0005\u0018\u00010¼\u00012\u0006\u0010D\u001a\u00020\u00032\u0006\u0010F\u001a\u00020E2\u0007\u0010Ä\u0001\u001a\u00020\u00032\t\u0010Å\u0001\u001a\u0004\u0018\u00010\u00032\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0;H\u0016¢\u0006\u0006\bÆ\u0001\u0010É\u0001JT\u0010Æ\u0001\u001a\u00020=2\u0006\u0010@\u001a\u00020\u00032\n\u0010½\u0001\u001a\u0005\u0018\u00010¼\u00012\u0006\u0010D\u001a\u00020\u00032\u0006\u0010F\u001a\u00020E2\u0006\u0010H\u001a\u00020G2\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0;H\u0016¢\u0006\u0006\bÆ\u0001\u0010Ê\u0001J\u0011\u0010Ë\u0001\u001a\u00020=H\u0016¢\u0006\u0005\bË\u0001\u0010aJ0\u0010Ì\u0001\u001a\u00020=2\u0006\u0010@\u001a\u00020\r2\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0;H\u0016¢\u0006\u0006\bÌ\u0001\u0010Í\u0001J:\u0010Î\u0001\u001a\u00020=2\u0006\u0010:\u001a\u00020\u00032\b\u0010w\u001a\u0004\u0018\u00010\u00032\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0;H\u0016¢\u0006\u0006\bÎ\u0001\u0010±\u0001J\u001c\u0010Ñ\u0001\u001a\u00020=2\b\u0010Ð\u0001\u001a\u00030Ï\u0001H\u0016¢\u0006\u0006\bÑ\u0001\u0010Ò\u0001J%\u0010Õ\u0001\u001a\u00020=2\b\u0010Ô\u0001\u001a\u00030Ó\u00012\u0007\u0010A\u001a\u00030Ï\u0001H\u0016¢\u0006\u0006\bÕ\u0001\u0010Ö\u0001J\u001a\u0010×\u0001\u001a\u00020=2\u0006\u0010@\u001a\u00020\rH\u0016¢\u0006\u0006\b×\u0001\u0010Ø\u0001R\u001d\u0010\n\u001a\u00020\t8\u0001X\u0080\u0004¢\u0006\u000f\n\u0005\b\n\u0010Ù\u0001\u001a\u0006\bÚ\u0001\u0010Û\u0001R(\u0010Þ\u0001\u001a\u00020\t2\u0006\u0010A\u001a\u00020\t8W@WX\u0096\u000e¢\u0006\u000f\u001a\u0006\bÜ\u0001\u0010Û\u0001\"\u0005\bÝ\u0001\u0010gR,\u0010ß\u0001\u001a\u0005\u0018\u00010¥\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bß\u0001\u0010à\u0001\u001a\u0006\bá\u0001\u0010â\u0001\"\u0006\bã\u0001\u0010¨\u0001R\u001d\u0010\u001e\u001a\u00020\u001d8\u0001X\u0081\u0004¢\u0006\u000f\n\u0005\b\u001e\u0010ä\u0001\u001a\u0006\bå\u0001\u0010æ\u0001R#\u0010é\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0ç\u00018\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\bj\u0010è\u0001R\u001d\u0010\u0010\u001a\u00020\u000f8\u0001X\u0081\u0004¢\u0006\u000f\n\u0005\b\u0010\u0010ê\u0001\u001a\u0006\bë\u0001\u0010ì\u0001R\u0016\u0010j\u001a\u0002058\u0002X\u0083\u0004¢\u0006\b\n\u0006\bé\u0001\u0010í\u0001R\u0017\u0010~\u001a\u00030î\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\bï\u0001\u0010ð\u0001R*\u0010ò\u0001\u001a\u00030ñ\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bò\u0001\u0010ó\u0001\u001a\u0006\bô\u0001\u0010õ\u0001\"\u0006\bö\u0001\u0010÷\u0001R\u001d\u0010ï\u0001\u001a\b\u0012\u0004\u0012\u00020/0.8\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010ø\u0001R\u0016\u0010\u0087\u0001\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b~\u0010ù\u0001R\u0017\u0010ú\u0001\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\b\n\u0006\bú\u0001\u0010û\u0001R#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0001X\u0081\u0004¢\u0006\u000f\n\u0005\b\b\u0010ü\u0001\u001a\u0006\bý\u0001\u0010þ\u0001R\u001d\u0010\u0012\u001a\u00020\u00118\u0001X\u0081\u0004¢\u0006\u000f\n\u0005\b\u0012\u0010ÿ\u0001\u001a\u0006\b\u0080\u0002\u0010\u0081\u0002R\u001d\u0010\u000b\u001a\u00020\t8\u0001X\u0081\u0004¢\u0006\u000f\n\u0005\b\u000b\u0010Ù\u0001\u001a\u0006\b\u0082\u0002\u0010Û\u0001R\u001d\u0010\u0085\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0083\u0002\u0010\u0084\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/monitor/DatadogRumMonitor;", "Lcom/datadog/android/rum/RumMonitor;", "Lcom/datadog/android/rum/internal/monitor/AdvancedRumMonitor;", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.APPLICATION_ID_KEY, "Lcom/datadog/android/core/InternalSdkCore;", "sdkCore", "Lcom/datadog/android/core/sampling/Sampler;", "sessionSampler", "", "backgroundTrackingEnabled", "trackFrustrations", "Lcom/datadog/android/api/storage/DataWriter;", "", "writer", "Landroid/os/Handler;", "handler", "Lcom/datadog/android/telemetry/internal/TelemetryEventHandler;", "telemetryEventHandler", "Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;", "sessionEndedMetricDispatcher", "Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "firstPartyHostHeaderTypeResolver", "Lcom/datadog/android/rum/internal/vitals/VitalMonitor;", "cpuVitalMonitor", "memoryVitalMonitor", "frameRateVitalMonitor", "Lcom/datadog/android/rum/RumSessionListener;", "sessionListener", "Ljava/util/concurrent/ExecutorService;", "executorService", "Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;", "initialResourceIdentifier", "Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;", "lastInteractionIdentifier", "Lcom/datadog/android/rum/internal/metric/slowframes/SlowFramesListener;", "slowFramesListener", "Lcom/datadog/android/rum/RumSessionType;", "rumSessionTypeOverride", "Lcom/datadog/android/rum/internal/domain/accessibility/AccessibilitySnapshotManager;", "accessibilitySnapshotManager", "Lcom/datadog/android/rum/internal/domain/InfoProvider;", "Lcom/datadog/android/rum/internal/domain/battery/BatteryInfo;", "batteryInfoProvider", "Lcom/datadog/android/rum/internal/domain/display/DisplayInfo;", "displayInfoProvider", "Lkotlin/Function0;", "Lcom/datadog/android/rum/internal/startup/RumSessionScopeStartupManager;", "rumSessionScopeStartupManagerFactory", "Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;", "insightsCollector", "<init>", "(Ljava/lang/String;Lcom/datadog/android/core/InternalSdkCore;Lcom/datadog/android/core/sampling/Sampler;ZZLcom/datadog/android/api/storage/DataWriter;Landroid/os/Handler;Lcom/datadog/android/telemetry/internal/TelemetryEventHandler;Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;Lcom/datadog/android/rum/internal/vitals/VitalMonitor;Lcom/datadog/android/rum/internal/vitals/VitalMonitor;Lcom/datadog/android/rum/internal/vitals/VitalMonitor;Lcom/datadog/android/rum/RumSessionListener;Ljava/util/concurrent/ExecutorService;Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;Lcom/datadog/android/rum/internal/metric/slowframes/SlowFramesListener;Lcom/datadog/android/rum/RumSessionType;Lcom/datadog/android/rum/internal/domain/accessibility/AccessibilitySnapshotManager;Lcom/datadog/android/rum/internal/domain/InfoProvider;Lcom/datadog/android/rum/internal/domain/InfoProvider;Lkotlin/jvm/functions/Function0;Lcom/datadog/android/rum/internal/instrumentation/insights/InsightsCollector;)V", "Lcom/datadog/android/rum/_RumInternalProxy;", "_getInternal", "()Lcom/datadog/android/rum/_RumInternalProxy;", "Lcom/datadog/android/rum/RumActionType;", "type", "name", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "", "addAction", "(Lcom/datadog/android/rum/RumActionType;Ljava/lang/String;Ljava/util/Map;)V", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "addAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", "message", "Lcom/datadog/android/rum/RumErrorSource;", "source", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "Lcom/datadog/android/core/feature/event/ThreadDump;", "threads", "addCrash", "(Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/util/List;)V", "addError", "(Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/util/Map;)V", "stacktrace", "addErrorWithStacktrace", "(Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/String;Ljava/util/Map;)V", "addFeatureFlagEvaluation", "featureFlags", "addFeatureFlagEvaluations", "(Ljava/util/Map;)V", "", "durationNs", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "addLongTask", "(JLjava/lang/String;)V", "Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;", "timing", "addResourceTiming", "(Ljava/lang/Object;Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;)V", "addSessionReplaySkippedFrame", "()V", "addTiming", "(Ljava/lang/String;)V", "addViewAttributes", "overwrite", "addViewLoadingTime", "(Z)V", "clearAttributes", "Lcom/datadog/android/rum/internal/domain/RumContext;", "getHighResolutionOutputSizeshNQ4ISI", "()Lcom/datadog/android/rum/internal/domain/RumContext;", "drainExecutorService$dd_sdk_android_rum_release", "Landroid/app/Activity;", "activity", "enableJankStatsTracking", "(Landroid/app/Activity;)V", com.datadog.android.rum.internal.domain.event.RumEventMeta.VIEW_ID_KEY, "Lcom/datadog/android/rum/internal/monitor/StorageEvent;", "event", "eventDropped", "(Ljava/lang/String;Lcom/datadog/android/rum/internal/monitor/StorageEvent;)V", "eventSent", "operationKey", "Lcom/datadog/android/rum/featureoperations/FailureReason;", "failureReason", "failFeatureOperation", "(Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/featureoperations/FailureReason;Ljava/util/Map;)V", "p0", "p1", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;Ljava/lang/String;)Z", "getAttributes", "()Ljava/util/Map;", "Lkotlin/Function1;", com.sun.jna.Callback.METHOD_NAME, "getCurrentSessionId", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/datadog/android/rum/internal/domain/Time;", "getHighSpeedVideoSizes", "()Lcom/datadog/android/rum/internal/domain/Time;", "(Ljava/util/Map;)Lcom/datadog/android/rum/internal/domain/Time;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "handleEvent$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;)V", "notifyDebugListenerWithState$dd_sdk_android_rum_release", "notifyInterceptorInstantiated", "removeAttribute", "", "removeViewAttributes", "(Ljava/util/Collection;)V", "reportAppFullyDisplayed", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage$NetworkInstrumentation$LibraryType;", "reportNetworkingLibraryType", "(Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage$NetworkInstrumentation$LibraryType;)V", "resetSession", "Lcom/datadog/android/rum/internal/startup/RumStartupScenario;", com.datadog.android.rum.internal.startup.RumAppStartupTelemetryReporterImpl.KEY_SCENARIO, "sendAppStartEvent", "(Lcom/datadog/android/rum/internal/startup/RumStartupScenario;)V", "Lcom/datadog/android/rum/internal/startup/RumTTIDInfo;", "info", "sendTTIDEvent", "(Lcom/datadog/android/rum/internal/startup/RumTTIDInfo;)V", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;", "telemetryEvent", "sendTelemetryEvent", "(Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;)V", "sendWebViewEvent", "Lcom/datadog/android/rum/internal/debug/RumDebugListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setDebugListener", "(Lcom/datadog/android/rum/internal/debug/RumDebugListener;)V", "setInternalViewAttribute", "testId", "resultId", "setSyntheticsAttribute", "(Ljava/lang/String;Ljava/lang/String;)V", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "startAction", "startFeatureOperation", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lcom/datadog/android/rum/resource/ResourceId;", "Lcom/datadog/android/rum/RumResourceMethod;", "method", "url", "startResource", "(Lcom/datadog/android/rum/resource/ResourceId;Lcom/datadog/android/rum/RumResourceMethod;Ljava/lang/String;Ljava/util/Map;)V", "(Ljava/lang/String;Lcom/datadog/android/rum/RumResourceMethod;Ljava/lang/String;Ljava/util/Map;)V", "startView", "(Ljava/lang/Object;Ljava/lang/String;Ljava/util/Map;)V", "stopAction", "", "statusCode", io.ktor.http.ContentDisposition.Parameters.Size, "Lcom/datadog/android/rum/RumResourceKind;", "kind", "stopResource", "(Lcom/datadog/android/rum/resource/ResourceId;Ljava/lang/Integer;Ljava/lang/Long;Lcom/datadog/android/rum/RumResourceKind;Ljava/util/Map;)V", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Lcom/datadog/android/rum/RumResourceKind;Ljava/util/Map;)V", "stackTrace", "errorType", "stopResourceWithError", "(Lcom/datadog/android/rum/resource/ResourceId;Ljava/lang/Integer;Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "(Lcom/datadog/android/rum/resource/ResourceId;Ljava/lang/Integer;Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/util/Map;)V", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/util/Map;)V", "stopSession", "stopView", "(Ljava/lang/Object;Ljava/util/Map;)V", "succeedFeatureOperation", "", "frameTimeSeconds", "updateExternalRefreshRate", "(D)V", "Lcom/datadog/android/rum/RumPerformanceMetric;", "metric", "updatePerformanceMetric", "(Lcom/datadog/android/rum/RumPerformanceMetric;D)V", "waitForResourceTiming", "(Ljava/lang/Object;)V", "Z", "getBackgroundTrackingEnabled$dd_sdk_android_rum_release", "()Z", "getDebug", "setDebug", com.datadog.android.rum.internal.domain.event.RumEventDeserializer.TELEMETRY_TYPE_DEBUG, "debugListener", "Lcom/datadog/android/rum/internal/debug/RumDebugListener;", "getDebugListener$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/debug/RumDebugListener;", "setDebugListener$dd_sdk_android_rum_release", "Ljava/util/concurrent/ExecutorService;", "getExecutorService$dd_sdk_android_rum_release", "()Ljava/util/concurrent/ExecutorService;", "", "Ljava/util/Map;", "getHighSpeedVideoFpsRanges", "Landroid/os/Handler;", "getHandler$dd_sdk_android_rum_release", "()Landroid/os/Handler;", "Lcom/datadog/android/rum/_RumInternalProxy;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Camera2StreamConfigurationMap", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/datadog/android/rum/internal/domain/scope/RumApplicationScope;", "rootScope", "Lcom/datadog/android/rum/internal/domain/scope/RumApplicationScope;", "getRootScope$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/domain/scope/RumApplicationScope;", "setRootScope$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/internal/domain/scope/RumApplicationScope;)V", "Lkotlin/jvm/functions/Function0;", "Lcom/datadog/android/core/InternalSdkCore;", "getHighSpeedVideoSizesFor", "Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;", "Lcom/datadog/android/core/sampling/Sampler;", "getSessionSampler$dd_sdk_android_rum_release", "()Lcom/datadog/android/core/sampling/Sampler;", "Lcom/datadog/android/telemetry/internal/TelemetryEventHandler;", "getTelemetryEventHandler$dd_sdk_android_rum_release", "()Lcom/datadog/android/telemetry/internal/TelemetryEventHandler;", "getTrackFrustrations$dd_sdk_android_rum_release", "getOutputMinFrameDuration", "Lcom/datadog/android/api/storage/DataWriter;", "getInputFormats", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DatadogRumMonitor implements com.datadog.android.rum.RumMonitor, com.datadog.android.rum.internal.monitor.AdvancedRumMonitor {
    public static final java.lang.String CANNOT_WRITE_CRASH_WRITE_CONTEXT_IS_NOT_AVAILABLE = "Cannot write JVM crash, because write context is not available.";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.rum.internal.monitor.DatadogRumMonitor.Companion INSTANCE = new com.datadog.android.rum.internal.monitor.DatadogRumMonitor.Companion(null);
    public static final long DRAIN_WAIT_SECONDS = 10;
    public static final java.lang.String FO_ERROR_INVALID_NAME = "Feature operation name cannot be an empty or blank string but was \"%s\". Vital event won't be sent.";
    public static final java.lang.String FO_ERROR_INVALID_OPERATION_KEY = "Feature operation key cannot be an empty or blank string but was \"%s\". Vital event won't be sent.";
    public static final java.lang.String RUM_DEBUG_RUM_NOT_ENABLED_WARNING = "Cannot switch RUM debugging, because RUM feature is not enabled.";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoFpsRangesFor;
    private final boolean backgroundTrackingEnabled;
    private com.datadog.android.rum.internal.debug.RumDebugListener debugListener;
    private final java.util.concurrent.ExecutorService executorService;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.rum._RumInternalProxy getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.core.InternalSdkCore getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<com.datadog.android.rum.internal.startup.RumSessionScopeStartupManager> Camera2StreamConfigurationMap;
    private final com.datadog.android.rum.internal.metric.SessionMetricDispatcher getHighSpeedVideoSizesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.datadog.android.api.storage.DataWriter<java.lang.Object> getInputFormats;
    private final android.os.Handler handler;
    private com.datadog.android.rum.internal.domain.scope.RumApplicationScope rootScope;
    private final com.datadog.android.core.sampling.Sampler<java.lang.String> sessionSampler;
    private final com.datadog.android.telemetry.internal.TelemetryEventHandler telemetryEventHandler;
    private final boolean trackFrustrations;

    /* JADX WARN: Multi-variable type inference failed */
    public DatadogRumMonitor(java.lang.String str, com.datadog.android.core.InternalSdkCore internalSdkCore, com.datadog.android.core.sampling.Sampler<java.lang.String> sampler, boolean z, boolean z2, com.datadog.android.api.storage.DataWriter<java.lang.Object> dataWriter, android.os.Handler handler, com.datadog.android.telemetry.internal.TelemetryEventHandler telemetryEventHandler, com.datadog.android.rum.internal.metric.SessionMetricDispatcher sessionMetricDispatcher, com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver firstPartyHostHeaderTypeResolver, com.datadog.android.rum.internal.vitals.VitalMonitor vitalMonitor, com.datadog.android.rum.internal.vitals.VitalMonitor vitalMonitor2, com.datadog.android.rum.internal.vitals.VitalMonitor vitalMonitor3, com.datadog.android.rum.RumSessionListener rumSessionListener, java.util.concurrent.ExecutorService executorService, com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier initialResourceIdentifier, com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier lastInteractionIdentifier, com.datadog.android.rum.internal.metric.slowframes.SlowFramesListener slowFramesListener, com.datadog.android.rum.RumSessionType rumSessionType, com.datadog.android.rum.internal.domain.accessibility.AccessibilitySnapshotManager accessibilitySnapshotManager, com.datadog.android.rum.internal.domain.InfoProvider<com.datadog.android.rum.internal.domain.battery.BatteryInfo> infoProvider, com.datadog.android.rum.internal.domain.InfoProvider<com.datadog.android.rum.internal.domain.display.DisplayInfo> infoProvider2, kotlin.jvm.functions.Function0<? extends com.datadog.android.rum.internal.startup.RumSessionScopeStartupManager> function0, com.datadog.android.rum.internal.instrumentation.insights.InsightsCollector insightsCollector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalSdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sampler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataWriter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(telemetryEventHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionMetricDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstPartyHostHeaderTypeResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vitalMonitor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vitalMonitor2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vitalMonitor3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumSessionListener, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executorService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialResourceIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessibilitySnapshotManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(infoProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(infoProvider2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(insightsCollector, "");
        this.getHighSpeedVideoSizes = internalSdkCore;
        this.sessionSampler = sampler;
        this.backgroundTrackingEnabled = z;
        this.trackFrustrations = z2;
        this.getInputFormats = dataWriter;
        this.handler = handler;
        this.telemetryEventHandler = telemetryEventHandler;
        this.getHighSpeedVideoSizesFor = sessionMetricDispatcher;
        this.executorService = executorService;
        this.Camera2StreamConfigurationMap = function0;
        this.rootScope = new com.datadog.android.rum.internal.domain.scope.RumApplicationScope(str, internalSdkCore, sampler, z, z2, firstPartyHostHeaderTypeResolver, vitalMonitor, vitalMonitor2, vitalMonitor3, sessionMetricDispatcher, new com.datadog.android.rum.internal.CombinedRumSessionListener(rumSessionListener, telemetryEventHandler), initialResourceIdentifier, lastInteractionIdentifier, slowFramesListener, rumSessionType, accessibilitySnapshotManager, infoProvider, infoProvider2, function0, insightsCollector);
        this.getHighResolutionOutputSizeshNQ4ISI = new com.datadog.android.rum._RumInternalProxy(this);
        this.getHighSpeedVideoFpsRanges = new java.util.concurrent.ConcurrentHashMap();
        this.getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public final com.datadog.android.core.sampling.Sampler<java.lang.String> getSessionSampler$dd_sdk_android_rum_release() {
        return this.sessionSampler;
    }

    /* renamed from: getBackgroundTrackingEnabled$dd_sdk_android_rum_release, reason: from getter */
    public final boolean getBackgroundTrackingEnabled() {
        return this.backgroundTrackingEnabled;
    }

    /* renamed from: getTrackFrustrations$dd_sdk_android_rum_release, reason: from getter */
    public final boolean getTrackFrustrations() {
        return this.trackFrustrations;
    }

    /* renamed from: getHandler$dd_sdk_android_rum_release, reason: from getter */
    public final android.os.Handler getHandler() {
        return this.handler;
    }

    /* renamed from: getTelemetryEventHandler$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.telemetry.internal.TelemetryEventHandler getTelemetryEventHandler() {
        return this.telemetryEventHandler;
    }

    /* renamed from: getExecutorService$dd_sdk_android_rum_release, reason: from getter */
    public final java.util.concurrent.ExecutorService getExecutorService() {
        return this.executorService;
    }

    /* renamed from: getRootScope$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.internal.domain.scope.RumApplicationScope getRootScope() {
        return this.rootScope;
    }

    public final void setRootScope$dd_sdk_android_rum_release(com.datadog.android.rum.internal.domain.scope.RumApplicationScope rumApplicationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumApplicationScope, "");
        this.rootScope = rumApplicationScope;
    }

    /* renamed from: getDebugListener$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.internal.debug.RumDebugListener getDebugListener() {
        return this.debugListener;
    }

    public final void setDebugListener$dd_sdk_android_rum_release(com.datadog.android.rum.internal.debug.RumDebugListener rumDebugListener) {
        this.debugListener = rumDebugListener;
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void getCurrentSessionId(final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        com.datadog.android.core.internal.utils.ConcurrencyExtKt.executeSafe(this.executorService, "Get current session ID", this.getHighSpeedVideoSizes.getInternalLogger(), new java.lang.Runnable() { // from class: com.datadog.android.rum.internal.monitor.DatadogRumMonitor$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.datadog.android.rum.internal.monitor.DatadogRumMonitor.$r8$lambda$4u9YU1PHyuB_xq8RMX9LZWLfoqQ(com.datadog.android.rum.internal.monitor.DatadogRumMonitor.this, callback);
            }
        });
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final boolean getDebug() {
        return this.getHighSpeedVideoFpsRangesFor.get();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void setDebug(boolean z) {
        if (z == this.getHighSpeedVideoFpsRangesFor.get()) {
            return;
        }
        com.datadog.android.api.feature.FeatureScope feature = this.getHighSpeedVideoSizes.getFeature("rum");
        com.datadog.android.rum.internal.RumFeature rumFeature = feature != null ? (com.datadog.android.rum.internal.RumFeature) feature.unwrap() : null;
        if (rumFeature == null) {
            com.datadog.android.api.InternalLoggerKt.logToUser$default(this.getHighSpeedVideoSizes.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.WARN, false, new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.monitor.DatadogRumMonitor$debug$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.rum.internal.monitor.DatadogRumMonitor.RUM_DEBUG_RUM_NOT_ENABLED_WARNING;
                }
            }, 2, null);
            return;
        }
        if (z) {
            rumFeature.enableDebugging$dd_sdk_android_rum_release(this);
        } else {
            rumFeature.disableDebugging$dd_sdk_android_rum_release();
        }
        this.getHighSpeedVideoFpsRangesFor.set(z);
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void startView(java.lang.Object key, java.lang.String name2, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartView(com.datadog.android.rum.internal.domain.scope.RumScopeKey.INSTANCE.from(key, name2), kotlin.collections.MapsKt.toMap(attributes), getHighResolutionOutputSizeshNQ4ISI(attributes)));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void stopView(java.lang.Object key, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopView(com.datadog.android.rum.internal.domain.scope.RumScopeKey.Companion.from$default(com.datadog.android.rum.internal.domain.scope.RumScopeKey.INSTANCE, key, null, 2, null), kotlin.collections.MapsKt.toMap(attributes), getHighResolutionOutputSizeshNQ4ISI(attributes)));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void addAction(com.datadog.android.rum.RumActionType type, java.lang.String name2, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartAction(type, name2, false, kotlin.collections.MapsKt.toMap(attributes), getHighResolutionOutputSizeshNQ4ISI(attributes)));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void startAction(com.datadog.android.rum.RumActionType type, java.lang.String name2, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartAction(type, name2, true, kotlin.collections.MapsKt.toMap(attributes), getHighResolutionOutputSizeshNQ4ISI(attributes)));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void stopAction(com.datadog.android.rum.RumActionType type, java.lang.String name2, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopAction(type, name2, kotlin.collections.MapsKt.toMap(attributes), getHighResolutionOutputSizeshNQ4ISI(attributes)));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void startResource(java.lang.String key, com.datadog.android.rum.RumResourceMethod method, java.lang.String url, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartResource(key, url, method, kotlin.collections.MapsKt.toMap(attributes), getHighResolutionOutputSizeshNQ4ISI(attributes)));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void stopResource(java.lang.String key, java.lang.Integer statusCode, java.lang.Long size, com.datadog.android.rum.RumResourceKind kind, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kind, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResource(key, statusCode != null ? java.lang.Long.valueOf(statusCode.intValue()) : null, size, kind, kotlin.collections.MapsKt.toMap(attributes), getHighResolutionOutputSizeshNQ4ISI(attributes)));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void stopResourceWithError(java.lang.String key, java.lang.Integer statusCode, java.lang.String message, com.datadog.android.rum.RumErrorSource source, java.lang.Throwable throwable, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResourceWithError(key, statusCode != null ? java.lang.Long.valueOf(statusCode.intValue()) : null, message, source, throwable, kotlin.collections.MapsKt.toMap(attributes), getHighResolutionOutputSizeshNQ4ISI(attributes)));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void stopResourceWithError(java.lang.String key, java.lang.Integer statusCode, java.lang.String message, com.datadog.android.rum.RumErrorSource source, java.lang.String stackTrace, java.lang.String errorType, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stackTrace, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResourceWithStackTrace(key, statusCode != null ? java.lang.Long.valueOf(statusCode.intValue()) : null, message, source, stackTrace, errorType, kotlin.collections.MapsKt.toMap(attributes), getHighResolutionOutputSizeshNQ4ISI(attributes)));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor
    public final void startResource(com.datadog.android.rum.resource.ResourceId key, com.datadog.android.rum.RumResourceMethod method, java.lang.String url, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartResource(key, url, method, kotlin.collections.MapsKt.toMap(attributes), getHighResolutionOutputSizeshNQ4ISI(attributes)));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor
    public final void stopResource(com.datadog.android.rum.resource.ResourceId key, java.lang.Integer statusCode, java.lang.Long size, com.datadog.android.rum.RumResourceKind kind, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kind, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResource(key, statusCode != null ? java.lang.Long.valueOf(statusCode.intValue()) : null, size, kind, kotlin.collections.MapsKt.toMap(attributes), getHighResolutionOutputSizeshNQ4ISI(attributes)));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor
    public final void stopResourceWithError(com.datadog.android.rum.resource.ResourceId key, java.lang.Integer statusCode, java.lang.String message, com.datadog.android.rum.RumErrorSource source, java.lang.Throwable throwable, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResourceWithError(key, statusCode != null ? java.lang.Long.valueOf(statusCode.intValue()) : null, message, source, throwable, kotlin.collections.MapsKt.toMap(attributes), getHighResolutionOutputSizeshNQ4ISI(attributes)));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor
    public final void stopResourceWithError(com.datadog.android.rum.resource.ResourceId key, java.lang.Integer statusCode, java.lang.String message, com.datadog.android.rum.RumErrorSource source, java.lang.String stackTrace, java.lang.String errorType, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stackTrace, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopResourceWithStackTrace(key, statusCode != null ? java.lang.Long.valueOf(statusCode.intValue()) : null, message, source, stackTrace, errorType, kotlin.collections.MapsKt.toMap(attributes), getHighResolutionOutputSizeshNQ4ISI(attributes)));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void addError(java.lang.String message, com.datadog.android.rum.RumErrorSource source, java.lang.Throwable throwable, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        com.datadog.android.rum.internal.domain.Time highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(attributes);
        java.lang.Object obj = attributes.get(com.datadog.android.rum.RumAttributes.INTERNAL_ERROR_TYPE);
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(attributes);
        java.lang.Object remove = mutableMap.remove(com.datadog.android.rum.RumAttributes.INTERNAL_ALL_THREADS);
        java.util.List list = remove instanceof java.util.List ? (java.util.List) remove : null;
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddError(message, source, throwable, null, false, mutableMap, highResolutionOutputSizeshNQ4ISI, str, null, list == null ? kotlin.collections.CollectionsKt.emptyList() : list, null, 1280, null));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.datadog.android.rum.RumMonitor
    public final void addErrorWithStacktrace(java.lang.String message, com.datadog.android.rum.RumErrorSource source, java.lang.String stacktrace, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        com.datadog.android.rum.internal.RumErrorSourceType rumErrorSourceType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        com.datadog.android.rum.internal.domain.Time highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(attributes);
        java.lang.Object obj = attributes.get(com.datadog.android.rum.RumAttributes.INTERNAL_ERROR_TYPE);
        java.lang.String str = null;
        java.lang.String str2 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.lang.Object obj2 = attributes.get("_dd.error.source_type");
        java.lang.String str3 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        if (str3 != null) {
            java.util.Locale locale = java.util.Locale.US;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            str = str3.toLowerCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -861391249:
                    str.equals(com.datadog.android.core.internal.CoreFeature.DEFAULT_SOURCE_NAME);
                    break;
                case -760334308:
                    if (str.equals("flutter")) {
                        rumErrorSourceType = com.datadog.android.rum.internal.RumErrorSourceType.FLUTTER;
                        break;
                    }
                    break;
                case -380982102:
                    if (str.equals("ndk+il2cpp")) {
                        rumErrorSourceType = com.datadog.android.rum.internal.RumErrorSourceType.NDK_IL2CPP;
                        break;
                    }
                    break;
                case 108917:
                    if (str.equals("ndk")) {
                        rumErrorSourceType = com.datadog.android.rum.internal.RumErrorSourceType.NDK;
                        break;
                    }
                    break;
                case 150940456:
                    if (str.equals("browser")) {
                        rumErrorSourceType = com.datadog.android.rum.internal.RumErrorSourceType.BROWSER;
                        break;
                    }
                    break;
                case 828638245:
                    if (str.equals("react-native")) {
                        rumErrorSourceType = com.datadog.android.rum.internal.RumErrorSourceType.REACT_NATIVE;
                        break;
                    }
                    break;
            }
            handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddError(message, source, null, stacktrace, false, kotlin.collections.MapsKt.toMap(attributes), highResolutionOutputSizeshNQ4ISI, str2, rumErrorSourceType, kotlin.collections.CollectionsKt.emptyList(), null, 1024, null));
        }
        rumErrorSourceType = com.datadog.android.rum.internal.RumErrorSourceType.ANDROID;
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddError(message, source, null, stacktrace, false, kotlin.collections.MapsKt.toMap(attributes), highResolutionOutputSizeshNQ4ISI, str2, rumErrorSourceType, kotlin.collections.CollectionsKt.emptyList(), null, 1024, null));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void addFeatureFlagEvaluation(java.lang.String name2, java.lang.Object value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddFeatureFlagEvaluation(name2, value, null, 4, null));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void addFeatureFlagEvaluations(java.util.Map<java.lang.String, ? extends java.lang.Object> featureFlags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureFlags, "");
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddFeatureFlagEvaluations(featureFlags, null, 2, null));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void stopSession() {
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopSession(null, 1, null));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void reportAppFullyDisplayed() {
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.AppStartTTFDEvent(null, 1, null));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void addAttribute(java.lang.String key, java.lang.Object value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        if (value == null) {
            this.getHighSpeedVideoFpsRanges.remove(key);
        } else {
            this.getHighSpeedVideoFpsRanges.put(key, value);
        }
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void removeAttribute(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        this.getHighSpeedVideoFpsRanges.remove(key);
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final java.util.Map<java.lang.String, java.lang.Object> getAttributes() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void clearAttributes() {
        this.getHighSpeedVideoFpsRanges.clear();
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void sendWebViewEvent() {
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.WebViewEvent(null, 1, null));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void resetSession() {
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.ResetSession(null, 1, null));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void start() {
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.SdkInit(com.datadog.android.rum.DdRumContentProvider.INSTANCE.getProcessImportance() == 100, null, 2, null));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor
    public final void waitForResourceTiming(java.lang.Object key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.WaitForResourceTiming(key, null, 2, null));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor
    public final void addResourceTiming(java.lang.Object key, com.datadog.android.rum.internal.domain.event.ResourceTiming timing) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timing, "");
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddResourceTiming(key, timing, null, 4, null));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void addCrash(java.lang.String message, com.datadog.android.rum.RumErrorSource source, java.lang.Throwable throwable, java.util.List<com.datadog.android.core.feature.event.ThreadDump> threads) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threads, "");
        com.datadog.android.rum.internal.domain.Time highSpeedVideoSizes = getHighSpeedVideoSizes();
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddError(message, source, throwable, null, true, kotlin.collections.MapsKt.emptyMap(), highSpeedVideoSizes, null, null, threads, java.lang.Long.valueOf(highSpeedVideoSizes.getNanoTime() - this.getHighSpeedVideoSizes.getAppStartTimeNs()), 384, null));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void addTiming(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddCustomTiming(name2, null, 2, null));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void addViewLoadingTime(boolean overwrite) {
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddViewLoadingTime(overwrite, getHighSpeedVideoSizes()));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void addViewAttributes(java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddViewAttributes(attributes, null, 2, null));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void removeViewAttributes(java.util.Collection<java.lang.String> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.RemoveViewAttributes(attributes, null, 2, null));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void addLongTask(long durationNs, java.lang.String target) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "");
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddLongTask(durationNs, target, null, 4, null));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void eventSent(java.lang.String viewId, com.datadog.android.rum.internal.monitor.StorageEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event instanceof com.datadog.android.rum.internal.monitor.StorageEvent.Action) {
            com.datadog.android.rum.internal.monitor.StorageEvent.Action action = (com.datadog.android.rum.internal.monitor.StorageEvent.Action) event;
            handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.ActionSent(viewId, action.getFrustrationCount(), action.getType(), action.getEventEndTimestampInNanos(), null, 16, null));
            return;
        }
        if (event instanceof com.datadog.android.rum.internal.monitor.StorageEvent.Resource) {
            com.datadog.android.rum.internal.monitor.StorageEvent.Resource resource = (com.datadog.android.rum.internal.monitor.StorageEvent.Resource) event;
            handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.ResourceSent(viewId, resource.getResourceId(), resource.getResourceStopTimestampInNanos(), null, 8, null));
        } else if (event instanceof com.datadog.android.rum.internal.monitor.StorageEvent.Error) {
            com.datadog.android.rum.internal.monitor.StorageEvent.Error error = (com.datadog.android.rum.internal.monitor.StorageEvent.Error) event;
            handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.ErrorSent(viewId, error.getResourceId(), error.getResourceStopTimestampInNanos(), null, 8, null));
        } else if (event instanceof com.datadog.android.rum.internal.monitor.StorageEvent.LongTask) {
            handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.LongTaskSent(viewId, false, null, 4, null));
        } else if (event instanceof com.datadog.android.rum.internal.monitor.StorageEvent.FrozenFrame) {
            handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.LongTaskSent(viewId, true, null, 4, null));
        }
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void eventDropped(java.lang.String viewId, com.datadog.android.rum.internal.monitor.StorageEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event instanceof com.datadog.android.rum.internal.monitor.StorageEvent.Action) {
            handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.ActionDropped(viewId, null, 2, null));
            return;
        }
        if (event instanceof com.datadog.android.rum.internal.monitor.StorageEvent.Resource) {
            handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.ResourceDropped(viewId, ((com.datadog.android.rum.internal.monitor.StorageEvent.Resource) event).getResourceId(), null, 4, null));
            return;
        }
        if (event instanceof com.datadog.android.rum.internal.monitor.StorageEvent.Error) {
            handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.ErrorDropped(viewId, ((com.datadog.android.rum.internal.monitor.StorageEvent.Error) event).getResourceId(), null, 4, null));
        } else if (event instanceof com.datadog.android.rum.internal.monitor.StorageEvent.LongTask) {
            handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.LongTaskDropped(viewId, false, null, 4, null));
        } else if (event instanceof com.datadog.android.rum.internal.monitor.StorageEvent.FrozenFrame) {
            handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.LongTaskDropped(viewId, true, null, 4, null));
        }
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void setDebugListener(com.datadog.android.rum.internal.debug.RumDebugListener listener) {
        this.debugListener = listener;
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void addSessionReplaySkippedFrame() {
        getCurrentSessionId(new kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit>() { // from class: com.datadog.android.rum.internal.monitor.DatadogRumMonitor$addSessionReplaySkippedFrame$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.lang.String str) {
                getHighSpeedVideoFpsRangesFor(str);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRangesFor(java.lang.String str) {
                com.datadog.android.rum.internal.metric.SessionMetricDispatcher sessionMetricDispatcher;
                if (str != null) {
                    sessionMetricDispatcher = com.datadog.android.rum.internal.monitor.DatadogRumMonitor.this.getHighSpeedVideoSizesFor;
                    sessionMetricDispatcher.onSessionReplaySkippedFrameTracked(str);
                }
            }

            {
                super(1);
            }
        });
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor
    public final void notifyInterceptorInstantiated() {
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.TelemetryEventWrapper(com.datadog.android.internal.telemetry.InternalTelemetryEvent.InterceptorInstantiated.INSTANCE, null, 2, null));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor
    public final void reportNetworkingLibraryType(com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.NetworkInstrumentation.LibraryType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.TelemetryEventWrapper(new com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.NetworkInstrumentation(type, null, 2, null), null, 2, null));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void updatePerformanceMetric(com.datadog.android.rum.RumPerformanceMetric metric, double value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metric, "");
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.UpdatePerformanceMetric(metric, value, null, 4, null));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void updateExternalRefreshRate(double frameTimeSeconds) {
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.UpdateExternalRefreshRate(frameTimeSeconds, null, 2, null));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void setInternalViewAttribute(java.lang.String key, java.lang.Object value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.SetInternalViewAttribute(key, value, null, 4, null));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void setSyntheticsAttribute(java.lang.String testId, java.lang.String resultId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(testId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultId, "");
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.SetSyntheticsTestAttribute(testId, resultId, null, 4, null));
    }

    @Override // com.datadog.android.rum.RumMonitor
    /* renamed from: _getInternal, reason: from getter */
    public final com.datadog.android.rum._RumInternalProxy getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void sendTelemetryEvent(com.datadog.android.internal.telemetry.InternalTelemetryEvent telemetryEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(telemetryEvent, "");
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.TelemetryEventWrapper(telemetryEvent, null, 2, null));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void enableJankStatsTracking(android.app.Activity activity) {
        com.datadog.android.rum.internal.RumFeature rumFeature;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        com.datadog.android.api.feature.FeatureScope feature = this.getHighSpeedVideoSizes.getFeature("rum");
        if (feature == null || (rumFeature = (com.datadog.android.rum.internal.RumFeature) feature.unwrap()) == null) {
            return;
        }
        rumFeature.enableJankStatsTracking$dd_sdk_android_rum_release(activity);
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void sendTTIDEvent(com.datadog.android.rum.internal.startup.RumTTIDInfo info) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "");
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.AppStartTTIDEvent(null, info, 1, null));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void sendAppStartEvent(com.datadog.android.rum.internal.startup.RumStartupScenario scenario) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scenario, "");
        handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.AppStartEvent(scenario, null, 2, null));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void startFeatureOperation(final java.lang.String name2, final java.lang.String operationKey, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        if (getHighSpeedVideoFpsRangesFor(name2, operationKey)) {
            handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.StartFeatureOperation(name2, operationKey, kotlin.collections.MapsKt.toMap(attributes), getHighResolutionOutputSizeshNQ4ISI(attributes)));
            com.datadog.android.api.InternalLoggerKt.logToUser$default(this.getHighSpeedVideoSizes.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.DEBUG, false, new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.monitor.DatadogRumMonitor$startFeatureOperation$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String str = name2;
                    java.lang.String str2 = operationKey;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Feature Operation `");
                    sb.append(str);
                    sb.append("` (operationKey `");
                    sb.append(str2);
                    sb.append("`) started.");
                    return sb.toString();
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, 2, null);
            com.datadog.android.rum.internal.monitor.DatadogRumMonitor.Companion.access$reportFeatureOperationApiUsage(INSTANCE, this.getHighSpeedVideoSizes.getInternalLogger(), com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.AddOperationStepVital.ActionType.START);
        }
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void succeedFeatureOperation(final java.lang.String name2, final java.lang.String operationKey, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        if (getHighSpeedVideoFpsRangesFor(name2, operationKey)) {
            handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopFeatureOperation(name2, operationKey, kotlin.collections.MapsKt.toMap(attributes), null, getHighResolutionOutputSizeshNQ4ISI(attributes)));
            com.datadog.android.api.InternalLoggerKt.logToUser$default(this.getHighSpeedVideoSizes.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.DEBUG, false, new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.monitor.DatadogRumMonitor$succeedFeatureOperation$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String str = name2;
                    java.lang.String str2 = operationKey;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Feature Operation `");
                    sb.append(str);
                    sb.append("` (operationKey `");
                    sb.append(str2);
                    sb.append("`) successfully ended.");
                    return sb.toString();
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, 2, null);
            com.datadog.android.rum.internal.monitor.DatadogRumMonitor.Companion.access$reportFeatureOperationApiUsage(INSTANCE, this.getHighSpeedVideoSizes.getInternalLogger(), com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.AddOperationStepVital.ActionType.SUCCEED);
        }
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void failFeatureOperation(final java.lang.String name2, final java.lang.String operationKey, final com.datadog.android.rum.featureoperations.FailureReason failureReason, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failureReason, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        if (getHighSpeedVideoFpsRangesFor(name2, operationKey)) {
            handleEvent$dd_sdk_android_rum_release(new com.datadog.android.rum.internal.domain.scope.RumRawEvent.StopFeatureOperation(name2, operationKey, kotlin.collections.MapsKt.toMap(attributes), failureReason, getHighResolutionOutputSizeshNQ4ISI(attributes)));
            com.datadog.android.api.InternalLoggerKt.logToUser$default(this.getHighSpeedVideoSizes.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.DEBUG, false, new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.monitor.DatadogRumMonitor$failFeatureOperation$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String str = name2;
                    java.lang.String str2 = operationKey;
                    com.datadog.android.rum.featureoperations.FailureReason failureReason2 = failureReason;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Feature Operation `");
                    sb.append(str);
                    sb.append("` (operationKey `");
                    sb.append(str2);
                    sb.append("`) unsuccessfully ended with the following failure reason: ");
                    sb.append(failureReason2);
                    sb.append(".");
                    return sb.toString();
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, 2, null);
            com.datadog.android.rum.internal.monitor.DatadogRumMonitor.Companion.access$reportFeatureOperationApiUsage(INSTANCE, this.getHighSpeedVideoSizes.getInternalLogger(), com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.AddOperationStepVital.ActionType.FAIL);
        }
    }

    private final boolean getHighSpeedVideoFpsRangesFor(final java.lang.String p0, final java.lang.String p1) {
        if (kotlin.text.StringsKt.isBlank(p0)) {
            com.datadog.android.api.InternalLoggerKt.logToUser$default(this.getHighSpeedVideoSizes.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.WARN, false, new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.monitor.DatadogRumMonitor$featureOperationArgumentsValid$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.rum.internal.monitor.DatadogRumMonitor.FO_ERROR_INVALID_NAME, java.util.Arrays.copyOf(new java.lang.Object[]{p0}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, 2, null);
            return false;
        }
        if (p1 == null || !kotlin.text.StringsKt.isBlank(p1)) {
            return true;
        }
        com.datadog.android.api.InternalLoggerKt.logToUser$default(this.getHighSpeedVideoSizes.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.WARN, false, new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.monitor.DatadogRumMonitor$featureOperationArgumentsValid$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.rum.internal.monitor.DatadogRumMonitor.FO_ERROR_INVALID_OPERATION_KEY, java.util.Arrays.copyOf(new java.lang.Object[]{p1}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                return format;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, 2, null);
        return false;
    }

    public final void drainExecutorService$dd_sdk_android_rum_release() throws java.lang.UnsupportedOperationException, java.lang.InterruptedException {
        java.util.concurrent.BlockingQueue<java.lang.Runnable> queue;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.concurrent.ExecutorService executorService = this.executorService;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = executorService instanceof java.util.concurrent.ThreadPoolExecutor ? (java.util.concurrent.ThreadPoolExecutor) executorService : null;
        if (threadPoolExecutor != null && (queue = threadPoolExecutor.getQueue()) != null) {
            queue.drainTo(arrayList);
        }
        this.executorService.shutdown();
        this.executorService.awaitTermination(10L, java.util.concurrent.TimeUnit.SECONDS);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
    }

    public final void handleEvent$dd_sdk_android_rum_release(com.datadog.android.rum.internal.domain.scope.RumRawEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if ((event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddError) && ((com.datadog.android.rum.internal.domain.scope.RumRawEvent.AddError) event).isFatal()) {
            synchronized (this.rootScope) {
                com.datadog.android.api.feature.FeatureScope feature = this.getHighSpeedVideoSizes.getFeature("rum");
                kotlin.Pair<com.datadog.android.api.context.DatadogContext, kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>, kotlin.Unit>> writeContextSync = feature != null ? feature.getWriteContextSync(kotlin.collections.SetsKt.setOf("session-replay")) : null;
                if (writeContextSync != null) {
                    this.rootScope.handleEvent(event, writeContextSync.component1(), writeContextSync.component2(), this.getInputFormats);
                    final com.datadog.android.rum.internal.domain.RumContext highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
                    com.datadog.android.api.feature.FeatureSdkCore.DefaultImpls.updateFeatureContext$default(this.getHighSpeedVideoSizes, "rum", false, new kotlin.jvm.functions.Function1<java.util.Map<java.lang.String, java.lang.Object>, kotlin.Unit>() { // from class: com.datadog.android.rum.internal.monitor.DatadogRumMonitor$handleEvent$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ kotlin.Unit invoke(java.util.Map<java.lang.String, java.lang.Object> map) {
                            getHighSpeedVideoFpsRanges(map);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void getHighSpeedVideoFpsRanges(java.util.Map<java.lang.String, java.lang.Object> map) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
                            map.putAll(com.datadog.android.rum.internal.domain.RumContext.this.toMap());
                        }

                        {
                            super(1);
                        }
                    }, 2, null);
                } else {
                    com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoSizes.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.monitor.DatadogRumMonitor$handleEvent$1$2
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                        public final java.lang.String invoke() {
                            return com.datadog.android.rum.internal.monitor.DatadogRumMonitor.CANNOT_WRITE_CRASH_WRITE_CONTEXT_IS_NOT_AVAILABLE;
                        }
                    }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            return;
        }
        if (event instanceof com.datadog.android.rum.internal.domain.scope.RumRawEvent.TelemetryEventWrapper) {
            this.telemetryEventHandler.handleEvent((com.datadog.android.rum.internal.domain.scope.RumRawEvent.TelemetryEventWrapper) event, this.getInputFormats);
            return;
        }
        com.datadog.android.api.feature.FeatureScope feature2 = this.getHighSpeedVideoSizes.getFeature("rum");
        if (feature2 != null) {
            feature2.withWriteContext(kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"session-replay", "profiling", "tracing"}), new com.datadog.android.rum.internal.monitor.DatadogRumMonitor$handleEvent$2(this, event));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.datadog.android.rum.internal.domain.RumContext getHighResolutionOutputSizeshNQ4ISI() {
        com.datadog.android.rum.internal.domain.scope.RumViewScope activeView$dd_sdk_android_rum_release;
        com.datadog.android.rum.internal.domain.RumContext getOutputSizes;
        com.datadog.android.rum.internal.domain.scope.RumSessionScope activeSession = this.rootScope.getActiveSession();
        if (activeSession != null && (activeView$dd_sdk_android_rum_release = activeSession.getActiveView$dd_sdk_android_rum_release()) != null && (getOutputSizes = activeView$dd_sdk_android_rum_release.getGetOutputSizes()) != null) {
            return getOutputSizes;
        }
        if (activeSession != null) {
            return activeSession.getGetOutputSizes();
        }
        return this.rootScope.getGetOutputSizes();
    }

    public final void notifyDebugListenerWithState$dd_sdk_android_rum_release() {
        com.datadog.android.rum.internal.debug.RumDebugListener rumDebugListener = this.debugListener;
        if (rumDebugListener != null) {
            com.datadog.android.rum.internal.domain.scope.RumSessionScope activeSession = this.rootScope.getActiveSession();
            com.datadog.android.rum.internal.domain.scope.RumViewManagerScope childScope = activeSession != null ? activeSession.getChildScope() : null;
            if (childScope != null) {
                java.util.List<com.datadog.android.rum.internal.domain.scope.RumViewScope> childrenScopes$dd_sdk_android_rum_release = childScope.getChildrenScopes$dd_sdk_android_rum_release();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : childrenScopes$dd_sdk_android_rum_release) {
                    if (((com.datadog.android.rum.internal.domain.scope.RumViewScope) obj).getIsActive()) {
                        arrayList.add(obj);
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    java.lang.String viewName = ((com.datadog.android.rum.internal.domain.scope.RumViewScope) it.next()).getGetOutputSizes().getViewName();
                    if (viewName != null) {
                        arrayList2.add(viewName);
                    }
                }
                rumDebugListener.onReceiveRumActiveViews(arrayList2);
            }
        }
    }

    private final com.datadog.android.rum.internal.domain.Time getHighResolutionOutputSizeshNQ4ISI(java.util.Map<java.lang.String, ? extends java.lang.Object> p0) {
        com.datadog.android.rum.internal.domain.Time asTime;
        java.lang.Object obj = p0.get(com.datadog.android.rum.RumAttributes.INTERNAL_TIMESTAMP);
        java.lang.Long l = obj instanceof java.lang.Long ? (java.lang.Long) obj : null;
        return (l == null || (asTime = com.datadog.android.rum.internal.domain.TimeKt.asTime(l.longValue())) == null) ? getHighSpeedVideoSizes() : asTime;
    }

    private final com.datadog.android.rum.internal.domain.Time getHighSpeedVideoSizes() {
        return new com.datadog.android.rum.internal.domain.Time(this.getHighSpeedVideoSizes.getTimeProvider().getDeviceTimestampMillis(), this.getHighSpeedVideoSizes.getTimeProvider().getDeviceElapsedTimeNanos());
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0006"}, d2 = {"Lcom/datadog/android/rum/internal/monitor/DatadogRumMonitor$Companion;", "", "<init>", "()V", "", "CANNOT_WRITE_CRASH_WRITE_CONTEXT_IS_NOT_AVAILABLE", "Ljava/lang/String;", "", "DRAIN_WAIT_SECONDS", "J", "FO_ERROR_INVALID_NAME", "FO_ERROR_INVALID_OPERATION_KEY", "RUM_DEBUG_RUM_NOT_ENABLED_WARNING"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ void access$reportFeatureOperationApiUsage(com.datadog.android.rum.internal.monitor.DatadogRumMonitor.Companion companion, com.datadog.android.api.InternalLogger internalLogger, final com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.AddOperationStepVital.ActionType actionType) {
            com.datadog.android.api.InternalLogger.DefaultImpls.logApiUsage$default(internalLogger, 0.0f, new kotlin.jvm.functions.Function0<com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage>() { // from class: com.datadog.android.rum.internal.monitor.DatadogRumMonitor$Companion$reportFeatureOperationApiUsage$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage invoke() {
                    return new com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.AddOperationStepVital(com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.AddOperationStepVital.ActionType.this, null, 2, null);
                }

                {
                    super(0);
                }
            }, 1, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ void $r8$lambda$4u9YU1PHyuB_xq8RMX9LZWLfoqQ(com.datadog.android.rum.internal.monitor.DatadogRumMonitor datadogRumMonitor, kotlin.jvm.functions.Function1 function1) {
        com.datadog.android.rum.internal.domain.RumContext getOutputSizes;
        com.datadog.android.rum.internal.domain.scope.RumSessionScope activeSession = datadogRumMonitor.rootScope.getActiveSession();
        java.lang.String str = null;
        if (activeSession != null && (getOutputSizes = activeSession.getGetOutputSizes()) != null) {
            java.lang.String sessionId = getOutputSizes.getSessionId();
            if (getOutputSizes.getSessionState() != com.datadog.android.rum.internal.domain.scope.RumSessionScope.State.NOT_TRACKED && !kotlin.jvm.internal.Intrinsics.areEqual(sessionId, com.datadog.android.rum.internal.domain.RumContext.INSTANCE.getNULL_UUID())) {
                str = sessionId;
            }
        }
        function1.invoke(str);
    }

    public static final /* synthetic */ void access$handleEventWithMethodCallPerf(final com.datadog.android.rum.internal.monitor.DatadogRumMonitor datadogRumMonitor, final com.datadog.android.rum.internal.domain.scope.RumRawEvent rumRawEvent, final com.datadog.android.api.context.DatadogContext datadogContext, final kotlin.jvm.functions.Function1 function1) {
        com.datadog.android.api.InternalLogger internalLogger = datadogRumMonitor.getHighSpeedVideoSizes.getInternalLogger();
        java.lang.Class<?> cls = datadogRumMonitor.getClass();
        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(rumRawEvent.getClass()).getSimpleName();
        if (simpleName == null) {
            simpleName = "Unknown";
        }
        com.datadog.android.api.feature.FeatureScopeExtKt.measureMethodCallPerf(internalLogger, cls, "RUM event - ".concat(java.lang.String.valueOf(simpleName)), com.datadog.android.core.metrics.MethodCallSamplingRate.RARE.getRate(), new kotlin.jvm.functions.Function0<com.datadog.android.rum.internal.domain.scope.RumScope>() { // from class: com.datadog.android.rum.internal.monitor.DatadogRumMonitor$handleEventWithMethodCallPerf$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final com.datadog.android.rum.internal.domain.scope.RumScope invoke() {
                com.datadog.android.api.storage.DataWriter<java.lang.Object> dataWriter;
                com.datadog.android.rum.internal.domain.scope.RumApplicationScope rootScope = com.datadog.android.rum.internal.monitor.DatadogRumMonitor.this.getRootScope();
                com.datadog.android.rum.internal.domain.scope.RumRawEvent rumRawEvent2 = rumRawEvent;
                com.datadog.android.api.context.DatadogContext datadogContext2 = datadogContext;
                kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>, kotlin.Unit> function12 = function1;
                dataWriter = com.datadog.android.rum.internal.monitor.DatadogRumMonitor.this.getInputFormats;
                return rootScope.handleEvent(rumRawEvent2, datadogContext2, function12, dataWriter);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }
        });
    }
}
