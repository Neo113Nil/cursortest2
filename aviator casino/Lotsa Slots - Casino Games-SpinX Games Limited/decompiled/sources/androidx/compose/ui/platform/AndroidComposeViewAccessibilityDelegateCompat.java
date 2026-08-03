package androidx.compose.ui.platform;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
@kotlin.Metadata(d1 = {"\u0000²\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 ³\u00022\u00020\u00012\u00020\u0002:\u0016±\u0002²\u0002³\u0002´\u0002µ\u0002¶\u0002·\u0002¸\u0002¹\u0002º\u0002»\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J.\u0010~\u001a\u00020\u001c2\u0006\u0010\u007f\u001a\u00020\r2\u0007\u0010\u0080\u0001\u001a\u0002062\u0007\u0010\u0081\u0001\u001a\u00020\u00072\n\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0083\u0001H\u0002J\u0013\u0010\u0084\u0001\u001a\u00030\u0085\u00012\u0007\u0010\u0086\u0001\u001a\u000201H\u0002J\u0013\u0010\u0087\u0001\u001a\u00020\u001cH\u0080@¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001d\u0010\u008a\u0001\u001a\u00020\u001c2\u0007\u0010\u008b\u0001\u001a\u00020\r2\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u001fH\u0002J\u0012\u0010\u008d\u0001\u001a\u00020\u001c2\u0007\u0010\u008b\u0001\u001a\u00020\rH\u0002J1\u0010\u008e\u0001\u001a\u00020\u000f2\u0007\u0010\u008f\u0001\u001a\u00020\u000f2\u0007\u0010\u0090\u0001\u001a\u00020\r2\b\u0010\u0091\u0001\u001a\u00030\u0092\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J@\u0010\u008e\u0001\u001a\u00020\u000f2\r\u0010/\u001a\t\u0012\u0004\u0012\u0002010\u0095\u00012\u0007\u0010\u008f\u0001\u001a\u00020\u000f2\u0007\u0010\u0090\u0001\u001a\u00020\r2\b\u0010\u0091\u0001\u001a\u00030\u0092\u0001H\u0002ø\u0001\u0000¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\t\u0010\u0098\u0001\u001a\u00020\u001cH\u0002J\u0011\u0010\u0099\u0001\u001a\u00020\u000f2\u0006\u0010\u007f\u001a\u00020\rH\u0002J\t\u0010\u009a\u0001\u001a\u00020\u001cH\u0002J\u001a\u0010\u009b\u0001\u001a\u00020\\2\u0006\u0010\u007f\u001a\u00020\r2\u0007\u0010\u009c\u0001\u001a\u00020\rH\u0003J\u0013\u0010\u009d\u0001\u001a\u0004\u0018\u0001062\u0006\u0010\u007f\u001a\u00020\rH\u0002JC\u0010\u009e\u0001\u001a\u00020\\2\u0006\u0010\u007f\u001a\u00020\r2\t\u0010\u009f\u0001\u001a\u0004\u0018\u00010\r2\t\u0010 \u0001\u001a\u0004\u0018\u00010\r2\t\u0010¡\u0001\u001a\u0004\u0018\u00010\r2\t\u0010¢\u0001\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0003\u0010£\u0001J\u0019\u0010¤\u0001\u001a\u00020\u000f2\b\u0010¥\u0001\u001a\u00030¦\u0001H\u0000¢\u0006\u0003\b§\u0001JL\u0010¨\u0001\u001a\u00020\u001c2\b\u0010©\u0001\u001a\u00030ª\u00012\u001b\u0010«\u0001\u001a\u0016\u0012\u0005\u0012\u00030ª\u00010¬\u0001j\n\u0012\u0005\u0012\u00030ª\u0001`\u00ad\u00012\u001a\u0010®\u0001\u001a\u0015\u0012\u0004\u0012\u00020\r\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030ª\u0001080iH\u0002J\u0013\u0010¯\u0001\u001a\u00020Y2\b\u0010°\u0001\u001a\u00030±\u0001H\u0016J\u0013\u0010²\u0001\u001a\u00020\r2\b\u0010\u0086\u0001\u001a\u00030ª\u0001H\u0002J\u0013\u0010³\u0001\u001a\u00020\r2\b\u0010\u0086\u0001\u001a\u00030ª\u0001H\u0002J\u0013\u0010´\u0001\u001a\u00020\u000f2\b\u0010\u0086\u0001\u001a\u00030ª\u0001H\u0002J\u0015\u0010µ\u0001\u001a\u0004\u0018\u00010\u00072\b\u0010\u0086\u0001\u001a\u00030ª\u0001H\u0002J\u0016\u0010¶\u0001\u001a\u0005\u0018\u00010·\u00012\b\u0010\u0086\u0001\u001a\u00030ª\u0001H\u0002J\u0017\u0010¸\u0001\u001a\u0004\u0018\u00010\u00072\n\u0010\u0086\u0001\u001a\u0005\u0018\u00010ª\u0001H\u0002J!\u0010¹\u0001\u001a\u0005\u0018\u00010º\u00012\n\u0010\u0086\u0001\u001a\u0005\u0018\u00010ª\u00012\u0007\u0010»\u0001\u001a\u00020\rH\u0002J\u0016\u0010¼\u0001\u001a\u0005\u0018\u00010½\u00012\b\u0010¾\u0001\u001a\u00030¿\u0001H\u0002J\t\u0010À\u0001\u001a\u00020\u001cH\u0002J#\u0010Á\u0001\u001a\u00020\r2\b\u0010Â\u0001\u001a\u00030Ã\u00012\b\u0010Ä\u0001\u001a\u00030Ã\u0001H\u0001¢\u0006\u0003\bÅ\u0001J\u0012\u0010Æ\u0001\u001a\u00020\u001c2\u0007\u0010Ç\u0001\u001a\u00020\u000fH\u0002J\u0011\u0010È\u0001\u001a\u00020\u000f2\u0006\u0010\u007f\u001a\u00020\rH\u0002J\u0013\u0010É\u0001\u001a\u00020\u000f2\b\u0010\u0086\u0001\u001a\u00030ª\u0001H\u0002J\u0013\u0010Ê\u0001\u001a\u00020\u000f2\b\u0010\u0086\u0001\u001a\u00030ª\u0001H\u0002J\t\u0010Ë\u0001\u001a\u00020\u001cH\u0002J\u0012\u0010Ì\u0001\u001a\u00020\u001c2\u0007\u0010Í\u0001\u001a\u00020uH\u0002J\u000f\u0010Î\u0001\u001a\u00020\u001cH\u0000¢\u0006\u0003\bÏ\u0001J6\u0010Ð\u0001\u001a\u00020\u001c2\b\u0010Ñ\u0001\u001a\u00030Ò\u00012\b\u0010Ó\u0001\u001a\u00030Ô\u00012\u0011\u0010Õ\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010×\u00010Ö\u0001H\u0001¢\u0006\u0003\bØ\u0001J\u000f\u0010Ù\u0001\u001a\u00020\u001cH\u0000¢\u0006\u0003\bÚ\u0001J\u0018\u0010Û\u0001\u001a\u00020\u001c2\u0007\u0010Í\u0001\u001a\u00020uH\u0000¢\u0006\u0003\bÜ\u0001J\u000f\u0010Ý\u0001\u001a\u00020\u001cH\u0000¢\u0006\u0003\bÞ\u0001J\u000f\u0010ß\u0001\u001a\u00020\u001cH\u0000¢\u0006\u0003\bà\u0001J\u0013\u0010Ç\u0001\u001a\u00020\u001c2\b\u0010á\u0001\u001a\u00030â\u0001H\u0016J\u0013\u0010ã\u0001\u001a\u00020\u001c2\b\u0010á\u0001\u001a\u00030â\u0001H\u0016J\"\u0010ä\u0001\u001a\u00020\u001c2\u0011\u0010å\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010ç\u00010æ\u0001H\u0001¢\u0006\u0003\bè\u0001J&\u0010é\u0001\u001a\u00020\u000f2\u0006\u0010\u007f\u001a\u00020\r2\u0007\u0010ê\u0001\u001a\u00020\r2\n\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0083\u0001H\u0002J%\u0010ë\u0001\u001a\u00020\u001c2\u0006\u0010\u007f\u001a\u00020\r2\b\u0010\u0080\u0001\u001a\u00030ì\u00012\b\u0010í\u0001\u001a\u00030ª\u0001H\u0002J!\u0010î\u0001\u001a\u00020\u000f2\u0007\u0010ï\u0001\u001a\u00020\r2\r\u0010ð\u0001\u001a\b\u0012\u0004\u0012\u00020o0;H\u0002J\u0011\u0010ñ\u0001\u001a\u00020\u000f2\u0006\u0010\u007f\u001a\u00020\rH\u0002J\u0012\u0010ò\u0001\u001a\u00020\u001c2\u0007\u0010ó\u0001\u001a\u00020oH\u0002J'\u0010ô\u0001\u001a\u0016\u0012\u0005\u0012\u00030ª\u00010õ\u0001j\n\u0012\u0005\u0012\u00030ª\u0001`ö\u00012\u0007\u0010÷\u0001\u001a\u00020\u000fH\u0082\bJ\u0012\u0010ø\u0001\u001a\u00020\r2\u0007\u0010ï\u0001\u001a\u00020\rH\u0002J\u001c\u0010ù\u0001\u001a\u00020\u001c2\b\u0010ú\u0001\u001a\u00030ª\u00012\u0007\u0010û\u0001\u001a\u00020jH\u0002J\u001c\u0010ü\u0001\u001a\u00020\u001c2\b\u0010ú\u0001\u001a\u00030ª\u00012\u0007\u0010û\u0001\u001a\u00020jH\u0002J\u001b\u0010ý\u0001\u001a\u00020\u001c2\u0007\u0010ï\u0001\u001a\u00020\r2\u0007\u0010þ\u0001\u001a\u00020\u0007H\u0002J\u0012\u0010ÿ\u0001\u001a\u00020\u000f2\u0007\u0010¥\u0001\u001a\u00020\\H\u0002J@\u0010\u0080\u0002\u001a\u00020\u000f2\u0006\u0010\u007f\u001a\u00020\r2\u0007\u0010\u009c\u0001\u001a\u00020\r2\u000b\b\u0002\u0010\u0081\u0002\u001a\u0004\u0018\u00010\r2\u0011\b\u0002\u0010\u0082\u0002\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010;H\u0002¢\u0006\u0003\u0010\u0083\u0002J&\u0010\u0084\u0002\u001a\u00020\u001c2\u0007\u0010\u0085\u0002\u001a\u00020\r2\u0007\u0010\u0081\u0002\u001a\u00020\r2\t\u0010\u0086\u0002\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\u0087\u0002\u001a\u00020\u001c2\u0007\u0010\u0085\u0002\u001a\u00020\rH\u0002J\u001e\u0010\u0088\u0002\u001a\u00020\u001c2\u0013\u0010\u0089\u0002\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020100H\u0002J!\u0010\u008a\u0002\u001a\u00020\u001c2\u0007\u0010Í\u0001\u001a\u00020u2\r\u0010\u008b\u0002\u001a\b\u0012\u0004\u0012\u00020\r0!H\u0002J\u0012\u0010\u008c\u0002\u001a\u00020\u001c2\u0007\u0010Í\u0001\u001a\u00020uH\u0002J.\u0010\u008d\u0002\u001a\u00020\u000f2\b\u0010\u0086\u0001\u001a\u00030ª\u00012\u0007\u0010\u008e\u0002\u001a\u00020\r2\u0007\u0010\u008f\u0002\u001a\u00020\r2\u0007\u0010\u0090\u0002\u001a\u00020\u000fH\u0002J\u001d\u0010\u0091\u0002\u001a\u00020\u001c2\b\u0010\u0086\u0001\u001a\u00030ª\u00012\b\u0010\u0080\u0001\u001a\u00030ì\u0001H\u0002J\u001d\u0010\u0092\u0002\u001a\u00020\u001c2\b\u0010\u0086\u0001\u001a\u00030ª\u00012\b\u0010\u0080\u0001\u001a\u00030ì\u0001H\u0002J\u001d\u0010\u0093\u0002\u001a\u00020\u001c2\b\u0010\u0086\u0001\u001a\u00030ª\u00012\b\u0010\u0080\u0001\u001a\u00030ì\u0001H\u0002J\u001d\u0010\u0094\u0002\u001a\u00020\u001c2\b\u0010\u0086\u0001\u001a\u00030ª\u00012\b\u0010\u0080\u0001\u001a\u00030ì\u0001H\u0002J\t\u0010\u0095\u0002\u001a\u00020\u001cH\u0002J\t\u0010\u0096\u0002\u001a\u00020\u001cH\u0002JT\u0010\u0097\u0002\u001a\t\u0012\u0005\u0012\u00030ª\u0001082\u0007\u0010÷\u0001\u001a\u00020\u000f2\u001b\u0010\u0098\u0002\u001a\u0016\u0012\u0005\u0012\u00030ª\u00010¬\u0001j\n\u0012\u0005\u0012\u00030ª\u0001`\u00ad\u00012\u001c\b\u0002\u0010\u0099\u0002\u001a\u0015\u0012\u0004\u0012\u00020\r\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030ª\u0001080iH\u0002J)\u0010\u009a\u0002\u001a\t\u0012\u0005\u0012\u00030ª\u0001082\u0007\u0010÷\u0001\u001a\u00020\u000f2\u000e\u0010\u009b\u0002\u001a\t\u0012\u0005\u0012\u00030ª\u000108H\u0002J\"\u0010\u009c\u0002\u001a\u0005\u0018\u00010\u009d\u00022\n\u0010\u009e\u0002\u001a\u0005\u0018\u00010ª\u00012\b\u0010\u009f\u0002\u001a\u00030 \u0002H\u0002J.\u0010¡\u0002\u001a\u00020\u000f2\b\u0010\u0086\u0001\u001a\u00030ª\u00012\u0007\u0010»\u0001\u001a\u00020\r2\u0007\u0010¢\u0002\u001a\u00020\u000f2\u0007\u0010£\u0002\u001a\u00020\u000fH\u0002J4\u0010¤\u0002\u001a\u0005\u0018\u0001H¥\u0002\"\t\b\u0000\u0010¥\u0002*\u00020\u00192\n\u0010¢\u0001\u001a\u0005\u0018\u0001H¥\u00022\t\b\u0001\u0010¦\u0002\u001a\u00020\rH\u0002¢\u0006\u0003\u0010§\u0002J\u0013\u0010¨\u0002\u001a\u00020\u001c2\b\u0010\u0086\u0001\u001a\u00030ª\u0001H\u0002J\u0013\u0010©\u0002\u001a\u00020\u001c2\b\u0010\u0086\u0001\u001a\u00030ª\u0001H\u0002J\u0011\u0010ª\u0002\u001a\u00020\u001c2\u0006\u0010\u007f\u001a\u00020\rH\u0002J\t\u0010«\u0002\u001a\u00020\u001cH\u0002J\u0013\u0010¬\u0002\u001a\u00020\u001c2\b\u0010\u0086\u0001\u001a\u00030ª\u0001H\u0002J\u0010\u0010\u00ad\u0002\u001a\u0004\u0018\u00010)*\u00030±\u0001H\u0002J\u0011\u0010®\u0002\u001a\u0005\u0018\u00010¯\u0002*\u00030¿\u0001H\u0002J\u0010\u0010°\u0002\u001a\u0004\u0018\u00010\u001f*\u00030ª\u0001H\u0002R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0007X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010#\u001a\u00020\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0012\"\u0004\b'\u0010\u0014R&\u0010(\u001a\u0004\u0018\u00010)8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b*\u0010%\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u000201008BX\u0082\u000e¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u000e\u00104\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u000106X\u0082\u000e¢\u0006\u0002\n\u0000R2\u00107\u001a&\u0012\f\u0012\n :*\u0004\u0018\u00010909 :*\u0012\u0012\f\u0012\n :*\u0004\u0018\u00010909\u0018\u00010;08X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020=X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020@X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010A\u001a\u00020\r8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bB\u0010%\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR6\u0010G\u001a\u001e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0Hj\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r`IX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR6\u0010N\u001a\u001e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0Hj\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r`IX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010K\"\u0004\bP\u0010MR\u0014\u0010Q\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010\u0012R\u0014\u0010R\u001a\u00020\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bS\u0010\u0012R\u001a\u0010T\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\f\u0012\u0004\bU\u0010%\u001a\u0004\bT\u0010\u0012R\u0014\u0010V\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010\u0012R \u0010W\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\r000\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020YX\u0082\u000e¢\u0006\u0002\n\u0000R0\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020\u000f0[8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b]\u0010%\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u0014\u0010b\u001a\b\u0012\u0004\u0012\u00020\r0!X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010c\u001a\u001e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020d0Hj\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020d`IX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010e\u001a\u0004\u0018\u00010fX\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010g\u001a\u001e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020d0Hj\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020d`IX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010h\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020j0iX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010k\u001a\u00020jX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010l\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010mR\u001a\u0010n\u001a\u000e\u0012\u0004\u0012\u00020o\u0012\u0004\u0012\u00020\u001c0[X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010p\u001a\b\u0012\u0004\u0012\u00020o08X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010q\u001a\u00020rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010s\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010t\u001a\b\u0012\u0004\u0012\u00020u0!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010v\u001a\u00020wX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010x\u001a\u00020yX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010z\u001a\u00020{X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b|\u0010}\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006¼\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "Landroidx/core/view/AccessibilityDelegateCompat;", "Landroidx/lifecycle/DefaultLifecycleObserver;", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroidx/compose/ui/platform/AndroidComposeView;", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "ExtraDataTestTraversalAfterVal", "", "getExtraDataTestTraversalAfterVal$ui_release", "()Ljava/lang/String;", "ExtraDataTestTraversalBeforeVal", "getExtraDataTestTraversalBeforeVal$ui_release", "accessibilityCursorPosition", "", "value", "", "accessibilityForceEnabledForTesting", "getAccessibilityForceEnabledForTesting$ui_release", "()Z", "setAccessibilityForceEnabledForTesting$ui_release", "(Z)V", "accessibilityManager", "Landroid/view/accessibility/AccessibilityManager;", "actionIdToLabel", "Landroidx/collection/SparseArrayCompat;", "", "boundsUpdateChannel", "Lkotlinx/coroutines/channels/Channel;", "", "bufferedContentCaptureAppearedNodes", "Landroidx/collection/ArrayMap;", "Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;", "bufferedContentCaptureDisappearedNodes", "Landroidx/collection/ArraySet;", "checkingForSemanticsChanges", "contentCaptureForceEnabledForTesting", "getContentCaptureForceEnabledForTesting$ui_release$annotations", "()V", "getContentCaptureForceEnabledForTesting$ui_release", "setContentCaptureForceEnabledForTesting$ui_release", "contentCaptureSession", "Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "getContentCaptureSession$ui_release$annotations", "getContentCaptureSession$ui_release", "()Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "setContentCaptureSession$ui_release", "(Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;)V", "currentSemanticsNodes", "", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "getCurrentSemanticsNodes", "()Ljava/util/Map;", "currentSemanticsNodesInvalidated", "currentlyFocusedANI", "Landroid/view/accessibility/AccessibilityNodeInfo;", "enabledServices", "", "Landroid/accessibilityservice/AccessibilityServiceInfo;", "kotlin.jvm.PlatformType", "", "enabledStateListener", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "focusedVirtualViewId", "handler", "Landroid/os/Handler;", "hoveredVirtualViewId", "getHoveredVirtualViewId$ui_release$annotations", "getHoveredVirtualViewId$ui_release", "()I", "setHoveredVirtualViewId$ui_release", "(I)V", "idToAfterMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getIdToAfterMap$ui_release", "()Ljava/util/HashMap;", "setIdToAfterMap$ui_release", "(Ljava/util/HashMap;)V", "idToBeforeMap", "getIdToBeforeMap$ui_release", "setIdToBeforeMap$ui_release", "isEnabled", "isEnabledForAccessibility", "isEnabledForAccessibility$ui_release", "isEnabledForContentCapture", "isEnabledForContentCapture$annotations", "isTouchExplorationEnabled", "labelToActionId", "nodeProvider", "Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "onSendAccessibilityEvent", "Lkotlin/Function1;", "Landroid/view/accessibility/AccessibilityEvent;", "getOnSendAccessibilityEvent$ui_release$annotations", "getOnSendAccessibilityEvent$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnSendAccessibilityEvent$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "paneDisplayed", "pendingHorizontalScrollEvents", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "pendingTextTraversedEvent", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "pendingVerticalScrollEvents", "previousSemanticsNodes", "", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;", "previousSemanticsRoot", "previousTraversedNode", "Ljava/lang/Integer;", "scheduleScrollEventIfNeededLambda", "Landroidx/compose/ui/platform/ScrollObservationScope;", "scrollObservationScopes", "semanticsChangeChecker", "Ljava/lang/Runnable;", "sendingFocusAffectingEvent", "subtreeChangedLayoutNodes", "Landroidx/compose/ui/node/LayoutNode;", "touchExplorationStateListener", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "translateStatus", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$TranslateStatus;", "urlSpanCache", "Landroidx/compose/ui/text/platform/URLSpanCache;", "getView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "addExtraDataToAccessibilityNodeInfoHelper", "virtualViewId", "info", "extraDataKey", "arguments", "Landroid/os/Bundle;", "boundsInScreen", "Landroid/graphics/Rect;", "node", "boundsUpdatesEventLoop", "boundsUpdatesEventLoop$ui_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bufferContentCaptureViewAppeared", "virtualId", "viewStructure", "bufferContentCaptureViewDisappeared", "canScroll", com.helpshift.proactive.InAppViewConstants.ORIENTATION_VERTICAL, "direction", "position", "Landroidx/compose/ui/geometry/Offset;", "canScroll-0AR0LA0$ui_release", "(ZIJ)Z", "", "canScroll-moWRBKg", "(Ljava/util/Collection;ZIJ)Z", "checkForSemanticsChanges", "clearAccessibilityFocus", "clearTranslatedText", "createEvent", "eventType", "createNodeInfo", "createTextSelectionChangedEvent", "fromIndex", "toIndex", "itemCount", "text", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;", "dispatchHoverEvent", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", "dispatchHoverEvent$ui_release", "geometryDepthFirstSearch", "currNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "geometryList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "containerMapToChildren", "getAccessibilityNodeProvider", "host", "Landroid/view/View;", "getAccessibilitySelectionEnd", "getAccessibilitySelectionStart", "getInfoIsCheckable", "getInfoStateDescriptionOrNull", "getInfoText", "Landroid/text/SpannableString;", "getIterableTextForAccessibility", "getIteratorForGranularity", "Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "granularity", "getTextLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "configuration", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "hideTranslatedText", "hitTestSemanticsAt", "x", "", "y", "hitTestSemanticsAt$ui_release", "initContentCapture", "onStart", "isAccessibilityFocused", "isAccessibilitySelectionExtendable", "isScreenReaderFocusable", "notifyContentCaptureChanges", "notifySubtreeAccessibilityStateChangedIfNeeded", "layoutNode", "onClearTranslation", "onClearTranslation$ui_release", "onCreateVirtualViewTranslationRequests", "virtualIds", "", "supportedFormats", "", "requestsCollector", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "onCreateVirtualViewTranslationRequests$ui_release", "onHideTranslation", "onHideTranslation$ui_release", "onLayoutChange", "onLayoutChange$ui_release", "onSemanticsChange", "onSemanticsChange$ui_release", "onShowTranslation", "onShowTranslation$ui_release", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStop", "onVirtualViewTranslationResponses", com.ironsource.Ve.n, "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "onVirtualViewTranslationResponses$ui_release", "performActionHelper", "action", "populateAccessibilityNodeInfoProperties", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "semanticsNode", "registerScrollingId", "id", "oldScrollObservationScopes", "requestAccessibilityFocus", "scheduleScrollEventIfNeeded", "scrollObservationScope", "semanticComparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "layoutIsRtl", "semanticsNodeIdToAccessibilityVirtualNodeId", "sendAccessibilitySemanticsStructureChangeEvents", "newNode", "oldNode", "sendContentCaptureSemanticsStructureChangeEvents", "sendContentCaptureTextUpdateEvent", "newText", "sendEvent", "sendEventForVirtualView", "contentChangeType", "contentDescription", "(IILjava/lang/Integer;Ljava/util/List;)Z", "sendPaneChangeEvents", "semanticsNodeId", "title", "sendPendingTextTraversedAtGranularityEvent", "sendSemanticsPropertyChangeEvents", "newSemanticsNodes", "sendSubtreeChangeAccessibilityEvents", "subtreeChangedSemanticsNodesIds", "sendTypeViewScrolledAccessibilityEvent", "setAccessibilitySelection", "start", "end", "traversalMode", "setContentInvalid", "setIsCheckable", "setStateDescription", "setText", "setTraversalValues", "showTranslatedText", "sortByGeometryGroupings", "parentListToSort", "containerChildrenMapping", "subtreeSortedByGeometryGrouping", "listToSort", "toScreenCoords", "Landroid/graphics/RectF;", "textNode", "bounds", "Landroidx/compose/ui/geometry/Rect;", "traverseAtGranularity", "forward", "extendSelection", "trimToSize", "T", "size", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "updateContentCaptureBuffersOnAppeared", "updateContentCaptureBuffersOnDisappeared", "updateHoveredVirtualView", "updateSemanticsNodesCopyAndPanes", "updateTranslationOnAppeared", "getContentCaptureSessionCompat", "getTextForTextField", "Landroidx/compose/ui/text/AnnotatedString;", "toViewStructure", "Api24Impl", "Api29Impl", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ComposeAccessibilityNodeProvider", "LtrBoundsComparator", "PendingTextTraversedEvent", "RtlBoundsComparator", "SemanticsNodeCopy", "TopBottomBoundsComparator", "TranslateStatus", "ViewTranslationHelperMethodsS", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat extends androidx.core.view.AccessibilityDelegateCompat implements androidx.lifecycle.DefaultLifecycleObserver {
    public static final int AccessibilityCursorPositionUndefined = -1;
    public static final int AccessibilitySliderStepsCount = 20;
    public static final java.lang.String ClassName = "android.view.View";
    public static final java.lang.String ExtraDataIdKey = "androidx.compose.ui.semantics.id";
    public static final java.lang.String ExtraDataTestTagKey = "androidx.compose.ui.semantics.testTag";
    public static final int InvalidId = Integer.MIN_VALUE;
    public static final java.lang.String LogTag = "AccessibilityDelegate";
    public static final int ParcelSafeTextLength = 100000;
    public static final long SendRecurringAccessibilityEventsIntervalMillis = 100;
    public static final java.lang.String TextClassName = "android.widget.TextView";
    public static final java.lang.String TextFieldClassName = "android.widget.EditText";
    public static final long TextTraversedEventTimeoutMillis = 1000;
    private final java.lang.String ExtraDataTestTraversalAfterVal;
    private final java.lang.String ExtraDataTestTraversalBeforeVal;
    private int accessibilityCursorPosition;
    private boolean accessibilityForceEnabledForTesting;
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    private androidx.collection.SparseArrayCompat<androidx.collection.SparseArrayCompat<java.lang.CharSequence>> actionIdToLabel;
    private final kotlinx.coroutines.channels.Channel<kotlin.Unit> boundsUpdateChannel;
    private final androidx.collection.ArrayMap<java.lang.Integer, androidx.compose.ui.platform.coreshims.ViewStructureCompat> bufferedContentCaptureAppearedNodes;
    private final androidx.collection.ArraySet<java.lang.Integer> bufferedContentCaptureDisappearedNodes;
    private boolean checkingForSemanticsChanges;
    private boolean contentCaptureForceEnabledForTesting;
    private androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat contentCaptureSession;
    private java.util.Map<java.lang.Integer, androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds> currentSemanticsNodes;
    private boolean currentSemanticsNodesInvalidated;
    private android.view.accessibility.AccessibilityNodeInfo currentlyFocusedANI;
    private java.util.List<android.accessibilityservice.AccessibilityServiceInfo> enabledServices;
    private final android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener enabledStateListener;
    private int focusedVirtualViewId;
    private final android.os.Handler handler;
    private java.util.HashMap<java.lang.Integer, java.lang.Integer> idToAfterMap;
    private java.util.HashMap<java.lang.Integer, java.lang.Integer> idToBeforeMap;
    private androidx.collection.SparseArrayCompat<java.util.Map<java.lang.CharSequence, java.lang.Integer>> labelToActionId;
    private androidx.core.view.accessibility.AccessibilityNodeProviderCompat nodeProvider;
    private androidx.collection.ArraySet<java.lang.Integer> paneDisplayed;
    private final java.util.HashMap<java.lang.Integer, androidx.compose.ui.semantics.ScrollAxisRange> pendingHorizontalScrollEvents;
    private androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.PendingTextTraversedEvent pendingTextTraversedEvent;
    private final java.util.HashMap<java.lang.Integer, androidx.compose.ui.semantics.ScrollAxisRange> pendingVerticalScrollEvents;
    private java.util.Map<java.lang.Integer, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.SemanticsNodeCopy> previousSemanticsNodes;
    private androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.SemanticsNodeCopy previousSemanticsRoot;
    private java.lang.Integer previousTraversedNode;
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.platform.ScrollObservationScope, kotlin.Unit> scheduleScrollEventIfNeededLambda;
    private final java.util.List<androidx.compose.ui.platform.ScrollObservationScope> scrollObservationScopes;
    private final java.lang.Runnable semanticsChangeChecker;
    private boolean sendingFocusAffectingEvent;
    private final androidx.collection.ArraySet<androidx.compose.ui.node.LayoutNode> subtreeChangedLayoutNodes;
    private final android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateListener;
    private androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.TranslateStatus translateStatus;
    private final androidx.compose.ui.text.platform.URLSpanCache urlSpanCache;
    private final androidx.compose.ui.platform.AndroidComposeView view;
    public static final int $stable = 8;
    private static final int[] AccessibilityActionsResourceIds = {androidx.compose.ui.R.id.accessibility_custom_action_0, androidx.compose.ui.R.id.accessibility_custom_action_1, androidx.compose.ui.R.id.accessibility_custom_action_2, androidx.compose.ui.R.id.accessibility_custom_action_3, androidx.compose.ui.R.id.accessibility_custom_action_4, androidx.compose.ui.R.id.accessibility_custom_action_5, androidx.compose.ui.R.id.accessibility_custom_action_6, androidx.compose.ui.R.id.accessibility_custom_action_7, androidx.compose.ui.R.id.accessibility_custom_action_8, androidx.compose.ui.R.id.accessibility_custom_action_9, androidx.compose.ui.R.id.accessibility_custom_action_10, androidx.compose.ui.R.id.accessibility_custom_action_11, androidx.compose.ui.R.id.accessibility_custom_action_12, androidx.compose.ui.R.id.accessibility_custom_action_13, androidx.compose.ui.R.id.accessibility_custom_action_14, androidx.compose.ui.R.id.accessibility_custom_action_15, androidx.compose.ui.R.id.accessibility_custom_action_16, androidx.compose.ui.R.id.accessibility_custom_action_17, androidx.compose.ui.R.id.accessibility_custom_action_18, androidx.compose.ui.R.id.accessibility_custom_action_19, androidx.compose.ui.R.id.accessibility_custom_action_20, androidx.compose.ui.R.id.accessibility_custom_action_21, androidx.compose.ui.R.id.accessibility_custom_action_22, androidx.compose.ui.R.id.accessibility_custom_action_23, androidx.compose.ui.R.id.accessibility_custom_action_24, androidx.compose.ui.R.id.accessibility_custom_action_25, androidx.compose.ui.R.id.accessibility_custom_action_26, androidx.compose.ui.R.id.accessibility_custom_action_27, androidx.compose.ui.R.id.accessibility_custom_action_28, androidx.compose.ui.R.id.accessibility_custom_action_29, androidx.compose.ui.R.id.accessibility_custom_action_30, androidx.compose.ui.R.id.accessibility_custom_action_31};
    private int hoveredVirtualViewId = Integer.MIN_VALUE;
    private kotlin.jvm.functions.Function1<? super android.view.accessibility.AccessibilityEvent, java.lang.Boolean> onSendAccessibilityEvent = new kotlin.jvm.functions.Function1<android.view.accessibility.AccessibilityEvent, java.lang.Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Boolean invoke(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            return java.lang.Boolean.valueOf(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.this.getView().getParent().requestSendAccessibilityEvent(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.this.getView(), accessibilityEvent));
        }
    };

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$TranslateStatus;", "", "(Ljava/lang/String;I)V", "SHOW_ORIGINAL", "SHOW_TRANSLATED", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private enum TranslateStatus {
        SHOW_ORIGINAL,
        SHOW_TRANSLATED
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.ui.state.ToggleableState.values().length];
            try {
                iArr[androidx.compose.ui.state.ToggleableState.On.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.state.ToggleableState.Off.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.ui.state.ToggleableState.Indeterminate.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void getContentCaptureForceEnabledForTesting$ui_release$annotations() {
    }

    public static /* synthetic */ void getContentCaptureSession$ui_release$annotations() {
    }

    public static /* synthetic */ void getHoveredVirtualViewId$ui_release$annotations() {
    }

    public static /* synthetic */ void getOnSendAccessibilityEvent$ui_release$annotations() {
    }

    private static /* synthetic */ void isEnabledForContentCapture$annotations() {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onCreate(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onDestroy(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onPause(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onResume(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    public final androidx.compose.ui.platform.AndroidComposeView getView() {
        return this.view;
    }

    public AndroidComposeViewAccessibilityDelegateCompat(androidx.compose.ui.platform.AndroidComposeView androidComposeView) {
        this.view = androidComposeView;
        java.lang.Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) systemService;
        this.accessibilityManager = accessibilityManager;
        this.enabledStateListener = new android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$$ExternalSyntheticLambda0
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.enabledStateListener$lambda$0(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.this, z);
            }
        };
        this.touchExplorationStateListener = new android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$$ExternalSyntheticLambda1
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener$lambda$1(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.this, z);
            }
        };
        this.enabledServices = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.translateStatus = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.TranslateStatus.SHOW_ORIGINAL;
        this.handler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.nodeProvider = new androidx.core.view.accessibility.AccessibilityNodeProviderCompat(new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.ComposeAccessibilityNodeProvider());
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.pendingHorizontalScrollEvents = new java.util.HashMap<>();
        this.pendingVerticalScrollEvents = new java.util.HashMap<>();
        this.actionIdToLabel = new androidx.collection.SparseArrayCompat<>(0, 1, null);
        this.labelToActionId = new androidx.collection.SparseArrayCompat<>(0, 1, null);
        this.accessibilityCursorPosition = -1;
        this.subtreeChangedLayoutNodes = new androidx.collection.ArraySet<>(0, 1, null);
        this.boundsUpdateChannel = kotlinx.coroutines.channels.ChannelKt.Channel$default(1, null, null, 6, null);
        this.currentSemanticsNodesInvalidated = true;
        this.bufferedContentCaptureAppearedNodes = new androidx.collection.ArrayMap<>();
        this.bufferedContentCaptureDisappearedNodes = new androidx.collection.ArraySet<>(0, 1, null);
        this.currentSemanticsNodes = kotlin.collections.MapsKt.emptyMap();
        this.paneDisplayed = new androidx.collection.ArraySet<>(0, 1, null);
        this.idToBeforeMap = new java.util.HashMap<>();
        this.idToAfterMap = new java.util.HashMap<>();
        this.ExtraDataTestTraversalBeforeVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.ExtraDataTestTraversalAfterVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.urlSpanCache = new androidx.compose.ui.text.platform.URLSpanCache();
        this.previousSemanticsNodes = new java.util.LinkedHashMap();
        this.previousSemanticsRoot = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.SemanticsNodeCopy(androidComposeView.getSemanticsOwner().getUnmergedRootSemanticsNode(), kotlin.collections.MapsKt.emptyMap());
        androidComposeView.addOnAttachStateChangeListener(new android.view.View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(android.view.View view) {
                android.view.accessibility.AccessibilityManager accessibilityManager2 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.this.accessibilityManager;
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.this;
                accessibilityManager2.addAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.enabledStateListener);
                accessibilityManager2.addTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener);
                if (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.this.getContentCaptureForceEnabledForTesting()) {
                    return;
                }
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.this;
                androidComposeViewAccessibilityDelegateCompat2.setContentCaptureSession$ui_release(androidComposeViewAccessibilityDelegateCompat2.getContentCaptureSessionCompat(view));
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(android.view.View view) {
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.this.handler.removeCallbacks(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.this.semanticsChangeChecker);
                android.view.accessibility.AccessibilityManager accessibilityManager2 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.this.accessibilityManager;
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.this;
                accessibilityManager2.removeAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.enabledStateListener);
                accessibilityManager2.removeTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener);
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.this.setContentCaptureSession$ui_release(null);
            }
        });
        this.semanticsChangeChecker = new java.lang.Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticsChangeChecker$lambda$46(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.this);
            }
        };
        this.scrollObservationScopes = new java.util.ArrayList();
        this.scheduleScrollEventIfNeededLambda = new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.ScrollObservationScope, kotlin.Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.ScrollObservationScope scrollObservationScope) {
                invoke2(scrollObservationScope);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.ScrollObservationScope scrollObservationScope) {
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.this.scheduleScrollEventIfNeeded(scrollObservationScope);
            }
        };
    }

    /* renamed from: getHoveredVirtualViewId$ui_release, reason: from getter */
    public final int getHoveredVirtualViewId() {
        return this.hoveredVirtualViewId;
    }

    public final void setHoveredVirtualViewId$ui_release(int i) {
        this.hoveredVirtualViewId = i;
    }

    public final kotlin.jvm.functions.Function1<android.view.accessibility.AccessibilityEvent, java.lang.Boolean> getOnSendAccessibilityEvent$ui_release() {
        return this.onSendAccessibilityEvent;
    }

    public final void setOnSendAccessibilityEvent$ui_release(kotlin.jvm.functions.Function1<? super android.view.accessibility.AccessibilityEvent, java.lang.Boolean> function1) {
        this.onSendAccessibilityEvent = function1;
    }

    /* renamed from: getAccessibilityForceEnabledForTesting$ui_release, reason: from getter */
    public final boolean getAccessibilityForceEnabledForTesting() {
        return this.accessibilityForceEnabledForTesting;
    }

    public final void setAccessibilityForceEnabledForTesting$ui_release(boolean z) {
        this.accessibilityForceEnabledForTesting = z;
        this.currentSemanticsNodesInvalidated = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enabledStateListener$lambda$0(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z) {
        java.util.List<android.accessibilityservice.AccessibilityServiceInfo> emptyList;
        if (z) {
            emptyList = androidComposeViewAccessibilityDelegateCompat.accessibilityManager.getEnabledAccessibilityServiceList(-1);
        } else {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        androidComposeViewAccessibilityDelegateCompat.enabledServices = emptyList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void touchExplorationStateListener$lambda$1(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z) {
        androidComposeViewAccessibilityDelegateCompat.enabledServices = androidComposeViewAccessibilityDelegateCompat.accessibilityManager.getEnabledAccessibilityServiceList(-1);
    }

    private final boolean isEnabled() {
        return isEnabledForAccessibility$ui_release() || isEnabledForContentCapture();
    }

    public final boolean isEnabledForAccessibility$ui_release() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.accessibilityManager.isEnabled() && (this.enabledServices.isEmpty() ^ true);
    }

    private final boolean isEnabledForContentCapture() {
        return !androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.getDisableContentCapture() && (this.contentCaptureSession != null || this.contentCaptureForceEnabledForTesting);
    }

    private final boolean isTouchExplorationEnabled() {
        return this.accessibilityForceEnabledForTesting || (this.accessibilityManager.isEnabled() && this.accessibilityManager.isTouchExplorationEnabled());
    }

    /* renamed from: getContentCaptureForceEnabledForTesting$ui_release, reason: from getter */
    public final boolean getContentCaptureForceEnabledForTesting() {
        return this.contentCaptureForceEnabledForTesting;
    }

    public final void setContentCaptureForceEnabledForTesting$ui_release(boolean z) {
        this.contentCaptureForceEnabledForTesting = z;
    }

    /* renamed from: getContentCaptureSession$ui_release, reason: from getter */
    public final androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat getContentCaptureSession() {
        return this.contentCaptureSession;
    }

    public final void setContentCaptureSession$ui_release(androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat contentCaptureSessionCompat) {
        this.contentCaptureSession = contentCaptureSessionCompat;
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "", "node", "Landroidx/compose/ui/semantics/SemanticsNode;", "action", "", "granularity", "fromIndex", "toIndex", "traverseTime", "", "(Landroidx/compose/ui/semantics/SemanticsNode;IIIIJ)V", "getAction", "()I", "getFromIndex", "getGranularity", "getNode", "()Landroidx/compose/ui/semantics/SemanticsNode;", "getToIndex", "getTraverseTime", "()J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class PendingTextTraversedEvent {
        private final int action;
        private final int fromIndex;
        private final int granularity;
        private final androidx.compose.ui.semantics.SemanticsNode node;
        private final int toIndex;
        private final long traverseTime;

        public PendingTextTraversedEvent(androidx.compose.ui.semantics.SemanticsNode semanticsNode, int i, int i2, int i3, int i4, long j) {
            this.node = semanticsNode;
            this.action = i;
            this.granularity = i2;
            this.fromIndex = i3;
            this.toIndex = i4;
            this.traverseTime = j;
        }

        public final androidx.compose.ui.semantics.SemanticsNode getNode() {
            return this.node;
        }

        public final int getAction() {
            return this.action;
        }

        public final int getGranularity() {
            return this.granularity;
        }

        public final int getFromIndex() {
            return this.fromIndex;
        }

        public final int getToIndex() {
            return this.toIndex;
        }

        public final long getTraverseTime() {
            return this.traverseTime;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.Map<java.lang.Integer, androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds> getCurrentSemanticsNodes() {
        java.util.Map<java.lang.Integer, androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds> allUncoveredSemanticsNodesToMap;
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            allUncoveredSemanticsNodesToMap = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.getAllUncoveredSemanticsNodesToMap(this.view.getSemanticsOwner());
            this.currentSemanticsNodes = allUncoveredSemanticsNodesToMap;
            if (isEnabledForAccessibility$ui_release()) {
                setTraversalValues();
            }
        }
        return this.currentSemanticsNodes;
    }

    public final java.util.HashMap<java.lang.Integer, java.lang.Integer> getIdToBeforeMap$ui_release() {
        return this.idToBeforeMap;
    }

    public final void setIdToBeforeMap$ui_release(java.util.HashMap<java.lang.Integer, java.lang.Integer> hashMap) {
        this.idToBeforeMap = hashMap;
    }

    public final java.util.HashMap<java.lang.Integer, java.lang.Integer> getIdToAfterMap$ui_release() {
        return this.idToAfterMap;
    }

    public final void setIdToAfterMap$ui_release(java.util.HashMap<java.lang.Integer, java.lang.Integer> hashMap) {
        this.idToAfterMap = hashMap;
    }

    /* renamed from: getExtraDataTestTraversalBeforeVal$ui_release, reason: from getter */
    public final java.lang.String getExtraDataTestTraversalBeforeVal() {
        return this.ExtraDataTestTraversalBeforeVal;
    }

    /* renamed from: getExtraDataTestTraversalAfterVal$ui_release, reason: from getter */
    public final java.lang.String getExtraDataTestTraversalAfterVal() {
        return this.ExtraDataTestTraversalAfterVal;
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u0006\u0010\u0013\u001a\u00020\u0014R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;", "", "semanticsNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "currentSemanticsNodes", "", "", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "(Landroidx/compose/ui/semantics/SemanticsNode;Ljava/util/Map;)V", com.helpshift.proactive.InAppViewConstants.CHILDREN, "", "getChildren", "()Ljava/util/Set;", "getSemanticsNode", "()Landroidx/compose/ui/semantics/SemanticsNode;", "unmergedConfig", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getUnmergedConfig", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "hasPaneTitle", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class SemanticsNodeCopy {
        private final java.util.Set<java.lang.Integer> children = new java.util.LinkedHashSet();
        private final androidx.compose.ui.semantics.SemanticsNode semanticsNode;
        private final androidx.compose.ui.semantics.SemanticsConfiguration unmergedConfig;

        public SemanticsNodeCopy(androidx.compose.ui.semantics.SemanticsNode semanticsNode, java.util.Map<java.lang.Integer, androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds> map) {
            this.semanticsNode = semanticsNode;
            this.unmergedConfig = semanticsNode.getUnmergedConfig();
            java.util.List<androidx.compose.ui.semantics.SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i = 0; i < size; i++) {
                androidx.compose.ui.semantics.SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i);
                if (map.containsKey(java.lang.Integer.valueOf(semanticsNode2.getId()))) {
                    this.children.add(java.lang.Integer.valueOf(semanticsNode2.getId()));
                }
            }
        }

        public final androidx.compose.ui.semantics.SemanticsNode getSemanticsNode() {
            return this.semanticsNode;
        }

        public final androidx.compose.ui.semantics.SemanticsConfiguration getUnmergedConfig() {
            return this.unmergedConfig;
        }

        public final java.util.Set<java.lang.Integer> getChildren() {
            return this.children;
        }

        public final boolean hasPaneTitle() {
            return this.unmergedConfig.contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getPaneTitle());
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(androidx.lifecycle.LifecycleOwner owner) {
        initContentCapture(true);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(androidx.lifecycle.LifecycleOwner owner) {
        initContentCapture(false);
    }

    /* renamed from: canScroll-0AR0LA0$ui_release, reason: not valid java name */
    public final boolean m3705canScroll0AR0LA0$ui_release(boolean vertical, int direction, long position) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(android.os.Looper.getMainLooper().getThread(), java.lang.Thread.currentThread())) {
            return m3704canScrollmoWRBKg(getCurrentSemanticsNodes().values(), vertical, direction, position);
        }
        return false;
    }

    /* renamed from: canScroll-moWRBKg, reason: not valid java name */
    private final boolean m3704canScrollmoWRBKg(java.util.Collection<androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds> currentSemanticsNodes, boolean vertical, int direction, long position) {
        androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.ScrollAxisRange> horizontalScrollAxisRange;
        androidx.compose.ui.semantics.ScrollAxisRange scrollAxisRange;
        if (androidx.compose.ui.geometry.Offset.m1868equalsimpl0(position, androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0()) || !androidx.compose.ui.geometry.Offset.m1874isValidimpl(position)) {
            return false;
        }
        if (vertical) {
            horizontalScrollAxisRange = androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getVerticalScrollAxisRange();
        } else if (!vertical) {
            horizontalScrollAxisRange = androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange();
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.util.Collection<androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds> collection = currentSemanticsNodes;
        if ((collection instanceof java.util.Collection) && collection.isEmpty()) {
            return false;
        }
        for (androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds : collection) {
            if (androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(semanticsNodeWithAdjustedBounds.getAdjustedBounds()).m1897containsk4lQ0M(position) && (scrollAxisRange = (androidx.compose.ui.semantics.ScrollAxisRange) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNodeWithAdjustedBounds.getSemanticsNode().getConfig(), horizontalScrollAxisRange)) != null) {
                int i = scrollAxisRange.getReverseScrolling() ? -direction : direction;
                if (!(direction == 0 && scrollAxisRange.getReverseScrolling()) && i >= 0) {
                    if (scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue()) {
                        return true;
                    }
                } else if (scrollAxisRange.getValue().invoke().floatValue() > 0.0f) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final android.view.accessibility.AccessibilityNodeInfo createNodeInfo(int virtualViewId) {
        androidx.lifecycle.LifecycleOwner lifecycleOwner;
        androidx.lifecycle.Lifecycle lifecycle;
        androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners viewTreeOwners = this.view.getViewTreeOwners();
        if (((viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) ? null : lifecycle.getState()) == androidx.lifecycle.Lifecycle.State.DESTROYED) {
            return null;
        }
        androidx.core.view.accessibility.AccessibilityNodeInfoCompat obtain = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.obtain();
        androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(java.lang.Integer.valueOf(virtualViewId));
        if (semanticsNodeWithAdjustedBounds == null) {
            return null;
        }
        androidx.compose.ui.semantics.SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode();
        if (virtualViewId == -1) {
            android.view.ViewParent parentForAccessibility = androidx.core.view.ViewCompat.getParentForAccessibility(this.view);
            obtain.setParent(parentForAccessibility instanceof android.view.View ? (android.view.View) parentForAccessibility : null);
        } else {
            androidx.compose.ui.semantics.SemanticsNode parent = semanticsNode.getParent();
            java.lang.Integer valueOf = parent != null ? java.lang.Integer.valueOf(parent.getId()) : null;
            if (valueOf == null) {
                throw new java.lang.IllegalStateException(("semanticsNode " + virtualViewId + " has null parent").toString());
            }
            int intValue = valueOf.intValue();
            obtain.setParent(this.view, intValue != this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId() ? intValue : -1);
        }
        obtain.setSource(this.view, virtualViewId);
        obtain.setBoundsInScreen(boundsInScreen(semanticsNodeWithAdjustedBounds));
        populateAccessibilityNodeInfoProperties(virtualViewId, obtain, semanticsNode);
        return obtain.unwrap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.graphics.Rect boundsInScreen(androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds node) {
        android.graphics.Rect adjustedBounds = node.getAdjustedBounds();
        long mo3358localToScreenMKHz9U = this.view.mo3358localToScreenMKHz9U(androidx.compose.ui.geometry.OffsetKt.Offset(adjustedBounds.left, adjustedBounds.top));
        long mo3358localToScreenMKHz9U2 = this.view.mo3358localToScreenMKHz9U(androidx.compose.ui.geometry.OffsetKt.Offset(adjustedBounds.right, adjustedBounds.bottom));
        return new android.graphics.Rect((int) java.lang.Math.floor(androidx.compose.ui.geometry.Offset.m1871getXimpl(mo3358localToScreenMKHz9U)), (int) java.lang.Math.floor(androidx.compose.ui.geometry.Offset.m1872getYimpl(mo3358localToScreenMKHz9U)), (int) java.lang.Math.ceil(androidx.compose.ui.geometry.Offset.m1871getXimpl(mo3358localToScreenMKHz9U2)), (int) java.lang.Math.ceil(androidx.compose.ui.geometry.Offset.m1872getYimpl(mo3358localToScreenMKHz9U2)));
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u000026\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00020\u0001j\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002`\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0007J<\u0010\b\u001a\u00020\t2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$TopBottomBoundsComparator;", "Ljava/util/Comparator;", "Lkotlin/Pair;", "Landroidx/compose/ui/geometry/Rect;", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "Lkotlin/Comparator;", "()V", "compare", "", "a", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class TopBottomBoundsComparator implements java.util.Comparator<kotlin.Pair<? extends androidx.compose.ui.geometry.Rect, ? extends java.util.List<androidx.compose.ui.semantics.SemanticsNode>>> {
        public static final androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.TopBottomBoundsComparator INSTANCE = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.TopBottomBoundsComparator();

        private TopBottomBoundsComparator() {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(kotlin.Pair<? extends androidx.compose.ui.geometry.Rect, ? extends java.util.List<androidx.compose.ui.semantics.SemanticsNode>> pair, kotlin.Pair<? extends androidx.compose.ui.geometry.Rect, ? extends java.util.List<androidx.compose.ui.semantics.SemanticsNode>> pair2) {
            return compare2((kotlin.Pair<androidx.compose.ui.geometry.Rect, ? extends java.util.List<androidx.compose.ui.semantics.SemanticsNode>>) pair, (kotlin.Pair<androidx.compose.ui.geometry.Rect, ? extends java.util.List<androidx.compose.ui.semantics.SemanticsNode>>) pair2);
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(kotlin.Pair<androidx.compose.ui.geometry.Rect, ? extends java.util.List<androidx.compose.ui.semantics.SemanticsNode>> a2, kotlin.Pair<androidx.compose.ui.geometry.Rect, ? extends java.util.List<androidx.compose.ui.semantics.SemanticsNode>> b) {
            int compare = java.lang.Float.compare(a2.getFirst().getTop(), b.getFirst().getTop());
            return compare != 0 ? compare : java.lang.Float.compare(a2.getFirst().getBottom(), b.getFirst().getBottom());
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$LtrBoundsComparator;", "Ljava/util/Comparator;", "Landroidx/compose/ui/semantics/SemanticsNode;", "Lkotlin/Comparator;", "()V", "compare", "", "a", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class LtrBoundsComparator implements java.util.Comparator<androidx.compose.ui.semantics.SemanticsNode> {
        public static final androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.LtrBoundsComparator INSTANCE = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.LtrBoundsComparator();

        private LtrBoundsComparator() {
        }

        @Override // java.util.Comparator
        public int compare(androidx.compose.ui.semantics.SemanticsNode a2, androidx.compose.ui.semantics.SemanticsNode b) {
            androidx.compose.ui.geometry.Rect boundsInWindow = a2.getBoundsInWindow();
            androidx.compose.ui.geometry.Rect boundsInWindow2 = b.getBoundsInWindow();
            int compare = java.lang.Float.compare(boundsInWindow.getLeft(), boundsInWindow2.getLeft());
            if (compare != 0) {
                return compare;
            }
            int compare2 = java.lang.Float.compare(boundsInWindow.getTop(), boundsInWindow2.getTop());
            if (compare2 != 0) {
                return compare2;
            }
            int compare3 = java.lang.Float.compare(boundsInWindow.getBottom(), boundsInWindow2.getBottom());
            return compare3 != 0 ? compare3 : java.lang.Float.compare(boundsInWindow.getRight(), boundsInWindow2.getRight());
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$RtlBoundsComparator;", "Ljava/util/Comparator;", "Landroidx/compose/ui/semantics/SemanticsNode;", "Lkotlin/Comparator;", "()V", "compare", "", "a", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class RtlBoundsComparator implements java.util.Comparator<androidx.compose.ui.semantics.SemanticsNode> {
        public static final androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.RtlBoundsComparator INSTANCE = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.RtlBoundsComparator();

        private RtlBoundsComparator() {
        }

        @Override // java.util.Comparator
        public int compare(androidx.compose.ui.semantics.SemanticsNode a2, androidx.compose.ui.semantics.SemanticsNode b) {
            androidx.compose.ui.geometry.Rect boundsInWindow = a2.getBoundsInWindow();
            androidx.compose.ui.geometry.Rect boundsInWindow2 = b.getBoundsInWindow();
            int compare = java.lang.Float.compare(boundsInWindow2.getRight(), boundsInWindow.getRight());
            if (compare != 0) {
                return compare;
            }
            int compare2 = java.lang.Float.compare(boundsInWindow.getTop(), boundsInWindow2.getTop());
            if (compare2 != 0) {
                return compare2;
            }
            int compare3 = java.lang.Float.compare(boundsInWindow.getBottom(), boundsInWindow2.getBottom());
            return compare3 != 0 ? compare3 : java.lang.Float.compare(boundsInWindow2.getLeft(), boundsInWindow.getLeft());
        }
    }

    private final java.util.Comparator<androidx.compose.ui.semantics.SemanticsNode> semanticComparator(boolean layoutIsRtl) {
        return new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$2(new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$1(layoutIsRtl ? androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.RtlBoundsComparator.INSTANCE : androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.LtrBoundsComparator.INSTANCE, androidx.compose.ui.node.LayoutNode.INSTANCE.getZComparator$ui_release()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ java.util.List sortByGeometryGroupings$default(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z, java.util.ArrayList arrayList, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            map = new java.util.LinkedHashMap();
        }
        return androidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings(z, arrayList, map);
    }

    private final java.util.List<androidx.compose.ui.semantics.SemanticsNode> sortByGeometryGroupings(boolean layoutIsRtl, java.util.ArrayList<androidx.compose.ui.semantics.SemanticsNode> parentListToSort, java.util.Map<java.lang.Integer, java.util.List<androidx.compose.ui.semantics.SemanticsNode>> containerChildrenMapping) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(parentListToSort);
        int i = 0;
        if (lastIndex >= 0) {
            int i2 = 0;
            while (true) {
                androidx.compose.ui.semantics.SemanticsNode semanticsNode = parentListToSort.get(i2);
                if (i2 == 0 || !sortByGeometryGroupings$placedEntryRowOverlaps(arrayList, semanticsNode)) {
                    arrayList.add(new kotlin.Pair(semanticsNode.getBoundsInWindow(), kotlin.collections.CollectionsKt.mutableListOf(semanticsNode)));
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        kotlin.collections.CollectionsKt.sortWith(arrayList2, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.TopBottomBoundsComparator.INSTANCE);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            kotlin.Pair pair = (kotlin.Pair) arrayList2.get(i3);
            kotlin.collections.CollectionsKt.sortWith((java.util.List) pair.getSecond(), new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$2(new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$1(layoutIsRtl ? androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.RtlBoundsComparator.INSTANCE : androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.LtrBoundsComparator.INSTANCE, androidx.compose.ui.node.LayoutNode.INSTANCE.getZComparator$ui_release())));
            arrayList3.addAll((java.util.Collection) pair.getSecond());
        }
        java.util.ArrayList arrayList4 = arrayList3;
        final androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2 androidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2 = new kotlin.jvm.functions.Function2<androidx.compose.ui.semantics.SemanticsNode, androidx.compose.ui.semantics.SemanticsNode, java.lang.Integer>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Integer invoke(androidx.compose.ui.semantics.SemanticsNode semanticsNode2, androidx.compose.ui.semantics.SemanticsNode semanticsNode3) {
                return java.lang.Integer.valueOf(java.lang.Float.compare(((java.lang.Number) semanticsNode2.getConfig().getOrElse(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTraversalIndex(), androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$traversalIndex$1.INSTANCE)).floatValue(), ((java.lang.Number) semanticsNode3.getConfig().getOrElse(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTraversalIndex(), androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$traversalIndex$1.INSTANCE)).floatValue()));
            }
        };
        kotlin.collections.CollectionsKt.sortWith(arrayList4, new java.util.Comparator() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$$ExternalSyntheticLambda3
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                int sortByGeometryGroupings$lambda$7;
                sortByGeometryGroupings$lambda$7 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings$lambda$7(kotlin.jvm.functions.Function2.this, obj, obj2);
                return sortByGeometryGroupings$lambda$7;
            }
        });
        while (i <= kotlin.collections.CollectionsKt.getLastIndex(arrayList4)) {
            java.util.List<androidx.compose.ui.semantics.SemanticsNode> list = containerChildrenMapping.get(java.lang.Integer.valueOf(((androidx.compose.ui.semantics.SemanticsNode) arrayList3.get(i)).getId()));
            if (list != null) {
                if (isScreenReaderFocusable((androidx.compose.ui.semantics.SemanticsNode) arrayList3.get(i))) {
                    i++;
                } else {
                    arrayList3.remove(i);
                }
                arrayList3.addAll(i, list);
                i += list.size();
            } else {
                i++;
            }
        }
        return arrayList4;
    }

    private static final boolean sortByGeometryGroupings$placedEntryRowOverlaps(java.util.ArrayList<kotlin.Pair<androidx.compose.ui.geometry.Rect, java.util.List<androidx.compose.ui.semantics.SemanticsNode>>> arrayList, androidx.compose.ui.semantics.SemanticsNode semanticsNode) {
        float top = semanticsNode.getBoundsInWindow().getTop();
        float bottom = semanticsNode.getBoundsInWindow().getBottom();
        boolean z = top >= bottom;
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(arrayList);
        if (lastIndex >= 0) {
            int i = 0;
            while (true) {
                androidx.compose.ui.geometry.Rect first = arrayList.get(i).getFirst();
                boolean z2 = first.getTop() >= first.getBottom();
                if (!z && !z2 && java.lang.Math.max(top, first.getTop()) < java.lang.Math.min(bottom, first.getBottom())) {
                    arrayList.set(i, new kotlin.Pair<>(first.intersect(0.0f, top, Float.POSITIVE_INFINITY, bottom), arrayList.get(i).getSecond()));
                    arrayList.get(i).getSecond().add(semanticsNode);
                    return true;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortByGeometryGroupings$lambda$7(kotlin.jvm.functions.Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        return ((java.lang.Number) function2.invoke(obj, obj2)).intValue();
    }

    private final java.util.List<androidx.compose.ui.semantics.SemanticsNode> subtreeSortedByGeometryGrouping(boolean layoutIsRtl, java.util.List<androidx.compose.ui.semantics.SemanticsNode> listToSort) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.ArrayList<androidx.compose.ui.semantics.SemanticsNode> arrayList = new java.util.ArrayList<>();
        int size = listToSort.size();
        for (int i = 0; i < size; i++) {
            geometryDepthFirstSearch(listToSort.get(i), arrayList, linkedHashMap);
        }
        return sortByGeometryGroupings(layoutIsRtl, arrayList, linkedHashMap);
    }

    private final void setTraversalValues() {
        this.idToBeforeMap.clear();
        this.idToAfterMap.clear();
        androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(-1);
        androidx.compose.ui.semantics.SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
        kotlin.jvm.internal.Intrinsics.checkNotNull(semanticsNode);
        int i = 1;
        java.util.List<androidx.compose.ui.semantics.SemanticsNode> subtreeSortedByGeometryGrouping = subtreeSortedByGeometryGrouping(semanticsNode.getLayoutInfo().getLayoutDirection() == androidx.compose.ui.unit.LayoutDirection.Rtl, kotlin.collections.CollectionsKt.mutableListOf(semanticsNode));
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(subtreeSortedByGeometryGrouping);
        if (1 > lastIndex) {
            return;
        }
        while (true) {
            int id = subtreeSortedByGeometryGrouping.get(i - 1).getId();
            int id2 = subtreeSortedByGeometryGrouping.get(i).getId();
            this.idToBeforeMap.put(java.lang.Integer.valueOf(id), java.lang.Integer.valueOf(id2));
            this.idToAfterMap.put(java.lang.Integer.valueOf(id2), java.lang.Integer.valueOf(id));
            if (i == lastIndex) {
                return;
            } else {
                i++;
            }
        }
    }

    private final boolean isScreenReaderFocusable(androidx.compose.ui.semantics.SemanticsNode node) {
        java.lang.String infoContentDescriptionOrNull;
        infoContentDescriptionOrNull = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.getInfoContentDescriptionOrNull(node);
        return node.getUnmergedConfig().getIsMergingSemanticsOfDescendants() || (node.isUnmergedLeafNode$ui_release() && (infoContentDescriptionOrNull != null || getInfoText(node) != null || getInfoStateDescriptionOrNull(node) != null || getInfoIsCheckable(node)));
    }

    private final void populateAccessibilityNodeInfoProperties(int virtualViewId, androidx.core.view.accessibility.AccessibilityNodeInfoCompat info, androidx.compose.ui.semantics.SemanticsNode semanticsNode) {
        boolean isImportantForAccessibility;
        java.lang.String infoContentDescriptionOrNull;
        boolean enabled;
        boolean isVisible;
        boolean enabled2;
        boolean enabled3;
        boolean enabled4;
        boolean enabled5;
        androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat;
        androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat2;
        boolean enabled6;
        boolean excludeLineAndPageGranularities;
        boolean enabled7;
        boolean enabled8;
        java.lang.String m3707toLegacyClassNameV4PA4sw;
        info.setClassName(ClassName);
        androidx.compose.ui.semantics.Role role = (androidx.compose.ui.semantics.Role) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getRole());
        if (role != null) {
            role.getValue();
            if (semanticsNode.getIsFake() || semanticsNode.getReplacedChildren$ui_release().isEmpty()) {
                if (androidx.compose.ui.semantics.Role.m3788equalsimpl0(role.getValue(), androidx.compose.ui.semantics.Role.INSTANCE.m3798getTabo7Vup1c())) {
                    info.setRoleDescription(this.view.getContext().getResources().getString(androidx.compose.ui.R.string.tab));
                } else if (!androidx.compose.ui.semantics.Role.m3788equalsimpl0(role.getValue(), androidx.compose.ui.semantics.Role.INSTANCE.m3797getSwitcho7Vup1c())) {
                    m3707toLegacyClassNameV4PA4sw = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.m3707toLegacyClassNameV4PA4sw(role.getValue());
                    if (!androidx.compose.ui.semantics.Role.m3788equalsimpl0(role.getValue(), androidx.compose.ui.semantics.Role.INSTANCE.m3795getImageo7Vup1c()) || semanticsNode.isUnmergedLeafNode$ui_release() || semanticsNode.getUnmergedConfig().getIsMergingSemanticsOfDescendants()) {
                        info.setClassName(m3707toLegacyClassNameV4PA4sw);
                    }
                } else {
                    info.setRoleDescription(this.view.getContext().getResources().getString(androidx.compose.ui.R.string.switch_role));
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        }
        if (semanticsNode.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetText())) {
            info.setClassName(TextFieldClassName);
        }
        if (semanticsNode.getConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getText())) {
            info.setClassName(TextClassName);
        }
        info.setPackageName(this.view.getContext().getPackageName());
        isImportantForAccessibility = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.isImportantForAccessibility(semanticsNode);
        info.setImportantForAccessibility(isImportantForAccessibility);
        java.util.List<androidx.compose.ui.semantics.SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.semantics.SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i);
            if (getCurrentSemanticsNodes().containsKey(java.lang.Integer.valueOf(semanticsNode2.getId()))) {
                androidx.compose.ui.viewinterop.AndroidViewHolder androidViewHolder = this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(semanticsNode2.getLayoutNode());
                if (androidViewHolder != null) {
                    info.addChild(androidViewHolder);
                } else if (semanticsNode2.getId() != -1) {
                    info.addChild(this.view, semanticsNode2.getId());
                }
            }
        }
        if (virtualViewId == this.focusedVirtualViewId) {
            info.setAccessibilityFocused(true);
            info.addAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
        } else {
            info.setAccessibilityFocused(false);
            info.addAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_ACCESSIBILITY_FOCUS);
        }
        setText(semanticsNode, info);
        setContentInvalid(semanticsNode, info);
        setStateDescription(semanticsNode, info);
        setIsCheckable(semanticsNode, info);
        androidx.compose.ui.state.ToggleableState toggleableState = (androidx.compose.ui.state.ToggleableState) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getToggleableState());
        if (toggleableState != null) {
            if (toggleableState == androidx.compose.ui.state.ToggleableState.On) {
                info.setChecked(true);
            } else if (toggleableState == androidx.compose.ui.state.ToggleableState.Off) {
                info.setChecked(false);
            }
            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
            kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
        }
        java.lang.Boolean bool = (java.lang.Boolean) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getSelected());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            int m3798getTabo7Vup1c = androidx.compose.ui.semantics.Role.INSTANCE.m3798getTabo7Vup1c();
            if (role != null && androidx.compose.ui.semantics.Role.m3788equalsimpl0(role.getValue(), m3798getTabo7Vup1c)) {
                info.setSelected(booleanValue);
            } else {
                info.setChecked(booleanValue);
            }
            kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
            kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
        }
        if (!semanticsNode.getUnmergedConfig().getIsMergingSemanticsOfDescendants() || semanticsNode.getReplacedChildren$ui_release().isEmpty()) {
            infoContentDescriptionOrNull = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.getInfoContentDescriptionOrNull(semanticsNode);
            info.setContentDescription(infoContentDescriptionOrNull);
        }
        java.lang.String str = (java.lang.String) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTestTag());
        if (str != null) {
            androidx.compose.ui.semantics.SemanticsNode semanticsNode3 = semanticsNode;
            while (true) {
                if (semanticsNode3 == null) {
                    break;
                }
                if (semanticsNode3.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId())) {
                    if (((java.lang.Boolean) semanticsNode3.getUnmergedConfig().get(androidx.compose.ui.semantics.SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId())).booleanValue()) {
                        info.setViewIdResourceName(str);
                    }
                } else {
                    semanticsNode3 = semanticsNode3.getParent();
                }
            }
        }
        if (((kotlin.Unit) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getHeading())) != null) {
            info.setHeading(true);
            kotlin.Unit unit7 = kotlin.Unit.INSTANCE;
            kotlin.Unit unit8 = kotlin.Unit.INSTANCE;
        }
        info.setPassword(semanticsNode.getConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getPassword()));
        info.setEditable(semanticsNode.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetText()));
        enabled = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
        info.setEnabled(enabled);
        info.setFocusable(semanticsNode.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getFocused()));
        if (info.isFocusable()) {
            info.setFocused(((java.lang.Boolean) semanticsNode.getUnmergedConfig().get(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getFocused())).booleanValue());
            if (info.isFocused()) {
                info.addAction(2);
            } else {
                info.addAction(1);
            }
        }
        isVisible = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.isVisible(semanticsNode);
        info.setVisibleToUser(isVisible);
        androidx.compose.ui.semantics.LiveRegionMode liveRegionMode = (androidx.compose.ui.semantics.LiveRegionMode) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getLiveRegion());
        if (liveRegionMode != null) {
            int value = liveRegionMode.getValue();
            info.setLiveRegion((androidx.compose.ui.semantics.LiveRegionMode.m3779equalsimpl0(value, androidx.compose.ui.semantics.LiveRegionMode.INSTANCE.m3784getPolite0phEisY()) || !androidx.compose.ui.semantics.LiveRegionMode.m3779equalsimpl0(value, androidx.compose.ui.semantics.LiveRegionMode.INSTANCE.m3783getAssertive0phEisY())) ? 1 : 2);
            kotlin.Unit unit9 = kotlin.Unit.INSTANCE;
            kotlin.Unit unit10 = kotlin.Unit.INSTANCE;
        }
        info.setClickable(false);
        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getOnClick());
        if (accessibilityAction != null) {
            boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getSelected()), (java.lang.Object) true);
            info.setClickable(!areEqual);
            enabled8 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled8 && !areEqual) {
                info.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, accessibilityAction.getLabel()));
            }
            kotlin.Unit unit11 = kotlin.Unit.INSTANCE;
            kotlin.Unit unit12 = kotlin.Unit.INSTANCE;
        }
        info.setLongClickable(false);
        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction2 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getOnLongClick());
        if (accessibilityAction2 != null) {
            info.setLongClickable(true);
            enabled7 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled7) {
                info.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(32, accessibilityAction2.getLabel()));
            }
            kotlin.Unit unit13 = kotlin.Unit.INSTANCE;
            kotlin.Unit unit14 = kotlin.Unit.INSTANCE;
        }
        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction3 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getCopyText());
        if (accessibilityAction3 != null) {
            info.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(16384, accessibilityAction3.getLabel()));
            kotlin.Unit unit15 = kotlin.Unit.INSTANCE;
            kotlin.Unit unit16 = kotlin.Unit.INSTANCE;
        }
        enabled2 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
        if (enabled2) {
            androidx.compose.ui.semantics.AccessibilityAction accessibilityAction4 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetText());
            if (accessibilityAction4 != null) {
                info.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(2097152, accessibilityAction4.getLabel()));
                kotlin.Unit unit17 = kotlin.Unit.INSTANCE;
                kotlin.Unit unit18 = kotlin.Unit.INSTANCE;
            }
            androidx.compose.ui.semantics.AccessibilityAction accessibilityAction5 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getOnImeAction());
            if (accessibilityAction5 != null) {
                info.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionImeEnter, accessibilityAction5.getLabel()));
                kotlin.Unit unit19 = kotlin.Unit.INSTANCE;
                kotlin.Unit unit20 = kotlin.Unit.INSTANCE;
            }
            androidx.compose.ui.semantics.AccessibilityAction accessibilityAction6 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getCutText());
            if (accessibilityAction6 != null) {
                info.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(65536, accessibilityAction6.getLabel()));
                kotlin.Unit unit21 = kotlin.Unit.INSTANCE;
                kotlin.Unit unit22 = kotlin.Unit.INSTANCE;
            }
            androidx.compose.ui.semantics.AccessibilityAction accessibilityAction7 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getPasteText());
            if (accessibilityAction7 != null) {
                if (info.isFocused() && this.view.getClipboardManager().hasText()) {
                    info.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(32768, accessibilityAction7.getLabel()));
                }
                kotlin.Unit unit23 = kotlin.Unit.INSTANCE;
                kotlin.Unit unit24 = kotlin.Unit.INSTANCE;
            }
        }
        java.lang.String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        if (iterableTextForAccessibility != null && iterableTextForAccessibility.length() != 0) {
            info.setTextSelection(getAccessibilitySelectionStart(semanticsNode), getAccessibilitySelectionEnd(semanticsNode));
            androidx.compose.ui.semantics.AccessibilityAction accessibilityAction8 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetSelection());
            info.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(131072, accessibilityAction8 != null ? accessibilityAction8.getLabel() : null));
            info.addAction(256);
            info.addAction(512);
            info.setMovementGranularities(11);
            java.util.List list = (java.util.List) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getContentDescription());
            if ((list == null || list.isEmpty()) && semanticsNode.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getGetTextLayoutResult())) {
                excludeLineAndPageGranularities = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.excludeLineAndPageGranularities(semanticsNode);
                if (!excludeLineAndPageGranularities) {
                    info.setMovementGranularities(info.getMovementGranularities() | 20);
                }
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(ExtraDataIdKey);
            java.lang.CharSequence text = info.getText();
            if (text != null && text.length() != 0 && semanticsNode.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getGetTextLayoutResult())) {
                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
            }
            if (semanticsNode.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTestTag())) {
                arrayList.add(ExtraDataTestTagKey);
            }
            androidx.compose.ui.platform.AccessibilityNodeInfoVerificationHelperMethods.INSTANCE.setAvailableExtraData(info.unwrap(), arrayList);
        }
        androidx.compose.ui.semantics.ProgressBarRangeInfo progressBarRangeInfo = (androidx.compose.ui.semantics.ProgressBarRangeInfo) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getProgressBarRangeInfo());
        if (progressBarRangeInfo != null) {
            if (semanticsNode.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetProgress())) {
                info.setClassName("android.widget.SeekBar");
            } else {
                info.setClassName("android.widget.ProgressBar");
            }
            if (progressBarRangeInfo != androidx.compose.ui.semantics.ProgressBarRangeInfo.INSTANCE.getIndeterminate()) {
                info.setRangeInfo(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, progressBarRangeInfo.getRange().getStart().floatValue(), progressBarRangeInfo.getRange().getEndInclusive().floatValue(), progressBarRangeInfo.getCurrent()));
            }
            if (semanticsNode.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetProgress())) {
                enabled6 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
                if (enabled6) {
                    if (progressBarRangeInfo.getCurrent() < kotlin.ranges.RangesKt.coerceAtLeast(progressBarRangeInfo.getRange().getEndInclusive().floatValue(), progressBarRangeInfo.getRange().getStart().floatValue())) {
                        info.addAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    }
                    if (progressBarRangeInfo.getCurrent() > kotlin.ranges.RangesKt.coerceAtMost(progressBarRangeInfo.getRange().getStart().floatValue(), progressBarRangeInfo.getRange().getEndInclusive().floatValue())) {
                        info.addAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    }
                }
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.Api24Impl.addSetProgressAction(info, semanticsNode);
        }
        androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt.setCollectionInfo(semanticsNode, info);
        androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt.setCollectionItemInfo(semanticsNode, info);
        androidx.compose.ui.semantics.ScrollAxisRange scrollAxisRange = (androidx.compose.ui.semantics.ScrollAxisRange) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange());
        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction9 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getScrollBy());
        if (scrollAxisRange != null && accessibilityAction9 != null) {
            if (!androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt.hasCollectionInfo(semanticsNode)) {
                info.setClassName("android.widget.HorizontalScrollView");
            }
            if (scrollAxisRange.getMaxValue().invoke().floatValue() > 0.0f) {
                info.setScrollable(true);
            }
            enabled5 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled5) {
                if (populateAccessibilityNodeInfoProperties$canScrollForward(scrollAxisRange)) {
                    info.addAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    if (semanticsNode.getLayoutInfo().getLayoutDirection() != androidx.compose.ui.unit.LayoutDirection.Rtl) {
                        accessibilityActionCompat2 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT;
                    } else {
                        accessibilityActionCompat2 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT;
                    }
                    info.addAction(accessibilityActionCompat2);
                }
                if (populateAccessibilityNodeInfoProperties$canScrollBackward(scrollAxisRange)) {
                    info.addAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    if (semanticsNode.getLayoutInfo().getLayoutDirection() != androidx.compose.ui.unit.LayoutDirection.Rtl) {
                        accessibilityActionCompat = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT;
                    } else {
                        accessibilityActionCompat = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT;
                    }
                    info.addAction(accessibilityActionCompat);
                }
            }
        }
        androidx.compose.ui.semantics.ScrollAxisRange scrollAxisRange2 = (androidx.compose.ui.semantics.ScrollAxisRange) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getVerticalScrollAxisRange());
        if (scrollAxisRange2 != null && accessibilityAction9 != null) {
            if (!androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt.hasCollectionInfo(semanticsNode)) {
                info.setClassName("android.widget.ScrollView");
            }
            if (scrollAxisRange2.getMaxValue().invoke().floatValue() > 0.0f) {
                info.setScrollable(true);
            }
            enabled4 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled4) {
                if (populateAccessibilityNodeInfoProperties$canScrollForward(scrollAxisRange2)) {
                    info.addAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    info.addAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_DOWN);
                }
                if (populateAccessibilityNodeInfoProperties$canScrollBackward(scrollAxisRange2)) {
                    info.addAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    info.addAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_UP);
                }
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.Api29Impl.addPageActions(info, semanticsNode);
        }
        info.setPaneTitle((java.lang.CharSequence) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getPaneTitle()));
        enabled3 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
        if (enabled3) {
            androidx.compose.ui.semantics.AccessibilityAction accessibilityAction10 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getExpand());
            if (accessibilityAction10 != null) {
                info.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(262144, accessibilityAction10.getLabel()));
                kotlin.Unit unit25 = kotlin.Unit.INSTANCE;
                kotlin.Unit unit26 = kotlin.Unit.INSTANCE;
            }
            androidx.compose.ui.semantics.AccessibilityAction accessibilityAction11 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getCollapse());
            if (accessibilityAction11 != null) {
                info.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(524288, accessibilityAction11.getLabel()));
                kotlin.Unit unit27 = kotlin.Unit.INSTANCE;
                kotlin.Unit unit28 = kotlin.Unit.INSTANCE;
            }
            androidx.compose.ui.semantics.AccessibilityAction accessibilityAction12 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getDismiss());
            if (accessibilityAction12 != null) {
                info.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(1048576, accessibilityAction12.getLabel()));
                kotlin.Unit unit29 = kotlin.Unit.INSTANCE;
                kotlin.Unit unit30 = kotlin.Unit.INSTANCE;
            }
            if (semanticsNode.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getCustomActions())) {
                java.util.List list2 = (java.util.List) semanticsNode.getUnmergedConfig().get(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getCustomActions());
                int size2 = list2.size();
                int[] iArr = AccessibilityActionsResourceIds;
                if (size2 >= iArr.length) {
                    throw new java.lang.IllegalStateException("Can't have more than " + iArr.length + " custom actions for one widget");
                }
                androidx.collection.SparseArrayCompat<java.lang.CharSequence> sparseArrayCompat = new androidx.collection.SparseArrayCompat<>(0, 1, null);
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                if (this.labelToActionId.containsKey(virtualViewId)) {
                    java.util.Map<java.lang.CharSequence, java.lang.Integer> map = this.labelToActionId.get(virtualViewId);
                    java.util.List<java.lang.Integer> mutableList = kotlin.collections.ArraysKt.toMutableList(iArr);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    int size3 = list2.size();
                    for (int i2 = 0; i2 < size3; i2++) {
                        androidx.compose.ui.semantics.CustomAccessibilityAction customAccessibilityAction = (androidx.compose.ui.semantics.CustomAccessibilityAction) list2.get(i2);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(map);
                        if (map.containsKey(customAccessibilityAction.getLabel())) {
                            java.lang.Integer num = map.get(customAccessibilityAction.getLabel());
                            kotlin.jvm.internal.Intrinsics.checkNotNull(num);
                            sparseArrayCompat.put(num.intValue(), customAccessibilityAction.getLabel());
                            linkedHashMap.put(customAccessibilityAction.getLabel(), num);
                            mutableList.remove(num);
                            info.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(num.intValue(), customAccessibilityAction.getLabel()));
                        } else {
                            arrayList2.add(customAccessibilityAction);
                        }
                    }
                    int size4 = arrayList2.size();
                    for (int i3 = 0; i3 < size4; i3++) {
                        androidx.compose.ui.semantics.CustomAccessibilityAction customAccessibilityAction2 = (androidx.compose.ui.semantics.CustomAccessibilityAction) arrayList2.get(i3);
                        int intValue = mutableList.get(i3).intValue();
                        sparseArrayCompat.put(intValue, customAccessibilityAction2.getLabel());
                        linkedHashMap.put(customAccessibilityAction2.getLabel(), java.lang.Integer.valueOf(intValue));
                        info.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(intValue, customAccessibilityAction2.getLabel()));
                    }
                } else {
                    int size5 = list2.size();
                    for (int i4 = 0; i4 < size5; i4++) {
                        androidx.compose.ui.semantics.CustomAccessibilityAction customAccessibilityAction3 = (androidx.compose.ui.semantics.CustomAccessibilityAction) list2.get(i4);
                        int i5 = AccessibilityActionsResourceIds[i4];
                        sparseArrayCompat.put(i5, customAccessibilityAction3.getLabel());
                        linkedHashMap.put(customAccessibilityAction3.getLabel(), java.lang.Integer.valueOf(i5));
                        info.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(i5, customAccessibilityAction3.getLabel()));
                    }
                }
                this.actionIdToLabel.put(virtualViewId, sparseArrayCompat);
                this.labelToActionId.put(virtualViewId, linkedHashMap);
            }
        }
        info.setScreenReaderFocusable(isScreenReaderFocusable(semanticsNode));
        java.lang.Integer num2 = this.idToBeforeMap.get(java.lang.Integer.valueOf(virtualViewId));
        if (num2 != null) {
            num2.intValue();
            android.view.View semanticsIdToView = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.semanticsIdToView(this.view.getAndroidViewsHandler$ui_release(), num2.intValue());
            if (semanticsIdToView != null) {
                info.setTraversalBefore(semanticsIdToView);
            } else {
                info.setTraversalBefore(this.view, num2.intValue());
            }
            addExtraDataToAccessibilityNodeInfoHelper(virtualViewId, info.unwrap(), this.ExtraDataTestTraversalBeforeVal, null);
            kotlin.Unit unit31 = kotlin.Unit.INSTANCE;
            kotlin.Unit unit32 = kotlin.Unit.INSTANCE;
        }
        java.lang.Integer num3 = this.idToAfterMap.get(java.lang.Integer.valueOf(virtualViewId));
        if (num3 != null) {
            num3.intValue();
            android.view.View semanticsIdToView2 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.semanticsIdToView(this.view.getAndroidViewsHandler$ui_release(), num3.intValue());
            if (semanticsIdToView2 != null) {
                info.setTraversalAfter(semanticsIdToView2);
                addExtraDataToAccessibilityNodeInfoHelper(virtualViewId, info.unwrap(), this.ExtraDataTestTraversalAfterVal, null);
            }
            kotlin.Unit unit33 = kotlin.Unit.INSTANCE;
            kotlin.Unit unit34 = kotlin.Unit.INSTANCE;
        }
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollForward(androidx.compose.ui.semantics.ScrollAxisRange scrollAxisRange) {
        return (scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue() && !scrollAxisRange.getReverseScrolling()) || (scrollAxisRange.getValue().invoke().floatValue() > 0.0f && scrollAxisRange.getReverseScrolling());
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollBackward(androidx.compose.ui.semantics.ScrollAxisRange scrollAxisRange) {
        return (scrollAxisRange.getValue().invoke().floatValue() > 0.0f && !scrollAxisRange.getReverseScrolling()) || (scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue() && scrollAxisRange.getReverseScrolling());
    }

    private final void setContentInvalid(androidx.compose.ui.semantics.SemanticsNode node, androidx.core.view.accessibility.AccessibilityNodeInfoCompat info) {
        if (node.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getError())) {
            info.setContentInvalid(true);
            info.setError((java.lang.CharSequence) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getError()));
        }
    }

    private final java.lang.String getInfoStateDescriptionOrNull(androidx.compose.ui.semantics.SemanticsNode node) {
        java.lang.Object string;
        int i;
        java.lang.Object orNull = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getStateDescription());
        androidx.compose.ui.state.ToggleableState toggleableState = (androidx.compose.ui.state.ToggleableState) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getToggleableState());
        androidx.compose.ui.semantics.Role role = (androidx.compose.ui.semantics.Role) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getRole());
        if (toggleableState != null) {
            int i2 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i2 == 1) {
                int m3797getSwitcho7Vup1c = androidx.compose.ui.semantics.Role.INSTANCE.m3797getSwitcho7Vup1c();
                if (role != null && androidx.compose.ui.semantics.Role.m3788equalsimpl0(role.getValue(), m3797getSwitcho7Vup1c) && orNull == null) {
                    orNull = this.view.getContext().getResources().getString(androidx.compose.ui.R.string.on);
                }
            } else if (i2 == 2) {
                int m3797getSwitcho7Vup1c2 = androidx.compose.ui.semantics.Role.INSTANCE.m3797getSwitcho7Vup1c();
                if (role != null && androidx.compose.ui.semantics.Role.m3788equalsimpl0(role.getValue(), m3797getSwitcho7Vup1c2) && orNull == null) {
                    orNull = this.view.getContext().getResources().getString(androidx.compose.ui.R.string.off);
                }
            } else if (i2 == 3 && orNull == null) {
                orNull = this.view.getContext().getResources().getString(androidx.compose.ui.R.string.indeterminate);
            }
        }
        java.lang.Boolean bool = (java.lang.Boolean) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getSelected());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            int m3798getTabo7Vup1c = androidx.compose.ui.semantics.Role.INSTANCE.m3798getTabo7Vup1c();
            if ((role == null || !androidx.compose.ui.semantics.Role.m3788equalsimpl0(role.getValue(), m3798getTabo7Vup1c)) && orNull == null) {
                if (booleanValue) {
                    orNull = this.view.getContext().getResources().getString(androidx.compose.ui.R.string.selected);
                } else {
                    orNull = this.view.getContext().getResources().getString(androidx.compose.ui.R.string.not_selected);
                }
            }
        }
        androidx.compose.ui.semantics.ProgressBarRangeInfo progressBarRangeInfo = (androidx.compose.ui.semantics.ProgressBarRangeInfo) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getProgressBarRangeInfo());
        if (progressBarRangeInfo != null) {
            if (progressBarRangeInfo != androidx.compose.ui.semantics.ProgressBarRangeInfo.INSTANCE.getIndeterminate()) {
                if (orNull == null) {
                    kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> range = progressBarRangeInfo.getRange();
                    float coerceIn = kotlin.ranges.RangesKt.coerceIn(range.getEndInclusive().floatValue() - range.getStart().floatValue() == 0.0f ? 0.0f : (progressBarRangeInfo.getCurrent() - range.getStart().floatValue()) / (range.getEndInclusive().floatValue() - range.getStart().floatValue()), 0.0f, 1.0f);
                    if (coerceIn == 0.0f) {
                        i = 0;
                    } else {
                        i = 100;
                        if (coerceIn != 1.0f) {
                            i = kotlin.ranges.RangesKt.coerceIn(kotlin.math.MathKt.roundToInt(coerceIn * 100), 1, 99);
                        }
                    }
                    string = this.view.getContext().getResources().getString(androidx.compose.ui.R.string.template_percent, java.lang.Integer.valueOf(i));
                    orNull = string;
                }
            } else if (orNull == null) {
                string = this.view.getContext().getResources().getString(androidx.compose.ui.R.string.in_progress);
                orNull = string;
            }
        }
        return (java.lang.String) orNull;
    }

    private final void setStateDescription(androidx.compose.ui.semantics.SemanticsNode node, androidx.core.view.accessibility.AccessibilityNodeInfoCompat info) {
        info.setStateDescription(getInfoStateDescriptionOrNull(node));
    }

    private final boolean getInfoIsCheckable(androidx.compose.ui.semantics.SemanticsNode node) {
        androidx.compose.ui.state.ToggleableState toggleableState = (androidx.compose.ui.state.ToggleableState) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getToggleableState());
        androidx.compose.ui.semantics.Role role = (androidx.compose.ui.semantics.Role) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getRole());
        boolean z = true;
        boolean z2 = toggleableState != null;
        java.lang.Boolean bool = (java.lang.Boolean) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getSelected());
        if (bool == null) {
            return z2;
        }
        bool.booleanValue();
        int m3798getTabo7Vup1c = androidx.compose.ui.semantics.Role.INSTANCE.m3798getTabo7Vup1c();
        if (role != null && androidx.compose.ui.semantics.Role.m3788equalsimpl0(role.getValue(), m3798getTabo7Vup1c)) {
            z = z2;
        }
        return z;
    }

    private final void setIsCheckable(androidx.compose.ui.semantics.SemanticsNode node, androidx.core.view.accessibility.AccessibilityNodeInfoCompat info) {
        info.setCheckable(getInfoIsCheckable(node));
    }

    private final android.text.SpannableString getInfoText(androidx.compose.ui.semantics.SemanticsNode node) {
        androidx.compose.ui.text.AnnotatedString annotatedString;
        androidx.compose.ui.text.font.FontFamily.Resolver fontFamilyResolver = this.view.getFontFamilyResolver();
        androidx.compose.ui.text.AnnotatedString textForTextField = getTextForTextField(node.getUnmergedConfig());
        android.text.SpannableString spannableString = null;
        android.text.SpannableString spannableString2 = (android.text.SpannableString) trimToSize(textForTextField != null ? androidx.compose.ui.text.platform.AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(textForTextField, this.view.getDensity(), fontFamilyResolver, this.urlSpanCache) : null, 100000);
        java.util.List list = (java.util.List) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getText());
        if (list != null && (annotatedString = (androidx.compose.ui.text.AnnotatedString) kotlin.collections.CollectionsKt.firstOrNull(list)) != null) {
            spannableString = androidx.compose.ui.text.platform.AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(annotatedString, this.view.getDensity(), fontFamilyResolver, this.urlSpanCache);
        }
        return spannableString2 == null ? (android.text.SpannableString) trimToSize(spannableString, 100000) : spannableString2;
    }

    private final void setText(androidx.compose.ui.semantics.SemanticsNode node, androidx.core.view.accessibility.AccessibilityNodeInfoCompat info) {
        info.setText(getInfoText(node));
    }

    private final boolean isAccessibilityFocused(int virtualViewId) {
        return this.focusedVirtualViewId == virtualViewId;
    }

    private final boolean requestAccessibilityFocus(int virtualViewId) {
        if (!isTouchExplorationEnabled() || isAccessibilityFocused(virtualViewId)) {
            return false;
        }
        int i = this.focusedVirtualViewId;
        if (i != Integer.MIN_VALUE) {
            sendEventForVirtualView$default(this, i, 65536, null, null, 12, null);
        }
        this.focusedVirtualViewId = virtualViewId;
        this.view.invalidate();
        sendEventForVirtualView$default(this, virtualViewId, 32768, null, null, 12, null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean sendEventForVirtualView$default(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i, int i2, java.lang.Integer num, java.util.List list, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        if ((i3 & 8) != 0) {
            list = null;
        }
        return androidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView(i, i2, num, list);
    }

    private final boolean sendEventForVirtualView(int virtualViewId, int eventType, java.lang.Integer contentChangeType, java.util.List<java.lang.String> contentDescription) {
        if (virtualViewId == Integer.MIN_VALUE || !isEnabled()) {
            return false;
        }
        android.view.accessibility.AccessibilityEvent createEvent = createEvent(virtualViewId, eventType);
        if (contentChangeType != null) {
            createEvent.setContentChangeTypes(contentChangeType.intValue());
        }
        if (contentDescription != null) {
            createEvent.setContentDescription(androidx.compose.ui.util.ListUtilsKt.fastJoinToString$default(contentDescription, ",", null, null, 0, null, null, 62, null));
        }
        return sendEvent(createEvent);
    }

    private final boolean sendEvent(android.view.accessibility.AccessibilityEvent event) {
        if (!isEnabledForAccessibility$ui_release()) {
            return false;
        }
        if (event.getEventType() == 2048 || event.getEventType() == 32768) {
            this.sendingFocusAffectingEvent = true;
        }
        try {
            return this.onSendAccessibilityEvent.invoke(event).booleanValue();
        } finally {
            this.sendingFocusAffectingEvent = false;
        }
    }

    private final android.view.accessibility.AccessibilityEvent createEvent(int virtualViewId, int eventType) {
        androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds;
        android.view.accessibility.AccessibilityEvent obtain = android.view.accessibility.AccessibilityEvent.obtain(eventType);
        obtain.setEnabled(true);
        obtain.setClassName(ClassName);
        obtain.setPackageName(this.view.getContext().getPackageName());
        obtain.setSource(this.view, virtualViewId);
        if (isEnabledForAccessibility$ui_release() && (semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(java.lang.Integer.valueOf(virtualViewId))) != null) {
            obtain.setPassword(semanticsNodeWithAdjustedBounds.getSemanticsNode().getConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getPassword()));
        }
        return obtain;
    }

    private final android.view.accessibility.AccessibilityEvent createTextSelectionChangedEvent(int virtualViewId, java.lang.Integer fromIndex, java.lang.Integer toIndex, java.lang.Integer itemCount, java.lang.CharSequence text) {
        android.view.accessibility.AccessibilityEvent createEvent = createEvent(virtualViewId, 8192);
        if (fromIndex != null) {
            createEvent.setFromIndex(fromIndex.intValue());
        }
        if (toIndex != null) {
            createEvent.setToIndex(toIndex.intValue());
        }
        if (itemCount != null) {
            createEvent.setItemCount(itemCount.intValue());
        }
        if (text != null) {
            createEvent.getText().add(text);
        }
        return createEvent;
    }

    private final boolean clearAccessibilityFocus(int virtualViewId) {
        if (!isAccessibilityFocused(virtualViewId)) {
            return false;
        }
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.currentlyFocusedANI = null;
        this.view.invalidate();
        sendEventForVirtualView$default(this, virtualViewId, 65536, null, null, 12, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01c4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x01a2 -> B:86:0x01a3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean performActionHelper(int virtualViewId, int action, android.os.Bundle arguments) {
        androidx.compose.ui.semantics.SemanticsNode semanticsNode;
        kotlin.jvm.functions.Function0 function0;
        boolean enabled;
        kotlin.jvm.functions.Function0 function02;
        kotlin.jvm.functions.Function0 function03;
        kotlin.jvm.functions.Function0 function04;
        float f;
        int i;
        kotlin.jvm.functions.Function2 function2;
        kotlin.jvm.functions.Function0 function05;
        kotlin.jvm.functions.Function0 function06;
        kotlin.jvm.functions.Function0 function07;
        kotlin.jvm.functions.Function0 function08;
        kotlin.jvm.functions.Function0 function09;
        kotlin.jvm.functions.Function1 function1;
        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction;
        kotlin.jvm.functions.Function2 function22;
        androidx.compose.ui.semantics.SemanticsConfiguration config;
        androidx.compose.ui.semantics.SemanticsConfiguration config2;
        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction2;
        kotlin.jvm.functions.Function1 function12;
        kotlin.jvm.functions.Function0 function010;
        java.lang.CharSequence charSequence;
        java.util.List list;
        androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(java.lang.Integer.valueOf(virtualViewId));
        if (semanticsNodeWithAdjustedBounds == null || (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) == null) {
            return false;
        }
        if (action == 64) {
            return requestAccessibilityFocus(virtualViewId);
        }
        if (action == 128) {
            return clearAccessibilityFocus(virtualViewId);
        }
        if (action == 256 || action == 512) {
            if (arguments != null) {
                return traverseAtGranularity(semanticsNode, arguments.getInt(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT), action == 256, arguments.getBoolean(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN));
            }
            return false;
        }
        if (action == 16384) {
            androidx.compose.ui.semantics.AccessibilityAction accessibilityAction3 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getCopyText());
            if (accessibilityAction3 == null || (function0 = (kotlin.jvm.functions.Function0) accessibilityAction3.getAction()) == null) {
                return false;
            }
            return ((java.lang.Boolean) function0.invoke()).booleanValue();
        }
        if (action != 131072) {
            enabled = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (!enabled) {
                return false;
            }
            if (action == 1) {
                androidx.compose.ui.semantics.AccessibilityAction accessibilityAction4 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getRequestFocus());
                if (accessibilityAction4 == null || (function02 = (kotlin.jvm.functions.Function0) accessibilityAction4.getAction()) == null) {
                    return false;
                }
                return ((java.lang.Boolean) function02.invoke()).booleanValue();
            }
            java.lang.Boolean bool = null;
            bool = null;
            if (action != 2) {
                switch (action) {
                    case 16:
                        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction5 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getOnClick());
                        if (accessibilityAction5 != null && (function03 = (kotlin.jvm.functions.Function0) accessibilityAction5.getAction()) != null) {
                            bool = (java.lang.Boolean) function03.invoke();
                        }
                        sendEventForVirtualView$default(this, virtualViewId, 1, null, null, 12, null);
                        if (bool != null) {
                            return bool.booleanValue();
                        }
                        return false;
                    case 32:
                        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction6 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getOnLongClick());
                        if (accessibilityAction6 == null || (function04 = (kotlin.jvm.functions.Function0) accessibilityAction6.getAction()) == null) {
                            return false;
                        }
                        return ((java.lang.Boolean) function04.invoke()).booleanValue();
                    case 4096:
                    case 8192:
                        break;
                    case 32768:
                        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction7 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getPasteText());
                        if (accessibilityAction7 == null || (function05 = (kotlin.jvm.functions.Function0) accessibilityAction7.getAction()) == null) {
                            return false;
                        }
                        return ((java.lang.Boolean) function05.invoke()).booleanValue();
                    case 65536:
                        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction8 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getCutText());
                        if (accessibilityAction8 == null || (function06 = (kotlin.jvm.functions.Function0) accessibilityAction8.getAction()) == null) {
                            return false;
                        }
                        return ((java.lang.Boolean) function06.invoke()).booleanValue();
                    case 262144:
                        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction9 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getExpand());
                        if (accessibilityAction9 == null || (function07 = (kotlin.jvm.functions.Function0) accessibilityAction9.getAction()) == null) {
                            return false;
                        }
                        return ((java.lang.Boolean) function07.invoke()).booleanValue();
                    case 524288:
                        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction10 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getCollapse());
                        if (accessibilityAction10 == null || (function08 = (kotlin.jvm.functions.Function0) accessibilityAction10.getAction()) == null) {
                            return false;
                        }
                        return ((java.lang.Boolean) function08.invoke()).booleanValue();
                    case 1048576:
                        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction11 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getDismiss());
                        if (accessibilityAction11 == null || (function09 = (kotlin.jvm.functions.Function0) accessibilityAction11.getAction()) == null) {
                            return false;
                        }
                        return ((java.lang.Boolean) function09.invoke()).booleanValue();
                    case 2097152:
                        java.lang.String string = arguments != null ? arguments.getString(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE) : null;
                        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction12 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetText());
                        if (accessibilityAction12 == null || (function1 = (kotlin.jvm.functions.Function1) accessibilityAction12.getAction()) == null) {
                            return false;
                        }
                        if (string == null) {
                            string = "";
                        }
                        return ((java.lang.Boolean) function1.invoke(new androidx.compose.ui.text.AnnotatedString(string, null, null, 6, null))).booleanValue();
                    case android.R.id.accessibilityActionShowOnScreen:
                        androidx.compose.ui.semantics.SemanticsNode parent = semanticsNode.getParent();
                        if (parent != null && (config2 = parent.getConfig()) != null) {
                            accessibilityAction = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(config2, androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getScrollBy());
                            while (parent != null && accessibilityAction == null) {
                                parent = parent.getParent();
                                if (parent != null && (config = parent.getConfig()) != null) {
                                    accessibilityAction = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(config, androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getScrollBy());
                                }
                            }
                            if (parent != null) {
                                return false;
                            }
                            androidx.compose.ui.geometry.Rect boundsInParent = androidx.compose.ui.layout.LayoutCoordinatesKt.boundsInParent(parent.getLayoutInfo().getCoordinates());
                            androidx.compose.ui.layout.LayoutCoordinates parentLayoutCoordinates = parent.getLayoutInfo().getCoordinates().getParentLayoutCoordinates();
                            androidx.compose.ui.geometry.Rect m1908translatek4lQ0M = boundsInParent.m1908translatek4lQ0M(parentLayoutCoordinates != null ? androidx.compose.ui.layout.LayoutCoordinatesKt.positionInRoot(parentLayoutCoordinates) : androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0());
                            androidx.compose.ui.geometry.Rect m1911Recttz77jQw = androidx.compose.ui.geometry.RectKt.m1911Recttz77jQw(semanticsNode.m3800getPositionInRootF1C5BW0(), androidx.compose.ui.unit.IntSizeKt.m4662toSizeozmzZPI(semanticsNode.m3802getSizeYbymL2g()));
                            androidx.compose.ui.semantics.ScrollAxisRange scrollAxisRange = (androidx.compose.ui.semantics.ScrollAxisRange) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(parent.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange());
                            androidx.compose.ui.semantics.ScrollAxisRange scrollAxisRange2 = (androidx.compose.ui.semantics.ScrollAxisRange) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(parent.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getVerticalScrollAxisRange());
                            float performActionHelper$scrollDelta = performActionHelper$scrollDelta(m1911Recttz77jQw.getLeft() - m1908translatek4lQ0M.getLeft(), m1911Recttz77jQw.getRight() - m1908translatek4lQ0M.getRight());
                            if (scrollAxisRange != null && scrollAxisRange.getReverseScrolling()) {
                                performActionHelper$scrollDelta = -performActionHelper$scrollDelta;
                            }
                            if (semanticsNode.getLayoutInfo().getLayoutDirection() == androidx.compose.ui.unit.LayoutDirection.Rtl) {
                                performActionHelper$scrollDelta = -performActionHelper$scrollDelta;
                            }
                            float performActionHelper$scrollDelta2 = performActionHelper$scrollDelta(m1911Recttz77jQw.getTop() - m1908translatek4lQ0M.getTop(), m1911Recttz77jQw.getBottom() - m1908translatek4lQ0M.getBottom());
                            if (scrollAxisRange2 != null && scrollAxisRange2.getReverseScrolling()) {
                                performActionHelper$scrollDelta2 = -performActionHelper$scrollDelta2;
                            }
                            if (accessibilityAction == null || (function22 = (kotlin.jvm.functions.Function2) accessibilityAction.getAction()) == null) {
                                return false;
                            }
                            return ((java.lang.Boolean) function22.invoke(java.lang.Float.valueOf(performActionHelper$scrollDelta), java.lang.Float.valueOf(performActionHelper$scrollDelta2))).booleanValue();
                        }
                        accessibilityAction = null;
                        while (parent != null) {
                            parent = parent.getParent();
                            if (parent != null) {
                                accessibilityAction = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(config, androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getScrollBy());
                            }
                            accessibilityAction = null;
                            while (parent != null) {
                            }
                        }
                        if (parent != null) {
                        }
                        break;
                    case android.R.id.accessibilityActionSetProgress:
                        if (arguments == null || !arguments.containsKey(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE) || (accessibilityAction2 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetProgress())) == null || (function12 = (kotlin.jvm.functions.Function1) accessibilityAction2.getAction()) == null) {
                            return false;
                        }
                        return ((java.lang.Boolean) function12.invoke(java.lang.Float.valueOf(arguments.getFloat(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE)))).booleanValue();
                    case android.R.id.accessibilityActionImeEnter:
                        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction13 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getOnImeAction());
                        if (accessibilityAction13 == null || (function010 = (kotlin.jvm.functions.Function0) accessibilityAction13.getAction()) == null) {
                            return false;
                        }
                        return ((java.lang.Boolean) function010.invoke()).booleanValue();
                    default:
                        switch (action) {
                            case android.R.id.accessibilityActionScrollUp:
                            case android.R.id.accessibilityActionScrollLeft:
                            case android.R.id.accessibilityActionScrollDown:
                            case android.R.id.accessibilityActionScrollRight:
                                break;
                            default:
                                switch (action) {
                                    case android.R.id.accessibilityActionPageUp:
                                        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction14 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getPageUp());
                                        if (accessibilityAction14 != null && (r13 = (kotlin.jvm.functions.Function0) accessibilityAction14.getAction()) != null) {
                                            break;
                                        }
                                        break;
                                    case android.R.id.accessibilityActionPageDown:
                                        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction15 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getPageDown());
                                        if (accessibilityAction15 != null && (r13 = (kotlin.jvm.functions.Function0) accessibilityAction15.getAction()) != null) {
                                            break;
                                        }
                                        break;
                                    case android.R.id.accessibilityActionPageLeft:
                                        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction16 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getPageLeft());
                                        if (accessibilityAction16 != null && (r13 = (kotlin.jvm.functions.Function0) accessibilityAction16.getAction()) != null) {
                                            break;
                                        }
                                        break;
                                    case android.R.id.accessibilityActionPageRight:
                                        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction17 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getPageRight());
                                        if (accessibilityAction17 != null && (r13 = (kotlin.jvm.functions.Function0) accessibilityAction17.getAction()) != null) {
                                            break;
                                        }
                                        break;
                                    default:
                                        androidx.collection.SparseArrayCompat<java.lang.CharSequence> sparseArrayCompat = this.actionIdToLabel.get(virtualViewId);
                                        if (sparseArrayCompat != null && (charSequence = sparseArrayCompat.get(action)) != null && (list = (java.util.List) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getCustomActions())) != null) {
                                            int size = list.size();
                                            for (int i2 = 0; i2 < size; i2++) {
                                                androidx.compose.ui.semantics.CustomAccessibilityAction customAccessibilityAction = (androidx.compose.ui.semantics.CustomAccessibilityAction) list.get(i2);
                                                if (kotlin.jvm.internal.Intrinsics.areEqual(customAccessibilityAction.getLabel(), charSequence)) {
                                                    break;
                                                }
                                            }
                                            break;
                                        }
                                        break;
                                }
                        }
                        return false;
                }
                boolean z = action == 4096;
                boolean z2 = action == 8192;
                boolean z3 = action == 16908345;
                boolean z4 = action == 16908347;
                boolean z5 = action == 16908344;
                boolean z6 = action == 16908346;
                boolean z7 = z3 || z4 || z || z2;
                boolean z8 = z5 || z6 || z || z2;
                if (z || z2) {
                    androidx.compose.ui.semantics.ProgressBarRangeInfo progressBarRangeInfo = (androidx.compose.ui.semantics.ProgressBarRangeInfo) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getProgressBarRangeInfo());
                    androidx.compose.ui.semantics.AccessibilityAction accessibilityAction18 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetProgress());
                    if (progressBarRangeInfo != null && accessibilityAction18 != null) {
                        float coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(progressBarRangeInfo.getRange().getEndInclusive().floatValue(), progressBarRangeInfo.getRange().getStart().floatValue());
                        float coerceAtMost = kotlin.ranges.RangesKt.coerceAtMost(progressBarRangeInfo.getRange().getStart().floatValue(), progressBarRangeInfo.getRange().getEndInclusive().floatValue());
                        if (progressBarRangeInfo.getSteps() > 0) {
                            f = coerceAtLeast - coerceAtMost;
                            i = progressBarRangeInfo.getSteps() + 1;
                        } else {
                            f = coerceAtLeast - coerceAtMost;
                            i = 20;
                        }
                        float f2 = f / i;
                        if (z2) {
                            f2 = -f2;
                        }
                        kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) accessibilityAction18.getAction();
                        if (function13 != null) {
                            return ((java.lang.Boolean) function13.invoke(java.lang.Float.valueOf(progressBarRangeInfo.getCurrent() + f2))).booleanValue();
                        }
                        return false;
                    }
                }
                long m1904getSizeNHjbRc = androidx.compose.ui.layout.LayoutCoordinatesKt.boundsInParent(semanticsNode.getLayoutInfo().getCoordinates()).m1904getSizeNHjbRc();
                androidx.compose.ui.semantics.AccessibilityAction accessibilityAction19 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getScrollBy());
                if (accessibilityAction19 == null) {
                    return false;
                }
                androidx.compose.ui.semantics.ScrollAxisRange scrollAxisRange3 = (androidx.compose.ui.semantics.ScrollAxisRange) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange());
                if (scrollAxisRange3 != null && z7) {
                    float m1940getWidthimpl = androidx.compose.ui.geometry.Size.m1940getWidthimpl(m1904getSizeNHjbRc);
                    if (z3 || z2) {
                        m1940getWidthimpl = -m1940getWidthimpl;
                    }
                    if (scrollAxisRange3.getReverseScrolling()) {
                        m1940getWidthimpl = -m1940getWidthimpl;
                    }
                    if (semanticsNode.getLayoutInfo().getLayoutDirection() == androidx.compose.ui.unit.LayoutDirection.Rtl && (z3 || z4)) {
                        m1940getWidthimpl = -m1940getWidthimpl;
                    }
                    if (performActionHelper$canScroll(scrollAxisRange3, m1940getWidthimpl)) {
                        kotlin.jvm.functions.Function2 function23 = (kotlin.jvm.functions.Function2) accessibilityAction19.getAction();
                        if (function23 != null) {
                            return ((java.lang.Boolean) function23.invoke(java.lang.Float.valueOf(m1940getWidthimpl), java.lang.Float.valueOf(0.0f))).booleanValue();
                        }
                        return false;
                    }
                }
                androidx.compose.ui.semantics.ScrollAxisRange scrollAxisRange4 = (androidx.compose.ui.semantics.ScrollAxisRange) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getVerticalScrollAxisRange());
                if (scrollAxisRange4 == null || !z8) {
                    return false;
                }
                float m1937getHeightimpl = androidx.compose.ui.geometry.Size.m1937getHeightimpl(m1904getSizeNHjbRc);
                if (z5 || z2) {
                    m1937getHeightimpl = -m1937getHeightimpl;
                }
                if (scrollAxisRange4.getReverseScrolling()) {
                    m1937getHeightimpl = -m1937getHeightimpl;
                }
                if (!performActionHelper$canScroll(scrollAxisRange4, m1937getHeightimpl) || (function2 = (kotlin.jvm.functions.Function2) accessibilityAction19.getAction()) == null) {
                    return false;
                }
                return ((java.lang.Boolean) function2.invoke(java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(m1937getHeightimpl))).booleanValue();
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getFocused()), (java.lang.Object) true)) {
                return false;
            }
            androidx.compose.ui.focus.FocusManager.CC.clearFocus$default(this.view.getFocusOwner(), false, 1, null);
            return true;
        }
        boolean accessibilitySelection = setAccessibilitySelection(semanticsNode, arguments != null ? arguments.getInt(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_START_INT, -1) : -1, arguments != null ? arguments.getInt(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_END_INT, -1) : -1, false);
        if (accessibilitySelection) {
            sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode.getId()), 0, null, null, 12, null);
        }
        return accessibilitySelection;
    }

    private static final boolean performActionHelper$canScroll(androidx.compose.ui.semantics.ScrollAxisRange scrollAxisRange, float f) {
        return (f < 0.0f && scrollAxisRange.getValue().invoke().floatValue() > 0.0f) || (f > 0.0f && scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue());
    }

    private static final float performActionHelper$scrollDelta(float f, float f2) {
        if (java.lang.Math.signum(f) == java.lang.Math.signum(f2)) {
            return java.lang.Math.abs(f) < java.lang.Math.abs(f2) ? f : f2;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addExtraDataToAccessibilityNodeInfoHelper(int virtualViewId, android.view.accessibility.AccessibilityNodeInfo info, java.lang.String extraDataKey, android.os.Bundle arguments) {
        androidx.compose.ui.semantics.SemanticsNode semanticsNode;
        androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(java.lang.Integer.valueOf(virtualViewId));
        if (semanticsNodeWithAdjustedBounds == null || (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) == null) {
            return;
        }
        java.lang.String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        if (kotlin.jvm.internal.Intrinsics.areEqual(extraDataKey, this.ExtraDataTestTraversalBeforeVal)) {
            java.lang.Integer num = this.idToBeforeMap.get(java.lang.Integer.valueOf(virtualViewId));
            if (num != null) {
                info.getExtras().putInt(extraDataKey, num.intValue());
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(extraDataKey, this.ExtraDataTestTraversalAfterVal)) {
            java.lang.Integer num2 = this.idToAfterMap.get(java.lang.Integer.valueOf(virtualViewId));
            if (num2 != null) {
                info.getExtras().putInt(extraDataKey, num2.intValue());
                return;
            }
            return;
        }
        if (semanticsNode.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getGetTextLayoutResult()) && arguments != null && kotlin.jvm.internal.Intrinsics.areEqual(extraDataKey, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i = arguments.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i2 = arguments.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i2 > 0 && i >= 0) {
                if (i < (iterableTextForAccessibility != null ? iterableTextForAccessibility.length() : Integer.MAX_VALUE)) {
                    androidx.compose.ui.text.TextLayoutResult textLayoutResult = getTextLayoutResult(semanticsNode.getUnmergedConfig());
                    if (textLayoutResult == null) {
                        return;
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (int i3 = 0; i3 < i2; i3++) {
                        int i4 = i + i3;
                        if (i4 >= textLayoutResult.getLayoutInput().getText().length()) {
                            arrayList.add(null);
                        } else {
                            arrayList.add(toScreenCoords(semanticsNode, textLayoutResult.getBoundingBox(i4)));
                        }
                    }
                    info.getExtras().putParcelableArray(extraDataKey, (android.os.Parcelable[]) arrayList.toArray(new android.graphics.RectF[0]));
                    return;
                }
            }
            android.util.Log.e(LogTag, "Invalid arguments for accessibility character locations");
            return;
        }
        if (semanticsNode.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTestTag()) && arguments != null && kotlin.jvm.internal.Intrinsics.areEqual(extraDataKey, ExtraDataTestTagKey)) {
            java.lang.String str = (java.lang.String) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTestTag());
            if (str != null) {
                info.getExtras().putCharSequence(extraDataKey, str);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(extraDataKey, ExtraDataIdKey)) {
            info.getExtras().putInt(extraDataKey, semanticsNode.getId());
        }
    }

    private final android.graphics.RectF toScreenCoords(androidx.compose.ui.semantics.SemanticsNode textNode, androidx.compose.ui.geometry.Rect bounds) {
        if (textNode == null) {
            return null;
        }
        androidx.compose.ui.geometry.Rect m1908translatek4lQ0M = bounds.m1908translatek4lQ0M(textNode.m3800getPositionInRootF1C5BW0());
        androidx.compose.ui.geometry.Rect boundsInRoot = textNode.getBoundsInRoot();
        androidx.compose.ui.geometry.Rect intersect = m1908translatek4lQ0M.overlaps(boundsInRoot) ? m1908translatek4lQ0M.intersect(boundsInRoot) : null;
        if (intersect == null) {
            return null;
        }
        long mo3358localToScreenMKHz9U = this.view.mo3358localToScreenMKHz9U(androidx.compose.ui.geometry.OffsetKt.Offset(intersect.getLeft(), intersect.getTop()));
        long mo3358localToScreenMKHz9U2 = this.view.mo3358localToScreenMKHz9U(androidx.compose.ui.geometry.OffsetKt.Offset(intersect.getRight(), intersect.getBottom()));
        return new android.graphics.RectF(androidx.compose.ui.geometry.Offset.m1871getXimpl(mo3358localToScreenMKHz9U), androidx.compose.ui.geometry.Offset.m1872getYimpl(mo3358localToScreenMKHz9U), androidx.compose.ui.geometry.Offset.m1871getXimpl(mo3358localToScreenMKHz9U2), androidx.compose.ui.geometry.Offset.m1872getYimpl(mo3358localToScreenMKHz9U2));
    }

    public final boolean dispatchHoverEvent$ui_release(android.view.MotionEvent event) {
        if (!isTouchExplorationEnabled()) {
            return false;
        }
        int action = event.getAction();
        if (action == 7 || action == 9) {
            int hitTestSemanticsAt$ui_release = hitTestSemanticsAt$ui_release(event.getX(), event.getY());
            boolean dispatchGenericMotionEvent = this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
            updateHoveredVirtualView(hitTestSemanticsAt$ui_release);
            if (hitTestSemanticsAt$ui_release == Integer.MIN_VALUE) {
                return dispatchGenericMotionEvent;
            }
            return true;
        }
        if (action != 10) {
            return false;
        }
        if (this.hoveredVirtualViewId != Integer.MIN_VALUE) {
            updateHoveredVirtualView(Integer.MIN_VALUE);
            return true;
        }
        return this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
    }

    public final int hitTestSemanticsAt$ui_release(float x, float y) {
        androidx.compose.ui.node.NodeChain nodes;
        boolean isVisible;
        androidx.compose.ui.node.Owner.CC.measureAndLayout$default(this.view, false, 1, null);
        androidx.compose.ui.node.HitTestResult hitTestResult = new androidx.compose.ui.node.HitTestResult();
        this.view.getRoot().m3537hitTestSemanticsM_7yMNQ$ui_release(androidx.compose.ui.geometry.OffsetKt.Offset(x, y), hitTestResult, (r13 & 4) != 0, (r13 & 8) != 0);
        androidx.compose.ui.Modifier.Node node = (androidx.compose.ui.Modifier.Node) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) hitTestResult);
        androidx.compose.ui.node.LayoutNode requireLayoutNode = node != null ? androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(node) : null;
        if (requireLayoutNode != null && (nodes = requireLayoutNode.getNodes()) != null && nodes.m3576hasH91voCI$ui_release(androidx.compose.ui.node.NodeKind.m3613constructorimpl(8))) {
            isVisible = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.isVisible(androidx.compose.ui.semantics.SemanticsNodeKt.SemanticsNode(requireLayoutNode, false));
            if (isVisible && this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(requireLayoutNode) == null) {
                return semanticsNodeIdToAccessibilityVirtualNodeId(requireLayoutNode.getSemanticsId());
            }
        }
        return Integer.MIN_VALUE;
    }

    private final void updateHoveredVirtualView(int virtualViewId) {
        int i = this.hoveredVirtualViewId;
        if (i == virtualViewId) {
            return;
        }
        this.hoveredVirtualViewId = virtualViewId;
        sendEventForVirtualView$default(this, virtualViewId, 128, null, null, 12, null);
        sendEventForVirtualView$default(this, i, 256, null, null, 12, null);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public androidx.core.view.accessibility.AccessibilityNodeProviderCompat getAccessibilityNodeProvider(android.view.View host) {
        return this.nodeProvider;
    }

    private final <T extends java.lang.CharSequence> T trimToSize(T text, int size) {
        if (size <= 0) {
            throw new java.lang.IllegalArgumentException("size should be greater than 0".toString());
        }
        if (text == null || text.length() == 0 || text.length() <= size) {
            return text;
        }
        int i = size - 1;
        if (java.lang.Character.isHighSurrogate(text.charAt(i)) && java.lang.Character.isLowSurrogate(text.charAt(size))) {
            size = i;
        }
        T t = (T) text.subSequence(0, size);
        kotlin.jvm.internal.Intrinsics.checkNotNull(t, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void semanticsChangeChecker$lambda$46(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        androidx.compose.ui.node.Owner.CC.measureAndLayout$default(androidComposeViewAccessibilityDelegateCompat.view, false, 1, null);
        androidComposeViewAccessibilityDelegateCompat.checkForSemanticsChanges();
        androidComposeViewAccessibilityDelegateCompat.checkingForSemanticsChanges = false;
    }

    public final void onSemanticsChange$ui_release() {
        this.currentSemanticsNodesInvalidated = true;
        if (!isEnabled() || this.checkingForSemanticsChanges) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        this.handler.post(this.semanticsChangeChecker);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080 A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:12:0x0036, B:14:0x0066, B:19:0x0078, B:21:0x0080, B:23:0x0089, B:24:0x008c, B:26:0x0092, B:28:0x009b, B:30:0x00ac, B:32:0x00b3, B:33:0x00bc, B:42:0x004f), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00d9 -> B:13:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object boundsUpdatesEventLoop$ui_release(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1;
        int i;
        androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat;
        androidx.collection.ArraySet<java.lang.Integer> arraySet;
        kotlinx.coroutines.channels.ChannelIterator<kotlin.Unit> it;
        androidx.collection.ArraySet<java.lang.Integer> arraySet2;
        java.lang.Object hasNext;
        try {
            if (continuation instanceof androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1) {
                androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 = (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1) continuation;
                if ((androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label & Integer.MIN_VALUE) != 0) {
                    androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label -= Integer.MIN_VALUE;
                    java.lang.Object obj = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        try {
                            arraySet = new androidx.collection.ArraySet<>(0, 1, null);
                            it = this.boundsUpdateChannel.iterator();
                            androidComposeViewAccessibilityDelegateCompat = this;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0 = androidComposeViewAccessibilityDelegateCompat;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1 = arraySet;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$2 = it;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label = 1;
                            hasNext = it.hasNext(androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1);
                            if (hasNext == coroutine_suspended) {
                            }
                        } catch (java.lang.Throwable th) {
                            th = th;
                            androidComposeViewAccessibilityDelegateCompat = this;
                            androidComposeViewAccessibilityDelegateCompat.subtreeChangedLayoutNodes.clear();
                            throw th;
                        }
                    } else if (i == 1) {
                        it = (kotlinx.coroutines.channels.ChannelIterator) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$2;
                        arraySet2 = (androidx.collection.ArraySet) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1;
                        androidComposeViewAccessibilityDelegateCompat = (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (kotlinx.coroutines.channels.ChannelIterator) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$2;
                        arraySet2 = (androidx.collection.ArraySet) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1;
                        androidComposeViewAccessibilityDelegateCompat = (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        arraySet = arraySet2;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0 = androidComposeViewAccessibilityDelegateCompat;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1 = arraySet;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$2 = it;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label = 1;
                        hasNext = it.hasNext(androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1);
                        if (hasNext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        arraySet2 = arraySet;
                        obj = hasNext;
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            it.next();
                            if (androidComposeViewAccessibilityDelegateCompat.isEnabledForContentCapture()) {
                                androidComposeViewAccessibilityDelegateCompat.notifyContentCaptureChanges();
                            }
                            if (androidComposeViewAccessibilityDelegateCompat.isEnabledForAccessibility$ui_release()) {
                                int size = androidComposeViewAccessibilityDelegateCompat.subtreeChangedLayoutNodes.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    androidx.compose.ui.node.LayoutNode valueAt = androidComposeViewAccessibilityDelegateCompat.subtreeChangedLayoutNodes.valueAt(i2);
                                    androidComposeViewAccessibilityDelegateCompat.sendSubtreeChangeAccessibilityEvents(valueAt, arraySet2);
                                    androidComposeViewAccessibilityDelegateCompat.sendTypeViewScrolledAccessibilityEvent(valueAt);
                                }
                                arraySet2.clear();
                                if (!androidComposeViewAccessibilityDelegateCompat.checkingForSemanticsChanges) {
                                    androidComposeViewAccessibilityDelegateCompat.checkingForSemanticsChanges = true;
                                    androidComposeViewAccessibilityDelegateCompat.handler.post(androidComposeViewAccessibilityDelegateCompat.semanticsChangeChecker);
                                }
                            }
                            androidComposeViewAccessibilityDelegateCompat.subtreeChangedLayoutNodes.clear();
                            androidComposeViewAccessibilityDelegateCompat.pendingHorizontalScrollEvents.clear();
                            androidComposeViewAccessibilityDelegateCompat.pendingVerticalScrollEvents.clear();
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0 = androidComposeViewAccessibilityDelegateCompat;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1 = arraySet2;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$2 = it;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label = 2;
                            if (kotlinx.coroutines.DelayKt.delay(100L, androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            arraySet = arraySet2;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0 = androidComposeViewAccessibilityDelegateCompat;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1 = arraySet;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$2 = it;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label = 1;
                            hasNext = it.hasNext(androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1);
                            if (hasNext == coroutine_suspended) {
                            }
                        } else {
                            androidComposeViewAccessibilityDelegateCompat.subtreeChangedLayoutNodes.clear();
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                }
            }
            if (i != 0) {
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1(this, continuation);
        java.lang.Object obj2 = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label;
    }

    public final void onLayoutChange$ui_release(androidx.compose.ui.node.LayoutNode layoutNode) {
        this.currentSemanticsNodesInvalidated = true;
        if (isEnabled()) {
            notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifySubtreeAccessibilityStateChangedIfNeeded(androidx.compose.ui.node.LayoutNode layoutNode) {
        if (this.subtreeChangedLayoutNodes.add(layoutNode)) {
            this.boundsUpdateChannel.mo10716trySendJP2dKIU(kotlin.Unit.INSTANCE);
        }
    }

    private final void sendTypeViewScrolledAccessibilityEvent(androidx.compose.ui.node.LayoutNode layoutNode) {
        if (layoutNode.isAttached() && !this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            int semanticsId = layoutNode.getSemanticsId();
            androidx.compose.ui.semantics.ScrollAxisRange scrollAxisRange = this.pendingHorizontalScrollEvents.get(java.lang.Integer.valueOf(semanticsId));
            androidx.compose.ui.semantics.ScrollAxisRange scrollAxisRange2 = this.pendingVerticalScrollEvents.get(java.lang.Integer.valueOf(semanticsId));
            if (scrollAxisRange == null && scrollAxisRange2 == null) {
                return;
            }
            android.view.accessibility.AccessibilityEvent createEvent = createEvent(semanticsId, 4096);
            if (scrollAxisRange != null) {
                createEvent.setScrollX((int) scrollAxisRange.getValue().invoke().floatValue());
                createEvent.setMaxScrollX((int) scrollAxisRange.getMaxValue().invoke().floatValue());
            }
            if (scrollAxisRange2 != null) {
                createEvent.setScrollY((int) scrollAxisRange2.getValue().invoke().floatValue());
                createEvent.setMaxScrollY((int) scrollAxisRange2.getMaxValue().invoke().floatValue());
            }
            sendEvent(createEvent);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(r8, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1.INSTANCE);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void sendSubtreeChangeAccessibilityEvents(androidx.compose.ui.node.LayoutNode layoutNode, androidx.collection.ArraySet<java.lang.Integer> subtreeChangedSemanticsNodesIds) {
        androidx.compose.ui.semantics.SemanticsConfiguration collapsedSemantics$ui_release;
        androidx.compose.ui.node.LayoutNode findClosestParentNode;
        boolean isAncestorOf;
        if (layoutNode.isAttached() && !this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            int size = this.subtreeChangedLayoutNodes.size();
            for (int i = 0; i < size; i++) {
                isAncestorOf = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.isAncestorOf(this.subtreeChangedLayoutNodes.valueAt(i), layoutNode);
                if (isAncestorOf) {
                    return;
                }
            }
            if (!layoutNode.getNodes().m3576hasH91voCI$ui_release(androidx.compose.ui.node.NodeKind.m3613constructorimpl(8))) {
                layoutNode = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(layoutNode, new kotlin.jvm.functions.Function1<androidx.compose.ui.node.LayoutNode, java.lang.Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Boolean invoke(androidx.compose.ui.node.LayoutNode layoutNode2) {
                        return java.lang.Boolean.valueOf(layoutNode2.getNodes().m3576hasH91voCI$ui_release(androidx.compose.ui.node.NodeKind.m3613constructorimpl(8)));
                    }
                });
            }
            if (layoutNode == null || (collapsedSemantics$ui_release = layoutNode.getCollapsedSemantics$ui_release()) == null) {
                return;
            }
            if (!collapsedSemantics$ui_release.getIsMergingSemanticsOfDescendants() && findClosestParentNode != null) {
                layoutNode = findClosestParentNode;
            }
            if (layoutNode != null) {
                int semanticsId = layoutNode.getSemanticsId();
                if (subtreeChangedSemanticsNodesIds.add(java.lang.Integer.valueOf(semanticsId))) {
                    sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(semanticsId), 2048, 1, null, 8, null);
                }
            }
        }
    }

    private final void checkForSemanticsChanges() {
        if (isEnabledForAccessibility$ui_release()) {
            sendAccessibilitySemanticsStructureChangeEvents(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), this.previousSemanticsRoot);
        }
        if (isEnabledForContentCapture()) {
            sendContentCaptureSemanticsStructureChangeEvents(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), this.previousSemanticsRoot);
        }
        sendSemanticsPropertyChangeEvents(getCurrentSemanticsNodes());
        updateSemanticsNodesCopyAndPanes();
    }

    private final void updateSemanticsNodesCopyAndPanes() {
        boolean hasPaneTitle;
        androidx.compose.ui.semantics.SemanticsConfiguration unmergedConfig;
        boolean hasPaneTitle2;
        androidx.collection.ArraySet<? extends java.lang.Integer> arraySet = new androidx.collection.ArraySet<>(0, 1, null);
        java.util.Iterator<java.lang.Integer> it = this.paneDisplayed.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(java.lang.Integer.valueOf(intValue));
            androidx.compose.ui.semantics.SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
            if (semanticsNode != null) {
                hasPaneTitle2 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.hasPaneTitle(semanticsNode);
                if (!hasPaneTitle2) {
                }
            }
            arraySet.add(java.lang.Integer.valueOf(intValue));
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.SemanticsNodeCopy semanticsNodeCopy = this.previousSemanticsNodes.get(java.lang.Integer.valueOf(intValue));
            sendPaneChangeEvents(intValue, 32, (semanticsNodeCopy == null || (unmergedConfig = semanticsNodeCopy.getUnmergedConfig()) == null) ? null : (java.lang.String) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(unmergedConfig, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getPaneTitle()));
        }
        this.paneDisplayed.removeAll(arraySet);
        this.previousSemanticsNodes.clear();
        for (java.util.Map.Entry<java.lang.Integer, androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds> entry : getCurrentSemanticsNodes().entrySet()) {
            hasPaneTitle = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.hasPaneTitle(entry.getValue().getSemanticsNode());
            if (hasPaneTitle && this.paneDisplayed.add(entry.getKey())) {
                sendPaneChangeEvents(entry.getKey().intValue(), 16, (java.lang.String) entry.getValue().getSemanticsNode().getUnmergedConfig().get(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getPaneTitle()));
            }
            this.previousSemanticsNodes.put(entry.getKey(), new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.SemanticsNodeCopy(entry.getValue().getSemanticsNode(), getCurrentSemanticsNodes()));
        }
        this.previousSemanticsRoot = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.SemanticsNodeCopy(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), getCurrentSemanticsNodes());
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0601, code lost:
    
        if (r0.containsAll(r2) != false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0604, code lost:
    
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0644, code lost:
    
        if (r0 == false) goto L176;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void sendSemanticsPropertyChangeEvents(java.util.Map<java.lang.Integer, androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds> newSemanticsNodes) {
        java.util.ArrayList arrayList;
        android.view.accessibility.AccessibilityEvent createTextSelectionChangedEvent;
        java.lang.String text;
        androidx.compose.ui.platform.ScrollObservationScope findById;
        boolean accessibilityEquals;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(this.scrollObservationScopes);
        this.scrollObservationScopes.clear();
        java.util.Iterator<java.lang.Integer> it = newSemanticsNodes.keySet().iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.SemanticsNodeCopy semanticsNodeCopy = this.previousSemanticsNodes.get(java.lang.Integer.valueOf(intValue));
            androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = newSemanticsNodes.get(java.lang.Integer.valueOf(intValue));
            androidx.compose.ui.semantics.SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
            if (semanticsNode == null) {
                throw new java.lang.IllegalStateException("no value for specified key".toString());
            }
            if (semanticsNodeCopy == null) {
                java.util.Iterator<java.util.Map.Entry<? extends androidx.compose.ui.semantics.SemanticsPropertyKey<?>, ? extends java.lang.Object>> it2 = semanticsNode.getUnmergedConfig().iterator();
                while (it2.hasNext()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(it2.next().getKey(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getText())) {
                        java.util.List list = (java.util.List) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getText());
                        sendContentCaptureTextUpdateEvent(semanticsNode.getId(), java.lang.String.valueOf(list != null ? (androidx.compose.ui.text.AnnotatedString) kotlin.collections.CollectionsKt.firstOrNull(list) : null));
                    }
                }
            } else {
                java.util.Iterator<java.util.Map.Entry<? extends androidx.compose.ui.semantics.SemanticsPropertyKey<?>, ? extends java.lang.Object>> it3 = semanticsNode.getUnmergedConfig().iterator();
                boolean z = false;
                while (it3.hasNext()) {
                    java.util.Map.Entry<? extends androidx.compose.ui.semantics.SemanticsPropertyKey<?>, ? extends java.lang.Object> next = it3.next();
                    if (((kotlin.jvm.internal.Intrinsics.areEqual(next.getKey(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange()) || kotlin.jvm.internal.Intrinsics.areEqual(next.getKey(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getVerticalScrollAxisRange())) && registerScrollingId(intValue, arrayList2)) || !kotlin.jvm.internal.Intrinsics.areEqual(next.getValue(), androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), next.getKey()))) {
                        androidx.compose.ui.semantics.SemanticsPropertyKey<?> key = next.getKey();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(key, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getText())) {
                            java.util.List list2 = (java.util.List) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getText());
                            androidx.compose.ui.text.AnnotatedString annotatedString = list2 != null ? (androidx.compose.ui.text.AnnotatedString) kotlin.collections.CollectionsKt.firstOrNull(list2) : null;
                            java.util.List list3 = (java.util.List) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getText());
                            androidx.compose.ui.text.AnnotatedString annotatedString2 = list3 != null ? (androidx.compose.ui.text.AnnotatedString) kotlin.collections.CollectionsKt.firstOrNull(list3) : null;
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(annotatedString, annotatedString2)) {
                                sendContentCaptureTextUpdateEvent(semanticsNode.getId(), java.lang.String.valueOf(annotatedString2));
                            }
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(key, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getPaneTitle())) {
                            java.lang.Object value = next.getValue();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str = (java.lang.String) value;
                            if (semanticsNodeCopy.hasPaneTitle()) {
                                sendPaneChangeEvents(intValue, 8, str);
                            }
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(key, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getStateDescription()) || kotlin.jvm.internal.Intrinsics.areEqual(key, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getToggleableState())) {
                            sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 2048, 64, null, 8, null);
                            sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 2048, 0, null, 8, null);
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(key, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getProgressBarRangeInfo())) {
                            sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 2048, 64, null, 8, null);
                            sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 2048, 0, null, 8, null);
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(key, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getSelected())) {
                            androidx.compose.ui.semantics.Role role = (androidx.compose.ui.semantics.Role) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getRole());
                            int m3798getTabo7Vup1c = androidx.compose.ui.semantics.Role.INSTANCE.m3798getTabo7Vup1c();
                            if (role != null && androidx.compose.ui.semantics.Role.m3788equalsimpl0(role.getValue(), m3798getTabo7Vup1c)) {
                                if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getSelected()), (java.lang.Object) true)) {
                                    android.view.accessibility.AccessibilityEvent createEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 4);
                                    androidx.compose.ui.semantics.SemanticsNode copyWithMergingEnabled$ui_release = semanticsNode.copyWithMergingEnabled$ui_release();
                                    java.util.List list4 = (java.util.List) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(copyWithMergingEnabled$ui_release.getConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getContentDescription());
                                    java.lang.String fastJoinToString$default = list4 != null ? androidx.compose.ui.util.ListUtilsKt.fastJoinToString$default(list4, ",", null, null, 0, null, null, 62, null) : null;
                                    java.util.List list5 = (java.util.List) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(copyWithMergingEnabled$ui_release.getConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getText());
                                    java.lang.String fastJoinToString$default2 = list5 != null ? androidx.compose.ui.util.ListUtilsKt.fastJoinToString$default(list5, ",", null, null, 0, null, null, 62, null) : null;
                                    if (fastJoinToString$default != null) {
                                        createEvent.setContentDescription(fastJoinToString$default);
                                    }
                                    if (fastJoinToString$default2 != null) {
                                        createEvent.getText().add(fastJoinToString$default2);
                                    }
                                    sendEvent(createEvent);
                                } else {
                                    sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 2048, 0, null, 8, null);
                                }
                            } else {
                                sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 2048, 64, null, 8, null);
                                sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 2048, 0, null, 8, null);
                            }
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(key, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getContentDescription())) {
                            int semanticsNodeIdToAccessibilityVirtualNodeId = semanticsNodeIdToAccessibilityVirtualNodeId(intValue);
                            java.lang.Object value2 = next.getValue();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            sendEventForVirtualView(semanticsNodeIdToAccessibilityVirtualNodeId, 2048, 4, (java.util.List) value2);
                        } else {
                            java.lang.String str2 = "";
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(key, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getEditableText())) {
                                arrayList = arrayList2;
                                if (kotlin.jvm.internal.Intrinsics.areEqual(key, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTextSelectionRange())) {
                                    androidx.compose.ui.text.AnnotatedString textForTextField = getTextForTextField(semanticsNode.getUnmergedConfig());
                                    if (textForTextField != null && (text = textForTextField.getText()) != null) {
                                        str2 = text;
                                    }
                                    long packedValue = ((androidx.compose.ui.text.TextRange) semanticsNode.getUnmergedConfig().get(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTextSelectionRange())).getPackedValue();
                                    sendEvent(createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId(intValue), java.lang.Integer.valueOf(androidx.compose.ui.text.TextRange.m3964getStartimpl(packedValue)), java.lang.Integer.valueOf(androidx.compose.ui.text.TextRange.m3959getEndimpl(packedValue)), java.lang.Integer.valueOf(str2.length()), trimToSize(str2, 100000)));
                                    sendPendingTextTraversedAtGranularityEvent(semanticsNode.getId());
                                } else if (kotlin.jvm.internal.Intrinsics.areEqual(key, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange()) || kotlin.jvm.internal.Intrinsics.areEqual(key, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getVerticalScrollAxisRange())) {
                                    notifySubtreeAccessibilityStateChangedIfNeeded(semanticsNode.getLayoutNode());
                                    findById = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.findById(this.scrollObservationScopes, intValue);
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(findById);
                                    findById.setHorizontalScrollAxisRange((androidx.compose.ui.semantics.ScrollAxisRange) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange()));
                                    findById.setVerticalScrollAxisRange((androidx.compose.ui.semantics.ScrollAxisRange) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getVerticalScrollAxisRange()));
                                    scheduleScrollEventIfNeeded(findById);
                                } else if (kotlin.jvm.internal.Intrinsics.areEqual(key, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getFocused())) {
                                    java.lang.Object value3 = next.getValue();
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type kotlin.Boolean");
                                    if (((java.lang.Boolean) value3).booleanValue()) {
                                        sendEvent(createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode.getId()), 8));
                                    }
                                    sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode.getId()), 2048, 0, null, 8, null);
                                } else if (kotlin.jvm.internal.Intrinsics.areEqual(key, androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getCustomActions())) {
                                    java.util.List list6 = (java.util.List) semanticsNode.getUnmergedConfig().get(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getCustomActions());
                                    java.util.List list7 = (java.util.List) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getCustomActions());
                                    if (list7 != null) {
                                        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
                                        int size = list6.size();
                                        for (int i = 0; i < size; i++) {
                                            linkedHashSet.add(((androidx.compose.ui.semantics.CustomAccessibilityAction) list6.get(i)).getLabel());
                                        }
                                        java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
                                        int size2 = list7.size();
                                        for (int i2 = 0; i2 < size2; i2++) {
                                            linkedHashSet2.add(((androidx.compose.ui.semantics.CustomAccessibilityAction) list7.get(i2)).getLabel());
                                        }
                                        if (linkedHashSet.containsAll(linkedHashSet2)) {
                                        }
                                        z = true;
                                    } else if (!list6.isEmpty()) {
                                        arrayList2 = arrayList;
                                        z = true;
                                    }
                                } else {
                                    if (next.getValue() instanceof androidx.compose.ui.semantics.AccessibilityAction) {
                                        java.lang.Object value4 = next.getValue();
                                        kotlin.jvm.internal.Intrinsics.checkNotNull(value4, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                                        accessibilityEquals = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.accessibilityEquals((androidx.compose.ui.semantics.AccessibilityAction) value4, androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), next.getKey()));
                                    }
                                    z = true;
                                }
                            } else if (semanticsNode.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetText())) {
                                androidx.compose.ui.text.AnnotatedString textForTextField2 = getTextForTextField(semanticsNodeCopy.getUnmergedConfig());
                                java.lang.String str3 = textForTextField2 != null ? textForTextField2 : "";
                                androidx.compose.ui.text.AnnotatedString textForTextField3 = getTextForTextField(semanticsNode.getUnmergedConfig());
                                java.lang.String str4 = textForTextField3 != null ? textForTextField3 : "";
                                java.lang.CharSequence trimToSize = trimToSize(str4, 100000);
                                int length = str3.length();
                                int length2 = str4.length();
                                int coerceAtMost = kotlin.ranges.RangesKt.coerceAtMost(length, length2);
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= coerceAtMost) {
                                        arrayList = arrayList2;
                                        break;
                                    }
                                    arrayList = arrayList2;
                                    if (str3.charAt(i3) != str4.charAt(i3)) {
                                        break;
                                    }
                                    i3++;
                                    arrayList2 = arrayList;
                                }
                                int i4 = 0;
                                while (i4 < coerceAtMost - i3) {
                                    int i5 = coerceAtMost;
                                    if (str3.charAt((length - 1) - i4) != str4.charAt((length2 - 1) - i4)) {
                                        break;
                                    }
                                    i4++;
                                    coerceAtMost = i5;
                                }
                                int i6 = (length - i4) - i3;
                                int i7 = (length2 - i4) - i3;
                                boolean z2 = semanticsNodeCopy.getSemanticsNode().getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetText()) && !semanticsNodeCopy.getSemanticsNode().getConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getPassword()) && semanticsNode.getConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getPassword());
                                boolean z3 = semanticsNodeCopy.getSemanticsNode().getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetText()) && semanticsNodeCopy.getSemanticsNode().getConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getPassword()) && !semanticsNode.getConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getPassword());
                                if (z2 || z3) {
                                    createTextSelectionChangedEvent = createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 0, 0, java.lang.Integer.valueOf(length2), trimToSize);
                                } else {
                                    createTextSelectionChangedEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 16);
                                    createTextSelectionChangedEvent.setFromIndex(i3);
                                    createTextSelectionChangedEvent.setRemovedCount(i6);
                                    createTextSelectionChangedEvent.setAddedCount(i7);
                                    createTextSelectionChangedEvent.setBeforeText(str3);
                                    createTextSelectionChangedEvent.getText().add(trimToSize);
                                }
                                createTextSelectionChangedEvent.setClassName(TextFieldClassName);
                                sendEvent(createTextSelectionChangedEvent);
                                if (z2 || z3) {
                                    long packedValue2 = ((androidx.compose.ui.text.TextRange) semanticsNode.getUnmergedConfig().get(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTextSelectionRange())).getPackedValue();
                                    createTextSelectionChangedEvent.setFromIndex(androidx.compose.ui.text.TextRange.m3964getStartimpl(packedValue2));
                                    createTextSelectionChangedEvent.setToIndex(androidx.compose.ui.text.TextRange.m3959getEndimpl(packedValue2));
                                    sendEvent(createTextSelectionChangedEvent);
                                }
                            } else {
                                arrayList = arrayList2;
                                sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 2048, 2, null, 8, null);
                            }
                            arrayList2 = arrayList;
                        }
                    }
                    arrayList = arrayList2;
                    arrayList2 = arrayList;
                }
                java.util.ArrayList arrayList3 = arrayList2;
                if (!z) {
                    z = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.propertiesDeleted(semanticsNode, semanticsNodeCopy.getUnmergedConfig());
                }
                if (z) {
                    sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 2048, 0, null, 8, null);
                }
                arrayList2 = arrayList3;
            }
        }
    }

    private final void sendContentCaptureTextUpdateEvent(int id, java.lang.String newText) {
        androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat contentCaptureSessionCompat = this.contentCaptureSession;
        if (contentCaptureSessionCompat != null && android.os.Build.VERSION.SDK_INT >= 29) {
            android.view.autofill.AutofillId newAutofillId = contentCaptureSessionCompat.newAutofillId(id);
            if (newAutofillId == null) {
                throw new java.lang.IllegalStateException("Invalid content capture ID".toString());
            }
            contentCaptureSessionCompat.notifyViewTextChanged(newAutofillId, newText);
        }
    }

    private final boolean registerScrollingId(int id, java.util.List<androidx.compose.ui.platform.ScrollObservationScope> oldScrollObservationScopes) {
        androidx.compose.ui.platform.ScrollObservationScope findById;
        boolean z;
        findById = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.findById(oldScrollObservationScopes, id);
        if (findById != null) {
            z = false;
        } else {
            findById = new androidx.compose.ui.platform.ScrollObservationScope(id, this.scrollObservationScopes, null, null, null, null);
            z = true;
        }
        this.scrollObservationScopes.add(findById);
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleScrollEventIfNeeded(final androidx.compose.ui.platform.ScrollObservationScope scrollObservationScope) {
        if (scrollObservationScope.isValidOwnerScope()) {
            this.view.getSnapshotObserver().observeReads$ui_release(scrollObservationScope, this.scheduleScrollEventIfNeededLambda, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    int semanticsNodeIdToAccessibilityVirtualNodeId;
                    androidx.compose.ui.semantics.SemanticsNode semanticsNode;
                    androidx.compose.ui.node.LayoutNode layoutNode;
                    java.util.HashMap hashMap;
                    java.util.HashMap hashMap2;
                    android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo;
                    android.graphics.Rect boundsInScreen;
                    androidx.compose.ui.semantics.ScrollAxisRange horizontalScrollAxisRange = androidx.compose.ui.platform.ScrollObservationScope.this.getHorizontalScrollAxisRange();
                    androidx.compose.ui.semantics.ScrollAxisRange verticalScrollAxisRange = androidx.compose.ui.platform.ScrollObservationScope.this.getVerticalScrollAxisRange();
                    java.lang.Float oldXValue = androidx.compose.ui.platform.ScrollObservationScope.this.getOldXValue();
                    java.lang.Float oldYValue = androidx.compose.ui.platform.ScrollObservationScope.this.getOldYValue();
                    float floatValue = (horizontalScrollAxisRange == null || oldXValue == null) ? 0.0f : horizontalScrollAxisRange.getValue().invoke().floatValue() - oldXValue.floatValue();
                    float floatValue2 = (verticalScrollAxisRange == null || oldYValue == null) ? 0.0f : verticalScrollAxisRange.getValue().invoke().floatValue() - oldYValue.floatValue();
                    if (floatValue != 0.0f || floatValue2 != 0.0f) {
                        semanticsNodeIdToAccessibilityVirtualNodeId = this.semanticsNodeIdToAccessibilityVirtualNodeId(androidx.compose.ui.platform.ScrollObservationScope.this.getSemanticsNodeId());
                        androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds) this.getCurrentSemanticsNodes().get(java.lang.Integer.valueOf(this.focusedVirtualViewId));
                        if (semanticsNodeWithAdjustedBounds != null) {
                            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this;
                            try {
                                accessibilityNodeInfo = androidComposeViewAccessibilityDelegateCompat.currentlyFocusedANI;
                                if (accessibilityNodeInfo != null) {
                                    boundsInScreen = androidComposeViewAccessibilityDelegateCompat.boundsInScreen(semanticsNodeWithAdjustedBounds);
                                    accessibilityNodeInfo.setBoundsInScreen(boundsInScreen);
                                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                }
                            } catch (java.lang.IllegalStateException unused) {
                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                            }
                        }
                        this.getView().invalidate();
                        androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds2 = (androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds) this.getCurrentSemanticsNodes().get(java.lang.Integer.valueOf(semanticsNodeIdToAccessibilityVirtualNodeId));
                        if (semanticsNodeWithAdjustedBounds2 != null && (semanticsNode = semanticsNodeWithAdjustedBounds2.getSemanticsNode()) != null && (layoutNode = semanticsNode.getLayoutNode()) != null) {
                            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = this;
                            if (horizontalScrollAxisRange != null) {
                                java.lang.Integer valueOf = java.lang.Integer.valueOf(semanticsNodeIdToAccessibilityVirtualNodeId);
                                hashMap2 = androidComposeViewAccessibilityDelegateCompat2.pendingHorizontalScrollEvents;
                                hashMap2.put(valueOf, horizontalScrollAxisRange);
                            }
                            if (verticalScrollAxisRange != null) {
                                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(semanticsNodeIdToAccessibilityVirtualNodeId);
                                hashMap = androidComposeViewAccessibilityDelegateCompat2.pendingVerticalScrollEvents;
                                hashMap.put(valueOf2, verticalScrollAxisRange);
                            }
                            androidComposeViewAccessibilityDelegateCompat2.notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode);
                        }
                    }
                    if (horizontalScrollAxisRange != null) {
                        androidx.compose.ui.platform.ScrollObservationScope.this.setOldXValue(horizontalScrollAxisRange.getValue().invoke());
                    }
                    if (verticalScrollAxisRange != null) {
                        androidx.compose.ui.platform.ScrollObservationScope.this.setOldYValue(verticalScrollAxisRange.getValue().invoke());
                    }
                }
            });
        }
    }

    private final void sendPaneChangeEvents(int semanticsNodeId, int contentChangeType, java.lang.String title) {
        android.view.accessibility.AccessibilityEvent createEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNodeId), 32);
        createEvent.setContentChangeTypes(contentChangeType);
        if (title != null) {
            createEvent.getText().add(title);
        }
        sendEvent(createEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat getContentCaptureSessionCompat(android.view.View view) {
        androidx.compose.ui.platform.coreshims.ViewCompatShims.setImportantForContentCapture(view, 1);
        return androidx.compose.ui.platform.coreshims.ViewCompatShims.getContentCaptureSession(view);
    }

    private final androidx.compose.ui.text.TextLayoutResult getTextLayoutResult(androidx.compose.ui.semantics.SemanticsConfiguration configuration) {
        kotlin.jvm.functions.Function1 function1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(configuration, androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getGetTextLayoutResult());
        if (accessibilityAction == null || (function1 = (kotlin.jvm.functions.Function1) accessibilityAction.getAction()) == null || !((java.lang.Boolean) function1.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (androidx.compose.ui.text.TextLayoutResult) arrayList.get(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:
    
        r1 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.m3707toLegacyClassNameV4PA4sw(r1.getValue());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final androidx.compose.ui.platform.coreshims.ViewStructureCompat toViewStructure(androidx.compose.ui.semantics.SemanticsNode semanticsNode) {
        androidx.compose.ui.platform.coreshims.AutofillIdCompat autofillId;
        android.view.autofill.AutofillId autofillId2;
        java.lang.String m3707toLegacyClassNameV4PA4sw;
        androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat contentCaptureSessionCompat = this.contentCaptureSession;
        if (contentCaptureSessionCompat == null || android.os.Build.VERSION.SDK_INT < 29 || (autofillId = androidx.compose.ui.platform.coreshims.ViewCompatShims.getAutofillId(this.view)) == null) {
            return null;
        }
        if (semanticsNode.getParent() != null) {
            autofillId2 = contentCaptureSessionCompat.newAutofillId(r3.getId());
            if (autofillId2 == null) {
                return null;
            }
        } else {
            autofillId2 = autofillId.toAutofillId();
        }
        androidx.compose.ui.platform.coreshims.ViewStructureCompat newVirtualViewStructure = contentCaptureSessionCompat.newVirtualViewStructure(autofillId2, semanticsNode.getId());
        if (newVirtualViewStructure == null) {
            return null;
        }
        androidx.compose.ui.semantics.SemanticsConfiguration unmergedConfig = semanticsNode.getUnmergedConfig();
        if (unmergedConfig.contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getPassword())) {
            return null;
        }
        java.util.List list = (java.util.List) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(unmergedConfig, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getText());
        if (list != null) {
            newVirtualViewStructure.setClassName(TextClassName);
            newVirtualViewStructure.setText(androidx.compose.ui.util.ListUtilsKt.fastJoinToString$default(list, "\n", null, null, 0, null, null, 62, null));
        }
        androidx.compose.ui.text.AnnotatedString annotatedString = (androidx.compose.ui.text.AnnotatedString) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(unmergedConfig, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getEditableText());
        if (annotatedString != null) {
            newVirtualViewStructure.setClassName(TextFieldClassName);
            newVirtualViewStructure.setText(annotatedString);
        }
        java.util.List list2 = (java.util.List) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(unmergedConfig, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getContentDescription());
        if (list2 != null) {
            newVirtualViewStructure.setContentDescription(androidx.compose.ui.util.ListUtilsKt.fastJoinToString$default(list2, "\n", null, null, 0, null, null, 62, null));
        }
        androidx.compose.ui.semantics.Role role = (androidx.compose.ui.semantics.Role) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(unmergedConfig, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getRole());
        if (role != null && m3707toLegacyClassNameV4PA4sw != null) {
            newVirtualViewStructure.setClassName(m3707toLegacyClassNameV4PA4sw);
        }
        androidx.compose.ui.text.TextLayoutResult textLayoutResult = getTextLayoutResult(unmergedConfig);
        if (textLayoutResult != null) {
            androidx.compose.ui.text.TextLayoutInput layoutInput = textLayoutResult.getLayoutInput();
            newVirtualViewStructure.setTextStyle(androidx.compose.ui.unit.TextUnit.m4673getValueimpl(layoutInput.getStyle().m3995getFontSizeXSAIIZE()) * layoutInput.getDensity().getDensity() * layoutInput.getDensity().getFontScale(), 0, 0, 0);
        }
        androidx.compose.ui.geometry.Rect boundsInParent$ui_release = semanticsNode.getBoundsInParent$ui_release();
        newVirtualViewStructure.setDimens((int) boundsInParent$ui_release.getLeft(), (int) boundsInParent$ui_release.getTop(), 0, 0, (int) boundsInParent$ui_release.getWidth(), (int) boundsInParent$ui_release.getHeight());
        return newVirtualViewStructure;
    }

    private final void bufferContentCaptureViewAppeared(int virtualId, androidx.compose.ui.platform.coreshims.ViewStructureCompat viewStructure) {
        if (viewStructure == null) {
            return;
        }
        if (this.bufferedContentCaptureDisappearedNodes.contains(java.lang.Integer.valueOf(virtualId))) {
            this.bufferedContentCaptureDisappearedNodes.remove(java.lang.Integer.valueOf(virtualId));
        } else {
            this.bufferedContentCaptureAppearedNodes.put(java.lang.Integer.valueOf(virtualId), viewStructure);
        }
    }

    private final void bufferContentCaptureViewDisappeared(int virtualId) {
        if (this.bufferedContentCaptureAppearedNodes.containsKey(java.lang.Integer.valueOf(virtualId))) {
            this.bufferedContentCaptureAppearedNodes.remove(java.lang.Integer.valueOf(virtualId));
        } else {
            this.bufferedContentCaptureDisappearedNodes.add(java.lang.Integer.valueOf(virtualId));
        }
    }

    private final void notifyContentCaptureChanges() {
        androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat contentCaptureSessionCompat = this.contentCaptureSession;
        if (contentCaptureSessionCompat != null && android.os.Build.VERSION.SDK_INT >= 29) {
            if (!this.bufferedContentCaptureAppearedNodes.isEmpty()) {
                java.util.List list = kotlin.collections.CollectionsKt.toList(this.bufferedContentCaptureAppearedNodes.values());
                java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(((androidx.compose.ui.platform.coreshims.ViewStructureCompat) list.get(i)).toViewStructure());
                }
                contentCaptureSessionCompat.notifyViewsAppeared(arrayList);
                this.bufferedContentCaptureAppearedNodes.clear();
            }
            if (!this.bufferedContentCaptureDisappearedNodes.isEmpty()) {
                java.util.List list2 = kotlin.collections.CollectionsKt.toList(this.bufferedContentCaptureDisappearedNodes);
                java.util.ArrayList arrayList2 = new java.util.ArrayList(list2.size());
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList2.add(java.lang.Long.valueOf(((java.lang.Number) list2.get(i2)).intValue()));
                }
                contentCaptureSessionCompat.notifyViewsDisappeared(kotlin.collections.CollectionsKt.toLongArray(arrayList2));
                this.bufferedContentCaptureDisappearedNodes.clear();
            }
        }
    }

    private final void updateContentCaptureBuffersOnAppeared(androidx.compose.ui.semantics.SemanticsNode node) {
        if (isEnabledForContentCapture()) {
            updateTranslationOnAppeared(node);
            bufferContentCaptureViewAppeared(node.getId(), toViewStructure(node));
            java.util.List<androidx.compose.ui.semantics.SemanticsNode> replacedChildren$ui_release = node.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i = 0; i < size; i++) {
                updateContentCaptureBuffersOnAppeared(replacedChildren$ui_release.get(i));
            }
        }
    }

    private final void updateContentCaptureBuffersOnDisappeared(androidx.compose.ui.semantics.SemanticsNode node) {
        if (isEnabledForContentCapture()) {
            bufferContentCaptureViewDisappeared(node.getId());
            java.util.List<androidx.compose.ui.semantics.SemanticsNode> replacedChildren$ui_release = node.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i = 0; i < size; i++) {
                updateContentCaptureBuffersOnDisappeared(replacedChildren$ui_release.get(i));
            }
        }
    }

    private final void updateTranslationOnAppeared(androidx.compose.ui.semantics.SemanticsNode node) {
        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction;
        kotlin.jvm.functions.Function1 function1;
        kotlin.jvm.functions.Function1 function12;
        androidx.compose.ui.semantics.SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        java.lang.Boolean bool = (java.lang.Boolean) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(unmergedConfig, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsShowingTextSubstitution());
        if (this.translateStatus == androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.TranslateStatus.SHOW_ORIGINAL && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) bool, (java.lang.Object) true)) {
            androidx.compose.ui.semantics.AccessibilityAction accessibilityAction2 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(unmergedConfig, androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getShowTextSubstitution());
            if (accessibilityAction2 == null || (function12 = (kotlin.jvm.functions.Function1) accessibilityAction2.getAction()) == null) {
                return;
            }
            return;
        }
        if (this.translateStatus != androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.TranslateStatus.SHOW_TRANSLATED || !kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) bool, (java.lang.Object) false) || (accessibilityAction = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(unmergedConfig, androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getShowTextSubstitution())) == null || (function1 = (kotlin.jvm.functions.Function1) accessibilityAction.getAction()) == null) {
            return;
        }
    }

    public final void onShowTranslation$ui_release() {
        this.translateStatus = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.TranslateStatus.SHOW_TRANSLATED;
        showTranslatedText();
    }

    public final void onHideTranslation$ui_release() {
        this.translateStatus = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.TranslateStatus.SHOW_ORIGINAL;
        hideTranslatedText();
    }

    public final void onClearTranslation$ui_release() {
        this.translateStatus = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.TranslateStatus.SHOW_ORIGINAL;
        clearTranslatedText();
    }

    private final void showTranslatedText() {
        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction;
        kotlin.jvm.functions.Function1 function1;
        java.util.Iterator<androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds> it = getCurrentSemanticsNodes().values().iterator();
        while (it.hasNext()) {
            androidx.compose.ui.semantics.SemanticsConfiguration unmergedConfig = it.next().getSemanticsNode().getUnmergedConfig();
            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(unmergedConfig, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()), (java.lang.Object) false) && (accessibilityAction = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(unmergedConfig, androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getShowTextSubstitution())) != null && (function1 = (kotlin.jvm.functions.Function1) accessibilityAction.getAction()) != null) {
            }
        }
    }

    private final void hideTranslatedText() {
        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction;
        kotlin.jvm.functions.Function1 function1;
        java.util.Iterator<androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds> it = getCurrentSemanticsNodes().values().iterator();
        while (it.hasNext()) {
            androidx.compose.ui.semantics.SemanticsConfiguration unmergedConfig = it.next().getSemanticsNode().getUnmergedConfig();
            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(unmergedConfig, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()), (java.lang.Object) true) && (accessibilityAction = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(unmergedConfig, androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getShowTextSubstitution())) != null && (function1 = (kotlin.jvm.functions.Function1) accessibilityAction.getAction()) != null) {
            }
        }
    }

    private final void clearTranslatedText() {
        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction;
        kotlin.jvm.functions.Function0 function0;
        java.util.Iterator<androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds> it = getCurrentSemanticsNodes().values().iterator();
        while (it.hasNext()) {
            androidx.compose.ui.semantics.SemanticsConfiguration unmergedConfig = it.next().getSemanticsNode().getUnmergedConfig();
            if (androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(unmergedConfig, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()) != null && (accessibilityAction = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(unmergedConfig, androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getClearTextSubstitution())) != null && (function0 = (kotlin.jvm.functions.Function0) accessibilityAction.getAction()) != null) {
            }
        }
    }

    private final void sendAccessibilitySemanticsStructureChangeEvents(androidx.compose.ui.semantics.SemanticsNode newNode, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.SemanticsNodeCopy oldNode) {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.List<androidx.compose.ui.semantics.SemanticsNode> replacedChildren$ui_release = newNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.semantics.SemanticsNode semanticsNode = replacedChildren$ui_release.get(i);
            if (getCurrentSemanticsNodes().containsKey(java.lang.Integer.valueOf(semanticsNode.getId()))) {
                if (!oldNode.getChildren().contains(java.lang.Integer.valueOf(semanticsNode.getId()))) {
                    notifySubtreeAccessibilityStateChangedIfNeeded(newNode.getLayoutNode());
                    return;
                }
                linkedHashSet.add(java.lang.Integer.valueOf(semanticsNode.getId()));
            }
        }
        java.util.Iterator<java.lang.Integer> it = oldNode.getChildren().iterator();
        while (it.hasNext()) {
            if (!linkedHashSet.contains(java.lang.Integer.valueOf(it.next().intValue()))) {
                notifySubtreeAccessibilityStateChangedIfNeeded(newNode.getLayoutNode());
                return;
            }
        }
        java.util.List<androidx.compose.ui.semantics.SemanticsNode> replacedChildren$ui_release2 = newNode.getReplacedChildren$ui_release();
        int size2 = replacedChildren$ui_release2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            androidx.compose.ui.semantics.SemanticsNode semanticsNode2 = replacedChildren$ui_release2.get(i2);
            if (getCurrentSemanticsNodes().containsKey(java.lang.Integer.valueOf(semanticsNode2.getId()))) {
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.SemanticsNodeCopy semanticsNodeCopy = this.previousSemanticsNodes.get(java.lang.Integer.valueOf(semanticsNode2.getId()));
                kotlin.jvm.internal.Intrinsics.checkNotNull(semanticsNodeCopy);
                sendAccessibilitySemanticsStructureChangeEvents(semanticsNode2, semanticsNodeCopy);
            }
        }
    }

    private final void initContentCapture(boolean onStart) {
        if (onStart) {
            updateContentCaptureBuffersOnAppeared(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode());
        } else {
            updateContentCaptureBuffersOnDisappeared(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode());
        }
        notifyContentCaptureChanges();
    }

    private final void sendContentCaptureSemanticsStructureChangeEvents(androidx.compose.ui.semantics.SemanticsNode newNode, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.SemanticsNodeCopy oldNode) {
        java.util.List<androidx.compose.ui.semantics.SemanticsNode> replacedChildren$ui_release = newNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.semantics.SemanticsNode semanticsNode = replacedChildren$ui_release.get(i);
            if (getCurrentSemanticsNodes().containsKey(java.lang.Integer.valueOf(semanticsNode.getId())) && !oldNode.getChildren().contains(java.lang.Integer.valueOf(semanticsNode.getId()))) {
                updateContentCaptureBuffersOnAppeared(semanticsNode);
            }
        }
        for (java.util.Map.Entry<java.lang.Integer, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.SemanticsNodeCopy> entry : this.previousSemanticsNodes.entrySet()) {
            if (!getCurrentSemanticsNodes().containsKey(entry.getKey())) {
                bufferContentCaptureViewDisappeared(entry.getKey().intValue());
            }
        }
        java.util.List<androidx.compose.ui.semantics.SemanticsNode> replacedChildren$ui_release2 = newNode.getReplacedChildren$ui_release();
        int size2 = replacedChildren$ui_release2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            androidx.compose.ui.semantics.SemanticsNode semanticsNode2 = replacedChildren$ui_release2.get(i2);
            if (getCurrentSemanticsNodes().containsKey(java.lang.Integer.valueOf(semanticsNode2.getId())) && this.previousSemanticsNodes.containsKey(java.lang.Integer.valueOf(semanticsNode2.getId()))) {
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.SemanticsNodeCopy semanticsNodeCopy = this.previousSemanticsNodes.get(java.lang.Integer.valueOf(semanticsNode2.getId()));
                kotlin.jvm.internal.Intrinsics.checkNotNull(semanticsNodeCopy);
                sendContentCaptureSemanticsStructureChangeEvents(semanticsNode2, semanticsNodeCopy);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int semanticsNodeIdToAccessibilityVirtualNodeId(int id) {
        if (id == this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
            return -1;
        }
        return id;
    }

    private final boolean traverseAtGranularity(androidx.compose.ui.semantics.SemanticsNode node, int granularity, boolean forward, boolean extendSelection) {
        androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator iteratorForGranularity;
        int i;
        int i2;
        int id = node.getId();
        java.lang.Integer num = this.previousTraversedNode;
        if (num == null || id != num.intValue()) {
            this.accessibilityCursorPosition = -1;
            this.previousTraversedNode = java.lang.Integer.valueOf(node.getId());
        }
        java.lang.String iterableTextForAccessibility = getIterableTextForAccessibility(node);
        java.lang.String str = iterableTextForAccessibility;
        if (str == null || str.length() == 0 || (iteratorForGranularity = getIteratorForGranularity(node, granularity)) == null) {
            return false;
        }
        int accessibilitySelectionEnd = getAccessibilitySelectionEnd(node);
        if (accessibilitySelectionEnd == -1) {
            accessibilitySelectionEnd = forward ? 0 : iterableTextForAccessibility.length();
        }
        int[] following = forward ? iteratorForGranularity.following(accessibilitySelectionEnd) : iteratorForGranularity.preceding(accessibilitySelectionEnd);
        if (following == null) {
            return false;
        }
        int i3 = following[0];
        int i4 = following[1];
        if (extendSelection && isAccessibilitySelectionExtendable(node)) {
            i = getAccessibilitySelectionStart(node);
            if (i == -1) {
                i = forward ? i3 : i4;
            }
            i2 = forward ? i4 : i3;
        } else {
            i = forward ? i4 : i3;
            i2 = i;
        }
        this.pendingTextTraversedEvent = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.PendingTextTraversedEvent(node, forward ? 256 : 512, granularity, i3, i4, android.os.SystemClock.uptimeMillis());
        setAccessibilitySelection(node, i, i2, true);
        return true;
    }

    private final void sendPendingTextTraversedAtGranularityEvent(int semanticsNodeId) {
        androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.PendingTextTraversedEvent pendingTextTraversedEvent = this.pendingTextTraversedEvent;
        if (pendingTextTraversedEvent != null) {
            if (semanticsNodeId != pendingTextTraversedEvent.getNode().getId()) {
                return;
            }
            if (android.os.SystemClock.uptimeMillis() - pendingTextTraversedEvent.getTraverseTime() <= 1000) {
                android.view.accessibility.AccessibilityEvent createEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(pendingTextTraversedEvent.getNode().getId()), 131072);
                createEvent.setFromIndex(pendingTextTraversedEvent.getFromIndex());
                createEvent.setToIndex(pendingTextTraversedEvent.getToIndex());
                createEvent.setAction(pendingTextTraversedEvent.getAction());
                createEvent.setMovementGranularity(pendingTextTraversedEvent.getGranularity());
                createEvent.getText().add(getIterableTextForAccessibility(pendingTextTraversedEvent.getNode()));
                sendEvent(createEvent);
            }
        }
        this.pendingTextTraversedEvent = null;
    }

    private final boolean setAccessibilitySelection(androidx.compose.ui.semantics.SemanticsNode node, int start, int end, boolean traversalMode) {
        java.lang.String iterableTextForAccessibility;
        boolean enabled;
        if (node.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetSelection())) {
            enabled = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(node);
            if (enabled) {
                kotlin.jvm.functions.Function3 function3 = (kotlin.jvm.functions.Function3) ((androidx.compose.ui.semantics.AccessibilityAction) node.getUnmergedConfig().get(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetSelection())).getAction();
                if (function3 != null) {
                    return ((java.lang.Boolean) function3.invoke(java.lang.Integer.valueOf(start), java.lang.Integer.valueOf(end), java.lang.Boolean.valueOf(traversalMode))).booleanValue();
                }
                return false;
            }
        }
        if ((start == end && end == this.accessibilityCursorPosition) || (iterableTextForAccessibility = getIterableTextForAccessibility(node)) == null) {
            return false;
        }
        if (start < 0 || start != end || end > iterableTextForAccessibility.length()) {
            start = -1;
        }
        this.accessibilityCursorPosition = start;
        java.lang.String str = iterableTextForAccessibility;
        boolean z = str.length() > 0;
        sendEvent(createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId(node.getId()), z ? java.lang.Integer.valueOf(this.accessibilityCursorPosition) : null, z ? java.lang.Integer.valueOf(this.accessibilityCursorPosition) : null, z ? java.lang.Integer.valueOf(iterableTextForAccessibility.length()) : null, str));
        sendPendingTextTraversedAtGranularityEvent(node.getId());
        return true;
    }

    private final int getAccessibilitySelectionStart(androidx.compose.ui.semantics.SemanticsNode node) {
        if (!node.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getContentDescription()) && node.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTextSelectionRange())) {
            return androidx.compose.ui.text.TextRange.m3964getStartimpl(((androidx.compose.ui.text.TextRange) node.getUnmergedConfig().get(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTextSelectionRange())).getPackedValue());
        }
        return this.accessibilityCursorPosition;
    }

    private final int getAccessibilitySelectionEnd(androidx.compose.ui.semantics.SemanticsNode node) {
        if (!node.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getContentDescription()) && node.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTextSelectionRange())) {
            return androidx.compose.ui.text.TextRange.m3959getEndimpl(((androidx.compose.ui.text.TextRange) node.getUnmergedConfig().get(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTextSelectionRange())).getPackedValue());
        }
        return this.accessibilityCursorPosition;
    }

    private final boolean isAccessibilitySelectionExtendable(androidx.compose.ui.semantics.SemanticsNode node) {
        return !node.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getContentDescription()) && node.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getEditableText());
    }

    private final androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator getIteratorForGranularity(androidx.compose.ui.semantics.SemanticsNode node, int granularity) {
        androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator companion;
        androidx.compose.ui.text.TextLayoutResult textLayoutResult;
        if (node == null) {
            return null;
        }
        java.lang.String iterableTextForAccessibility = getIterableTextForAccessibility(node);
        java.lang.String str = iterableTextForAccessibility;
        if (str == null || str.length() == 0) {
            return null;
        }
        if (granularity == 1) {
            companion = androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator.INSTANCE.getInstance(this.view.getContext().getResources().getConfiguration().locale);
            companion.initialize(iterableTextForAccessibility);
        } else if (granularity == 2) {
            companion = androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator.INSTANCE.getInstance(this.view.getContext().getResources().getConfiguration().locale);
            companion.initialize(iterableTextForAccessibility);
        } else {
            if (granularity != 4) {
                if (granularity == 8) {
                    companion = androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator.INSTANCE.getInstance();
                    companion.initialize(iterableTextForAccessibility);
                } else if (granularity != 16) {
                    return null;
                }
            }
            if (!node.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getGetTextLayoutResult()) || (textLayoutResult = getTextLayoutResult(node.getUnmergedConfig())) == null) {
                return null;
            }
            if (granularity == 4) {
                companion = androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator.INSTANCE.getInstance();
                ((androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator) companion).initialize(iterableTextForAccessibility, textLayoutResult);
            } else {
                androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator companion2 = androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator.INSTANCE.getInstance();
                ((androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator) companion2).initialize(iterableTextForAccessibility, textLayoutResult, node);
                companion = companion2;
            }
        }
        return companion;
    }

    private final java.lang.String getIterableTextForAccessibility(androidx.compose.ui.semantics.SemanticsNode node) {
        androidx.compose.ui.text.AnnotatedString annotatedString;
        if (node == null) {
            return null;
        }
        if (node.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getContentDescription())) {
            return androidx.compose.ui.util.ListUtilsKt.fastJoinToString$default((java.util.List) node.getUnmergedConfig().get(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getContentDescription()), ",", null, null, 0, null, null, 62, null);
        }
        if (node.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetText())) {
            androidx.compose.ui.text.AnnotatedString textForTextField = getTextForTextField(node.getUnmergedConfig());
            if (textForTextField != null) {
                return textForTextField.getText();
            }
            return null;
        }
        java.util.List list = (java.util.List) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getText());
        if (list == null || (annotatedString = (androidx.compose.ui.text.AnnotatedString) kotlin.collections.CollectionsKt.firstOrNull(list)) == null) {
            return null;
        }
        return annotatedString.getText();
    }

    private final androidx.compose.ui.text.AnnotatedString getTextForTextField(androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration) {
        return (androidx.compose.ui.text.AnnotatedString) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsConfiguration, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getEditableText());
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\"\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$ComposeAccessibilityNodeProvider;", "Landroid/view/accessibility/AccessibilityNodeProvider;", "(Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;)V", "addExtraDataToAccessibilityNodeInfo", "", "virtualViewId", "", "info", "Landroid/view/accessibility/AccessibilityNodeInfo;", "extraDataKey", "", "arguments", "Landroid/os/Bundle;", "createAccessibilityNodeInfo", "findFocus", "focus", "performAction", "", "action", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class ComposeAccessibilityNodeProvider extends android.view.accessibility.AccessibilityNodeProvider {
        public ComposeAccessibilityNodeProvider() {
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int virtualViewId) {
            android.view.accessibility.AccessibilityNodeInfo createNodeInfo = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.this.createNodeInfo(virtualViewId);
            if (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.this.sendingFocusAffectingEvent && virtualViewId == androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.this.focusedVirtualViewId) {
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.this.currentlyFocusedANI = createNodeInfo;
            }
            return createNodeInfo;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int virtualViewId, int action, android.os.Bundle arguments) {
            return androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.this.performActionHelper(virtualViewId, action, arguments);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int virtualViewId, android.view.accessibility.AccessibilityNodeInfo info, java.lang.String extraDataKey, android.os.Bundle arguments) {
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.this.addExtraDataToAccessibilityNodeInfoHelper(virtualViewId, info, extraDataKey, arguments);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public android.view.accessibility.AccessibilityNodeInfo findFocus(int focus) {
            return createAccessibilityNodeInfo(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.this.focusedVirtualViewId);
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api24Impl;", "", "()V", "addSetProgressAction", "", "info", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "semanticsNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Api24Impl {
        public static final androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.Api24Impl INSTANCE = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.Api24Impl();

        private Api24Impl() {
        }

        @kotlin.jvm.JvmStatic
        public static final void addSetProgressAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat info, androidx.compose.ui.semantics.SemanticsNode semanticsNode) {
            boolean enabled;
            androidx.compose.ui.semantics.AccessibilityAction accessibilityAction;
            enabled = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (!enabled || (accessibilityAction = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetProgress())) == null) {
                return;
            }
            info.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionSetProgress, accessibilityAction.getLabel()));
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api29Impl;", "", "()V", "addPageActions", "", "info", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "semanticsNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Api29Impl {
        public static final androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.Api29Impl INSTANCE = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.Api29Impl();

        private Api29Impl() {
        }

        @kotlin.jvm.JvmStatic
        public static final void addPageActions(androidx.core.view.accessibility.AccessibilityNodeInfoCompat info, androidx.compose.ui.semantics.SemanticsNode semanticsNode) {
            boolean enabled;
            enabled = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled) {
                androidx.compose.ui.semantics.AccessibilityAction accessibilityAction = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getPageUp());
                if (accessibilityAction != null) {
                    info.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageUp, accessibilityAction.getLabel()));
                }
                androidx.compose.ui.semantics.AccessibilityAction accessibilityAction2 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getPageDown());
                if (accessibilityAction2 != null) {
                    info.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageDown, accessibilityAction2.getLabel()));
                }
                androidx.compose.ui.semantics.AccessibilityAction accessibilityAction3 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getPageLeft());
                if (accessibilityAction3 != null) {
                    info.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageLeft, accessibilityAction3.getLabel()));
                }
                androidx.compose.ui.semantics.AccessibilityAction accessibilityAction4 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getPageRight());
                if (accessibilityAction4 != null) {
                    info.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageRight, accessibilityAction4.getLabel()));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002J0\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010H\u0007J \u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0007¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$ViewTranslationHelperMethodsS;", "", "()V", "doTranslation", "", "accessibilityDelegateCompat", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", com.ironsource.Ve.n, "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "onCreateVirtualViewTranslationRequests", "virtualIds", "", "supportedFormats", "", "requestsCollector", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "onVirtualViewTranslationResponses", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class ViewTranslationHelperMethodsS {
        public static final androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.ViewTranslationHelperMethodsS INSTANCE = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.ViewTranslationHelperMethodsS();

        private ViewTranslationHelperMethodsS() {
        }

        public final void onVirtualViewTranslationResponses(final androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat accessibilityDelegateCompat, final android.util.LongSparseArray<android.view.translation.ViewTranslationResponse> response) {
            if (android.os.Build.VERSION.SDK_INT < 31) {
                return;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(android.os.Looper.getMainLooper().getThread(), java.lang.Thread.currentThread())) {
                doTranslation(accessibilityDelegateCompat, response);
            } else {
                accessibilityDelegateCompat.getView().post(new java.lang.Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$ViewTranslationHelperMethodsS$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.ViewTranslationHelperMethodsS.onVirtualViewTranslationResponses$lambda$1(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.this, response);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onVirtualViewTranslationResponses$lambda$1(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, android.util.LongSparseArray longSparseArray) {
            INSTANCE.doTranslation(androidComposeViewAccessibilityDelegateCompat, longSparseArray);
        }

        private final void doTranslation(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat accessibilityDelegateCompat, android.util.LongSparseArray<android.view.translation.ViewTranslationResponse> response) {
            android.view.translation.TranslationResponseValue value;
            java.lang.CharSequence text;
            androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds;
            androidx.compose.ui.semantics.SemanticsNode semanticsNode;
            androidx.compose.ui.semantics.AccessibilityAction accessibilityAction;
            kotlin.jvm.functions.Function1 function1;
            kotlin.collections.LongIterator keyIterator = androidx.core.util.LongSparseArrayKt.keyIterator(response);
            while (keyIterator.hasNext()) {
                long nextLong = keyIterator.nextLong();
                android.view.translation.ViewTranslationResponse viewTranslationResponse = response.get(nextLong);
                if (viewTranslationResponse != null && (value = viewTranslationResponse.getValue("android:text")) != null && (text = value.getText()) != null && (semanticsNodeWithAdjustedBounds = (androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds) accessibilityDelegateCompat.getCurrentSemanticsNodes().get(java.lang.Integer.valueOf((int) nextLong))) != null && (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) != null && (accessibilityAction = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetTextSubstitution())) != null && (function1 = (kotlin.jvm.functions.Function1) accessibilityAction.getAction()) != null) {
                }
            }
        }

        public final void onCreateVirtualViewTranslationRequests(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat accessibilityDelegateCompat, long[] virtualIds, int[] supportedFormats, java.util.function.Consumer<android.view.translation.ViewTranslationRequest> requestsCollector) {
            androidx.compose.ui.semantics.SemanticsNode semanticsNode;
            java.lang.String textForTranslation;
            for (long j : virtualIds) {
                androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds) accessibilityDelegateCompat.getCurrentSemanticsNodes().get(java.lang.Integer.valueOf((int) j));
                if (semanticsNodeWithAdjustedBounds != null && (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) != null) {
                    android.view.translation.ViewTranslationRequest.Builder builder = new android.view.translation.ViewTranslationRequest.Builder(accessibilityDelegateCompat.getView().getAutofillId(), semanticsNode.getId());
                    textForTranslation = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.getTextForTranslation(semanticsNode);
                    if (textForTranslation != null) {
                        builder.setValue("android:text", android.view.translation.TranslationRequestValue.forText(new androidx.compose.ui.text.AnnotatedString(textForTranslation, null, null, 6, null)));
                        requestsCollector.accept(builder.build());
                    }
                }
            }
        }
    }

    public final void onCreateVirtualViewTranslationRequests$ui_release(long[] virtualIds, int[] supportedFormats, java.util.function.Consumer<android.view.translation.ViewTranslationRequest> requestsCollector) {
        androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.ViewTranslationHelperMethodsS.INSTANCE.onCreateVirtualViewTranslationRequests(this, virtualIds, supportedFormats, requestsCollector);
    }

    public final void onVirtualViewTranslationResponses$ui_release(android.util.LongSparseArray<android.view.translation.ViewTranslationResponse> response) {
        androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.ViewTranslationHelperMethodsS.INSTANCE.onVirtualViewTranslationResponses(this, response);
    }

    private final void geometryDepthFirstSearch(androidx.compose.ui.semantics.SemanticsNode currNode, java.util.ArrayList<androidx.compose.ui.semantics.SemanticsNode> geometryList, java.util.Map<java.lang.Integer, java.util.List<androidx.compose.ui.semantics.SemanticsNode>> containerMapToChildren) {
        boolean z = currNode.getLayoutInfo().getLayoutDirection() == androidx.compose.ui.unit.LayoutDirection.Rtl;
        boolean booleanValue = ((java.lang.Boolean) currNode.getConfig().getOrElse(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsTraversalGroup(), androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$isTraversalGroup$1.INSTANCE)).booleanValue();
        if ((booleanValue || isScreenReaderFocusable(currNode)) && getCurrentSemanticsNodes().keySet().contains(java.lang.Integer.valueOf(currNode.getId()))) {
            geometryList.add(currNode);
        }
        if (booleanValue) {
            containerMapToChildren.put(java.lang.Integer.valueOf(currNode.getId()), subtreeSortedByGeometryGrouping(z, kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) currNode.getChildren())));
            return;
        }
        java.util.List<androidx.compose.ui.semantics.SemanticsNode> children = currNode.getChildren();
        int size = children.size();
        for (int i = 0; i < size; i++) {
            geometryDepthFirstSearch(children.get(i), geometryList, containerMapToChildren);
        }
    }
}
