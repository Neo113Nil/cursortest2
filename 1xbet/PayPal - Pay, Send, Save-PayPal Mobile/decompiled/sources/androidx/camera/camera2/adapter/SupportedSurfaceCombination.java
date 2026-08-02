package androidx.camera.camera2.adapter;

@kotlin.Metadata(d1 = {"\u0000\u009c\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\b\u001a\n\u0002\u0010\u0011\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 Ñ\u00012\u00020\u0001:\bÎ\u0001Ï\u0001Ð\u0001Ñ\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJV\u0010;\u001a\u00020\u001f2\u0006\u0010<\u001a\u00020\u001a2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\u001b2\u0014\b\u0002\u0010?\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020A0@2\u0012\b\u0002\u0010B\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030C0\u001b2\u000e\b\u0002\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001bJR\u0010E\u001a\u00020F2\u0006\u0010<\u001a\u00020\u001a2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\u001b2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020A0@2\u0010\u0010B\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030C0\u001b2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001bH\u0002JV\u0010H\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010\u001b2\u0006\u0010<\u001a\u00020\u001a2\u0010\u0010=\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010>\u0018\u00010\u001b2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020J0\u00192\u0016\u0010K\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u00030C0\u0019H\u0002J\u0016\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00120\u001b2\u0006\u0010<\u001a\u00020\u001aH\u0002J&\u0010M\u001a\u00020>2\u0006\u0010N\u001a\u00020\u000f2\u0006\u0010O\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020SJ^\u0010T\u001a\u00020U2\u0006\u0010N\u001a\u00020\u000f2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020J0\u001b2\u001c\u0010W\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030C\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\u001b0@2\b\b\u0002\u0010X\u001a\u00020Y2\b\b\u0002\u0010Z\u001a\u00020\u001f2\u0006\u0010[\u001a\u00020\u001f2\u0006\u0010\\\u001a\u00020\u001fJ\u0084\u0001\u0010]\u001a\u00020U2\u0006\u0010^\u001a\u00020_2\u0006\u0010<\u001a\u00020\u001a2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020J0\u001b2\u001c\u0010`\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030C\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\u001b0@2\u0010\u0010B\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030C0\u001b2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b2\u0016\u0010a\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030C\u0012\u0004\u0012\u00020A0@2\u0006\u0010\\\u001a\u00020\u001fH\u0002J|\u0010b\u001a\u00020U2\u0006\u0010<\u001a\u00020\u001a2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020J0\u001b2\u001c\u0010`\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030C\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\u001b0@2\u0010\u0010B\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030C0\u001b2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b2\u0016\u0010a\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030C\u0012\u0004\u0012\u00020A0@2\u0006\u0010\\\u001a\u00020\u001fH\u0002J>\u0010c\u001a\u00020_2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020A0e2\u000e\u0010f\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010g2\u0006\u0010X\u001a\u00020Y2\u0006\u0010h\u001a\u00020\u001f2\u0006\u0010[\u001a\u00020\u001fH\u0002Jn\u0010i\u001a\u00020\u001a2\u0006\u0010N\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020\u001f2\u0016\u0010a\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030C\u0012\u0004\u0012\u00020A0@2\u0006\u0010X\u001a\u00020Y2\u0006\u0010h\u001a\u00020\u001f2\u0006\u0010j\u001a\u00020\u001f2\u0006\u0010[\u001a\u00020\u001f2\u0006\u0010k\u001a\u00020\u001f2\f\u0010l\u001a\b\u0012\u0004\u0012\u00020\u000f0g2\u0006\u0010m\u001a\u00020\u001fH\u0002J\f\u0010n\u001a\u00020\u001a*\u00020\u001aH\u0002J<\u0010o\u001a\u00020\u001f2\u0006\u0010<\u001a\u00020\u001a2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020J0\u001b2\u001c\u0010W\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030C\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\u001b0@H\u0002J\u0086\u0001\u0010p\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010\u001b2\u0012\u0010q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\u001b0\u001b2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020J0\u001b2\u0010\u0010B\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030C0\u001b2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b2\u0006\u0010<\u001a\u00020\u001a2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020J0\u00192\u0016\u0010K\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u00030C0\u0019H\u0002J\u0086\u0001\u0010r\u001a\u00020s2\u0006\u0010t\u001a\u00020u2\u000e\u0010v\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010\u001b2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020J0\u001b2\u0012\u0010w\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020x0\u00192\u0016\u0010y\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030C\u0012\u0004\u0012\u00020x0\u00192\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020J0\u00192\u0016\u0010K\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u00030C0\u0019H\u0002JR\u0010z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\u001b0\u001b2\u001c\u0010W\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030C\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\u001b0@2\u0010\u0010B\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030C0\u001b2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001bH\u0002JD\u0010{\u001a\b\u0012\u0004\u0012\u00020\u000f0g2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020J0\u001b2\u0010\u0010B\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030C0\u001b2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b2\u0006\u0010m\u001a\u00020\u001fH\u0002J(\u0010m\u001a\u00020\u001f2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020J0\u001b2\u0010\u0010B\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030C0\u001bH\u0002J\u001e\u0010|\u001a\u00020\u000f2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020J0\u001b2\u0006\u0010j\u001a\u00020\u001fH\u0002JS\u0010}\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030C\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\u001b0@2\u001c\u0010W\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030C\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\u001b0@2\u0006\u0010<\u001a\u00020\u001a2\b\b\u0002\u0010~\u001a\u00020\u001fH\u0001¢\u0006\u0002\b\u007fJf\u0010\u0080\u0001\u001a\u00020s2\u0006\u0010<\u001a\u00020\u001a2\u0006\u0010P\u001a\u00020Q2\u0006\u0010O\u001a\u00020\u000f2\u0007\u0010\u0081\u0001\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020S2\u0006\u0010~\u001a\u00020\u001f2\u001b\u0010\u0082\u0001\u001a\u0016\u0012\u0005\u0012\u00030\u0083\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u000f0\u0084\u00010\u00192\r\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020Q0\u0011H\u0002J\u008f\u0001\u0010\u0086\u0001\u001a\u0004\u0018\u00010u2\u0012\u0010q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\u001b0\u001b2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020J0\u001b2\u0010\u0010B\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030C0\u001b2\u0007\u0010\u0087\u0001\u001a\u00020\u000f2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b2\u0006\u0010<\u001a\u00020\u001a2\u000e\u0010v\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010\u001b2\u0016\u0010a\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030C\u0012\u0004\u0012\u00020A0@2\u0007\u0010\u0088\u0001\u001a\u00020\u001fH\u0002J)\u0010\u0089\u0001\u001a\u00020\u001f2\u0007\u0010\u0087\u0001\u001a\u00020\u000f2\f\u0010l\u001a\b\u0012\u0004\u0012\u00020\u000f0g2\u0007\u0010\u008a\u0001\u001a\u00020\u000fH\u0002Ja\u0010\u008b\u0001\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030C\u0012\u0004\u0012\u00020x0\u00192\u0006\u0010t\u001a\u00020u2\u0010\u0010B\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030C0\u001b2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b2\u0016\u0010a\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030C\u0012\u0004\u0012\u00020A0@2\u0006\u0010<\u001a\u00020\u001aH\u0002J!\u0010\u008c\u0001\u001a\u00020\u000f2\u0016\u0010a\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030C\u0012\u0004\u0012\u00020A0@H\u0002J\u008d\u0001\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020>0\u001b2\u0006\u0010N\u001a\u00020\u000f2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020J0\u001b2\r\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u00020Q0\u001b2\u0010\u0010B\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030C0\u001b2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b2\u0014\u0010I\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020J\u0018\u00010\u00192\u0018\u0010K\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u00030C\u0018\u00010\u00192\u0007\u0010\u008f\u0001\u001a\u00020\u001fH\u0002JI\u0010\u0090\u0001\u001a\u00020\u000f2\r\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u00020Q0\u001b2\u0010\u0010B\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030C0\u001b2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b2\u0007\u0010\u008a\u0001\u001a\u00020\u000f2\u0006\u0010j\u001a\u00020\u001fH\u0002J*\u0010\u0091\u0001\u001a\u00020\u000f2\u0006\u0010O\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020Q2\u0006\u0010j\u001a\u00020\u001f2\u0007\u0010\u0081\u0001\u001a\u00020\u000fH\u0002J\u0019\u0010\u0091\u0001\u001a\u00020\u000f2\u0006\u0010O\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020QH\u0002J\u0018\u0010\u0092\u0001\u001a\u00020\u000f2\r\u0010\u0093\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0gH\u0002J'\u0010\u0094\u0001\u001a\u00020\u000f2\r\u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0g2\r\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0gH\u0002J<\u0010\u0097\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0g2\r\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0g2\r\u0010\u0099\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0g2\r\u0010\u009a\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0gH\u0002JG\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0g2\r\u0010\u009c\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0g2\u0007\u0010\u009d\u0001\u001a\u00020\u000f2\u0018\u0010\u009e\u0001\u001a\u0013\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u000f0g\u0018\u00010\u009f\u0001H\u0002¢\u0006\u0003\u0010 \u0001J5\u0010¡\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0g2\r\u0010¢\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0g2\r\u0010£\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0g2\u0006\u0010m\u001a\u00020\u001fH\u0002J#\u0010¤\u0001\u001a\u00020\u001f2\u0007\u0010¥\u0001\u001a\u00020\u001f2\t\u0010¦\u0001\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0003\u0010§\u0001J3\u0010¨\u0001\u001a\u00020\u000f2\u0007\u0010©\u0001\u001a\u00020\u000f2\u0006\u0010O\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020Q2\u0006\u0010j\u001a\u00020\u001f2\u0007\u0010\u0081\u0001\u001a\u00020\u000fH\u0002J&\u0010ª\u0001\u001a\b\u0012\u0004\u0012\u00020Q0\u001b2\r\u0010«\u0001\u001a\b\u0012\u0004\u0012\u00020Q0\u001b2\u0006\u0010O\u001a\u00020\u000fH\u0007J\t\u0010¬\u0001\u001a\u00020sH\u0002J\t\u0010\u00ad\u0001\u001a\u00020sH\u0002J\t\u0010®\u0001\u001a\u00020sH\u0002J\t\u0010¯\u0001\u001a\u00020sH\u0002J\t\u0010°\u0001\u001a\u00020sH\u0002J\t\u0010±\u0001\u001a\u00020sH\u0002J\t\u0010²\u0001\u001a\u00020sH\u0002J\t\u0010³\u0001\u001a\u00020sH\u0002J\t\u0010´\u0001\u001a\u00020sH\u0002J\t\u0010µ\u0001\u001a\u00020sH\u0002J\t\u0010¶\u0001\u001a\u00020sH\u0002J\u0012\u0010·\u0001\u001a\u00020'2\u0007\u0010¸\u0001\u001a\u00020\u000fH\u0007J0\u0010¹\u0001\u001a\u00020s2\u0013\u0010º\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020Q0\u00192\u0007\u0010»\u0001\u001a\u00020Q2\u0007\u0010¸\u0001\u001a\u00020\u000fH\u0002J5\u0010¼\u0001\u001a\u00020s2\u0013\u0010º\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020Q0\u00192\u0007\u0010¸\u0001\u001a\u00020\u000f2\f\b\u0002\u0010½\u0001\u001a\u0005\u0018\u00010¾\u0001H\u0002J'\u0010¿\u0001\u001a\u00020s2\u0013\u0010º\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020Q0\u00192\u0007\u0010¸\u0001\u001a\u00020\u000fH\u0002J\t\u0010À\u0001\u001a\u00020QH\u0002J\t\u0010Á\u0001\u001a\u00020.H\u0002J\u000b\u0010Â\u0001\u001a\u0004\u0018\u00010QH\u0002J\u000b\u0010Ã\u0001\u001a\u0004\u0018\u00010QH\u0002J!\u0010Ä\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b2\u0010\u0010B\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030C0\u001bH\u0002J<\u0010Å\u0001\u001a\u0004\u0018\u00010Q2\n\u0010Æ\u0001\u001a\u0005\u0018\u00010Ç\u00012\u0006\u0010O\u001a\u00020\u000f2\u0007\u0010È\u0001\u001a\u00020\u001f2\f\b\u0002\u0010½\u0001\u001a\u0005\u0018\u00010¾\u0001H\u0000¢\u0006\u0003\bÉ\u0001J:\u0010Ê\u0001\u001a\u000b\u0012\u0004\u0012\u00020Q\u0018\u00010\u009f\u00012\n\u0010Æ\u0001\u001a\u0005\u0018\u00010Ç\u00012\u0006\u0010O\u001a\u00020\u000f2\f\b\u0002\u0010½\u0001\u001a\u0005\u0018\u00010¾\u0001H\u0002¢\u0006\u0003\u0010Ë\u0001J*\u0010Ì\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\u00110\u001b2\u0013\u0010Í\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\u001b0\u001bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u001b0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u00020'X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000208X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020:X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006Ò\u0001²\u0006\u000b\u0010Ó\u0001\u001a\u00020\u001fX\u008a\u0084\u0002"}, d2 = {"Landroidx/camera/camera2/adapter/SupportedSurfaceCombination;", "", "context", "Landroid/content/Context;", "cameraMetadata", "Landroidx/camera/camera2/pipe/CameraMetadata;", "encoderProfilesProvider", "Landroidx/camera/core/impl/EncoderProfilesProvider;", "featureCombinationQuery", "Landroidx/camera/core/featuregroup/impl/FeatureCombinationQuery;", "<init>", "(Landroid/content/Context;Landroidx/camera/camera2/pipe/CameraMetadata;Landroidx/camera/core/impl/EncoderProfilesProvider;Landroidx/camera/core/featuregroup/impl/FeatureCombinationQuery;)V", "cameraId", "", "hardwareLevel", "", "concurrentSurfaceCombinations", "", "Landroidx/camera/core/impl/SurfaceCombination;", "surfaceCombinations", "surfaceCombinationsStreamUseCase", "ultraHighSurfaceCombinations", "previewStabilizationSurfaceCombinations", "highSpeedSurfaceCombinations", "featureSettingsToSupportedCombinationsMap", "", "Landroidx/camera/camera2/adapter/SupportedSurfaceCombination$FeatureSettings;", "", "surfaceCombinations10Bit", "surfaceCombinationsUltraHdr", "isRawSupported", "", "isBurstCaptureSupported", "isConcurrentCameraModeSupported", "isStreamUseCaseSupported", "isUltraHighResolutionSensorSupported", "isPreviewStabilizationSupported", "isManualSensorSupported", "surfaceSizeDefinition", "Landroidx/camera/core/impl/SurfaceSizeDefinition;", "getSurfaceSizeDefinition$camera_camera2", "()Landroidx/camera/core/impl/SurfaceSizeDefinition;", "setSurfaceSizeDefinition$camera_camera2", "(Landroidx/camera/core/impl/SurfaceSizeDefinition;)V", "surfaceSizeDefinitionFormats", "streamConfigurationMapCompat", "Landroidx/camera/camera2/compat/StreamConfigurationMapCompat;", "extraSupportedSurfaceCombinationsContainer", "Landroidx/camera/camera2/compat/workaround/ExtraSupportedSurfaceCombinationsContainer;", "displayInfoManager", "Landroidx/camera/camera2/impl/DisplayInfoManager;", "resolutionCorrector", "Landroidx/camera/camera2/compat/workaround/ResolutionCorrector;", "targetAspectRatio", "Landroidx/camera/camera2/compat/workaround/TargetAspectRatio;", "dynamicRangeResolver", "Landroidx/camera/camera2/internal/DynamicRangeResolver;", "highSpeedResolver", "Landroidx/camera/camera2/internal/HighSpeedResolver;", "checkSupported", "featureSettings", "surfaceConfigList", "Landroidx/camera/core/impl/SurfaceConfig;", "dynamicRangesBySurfaceConfig", "", "Landroidx/camera/core/DynamicRange;", "newUseCaseConfigs", "Landroidx/camera/core/impl/UseCaseConfig;", "useCasesPriorityOrder", "createFeatureComboSessionConfig", "Landroidx/camera/core/impl/SessionConfig;", "useCasePriorityOrder", "getOrderedSupportedStreamUseCaseSurfaceConfigList", "surfaceConfigIndexAttachedSurfaceInfoMap", "Landroidx/camera/core/impl/AttachedSurfaceInfo;", "surfaceConfigIndexUseCaseConfigMap", "getSurfaceCombinationsByFeatureSettings", "transformSurfaceConfig", "cameraMode", "imageFormat", io.ktor.http.ContentDisposition.Parameters.Size, "Landroid/util/Size;", "streamUseCase", "Landroidx/camera/core/impl/StreamUseCase;", "getSuggestedStreamSpecifications", "Landroidx/camera/core/impl/SurfaceStreamSpecQueryResult;", "attachedSurfaces", "newUseCaseConfigsSupportedSizeMap", "videoStabilization", "Landroidx/camera/core/impl/stabilization/VideoStabilization;", "hasVideoCapture", "isFeatureComboInvocation", "findMaxSupportedFrameRate", "resolveSpecsByCheckingMethod", "checkingMethod", "Landroidx/camera/camera2/adapter/SupportedSurfaceCombination$CheckingMethod;", "filteredNewUseCaseConfigsSupportedSizeMap", "resolvedDynamicRanges", "resolveSpecsBySettings", "getCheckingMethod", "dynamicRanges", "", "fps", "Landroid/util/Range;", "isUltraHdrOn", "createFeatureSettings", "isHighSpeedOn", "requiresFeatureComboQuery", "targetFpsRange", "isStrictFpsRequired", "validateSelf", "isUseCasesCombinationSupported", "getOrderedSurfaceConfigListForStreamUseCase", "allPossibleSizeArrangements", "populateStreamUseCaseIfSameSavedSizes", "", "bestSizesAndMaxFps", "Landroidx/camera/camera2/adapter/SupportedSurfaceCombination$BestSizesAndMaxFpsForConfigs;", "orderedSurfaceConfigListForStreamUseCase", "attachedSurfaceStreamSpecMap", "Landroidx/camera/core/impl/StreamSpec;", "suggestedStreamSpecMap", "getSupportedOutputSizesList", "getTargetFpsRange", "getMaxSupportedFpsFromAttachedSurfaces", "filterSupportedSizes", "forceUniqueMaxFpsFiltering", "filterSupportedSizes$camera_camera2", "populateReducedSizeListAndUniqueMaxFpsMap", "customMaxFps", "configSizeUniqueMaxFpsMap", "Landroidx/camera/core/impl/SurfaceConfig$ConfigSize;", "", "reducedSizeList", "findBestSizesAndFps", "existingSurfaceFrameRateCeiling", "findMaxFpsForAllSizes", "isConfigFrameRateAcceptable", "currentConfigFrameRateCeiling", "generateSuggestedStreamSpecMap", "getRequiredMaxBitDepth", "getSurfaceConfigList", "possibleSizeList", "checkViaFeatureComboQuery", "getCurrentConfigFrameRateCeiling", "getMaxFrameRate", "getRangeLength", "range", "getRangeDistance", "firstRange", "secondRange", "compareIntersectingRanges", "targetFps", "storedRange", "newRange", "getClosestSupportedDeviceFrameRate", "targetFrameRate", "maxFps", "availableFpsRanges", "", "(Landroid/util/Range;I[Landroid/util/Range;)Landroid/util/Range;", "getUpdatedTargetFrameRate", "newTargetFrameRate", "storedTargetFrameRate", "getAndValidateIsStrictFpsRequired", "newIsStrictFpsRequired", "storedIsStrictFpsRequired", "(ZLjava/lang/Boolean;)Z", "getCombinedMaximumFps", "combinedMaxFps", "applyResolutionSelectionOrderRelatedWorkarounds", "sizeList", "refreshPreviewSize", "checkCapabilities", "generateSupportedCombinationList", "generateUltraHighResolutionSupportedCombinationList", "generateConcurrentSupportedCombinationList", "generatePreviewStabilizationSupportedCombinationList", "generateHighSpeedSupportedCombinationList", "generate10BitSupportedCombinationList", "generateUltraHdrSupportedCombinationList", "generateStreamUseCaseSupportedCombinationList", "generateSurfaceSizeDefinition", "getUpdatedSurfaceSizeDefinitionByFormat", "format", "updateS720pOrS1440pSizeByFormat", "sizeMap", "targetSize", "updateMaximumSizeByFormat", "aspectRatio", "Landroid/util/Rational;", "updateUltraMaximumSizeByFormat", "getRecordSize", "getStreamConfigurationMapCompat", "getRecordSizeFromStreamConfigurationMapCompat", "getRecordSizeFromCamcorderProfile", "getUseCasesPriorityOrder", "getMaxOutputSizeByFormat", "map", "Landroid/hardware/camera2/params/StreamConfigurationMap;", "highResolutionIncluded", "getMaxOutputSizeByFormat$camera_camera2", "getOutputSizes", "(Landroid/hardware/camera2/params/StreamConfigurationMap;ILandroid/util/Rational;)[Landroid/util/Size;", "getAllPossibleSizeArrangements", "supportedOutputSizesList", "FeatureSettings", "BestSizesAndMaxFpsForConfigs", "CheckingMethod", "Companion", "camera-camera2", "isSupported"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SupportedSurfaceCombination {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.adapter.SupportedSurfaceCombination.Companion INSTANCE = new androidx.camera.camera2.adapter.SupportedSurfaceCombination.Companion(null);
    private final java.util.List<androidx.camera.core.impl.SurfaceCombination> ArtificialStackFrames;
    private final java.util.List<androidx.camera.core.impl.SurfaceCombination> Camera2StreamConfigurationMap;
    private final androidx.camera.camera2.compat.workaround.ResolutionCorrector CoroutineDebuggingKt;
    private final java.util.List<androidx.camera.core.impl.SurfaceCombination> _CREATION;

    /* renamed from: a, reason: collision with root package name */
    private final java.util.List<androidx.camera.core.impl.SurfaceCombination> f2670a;
    private final java.util.List<androidx.camera.core.impl.SurfaceCombination> accessartificialFrame;
    private final java.util.List<java.lang.Integer> b;
    private final java.util.List<androidx.camera.core.impl.SurfaceCombination> coroutineBoundary;
    private final androidx.camera.camera2.compat.StreamConfigurationMapCompat coroutineCreation;
    private final androidx.camera.camera2.compat.workaround.TargetAspectRatio getARTIFICIAL_FRAME_PACKAGE_NAME;
    private final androidx.camera.camera2.internal.DynamicRangeResolver getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final androidx.camera.camera2.impl.DisplayInfoManager getHighSpeedVideoFpsRangesFor;
    private final androidx.camera.camera2.pipe.CameraMetadata getHighSpeedVideoSizes;
    private final int getHighSpeedVideoSizesFor;
    private final androidx.camera.core.impl.EncoderProfilesProvider getInputFormats;
    private final androidx.camera.camera2.compat.workaround.ExtraSupportedSurfaceCombinationsContainer getInputSizeshNQ4ISI;
    private final androidx.camera.core.featuregroup.impl.FeatureCombinationQuery getOutputFormats;
    private final java.util.Map<androidx.camera.camera2.adapter.SupportedSurfaceCombination.FeatureSettings, java.util.List<androidx.camera.core.impl.SurfaceCombination>> getOutputMinFrameDuration;
    private boolean getOutputMinFrameDurationlomOqCM;
    private final boolean getOutputSizes;
    private final java.util.List<androidx.camera.core.impl.SurfaceCombination> getOutputSizeshNQ4ISI;
    private boolean getOutputStallDuration;
    private final androidx.camera.camera2.internal.HighSpeedResolver getOutputStallDurationlomOqCM;
    private final java.util.List<androidx.camera.core.impl.SurfaceCombination> getValidOutputFormatsForInputhNQ4ISI;
    private boolean isOutputSupportedFor;
    private boolean isOutputSupportedForhNQ4ISI;
    public androidx.camera.core.impl.SurfaceSizeDefinition surfaceSizeDefinition;
    private boolean toString;
    private final boolean unwrapAs;

    public SupportedSurfaceCombination(android.content.Context context, androidx.camera.camera2.pipe.CameraMetadata cameraMetadata, androidx.camera.core.impl.EncoderProfilesProvider encoderProfilesProvider, androidx.camera.core.featuregroup.impl.FeatureCombinationQuery featureCombinationQuery) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadata, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoderProfilesProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureCombinationQuery, "");
        this.getHighSpeedVideoSizes = cameraMetadata;
        this.getInputFormats = encoderProfilesProvider;
        this.getOutputFormats = featureCombinationQuery;
        java.lang.String camera = cameraMetadata.getCamera();
        this.getHighSpeedVideoFpsRanges = camera;
        android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        java.lang.Integer num = (java.lang.Integer) cameraMetadata.get(key);
        int intValue = num != null ? num.intValue() : 2;
        this.getHighSpeedVideoSizesFor = intValue;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.Camera2StreamConfigurationMap = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.coroutineBoundary = arrayList2;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        this.ArtificialStackFrames = arrayList3;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        this._CREATION = arrayList4;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        this.getValidOutputFormatsForInputhNQ4ISI = arrayList5;
        this.getOutputSizeshNQ4ISI = new java.util.ArrayList();
        this.getOutputMinFrameDuration = new java.util.LinkedHashMap();
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        this.accessartificialFrame = arrayList6;
        this.f2670a = new java.util.ArrayList();
        this.isOutputSupportedForhNQ4ISI = androidx.camera.camera2.pipe.CameraMetadata.INSTANCE.getSupportsPreviewStabilization(cameraMetadata);
        this.b = new java.util.ArrayList();
        this.coroutineCreation = getHighSpeedVideoSizes();
        androidx.camera.camera2.compat.workaround.ExtraSupportedSurfaceCombinationsContainer extraSupportedSurfaceCombinationsContainer = new androidx.camera.camera2.compat.workaround.ExtraSupportedSurfaceCombinationsContainer();
        this.getInputSizeshNQ4ISI = extraSupportedSurfaceCombinationsContainer;
        this.getHighSpeedVideoFpsRangesFor = androidx.camera.camera2.impl.DisplayInfoManager.INSTANCE.getInstance(context);
        this.CoroutineDebuggingKt = new androidx.camera.camera2.compat.workaround.ResolutionCorrector();
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = new androidx.camera.camera2.compat.workaround.TargetAspectRatio();
        androidx.camera.camera2.internal.DynamicRangeResolver dynamicRangeResolver = new androidx.camera.camera2.internal.DynamicRangeResolver(cameraMetadata);
        this.getHighResolutionOutputSizeshNQ4ISI = dynamicRangeResolver;
        this.getOutputStallDurationlomOqCM = new androidx.camera.camera2.internal.HighSpeedResolver(cameraMetadata);
        android.hardware.camera2.CameraCharacteristics.Key key2 = android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key2, "");
        int[] iArr = (int[]) cameraMetadata.get(key2);
        if (iArr != null) {
            this.isOutputSupportedFor = kotlin.collections.ArraysKt.contains(iArr, 3);
            this.getOutputMinFrameDurationlomOqCM = kotlin.collections.ArraysKt.contains(iArr, 6);
            this.toString = kotlin.collections.ArraysKt.contains(iArr, 16);
            this.getOutputStallDuration = kotlin.collections.ArraysKt.contains(iArr, 1);
        }
        arrayList2.addAll(androidx.camera.camera2.adapter.GuaranteedConfigurationsUtil.generateSupportedCombinationList(intValue, this.isOutputSupportedFor, this.getOutputMinFrameDurationlomOqCM));
        arrayList2.addAll(extraSupportedSurfaceCombinationsContainer.get(camera));
        if (this.toString) {
            arrayList4.addAll(androidx.camera.camera2.adapter.GuaranteedConfigurationsUtil.getUltraHighResolutionSupportedCombinationList());
        }
        boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
        this.getOutputSizes = hasSystemFeature;
        if (hasSystemFeature) {
            arrayList.addAll(androidx.camera.camera2.adapter.GuaranteedConfigurationsUtil.getConcurrentSupportedCombinationList());
        }
        if (dynamicRangeResolver.getGetHighSpeedVideoFpsRanges()) {
            arrayList6.addAll(androidx.camera.camera2.adapter.GuaranteedConfigurationsUtil.get10BitSupportedCombinationList());
        }
        if (this.isOutputSupportedForhNQ4ISI) {
            arrayList5.addAll(androidx.camera.camera2.adapter.GuaranteedConfigurationsUtil.getPreviewStabilizationSupportedCombinationList());
        }
        boolean isStreamUseCaseSupported = androidx.camera.camera2.internal.StreamUseCaseUtil.INSTANCE.isStreamUseCaseSupported(cameraMetadata);
        this.unwrapAs = isStreamUseCaseSupported;
        if (isStreamUseCaseSupported && android.os.Build.VERSION.SDK_INT >= 33) {
            arrayList3.addAll(androidx.camera.camera2.adapter.GuaranteedConfigurationsUtil.INSTANCE.getStreamUseCaseSupportedCombinationList());
        }
        Camera2StreamConfigurationMap();
    }

    public final androidx.camera.core.impl.SurfaceSizeDefinition getSurfaceSizeDefinition$camera_camera2() {
        androidx.camera.core.impl.SurfaceSizeDefinition surfaceSizeDefinition = this.surfaceSizeDefinition;
        if (surfaceSizeDefinition != null) {
            return surfaceSizeDefinition;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setSurfaceSizeDefinition$camera_camera2(androidx.camera.core.impl.SurfaceSizeDefinition surfaceSizeDefinition) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surfaceSizeDefinition, "");
        this.surfaceSizeDefinition = surfaceSizeDefinition;
    }

    public static /* synthetic */ boolean checkSupported$default(androidx.camera.camera2.adapter.SupportedSurfaceCombination supportedSurfaceCombination, androidx.camera.camera2.adapter.SupportedSurfaceCombination.FeatureSettings featureSettings, java.util.List list, java.util.Map map, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        java.util.Map map2 = map;
        if ((i & 8) != 0) {
            list2 = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List list4 = list2;
        if ((i & 16) != 0) {
            list3 = kotlin.collections.CollectionsKt.emptyList();
        }
        return supportedSurfaceCombination.checkSupported(featureSettings, list, map2, list4, list3);
    }

    private final java.util.List<androidx.camera.core.impl.SurfaceConfig> getHighSpeedVideoFpsRanges(androidx.camera.camera2.adapter.SupportedSurfaceCombination.FeatureSettings featureSettings, java.util.List<androidx.camera.core.impl.SurfaceConfig> list, java.util.Map<java.lang.Integer, androidx.camera.core.impl.AttachedSurfaceInfo> map, java.util.Map<java.lang.Integer, androidx.camera.core.impl.UseCaseConfig<?>> map2) {
        if (!androidx.camera.camera2.internal.StreamUseCaseUtil.INSTANCE.shouldUseStreamUseCase(featureSettings)) {
            return null;
        }
        for (androidx.camera.core.impl.SurfaceCombination surfaceCombination : this.ArtificialStackFrames) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(list);
            final java.util.List<androidx.camera.core.impl.SurfaceConfig> orderedSupportedSurfaceConfigList = surfaceCombination.getOrderedSupportedSurfaceConfigList(list);
            if (orderedSupportedSurfaceConfigList != null) {
                boolean areCaptureTypesEligible = androidx.camera.camera2.internal.StreamUseCaseUtil.INSTANCE.areCaptureTypesEligible(map, map2, orderedSupportedSurfaceConfigList);
                kotlin.Lazy lazy = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.camera2.adapter.SupportedSurfaceCombination$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        boolean areStreamUseCasesAvailableForSurfaceConfigs;
                        areStreamUseCasesAvailableForSurfaceConfigs = androidx.camera.camera2.internal.StreamUseCaseUtil.INSTANCE.areStreamUseCasesAvailableForSurfaceConfigs(androidx.camera.camera2.adapter.SupportedSurfaceCombination.this.getHighSpeedVideoSizes, orderedSupportedSurfaceConfigList);
                        return java.lang.Boolean.valueOf(areStreamUseCasesAvailableForSurfaceConfigs);
                    }
                });
                if (areCaptureTypesEligible && ((java.lang.Boolean) lazy.getValue()).booleanValue()) {
                    return orderedSupportedSurfaceConfigList;
                }
            }
        }
        return null;
    }

    public final androidx.camera.core.impl.SurfaceConfig transformSurfaceConfig(int cameraMode, int imageFormat, android.util.Size size, androidx.camera.core.impl.StreamUseCase streamUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamUseCase, "");
        return androidx.camera.core.impl.SurfaceConfig.INSTANCE.transformSurfaceConfig(imageFormat, size, getUpdatedSurfaceSizeDefinitionByFormat(imageFormat), cameraMode, androidx.camera.core.impl.SurfaceConfig.ConfigSource.CAPTURE_SESSION_TABLES, streamUseCase);
    }

    private final androidx.camera.core.impl.SurfaceStreamSpecQueryResult getHighResolutionOutputSizeshNQ4ISI(androidx.camera.camera2.adapter.SupportedSurfaceCombination.CheckingMethod checkingMethod, androidx.camera.camera2.adapter.SupportedSurfaceCombination.FeatureSettings featureSettings, java.util.List<? extends androidx.camera.core.impl.AttachedSurfaceInfo> list, java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, ? extends java.util.List<android.util.Size>> map, java.util.List<? extends androidx.camera.core.impl.UseCaseConfig<?>> list2, java.util.List<java.lang.Integer> list3, java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, androidx.camera.core.DynamicRange> map2, boolean z) {
        android.util.Range<java.lang.Integer> targetFpsRange;
        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
        }
        int i = androidx.camera.camera2.adapter.SupportedSurfaceCombination.WhenMappings.$EnumSwitchMapping$0[checkingMethod.ordinal()];
        if (i == 1) {
            return Camera2StreamConfigurationMap(Camera2StreamConfigurationMap(androidx.camera.camera2.adapter.SupportedSurfaceCombination.FeatureSettings.copy$default(featureSettings, 0, 0, false, null, false, false, false, false, null, false, 895, null)), list, map, list2, list3, map2, z);
        }
        if (i == 2) {
            if (featureSettings.isFeatureComboInvocation() && featureSettings.getTargetFpsRange() == androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED) {
                if (featureSettings.getRequiresFeatureComboQuery()) {
                    targetFpsRange = androidx.camera.core.featuregroup.impl.feature.FpsRangeFeature.DEFAULT_FPS_RANGE;
                } else {
                    targetFpsRange = featureSettings.getTargetFpsRange();
                }
            } else {
                targetFpsRange = featureSettings.getTargetFpsRange();
            }
            return Camera2StreamConfigurationMap(Camera2StreamConfigurationMap(androidx.camera.camera2.adapter.SupportedSurfaceCombination.FeatureSettings.copy$default(featureSettings, 0, 0, false, null, false, false, false, true, targetFpsRange, false, 639, null)), list, map, list2, list3, map2, z);
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        try {
            return Camera2StreamConfigurationMap(Camera2StreamConfigurationMap(androidx.camera.camera2.adapter.SupportedSurfaceCombination.FeatureSettings.copy$default(featureSettings, 0, 0, false, null, false, false, false, false, null, false, 895, null)), list, map, list2, list3, map2, z);
        } catch (java.lang.IllegalArgumentException e) {
            androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            }
            return Camera2StreamConfigurationMap(Camera2StreamConfigurationMap(androidx.camera.camera2.adapter.SupportedSurfaceCombination.FeatureSettings.copy$default(featureSettings, 0, 0, false, null, false, false, false, true, null, false, 895, null)), list, map, list2, list3, map2, z);
        }
    }

    private final androidx.camera.core.impl.SurfaceStreamSpecQueryResult Camera2StreamConfigurationMap(androidx.camera.camera2.adapter.SupportedSurfaceCombination.FeatureSettings featureSettings, java.util.List<? extends androidx.camera.core.impl.AttachedSurfaceInfo> list, java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, ? extends java.util.List<android.util.Size>> map, java.util.List<? extends androidx.camera.core.impl.UseCaseConfig<?>> list2, java.util.List<java.lang.Integer> list3, java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, androidx.camera.core.DynamicRange> map2, boolean z) {
        java.util.List<java.util.List<android.util.Size>> highResolutionOutputSizeshNQ4ISI;
        java.util.List<androidx.camera.core.impl.SurfaceConfig> list4;
        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
        }
        if (!featureSettings.isFeatureComboInvocation() && !Camera2StreamConfigurationMap(featureSettings, list, map)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("No supported surface combination is found for camera device - Id : ");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append(". May be attempting to bind too many use cases. Existing surfaces: ");
            sb.append(list);
            sb.append(". New configs: ");
            sb.append(list2);
            sb.append(". GroupableFeature settings: ");
            sb.append(featureSettings);
            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        java.util.List<java.util.List<android.util.Size>> highSpeedVideoSizes = getHighSpeedVideoSizes(filterSupportedSizes$camera_camera2(map, featureSettings, z), list2, list3);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        if (featureSettings.isHighSpeedOn()) {
            highResolutionOutputSizeshNQ4ISI = this.getOutputStallDurationlomOqCM.getSizeArrangements(highSpeedVideoSizes);
        } else {
            highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes);
        }
        java.util.List<java.util.List<android.util.Size>> list5 = highResolutionOutputSizeshNQ4ISI;
        boolean containsZslUseCase = androidx.camera.camera2.internal.StreamUseCaseUtil.INSTANCE.containsZslUseCase(list, list2);
        if (!this.unwrapAs || containsZslUseCase) {
            list4 = null;
        } else {
            list4 = getHighSpeedVideoFpsRanges(list5, list, list2, list3, featureSettings, linkedHashMap, linkedHashMap2);
            androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            }
        }
        java.util.List<androidx.camera.core.impl.SurfaceConfig> list6 = list4;
        androidx.camera.camera2.adapter.SupportedSurfaceCombination.BestSizesAndMaxFpsForConfigs highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(list5, list, list2, Camera2StreamConfigurationMap(list, featureSettings.isHighSpeedOn()), list3, featureSettings, list6, map2, z);
        if (highSpeedVideoFpsRanges == null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("No supported surface combination is found for camera device - Id : ");
            sb2.append(this.getHighSpeedVideoFpsRanges);
            sb2.append(" and Hardware level: ");
            sb2.append(this.getHighSpeedVideoSizesFor);
            sb2.append(". May be the specified resolution is too large and not supported. Existing surfaces: ");
            sb2.append(list);
            sb2.append(". New configs: ");
            sb2.append(list2);
            sb2.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            throw new java.lang.IllegalArgumentException(sb2.toString().toString());
        }
        androidx.camera.camera2.impl.Camera2Logger camera2Logger3 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused3 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
        }
        java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, androidx.camera.core.impl.StreamSpec> highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRanges, list2, list3, map2, featureSettings);
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
        getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRanges, list6, list, linkedHashMap3, highResolutionOutputSizeshNQ4ISI2, linkedHashMap, linkedHashMap2);
        return new androidx.camera.core.impl.SurfaceStreamSpecQueryResult(highResolutionOutputSizeshNQ4ISI2, linkedHashMap3, highSpeedVideoFpsRanges.getMaxFpsForAllSizes());
    }

    private final androidx.camera.camera2.adapter.SupportedSurfaceCombination.FeatureSettings Camera2StreamConfigurationMap(androidx.camera.camera2.adapter.SupportedSurfaceCombination.FeatureSettings featureSettings) {
        if (featureSettings.getCameraMode() != 0 && featureSettings.isUltraHdrOn()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Camera device Id is ");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append(". Ultra HDR is not currently supported in ");
            sb.append(androidx.camera.core.impl.CameraMode.toLabelString(featureSettings.getCameraMode()));
            sb.append(" camera mode.");
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        if (featureSettings.getCameraMode() != 0 && featureSettings.getRequiredMaxBitDepth() == 10) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Camera device Id is ");
            sb2.append(this.getHighSpeedVideoFpsRanges);
            sb2.append(". 10 bit dynamic range is not currently supported in ");
            sb2.append(androidx.camera.core.impl.CameraMode.toLabelString(featureSettings.getCameraMode()));
            sb2.append(" camera mode.");
            throw new java.lang.IllegalArgumentException(sb2.toString().toString());
        }
        if (featureSettings.getCameraMode() != 0 && featureSettings.isFeatureComboInvocation()) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Camera device Id is ");
            sb3.append(this.getHighSpeedVideoFpsRanges);
            sb3.append(". feature combination is not currently supported in ");
            sb3.append(androidx.camera.core.impl.CameraMode.toLabelString(featureSettings.getCameraMode()));
            sb3.append(" camera mode.");
            throw new java.lang.IllegalArgumentException(sb3.toString().toString());
        }
        if (featureSettings.isHighSpeedOn() && featureSettings.isFeatureComboInvocation()) {
            throw new java.lang.IllegalArgumentException("High-speed session is not supported with feature combination".toString());
        }
        if (!featureSettings.isHighSpeedOn() || this.getOutputStallDurationlomOqCM.isHighSpeedSupported()) {
            return featureSettings;
        }
        throw new java.lang.IllegalArgumentException("High-speed session is not supported on this device.".toString());
    }

    private final boolean Camera2StreamConfigurationMap(androidx.camera.camera2.adapter.SupportedSurfaceCombination.FeatureSettings featureSettings, java.util.List<? extends androidx.camera.core.impl.AttachedSurfaceInfo> list, java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, ? extends java.util.List<android.util.Size>> map) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<? extends androidx.camera.core.impl.AttachedSurfaceInfo> it = list.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.SurfaceConfig surfaceConfig = it.next().getSurfaceConfig();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(surfaceConfig, "");
            arrayList.add(surfaceConfig);
        }
        androidx.camera.core.impl.utils.CompareSizesByArea compareSizesByArea = new androidx.camera.core.impl.utils.CompareSizesByArea();
        for (androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig : map.keySet()) {
            java.util.List<android.util.Size> list2 = map.get(useCaseConfig);
            if (list2 == null || list2.isEmpty()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("No available output size is found for ");
                sb.append(useCaseConfig);
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            android.util.Size size = (android.util.Size) java.util.Collections.min(list2, compareSizesByArea);
            int inputFormat = useCaseConfig.getInputFormat();
            androidx.camera.core.impl.StreamUseCase streamUseCase = useCaseConfig.getStreamUseCase();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(streamUseCase, "");
            androidx.camera.core.impl.SurfaceConfig.Companion companion = androidx.camera.core.impl.SurfaceConfig.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(size);
            arrayList.add(companion.transformSurfaceConfig(inputFormat, size, getUpdatedSurfaceSizeDefinitionByFormat(inputFormat), featureSettings.getCameraMode(), androidx.camera.core.impl.SurfaceConfig.ConfigSource.CAPTURE_SESSION_TABLES, streamUseCase));
        }
        return checkSupported$default(this, featureSettings, arrayList, null, null, null, 28, null);
    }

    private final java.util.List<androidx.camera.core.impl.SurfaceConfig> getHighSpeedVideoFpsRanges(java.util.List<? extends java.util.List<android.util.Size>> list, java.util.List<? extends androidx.camera.core.impl.AttachedSurfaceInfo> list2, java.util.List<? extends androidx.camera.core.impl.UseCaseConfig<?>> list3, java.util.List<java.lang.Integer> list4, androidx.camera.camera2.adapter.SupportedSurfaceCombination.FeatureSettings featureSettings, java.util.Map<java.lang.Integer, androidx.camera.core.impl.AttachedSurfaceInfo> map, java.util.Map<java.lang.Integer, androidx.camera.core.impl.UseCaseConfig<?>> map2) {
        java.util.Iterator<? extends java.util.List<android.util.Size>> it = list.iterator();
        java.util.List<androidx.camera.core.impl.SurfaceConfig> list5 = null;
        while (it.hasNext()) {
            list5 = getHighSpeedVideoFpsRanges(featureSettings, getHighSpeedVideoFpsRangesFor(featureSettings.getCameraMode(), list2, it.next(), list3, list4, map, map2, false), map, map2);
            if (list5 != null) {
                return list5;
            }
            map.clear();
            map2.clear();
        }
        return list5;
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(androidx.camera.camera2.adapter.SupportedSurfaceCombination.BestSizesAndMaxFpsForConfigs bestSizesAndMaxFpsForConfigs, java.util.List<androidx.camera.core.impl.SurfaceConfig> list, java.util.List<? extends androidx.camera.core.impl.AttachedSurfaceInfo> list2, java.util.Map<androidx.camera.core.impl.AttachedSurfaceInfo, androidx.camera.core.impl.StreamSpec> map, java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, androidx.camera.core.impl.StreamSpec> map2, java.util.Map<java.lang.Integer, androidx.camera.core.impl.AttachedSurfaceInfo> map3, java.util.Map<java.lang.Integer, androidx.camera.core.impl.UseCaseConfig<?>> map4) {
        if (list == null || bestSizesAndMaxFpsForConfigs.getMaxFpsForBestSizes() != bestSizesAndMaxFpsForConfigs.getMaxFpsForStreamUseCase()) {
            return;
        }
        int size = bestSizesAndMaxFpsForConfigs.getBestSizes().size();
        java.util.List<android.util.Size> bestSizesForStreamUseCase = bestSizesAndMaxFpsForConfigs.getBestSizesForStreamUseCase();
        kotlin.jvm.internal.Intrinsics.checkNotNull(bestSizesForStreamUseCase);
        if (size == bestSizesForStreamUseCase.size()) {
            java.util.List<kotlin.Pair> zip = kotlin.collections.CollectionsKt.zip(bestSizesAndMaxFpsForConfigs.getBestSizes(), bestSizesAndMaxFpsForConfigs.getBestSizesForStreamUseCase());
            if (!(zip instanceof java.util.Collection) || !zip.isEmpty()) {
                for (kotlin.Pair pair : zip) {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(pair.getFirst(), pair.getSecond())) {
                        return;
                    }
                }
            }
            if (androidx.camera.camera2.internal.StreamUseCaseUtil.INSTANCE.populateStreamUseCaseStreamSpecOptionWithInteropOverride(this.getHighSpeedVideoSizes, list2, map2, map)) {
                return;
            }
            androidx.camera.camera2.internal.StreamUseCaseUtil.INSTANCE.populateStreamUseCaseStreamSpecOptionWithSupportedSurfaceConfigs(map2, map, map3, map4, list);
        }
    }

    private final java.util.List<java.util.List<android.util.Size>> getHighSpeedVideoSizes(java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, ? extends java.util.List<android.util.Size>> map, java.util.List<? extends androidx.camera.core.impl.UseCaseConfig<?>> list, java.util.List<java.lang.Integer> list2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.Integer> it = list2.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            java.util.List<android.util.Size> list3 = map.get(list.get(intValue));
            kotlin.jvm.internal.Intrinsics.checkNotNull(list3);
            arrayList.add(applyResolutionSelectionOrderRelatedWorkarounds(list3, list.get(intValue).getInputFormat()));
        }
        return arrayList;
    }

    private final int Camera2StreamConfigurationMap(java.util.List<? extends androidx.camera.core.impl.AttachedSurfaceInfo> list, boolean z) {
        int i = Integer.MAX_VALUE;
        for (androidx.camera.core.impl.AttachedSurfaceInfo attachedSurfaceInfo : list) {
            int imageFormat = attachedSurfaceInfo.getImageFormat();
            android.util.Size size = attachedSurfaceInfo.getSize();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(size, "");
            i = java.lang.Math.min(i, getHighSpeedVideoFpsRanges(imageFormat, size, z, attachedSurfaceInfo.getCustomMaxFrameRate()));
        }
        return i;
    }

    public static /* synthetic */ java.util.Map filterSupportedSizes$camera_camera2$default(androidx.camera.camera2.adapter.SupportedSurfaceCombination supportedSurfaceCombination, java.util.Map map, androidx.camera.camera2.adapter.SupportedSurfaceCombination.FeatureSettings featureSettings, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return supportedSurfaceCombination.filterSupportedSizes$camera_camera2(map, featureSettings, z);
    }

    public final java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, java.util.List<android.util.Size>> filterSupportedSizes$camera_camera2(java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, ? extends java.util.List<android.util.Size>> newUseCaseConfigsSupportedSizeMap, androidx.camera.camera2.adapter.SupportedSurfaceCombination.FeatureSettings featureSettings, boolean forceUniqueMaxFpsFiltering) {
        androidx.camera.core.impl.SurfaceConfig.ConfigSource configSource;
        java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, ? extends java.util.List<android.util.Size>> map = newUseCaseConfigsSupportedSizeMap;
        java.lang.String str = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSettings, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig : newUseCaseConfigsSupportedSizeMap.keySet()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            java.util.List<android.util.Size> list = map.get(useCaseConfig);
            kotlin.jvm.internal.Intrinsics.checkNotNull(list);
            for (android.util.Size size : list) {
                int inputFormat = useCaseConfig.getInputFormat();
                int customMaxFrameRate = useCaseConfig.getCustomMaxFrameRate(size);
                androidx.camera.core.impl.StreamUseCase streamUseCase = useCaseConfig.getStreamUseCase();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(streamUseCase, str);
                androidx.camera.core.impl.SurfaceConfig.Companion companion = androidx.camera.core.impl.SurfaceConfig.INSTANCE;
                androidx.camera.core.impl.SurfaceSizeDefinition updatedSurfaceSizeDefinitionByFormat = getUpdatedSurfaceSizeDefinitionByFormat(inputFormat);
                int cameraMode = featureSettings.getCameraMode();
                if (featureSettings.getRequiresFeatureComboQuery()) {
                    configSource = androidx.camera.core.impl.SurfaceConfig.ConfigSource.FEATURE_COMBINATION_TABLE;
                } else {
                    configSource = androidx.camera.core.impl.SurfaceConfig.ConfigSource.CAPTURE_SESSION_TABLES;
                }
                java.lang.String str2 = str;
                androidx.camera.core.impl.SurfaceConfig.ConfigSize configSize = companion.transformSurfaceConfig(inputFormat, size, updatedSurfaceSizeDefinitionByFormat, cameraMode, configSource, streamUseCase).getConfigSize();
                int highSpeedVideoFpsRanges = (!kotlin.jvm.internal.Intrinsics.areEqual(featureSettings.getTargetFpsRange(), androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED) || forceUniqueMaxFpsFiltering) ? getHighSpeedVideoFpsRanges(inputFormat, size, featureSettings.isHighSpeedOn(), customMaxFrameRate) : Integer.MAX_VALUE;
                if (!featureSettings.isFeatureComboInvocation() || (configSize != androidx.camera.core.impl.SurfaceConfig.ConfigSize.NOT_SUPPORT && (kotlin.jvm.internal.Intrinsics.areEqual(featureSettings.getTargetFpsRange(), androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED) || highSpeedVideoFpsRanges >= featureSettings.getTargetFpsRange().getUpper().intValue()))) {
                    java.util.LinkedHashSet linkedHashSet = (java.util.Set) linkedHashMap2.get(configSize);
                    if (linkedHashSet == null) {
                        linkedHashSet = new java.util.LinkedHashSet();
                        linkedHashMap2.put(configSize, linkedHashSet);
                    }
                    if (!linkedHashSet.contains(java.lang.Integer.valueOf(highSpeedVideoFpsRanges))) {
                        arrayList.add(size);
                        linkedHashSet.add(java.lang.Integer.valueOf(highSpeedVideoFpsRanges));
                    }
                }
                str = str2;
            }
            linkedHashMap.put(useCaseConfig, arrayList);
            map = newUseCaseConfigsSupportedSizeMap;
        }
        return linkedHashMap;
    }

    private final androidx.camera.camera2.adapter.SupportedSurfaceCombination.BestSizesAndMaxFpsForConfigs getHighSpeedVideoFpsRanges(java.util.List<? extends java.util.List<android.util.Size>> list, java.util.List<? extends androidx.camera.core.impl.AttachedSurfaceInfo> list2, final java.util.List<? extends androidx.camera.core.impl.UseCaseConfig<?>> list3, int i, final java.util.List<java.lang.Integer> list4, final androidx.camera.camera2.adapter.SupportedSurfaceCombination.FeatureSettings featureSettings, java.util.List<androidx.camera.core.impl.SurfaceConfig> list5, java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, androidx.camera.core.DynamicRange> map, boolean z) {
        int i2;
        java.util.Iterator<? extends java.util.List<android.util.Size>> it;
        java.util.LinkedHashMap linkedHashMap;
        androidx.camera.core.DynamicRange dynamicRange;
        java.util.Iterator<? extends java.util.List<android.util.Size>> it2 = list.iterator();
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MAX_VALUE;
        boolean z2 = false;
        java.util.List<android.util.Size> list6 = null;
        boolean z3 = false;
        java.util.List<android.util.Size> list7 = null;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            java.util.List<android.util.Size> next = it2.next();
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
            int i6 = i3;
            final java.util.List<androidx.camera.core.impl.SurfaceConfig> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(featureSettings.getCameraMode(), list2, next, list3, list4, linkedHashMap2, linkedHashMap3, featureSettings.getRequiresFeatureComboQuery());
            boolean isHighSpeedOn = featureSettings.isHighSpeedOn();
            i3 = i;
            int i7 = 0;
            for (android.util.Size size : next) {
                androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig = list3.get(list4.get(i7).intValue());
                i3 = java.lang.Math.min(i3, getHighSpeedVideoFpsRanges(useCaseConfig.getInputFormat(), size, isHighSpeedOn, useCaseConfig.getCustomMaxFrameRate(size)));
                i7++;
            }
            android.util.Range<java.lang.Integer> targetFpsRange = featureSettings.getTargetFpsRange();
            boolean z4 = kotlin.jvm.internal.Intrinsics.areEqual(targetFpsRange, androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED) || i3 >= i || i3 >= targetFpsRange.getUpper().intValue();
            final java.util.LinkedHashMap linkedHashMap4 = new java.util.LinkedHashMap();
            int i8 = 0;
            for (java.lang.Object obj : highSpeedVideoFpsRangesFor) {
                if (i8 < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                androidx.camera.core.impl.SurfaceConfig surfaceConfig = (androidx.camera.core.impl.SurfaceConfig) obj;
                androidx.camera.core.impl.AttachedSurfaceInfo attachedSurfaceInfo = linkedHashMap2.get(java.lang.Integer.valueOf(i8));
                if (attachedSurfaceInfo == null || (dynamicRange = attachedSurfaceInfo.getDynamicRange()) == null) {
                    it = it2;
                    linkedHashMap = linkedHashMap3;
                    androidx.camera.core.DynamicRange dynamicRange2 = map.get(linkedHashMap.get(java.lang.Integer.valueOf(i8)));
                    if (dynamicRange2 == null) {
                        throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                    }
                    dynamicRange = dynamicRange2;
                } else {
                    it = it2;
                    linkedHashMap = linkedHashMap3;
                }
                linkedHashMap4.put(surfaceConfig, dynamicRange);
                i8++;
                linkedHashMap3 = linkedHashMap;
                it2 = it;
            }
            java.util.Iterator<? extends java.util.List<android.util.Size>> it3 = it2;
            java.util.LinkedHashMap linkedHashMap5 = linkedHashMap3;
            kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, new kotlin.jvm.functions.Function0() { // from class: androidx.camera.camera2.adapter.SupportedSurfaceCombination$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    boolean checkSupported;
                    checkSupported = androidx.camera.camera2.adapter.SupportedSurfaceCombination.this.checkSupported(featureSettings, highSpeedVideoFpsRangesFor, linkedHashMap4, list3, list4);
                    return java.lang.Boolean.valueOf(checkSupported);
                }
            });
            if (z && ((java.lang.Boolean) lazy.getValue()).booleanValue() && (i5 == Integer.MAX_VALUE || i5 < i3)) {
                i5 = i3;
            }
            if (!z2 && ((java.lang.Boolean) lazy.getValue()).booleanValue()) {
                if (i4 == Integer.MAX_VALUE || i4 < i3) {
                    i4 = i3;
                    list6 = next;
                }
                if (z4) {
                    if (z3 && !z) {
                        i4 = i3;
                        list6 = next;
                        i3 = i6;
                        break;
                    }
                    i4 = i3;
                    list6 = next;
                    z2 = true;
                }
            }
            if (list5 == null || z3) {
                i2 = i6;
            } else {
                i2 = i6;
                if (getHighSpeedVideoFpsRanges(featureSettings, highSpeedVideoFpsRangesFor, linkedHashMap2, linkedHashMap5) != null) {
                    if (i2 == Integer.MAX_VALUE || i2 < i3) {
                        i2 = i3;
                        list7 = next;
                    }
                    if (z4) {
                        if (z2 && !z) {
                            list7 = next;
                            break;
                        }
                        list7 = next;
                        z3 = true;
                        it2 = it3;
                    }
                }
            }
            i3 = i2;
            it2 = it3;
        }
        if (list6 == null) {
            return null;
        }
        if (!featureSettings.isFeatureComboInvocation() || kotlin.jvm.internal.Intrinsics.areEqual(featureSettings.getTargetFpsRange(), androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED) || (i4 != Integer.MAX_VALUE && i4 >= featureSettings.getTargetFpsRange().getUpper().intValue())) {
            return new androidx.camera.camera2.adapter.SupportedSurfaceCombination.BestSizesAndMaxFpsForConfigs(list6, list7, i4, i3, i5);
        }
        return null;
    }

    private final java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, androidx.camera.core.impl.StreamSpec> getHighResolutionOutputSizeshNQ4ISI(androidx.camera.camera2.adapter.SupportedSurfaceCombination.BestSizesAndMaxFpsForConfigs bestSizesAndMaxFpsForConfigs, java.util.List<? extends androidx.camera.core.impl.UseCaseConfig<?>> list, java.util.List<java.lang.Integer> list2, java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, androidx.camera.core.DynamicRange> map, androidx.camera.camera2.adapter.SupportedSurfaceCombination.FeatureSettings featureSettings) {
        android.util.Range<java.lang.Integer>[] rangeArr;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        android.util.Range<java.lang.Integer> range = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(featureSettings.getTargetFpsRange(), androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
            if (featureSettings.isHighSpeedOn()) {
                rangeArr = this.getOutputStallDurationlomOqCM.getFrameRateRangesFor(bestSizesAndMaxFpsForConfigs.getBestSizes());
            } else {
                androidx.camera.camera2.pipe.CameraMetadata cameraMetadata = this.getHighSpeedVideoSizes;
                android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
                rangeArr = (android.util.Range[]) cameraMetadata.get(key);
            }
            android.util.Range<java.lang.Integer> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(featureSettings.getTargetFpsRange(), bestSizesAndMaxFpsForConfigs.getMaxFpsForBestSizes(), rangeArr);
            if ((featureSettings.isFeatureComboInvocation() || featureSettings.isStrictFpsRequired()) && !kotlin.jvm.internal.Intrinsics.areEqual(highSpeedVideoFpsRanges, featureSettings.getTargetFpsRange())) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Target FPS range ");
                sb.append(featureSettings.getTargetFpsRange());
                sb.append(" is not supported. Max FPS supported by the calculated best combination: ");
                sb.append(bestSizesAndMaxFpsForConfigs.getMaxFpsForBestSizes());
                sb.append(". Calculated best FPS range for device: ");
                sb.append(highSpeedVideoFpsRanges);
                sb.append(". Device supported FPS ranges: ");
                java.lang.String arrays = java.util.Arrays.toString(rangeArr);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays, "");
                sb.append(arrays);
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            range = highSpeedVideoFpsRanges;
        } else if (featureSettings.isHighSpeedOn()) {
            range = getHighSpeedVideoFpsRanges(androidx.camera.camera2.internal.HighSpeedResolver.INSTANCE.getDEFAULT_FPS(), bestSizesAndMaxFpsForConfigs.getMaxFpsForBestSizes(), this.getOutputStallDurationlomOqCM.getFrameRateRangesFor(bestSizesAndMaxFpsForConfigs.getBestSizes()));
        }
        int i = 0;
        for (androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig : list) {
            androidx.camera.core.impl.StreamSpec.Builder sessionType = androidx.camera.core.impl.StreamSpec.builder(bestSizesAndMaxFpsForConfigs.getBestSizes().get(list2.indexOf(java.lang.Integer.valueOf(i)))).setSessionType(featureSettings.isHighSpeedOn() ? 1 : 0);
            androidx.camera.core.DynamicRange dynamicRange = map.get(useCaseConfig);
            if (dynamicRange == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
            androidx.camera.core.impl.StreamSpec.Builder zslDisabled = sessionType.setDynamicRange(dynamicRange).setImplementationOptions(androidx.camera.camera2.internal.StreamUseCaseUtil.INSTANCE.getStreamSpecImplementationOptions(useCaseConfig)).setZslDisabled(featureSettings.getHasVideoCapture());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zslDisabled, "");
            if (!kotlin.jvm.internal.Intrinsics.areEqual(range, androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
                zslDisabled.setExpectedFrameRateRange(range);
            }
            linkedHashMap.put(useCaseConfig, zslDisabled.build());
            i++;
        }
        return linkedHashMap;
    }

    private final java.util.List<androidx.camera.core.impl.SurfaceConfig> getHighSpeedVideoFpsRangesFor(int i, java.util.List<? extends androidx.camera.core.impl.AttachedSurfaceInfo> list, java.util.List<android.util.Size> list2, java.util.List<? extends androidx.camera.core.impl.UseCaseConfig<?>> list3, java.util.List<java.lang.Integer> list4, java.util.Map<java.lang.Integer, androidx.camera.core.impl.AttachedSurfaceInfo> map, java.util.Map<java.lang.Integer, androidx.camera.core.impl.UseCaseConfig<?>> map2, boolean z) {
        androidx.camera.core.impl.SurfaceConfig.ConfigSource configSource;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.camera.core.impl.AttachedSurfaceInfo attachedSurfaceInfo : list) {
            androidx.camera.core.impl.SurfaceConfig surfaceConfig = attachedSurfaceInfo.getSurfaceConfig();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(surfaceConfig, "");
            arrayList.add(surfaceConfig);
            if (map != null) {
                map.put(java.lang.Integer.valueOf(arrayList.size() - 1), attachedSurfaceInfo);
            }
        }
        int i2 = 0;
        for (android.util.Size size : list2) {
            androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig = list3.get(list4.get(i2).intValue());
            int inputFormat = useCaseConfig.getInputFormat();
            androidx.camera.core.impl.StreamUseCase streamUseCase = useCaseConfig.getStreamUseCase();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(streamUseCase, "");
            androidx.camera.core.impl.SurfaceConfig.Companion companion = androidx.camera.core.impl.SurfaceConfig.INSTANCE;
            androidx.camera.core.impl.SurfaceSizeDefinition updatedSurfaceSizeDefinitionByFormat = getUpdatedSurfaceSizeDefinitionByFormat(inputFormat);
            if (z) {
                configSource = androidx.camera.core.impl.SurfaceConfig.ConfigSource.FEATURE_COMBINATION_TABLE;
            } else {
                configSource = androidx.camera.core.impl.SurfaceConfig.ConfigSource.CAPTURE_SESSION_TABLES;
            }
            arrayList.add(companion.transformSurfaceConfig(inputFormat, size, updatedSurfaceSizeDefinitionByFormat, i, configSource, streamUseCase));
            if (map2 != null) {
                map2.put(java.lang.Integer.valueOf(arrayList.size() - 1), useCaseConfig);
            }
            i2++;
        }
        return arrayList;
    }

    private final int getHighSpeedVideoFpsRanges(int i, android.util.Size size, boolean z, int i2) {
        int highSpeedVideoFpsRanges;
        if (!z) {
            highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(i, size);
        } else {
            if (i != 34) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            highSpeedVideoFpsRanges = this.getOutputStallDurationlomOqCM.getMaxFrameRate(size);
        }
        return java.lang.Math.min(i2, highSpeedVideoFpsRanges);
    }

    private final int getHighSpeedVideoFpsRanges(int i, android.util.Size size) {
        long outputMinFrameDuration = getHighSpeedVideoSizes().getOutputMinFrameDuration(i, size);
        if (outputMinFrameDuration > 0) {
            return (int) (1.0E9d / outputMinFrameDuration);
        }
        if (!this.getOutputStallDuration) {
            return Integer.MAX_VALUE;
        }
        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (!androidx.camera.core.Logger.isWarnEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            return 0;
        }
        java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
        return 0;
    }

    private static int getHighResolutionOutputSizeshNQ4ISI(android.util.Range<java.lang.Integer> range) {
        int intValue = range.getUpper().intValue();
        java.lang.Integer lower = range.getLower();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lower, "");
        return (intValue - lower.intValue()) + 1;
    }

    private static int getHighSpeedVideoFpsRangesFor(android.util.Range<java.lang.Integer> range, android.util.Range<java.lang.Integer> range2) {
        if (range.contains((android.util.Range<java.lang.Integer>) range2.getUpper()) || range.contains((android.util.Range<java.lang.Integer>) range2.getLower())) {
            throw new java.lang.IllegalArgumentException("Ranges must not intersect".toString());
        }
        if (range.getLower().intValue() > range2.getUpper().intValue()) {
            int intValue = range.getLower().intValue();
            java.lang.Integer upper = range2.getUpper();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upper, "");
            return intValue - upper.intValue();
        }
        int intValue2 = range2.getLower().intValue();
        java.lang.Integer upper2 = range.getUpper();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upper2, "");
        return intValue2 - upper2.intValue();
    }

    private final android.util.Range<java.lang.Integer> getHighSpeedVideoFpsRanges(android.util.Range<java.lang.Integer> range, int i, android.util.Range<java.lang.Integer>[] rangeArr) {
        int i2 = i;
        android.util.Range<java.lang.Integer>[] rangeArr2 = rangeArr;
        if (kotlin.jvm.internal.Intrinsics.areEqual(range, androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
            android.util.Range<java.lang.Integer> range2 = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(range2, "");
            return range2;
        }
        if (rangeArr2 == null) {
            android.util.Range<java.lang.Integer> range3 = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(range3, "");
            return range3;
        }
        java.lang.Integer lower = range.getLower();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lower, "");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(java.lang.Math.min(lower.intValue(), i2));
        java.lang.Integer upper = range.getUpper();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upper, "");
        android.util.Range<java.lang.Integer> range4 = new android.util.Range<>(valueOf, java.lang.Integer.valueOf(java.lang.Math.min(upper.intValue(), i2)));
        android.util.Range<java.lang.Integer> range5 = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
        int length = rangeArr2.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            android.util.Range<java.lang.Integer> range6 = rangeArr2[i3];
            if (i2 >= range6.getLower().intValue()) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(range5, androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
                    range5 = range6;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(range6, range4)) {
                    range5 = range6;
                    break;
                }
                try {
                    android.util.Range<java.lang.Integer> intersect = range6.intersect(range4);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(intersect);
                    int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(intersect);
                    if (i4 == 0) {
                        range5 = range6;
                        i4 = highResolutionOutputSizeshNQ4ISI;
                    } else if (highResolutionOutputSizeshNQ4ISI >= i4) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(range5);
                        android.util.Range<java.lang.Integer> intersect2 = range5.intersect(range4);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intersect2, "");
                        double highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(intersect2);
                        android.util.Range<java.lang.Integer> intersect3 = range6.intersect(range4);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intersect3, "");
                        double highResolutionOutputSizeshNQ4ISI3 = getHighResolutionOutputSizeshNQ4ISI(intersect3);
                        double highResolutionOutputSizeshNQ4ISI4 = highResolutionOutputSizeshNQ4ISI3 / getHighResolutionOutputSizeshNQ4ISI(range6);
                        double highResolutionOutputSizeshNQ4ISI5 = highResolutionOutputSizeshNQ4ISI2 / getHighResolutionOutputSizeshNQ4ISI(range5);
                        if (highResolutionOutputSizeshNQ4ISI3 <= highResolutionOutputSizeshNQ4ISI2) {
                        }
                        android.util.Range<java.lang.Integer> intersect4 = range4.intersect(range5);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intersect4, "");
                        i4 = getHighResolutionOutputSizeshNQ4ISI(intersect4);
                    }
                } catch (java.lang.IllegalArgumentException unused) {
                    if (i4 == 0) {
                        int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(range6, range4);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(range5);
                        if (highSpeedVideoFpsRangesFor >= getHighSpeedVideoFpsRangesFor(range5, range4)) {
                            int highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(range6, range4);
                            kotlin.jvm.internal.Intrinsics.checkNotNull(range5);
                            if (highSpeedVideoFpsRangesFor2 == getHighSpeedVideoFpsRangesFor(range5, range4)) {
                                if (range6.getLower().intValue() <= range5.getUpper().intValue()) {
                                    int highResolutionOutputSizeshNQ4ISI6 = getHighResolutionOutputSizeshNQ4ISI(range6);
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(range5);
                                    if (highResolutionOutputSizeshNQ4ISI6 >= getHighResolutionOutputSizeshNQ4ISI(range5)) {
                                    }
                                }
                            }
                        }
                        range5 = range6;
                    }
                }
            }
            i3++;
            i2 = i;
            rangeArr2 = rangeArr;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(range5);
        return range5;
    }

    private static android.util.Range<java.lang.Integer> getHighSpeedVideoSizes(android.util.Range<java.lang.Integer> range, android.util.Range<java.lang.Integer> range2, boolean z) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(range2, androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED) && kotlin.jvm.internal.Intrinsics.areEqual(range, androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
            android.util.Range<java.lang.Integer> range3 = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(range3, "");
            return range3;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(range2, androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
            return range;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(range, androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
            if (z) {
                androidx.core.util.Preconditions.checkState(kotlin.jvm.internal.Intrinsics.areEqual(range, range2), "All targetFrameRate should be the same if strict fps is required");
                return range;
            }
            try {
                android.util.Range<java.lang.Integer> intersect = range2.intersect(range);
                kotlin.jvm.internal.Intrinsics.checkNotNull(intersect);
                return intersect;
            } catch (java.lang.IllegalArgumentException unused) {
            }
        }
        return range2;
    }

    public final java.util.List<android.util.Size> applyResolutionSelectionOrderRelatedWorkarounds(java.util.List<android.util.Size> sizeList, int imageFormat) {
        android.util.Rational rational;
        java.util.List<android.util.Size> list;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sizeList, "");
        int i = this.getARTIFICIAL_FRAME_PACKAGE_NAME.get(this.getHighSpeedVideoSizes, this.coroutineCreation);
        if (i == 0) {
            rational = androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_4_3;
        } else if (i != 1) {
            if (i == 2) {
                android.util.Size maximumSize = getUpdatedSurfaceSizeDefinitionByFormat(256).getMaximumSize(256);
                if (maximumSize != null) {
                    rational = new android.util.Rational(maximumSize.getWidth(), maximumSize.getHeight());
                }
            } else if (i != 3) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Undefined targetAspectRatio: ");
                sb.append(this.getARTIFICIAL_FRAME_PACKAGE_NAME);
                throw new java.lang.AssertionError(sb.toString());
            }
            rational = null;
        } else {
            rational = androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_16_9;
        }
        if (rational == null) {
            list = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) sizeList);
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (android.util.Size size : sizeList) {
                if (androidx.camera.core.impl.utils.AspectRatioUtil.hasMatchingAspectRatio(size, rational)) {
                    arrayList.add(size);
                } else {
                    arrayList2.add(size);
                }
            }
            arrayList2.addAll(0, arrayList);
            list = arrayList2;
        }
        return this.CoroutineDebuggingKt.insertOrPrioritize(androidx.camera.core.impl.SurfaceConfig.INSTANCE.getConfigType(imageFormat), list);
    }

    private final void Camera2StreamConfigurationMap() {
        androidx.camera.core.impl.SurfaceSizeDefinition create = androidx.camera.core.impl.SurfaceSizeDefinition.create(androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_VGA, new java.util.LinkedHashMap(), this.getHighSpeedVideoFpsRangesFor.getPreviewSize(), new java.util.LinkedHashMap(), getHighSpeedVideoFpsRangesFor(), new java.util.LinkedHashMap(), new java.util.LinkedHashMap(), new java.util.LinkedHashMap(), new java.util.LinkedHashMap());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
        setSurfaceSizeDefinition$camera_camera2(create);
    }

    public final androidx.camera.core.impl.SurfaceSizeDefinition getUpdatedSurfaceSizeDefinitionByFormat(int format) {
        android.util.Size maxOutputSizeByFormat$camera_camera2$default;
        if (!this.b.contains(java.lang.Integer.valueOf(format))) {
            java.util.Map<java.lang.Integer, android.util.Size> s720pSizeMap = getSurfaceSizeDefinition$camera_camera2().getS720pSizeMap();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(s720pSizeMap, "");
            android.util.Size size = androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_720P;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(size, "");
            getHighResolutionOutputSizeshNQ4ISI(s720pSizeMap, size, format);
            java.util.Map<java.lang.Integer, android.util.Size> s1440pSizeMap = getSurfaceSizeDefinition$camera_camera2().getS1440pSizeMap();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(s1440pSizeMap, "");
            android.util.Size size2 = androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_1440P;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(size2, "");
            getHighResolutionOutputSizeshNQ4ISI(s1440pSizeMap, size2, format);
            java.util.Map<java.lang.Integer, android.util.Size> maximumSizeMap = getSurfaceSizeDefinition$camera_camera2().getMaximumSizeMap();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(maximumSizeMap, "");
            Camera2StreamConfigurationMap(maximumSizeMap, format, (android.util.Rational) null);
            java.util.Map<java.lang.Integer, android.util.Size> maximum4x3SizeMap = getSurfaceSizeDefinition$camera_camera2().getMaximum4x3SizeMap();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(maximum4x3SizeMap, "");
            Camera2StreamConfigurationMap(maximum4x3SizeMap, format, androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_4_3);
            java.util.Map<java.lang.Integer, android.util.Size> maximum16x9SizeMap = getSurfaceSizeDefinition$camera_camera2().getMaximum16x9SizeMap();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(maximum16x9SizeMap, "");
            Camera2StreamConfigurationMap(maximum16x9SizeMap, format, androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_16_9);
            java.util.Map<java.lang.Integer, android.util.Size> ultraMaximumSizeMap = getSurfaceSizeDefinition$camera_camera2().getUltraMaximumSizeMap();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ultraMaximumSizeMap, "");
            if (android.os.Build.VERSION.SDK_INT >= 31 && this.toString) {
                androidx.camera.camera2.pipe.CameraMetadata cameraMetadata = this.getHighSpeedVideoSizes;
                android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
                android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap = (android.hardware.camera2.params.StreamConfigurationMap) cameraMetadata.get(key);
                if (streamConfigurationMap != null && (maxOutputSizeByFormat$camera_camera2$default = getMaxOutputSizeByFormat$camera_camera2$default(this, streamConfigurationMap, format, true, null, 8, null)) != null) {
                    ultraMaximumSizeMap.put(java.lang.Integer.valueOf(format), maxOutputSizeByFormat$camera_camera2$default);
                }
            }
            this.b.add(java.lang.Integer.valueOf(format));
        }
        return getSurfaceSizeDefinition$camera_camera2();
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(java.util.Map<java.lang.Integer, android.util.Size> map, android.util.Size size, int i) {
        if (this.getOutputSizes) {
            android.util.Size maxOutputSizeByFormat$camera_camera2$default = getMaxOutputSizeByFormat$camera_camera2$default(this, this.coroutineCreation.toStreamConfigurationMap(), i, false, null, 8, null);
            if (maxOutputSizeByFormat$camera_camera2$default != null) {
                size = (android.util.Size) java.util.Collections.min(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new android.util.Size[]{size, maxOutputSizeByFormat$camera_camera2$default}), new androidx.camera.core.impl.utils.CompareSizesByArea());
            }
            map.put(java.lang.Integer.valueOf(i), size);
        }
    }

    private final void Camera2StreamConfigurationMap(java.util.Map<java.lang.Integer, android.util.Size> map, int i, android.util.Rational rational) {
        android.util.Size maxOutputSizeByFormat$camera_camera2 = getMaxOutputSizeByFormat$camera_camera2(this.coroutineCreation.toStreamConfigurationMap(), i, true, rational);
        if (maxOutputSizeByFormat$camera_camera2 != null) {
            map.put(java.lang.Integer.valueOf(i), maxOutputSizeByFormat$camera_camera2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0080, code lost:
    
        r1 = r2.getVideoProfiles().get(0);
        kotlin.jvm.internal.Intrinsics.checkNotNull(r1);
        r1 = r1.getResolution();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final android.util.Size getHighSpeedVideoFpsRangesFor() {
        android.util.Size size;
        androidx.camera.core.impl.EncoderProfilesProxy all;
        try {
            java.lang.Integer.parseInt(this.getHighSpeedVideoFpsRanges);
            java.util.Iterator it = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{1, 13, 10, 8, 12, 6, 5, 4}).iterator();
            while (true) {
                if (!it.hasNext()) {
                    size = null;
                    break;
                }
                int intValue = ((java.lang.Number) it.next()).intValue();
                if (this.getInputFormats.hasProfile(intValue) && (all = this.getInputFormats.getAll(intValue)) != null) {
                    java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy> videoProfiles = all.getVideoProfiles();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(videoProfiles, "");
                    if (!videoProfiles.isEmpty()) {
                        break;
                    }
                }
            }
            if (size != null) {
                return size;
            }
        } catch (java.lang.NumberFormatException unused) {
        }
        android.util.Size highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        if (highSpeedVideoFpsRanges != null) {
            return highSpeedVideoFpsRanges;
        }
        android.util.Size size2 = androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_480P;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(size2, "");
        return size2;
    }

    private final androidx.camera.camera2.compat.StreamConfigurationMapCompat getHighSpeedVideoSizes() {
        androidx.camera.camera2.pipe.CameraMetadata cameraMetadata = this.getHighSpeedVideoSizes;
        android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap = (android.hardware.camera2.params.StreamConfigurationMap) cameraMetadata.get(key);
        if (streamConfigurationMap == null) {
            throw new java.lang.IllegalArgumentException("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
        }
        return new androidx.camera.camera2.compat.StreamConfigurationMapCompat(streamConfigurationMap, new androidx.camera.camera2.compat.workaround.OutputSizesCorrector(this.getHighSpeedVideoSizes, streamConfigurationMap));
    }

    private final android.util.Size getHighSpeedVideoFpsRanges() {
        java.lang.Object m23436constructorimpl;
        android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap = this.coroutineCreation.toStreamConfigurationMap();
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            androidx.camera.camera2.adapter.SupportedSurfaceCombination supportedSurfaceCombination = this;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(streamConfigurationMap != null ? streamConfigurationMap.getOutputSizes(android.media.MediaRecorder.class) : null);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = null;
        }
        android.util.Size[] sizeArr = (android.util.Size[]) m23436constructorimpl;
        if (sizeArr == null) {
            return null;
        }
        java.util.Arrays.sort(sizeArr, new androidx.camera.core.impl.utils.CompareSizesByArea(true));
        for (android.util.Size size : sizeArr) {
            if (size.getWidth() <= androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_1080P.getWidth() && size.getHeight() <= androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_1080P.getHeight()) {
                return size;
            }
        }
        return null;
    }

    public static /* synthetic */ android.util.Size getMaxOutputSizeByFormat$camera_camera2$default(androidx.camera.camera2.adapter.SupportedSurfaceCombination supportedSurfaceCombination, android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap, int i, boolean z, android.util.Rational rational, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            rational = null;
        }
        return supportedSurfaceCombination.getMaxOutputSizeByFormat$camera_camera2(streamConfigurationMap, i, z, rational);
    }

    public final android.util.Size getMaxOutputSizeByFormat$camera_camera2(android.hardware.camera2.params.StreamConfigurationMap map, int imageFormat, boolean highResolutionIncluded, android.util.Rational aspectRatio) {
        android.util.Size[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(map, imageFormat, aspectRatio);
        if (highSpeedVideoFpsRanges == null || highSpeedVideoFpsRanges.length == 0) {
            return null;
        }
        androidx.camera.core.impl.utils.CompareSizesByArea compareSizesByArea = new androidx.camera.core.impl.utils.CompareSizesByArea();
        android.util.Size size = (android.util.Size) java.util.Collections.max(kotlin.collections.ArraysKt.asList(highSpeedVideoFpsRanges), compareSizesByArea);
        android.util.Size size2 = androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_ZERO;
        if (highResolutionIncluded) {
            android.util.Size[] highResolutionOutputSizes = map != null ? map.getHighResolutionOutputSizes(imageFormat) : null;
            if (highResolutionOutputSizes != null && highResolutionOutputSizes.length != 0) {
                size2 = (android.util.Size) java.util.Collections.max(kotlin.collections.ArraysKt.asList(highResolutionOutputSizes), compareSizesByArea);
            }
        }
        return (android.util.Size) java.util.Collections.max(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new android.util.Size[]{size, size2}), compareSizesByArea);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final android.util.Size[] getHighSpeedVideoFpsRanges(android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap, int i, android.util.Rational rational) {
        java.lang.Object m23436constructorimpl;
        android.util.Size[] sizeArr;
        android.util.Size[] outputSizes;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            androidx.camera.camera2.adapter.SupportedSurfaceCombination supportedSurfaceCombination = this;
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (i == 34) {
            if (streamConfigurationMap != null) {
                outputSizes = streamConfigurationMap.getOutputSizes(android.graphics.SurfaceTexture.class);
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(outputSizes);
                if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                    m23436constructorimpl = null;
                }
                sizeArr = (android.util.Size[]) m23436constructorimpl;
                if (sizeArr != null) {
                    return null;
                }
                if (rational == null) {
                    return sizeArr;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (android.util.Size size : sizeArr) {
                    if (androidx.camera.core.impl.utils.AspectRatioUtil.hasMatchingAspectRatio(size, rational)) {
                        arrayList.add(size);
                    }
                }
                return (android.util.Size[]) arrayList.toArray(new android.util.Size[0]);
            }
            outputSizes = null;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(outputSizes);
            if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            }
            sizeArr = (android.util.Size[]) m23436constructorimpl;
            if (sizeArr != null) {
            }
        } else {
            if (streamConfigurationMap != null) {
                outputSizes = streamConfigurationMap.getOutputSizes(i);
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(outputSizes);
                if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                }
                sizeArr = (android.util.Size[]) m23436constructorimpl;
                if (sizeArr != null) {
                }
            }
            outputSizes = null;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(outputSizes);
            if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            }
            sizeArr = (android.util.Size[]) m23436constructorimpl;
            if (sizeArr != null) {
            }
        }
    }

    private static java.util.List<java.util.List<android.util.Size>> getHighResolutionOutputSizeshNQ4ISI(java.util.List<? extends java.util.List<android.util.Size>> list) {
        java.util.Iterator<? extends java.util.List<android.util.Size>> it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            i *= it.next().size();
        }
        if (i == 0) {
            throw new java.lang.IllegalArgumentException("Failed to find supported resolutions.".toString());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new java.util.ArrayList());
        }
        int size = i / list.get(0).size();
        int size2 = list.size();
        int i3 = i;
        for (int i4 = 0; i4 < size2; i4++) {
            java.util.List<android.util.Size> list2 = list.get(i4);
            for (int i5 = 0; i5 < i; i5++) {
                ((java.util.List) arrayList.get(i5)).add(list2.get((i5 % i3) / size));
            }
            if (i4 < list.size() - 1) {
                i3 = size;
                size /= list.get(i4 + 1).size();
            }
        }
        return arrayList;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\rHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0016Jz\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0013J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b\t\u0010\u0016R\u001a\u0010\n\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b\n\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b\u000b\u0010\u0016R\u001a\u0010\f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b0\u0010\u0016R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b2\u0010\u001eR\u001a\u0010\u000f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b\u000f\u0010\u0016"}, d2 = {"Landroidx/camera/camera2/adapter/SupportedSurfaceCombination$FeatureSettings;", "", "", "cameraMode", "requiredMaxBitDepth", "", "hasVideoCapture", "Landroidx/camera/core/impl/stabilization/VideoStabilization;", "videoStabilization", "isUltraHdrOn", "isHighSpeedOn", "isFeatureComboInvocation", "requiresFeatureComboQuery", "Landroid/util/Range;", "targetFpsRange", "isStrictFpsRequired", "<init>", "(IIZLandroidx/camera/core/impl/stabilization/VideoStabilization;ZZZZLandroid/util/Range;Z)V", "component1", "()I", "component2", "component3", "()Z", "component4", "()Landroidx/camera/core/impl/stabilization/VideoStabilization;", "component5", "component6", "component7", "component8", "component9", "()Landroid/util/Range;", "component10", "copy", "(IIZLandroidx/camera/core/impl/stabilization/VideoStabilization;ZZZZLandroid/util/Range;Z)Landroidx/camera/camera2/adapter/SupportedSurfaceCombination$FeatureSettings;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getCameraMode", "getRequiredMaxBitDepth", "Z", "getHasVideoCapture", "Landroidx/camera/core/impl/stabilization/VideoStabilization;", "getVideoStabilization", "getRequiresFeatureComboQuery", "Landroid/util/Range;", "getTargetFpsRange"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FeatureSettings {
        private final int cameraMode;
        private final boolean hasVideoCapture;
        private final boolean isFeatureComboInvocation;
        private final boolean isHighSpeedOn;
        private final boolean isStrictFpsRequired;
        private final boolean isUltraHdrOn;
        private final int requiredMaxBitDepth;
        private final boolean requiresFeatureComboQuery;
        private final android.util.Range<java.lang.Integer> targetFpsRange;
        private final androidx.camera.core.impl.stabilization.VideoStabilization videoStabilization;

        public FeatureSettings(int i, int i2, boolean z, androidx.camera.core.impl.stabilization.VideoStabilization videoStabilization, boolean z2, boolean z3, boolean z4, boolean z5, android.util.Range<java.lang.Integer> range, boolean z6) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoStabilization, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "");
            this.cameraMode = i;
            this.requiredMaxBitDepth = i2;
            this.hasVideoCapture = z;
            this.videoStabilization = videoStabilization;
            this.isUltraHdrOn = z2;
            this.isHighSpeedOn = z3;
            this.isFeatureComboInvocation = z4;
            this.requiresFeatureComboQuery = z5;
            this.targetFpsRange = range;
            this.isStrictFpsRequired = z6;
        }

        public final int getCameraMode() {
            return this.cameraMode;
        }

        public final int getRequiredMaxBitDepth() {
            return this.requiredMaxBitDepth;
        }

        public final boolean getHasVideoCapture() {
            return this.hasVideoCapture;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ FeatureSettings(int i, int i2, boolean z, androidx.camera.core.impl.stabilization.VideoStabilization videoStabilization, boolean z2, boolean z3, boolean z4, boolean z5, android.util.Range range, boolean z6, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, r6, r7, r8, r9, r10, r11, r12, (i3 & 512) != 0 ? false : z6);
            android.util.Range range2;
            boolean z7 = (i3 & 4) != 0 ? false : z;
            androidx.camera.core.impl.stabilization.VideoStabilization videoStabilization2 = (i3 & 8) != 0 ? androidx.camera.core.impl.stabilization.VideoStabilization.UNSPECIFIED : videoStabilization;
            boolean z8 = (i3 & 16) != 0 ? false : z2;
            boolean z9 = (i3 & 32) != 0 ? false : z3;
            boolean z10 = (i3 & 64) != 0 ? false : z4;
            boolean z11 = (i3 & 128) != 0 ? false : z5;
            if ((i3 & 256) != 0) {
                android.util.Range<java.lang.Integer> range3 = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(range3, "");
                range2 = range3;
            } else {
                range2 = range;
            }
        }

        public final androidx.camera.core.impl.stabilization.VideoStabilization getVideoStabilization() {
            return this.videoStabilization;
        }

        public final boolean isUltraHdrOn() {
            return this.isUltraHdrOn;
        }

        public final boolean isHighSpeedOn() {
            return this.isHighSpeedOn;
        }

        public final boolean isFeatureComboInvocation() {
            return this.isFeatureComboInvocation;
        }

        public final boolean getRequiresFeatureComboQuery() {
            return this.requiresFeatureComboQuery;
        }

        public final android.util.Range<java.lang.Integer> getTargetFpsRange() {
            return this.targetFpsRange;
        }

        public final boolean isStrictFpsRequired() {
            return this.isStrictFpsRequired;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FeatureSettings(cameraMode=");
            sb.append(this.cameraMode);
            sb.append(", requiredMaxBitDepth=");
            sb.append(this.requiredMaxBitDepth);
            sb.append(", hasVideoCapture=");
            sb.append(this.hasVideoCapture);
            sb.append(", videoStabilization=");
            sb.append(this.videoStabilization);
            sb.append(", isUltraHdrOn=");
            sb.append(this.isUltraHdrOn);
            sb.append(", isHighSpeedOn=");
            sb.append(this.isHighSpeedOn);
            sb.append(", isFeatureComboInvocation=");
            sb.append(this.isFeatureComboInvocation);
            sb.append(", requiresFeatureComboQuery=");
            sb.append(this.requiresFeatureComboQuery);
            sb.append(", targetFpsRange=");
            sb.append(this.targetFpsRange);
            sb.append(", isStrictFpsRequired=");
            sb.append(this.isStrictFpsRequired);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((((((((((java.lang.Integer.hashCode(this.cameraMode) * 31) + java.lang.Integer.hashCode(this.requiredMaxBitDepth)) * 31) + java.lang.Boolean.hashCode(this.hasVideoCapture)) * 31) + this.videoStabilization.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isUltraHdrOn)) * 31) + java.lang.Boolean.hashCode(this.isHighSpeedOn)) * 31) + java.lang.Boolean.hashCode(this.isFeatureComboInvocation)) * 31) + java.lang.Boolean.hashCode(this.requiresFeatureComboQuery)) * 31) + this.targetFpsRange.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isStrictFpsRequired);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.camera.camera2.adapter.SupportedSurfaceCombination.FeatureSettings)) {
                return false;
            }
            androidx.camera.camera2.adapter.SupportedSurfaceCombination.FeatureSettings featureSettings = (androidx.camera.camera2.adapter.SupportedSurfaceCombination.FeatureSettings) other;
            return this.cameraMode == featureSettings.cameraMode && this.requiredMaxBitDepth == featureSettings.requiredMaxBitDepth && this.hasVideoCapture == featureSettings.hasVideoCapture && this.videoStabilization == featureSettings.videoStabilization && this.isUltraHdrOn == featureSettings.isUltraHdrOn && this.isHighSpeedOn == featureSettings.isHighSpeedOn && this.isFeatureComboInvocation == featureSettings.isFeatureComboInvocation && this.requiresFeatureComboQuery == featureSettings.requiresFeatureComboQuery && kotlin.jvm.internal.Intrinsics.areEqual(this.targetFpsRange, featureSettings.targetFpsRange) && this.isStrictFpsRequired == featureSettings.isStrictFpsRequired;
        }

        public final androidx.camera.camera2.adapter.SupportedSurfaceCombination.FeatureSettings copy(int cameraMode, int requiredMaxBitDepth, boolean hasVideoCapture, androidx.camera.core.impl.stabilization.VideoStabilization videoStabilization, boolean isUltraHdrOn, boolean isHighSpeedOn, boolean isFeatureComboInvocation, boolean requiresFeatureComboQuery, android.util.Range<java.lang.Integer> targetFpsRange, boolean isStrictFpsRequired) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoStabilization, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetFpsRange, "");
            return new androidx.camera.camera2.adapter.SupportedSurfaceCombination.FeatureSettings(cameraMode, requiredMaxBitDepth, hasVideoCapture, videoStabilization, isUltraHdrOn, isHighSpeedOn, isFeatureComboInvocation, requiresFeatureComboQuery, targetFpsRange, isStrictFpsRequired);
        }

        public final android.util.Range<java.lang.Integer> component9() {
            return this.targetFpsRange;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getRequiresFeatureComboQuery() {
            return this.requiresFeatureComboQuery;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsFeatureComboInvocation() {
            return this.isFeatureComboInvocation;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsHighSpeedOn() {
            return this.isHighSpeedOn;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsUltraHdrOn() {
            return this.isUltraHdrOn;
        }

        /* renamed from: component4, reason: from getter */
        public final androidx.camera.core.impl.stabilization.VideoStabilization getVideoStabilization() {
            return this.videoStabilization;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getHasVideoCapture() {
            return this.hasVideoCapture;
        }

        /* renamed from: component2, reason: from getter */
        public final int getRequiredMaxBitDepth() {
            return this.requiredMaxBitDepth;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getIsStrictFpsRequired() {
            return this.isStrictFpsRequired;
        }

        /* renamed from: component1, reason: from getter */
        public final int getCameraMode() {
            return this.cameraMode;
        }

        public static /* synthetic */ androidx.camera.camera2.adapter.SupportedSurfaceCombination.FeatureSettings copy$default(androidx.camera.camera2.adapter.SupportedSurfaceCombination.FeatureSettings featureSettings, int i, int i2, boolean z, androidx.camera.core.impl.stabilization.VideoStabilization videoStabilization, boolean z2, boolean z3, boolean z4, boolean z5, android.util.Range range, boolean z6, int i3, java.lang.Object obj) {
            return featureSettings.copy((i3 & 1) != 0 ? featureSettings.cameraMode : i, (i3 & 2) != 0 ? featureSettings.requiredMaxBitDepth : i2, (i3 & 4) != 0 ? featureSettings.hasVideoCapture : z, (i3 & 8) != 0 ? featureSettings.videoStabilization : videoStabilization, (i3 & 16) != 0 ? featureSettings.isUltraHdrOn : z2, (i3 & 32) != 0 ? featureSettings.isHighSpeedOn : z3, (i3 & 64) != 0 ? featureSettings.isFeatureComboInvocation : z4, (i3 & 128) != 0 ? featureSettings.requiresFeatureComboQuery : z5, (i3 & 256) != 0 ? featureSettings.targetFpsRange : range, (i3 & 512) != 0 ? featureSettings.isStrictFpsRequired : z6);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010JP\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b\"\u0010\u0010R\u001a\u0010\t\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b#\u0010\u0010"}, d2 = {"Landroidx/camera/camera2/adapter/SupportedSurfaceCombination$BestSizesAndMaxFpsForConfigs;", "", "", "Landroid/util/Size;", "bestSizes", "bestSizesForStreamUseCase", "", "maxFpsForBestSizes", "maxFpsForStreamUseCase", "maxFpsForAllSizes", "<init>", "(Ljava/util/List;Ljava/util/List;III)V", "component1", "()Ljava/util/List;", "component2", "component3", "()I", "component4", "component5", "copy", "(Ljava/util/List;Ljava/util/List;III)Landroidx/camera/camera2/adapter/SupportedSurfaceCombination$BestSizesAndMaxFpsForConfigs;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getBestSizes", "getBestSizesForStreamUseCase", com.visa.cbp.getEncExpo.warmup, "getMaxFpsForBestSizes", "getMaxFpsForStreamUseCase", "getMaxFpsForAllSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BestSizesAndMaxFpsForConfigs {
        private final java.util.List<android.util.Size> bestSizes;
        private final java.util.List<android.util.Size> bestSizesForStreamUseCase;
        private final int maxFpsForAllSizes;
        private final int maxFpsForBestSizes;
        private final int maxFpsForStreamUseCase;

        public BestSizesAndMaxFpsForConfigs(java.util.List<android.util.Size> list, java.util.List<android.util.Size> list2, int i, int i2, int i3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.bestSizes = list;
            this.bestSizesForStreamUseCase = list2;
            this.maxFpsForBestSizes = i;
            this.maxFpsForStreamUseCase = i2;
            this.maxFpsForAllSizes = i3;
        }

        public final java.util.List<android.util.Size> getBestSizes() {
            return this.bestSizes;
        }

        public final java.util.List<android.util.Size> getBestSizesForStreamUseCase() {
            return this.bestSizesForStreamUseCase;
        }

        public final int getMaxFpsForBestSizes() {
            return this.maxFpsForBestSizes;
        }

        public final int getMaxFpsForStreamUseCase() {
            return this.maxFpsForStreamUseCase;
        }

        public final int getMaxFpsForAllSizes() {
            return this.maxFpsForAllSizes;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BestSizesAndMaxFpsForConfigs(bestSizes=");
            sb.append(this.bestSizes);
            sb.append(", bestSizesForStreamUseCase=");
            sb.append(this.bestSizesForStreamUseCase);
            sb.append(", maxFpsForBestSizes=");
            sb.append(this.maxFpsForBestSizes);
            sb.append(", maxFpsForStreamUseCase=");
            sb.append(this.maxFpsForStreamUseCase);
            sb.append(", maxFpsForAllSizes=");
            sb.append(this.maxFpsForAllSizes);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.bestSizes.hashCode();
            java.util.List<android.util.Size> list = this.bestSizesForStreamUseCase;
            return (((((((hashCode * 31) + (list == null ? 0 : list.hashCode())) * 31) + java.lang.Integer.hashCode(this.maxFpsForBestSizes)) * 31) + java.lang.Integer.hashCode(this.maxFpsForStreamUseCase)) * 31) + java.lang.Integer.hashCode(this.maxFpsForAllSizes);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.camera.camera2.adapter.SupportedSurfaceCombination.BestSizesAndMaxFpsForConfigs)) {
                return false;
            }
            androidx.camera.camera2.adapter.SupportedSurfaceCombination.BestSizesAndMaxFpsForConfigs bestSizesAndMaxFpsForConfigs = (androidx.camera.camera2.adapter.SupportedSurfaceCombination.BestSizesAndMaxFpsForConfigs) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.bestSizes, bestSizesAndMaxFpsForConfigs.bestSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.bestSizesForStreamUseCase, bestSizesAndMaxFpsForConfigs.bestSizesForStreamUseCase) && this.maxFpsForBestSizes == bestSizesAndMaxFpsForConfigs.maxFpsForBestSizes && this.maxFpsForStreamUseCase == bestSizesAndMaxFpsForConfigs.maxFpsForStreamUseCase && this.maxFpsForAllSizes == bestSizesAndMaxFpsForConfigs.maxFpsForAllSizes;
        }

        public final androidx.camera.camera2.adapter.SupportedSurfaceCombination.BestSizesAndMaxFpsForConfigs copy(java.util.List<android.util.Size> bestSizes, java.util.List<android.util.Size> bestSizesForStreamUseCase, int maxFpsForBestSizes, int maxFpsForStreamUseCase, int maxFpsForAllSizes) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bestSizes, "");
            return new androidx.camera.camera2.adapter.SupportedSurfaceCombination.BestSizesAndMaxFpsForConfigs(bestSizes, bestSizesForStreamUseCase, maxFpsForBestSizes, maxFpsForStreamUseCase, maxFpsForAllSizes);
        }

        /* renamed from: component5, reason: from getter */
        public final int getMaxFpsForAllSizes() {
            return this.maxFpsForAllSizes;
        }

        /* renamed from: component4, reason: from getter */
        public final int getMaxFpsForStreamUseCase() {
            return this.maxFpsForStreamUseCase;
        }

        /* renamed from: component3, reason: from getter */
        public final int getMaxFpsForBestSizes() {
            return this.maxFpsForBestSizes;
        }

        public final java.util.List<android.util.Size> component2() {
            return this.bestSizesForStreamUseCase;
        }

        public final java.util.List<android.util.Size> component1() {
            return this.bestSizes;
        }

        public static /* synthetic */ androidx.camera.camera2.adapter.SupportedSurfaceCombination.BestSizesAndMaxFpsForConfigs copy$default(androidx.camera.camera2.adapter.SupportedSurfaceCombination.BestSizesAndMaxFpsForConfigs bestSizesAndMaxFpsForConfigs, java.util.List list, java.util.List list2, int i, int i2, int i3, int i4, java.lang.Object obj) {
            if ((i4 & 1) != 0) {
                list = bestSizesAndMaxFpsForConfigs.bestSizes;
            }
            if ((i4 & 2) != 0) {
                list2 = bestSizesAndMaxFpsForConfigs.bestSizesForStreamUseCase;
            }
            java.util.List list3 = list2;
            if ((i4 & 4) != 0) {
                i = bestSizesAndMaxFpsForConfigs.maxFpsForBestSizes;
            }
            int i5 = i;
            if ((i4 & 8) != 0) {
                i2 = bestSizesAndMaxFpsForConfigs.maxFpsForStreamUseCase;
            }
            int i6 = i2;
            if ((i4 & 16) != 0) {
                i3 = bestSizesAndMaxFpsForConfigs.maxFpsForAllSizes;
            }
            return bestSizesAndMaxFpsForConfigs.copy(list, list3, i5, i6, i3);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/camera/camera2/adapter/SupportedSurfaceCombination$CheckingMethod;", "", "<init>", "(Ljava/lang/String;I)V", "WITHOUT_FEATURE_COMBO", "WITH_FEATURE_COMBO", "WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CheckingMethod {
        public static final androidx.camera.camera2.adapter.SupportedSurfaceCombination.CheckingMethod WITHOUT_FEATURE_COMBO;
        public static final androidx.camera.camera2.adapter.SupportedSurfaceCombination.CheckingMethod WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT;
        public static final androidx.camera.camera2.adapter.SupportedSurfaceCombination.CheckingMethod WITH_FEATURE_COMBO;
        private static final /* synthetic */ androidx.camera.camera2.adapter.SupportedSurfaceCombination.CheckingMethod[] getHighSpeedVideoFpsRangesFor;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

        private CheckingMethod(java.lang.String str, int i) {
        }

        static {
            androidx.camera.camera2.adapter.SupportedSurfaceCombination.CheckingMethod checkingMethod = new androidx.camera.camera2.adapter.SupportedSurfaceCombination.CheckingMethod("WITHOUT_FEATURE_COMBO", 0);
            WITHOUT_FEATURE_COMBO = checkingMethod;
            androidx.camera.camera2.adapter.SupportedSurfaceCombination.CheckingMethod checkingMethod2 = new androidx.camera.camera2.adapter.SupportedSurfaceCombination.CheckingMethod("WITH_FEATURE_COMBO", 1);
            WITH_FEATURE_COMBO = checkingMethod2;
            androidx.camera.camera2.adapter.SupportedSurfaceCombination.CheckingMethod checkingMethod3 = new androidx.camera.camera2.adapter.SupportedSurfaceCombination.CheckingMethod("WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT", 2);
            WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT = checkingMethod3;
            androidx.camera.camera2.adapter.SupportedSurfaceCombination.CheckingMethod[] checkingMethodArr = {checkingMethod, checkingMethod2, checkingMethod3};
            getHighSpeedVideoFpsRangesFor = checkingMethodArr;
            getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(checkingMethodArr);
        }

        public static androidx.camera.camera2.adapter.SupportedSurfaceCombination.CheckingMethod[] values() {
            return (androidx.camera.camera2.adapter.SupportedSurfaceCombination.CheckingMethod[]) getHighSpeedVideoFpsRangesFor.clone();
        }

        public static androidx.camera.camera2.adapter.SupportedSurfaceCombination.CheckingMethod valueOf(java.lang.String str) {
            return (androidx.camera.camera2.adapter.SupportedSurfaceCombination.CheckingMethod) java.lang.Enum.valueOf(androidx.camera.camera2.adapter.SupportedSurfaceCombination.CheckingMethod.class, str);
        }

        public static kotlin.enums.EnumEntries<androidx.camera.camera2.adapter.SupportedSurfaceCombination.CheckingMethod> getEntries() {
            return getHighSpeedVideoSizes;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/adapter/SupportedSurfaceCombination$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ boolean access$isUltraHdrOn(androidx.camera.camera2.adapter.SupportedSurfaceCombination.Companion companion, java.util.List list, java.util.Map map) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((androidx.camera.core.impl.AttachedSurfaceInfo) it.next()).getImageFormat() == 4101) {
                    return true;
                }
            }
            java.util.Iterator it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                if (((androidx.camera.core.impl.UseCaseConfig) it2.next()).getInputFormat() == 4101) {
                    return true;
                }
            }
            return false;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final boolean checkSupported(androidx.camera.camera2.adapter.SupportedSurfaceCombination.FeatureSettings featureSettings, java.util.List<androidx.camera.core.impl.SurfaceConfig> surfaceConfigList, java.util.Map<androidx.camera.core.impl.SurfaceConfig, androidx.camera.core.DynamicRange> dynamicRangesBySurfaceConfig, java.util.List<? extends androidx.camera.core.impl.UseCaseConfig<?>> newUseCaseConfigs, java.util.List<java.lang.Integer> useCasesPriorityOrder) {
        java.util.ArrayList arrayList;
        java.util.List<androidx.camera.core.impl.SurfaceCombination> list;
        boolean z;
        char c;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSettings, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surfaceConfigList, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicRangesBySurfaceConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newUseCaseConfigs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCasesPriorityOrder, "");
        boolean z2 = true;
        if (this.getOutputMinFrameDuration.containsKey(featureSettings)) {
            java.util.List<androidx.camera.core.impl.SurfaceCombination> list2 = this.getOutputMinFrameDuration.get(featureSettings);
            kotlin.jvm.internal.Intrinsics.checkNotNull(list2);
            arrayList = list2;
        } else {
            arrayList = new java.util.ArrayList();
            if (featureSettings.getRequiresFeatureComboQuery()) {
                arrayList.addAll(androidx.camera.camera2.adapter.GuaranteedConfigurationsUtil.INSTANCE.getQueryableFcqCombinations$camera_camera2(this.getHighSpeedVideoSizes, featureSettings.getVideoStabilization()));
            } else if (featureSettings.isUltraHdrOn()) {
                if (this.f2670a.isEmpty()) {
                    this.f2670a.addAll(androidx.camera.camera2.adapter.GuaranteedConfigurationsUtil.getUltraHdrSupportedCombinationList());
                }
                if (featureSettings.getCameraMode() == 0) {
                    arrayList.addAll(this.f2670a);
                }
            } else if (featureSettings.isHighSpeedOn()) {
                if (this.getOutputSizeshNQ4ISI.isEmpty() && this.getOutputStallDurationlomOqCM.isHighSpeedSupported()) {
                    this.getOutputSizeshNQ4ISI.clear();
                    android.util.Size maxSize = this.getOutputStallDurationlomOqCM.getMaxSize();
                    if (maxSize != null) {
                        this.getOutputSizeshNQ4ISI.addAll(androidx.camera.camera2.adapter.GuaranteedConfigurationsUtil.generateHighSpeedSupportedCombinationList(maxSize, getUpdatedSurfaceSizeDefinitionByFormat(34)));
                    }
                }
                arrayList.addAll(this.getOutputSizeshNQ4ISI);
            } else if (featureSettings.getRequiredMaxBitDepth() == 8) {
                int cameraMode = featureSettings.getCameraMode();
                if (cameraMode == 1) {
                    arrayList = this.Camera2StreamConfigurationMap;
                } else if (cameraMode == 2) {
                    arrayList.addAll(this._CREATION);
                    arrayList.addAll(this.coroutineBoundary);
                } else {
                    if (featureSettings.getVideoStabilization() == androidx.camera.core.impl.stabilization.VideoStabilization.PREVIEW) {
                        list = this.getValidOutputFormatsForInputhNQ4ISI;
                    } else {
                        list = this.coroutineBoundary;
                    }
                    arrayList.addAll(list);
                }
            } else if (featureSettings.getRequiredMaxBitDepth() == 10 && featureSettings.getCameraMode() == 0) {
                arrayList.addAll(this.accessartificialFrame);
            }
            this.getOutputMinFrameDuration.put(featureSettings, arrayList);
        }
        java.util.List<androidx.camera.core.impl.SurfaceCombination> list3 = arrayList;
        int i = 0;
        if (!(list3 instanceof java.util.Collection) || !list3.isEmpty()) {
            java.util.Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                if (((androidx.camera.core.impl.SurfaceCombination) it.next()).getOrderedSupportedSurfaceConfigList(surfaceConfigList) != null) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z || !featureSettings.getRequiresFeatureComboQuery()) {
            return z;
        }
        androidx.camera.core.impl.SessionConfig.ValidatingBuilder validatingBuilder = new androidx.camera.core.impl.SessionConfig.ValidatingBuilder();
        for (java.lang.Object obj : surfaceConfigList) {
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            androidx.camera.core.impl.SurfaceConfig surfaceConfig = (androidx.camera.core.impl.SurfaceConfig) obj;
            android.util.Size resolution = surfaceConfig.getResolution(getUpdatedSurfaceSizeDefinitionByFormat(surfaceConfig.getImageFormat()));
            androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig = newUseCaseConfigs.get(useCasesPriorityOrder.get(i).intValue());
            androidx.camera.core.featuregroup.impl.FeatureCombinationQuery.Companion companion = androidx.camera.core.featuregroup.impl.FeatureCombinationQuery.INSTANCE;
            androidx.camera.core.DynamicRange dynamicRange = dynamicRangesBySurfaceConfig.get(surfaceConfig);
            if (dynamicRange != null) {
                androidx.camera.core.impl.SessionConfig.Builder createSessionConfigBuilder = companion.createSessionConfigBuilder(useCaseConfig, resolution, dynamicRange);
                android.util.Range<java.lang.Integer> targetFpsRange = featureSettings.getTargetFpsRange();
                if (!(kotlin.jvm.internal.Intrinsics.areEqual(targetFpsRange, androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED) ^ z2)) {
                    targetFpsRange = null;
                }
                if (targetFpsRange == null) {
                    targetFpsRange = androidx.camera.core.featuregroup.impl.feature.FpsRangeFeature.DEFAULT_FPS_RANGE;
                }
                createSessionConfigBuilder.setExpectedFrameRateRange(targetFpsRange);
                if (featureSettings.getVideoStabilization() == androidx.camera.core.impl.stabilization.VideoStabilization.PREVIEW) {
                    c = 2;
                    createSessionConfigBuilder.setPreviewStabilization(2);
                } else {
                    c = 2;
                    if (featureSettings.getVideoStabilization() == androidx.camera.core.impl.stabilization.VideoStabilization.ON) {
                        createSessionConfigBuilder.setVideoStabilization(2);
                    }
                }
                validatingBuilder.add(createSessionConfigBuilder.build());
                boolean isValid = validatingBuilder.isValid();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot create a combined SessionConfig for feature combo after adding ");
                sb.append(useCaseConfig);
                sb.append(" with ");
                sb.append(surfaceConfig);
                sb.append(" due to [");
                sb.append(validatingBuilder.getInvalidReason());
                sb.append("]; surfaceConfigList = ");
                sb.append(surfaceConfigList);
                sb.append(", featureSettings = ");
                sb.append(featureSettings);
                sb.append(", newUseCaseConfigs = ");
                sb.append(newUseCaseConfigs);
                androidx.core.util.Preconditions.checkState(isValid, sb.toString());
                i++;
                z2 = true;
            } else {
                throw new java.lang.IllegalArgumentException("Required value was null.".toString());
            }
        }
        androidx.camera.core.impl.SessionConfig build = validatingBuilder.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        boolean isSupported = this.getOutputFormats.isSupported(build);
        java.util.List<androidx.camera.core.impl.DeferrableSurface> surfaces = build.getSurfaces();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(surfaces, "");
        java.util.Iterator<T> it2 = surfaces.iterator();
        while (it2.hasNext()) {
            ((androidx.camera.core.impl.DeferrableSurface) it2.next()).close();
        }
        return isSupported;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0279, code lost:
    
        if (r25 == androidx.camera.core.impl.stabilization.VideoStabilization.PREVIEW) goto L98;
     */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final androidx.camera.core.impl.SurfaceStreamSpecQueryResult getSuggestedStreamSpecifications(int cameraMode, java.util.List<? extends androidx.camera.core.impl.AttachedSurfaceInfo> attachedSurfaces, java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, ? extends java.util.List<android.util.Size>> newUseCaseConfigsSupportedSizeMap, androidx.camera.core.impl.stabilization.VideoStabilization videoStabilization, boolean hasVideoCapture, boolean isFeatureComboInvocation, boolean findMaxSupportedFrameRate) {
        kotlin.Pair pair;
        int i;
        androidx.camera.camera2.adapter.SupportedSurfaceCombination.CheckingMethod checkingMethod;
        int i2;
        java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, ? extends java.util.List<android.util.Size>> map = newUseCaseConfigsSupportedSizeMap;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attachedSurfaces, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoStabilization, "");
        this.getHighSpeedVideoFpsRangesFor.refreshPreviewSize();
        if (this.surfaceSizeDefinition == null) {
            Camera2StreamConfigurationMap();
        } else {
            androidx.camera.core.impl.SurfaceSizeDefinition create = androidx.camera.core.impl.SurfaceSizeDefinition.create(getSurfaceSizeDefinition$camera_camera2().getAnalysisSize(), getSurfaceSizeDefinition$camera_camera2().getS720pSizeMap(), this.getHighSpeedVideoFpsRangesFor.getPreviewSize(), getSurfaceSizeDefinition$camera_camera2().getS1440pSizeMap(), getSurfaceSizeDefinition$camera_camera2().getRecordSize(), getSurfaceSizeDefinition$camera_camera2().getMaximumSizeMap(), getSurfaceSizeDefinition$camera_camera2().getMaximum4x3SizeMap(), getSurfaceSizeDefinition$camera_camera2().getMaximum16x9SizeMap(), getSurfaceSizeDefinition$camera_camera2().getUltraMaximumSizeMap());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
            setSurfaceSizeDefinition$camera_camera2(create);
        }
        boolean isHighSpeedOn = androidx.camera.camera2.internal.HighSpeedResolver.INSTANCE.isHighSpeedOn(attachedSurfaces, newUseCaseConfigsSupportedSizeMap.keySet());
        if (isHighSpeedOn) {
            map = this.getOutputStallDurationlomOqCM.filterCommonSupportedSizes(map);
        }
        java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, ? extends java.util.List<android.util.Size>> map2 = map;
        java.util.List<? extends androidx.camera.core.impl.UseCaseConfig<?>> list = kotlin.collections.CollectionsKt.toList(map2.keySet());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator<? extends androidx.camera.core.impl.UseCaseConfig<?>> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int surfaceOccupancyPriority = it.next().getSurfaceOccupancyPriority(0);
            if (!arrayList2.contains(java.lang.Integer.valueOf(surfaceOccupancyPriority))) {
                arrayList2.add(java.lang.Integer.valueOf(surfaceOccupancyPriority));
            }
        }
        kotlin.collections.CollectionsKt.sort(arrayList2);
        kotlin.collections.CollectionsKt.reverse(arrayList2);
        java.util.Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            int intValue = ((java.lang.Number) it2.next()).intValue();
            for (androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig : list) {
                if (intValue == useCaseConfig.getSurfaceOccupancyPriority(0)) {
                    arrayList.add(java.lang.Integer.valueOf(list.indexOf(useCaseConfig)));
                }
            }
        }
        java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, androidx.camera.core.DynamicRange> resolveAndValidateDynamicRanges = this.getHighResolutionOutputSizeshNQ4ISI.resolveAndValidateDynamicRanges(attachedSurfaces, list, arrayList);
        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
        }
        boolean access$isUltraHdrOn = androidx.camera.camera2.adapter.SupportedSurfaceCombination.Companion.access$isUltraHdrOn(INSTANCE, attachedSurfaces, map2);
        if (findMaxSupportedFrameRate) {
            pair = kotlin.TuplesKt.to(java.lang.Boolean.FALSE, androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED);
        } else {
            java.util.Iterator<? extends androidx.camera.core.impl.AttachedSurfaceInfo> it3 = attachedSurfaces.iterator();
            java.lang.Boolean bool = null;
            while (it3.hasNext()) {
                boolean isStrictFrameRateRequired = it3.next().isStrictFrameRateRequired();
                if (bool == null || kotlin.jvm.internal.Intrinsics.areEqual(bool, java.lang.Boolean.valueOf(isStrictFrameRateRequired))) {
                    bool = java.lang.Boolean.valueOf(isStrictFrameRateRequired);
                } else {
                    throw new java.lang.IllegalStateException("All isStrictFpsRequired should be the same");
                }
            }
            java.util.Iterator<? extends androidx.camera.core.impl.UseCaseConfig<?>> it4 = list.iterator();
            while (it4.hasNext()) {
                boolean isStrictFrameRateRequired2 = it4.next().isStrictFrameRateRequired();
                if (bool == null || kotlin.jvm.internal.Intrinsics.areEqual(bool, java.lang.Boolean.valueOf(isStrictFrameRateRequired2))) {
                    bool = java.lang.Boolean.valueOf(isStrictFrameRateRequired2);
                } else {
                    throw new java.lang.IllegalStateException("All isStrictFpsRequired should be the same");
                }
            }
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            android.util.Range<java.lang.Integer> range = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(range, "");
            java.util.Iterator<? extends androidx.camera.core.impl.AttachedSurfaceInfo> it5 = attachedSurfaces.iterator();
            while (it5.hasNext()) {
                android.util.Range<java.lang.Integer> targetFrameRate = it5.next().getTargetFrameRate();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(targetFrameRate, "");
                range = getHighSpeedVideoSizes(targetFrameRate, range, booleanValue);
            }
            java.util.Iterator<java.lang.Integer> it6 = arrayList.iterator();
            while (it6.hasNext()) {
                android.util.Range<java.lang.Integer> targetFrameRate2 = list.get(it6.next().intValue()).getTargetFrameRate(androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED);
                kotlin.jvm.internal.Intrinsics.checkNotNull(targetFrameRate2);
                range = getHighSpeedVideoSizes(targetFrameRate2, range, booleanValue);
            }
            pair = kotlin.TuplesKt.to(java.lang.Boolean.valueOf(booleanValue), range);
        }
        boolean booleanValue2 = ((java.lang.Boolean) pair.component1()).booleanValue();
        android.util.Range range2 = (android.util.Range) pair.component2();
        boolean z = videoStabilization == androidx.camera.core.impl.stabilization.VideoStabilization.PREVIEW;
        androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            boolean unused3 = this.isOutputSupportedForhNQ4ISI;
        }
        if (z && !this.isOutputSupportedForhNQ4ISI && isFeatureComboInvocation) {
            throw new java.lang.IllegalArgumentException("Preview stabilization is not supported by the camera.".toString());
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(range2);
        java.util.Iterator<androidx.camera.core.DynamicRange> it7 = resolveAndValidateDynamicRanges.values().iterator();
        while (true) {
            if (!it7.hasNext()) {
                i = 8;
                break;
            }
            if (it7.next().getBitDepth() == 10) {
                i = 10;
                break;
            }
        }
        androidx.camera.camera2.adapter.SupportedSurfaceCombination.FeatureSettings Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(new androidx.camera.camera2.adapter.SupportedSurfaceCombination.FeatureSettings(cameraMode, i, hasVideoCapture, videoStabilization, access$isUltraHdrOn, isHighSpeedOn, isFeatureComboInvocation, false, range2, booleanValue2));
        java.util.Collection<androidx.camera.core.DynamicRange> values = resolveAndValidateDynamicRanges.values();
        if (isFeatureComboInvocation) {
            ?? contains = values.contains(androidx.camera.core.DynamicRange.HLG_10_BIT);
            int i3 = contains;
            if (range2 != null) {
                java.lang.Integer num = (java.lang.Integer) range2.getUpper();
                i3 = contains;
                if (num != null) {
                    i3 = contains;
                    if (num.intValue() == 60) {
                        i3 = contains + 1;
                    }
                }
            }
            if (videoStabilization != androidx.camera.core.impl.stabilization.VideoStabilization.ON) {
                i2 = i3;
            }
            i2 = i3 + 1;
            if (access$isUltraHdrOn) {
                i2++;
            }
            if (i2 > 1) {
                checkingMethod = androidx.camera.camera2.adapter.SupportedSurfaceCombination.CheckingMethod.WITH_FEATURE_COMBO;
            } else if (i2 == 1) {
                checkingMethod = androidx.camera.camera2.adapter.SupportedSurfaceCombination.CheckingMethod.WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT;
            }
            return getHighResolutionOutputSizeshNQ4ISI(checkingMethod, Camera2StreamConfigurationMap, attachedSurfaces, map2, list, arrayList, resolveAndValidateDynamicRanges, findMaxSupportedFrameRate);
        }
        checkingMethod = androidx.camera.camera2.adapter.SupportedSurfaceCombination.CheckingMethod.WITHOUT_FEATURE_COMBO;
        return getHighResolutionOutputSizeshNQ4ISI(checkingMethod, Camera2StreamConfigurationMap, attachedSurfaces, map2, list, arrayList, resolveAndValidateDynamicRanges, findMaxSupportedFrameRate);
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.camera.camera2.adapter.SupportedSurfaceCombination.CheckingMethod.values().length];
            try {
                iArr[androidx.camera.camera2.adapter.SupportedSurfaceCombination.CheckingMethod.WITHOUT_FEATURE_COMBO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.camera.camera2.adapter.SupportedSurfaceCombination.CheckingMethod.WITH_FEATURE_COMBO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.camera.camera2.adapter.SupportedSurfaceCombination.CheckingMethod.WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
