package androidx.compose.runtime;

/* compiled from: Composer.kt */
@kotlin.Metadata(d1 = {"\u0000ó\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\u0010\f\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\u0010\n\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b)*\u0001A\b\u0000\u0018\u00002\u00020\u0001:\u0004Õ\u0002Ö\u0002BG\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\n\u0010\u0090\u0001\u001a\u00030\u0091\u0001H\u0002J\n\u0010\u0092\u0001\u001a\u00030\u0091\u0001H\u0002JM\u0010\u0093\u0001\u001a\u00030\u0091\u0001\"\u0005\b\u0000\u0010\u0094\u0001\"\u0005\b\u0001\u0010\u0095\u00012\b\u0010\u0096\u0001\u001a\u0003H\u0094\u00012#\u0010\u0097\u0001\u001a\u001e\u0012\u0005\u0012\u0003H\u0095\u0001\u0012\u0005\u0012\u0003H\u0094\u0001\u0012\u0005\u0012\u00030\u0091\u00010\u0098\u0001¢\u0006\u0003\b\u0099\u0001H\u0016¢\u0006\u0003\u0010\u009a\u0001J\t\u0010\u009b\u0001\u001a\u00020\u0005H\u0016J2\u0010\u009c\u0001\u001a\u0003H\u0095\u0001\"\u0005\b\u0000\u0010\u0095\u00012\u0007\u0010\u009d\u0001\u001a\u00020\u00182\u000f\u0010\u0097\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0095\u00010\u009e\u0001H\u0087\b¢\u0006\u0003\u0010\u009f\u0001J\u0014\u0010 \u0001\u001a\u00020\u00182\t\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u007fH\u0017J\u0012\u0010 \u0001\u001a\u00020\u00182\u0007\u0010\u0096\u0001\u001a\u00020\u0018H\u0017J\u0013\u0010 \u0001\u001a\u00020\u00182\b\u0010\u0096\u0001\u001a\u00030¡\u0001H\u0017J\u0013\u0010 \u0001\u001a\u00020\u00182\b\u0010\u0096\u0001\u001a\u00030¢\u0001H\u0017J\u0013\u0010 \u0001\u001a\u00020\u00182\b\u0010\u0096\u0001\u001a\u00030£\u0001H\u0017J\u0013\u0010 \u0001\u001a\u00020\u00182\b\u0010\u0096\u0001\u001a\u00030¤\u0001H\u0017J\u0012\u0010 \u0001\u001a\u00020\u00182\u0007\u0010\u0096\u0001\u001a\u00020\u001cH\u0017J\u0013\u0010 \u0001\u001a\u00020\u00182\b\u0010\u0096\u0001\u001a\u00030¥\u0001H\u0017J\u0013\u0010 \u0001\u001a\u00020\u00182\b\u0010\u0096\u0001\u001a\u00030¦\u0001H\u0017J\u0014\u0010§\u0001\u001a\u00020\u00182\t\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u007fH\u0017J\u0010\u0010¨\u0001\u001a\u00030\u0091\u0001H\u0000¢\u0006\u0003\b©\u0001J\n\u0010ª\u0001\u001a\u00030\u0091\u0001H\u0002J\n\u0010«\u0001\u001a\u00030\u0091\u0001H\u0002J\n\u0010¬\u0001\u001a\u00030\u0091\u0001H\u0016JI\u0010\u00ad\u0001\u001a\u00030\u0091\u00012\u001d\u0010®\u0001\u001a\u0018\u0012\u0004\u0012\u000205\u0012\r\u0012\u000b\u0012\u0004\u0012\u00020\u007f\u0018\u00010°\u00010¯\u00012\u0015\u0010±\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u0091\u00010\u009e\u0001¢\u0006\u0003\b²\u0001H\u0000¢\u0006\u0006\b³\u0001\u0010´\u0001J$\u0010µ\u0001\u001a\u00020\u001c2\u0007\u0010¶\u0001\u001a\u00020\u001c2\u0007\u0010·\u0001\u001a\u00020\u001c2\u0007\u0010¸\u0001\u001a\u00020\u001cH\u0002J(\u0010¹\u0001\u001a\u0003H\u0095\u0001\"\u0005\b\u0000\u0010\u0095\u00012\u000f\u0010º\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0095\u00010»\u0001H\u0017¢\u0006\u0003\u0010¼\u0001J\n\u0010½\u0001\u001a\u00030\u0091\u0001H\u0002J\"\u0010¾\u0001\u001a\u00030\u0091\u0001\"\u0005\b\u0000\u0010\u0095\u00012\u000f\u0010¿\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0095\u00010\u009e\u0001H\u0016J\t\u0010À\u0001\u001a\u00020kH\u0002J\u0012\u0010À\u0001\u001a\u00020k2\u0007\u0010¶\u0001\u001a\u00020\u001cH\u0002J\u0010\u0010Á\u0001\u001a\u00030\u0091\u0001H\u0000¢\u0006\u0003\bÂ\u0001J\u0013\u0010Ã\u0001\u001a\u00030\u0091\u00012\u0007\u0010 \u0001\u001a\u00020\u0018H\u0017J\n\u0010Ä\u0001\u001a\u00030\u0091\u0001H\u0016J\n\u0010Å\u0001\u001a\u00030\u0091\u0001H\u0016J\u0010\u0010Æ\u0001\u001a\u00030\u0091\u0001H\u0000¢\u0006\u0003\bÇ\u0001JH\u0010È\u0001\u001a\u00030\u0091\u00012\u001d\u0010®\u0001\u001a\u0018\u0012\u0004\u0012\u000205\u0012\r\u0012\u000b\u0012\u0004\u0012\u00020\u007f\u0018\u00010°\u00010¯\u00012\u0017\u0010±\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u0091\u0001\u0018\u00010\u009e\u0001¢\u0006\u0003\b²\u0001H\u0002¢\u0006\u0003\u0010´\u0001J\u001c\u0010É\u0001\u001a\u00030\u0091\u00012\u0007\u0010¶\u0001\u001a\u00020\u001c2\u0007\u0010Ê\u0001\u001a\u00020\u001cH\u0002J\n\u0010Ë\u0001\u001a\u00030\u0091\u0001H\u0016J\u0013\u0010Ì\u0001\u001a\u00030\u0091\u00012\u0007\u0010Í\u0001\u001a\u00020\u0018H\u0002J\n\u0010Î\u0001\u001a\u00030\u0091\u0001H\u0017J\n\u0010Ï\u0001\u001a\u00030\u0091\u0001H\u0002J\n\u0010Ð\u0001\u001a\u00030\u0091\u0001H\u0017J\n\u0010Ñ\u0001\u001a\u00030\u0091\u0001H\u0016J\n\u0010Ò\u0001\u001a\u00030\u0091\u0001H\u0017J\n\u0010Ó\u0001\u001a\u00030\u0091\u0001H\u0017J\n\u0010Ô\u0001\u001a\u00030\u0091\u0001H\u0017J\f\u0010Õ\u0001\u001a\u0005\u0018\u00010Ö\u0001H\u0017J\n\u0010×\u0001\u001a\u00030\u0091\u0001H\u0016J\b\u0010Ø\u0001\u001a\u00030\u0091\u0001J\n\u0010Ù\u0001\u001a\u00030\u0091\u0001H\u0002J\u0013\u0010Ú\u0001\u001a\u00030\u0091\u00012\u0007\u0010Û\u0001\u001a\u00020\u001cH\u0016J\n\u0010Ü\u0001\u001a\u00030\u0091\u0001H\u0002J\u001e\u0010Ý\u0001\u001a\u00030\u0091\u00012\u0007\u0010Í\u0001\u001a\u00020\u00182\t\u0010Þ\u0001\u001a\u0004\u0018\u00010mH\u0002J\u001b\u0010ß\u0001\u001a\u00030\u0091\u00012\u0007\u0010à\u0001\u001a\u00020\u001c2\u0006\u0010W\u001a\u00020\u0018H\u0002J\n\u0010á\u0001\u001a\u00030\u0091\u0001H\u0002J\u000e\u0010E\u001a\u00020\u0018H\u0000¢\u0006\u0003\bâ\u0001J#\u0010ã\u0001\u001a\u00030\u0091\u00012\f\u0010\u0096\u0001\u001a\u0007\u0012\u0002\b\u00030ä\u00012\t\u0010å\u0001\u001a\u0004\u0018\u00010\u007fH\u0017J+\u0010æ\u0001\u001a\u00030\u0091\u00012\u001f\u0010ç\u0001\u001a\u001a\u0012\u0015\u0012\u0013\u0012\u0005\u0012\u00030ê\u0001\u0012\u0007\u0012\u0005\u0018\u00010ê\u00010é\u00010è\u0001H\u0002J+\u0010ë\u0001\u001a\u00030\u0091\u00012\u001f\u0010ç\u0001\u001a\u001a\u0012\u0015\u0012\u0013\u0012\u0005\u0012\u00030ê\u0001\u0012\u0007\u0012\u0005\u0018\u00010ê\u00010é\u00010è\u0001H\u0017J\u0012\u0010ì\u0001\u001a\u00020\u001c2\u0007\u0010í\u0001\u001a\u00020\u001cH\u0002J9\u0010î\u0001\u001a\u00030\u0091\u00012\u0010\u0010±\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u007f0ä\u00012\u0007\u0010ï\u0001\u001a\u00020k2\t\u0010å\u0001\u001a\u0004\u0018\u00010\u007f2\u0007\u0010ð\u0001\u001a\u00020\u0018H\u0002J\u001f\u0010ñ\u0001\u001a\u00020\u007f2\t\u0010ò\u0001\u001a\u0004\u0018\u00010\u007f2\t\u0010ó\u0001\u001a\u0004\u0018\u00010\u007fH\u0017J\u000b\u0010ô\u0001\u001a\u0004\u0018\u00010\u007fH\u0001J\u000b\u0010õ\u0001\u001a\u0004\u0018\u00010\u007fH\u0001J-\u0010ö\u0001\u001a\u00020\u001c2\u0007\u0010÷\u0001\u001a\u00020\u001c2\u0007\u0010¶\u0001\u001a\u00020\u001c2\u0007\u0010·\u0001\u001a\u00020\u001c2\u0007\u0010ø\u0001\u001a\u00020\u001cH\u0002J\u000f\u0010ù\u0001\u001a\u00020\u001cH\u0001¢\u0006\u0003\bú\u0001J!\u0010û\u0001\u001a\u00030\u0091\u00012\u000f\u0010\u0097\u0001\u001a\n\u0012\u0005\u0012\u00030\u0091\u00010\u009e\u0001H\u0000¢\u0006\u0003\bü\u0001J.\u0010ý\u0001\u001a\u00020\u00182\u001d\u0010®\u0001\u001a\u0018\u0012\u0004\u0012\u000205\u0012\r\u0012\u000b\u0012\u0004\u0012\u00020\u007f\u0018\u00010°\u00010¯\u0001H\u0000¢\u0006\u0003\bþ\u0001Jv\u0010ÿ\u0001\u001a\u0003H\u0080\u0002\"\u0005\b\u0000\u0010\u0080\u00022\u000b\b\u0002\u0010\u0081\u0002\u001a\u0004\u0018\u00010\u000f2\u000b\b\u0002\u0010\u0082\u0002\u001a\u0004\u0018\u00010\u000f2\u000b\b\u0002\u0010í\u0001\u001a\u0004\u0018\u00010\u001c2%\b\u0002\u0010\\\u001a\u001f\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u000205\u0012\r\u0012\u000b\u0012\u0004\u0012\u00020\u007f\u0018\u00010°\u00010é\u00010è\u00012\u000f\u0010\u0097\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0080\u00020\u009e\u0001H\u0002¢\u0006\u0003\u0010\u0083\u0002J\n\u0010\u0084\u0002\u001a\u00030\u0091\u0001H\u0002J\n\u0010\u0085\u0002\u001a\u00030\u0091\u0001H\u0002J\u0013\u0010\u0086\u0002\u001a\u00030\u0091\u00012\u0007\u0010\u0087\u0002\u001a\u00020OH\u0002J\u0013\u0010\u0088\u0002\u001a\u00030\u0091\u00012\u0007\u0010\u0089\u0002\u001a\u00020kH\u0002J\u001b\u0010\u008a\u0002\u001a\u00030\u0091\u00012\u000f\u0010\u008b\u0002\u001a\n\u0012\u0005\u0012\u00030\u0091\u00010\u009e\u0001H\u0016J%\u0010\u008c\u0002\u001a\u00030\u0091\u00012\u0007\u0010\u008d\u0002\u001a\u00020\u001c2\u0007\u0010\u008e\u0002\u001a\u00020\u001c2\u0007\u0010\u008f\u0002\u001a\u00020\u001cH\u0002J\u0013\u0010\u0090\u0002\u001a\u00030\u0091\u00012\u0007\u0010\u0091\u0002\u001a\u00020{H\u0016J\u000b\u0010\u0092\u0002\u001a\u0004\u0018\u00010\u007fH\u0016J\n\u0010\u0093\u0002\u001a\u00030\u0091\u0001H\u0002J\u0013\u0010\u0094\u0002\u001a\u00030\u0091\u00012\u0007\u0010\u0095\u0002\u001a\u00020\u001cH\u0002J\n\u0010\u0096\u0002\u001a\u00030\u0091\u0001H\u0017J\n\u0010\u0097\u0002\u001a\u00030\u0091\u0001H\u0002J\n\u0010\u0098\u0002\u001a\u00030\u0091\u0001H\u0002J\n\u0010\u0099\u0002\u001a\u00030\u0091\u0001H\u0017J\u0014\u0010\u009a\u0002\u001a\u00030\u0091\u00012\b\u0010\u009a\u0002\u001a\u00030\u009b\u0002H\u0017J\n\u0010\u009c\u0002\u001a\u00030\u0091\u0001H\u0017J\u001d\u0010\u009d\u0002\u001a\u00030\u0091\u00012\u0007\u0010º\u0001\u001a\u00020\u001c2\b\u0010\u009a\u0002\u001a\u00030\u009b\u0002H\u0017J?\u0010\u009e\u0002\u001a\u00030\u0091\u00012\u0007\u0010º\u0001\u001a\u00020\u001c2\t\u0010\u009f\u0002\u001a\u0004\u0018\u00010\u007f2\b\u0010 \u0002\u001a\u00030¡\u00022\t\u0010¢\u0002\u001a\u0004\u0018\u00010\u007fH\u0002ø\u0001\u0000¢\u0006\u0006\b£\u0002\u0010¤\u0002J\n\u0010¥\u0002\u001a\u00030\u0091\u0001H\u0017J\u0013\u0010¦\u0002\u001a\u00030\u0091\u00012\u0007\u0010º\u0001\u001a\u00020\u001cH\u0002J\u001e\u0010¦\u0002\u001a\u00030\u0091\u00012\u0007\u0010º\u0001\u001a\u00020\u001c2\t\u0010§\u0002\u001a\u0004\u0018\u00010\u007fH\u0002J\u001e\u0010¨\u0002\u001a\u00030\u0091\u00012\u0007\u0010º\u0001\u001a\u00020\u001c2\t\u0010§\u0002\u001a\u0004\u0018\u00010\u007fH\u0017J\n\u0010©\u0002\u001a\u00030\u0091\u0001H\u0016J\u0018\u0010ª\u0002\u001a\u00030\u0091\u00012\f\u0010\u0096\u0001\u001a\u0007\u0012\u0002\b\u00030«\u0002H\u0017J'\u0010¬\u0002\u001a\u00030\u0091\u00012\u0015\u0010\u00ad\u0002\u001a\u0010\u0012\u000b\b\u0001\u0012\u0007\u0012\u0002\b\u00030«\u00020®\u0002H\u0017¢\u0006\u0003\u0010¯\u0002J\u001e\u0010°\u0002\u001a\u00030\u0091\u00012\u0007\u0010Í\u0001\u001a\u00020\u00182\t\u0010¢\u0002\u001a\u0004\u0018\u00010\u007fH\u0002J\u0013\u0010±\u0002\u001a\u00030\u0091\u00012\u0007\u0010º\u0001\u001a\u00020\u001cH\u0017J\u0012\u0010²\u0002\u001a\u00020\u00012\u0007\u0010º\u0001\u001a\u00020\u001cH\u0017J\u001e\u0010³\u0002\u001a\u00030\u0091\u00012\u0007\u0010º\u0001\u001a\u00020\u001c2\t\u0010§\u0002\u001a\u0004\u0018\u00010\u007fH\u0016J\n\u0010´\u0002\u001a\u00030\u0091\u0001H\u0016J\b\u0010µ\u0002\u001a\u00030\u0091\u0001J\n\u0010¶\u0002\u001a\u00030\u0091\u0001H\u0002J#\u0010·\u0002\u001a\u00020\u00182\u0007\u0010\u0091\u0002\u001a\u0002052\t\u0010¸\u0002\u001a\u0004\u0018\u00010\u007fH\u0000¢\u0006\u0003\b¹\u0002J\u0015\u0010º\u0002\u001a\u00030\u0091\u00012\t\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u007fH\u0001J)\u0010»\u0002\u001a\u00030\u0091\u00012\u0007\u0010¼\u0002\u001a\u00020\u001c2\t\u0010§\u0002\u001a\u0004\u0018\u00010\u007f2\t\u0010¢\u0002\u001a\u0004\u0018\u00010\u007fH\u0002J\u0013\u0010½\u0002\u001a\u00030\u0091\u00012\u0007\u0010¾\u0002\u001a\u00020\u001cH\u0002J)\u0010¿\u0002\u001a\u00030\u0091\u00012\u0007\u0010¼\u0002\u001a\u00020\u001c2\t\u0010§\u0002\u001a\u0004\u0018\u00010\u007f2\t\u0010¢\u0002\u001a\u0004\u0018\u00010\u007fH\u0002J\u0013\u0010À\u0002\u001a\u00030\u0091\u00012\u0007\u0010¼\u0002\u001a\u00020\u001cH\u0002J\u001c\u0010Á\u0002\u001a\u00030\u0091\u00012\u0007\u0010¶\u0001\u001a\u00020\u001c2\u0007\u0010Â\u0002\u001a\u00020\u001cH\u0002J\u001c\u0010Ã\u0002\u001a\u00030\u0091\u00012\u0007\u0010¶\u0001\u001a\u00020\u001c2\u0007\u0010Ä\u0002\u001a\u00020\u001cH\u0002J\u001b\u0010Å\u0002\u001a\u00020k2\u0007\u0010Æ\u0002\u001a\u00020k2\u0007\u0010Ç\u0002\u001a\u00020kH\u0002J\u0015\u0010È\u0002\u001a\u00030\u0091\u00012\t\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u007fH\u0016J\u0015\u0010É\u0002\u001a\u00030\u0091\u00012\t\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u007fH\u0002J\u0015\u0010Ê\u0002\u001a\u00030\u0091\u00012\t\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u007fH\u0001J\u0012\u0010Ë\u0002\u001a\u00020\u001c2\u0007\u0010¶\u0001\u001a\u00020\u001cH\u0002J\n\u0010Ì\u0002\u001a\u00030\u0091\u0001H\u0016J\n\u0010Í\u0002\u001a\u00030\u0091\u0001H\u0002J\n\u0010Î\u0002\u001a\u00030\u0091\u0001H\u0002J\u0010\u0010Ï\u0002\u001a\u00030\u0091\u0001H\u0000¢\u0006\u0003\bÐ\u0002J1\u0010Ñ\u0002\u001a\u0003H\u0080\u0002\"\u0005\b\u0000\u0010\u0080\u00022\u0006\u0010t\u001a\u00020u2\u000f\u0010\u0097\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0080\u00020\u009e\u0001H\u0082\b¢\u0006\u0003\u0010Ò\u0002J\u0016\u0010Ó\u0002\u001a\u00020\u001c*\u00020u2\u0007\u0010¶\u0001\u001a\u00020\u001cH\u0002J\u0018\u0010Ô\u0002\u001a\u0004\u0018\u00010\u007f*\u00020u2\u0007\u0010í\u0001\u001a\u00020\u001cH\u0002R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u000e\u0010(\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010*\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u001c8\u0016@RX\u0097\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010,\u001a\u0004\b-\u0010\u001eR\u0014\u0010.\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00102\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u001eR\u0016\u00104\u001a\u0004\u0018\u0001058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u001a\u00108\u001a\u00020\u00188VX\u0097\u0004¢\u0006\f\u0012\u0004\b9\u0010,\u001a\u0004\b:\u0010\u001aR\u001c\u0010;\u001a\u0004\u0018\u00010\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0010\u0010@\u001a\u00020AX\u0082\u0004¢\u0006\u0004\n\u0002\u0010BR\u000e\u0010C\u001a\u00020DX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020DX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010I\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bJ\u0010\u001aR\u0014\u0010K\u001a\u00020\u00188@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bL\u0010\u001aR\u000e\u0010M\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020OX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020QX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010R\u001a\u00020\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR&\u0010W\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u00188\u0016@RX\u0097\u000e¢\u0006\u000e\n\u0000\u0012\u0004\bX\u0010,\u001a\u0004\bY\u0010\u001aR\u0014\u0010Z\u001a\b\u0012\u0004\u0012\u0002050[X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\\\u001a\b\u0012\u0004\u0012\u00020^0]X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010_\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u0018@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b`\u0010\u001aR\u001e\u0010a\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u0018@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bb\u0010\u001aR\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010c\u001a\u0004\u0018\u00010dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010e\u001a\u0004\u0018\u00010fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020DX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010j\u001a\u00020kX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010l\u001a\u0004\u0018\u00010mX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010m0[X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010o\u001a\u0004\u0018\u00010kX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010p\u001a\n\u0012\u0004\u0012\u00020k\u0018\u00010qX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010r\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010s\u001a\u00020DX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010t\u001a\u00020uX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\u0016\u0010z\u001a\u0004\u0018\u00010{8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}R\u0018\u0010~\u001a\u0004\u0018\u00010\u007f8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u000f\u0010\u0082\u0001\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0083\u0001\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0084\u0001\u001a\u00020\u00188VX\u0097\u0004¢\u0006\u000e\u0012\u0005\b\u0085\u0001\u0010,\u001a\u0005\b\u0086\u0001\u0010\u001aR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000f\u0010\u0087\u0001\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0088\u0001\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0089\u0001\u001a\u00020DX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u008a\u0001\u001a\u00030\u008b\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u008c\u0001\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u007f*\u00020u8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006×\u0002"}, d2 = {"Landroidx/compose/runtime/ComposerImpl;", "Landroidx/compose/runtime/Composer;", "applier", "Landroidx/compose/runtime/Applier;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", "slotTable", "Landroidx/compose/runtime/SlotTable;", "abandonSet", "", "Landroidx/compose/runtime/RememberObserver;", "changes", "Landroidx/compose/runtime/changelist/ChangeList;", "lateChanges", "composition", "Landroidx/compose/runtime/ControlledComposition;", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/SlotTable;Ljava/util/Set;Landroidx/compose/runtime/changelist/ChangeList;Landroidx/compose/runtime/changelist/ChangeList;Landroidx/compose/runtime/ControlledComposition;)V", "getApplier", "()Landroidx/compose/runtime/Applier;", "applyCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "areChildrenComposing", "", "getAreChildrenComposing$runtime_release", "()Z", "changeCount", "", "getChangeCount$runtime_release", "()I", "changeListWriter", "Landroidx/compose/runtime/changelist/ComposerChangeListWriter;", "childrenComposing", "getComposition", "()Landroidx/compose/runtime/ControlledComposition;", "compositionData", "Landroidx/compose/runtime/tooling/CompositionData;", "getCompositionData", "()Landroidx/compose/runtime/tooling/CompositionData;", "compositionToken", "<set-?>", "compoundKeyHash", "getCompoundKeyHash$annotations", "()V", "getCompoundKeyHash", "currentCompositionLocalMap", "Landroidx/compose/runtime/CompositionLocalMap;", "getCurrentCompositionLocalMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "currentMarker", "getCurrentMarker", "currentRecomposeScope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "getCurrentRecomposeScope$runtime_release", "()Landroidx/compose/runtime/RecomposeScopeImpl;", "defaultsInvalid", "getDefaultsInvalid$annotations", "getDefaultsInvalid", "deferredChanges", "getDeferredChanges$runtime_release", "()Landroidx/compose/runtime/changelist/ChangeList;", "setDeferredChanges$runtime_release", "(Landroidx/compose/runtime/changelist/ChangeList;)V", "derivedStateObserver", "androidx/compose/runtime/ComposerImpl$derivedStateObserver$1", "Landroidx/compose/runtime/ComposerImpl$derivedStateObserver$1;", "entersStack", "Landroidx/compose/runtime/IntStack;", "forceRecomposeScopes", "forciblyRecompose", "groupNodeCount", "groupNodeCountStack", "hasInvalidations", "getHasInvalidations", "hasPendingChanges", "getHasPendingChanges$runtime_release", "implicitRootStart", "insertAnchor", "Landroidx/compose/runtime/Anchor;", "insertFixups", "Landroidx/compose/runtime/changelist/FixupList;", "insertTable", "getInsertTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "setInsertTable$runtime_release", "(Landroidx/compose/runtime/SlotTable;)V", "inserting", "getInserting$annotations", "getInserting", "invalidateStack", "Landroidx/compose/runtime/Stack;", "invalidations", "", "Landroidx/compose/runtime/Invalidation;", "isComposing", "isComposing$runtime_release", "isDisposed", "isDisposed$runtime_release", "nodeCountOverrides", "", "nodeCountVirtualOverrides", "Landroidx/collection/MutableIntIntMap;", "nodeExpected", "nodeIndex", "nodeIndexStack", "parentProvider", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "pending", "Landroidx/compose/runtime/Pending;", "pendingStack", "providerCache", "providerUpdates", "Landroidx/compose/runtime/collection/IntMap;", "providersInvalid", "providersInvalidStack", "reader", "Landroidx/compose/runtime/SlotReader;", "getReader$runtime_release", "()Landroidx/compose/runtime/SlotReader;", "setReader$runtime_release", "(Landroidx/compose/runtime/SlotReader;)V", "recomposeScope", "Landroidx/compose/runtime/RecomposeScope;", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "recomposeScopeIdentity", "", "getRecomposeScopeIdentity", "()Ljava/lang/Object;", "reusing", "reusingGroup", "skipping", "getSkipping$annotations", "getSkipping", "sourceInformationEnabled", "startedGroup", "startedGroups", "writer", "Landroidx/compose/runtime/SlotWriter;", "writerHasAProvider", "node", "getNode", "(Landroidx/compose/runtime/SlotReader;)Ljava/lang/Object;", "abortRoot", "", "addRecomposeScope", "apply", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "T", "value", "block", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "buildContext", "cache", "invalid", "Lkotlin/Function0;", "(ZLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "changed", "", "", "", "", "", "", "changedInstance", "changesApplied", "changesApplied$runtime_release", "cleanUpCompose", "clearUpdatedNodeCounts", "collectParameterInformation", "composeContent", "invalidationsRequested", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/collection/IdentityArraySet;", "content", "Landroidx/compose/runtime/Composable;", "composeContent$runtime_release", "(Landroidx/compose/runtime/collection/IdentityArrayMap;Lkotlin/jvm/functions/Function2;)V", "compoundKeyOf", "group", "recomposeGroup", "recomposeKey", "consume", com.ironsource.X3.i.W, "Landroidx/compose/runtime/CompositionLocal;", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "createFreshInsertTable", "createNode", "factory", "currentCompositionLocalScope", "deactivate", "deactivate$runtime_release", "deactivateToEndGroup", "disableReusing", "disableSourceInformation", "dispose", "dispose$runtime_release", "doCompose", "doRecordDownsFor", "nearestCommonRoot", "enableReusing", "end", "isNode", "endDefaults", "endGroup", "endMovableGroup", "endNode", "endProvider", "endProviders", "endReplaceableGroup", "endRestartGroup", "Landroidx/compose/runtime/ScopeUpdateScope;", "endReusableGroup", "endReuseFromRoot", "endRoot", "endToMarker", "marker", "ensureWriter", "enterGroup", "newPending", "exitGroup", "expectedNodeCount", "finalizeCompose", "forceRecomposeScopes$runtime_release", "insertMovableContent", "Landroidx/compose/runtime/MovableContent;", com.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "insertMovableContentGuarded", "references", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "insertMovableContentReferences", "insertedGroupVirtualIndex", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "invokeMovableContentLambda", "locals", "force", "joinKey", "left", "right", "nextSlot", "nextSlotForCache", "nodeIndexOf", "groupLocation", "recomposeIndex", "parentKey", "parentKey$runtime_release", "prepareCompose", "prepareCompose$runtime_release", "recompose", "recompose$runtime_release", "recomposeMovableContent", "R", com.google.firebase.messaging.Constants.MessagePayloadKeys.FROM, "to", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ControlledComposition;Ljava/lang/Integer;Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "recomposeToGroupEnd", "recordDelete", "recordInsert", io.ktor.http.LinkHeader.Parameters.Anchor, "recordProviderUpdate", "providers", "recordSideEffect", "effect", "recordUpsAndDowns", "oldGroup", "newGroup", "commonRoot", "recordUsed", "scope", "rememberedValue", "reportAllMovableContent", "reportFreeMovableContent", "groupBeingRemoved", "skipCurrentGroup", "skipGroup", "skipReaderToGroupEnd", "skipToGroupEnd", "sourceInformation", "", "sourceInformationMarkerEnd", "sourceInformationMarkerStart", "start", "objectKey", "kind", "Landroidx/compose/runtime/GroupKind;", "data", "start-BaiHCIY", "(ILjava/lang/Object;ILjava/lang/Object;)V", "startDefaults", "startGroup", "dataKey", "startMovableGroup", "startNode", "startProvider", "Landroidx/compose/runtime/ProvidedValue;", "startProviders", "values", "", "([Landroidx/compose/runtime/ProvidedValue;)V", "startReaderGroup", "startReplaceableGroup", "startRestartGroup", "startReusableGroup", "startReusableNode", "startReuseFromRoot", "startRoot", "tryImminentInvalidation", com.ironsource.C3232q2.p, "tryImminentInvalidation$runtime_release", "updateCachedValue", "updateCompoundKeyWhenWeEnterGroup", "groupKey", "updateCompoundKeyWhenWeEnterGroupKeyHash", "keyHash", "updateCompoundKeyWhenWeExitGroup", "updateCompoundKeyWhenWeExitGroupKeyHash", "updateNodeCount", com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT, "updateNodeCountOverrides", "newCount", "updateProviderMapGroup", "parentScope", "currentProviders", "updateRememberedValue", "updateSlot", "updateValue", "updatedNodeCount", "useNode", "validateNodeExpected", "validateNodeNotExpected", "verifyConsistent", "verifyConsistent$runtime_release", "withReader", "(Landroidx/compose/runtime/SlotReader;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "groupCompoundKeyPart", "nodeAt", "CompositionContextHolder", "CompositionContextImpl", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposerImpl implements androidx.compose.runtime.Composer {
    public static final int $stable = 8;
    private final java.util.Set<androidx.compose.runtime.RememberObserver> abandonSet;
    private final androidx.compose.runtime.Applier<?> applier;
    private final androidx.compose.runtime.changelist.ComposerChangeListWriter changeListWriter;
    private androidx.compose.runtime.changelist.ChangeList changes;
    private int childrenComposing;
    private final androidx.compose.runtime.ControlledComposition composition;
    private int compositionToken;
    private int compoundKeyHash;
    private androidx.compose.runtime.changelist.ChangeList deferredChanges;
    private boolean forceRecomposeScopes;
    private boolean forciblyRecompose;
    private int groupNodeCount;
    private boolean implicitRootStart;
    private androidx.compose.runtime.Anchor insertAnchor;
    private androidx.compose.runtime.changelist.FixupList insertFixups;
    private androidx.compose.runtime.SlotTable insertTable;
    private boolean inserting;
    private boolean isComposing;
    private boolean isDisposed;
    private androidx.compose.runtime.changelist.ChangeList lateChanges;
    private int[] nodeCountOverrides;
    private androidx.collection.MutableIntIntMap nodeCountVirtualOverrides;
    private boolean nodeExpected;
    private int nodeIndex;
    private final androidx.compose.runtime.CompositionContext parentContext;
    private androidx.compose.runtime.Pending pending;
    private androidx.compose.runtime.PersistentCompositionLocalMap providerCache;
    private androidx.compose.runtime.collection.IntMap<androidx.compose.runtime.PersistentCompositionLocalMap> providerUpdates;
    private boolean providersInvalid;
    private androidx.compose.runtime.SlotReader reader;
    private boolean reusing;
    private final androidx.compose.runtime.SlotTable slotTable;
    private boolean sourceInformationEnabled;
    private boolean startedGroup;
    private final androidx.compose.runtime.IntStack startedGroups;
    private androidx.compose.runtime.SlotWriter writer;
    private boolean writerHasAProvider;
    private final androidx.compose.runtime.Stack<androidx.compose.runtime.Pending> pendingStack = new androidx.compose.runtime.Stack<>();
    private androidx.compose.runtime.IntStack nodeIndexStack = new androidx.compose.runtime.IntStack();
    private androidx.compose.runtime.IntStack groupNodeCountStack = new androidx.compose.runtime.IntStack();
    private final java.util.List<androidx.compose.runtime.Invalidation> invalidations = new java.util.ArrayList();
    private final androidx.compose.runtime.IntStack entersStack = new androidx.compose.runtime.IntStack();
    private androidx.compose.runtime.PersistentCompositionLocalMap parentProvider = androidx.compose.runtime.internal.PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf();
    private final androidx.compose.runtime.IntStack providersInvalidStack = new androidx.compose.runtime.IntStack();
    private int reusingGroup = -1;
    private final androidx.compose.runtime.ComposerImpl$derivedStateObserver$1 derivedStateObserver = new androidx.compose.runtime.DerivedStateObserver() { // from class: androidx.compose.runtime.ComposerImpl$derivedStateObserver$1
        @Override // androidx.compose.runtime.DerivedStateObserver
        public void start(androidx.compose.runtime.DerivedState<?> derivedState) {
            androidx.compose.runtime.ComposerImpl.this.childrenComposing++;
        }

        @Override // androidx.compose.runtime.DerivedStateObserver
        public void done(androidx.compose.runtime.DerivedState<?> derivedState) {
            androidx.compose.runtime.ComposerImpl composerImpl = androidx.compose.runtime.ComposerImpl.this;
            composerImpl.childrenComposing--;
        }
    };
    private final androidx.compose.runtime.Stack<androidx.compose.runtime.RecomposeScopeImpl> invalidateStack = new androidx.compose.runtime.Stack<>();

    public static /* synthetic */ void getCompoundKeyHash$annotations() {
    }

    @androidx.compose.runtime.ComposeCompilerApi
    public static /* synthetic */ void getDefaultsInvalid$annotations() {
    }

    @androidx.compose.runtime.ComposeCompilerApi
    public static /* synthetic */ void getInserting$annotations() {
    }

    @androidx.compose.runtime.ComposeCompilerApi
    public static /* synthetic */ void getSkipping$annotations() {
    }

    private final int insertedGroupVirtualIndex(int index) {
        return (-2) - index;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [androidx.compose.runtime.ComposerImpl$derivedStateObserver$1] */
    public ComposerImpl(androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.CompositionContext compositionContext, androidx.compose.runtime.SlotTable slotTable, java.util.Set<androidx.compose.runtime.RememberObserver> set, androidx.compose.runtime.changelist.ChangeList changeList, androidx.compose.runtime.changelist.ChangeList changeList2, androidx.compose.runtime.ControlledComposition controlledComposition) {
        this.applier = applier;
        this.parentContext = compositionContext;
        this.slotTable = slotTable;
        this.abandonSet = set;
        this.changes = changeList;
        this.lateChanges = changeList2;
        this.composition = controlledComposition;
        androidx.compose.runtime.SlotReader openReader = slotTable.openReader();
        openReader.close();
        this.reader = openReader;
        androidx.compose.runtime.SlotTable slotTable2 = new androidx.compose.runtime.SlotTable();
        this.insertTable = slotTable2;
        androidx.compose.runtime.SlotWriter openWriter = slotTable2.openWriter();
        openWriter.close();
        this.writer = openWriter;
        this.changeListWriter = new androidx.compose.runtime.changelist.ComposerChangeListWriter(this, this.changes);
        androidx.compose.runtime.SlotReader openReader2 = this.insertTable.openReader();
        try {
            androidx.compose.runtime.Anchor anchor = openReader2.anchor(0);
            openReader2.close();
            this.insertAnchor = anchor;
            this.insertFixups = new androidx.compose.runtime.changelist.FixupList();
            this.implicitRootStart = true;
            this.startedGroups = new androidx.compose.runtime.IntStack();
        } catch (java.lang.Throwable th) {
            openReader2.close();
            throw th;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public androidx.compose.runtime.Applier<?> getApplier() {
        return this.applier;
    }

    @Override // androidx.compose.runtime.Composer
    public androidx.compose.runtime.ControlledComposition getComposition() {
        return this.composition;
    }

    /* renamed from: isComposing$runtime_release, reason: from getter */
    public final boolean getIsComposing() {
        return this.isComposing;
    }

    /* renamed from: isDisposed$runtime_release, reason: from getter */
    public final boolean getIsDisposed() {
        return this.isDisposed;
    }

    public final boolean getAreChildrenComposing$runtime_release() {
        return this.childrenComposing > 0;
    }

    public final boolean getHasPendingChanges$runtime_release() {
        return this.changes.isNotEmpty();
    }

    /* renamed from: getReader$runtime_release, reason: from getter */
    public final androidx.compose.runtime.SlotReader getReader() {
        return this.reader;
    }

    public final void setReader$runtime_release(androidx.compose.runtime.SlotReader slotReader) {
        this.reader = slotReader;
    }

    /* renamed from: getInsertTable$runtime_release, reason: from getter */
    public final androidx.compose.runtime.SlotTable getInsertTable() {
        return this.insertTable;
    }

    public final void setInsertTable$runtime_release(androidx.compose.runtime.SlotTable slotTable) {
        this.insertTable = slotTable;
    }

    /* renamed from: getDeferredChanges$runtime_release, reason: from getter */
    public final androidx.compose.runtime.changelist.ChangeList getDeferredChanges() {
        return this.deferredChanges;
    }

    public final void setDeferredChanges$runtime_release(androidx.compose.runtime.changelist.ChangeList changeList) {
        this.deferredChanges = changeList;
    }

    @Override // androidx.compose.runtime.Composer
    public kotlin.coroutines.CoroutineContext getApplyCoroutineContext() {
        return this.parentContext.getEffectCoroutineContext();
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public void startReplaceableGroup(int key) {
        m1611startBaiHCIY(key, null, androidx.compose.runtime.GroupKind.INSTANCE.m1623getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public void endReplaceableGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public void startDefaults() {
        m1611startBaiHCIY(-127, null, androidx.compose.runtime.GroupKind.INSTANCE.m1623getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public void endDefaults() {
        endGroup();
        androidx.compose.runtime.RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release == null || !currentRecomposeScope$runtime_release.getUsed()) {
            return;
        }
        currentRecomposeScope$runtime_release.setDefaultsInScope(true);
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getDefaultsInvalid() {
        if (!getSkipping() || this.providersInvalid) {
            return true;
        }
        androidx.compose.runtime.RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        return currentRecomposeScope$runtime_release != null && currentRecomposeScope$runtime_release.getDefaultsInvalid();
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public void startMovableGroup(int key, java.lang.Object dataKey) {
        m1611startBaiHCIY(key, dataKey, androidx.compose.runtime.GroupKind.INSTANCE.m1623getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public void endMovableGroup() {
        endGroup();
    }

    private final void startRoot() {
        int asInt;
        this.reader = this.slotTable.openReader();
        startGroup(100);
        this.parentContext.startComposing$runtime_release();
        this.parentProvider = this.parentContext.getCompositionLocalScope$runtime_release();
        androidx.compose.runtime.IntStack intStack = this.providersInvalidStack;
        asInt = androidx.compose.runtime.ComposerKt.asInt(this.providersInvalid);
        intStack.push(asInt);
        this.providersInvalid = changed(this.parentProvider);
        this.providerCache = null;
        if (!this.forceRecomposeScopes) {
            this.forceRecomposeScopes = this.parentContext.getCollectingParameterInformation();
        }
        if (!this.sourceInformationEnabled) {
            this.sourceInformationEnabled = this.parentContext.getCollectingSourceInformation();
        }
        java.util.Set<androidx.compose.runtime.tooling.CompositionData> set = (java.util.Set) androidx.compose.runtime.CompositionLocalMapKt.read(this.parentProvider, androidx.compose.runtime.tooling.InspectionTablesKt.getLocalInspectionTables());
        if (set != null) {
            set.add(this.slotTable);
            this.parentContext.recordInspectionTable$runtime_release(set);
        }
        startGroup(this.parentContext.getCompoundHashKey());
    }

    private final void endRoot() {
        endGroup();
        this.parentContext.doneComposing$runtime_release();
        endGroup();
        this.changeListWriter.endRoot();
        finalizeCompose();
        this.reader.close();
        this.forciblyRecompose = false;
    }

    private final void abortRoot() {
        cleanUpCompose();
        this.pendingStack.clear();
        this.nodeIndexStack.clear();
        this.groupNodeCountStack.clear();
        this.entersStack.clear();
        this.providersInvalidStack.clear();
        this.providerUpdates = null;
        if (!this.reader.getClosed()) {
            this.reader.close();
        }
        if (!this.writer.getClosed()) {
            this.writer.close();
        }
        this.insertFixups.clear();
        createFreshInsertTable();
        this.compoundKeyHash = 0;
        this.childrenComposing = 0;
        this.nodeExpected = false;
        this.inserting = false;
        this.reusing = false;
        this.isComposing = false;
        this.forciblyRecompose = false;
        this.reusingGroup = -1;
    }

    public final void changesApplied$runtime_release() {
        this.providerUpdates = null;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getInserting() {
        return this.inserting;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getSkipping() {
        androidx.compose.runtime.RecomposeScopeImpl currentRecomposeScope$runtime_release;
        return (getInserting() || this.reusing || this.providersInvalid || (currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release()) == null || currentRecomposeScope$runtime_release.getRequiresRecompose() || this.forciblyRecompose) ? false : true;
    }

    @Override // androidx.compose.runtime.Composer
    public int getCompoundKeyHash() {
        return this.compoundKeyHash;
    }

    @Override // androidx.compose.runtime.Composer
    public void collectParameterInformation() {
        this.forceRecomposeScopes = true;
        this.sourceInformationEnabled = true;
    }

    public final void dispose$runtime_release() {
        java.lang.Object beginSection = androidx.compose.runtime.Trace.INSTANCE.beginSection("Compose:Composer.dispose");
        try {
            this.parentContext.unregisterComposer$runtime_release(this);
            deactivate$runtime_release();
            getApplier().clear();
            this.isDisposed = true;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            androidx.compose.runtime.Trace.INSTANCE.endSection(beginSection);
        }
    }

    public final void deactivate$runtime_release() {
        this.invalidateStack.clear();
        this.invalidations.clear();
        this.changes.clear();
        this.providerUpdates = null;
    }

    public final boolean forceRecomposeScopes$runtime_release() {
        if (this.forceRecomposeScopes) {
            return false;
        }
        this.forceRecomposeScopes = true;
        this.forciblyRecompose = true;
        return true;
    }

    private final void startGroup(int key) {
        m1611startBaiHCIY(key, null, androidx.compose.runtime.GroupKind.INSTANCE.m1623getGroupULZAiWs(), null);
    }

    private final void startGroup(int key, java.lang.Object dataKey) {
        m1611startBaiHCIY(key, dataKey, androidx.compose.runtime.GroupKind.INSTANCE.m1623getGroupULZAiWs(), null);
    }

    private final void endGroup() {
        end(false);
    }

    private final void skipGroup() {
        this.groupNodeCount += this.reader.skipGroup();
    }

    @Override // androidx.compose.runtime.Composer
    public void startNode() {
        m1611startBaiHCIY(125, null, androidx.compose.runtime.GroupKind.INSTANCE.m1624getNodeULZAiWs(), null);
        this.nodeExpected = true;
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableNode() {
        m1611startBaiHCIY(125, null, androidx.compose.runtime.GroupKind.INSTANCE.m1625getReusableNodeULZAiWs(), null);
        this.nodeExpected = true;
    }

    @Override // androidx.compose.runtime.Composer
    public <T> void createNode(kotlin.jvm.functions.Function0<? extends T> factory) {
        validateNodeExpected();
        if (getInserting()) {
            int peek = this.nodeIndexStack.peek();
            androidx.compose.runtime.SlotWriter slotWriter = this.writer;
            androidx.compose.runtime.Anchor anchor = slotWriter.anchor(slotWriter.getParent());
            this.groupNodeCount++;
            this.insertFixups.createAndInsertNode(factory, peek, anchor);
            return;
        }
        androidx.compose.runtime.ComposerKt.composeRuntimeError("createNode() can only be called when inserting".toString());
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.Composer
    public void useNode() {
        validateNodeExpected();
        if (!getInserting()) {
            java.lang.Object node = getNode(this.reader);
            this.changeListWriter.moveDown(node);
            if (this.reusing && (node instanceof androidx.compose.runtime.ComposeNodeLifecycleCallback)) {
                this.changeListWriter.useNode(node);
                return;
            }
            return;
        }
        androidx.compose.runtime.ComposerKt.composeRuntimeError("useNode() called while inserting".toString());
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.Composer
    public void endNode() {
        end(true);
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableGroup(int key, java.lang.Object dataKey) {
        if (!getInserting() && this.reader.getGroupKey() == key && !kotlin.jvm.internal.Intrinsics.areEqual(this.reader.getGroupAux(), dataKey) && this.reusingGroup < 0) {
            this.reusingGroup = this.reader.getCurrentGroup();
            this.reusing = true;
        }
        m1611startBaiHCIY(key, null, androidx.compose.runtime.GroupKind.INSTANCE.m1623getGroupULZAiWs(), dataKey);
    }

    @Override // androidx.compose.runtime.Composer
    public void endReusableGroup() {
        if (this.reusing && this.reader.getParent() == this.reusingGroup) {
            this.reusingGroup = -1;
            this.reusing = false;
        }
        end(false);
    }

    @Override // androidx.compose.runtime.Composer
    public void disableReusing() {
        this.reusing = false;
    }

    @Override // androidx.compose.runtime.Composer
    public void enableReusing() {
        this.reusing = this.reusingGroup >= 0;
    }

    public final void startReuseFromRoot() {
        this.reusingGroup = 100;
        this.reusing = true;
    }

    public final void endReuseFromRoot() {
        if (this.isComposing || this.reusingGroup != 100) {
            throw new java.lang.IllegalArgumentException("Cannot disable reuse from root if it was caused by other groups".toString());
        }
        this.reusingGroup = -1;
        this.reusing = false;
    }

    @Override // androidx.compose.runtime.Composer
    public int getCurrentMarker() {
        return getInserting() ? -this.writer.getParent() : this.reader.getParent();
    }

    @Override // androidx.compose.runtime.Composer
    public void endToMarker(int marker) {
        if (marker < 0) {
            int i = -marker;
            androidx.compose.runtime.SlotWriter slotWriter = this.writer;
            while (true) {
                int parent = slotWriter.getParent();
                if (parent <= i) {
                    return;
                } else {
                    end(slotWriter.isNode(parent));
                }
            }
        } else {
            if (getInserting()) {
                androidx.compose.runtime.SlotWriter slotWriter2 = this.writer;
                while (getInserting()) {
                    end(slotWriter2.isNode(slotWriter2.getParent()));
                }
            }
            androidx.compose.runtime.SlotReader slotReader = this.reader;
            while (true) {
                int parent2 = slotReader.getParent();
                if (parent2 <= marker) {
                    return;
                } else {
                    end(slotReader.isNode(parent2));
                }
            }
        }
    }

    @Override // androidx.compose.runtime.Composer
    public <V, T> void apply(V value, kotlin.jvm.functions.Function2<? super T, ? super V, kotlin.Unit> block) {
        if (getInserting()) {
            this.insertFixups.updateNode(value, block);
        } else {
            this.changeListWriter.updateNode(value, block);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public java.lang.Object joinKey(java.lang.Object left, java.lang.Object right) {
        java.lang.Object key;
        key = androidx.compose.runtime.ComposerKt.getKey(this.reader.getGroupObjectKey(), left, right);
        return key == null ? new androidx.compose.runtime.JoinedKey(left, right) : key;
    }

    public final java.lang.Object nextSlot() {
        if (getInserting()) {
            validateNodeNotExpected();
            return androidx.compose.runtime.Composer.INSTANCE.getEmpty();
        }
        java.lang.Object next = this.reader.next();
        return (!this.reusing || (next instanceof androidx.compose.runtime.ReusableRememberObserver)) ? next : androidx.compose.runtime.Composer.INSTANCE.getEmpty();
    }

    public final java.lang.Object nextSlotForCache() {
        if (getInserting()) {
            validateNodeNotExpected();
            return androidx.compose.runtime.Composer.INSTANCE.getEmpty();
        }
        java.lang.Object next = this.reader.next();
        return (!this.reusing || (next instanceof androidx.compose.runtime.ReusableRememberObserver)) ? next instanceof androidx.compose.runtime.RememberObserverHolder ? ((androidx.compose.runtime.RememberObserverHolder) next).getWrapped() : next : androidx.compose.runtime.Composer.INSTANCE.getEmpty();
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public boolean changed(java.lang.Object value) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(nextSlot(), value)) {
            return false;
        }
        updateValue(value);
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public boolean changedInstance(java.lang.Object value) {
        if (nextSlot() == value) {
            return false;
        }
        updateValue(value);
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public boolean changed(char value) {
        java.lang.Object nextSlot = nextSlot();
        if ((nextSlot instanceof java.lang.Character) && value == ((java.lang.Character) nextSlot).charValue()) {
            return false;
        }
        updateValue(java.lang.Character.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public boolean changed(byte value) {
        java.lang.Object nextSlot = nextSlot();
        if ((nextSlot instanceof java.lang.Byte) && value == ((java.lang.Number) nextSlot).byteValue()) {
            return false;
        }
        updateValue(java.lang.Byte.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public boolean changed(short value) {
        java.lang.Object nextSlot = nextSlot();
        if ((nextSlot instanceof java.lang.Short) && value == ((java.lang.Number) nextSlot).shortValue()) {
            return false;
        }
        updateValue(java.lang.Short.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public boolean changed(boolean value) {
        java.lang.Object nextSlot = nextSlot();
        if ((nextSlot instanceof java.lang.Boolean) && value == ((java.lang.Boolean) nextSlot).booleanValue()) {
            return false;
        }
        updateValue(java.lang.Boolean.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public boolean changed(float value) {
        java.lang.Object nextSlot = nextSlot();
        if ((nextSlot instanceof java.lang.Float) && value == ((java.lang.Number) nextSlot).floatValue()) {
            return false;
        }
        updateValue(java.lang.Float.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public boolean changed(long value) {
        java.lang.Object nextSlot = nextSlot();
        if ((nextSlot instanceof java.lang.Long) && value == ((java.lang.Number) nextSlot).longValue()) {
            return false;
        }
        updateValue(java.lang.Long.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public boolean changed(double value) {
        java.lang.Object nextSlot = nextSlot();
        if ((nextSlot instanceof java.lang.Double) && value == ((java.lang.Number) nextSlot).doubleValue()) {
            return false;
        }
        updateValue(java.lang.Double.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public boolean changed(int value) {
        java.lang.Object nextSlot = nextSlot();
        if ((nextSlot instanceof java.lang.Integer) && value == ((java.lang.Number) nextSlot).intValue()) {
            return false;
        }
        updateValue(java.lang.Integer.valueOf(value));
        return true;
    }

    @androidx.compose.runtime.ComposeCompilerApi
    public final <T> T cache(boolean invalid, kotlin.jvm.functions.Function0<? extends T> block) {
        T t = (T) nextSlotForCache();
        if (t != androidx.compose.runtime.Composer.INSTANCE.getEmpty() && !invalid) {
            return t;
        }
        T invoke = block.invoke();
        updateCachedValue(invoke);
        return invoke;
    }

    private final void updateSlot(java.lang.Object value) {
        nextSlot();
        updateValue(value);
    }

    public final void updateValue(java.lang.Object value) {
        if (getInserting()) {
            this.writer.update(value);
        } else {
            this.changeListWriter.updateValue(value, this.reader.getGroupSlotIndex() - 1);
        }
    }

    public final void updateCachedValue(java.lang.Object value) {
        if (value instanceof androidx.compose.runtime.RememberObserver) {
            if (getInserting()) {
                this.changeListWriter.remember((androidx.compose.runtime.RememberObserver) value);
            }
            this.abandonSet.add(value);
            value = new androidx.compose.runtime.RememberObserverHolder((androidx.compose.runtime.RememberObserver) value);
        }
        updateValue(value);
    }

    @Override // androidx.compose.runtime.Composer
    public androidx.compose.runtime.tooling.CompositionData getCompositionData() {
        return this.slotTable;
    }

    @Override // androidx.compose.runtime.Composer
    public void recordSideEffect(kotlin.jvm.functions.Function0<kotlin.Unit> effect) {
        this.changeListWriter.sideEffect(effect);
    }

    private final androidx.compose.runtime.PersistentCompositionLocalMap currentCompositionLocalScope() {
        androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap = this.providerCache;
        return persistentCompositionLocalMap != null ? persistentCompositionLocalMap : currentCompositionLocalScope(this.reader.getParent());
    }

    @Override // androidx.compose.runtime.Composer
    public androidx.compose.runtime.CompositionLocalMap getCurrentCompositionLocalMap() {
        return currentCompositionLocalScope();
    }

    private final androidx.compose.runtime.PersistentCompositionLocalMap currentCompositionLocalScope(int group) {
        androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap;
        if (getInserting() && this.writerHasAProvider) {
            int parent = this.writer.getParent();
            while (parent > 0) {
                if (this.writer.groupKey(parent) == 202 && kotlin.jvm.internal.Intrinsics.areEqual(this.writer.groupObjectKey(parent), androidx.compose.runtime.ComposerKt.getCompositionLocalMap())) {
                    java.lang.Object groupAux = this.writer.groupAux(parent);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(groupAux, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap2 = (androidx.compose.runtime.PersistentCompositionLocalMap) groupAux;
                    this.providerCache = persistentCompositionLocalMap2;
                    return persistentCompositionLocalMap2;
                }
                parent = this.writer.parent(parent);
            }
        }
        if (this.reader.getGroupsSize() > 0) {
            while (group > 0) {
                if (this.reader.groupKey(group) == 202 && kotlin.jvm.internal.Intrinsics.areEqual(this.reader.groupObjectKey(group), androidx.compose.runtime.ComposerKt.getCompositionLocalMap())) {
                    androidx.compose.runtime.collection.IntMap<androidx.compose.runtime.PersistentCompositionLocalMap> intMap = this.providerUpdates;
                    if (intMap == null || (persistentCompositionLocalMap = intMap.get(group)) == null) {
                        java.lang.Object groupAux2 = this.reader.groupAux(group);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(groupAux2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        persistentCompositionLocalMap = (androidx.compose.runtime.PersistentCompositionLocalMap) groupAux2;
                    }
                    this.providerCache = persistentCompositionLocalMap;
                    return persistentCompositionLocalMap;
                }
                group = this.reader.parent(group);
            }
        }
        androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap3 = this.parentProvider;
        this.providerCache = persistentCompositionLocalMap3;
        return persistentCompositionLocalMap3;
    }

    @Override // androidx.compose.runtime.Composer
    public void startProvider(androidx.compose.runtime.ProvidedValue<?> value) {
        androidx.compose.runtime.State<? extends java.lang.Object> state;
        androidx.compose.runtime.PersistentCompositionLocalMap putValue;
        int asInt;
        androidx.compose.runtime.PersistentCompositionLocalMap currentCompositionLocalScope = currentCompositionLocalScope();
        startGroup(201, androidx.compose.runtime.ComposerKt.getProvider());
        java.lang.Object rememberedValue = rememberedValue();
        if (kotlin.jvm.internal.Intrinsics.areEqual(rememberedValue, androidx.compose.runtime.Composer.INSTANCE.getEmpty())) {
            state = null;
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNull(rememberedValue, "null cannot be cast to non-null type androidx.compose.runtime.State<kotlin.Any?>");
            state = (androidx.compose.runtime.State) rememberedValue;
        }
        androidx.compose.runtime.CompositionLocal<?> compositionLocal = value.getCompositionLocal();
        kotlin.jvm.internal.Intrinsics.checkNotNull(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        androidx.compose.runtime.State<?> updatedStateOf$runtime_release = compositionLocal.updatedStateOf$runtime_release(value.getValue(), state);
        boolean z = true;
        boolean z2 = !kotlin.jvm.internal.Intrinsics.areEqual(updatedStateOf$runtime_release, state);
        if (z2) {
            updateRememberedValue(updatedStateOf$runtime_release);
        }
        boolean z3 = false;
        if (getInserting()) {
            putValue = currentCompositionLocalScope.putValue(compositionLocal, updatedStateOf$runtime_release);
            this.writerHasAProvider = true;
        } else {
            androidx.compose.runtime.SlotReader slotReader = this.reader;
            java.lang.Object groupAux = slotReader.groupAux(slotReader.getCurrentGroup());
            kotlin.jvm.internal.Intrinsics.checkNotNull(groupAux, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap = (androidx.compose.runtime.PersistentCompositionLocalMap) groupAux;
            putValue = ((!getSkipping() || z2) && (value.getCanOverride() || !androidx.compose.runtime.CompositionLocalMapKt.contains(currentCompositionLocalScope, compositionLocal))) ? currentCompositionLocalScope.putValue(compositionLocal, updatedStateOf$runtime_release) : persistentCompositionLocalMap;
            if (!this.reusing && persistentCompositionLocalMap == putValue) {
                z = false;
            }
            z3 = z;
        }
        if (z3 && !getInserting()) {
            recordProviderUpdate(putValue);
        }
        androidx.compose.runtime.IntStack intStack = this.providersInvalidStack;
        asInt = androidx.compose.runtime.ComposerKt.asInt(this.providersInvalid);
        intStack.push(asInt);
        this.providersInvalid = z3;
        this.providerCache = putValue;
        m1611startBaiHCIY(202, androidx.compose.runtime.ComposerKt.getCompositionLocalMap(), androidx.compose.runtime.GroupKind.INSTANCE.m1623getGroupULZAiWs(), putValue);
    }

    private final void recordProviderUpdate(androidx.compose.runtime.PersistentCompositionLocalMap providers) {
        androidx.compose.runtime.collection.IntMap<androidx.compose.runtime.PersistentCompositionLocalMap> intMap = this.providerUpdates;
        if (intMap == null) {
            intMap = new androidx.compose.runtime.collection.IntMap<>(0, 1, null);
            this.providerUpdates = intMap;
        }
        intMap.set(this.reader.getCurrentGroup(), providers);
    }

    @Override // androidx.compose.runtime.Composer
    public void endProvider() {
        boolean asBool;
        endGroup();
        endGroup();
        asBool = androidx.compose.runtime.ComposerKt.asBool(this.providersInvalidStack.pop());
        this.providersInvalid = asBool;
        this.providerCache = null;
    }

    @Override // androidx.compose.runtime.Composer
    public void startProviders(androidx.compose.runtime.ProvidedValue<?>[] values) {
        androidx.compose.runtime.PersistentCompositionLocalMap updateProviderMapGroup;
        int asInt;
        androidx.compose.runtime.PersistentCompositionLocalMap currentCompositionLocalScope = currentCompositionLocalScope();
        startGroup(201, androidx.compose.runtime.ComposerKt.getProvider());
        boolean z = true;
        boolean z2 = false;
        if (getInserting()) {
            updateProviderMapGroup = updateProviderMapGroup(currentCompositionLocalScope, androidx.compose.runtime.CompositionLocalMapKt.updateCompositionMap$default(values, currentCompositionLocalScope, null, 4, null));
            this.writerHasAProvider = true;
        } else {
            java.lang.Object groupGet = this.reader.groupGet(0);
            kotlin.jvm.internal.Intrinsics.checkNotNull(groupGet, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap = (androidx.compose.runtime.PersistentCompositionLocalMap) groupGet;
            java.lang.Object groupGet2 = this.reader.groupGet(1);
            kotlin.jvm.internal.Intrinsics.checkNotNull(groupGet2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap2 = (androidx.compose.runtime.PersistentCompositionLocalMap) groupGet2;
            androidx.compose.runtime.PersistentCompositionLocalMap updateCompositionMap = androidx.compose.runtime.CompositionLocalMapKt.updateCompositionMap(values, currentCompositionLocalScope, persistentCompositionLocalMap2);
            if (!getSkipping() || this.reusing || !kotlin.jvm.internal.Intrinsics.areEqual(persistentCompositionLocalMap2, updateCompositionMap)) {
                updateProviderMapGroup = updateProviderMapGroup(currentCompositionLocalScope, updateCompositionMap);
                if (!this.reusing && kotlin.jvm.internal.Intrinsics.areEqual(updateProviderMapGroup, persistentCompositionLocalMap)) {
                    z = false;
                }
                z2 = z;
            } else {
                skipGroup();
                updateProviderMapGroup = persistentCompositionLocalMap;
            }
        }
        if (z2 && !getInserting()) {
            recordProviderUpdate(updateProviderMapGroup);
        }
        androidx.compose.runtime.IntStack intStack = this.providersInvalidStack;
        asInt = androidx.compose.runtime.ComposerKt.asInt(this.providersInvalid);
        intStack.push(asInt);
        this.providersInvalid = z2;
        this.providerCache = updateProviderMapGroup;
        m1611startBaiHCIY(202, androidx.compose.runtime.ComposerKt.getCompositionLocalMap(), androidx.compose.runtime.GroupKind.INSTANCE.m1623getGroupULZAiWs(), updateProviderMapGroup);
    }

    @Override // androidx.compose.runtime.Composer
    public void endProviders() {
        boolean asBool;
        endGroup();
        endGroup();
        asBool = androidx.compose.runtime.ComposerKt.asBool(this.providersInvalidStack.pop());
        this.providersInvalid = asBool;
        this.providerCache = null;
    }

    @Override // androidx.compose.runtime.Composer
    public <T> T consume(androidx.compose.runtime.CompositionLocal<T> key) {
        return (T) androidx.compose.runtime.CompositionLocalMapKt.read(currentCompositionLocalScope(), key);
    }

    @Override // androidx.compose.runtime.Composer
    public androidx.compose.runtime.CompositionContext buildContext() {
        startGroup(206, androidx.compose.runtime.ComposerKt.getReference());
        if (getInserting()) {
            androidx.compose.runtime.SlotWriter.markGroup$default(this.writer, 0, 1, null);
        }
        java.lang.Object nextSlot = nextSlot();
        androidx.compose.runtime.ComposerImpl.CompositionContextHolder compositionContextHolder = nextSlot instanceof androidx.compose.runtime.ComposerImpl.CompositionContextHolder ? (androidx.compose.runtime.ComposerImpl.CompositionContextHolder) nextSlot : null;
        if (compositionContextHolder == null) {
            int compoundKeyHash = getCompoundKeyHash();
            boolean z = this.forceRecomposeScopes;
            boolean z2 = this.sourceInformationEnabled;
            androidx.compose.runtime.ControlledComposition composition = getComposition();
            androidx.compose.runtime.CompositionImpl compositionImpl = composition instanceof androidx.compose.runtime.CompositionImpl ? (androidx.compose.runtime.CompositionImpl) composition : null;
            compositionContextHolder = new androidx.compose.runtime.ComposerImpl.CompositionContextHolder(new androidx.compose.runtime.ComposerImpl.CompositionContextImpl(compoundKeyHash, z, z2, compositionImpl != null ? compositionImpl.getObserverHolder() : null));
            updateValue(compositionContextHolder);
        }
        compositionContextHolder.getRef().updateCompositionLocalScope(currentCompositionLocalScope());
        endGroup();
        return compositionContextHolder.getRef();
    }

    public final int getChangeCount$runtime_release() {
        return this.changes.getSize();
    }

    public final androidx.compose.runtime.RecomposeScopeImpl getCurrentRecomposeScope$runtime_release() {
        androidx.compose.runtime.Stack<androidx.compose.runtime.RecomposeScopeImpl> stack = this.invalidateStack;
        if (this.childrenComposing == 0 && stack.isNotEmpty()) {
            return stack.peek();
        }
        return null;
    }

    private final void ensureWriter() {
        if (this.writer.getClosed()) {
            androidx.compose.runtime.SlotWriter openWriter = this.insertTable.openWriter();
            this.writer = openWriter;
            openWriter.skipToGroupEnd();
            this.writerHasAProvider = false;
            this.providerCache = null;
        }
    }

    private final void createFreshInsertTable() {
        androidx.compose.runtime.ComposerKt.runtimeCheck(this.writer.getClosed());
        androidx.compose.runtime.SlotTable slotTable = new androidx.compose.runtime.SlotTable();
        this.insertTable = slotTable;
        androidx.compose.runtime.SlotWriter openWriter = slotTable.openWriter();
        openWriter.close();
        this.writer = openWriter;
    }

    private final void startReaderGroup(boolean isNode, java.lang.Object data) {
        if (isNode) {
            this.reader.startNode();
            return;
        }
        if (data != null && this.reader.getGroupAux() != data) {
            this.changeListWriter.updateAuxData(data);
        }
        this.reader.startGroup();
    }

    /* renamed from: start-BaiHCIY, reason: not valid java name */
    private final void m1611startBaiHCIY(int key, java.lang.Object objectKey, int kind, java.lang.Object data) {
        java.lang.Object obj = objectKey;
        validateNodeNotExpected();
        updateCompoundKeyWhenWeEnterGroup(key, objectKey, data);
        boolean z = kind != androidx.compose.runtime.GroupKind.INSTANCE.m1623getGroupULZAiWs();
        androidx.compose.runtime.Pending pending = null;
        if (getInserting()) {
            this.reader.beginEmpty();
            int currentGroup = this.writer.getCurrentGroup();
            if (z) {
                this.writer.startNode(key, androidx.compose.runtime.Composer.INSTANCE.getEmpty());
            } else if (data != null) {
                androidx.compose.runtime.SlotWriter slotWriter = this.writer;
                if (obj == null) {
                    obj = androidx.compose.runtime.Composer.INSTANCE.getEmpty();
                }
                slotWriter.startData(key, obj, data);
            } else {
                androidx.compose.runtime.SlotWriter slotWriter2 = this.writer;
                if (obj == null) {
                    obj = androidx.compose.runtime.Composer.INSTANCE.getEmpty();
                }
                slotWriter2.startGroup(key, obj);
            }
            androidx.compose.runtime.Pending pending2 = this.pending;
            if (pending2 != null) {
                androidx.compose.runtime.KeyInfo keyInfo = new androidx.compose.runtime.KeyInfo(key, -1, insertedGroupVirtualIndex(currentGroup), -1, 0);
                pending2.registerInsert(keyInfo, this.nodeIndex - pending2.getStartIndex());
                pending2.recordUsed(keyInfo);
            }
            enterGroup(z, null);
            return;
        }
        boolean z2 = kind == androidx.compose.runtime.GroupKind.INSTANCE.m1624getNodeULZAiWs() && this.reusing;
        if (this.pending == null) {
            int groupKey = this.reader.getGroupKey();
            if (!z2 && groupKey == key && kotlin.jvm.internal.Intrinsics.areEqual(objectKey, this.reader.getGroupObjectKey())) {
                startReaderGroup(z, data);
            } else {
                this.pending = new androidx.compose.runtime.Pending(this.reader.extractKeys(), this.nodeIndex);
            }
        }
        androidx.compose.runtime.Pending pending3 = this.pending;
        if (pending3 != null) {
            androidx.compose.runtime.KeyInfo next = pending3.getNext(key, objectKey);
            if (!z2 && next != null) {
                pending3.recordUsed(next);
                int location = next.getLocation();
                this.nodeIndex = pending3.nodePositionOf(next) + pending3.getStartIndex();
                int slotPositionOf = pending3.slotPositionOf(next);
                int groupIndex = slotPositionOf - pending3.getGroupIndex();
                pending3.registerMoveSlot(slotPositionOf, pending3.getGroupIndex());
                this.changeListWriter.moveReaderRelativeTo(location);
                this.reader.reposition(location);
                if (groupIndex > 0) {
                    this.changeListWriter.moveCurrentGroup(groupIndex);
                }
                startReaderGroup(z, data);
            } else {
                this.reader.beginEmpty();
                this.inserting = true;
                this.providerCache = null;
                ensureWriter();
                this.writer.beginInsert();
                int currentGroup2 = this.writer.getCurrentGroup();
                if (z) {
                    this.writer.startNode(key, androidx.compose.runtime.Composer.INSTANCE.getEmpty());
                } else if (data != null) {
                    androidx.compose.runtime.SlotWriter slotWriter3 = this.writer;
                    if (obj == null) {
                        obj = androidx.compose.runtime.Composer.INSTANCE.getEmpty();
                    }
                    slotWriter3.startData(key, obj, data);
                } else {
                    androidx.compose.runtime.SlotWriter slotWriter4 = this.writer;
                    if (obj == null) {
                        obj = androidx.compose.runtime.Composer.INSTANCE.getEmpty();
                    }
                    slotWriter4.startGroup(key, obj);
                }
                this.insertAnchor = this.writer.anchor(currentGroup2);
                androidx.compose.runtime.KeyInfo keyInfo2 = new androidx.compose.runtime.KeyInfo(key, -1, insertedGroupVirtualIndex(currentGroup2), -1, 0);
                pending3.registerInsert(keyInfo2, this.nodeIndex - pending3.getStartIndex());
                pending3.recordUsed(keyInfo2);
                pending = new androidx.compose.runtime.Pending(new java.util.ArrayList(), z ? 0 : this.nodeIndex);
            }
        }
        enterGroup(z, pending);
    }

    private final void enterGroup(boolean isNode, androidx.compose.runtime.Pending newPending) {
        this.pendingStack.push(this.pending);
        this.pending = newPending;
        this.nodeIndexStack.push(this.nodeIndex);
        if (isNode) {
            this.nodeIndex = 0;
        }
        this.groupNodeCountStack.push(this.groupNodeCount);
        this.groupNodeCount = 0;
    }

    private final void exitGroup(int expectedNodeCount, boolean inserting) {
        androidx.compose.runtime.Pending pop = this.pendingStack.pop();
        if (pop != null && !inserting) {
            pop.setGroupIndex(pop.getGroupIndex() + 1);
        }
        this.pending = pop;
        this.nodeIndex = this.nodeIndexStack.pop() + expectedNodeCount;
        this.groupNodeCount = this.groupNodeCountStack.pop() + expectedNodeCount;
    }

    private final void end(boolean isNode) {
        java.util.Set set;
        java.util.List<androidx.compose.runtime.KeyInfo> list;
        if (getInserting()) {
            int parent = this.writer.getParent();
            updateCompoundKeyWhenWeExitGroup(this.writer.groupKey(parent), this.writer.groupObjectKey(parent), this.writer.groupAux(parent));
        } else {
            int parent2 = this.reader.getParent();
            updateCompoundKeyWhenWeExitGroup(this.reader.groupKey(parent2), this.reader.groupObjectKey(parent2), this.reader.groupAux(parent2));
        }
        int i = this.groupNodeCount;
        androidx.compose.runtime.Pending pending = this.pending;
        if (pending != null && pending.getKeyInfos().size() > 0) {
            java.util.List<androidx.compose.runtime.KeyInfo> keyInfos = pending.getKeyInfos();
            java.util.List<androidx.compose.runtime.KeyInfo> used = pending.getUsed();
            java.util.Set fastToSet = androidx.compose.runtime.snapshots.ListUtilsKt.fastToSet(used);
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            int size = used.size();
            int size2 = keyInfos.size();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < size2) {
                androidx.compose.runtime.KeyInfo keyInfo = keyInfos.get(i2);
                if (!fastToSet.contains(keyInfo)) {
                    this.changeListWriter.removeNode(pending.nodePositionOf(keyInfo) + pending.getStartIndex(), keyInfo.getNodes());
                    pending.updateNodeCount(keyInfo.getLocation(), 0);
                    this.changeListWriter.moveReaderRelativeTo(keyInfo.getLocation());
                    this.reader.reposition(keyInfo.getLocation());
                    recordDelete();
                    this.reader.skipGroup();
                    set = fastToSet;
                    androidx.compose.runtime.ComposerKt.removeRange(this.invalidations, keyInfo.getLocation(), keyInfo.getLocation() + this.reader.groupSize(keyInfo.getLocation()));
                } else {
                    set = fastToSet;
                    if (!linkedHashSet.contains(keyInfo)) {
                        if (i3 < size) {
                            androidx.compose.runtime.KeyInfo keyInfo2 = used.get(i3);
                            if (keyInfo2 != keyInfo) {
                                int nodePositionOf = pending.nodePositionOf(keyInfo2);
                                linkedHashSet.add(keyInfo2);
                                if (nodePositionOf != i4) {
                                    int updatedNodeCountOf = pending.updatedNodeCountOf(keyInfo2);
                                    list = used;
                                    this.changeListWriter.moveNode(pending.getStartIndex() + nodePositionOf, i4 + pending.getStartIndex(), updatedNodeCountOf);
                                    pending.registerMoveNode(nodePositionOf, i4, updatedNodeCountOf);
                                } else {
                                    list = used;
                                }
                            } else {
                                list = used;
                                i2++;
                            }
                            i3++;
                            i4 += pending.updatedNodeCountOf(keyInfo2);
                            fastToSet = set;
                            used = list;
                        } else {
                            fastToSet = set;
                        }
                    }
                }
                i2++;
                fastToSet = set;
            }
            this.changeListWriter.endNodeMovement();
            if (keyInfos.size() > 0) {
                this.changeListWriter.moveReaderRelativeTo(this.reader.getGroupEnd());
                this.reader.skipToGroupEnd();
            }
        }
        int i5 = this.nodeIndex;
        while (!this.reader.isGroupEnd()) {
            int currentGroup = this.reader.getCurrentGroup();
            recordDelete();
            this.changeListWriter.removeNode(i5, this.reader.skipGroup());
            androidx.compose.runtime.ComposerKt.removeRange(this.invalidations, currentGroup, this.reader.getCurrentGroup());
        }
        boolean inserting = getInserting();
        if (inserting) {
            if (isNode) {
                this.insertFixups.endNodeInsert();
                i = 1;
            }
            this.reader.endEmpty();
            int parent3 = this.writer.getParent();
            this.writer.endGroup();
            if (!this.reader.getInEmpty()) {
                int insertedGroupVirtualIndex = insertedGroupVirtualIndex(parent3);
                this.writer.endInsert();
                this.writer.close();
                recordInsert(this.insertAnchor);
                this.inserting = false;
                if (!this.slotTable.isEmpty()) {
                    updateNodeCount(insertedGroupVirtualIndex, 0);
                    updateNodeCountOverrides(insertedGroupVirtualIndex, i);
                }
            }
        } else {
            if (isNode) {
                this.changeListWriter.moveUp();
            }
            this.changeListWriter.endCurrentGroup();
            int parent4 = this.reader.getParent();
            if (i != updatedNodeCount(parent4)) {
                updateNodeCountOverrides(parent4, i);
            }
            if (isNode) {
                i = 1;
            }
            this.reader.endGroup();
            this.changeListWriter.endNodeMovement();
        }
        exitGroup(i, inserting);
    }

    private final void recomposeToGroupEnd() {
        androidx.compose.runtime.Invalidation firstInRange;
        boolean z = this.isComposing;
        this.isComposing = true;
        int parent = this.reader.getParent();
        int groupSize = this.reader.groupSize(parent) + parent;
        int i = this.nodeIndex;
        int compoundKeyHash = getCompoundKeyHash();
        int i2 = this.groupNodeCount;
        firstInRange = androidx.compose.runtime.ComposerKt.firstInRange(this.invalidations, this.reader.getCurrentGroup(), groupSize);
        boolean z2 = false;
        int i3 = parent;
        while (firstInRange != null) {
            int location = firstInRange.getLocation();
            androidx.compose.runtime.ComposerKt.removeLocation(this.invalidations, location);
            if (firstInRange.isInvalid()) {
                this.reader.reposition(location);
                int currentGroup = this.reader.getCurrentGroup();
                recordUpsAndDowns(i3, currentGroup, parent);
                this.nodeIndex = nodeIndexOf(location, currentGroup, parent, i);
                this.compoundKeyHash = compoundKeyOf(this.reader.parent(currentGroup), parent, compoundKeyHash);
                this.providerCache = null;
                firstInRange.getScope().compose(this);
                this.providerCache = null;
                this.reader.restoreParent(parent);
                i3 = currentGroup;
                z2 = true;
            } else {
                this.invalidateStack.push(firstInRange.getScope());
                firstInRange.getScope().rereadTrackedInstances();
                this.invalidateStack.pop();
            }
            firstInRange = androidx.compose.runtime.ComposerKt.firstInRange(this.invalidations, this.reader.getCurrentGroup(), groupSize);
        }
        if (z2) {
            recordUpsAndDowns(i3, parent, parent);
            this.reader.skipToGroupEnd();
            int updatedNodeCount = updatedNodeCount(parent);
            this.nodeIndex = i + updatedNodeCount;
            this.groupNodeCount = i2 + updatedNodeCount;
        } else {
            skipReaderToGroupEnd();
        }
        this.compoundKeyHash = compoundKeyHash;
        this.isComposing = z;
    }

    private final void updateNodeCountOverrides(int group, int newCount) {
        int updatedNodeCount = updatedNodeCount(group);
        if (updatedNodeCount != newCount) {
            int i = newCount - updatedNodeCount;
            int size = this.pendingStack.getSize() - 1;
            while (group != -1) {
                int updatedNodeCount2 = updatedNodeCount(group) + i;
                updateNodeCount(group, updatedNodeCount2);
                int i2 = size;
                while (true) {
                    if (-1 < i2) {
                        androidx.compose.runtime.Pending peek = this.pendingStack.peek(i2);
                        if (peek != null && peek.updateNodeCount(group, updatedNodeCount2)) {
                            size = i2 - 1;
                            break;
                        }
                        i2--;
                    } else {
                        break;
                    }
                }
                if (group < 0) {
                    group = this.reader.getParent();
                } else if (this.reader.isNode(group)) {
                    return;
                } else {
                    group = this.reader.parent(group);
                }
            }
        }
    }

    private final int nodeIndexOf(int groupLocation, int group, int recomposeGroup, int recomposeIndex) {
        int parent = this.reader.parent(group);
        while (parent != recomposeGroup && !this.reader.isNode(parent)) {
            parent = this.reader.parent(parent);
        }
        if (this.reader.isNode(parent)) {
            recomposeIndex = 0;
        }
        if (parent == group) {
            return recomposeIndex;
        }
        int updatedNodeCount = (updatedNodeCount(parent) - this.reader.nodeCount(group)) + recomposeIndex;
        loop1: while (recomposeIndex < updatedNodeCount && parent != groupLocation) {
            parent++;
            while (parent < groupLocation) {
                int groupSize = this.reader.groupSize(parent) + parent;
                if (groupLocation >= groupSize) {
                    recomposeIndex += updatedNodeCount(parent);
                    parent = groupSize;
                }
            }
            break loop1;
        }
        return recomposeIndex;
    }

    private final int updatedNodeCount(int group) {
        int i;
        if (group < 0) {
            androidx.collection.MutableIntIntMap mutableIntIntMap = this.nodeCountVirtualOverrides;
            if (mutableIntIntMap == null || !mutableIntIntMap.contains(group)) {
                return 0;
            }
            return mutableIntIntMap.get(group);
        }
        int[] iArr = this.nodeCountOverrides;
        return (iArr == null || (i = iArr[group]) < 0) ? this.reader.nodeCount(group) : i;
    }

    private final void updateNodeCount(int group, int count) {
        if (updatedNodeCount(group) != count) {
            if (group < 0) {
                androidx.collection.MutableIntIntMap mutableIntIntMap = this.nodeCountVirtualOverrides;
                if (mutableIntIntMap == null) {
                    mutableIntIntMap = new androidx.collection.MutableIntIntMap(0, 1, null);
                    this.nodeCountVirtualOverrides = mutableIntIntMap;
                }
                mutableIntIntMap.set(group, count);
                return;
            }
            int[] iArr = this.nodeCountOverrides;
            if (iArr == null) {
                iArr = new int[this.reader.getGroupsSize()];
                kotlin.collections.ArraysKt.fill$default(iArr, -1, 0, 0, 6, (java.lang.Object) null);
                this.nodeCountOverrides = iArr;
            }
            iArr[group] = count;
        }
    }

    private final void clearUpdatedNodeCounts() {
        this.nodeCountOverrides = null;
        this.nodeCountVirtualOverrides = null;
    }

    private final void recordUpsAndDowns(int oldGroup, int newGroup, int commonRoot) {
        int nearestCommonRootOf;
        androidx.compose.runtime.SlotReader slotReader = this.reader;
        nearestCommonRootOf = androidx.compose.runtime.ComposerKt.nearestCommonRootOf(slotReader, oldGroup, newGroup, commonRoot);
        while (oldGroup > 0 && oldGroup != nearestCommonRootOf) {
            if (slotReader.isNode(oldGroup)) {
                this.changeListWriter.moveUp();
            }
            oldGroup = slotReader.parent(oldGroup);
        }
        doRecordDownsFor(newGroup, nearestCommonRootOf);
    }

    private final void doRecordDownsFor(int group, int nearestCommonRoot) {
        if (group <= 0 || group == nearestCommonRoot) {
            return;
        }
        doRecordDownsFor(this.reader.parent(group), nearestCommonRoot);
        if (this.reader.isNode(group)) {
            this.changeListWriter.moveDown(nodeAt(this.reader, group));
        }
    }

    private final int compoundKeyOf(int group, int recomposeGroup, int recomposeKey) {
        if (group == recomposeGroup) {
            return recomposeKey;
        }
        int groupCompoundKeyPart = groupCompoundKeyPart(this.reader, group);
        return groupCompoundKeyPart == 126665345 ? groupCompoundKeyPart : java.lang.Integer.rotateLeft(compoundKeyOf(this.reader.parent(group), recomposeGroup, recomposeKey), 3) ^ groupCompoundKeyPart;
    }

    private final int groupCompoundKeyPart(androidx.compose.runtime.SlotReader slotReader, int i) {
        java.lang.Object groupAux;
        if (slotReader.hasObjectKey(i)) {
            java.lang.Object groupObjectKey = slotReader.groupObjectKey(i);
            if (groupObjectKey != null) {
                return groupObjectKey instanceof java.lang.Enum ? ((java.lang.Enum) groupObjectKey).ordinal() : groupObjectKey instanceof androidx.compose.runtime.MovableContent ? androidx.compose.runtime.MovableContentKt.movableContentKey : groupObjectKey.hashCode();
            }
            return 0;
        }
        int groupKey = slotReader.groupKey(i);
        if (groupKey == 207 && (groupAux = slotReader.groupAux(i)) != null && !kotlin.jvm.internal.Intrinsics.areEqual(groupAux, androidx.compose.runtime.Composer.INSTANCE.getEmpty())) {
            groupKey = groupAux.hashCode();
        }
        return groupKey;
    }

    public final boolean tryImminentInvalidation$runtime_release(androidx.compose.runtime.RecomposeScopeImpl scope, java.lang.Object instance) {
        androidx.compose.runtime.Anchor anchor = scope.getAnchor();
        if (anchor == null) {
            return false;
        }
        int indexFor = anchor.toIndexFor(this.reader.getTable());
        if (!this.isComposing || indexFor < this.reader.getCurrentGroup()) {
            return false;
        }
        androidx.compose.runtime.ComposerKt.insertIfMissing(this.invalidations, indexFor, scope, instance);
        return true;
    }

    public final int parentKey$runtime_release() {
        if (getInserting()) {
            androidx.compose.runtime.SlotWriter slotWriter = this.writer;
            return slotWriter.groupKey(slotWriter.getParent());
        }
        androidx.compose.runtime.SlotReader slotReader = this.reader;
        return slotReader.groupKey(slotReader.getParent());
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public void skipCurrentGroup() {
        if (this.invalidations.isEmpty()) {
            skipGroup();
            return;
        }
        androidx.compose.runtime.SlotReader slotReader = this.reader;
        int groupKey = slotReader.getGroupKey();
        java.lang.Object groupObjectKey = slotReader.getGroupObjectKey();
        java.lang.Object groupAux = slotReader.getGroupAux();
        updateCompoundKeyWhenWeEnterGroup(groupKey, groupObjectKey, groupAux);
        startReaderGroup(slotReader.isNode(), null);
        recomposeToGroupEnd();
        slotReader.endGroup();
        updateCompoundKeyWhenWeExitGroup(groupKey, groupObjectKey, groupAux);
    }

    private final void skipReaderToGroupEnd() {
        this.groupNodeCount = this.reader.getParentNodes();
        this.reader.skipToGroupEnd();
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public void skipToGroupEnd() {
        if (this.groupNodeCount == 0) {
            androidx.compose.runtime.RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
            if (currentRecomposeScope$runtime_release != null) {
                currentRecomposeScope$runtime_release.scopeSkipped();
            }
            if (this.invalidations.isEmpty()) {
                skipReaderToGroupEnd();
                return;
            } else {
                recomposeToGroupEnd();
                return;
            }
        }
        androidx.compose.runtime.ComposerKt.composeRuntimeError("No nodes can be emitted before calling skipAndEndGroup".toString());
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public void deactivateToEndGroup(boolean changed) {
        if (this.groupNodeCount == 0) {
            if (getInserting()) {
                return;
            }
            if (!changed) {
                skipReaderToGroupEnd();
                return;
            }
            int currentGroup = this.reader.getCurrentGroup();
            int currentEnd = this.reader.getCurrentEnd();
            this.changeListWriter.deactivateCurrentGroup();
            androidx.compose.runtime.ComposerKt.removeRange(this.invalidations, currentGroup, currentEnd);
            this.reader.skipToGroupEnd();
            return;
        }
        androidx.compose.runtime.ComposerKt.composeRuntimeError("No nodes can be emitted before calling dactivateToEndGroup".toString());
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public androidx.compose.runtime.Composer startRestartGroup(int key) {
        m1611startBaiHCIY(key, null, androidx.compose.runtime.GroupKind.INSTANCE.m1623getGroupULZAiWs(), null);
        addRecomposeScope();
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006b, code lost:
    
        if (r0 != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void addRecomposeScope() {
        androidx.compose.runtime.Invalidation removeLocation;
        androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl;
        boolean z;
        if (!getInserting()) {
            removeLocation = androidx.compose.runtime.ComposerKt.removeLocation(this.invalidations, this.reader.getParent());
            java.lang.Object next = this.reader.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(next, androidx.compose.runtime.Composer.INSTANCE.getEmpty())) {
                androidx.compose.runtime.ControlledComposition composition = getComposition();
                kotlin.jvm.internal.Intrinsics.checkNotNull(composition, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
                recomposeScopeImpl = new androidx.compose.runtime.RecomposeScopeImpl((androidx.compose.runtime.CompositionImpl) composition);
                updateValue(recomposeScopeImpl);
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNull(next, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                recomposeScopeImpl = (androidx.compose.runtime.RecomposeScopeImpl) next;
            }
            if (removeLocation == null) {
                boolean forcedRecompose = recomposeScopeImpl.getForcedRecompose();
                z = false;
                if (forcedRecompose) {
                    recomposeScopeImpl.setForcedRecompose(false);
                }
            }
            z = true;
            recomposeScopeImpl.setRequiresRecompose(z);
            this.invalidateStack.push(recomposeScopeImpl);
            recomposeScopeImpl.start(this.compositionToken);
            return;
        }
        androidx.compose.runtime.ControlledComposition composition2 = getComposition();
        kotlin.jvm.internal.Intrinsics.checkNotNull(composition2, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
        androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl2 = new androidx.compose.runtime.RecomposeScopeImpl((androidx.compose.runtime.CompositionImpl) composition2);
        this.invalidateStack.push(recomposeScopeImpl2);
        updateValue(recomposeScopeImpl2);
        recomposeScopeImpl2.start(this.compositionToken);
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public androidx.compose.runtime.ScopeUpdateScope endRestartGroup() {
        androidx.compose.runtime.Anchor anchor;
        kotlin.jvm.functions.Function1<androidx.compose.runtime.Composition, kotlin.Unit> end;
        androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl = null;
        androidx.compose.runtime.RecomposeScopeImpl pop = this.invalidateStack.isNotEmpty() ? this.invalidateStack.pop() : null;
        if (pop != null) {
            pop.setRequiresRecompose(false);
        }
        if (pop != null && (end = pop.end(this.compositionToken)) != null) {
            this.changeListWriter.endCompositionScope(end, getComposition());
        }
        if (pop != null && !pop.getSkipped$runtime_release() && (pop.getUsed() || this.forceRecomposeScopes)) {
            if (pop.getAnchor() == null) {
                if (getInserting()) {
                    androidx.compose.runtime.SlotWriter slotWriter = this.writer;
                    anchor = slotWriter.anchor(slotWriter.getParent());
                } else {
                    androidx.compose.runtime.SlotReader slotReader = this.reader;
                    anchor = slotReader.anchor(slotReader.getParent());
                }
                pop.setAnchor(anchor);
            }
            pop.setDefaultsInvalid(false);
            recomposeScopeImpl = pop;
        }
        end(false);
        return recomposeScopeImpl;
    }

    @Override // androidx.compose.runtime.Composer
    public void insertMovableContent(androidx.compose.runtime.MovableContent<?> value, java.lang.Object parameter) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        invokeMovableContentLambda(value, currentCompositionLocalScope(), parameter, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        recordProviderUpdate(r13);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invokeMovableContentLambda(final androidx.compose.runtime.MovableContent<java.lang.Object> content, androidx.compose.runtime.PersistentCompositionLocalMap locals, final java.lang.Object parameter, boolean force) {
        startMovableGroup(androidx.compose.runtime.MovableContentKt.movableContentKey, content);
        updateSlot(parameter);
        int compoundKeyHash = getCompoundKeyHash();
        try {
            this.compoundKeyHash = androidx.compose.runtime.MovableContentKt.movableContentKey;
            boolean z = false;
            if (getInserting()) {
                androidx.compose.runtime.SlotWriter.markGroup$default(this.writer, 0, 1, null);
            }
            if (!getInserting() && !kotlin.jvm.internal.Intrinsics.areEqual(this.reader.getGroupAux(), locals)) {
                z = true;
            }
            m1611startBaiHCIY(202, androidx.compose.runtime.ComposerKt.getCompositionLocalMap(), androidx.compose.runtime.GroupKind.INSTANCE.m1623getGroupULZAiWs(), locals);
            this.providerCache = null;
            if (getInserting() && !force) {
                this.writerHasAProvider = true;
                androidx.compose.runtime.SlotWriter slotWriter = this.writer;
                this.parentContext.insertMovableContent$runtime_release(new androidx.compose.runtime.MovableContentStateReference(content, parameter, getComposition(), this.insertTable, slotWriter.anchor(slotWriter.parent(slotWriter.getParent())), kotlin.collections.CollectionsKt.emptyList(), currentCompositionLocalScope()));
            } else {
                boolean z2 = this.providersInvalid;
                this.providersInvalid = z;
                androidx.compose.runtime.ActualJvm_jvmKt.invokeComposable(this, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(316014703, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.runtime.ComposerImpl$invokeMovableContentLambda$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                        invoke(composer, num.intValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(androidx.compose.runtime.Composer composer, int i) {
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C3004@113980L18:Composer.kt#9igjgp");
                        if ((i & 11) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(316014703, i, -1, "androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.<anonymous> (Composer.kt:3004)");
                        }
                        content.getContent().invoke(parameter, composer, 8);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    }
                }));
                this.providersInvalid = z2;
            }
        } finally {
            endGroup();
            this.providerCache = null;
            this.compoundKeyHash = compoundKeyHash;
            endMovableGroup();
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void insertMovableContentReferences(java.util.List<kotlin.Pair<androidx.compose.runtime.MovableContentStateReference, androidx.compose.runtime.MovableContentStateReference>> references) {
        try {
            insertMovableContentGuarded(references);
            cleanUpCompose();
        } catch (java.lang.Throwable th) {
            abortRoot();
            throw th;
        }
    }

    private final void insertMovableContentGuarded(java.util.List<kotlin.Pair<androidx.compose.runtime.MovableContentStateReference, androidx.compose.runtime.MovableContentStateReference>> references) {
        androidx.compose.runtime.changelist.ComposerChangeListWriter composerChangeListWriter;
        androidx.compose.runtime.changelist.ChangeList changeList;
        androidx.compose.runtime.changelist.ComposerChangeListWriter composerChangeListWriter2;
        androidx.compose.runtime.changelist.ChangeList changeList2;
        androidx.compose.runtime.SlotTable slotTable;
        androidx.compose.runtime.Anchor anchor;
        java.util.List<? extends java.lang.Object> collectNodesFrom;
        androidx.compose.runtime.SlotReader slotReader;
        androidx.compose.runtime.collection.IntMap intMap;
        androidx.compose.runtime.SlotReader slotReader2;
        int[] iArr;
        androidx.compose.runtime.changelist.ChangeList changeList3;
        int i;
        int i2;
        androidx.compose.runtime.SlotTable slotTable2;
        androidx.compose.runtime.SlotReader slotReader3;
        androidx.compose.runtime.changelist.ComposerChangeListWriter composerChangeListWriter3 = this.changeListWriter;
        androidx.compose.runtime.changelist.ChangeList changeList4 = this.lateChanges;
        androidx.compose.runtime.changelist.ChangeList changeList5 = composerChangeListWriter3.getChangeList();
        try {
            composerChangeListWriter3.setChangeList(changeList4);
            this.changeListWriter.resetSlots();
            int size = references.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size) {
                try {
                    kotlin.Pair<androidx.compose.runtime.MovableContentStateReference, androidx.compose.runtime.MovableContentStateReference> pair = references.get(i4);
                    final androidx.compose.runtime.MovableContentStateReference component1 = pair.component1();
                    androidx.compose.runtime.MovableContentStateReference component2 = pair.component2();
                    androidx.compose.runtime.Anchor anchor2 = component1.getAnchor();
                    int anchorIndex = component1.getSlotTable().anchorIndex(anchor2);
                    androidx.compose.runtime.internal.IntRef intRef = new androidx.compose.runtime.internal.IntRef(i3, 1, null);
                    this.changeListWriter.determineMovableContentNodeIndex(intRef, anchor2);
                    if (component2 == null) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(component1.getSlotTable(), this.insertTable)) {
                            createFreshInsertTable();
                        }
                        final androidx.compose.runtime.SlotReader openReader = component1.getSlotTable().openReader();
                        try {
                            openReader.reposition(anchorIndex);
                            this.changeListWriter.moveReaderToAbsolute(anchorIndex);
                            final androidx.compose.runtime.changelist.ChangeList changeList6 = new androidx.compose.runtime.changelist.ChangeList();
                            slotReader3 = openReader;
                            try {
                                recomposeMovableContent$default(this, null, null, null, null, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$1$1
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
                                        androidx.compose.runtime.changelist.ComposerChangeListWriter composerChangeListWriter4;
                                        androidx.compose.runtime.changelist.ComposerChangeListWriter composerChangeListWriter5;
                                        composerChangeListWriter4 = androidx.compose.runtime.ComposerImpl.this.changeListWriter;
                                        androidx.compose.runtime.changelist.ChangeList changeList7 = changeList6;
                                        androidx.compose.runtime.ComposerImpl composerImpl = androidx.compose.runtime.ComposerImpl.this;
                                        androidx.compose.runtime.SlotReader slotReader4 = openReader;
                                        androidx.compose.runtime.MovableContentStateReference movableContentStateReference = component1;
                                        androidx.compose.runtime.changelist.ChangeList changeList8 = composerChangeListWriter4.getChangeList();
                                        try {
                                            composerChangeListWriter4.setChangeList(changeList7);
                                            androidx.compose.runtime.SlotReader reader = composerImpl.getReader();
                                            int[] iArr2 = composerImpl.nodeCountOverrides;
                                            androidx.compose.runtime.collection.IntMap intMap2 = composerImpl.providerUpdates;
                                            composerImpl.nodeCountOverrides = null;
                                            composerImpl.providerUpdates = null;
                                            try {
                                                composerImpl.setReader$runtime_release(slotReader4);
                                                composerChangeListWriter5 = composerImpl.changeListWriter;
                                                boolean implicitRootStart = composerChangeListWriter5.getImplicitRootStart();
                                                try {
                                                    composerChangeListWriter5.setImplicitRootStart(false);
                                                    composerImpl.invokeMovableContentLambda(movableContentStateReference.getContent$runtime_release(), movableContentStateReference.getLocals(), movableContentStateReference.getParameter(), true);
                                                    composerChangeListWriter5.setImplicitRootStart(implicitRootStart);
                                                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                                } catch (java.lang.Throwable th) {
                                                    composerChangeListWriter5.setImplicitRootStart(implicitRootStart);
                                                    throw th;
                                                }
                                            } finally {
                                                composerImpl.setReader$runtime_release(reader);
                                                composerImpl.nodeCountOverrides = iArr2;
                                                composerImpl.providerUpdates = intMap2;
                                            }
                                        } finally {
                                            composerChangeListWriter4.setChangeList(changeList8);
                                        }
                                    }
                                }, 15, null);
                                this.changeListWriter.includeOperationsIn(changeList6, intRef);
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                slotReader3.close();
                                i = size;
                                composerChangeListWriter2 = composerChangeListWriter3;
                                changeList2 = changeList5;
                                i2 = i4;
                            } catch (java.lang.Throwable th) {
                                th = th;
                                slotReader3.close();
                                throw th;
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            slotReader3 = openReader;
                        }
                    } else {
                        androidx.compose.runtime.MovableContentState movableContentStateResolve$runtime_release = this.parentContext.movableContentStateResolve$runtime_release(component2);
                        if (movableContentStateResolve$runtime_release == null || (slotTable = movableContentStateResolve$runtime_release.getSlotTable()) == null) {
                            slotTable = component2.getSlotTable();
                        }
                        if (movableContentStateResolve$runtime_release == null || (slotTable2 = movableContentStateResolve$runtime_release.getSlotTable()) == null || (anchor = slotTable2.anchor(0)) == null) {
                            anchor = component2.getAnchor();
                        }
                        collectNodesFrom = androidx.compose.runtime.ComposerKt.collectNodesFrom(slotTable, anchor);
                        if (!collectNodesFrom.isEmpty()) {
                            this.changeListWriter.copyNodesToNewAnchorLocation(collectNodesFrom, intRef);
                            if (kotlin.jvm.internal.Intrinsics.areEqual(component1.getSlotTable(), this.slotTable)) {
                                int anchorIndex2 = this.slotTable.anchorIndex(anchor2);
                                updateNodeCount(anchorIndex2, updatedNodeCount(anchorIndex2) + collectNodesFrom.size());
                            }
                        }
                        this.changeListWriter.copySlotTableToAnchorLocation(movableContentStateResolve$runtime_release, this.parentContext, component2, component1);
                        androidx.compose.runtime.SlotReader openReader2 = slotTable.openReader();
                        try {
                            androidx.compose.runtime.SlotReader reader = getReader();
                            int[] iArr2 = this.nodeCountOverrides;
                            androidx.compose.runtime.collection.IntMap intMap2 = this.providerUpdates;
                            this.nodeCountOverrides = null;
                            this.providerUpdates = null;
                            try {
                                setReader$runtime_release(openReader2);
                                int anchorIndex3 = slotTable.anchorIndex(anchor);
                                openReader2.reposition(anchorIndex3);
                                this.changeListWriter.moveReaderToAbsolute(anchorIndex3);
                                androidx.compose.runtime.changelist.ChangeList changeList7 = new androidx.compose.runtime.changelist.ChangeList();
                                androidx.compose.runtime.changelist.ComposerChangeListWriter composerChangeListWriter4 = this.changeListWriter;
                                androidx.compose.runtime.changelist.ChangeList changeList8 = composerChangeListWriter4.getChangeList();
                                try {
                                    composerChangeListWriter4.setChangeList(changeList7);
                                    androidx.compose.runtime.changelist.ComposerChangeListWriter composerChangeListWriter5 = this.changeListWriter;
                                    composerChangeListWriter2 = composerChangeListWriter3;
                                    try {
                                        boolean implicitRootStart = composerChangeListWriter5.getImplicitRootStart();
                                        i = size;
                                        try {
                                            composerChangeListWriter5.setImplicitRootStart(false);
                                            androidx.compose.runtime.ControlledComposition composition = component2.getComposition();
                                            androidx.compose.runtime.ControlledComposition composition2 = component1.getComposition();
                                            java.lang.Integer valueOf = java.lang.Integer.valueOf(openReader2.getCurrentGroup());
                                            changeList2 = changeList5;
                                            changeList3 = changeList8;
                                            i2 = i4;
                                            slotReader = openReader2;
                                            iArr = iArr2;
                                            slotReader2 = reader;
                                            try {
                                                recomposeMovableContent(composition, composition2, valueOf, component2.getInvalidations$runtime_release(), new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$2$1$1$1$1
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
                                                        androidx.compose.runtime.ComposerImpl.this.invokeMovableContentLambda(component1.getContent$runtime_release(), component1.getLocals(), component1.getParameter(), true);
                                                    }
                                                });
                                                try {
                                                    composerChangeListWriter5.setImplicitRootStart(implicitRootStart);
                                                    try {
                                                        composerChangeListWriter4.setChangeList(changeList3);
                                                        this.changeListWriter.includeOperationsIn(changeList7, intRef);
                                                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                                        try {
                                                            setReader$runtime_release(slotReader2);
                                                            this.nodeCountOverrides = iArr;
                                                            this.providerUpdates = intMap2;
                                                            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                                                            try {
                                                                slotReader.close();
                                                            } catch (java.lang.Throwable th3) {
                                                                th = th3;
                                                                composerChangeListWriter = composerChangeListWriter2;
                                                                changeList = changeList2;
                                                                composerChangeListWriter.setChangeList(changeList);
                                                                throw th;
                                                            }
                                                        } catch (java.lang.Throwable th4) {
                                                            th = th4;
                                                            slotReader.close();
                                                            throw th;
                                                        }
                                                    } catch (java.lang.Throwable th5) {
                                                        th = th5;
                                                        intMap = intMap2;
                                                        setReader$runtime_release(slotReader2);
                                                        this.nodeCountOverrides = iArr;
                                                        this.providerUpdates = intMap;
                                                        throw th;
                                                    }
                                                } catch (java.lang.Throwable th6) {
                                                    th = th6;
                                                    intMap = intMap2;
                                                    try {
                                                        composerChangeListWriter4.setChangeList(changeList3);
                                                        throw th;
                                                    } catch (java.lang.Throwable th7) {
                                                        th = th7;
                                                        setReader$runtime_release(slotReader2);
                                                        this.nodeCountOverrides = iArr;
                                                        this.providerUpdates = intMap;
                                                        throw th;
                                                    }
                                                }
                                            } catch (java.lang.Throwable th8) {
                                                th = th8;
                                                intMap = intMap2;
                                                try {
                                                    composerChangeListWriter5.setImplicitRootStart(implicitRootStart);
                                                    throw th;
                                                } catch (java.lang.Throwable th9) {
                                                    th = th9;
                                                    composerChangeListWriter4.setChangeList(changeList3);
                                                    throw th;
                                                }
                                            }
                                        } catch (java.lang.Throwable th10) {
                                            th = th10;
                                            intMap = intMap2;
                                            slotReader2 = reader;
                                            slotReader = openReader2;
                                            changeList3 = changeList8;
                                            iArr = iArr2;
                                        }
                                    } catch (java.lang.Throwable th11) {
                                        th = th11;
                                        intMap = intMap2;
                                        slotReader2 = reader;
                                        slotReader = openReader2;
                                        changeList3 = changeList8;
                                        iArr = iArr2;
                                        composerChangeListWriter4.setChangeList(changeList3);
                                        throw th;
                                    }
                                } catch (java.lang.Throwable th12) {
                                    th = th12;
                                    intMap = intMap2;
                                    slotReader2 = reader;
                                }
                            } catch (java.lang.Throwable th13) {
                                th = th13;
                                intMap = intMap2;
                                slotReader2 = reader;
                                slotReader = openReader2;
                                iArr = iArr2;
                            }
                        } catch (java.lang.Throwable th14) {
                            th = th14;
                            slotReader = openReader2;
                        }
                    }
                    this.changeListWriter.skipToEndOfCurrentGroup();
                    i4 = i2 + 1;
                    composerChangeListWriter3 = composerChangeListWriter2;
                    size = i;
                    changeList5 = changeList2;
                    i3 = 0;
                } catch (java.lang.Throwable th15) {
                    th = th15;
                    composerChangeListWriter2 = composerChangeListWriter3;
                    changeList2 = changeList5;
                }
            }
            androidx.compose.runtime.changelist.ComposerChangeListWriter composerChangeListWriter6 = composerChangeListWriter3;
            androidx.compose.runtime.changelist.ChangeList changeList9 = changeList5;
            this.changeListWriter.endMovableContentPlacement();
            this.changeListWriter.moveReaderToAbsolute(0);
            composerChangeListWriter6.setChangeList(changeList9);
        } catch (java.lang.Throwable th16) {
            th = th16;
            composerChangeListWriter = composerChangeListWriter3;
            changeList = changeList5;
        }
    }

    private final <R> R withReader(androidx.compose.runtime.SlotReader reader, kotlin.jvm.functions.Function0<? extends R> block) {
        androidx.compose.runtime.SlotReader reader2 = getReader();
        int[] iArr = this.nodeCountOverrides;
        androidx.compose.runtime.collection.IntMap intMap = this.providerUpdates;
        this.nodeCountOverrides = null;
        this.providerUpdates = null;
        try {
            setReader$runtime_release(reader);
            return block.invoke();
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            setReader$runtime_release(reader2);
            this.nodeCountOverrides = iArr;
            this.providerUpdates = intMap;
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }

    static /* synthetic */ java.lang.Object recomposeMovableContent$default(androidx.compose.runtime.ComposerImpl composerImpl, androidx.compose.runtime.ControlledComposition controlledComposition, androidx.compose.runtime.ControlledComposition controlledComposition2, java.lang.Integer num, java.util.List list, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        androidx.compose.runtime.ControlledComposition controlledComposition3 = (i & 1) != 0 ? null : controlledComposition;
        androidx.compose.runtime.ControlledComposition controlledComposition4 = (i & 2) != 0 ? null : controlledComposition2;
        java.lang.Integer num2 = (i & 4) != 0 ? null : num;
        if ((i & 8) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        return composerImpl.recomposeMovableContent(controlledComposition3, controlledComposition4, num2, list, function0);
    }

    private final <R> R recomposeMovableContent(androidx.compose.runtime.ControlledComposition from, androidx.compose.runtime.ControlledComposition to, java.lang.Integer index, java.util.List<kotlin.Pair<androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object>>> invalidations, kotlin.jvm.functions.Function0<? extends R> block) {
        R r;
        boolean z = this.isComposing;
        int i = this.nodeIndex;
        try {
            this.isComposing = true;
            this.nodeIndex = 0;
            int size = invalidations.size();
            for (int i2 = 0; i2 < size; i2++) {
                kotlin.Pair<androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object>> pair = invalidations.get(i2);
                androidx.compose.runtime.RecomposeScopeImpl component1 = pair.component1();
                androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object> component2 = pair.component2();
                if (component2 == null) {
                    tryImminentInvalidation$runtime_release(component1, null);
                } else {
                    java.lang.Object[] values = component2.getValues();
                    int size2 = component2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        java.lang.Object obj = values[i3];
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        tryImminentInvalidation$runtime_release(component1, obj);
                    }
                }
            }
            if (from != null) {
                r = (R) from.delegateInvalidations(to, index != null ? index.intValue() : -1, block);
                if (r == null) {
                }
                return r;
            }
            r = block.invoke();
            return r;
        } finally {
            this.isComposing = z;
            this.nodeIndex = i;
        }
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public void sourceInformation(java.lang.String sourceInformation) {
        if (getInserting() && this.sourceInformationEnabled) {
            this.writer.recordGroupSourceInformation(sourceInformation);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public void sourceInformationMarkerStart(int key, java.lang.String sourceInformation) {
        if (getInserting() && this.sourceInformationEnabled) {
            this.writer.recordGrouplessCallSourceInformationStart(key, sourceInformation);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public void sourceInformationMarkerEnd() {
        if (getInserting() && this.sourceInformationEnabled) {
            this.writer.recordGrouplessCallSourceInformationEnd();
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void disableSourceInformation() {
        this.sourceInformationEnabled = false;
    }

    public final void composeContent$runtime_release(androidx.compose.runtime.collection.IdentityArrayMap<androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object>> invalidationsRequested, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content) {
        if (this.changes.isEmpty()) {
            doCompose(invalidationsRequested, content);
        } else {
            androidx.compose.runtime.ComposerKt.composeRuntimeError("Expected applyChanges() to have been called".toString());
            throw new kotlin.KotlinNothingValueException();
        }
    }

    public final void prepareCompose$runtime_release(kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        if (!this.isComposing) {
            this.isComposing = true;
            try {
                block.invoke();
                return;
            } finally {
                this.isComposing = false;
            }
        }
        androidx.compose.runtime.ComposerKt.composeRuntimeError("Preparing a composition while composing is not supported".toString());
        throw new kotlin.KotlinNothingValueException();
    }

    public final boolean recompose$runtime_release(androidx.compose.runtime.collection.IdentityArrayMap<androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object>> invalidationsRequested) {
        if (this.changes.isEmpty()) {
            if (!invalidationsRequested.isNotEmpty() && !(!this.invalidations.isEmpty()) && !this.forciblyRecompose) {
                return false;
            }
            doCompose(invalidationsRequested, null);
            return this.changes.isNotEmpty();
        }
        androidx.compose.runtime.ComposerKt.composeRuntimeError("Expected applyChanges() to have been called".toString());
        throw new kotlin.KotlinNothingValueException();
    }

    private final void doCompose(androidx.compose.runtime.collection.IdentityArrayMap<androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object>> invalidationsRequested, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content) {
        java.util.Comparator comparator;
        if (!this.isComposing) {
            java.lang.Object beginSection = androidx.compose.runtime.Trace.INSTANCE.beginSection("Compose:recompose");
            try {
                this.compositionToken = androidx.compose.runtime.snapshots.SnapshotKt.currentSnapshot().getId();
                this.providerUpdates = null;
                int size = invalidationsRequested.getSize();
                for (int i = 0; i < size; i++) {
                    java.lang.Object obj = invalidationsRequested.getKeys()[i];
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                    androidx.compose.runtime.collection.IdentityArraySet identityArraySet = (androidx.compose.runtime.collection.IdentityArraySet) invalidationsRequested.getValues()[i];
                    androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl = (androidx.compose.runtime.RecomposeScopeImpl) obj;
                    androidx.compose.runtime.Anchor anchor = recomposeScopeImpl.getAnchor();
                    if (anchor == null) {
                        return;
                    }
                    this.invalidations.add(new androidx.compose.runtime.Invalidation(recomposeScopeImpl, anchor.getLocation(), identityArraySet));
                }
                java.util.List<androidx.compose.runtime.Invalidation> list = this.invalidations;
                comparator = androidx.compose.runtime.ComposerKt.InvalidationLocationAscending;
                kotlin.collections.CollectionsKt.sortWith(list, comparator);
                this.nodeIndex = 0;
                this.isComposing = true;
                try {
                    startRoot();
                    java.lang.Object nextSlot = nextSlot();
                    if (nextSlot != content && content != null) {
                        updateValue(content);
                    }
                    androidx.compose.runtime.ComposerImpl$derivedStateObserver$1 composerImpl$derivedStateObserver$1 = this.derivedStateObserver;
                    androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.DerivedStateObserver> derivedStateObservers = androidx.compose.runtime.SnapshotStateKt.derivedStateObservers();
                    try {
                        derivedStateObservers.add(composerImpl$derivedStateObserver$1);
                        if (content != null) {
                            startGroup(200, androidx.compose.runtime.ComposerKt.getInvocation());
                            androidx.compose.runtime.ActualJvm_jvmKt.invokeComposable(this, content);
                            endGroup();
                        } else if ((this.forciblyRecompose || this.providersInvalid) && nextSlot != null && !kotlin.jvm.internal.Intrinsics.areEqual(nextSlot, androidx.compose.runtime.Composer.INSTANCE.getEmpty())) {
                            startGroup(200, androidx.compose.runtime.ComposerKt.getInvocation());
                            androidx.compose.runtime.ActualJvm_jvmKt.invokeComposable(this, (kotlin.jvm.functions.Function2) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(nextSlot, 2));
                            endGroup();
                        } else {
                            skipCurrentGroup();
                        }
                        derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                        endRoot();
                        this.isComposing = false;
                        this.invalidations.clear();
                        createFreshInsertTable();
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        return;
                    } catch (java.lang.Throwable th) {
                        derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    this.isComposing = false;
                    this.invalidations.clear();
                    abortRoot();
                    createFreshInsertTable();
                    throw th2;
                }
            } finally {
                androidx.compose.runtime.Trace.INSTANCE.endSection(beginSection);
            }
        }
        androidx.compose.runtime.ComposerKt.composeRuntimeError("Reentrant composition is not supported".toString());
        throw new kotlin.KotlinNothingValueException();
    }

    public final boolean getHasInvalidations() {
        return !this.invalidations.isEmpty();
    }

    private final java.lang.Object getNode(androidx.compose.runtime.SlotReader slotReader) {
        return slotReader.node(slotReader.getParent());
    }

    private final java.lang.Object nodeAt(androidx.compose.runtime.SlotReader slotReader, int i) {
        return slotReader.node(i);
    }

    private final void validateNodeExpected() {
        if (this.nodeExpected) {
            this.nodeExpected = false;
        } else {
            androidx.compose.runtime.ComposerKt.composeRuntimeError("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
            throw new kotlin.KotlinNothingValueException();
        }
    }

    private final void validateNodeNotExpected() {
        if (!this.nodeExpected) {
            return;
        }
        androidx.compose.runtime.ComposerKt.composeRuntimeError("A call to createNode(), emitNode() or useNode() expected".toString());
        throw new kotlin.KotlinNothingValueException();
    }

    private final void recordInsert(androidx.compose.runtime.Anchor anchor) {
        if (this.insertFixups.isEmpty()) {
            this.changeListWriter.insertSlots(anchor, this.insertTable);
        } else {
            this.changeListWriter.insertSlots(anchor, this.insertTable, this.insertFixups);
            this.insertFixups = new androidx.compose.runtime.changelist.FixupList();
        }
    }

    private final void recordDelete() {
        reportFreeMovableContent(this.reader.getCurrentGroup());
        this.changeListWriter.removeCurrentGroup();
    }

    private static final int reportFreeMovableContent$reportGroup(androidx.compose.runtime.ComposerImpl composerImpl, int i, boolean z, int i2) {
        java.util.List filterToRange;
        androidx.compose.runtime.SlotReader slotReader = composerImpl.reader;
        if (slotReader.hasMark(i)) {
            int groupKey = slotReader.groupKey(i);
            java.lang.Object groupObjectKey = slotReader.groupObjectKey(i);
            if (groupKey == 126665345 && (groupObjectKey instanceof androidx.compose.runtime.MovableContent)) {
                androidx.compose.runtime.MovableContent movableContent = (androidx.compose.runtime.MovableContent) groupObjectKey;
                java.lang.Object groupGet = slotReader.groupGet(i, 0);
                androidx.compose.runtime.Anchor anchor = slotReader.anchor(i);
                filterToRange = androidx.compose.runtime.ComposerKt.filterToRange(composerImpl.invalidations, i, slotReader.groupSize(i) + i);
                java.util.ArrayList arrayList = new java.util.ArrayList(filterToRange.size());
                int size = filterToRange.size();
                for (int i3 = 0; i3 < size; i3++) {
                    androidx.compose.runtime.Invalidation invalidation = (androidx.compose.runtime.Invalidation) filterToRange.get(i3);
                    arrayList.add(kotlin.TuplesKt.to(invalidation.getScope(), invalidation.getInstances()));
                }
                androidx.compose.runtime.MovableContentStateReference movableContentStateReference = new androidx.compose.runtime.MovableContentStateReference(movableContent, groupGet, composerImpl.getComposition(), composerImpl.slotTable, anchor, arrayList, composerImpl.currentCompositionLocalScope(i));
                composerImpl.parentContext.deletedMovableContent$runtime_release(movableContentStateReference);
                composerImpl.changeListWriter.recordSlotEditing();
                composerImpl.changeListWriter.releaseMovableGroupAtCurrent(composerImpl.getComposition(), composerImpl.parentContext, movableContentStateReference);
                if (z) {
                    composerImpl.changeListWriter.endNodeMovementAndDeleteNode(i2, i);
                    return 0;
                }
                return slotReader.nodeCount(i);
            }
            if (groupKey == 206 && kotlin.jvm.internal.Intrinsics.areEqual(groupObjectKey, androidx.compose.runtime.ComposerKt.getReference())) {
                java.lang.Object groupGet2 = slotReader.groupGet(i, 0);
                androidx.compose.runtime.ComposerImpl.CompositionContextHolder compositionContextHolder = groupGet2 instanceof androidx.compose.runtime.ComposerImpl.CompositionContextHolder ? (androidx.compose.runtime.ComposerImpl.CompositionContextHolder) groupGet2 : null;
                if (compositionContextHolder != null) {
                    for (androidx.compose.runtime.ComposerImpl composerImpl2 : compositionContextHolder.getRef().getComposers()) {
                        composerImpl2.reportAllMovableContent();
                        composerImpl.parentContext.reportRemovedComposition$runtime_release(composerImpl2.getComposition());
                    }
                }
                return slotReader.nodeCount(i);
            }
            if (slotReader.isNode(i)) {
                return 1;
            }
            return slotReader.nodeCount(i);
        }
        if (slotReader.containsMark(i)) {
            int groupSize = slotReader.groupSize(i) + i;
            int i4 = 0;
            for (int i5 = i + 1; i5 < groupSize; i5 += slotReader.groupSize(i5)) {
                boolean isNode = slotReader.isNode(i5);
                if (isNode) {
                    composerImpl.changeListWriter.endNodeMovement();
                    composerImpl.changeListWriter.moveDown(slotReader.node(i5));
                }
                i4 += reportFreeMovableContent$reportGroup(composerImpl, i5, isNode || z, isNode ? 0 : i2 + i4);
                if (isNode) {
                    composerImpl.changeListWriter.endNodeMovement();
                    composerImpl.changeListWriter.moveUp();
                }
            }
            if (slotReader.isNode(i)) {
                return 1;
            }
            return i4;
        }
        if (slotReader.isNode(i)) {
            return 1;
        }
        return slotReader.nodeCount(i);
    }

    private final void reportFreeMovableContent(int groupBeingRemoved) {
        reportFreeMovableContent$reportGroup(this, groupBeingRemoved, false, 0);
        this.changeListWriter.endNodeMovement();
    }

    private final void reportAllMovableContent() {
        if (this.slotTable.containsMark()) {
            androidx.compose.runtime.changelist.ChangeList changeList = new androidx.compose.runtime.changelist.ChangeList();
            this.deferredChanges = changeList;
            androidx.compose.runtime.SlotReader openReader = this.slotTable.openReader();
            try {
                this.reader = openReader;
                androidx.compose.runtime.changelist.ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
                androidx.compose.runtime.changelist.ChangeList changeList2 = composerChangeListWriter.getChangeList();
                try {
                    composerChangeListWriter.setChangeList(changeList);
                    reportFreeMovableContent(0);
                    this.changeListWriter.releaseMovableContent();
                    composerChangeListWriter.setChangeList(changeList2);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                } catch (java.lang.Throwable th) {
                    composerChangeListWriter.setChangeList(changeList2);
                    throw th;
                }
            } finally {
                openReader.close();
            }
        }
    }

    private final void finalizeCompose() {
        this.changeListWriter.finalizeComposition();
        if (this.pendingStack.isEmpty()) {
            cleanUpCompose();
        } else {
            androidx.compose.runtime.ComposerKt.composeRuntimeError("Start/end imbalance".toString());
            throw new kotlin.KotlinNothingValueException();
        }
    }

    private final void cleanUpCompose() {
        this.pending = null;
        this.nodeIndex = 0;
        this.groupNodeCount = 0;
        this.compoundKeyHash = 0;
        this.nodeExpected = false;
        this.changeListWriter.resetTransientState();
        this.invalidateStack.clear();
        clearUpdatedNodeCounts();
    }

    public final void verifyConsistent$runtime_release() {
        this.insertTable.verifyWellFormed();
    }

    /* compiled from: Composer.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016R\u0015\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextHolder;", "Landroidx/compose/runtime/ReusableRememberObserver;", "ref", "Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/ComposerImpl;", "(Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;)V", "getRef", "()Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "onAbandoned", "", "onForgotten", "onRemembered", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class CompositionContextHolder implements androidx.compose.runtime.ReusableRememberObserver {
        private final androidx.compose.runtime.ComposerImpl.CompositionContextImpl ref;

        @Override // androidx.compose.runtime.RememberObserver
        public void onRemembered() {
        }

        public CompositionContextHolder(androidx.compose.runtime.ComposerImpl.CompositionContextImpl compositionContextImpl) {
            this.ref = compositionContextImpl;
        }

        public final androidx.compose.runtime.ComposerImpl.CompositionContextImpl getRef() {
            return this.ref;
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onAbandoned() {
            this.ref.dispose();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onForgotten() {
            this.ref.dispose();
        }
    }

    /* compiled from: Composer.kt */
    @kotlin.Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0082\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ*\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0011\u00100\u001a\r\u0012\u0004\u0012\u00020-01¢\u0006\u0002\b2H\u0010¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020-2\u0006\u00106\u001a\u000207H\u0010¢\u0006\u0002\b8J\u0006\u00109\u001a\u00020-J\r\u0010:\u001a\u00020-H\u0010¢\u0006\u0002\b;J\r\u0010\u0015\u001a\u00020\u0013H\u0010¢\u0006\u0002\b<J\u0015\u0010=\u001a\u00020-2\u0006\u00106\u001a\u000207H\u0010¢\u0006\u0002\b>J\u0015\u0010?\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0010¢\u0006\u0002\b@J\u0015\u0010A\u001a\u00020-2\u0006\u0010B\u001a\u00020CH\u0010¢\u0006\u0002\bDJ\u001d\u0010E\u001a\u00020-2\u0006\u00106\u001a\u0002072\u0006\u0010F\u001a\u00020GH\u0010¢\u0006\u0002\bHJ\u0017\u0010I\u001a\u0004\u0018\u00010G2\u0006\u00106\u001a\u000207H\u0010¢\u0006\u0002\bJJ\u001b\u0010K\u001a\u00020-2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\"0\u000eH\u0010¢\u0006\u0002\bMJ\u0015\u0010N\u001a\u00020-2\u0006\u0010O\u001a\u00020PH\u0010¢\u0006\u0002\bQJ\u0015\u0010R\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0010¢\u0006\u0002\bSJ\u0015\u0010T\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0010¢\u0006\u0002\bUJ\r\u0010V\u001a\u00020-H\u0010¢\u0006\u0002\bWJ\u0015\u0010X\u001a\u00020-2\u0006\u0010O\u001a\u00020PH\u0010¢\u0006\u0002\bYJ\u0015\u0010Z\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0010¢\u0006\u0002\b[J\u000e\u0010\\\u001a\u00020-2\u0006\u0010B\u001a\u00020\u0013R\u0014\u0010\u0004\u001a\u00020\u0005X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0005X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0002\u001a\u00020\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R(\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u000e\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0011\"\u0004\b$\u0010%R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020\u001e8PX\u0090\u0004¢\u0006\f\u0012\u0004\b)\u0010*\u001a\u0004\b+\u0010 ¨\u0006]"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/CompositionContext;", "compoundHashKey", "", "collectingParameterInformation", "", "collectingSourceInformation", "observerHolder", "Landroidx/compose/runtime/CompositionObserverHolder;", "(Landroidx/compose/runtime/ComposerImpl;IZZLandroidx/compose/runtime/CompositionObserverHolder;)V", "getCollectingParameterInformation$runtime_release", "()Z", "getCollectingSourceInformation$runtime_release", "composers", "", "Landroidx/compose/runtime/ComposerImpl;", "getComposers", "()Ljava/util/Set;", "<set-?>", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "compositionLocalScope", "getCompositionLocalScope", "()Landroidx/compose/runtime/PersistentCompositionLocalMap;", "setCompositionLocalScope", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;)V", "compositionLocalScope$delegate", "Landroidx/compose/runtime/MutableState;", "getCompoundHashKey$runtime_release", "()I", "effectCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getEffectCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "inspectionTables", "Landroidx/compose/runtime/tooling/CompositionData;", "getInspectionTables", "setInspectionTables", "(Ljava/util/Set;)V", "getObserverHolder$runtime_release", "()Landroidx/compose/runtime/CompositionObserverHolder;", "recomposeCoroutineContext", "getRecomposeCoroutineContext$runtime_release$annotations", "()V", "getRecomposeCoroutineContext$runtime_release", "composeInitial", "", "composition", "Landroidx/compose/runtime/ControlledComposition;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "composeInitial$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "deletedMovableContent", "reference", "Landroidx/compose/runtime/MovableContentStateReference;", "deletedMovableContent$runtime_release", "dispose", "doneComposing", "doneComposing$runtime_release", "getCompositionLocalScope$runtime_release", "insertMovableContent", "insertMovableContent$runtime_release", "invalidate", "invalidate$runtime_release", "invalidateScope", "scope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "invalidateScope$runtime_release", "movableContentStateReleased", "data", "Landroidx/compose/runtime/MovableContentState;", "movableContentStateReleased$runtime_release", "movableContentStateResolve", "movableContentStateResolve$runtime_release", "recordInspectionTable", com.ironsource.B5.R, "recordInspectionTable$runtime_release", "registerComposer", "composer", "Landroidx/compose/runtime/Composer;", "registerComposer$runtime_release", "registerComposition", "registerComposition$runtime_release", "reportRemovedComposition", "reportRemovedComposition$runtime_release", "startComposing", "startComposing$runtime_release", "unregisterComposer", "unregisterComposer$runtime_release", "unregisterComposition", "unregisterComposition$runtime_release", "updateCompositionLocalScope", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class CompositionContextImpl extends androidx.compose.runtime.CompositionContext {
        private final boolean collectingParameterInformation;
        private final boolean collectingSourceInformation;
        private final java.util.Set<androidx.compose.runtime.ComposerImpl> composers = new java.util.LinkedHashSet();

        /* renamed from: compositionLocalScope$delegate, reason: from kotlin metadata */
        private final androidx.compose.runtime.MutableState compositionLocalScope = androidx.compose.runtime.SnapshotStateKt.mutableStateOf(androidx.compose.runtime.internal.PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf(), androidx.compose.runtime.SnapshotStateKt.referentialEqualityPolicy());
        private final int compoundHashKey;
        private java.util.Set<java.util.Set<androidx.compose.runtime.tooling.CompositionData>> inspectionTables;
        private final androidx.compose.runtime.CompositionObserverHolder observerHolder;

        public static /* synthetic */ void getRecomposeCoroutineContext$runtime_release$annotations() {
        }

        public CompositionContextImpl(int i, boolean z, boolean z2, androidx.compose.runtime.CompositionObserverHolder compositionObserverHolder) {
            this.compoundHashKey = i;
            this.collectingParameterInformation = z;
            this.collectingSourceInformation = z2;
            this.observerHolder = compositionObserverHolder;
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* renamed from: getCompoundHashKey$runtime_release, reason: from getter */
        public int getCompoundHashKey() {
            return this.compoundHashKey;
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* renamed from: getCollectingParameterInformation$runtime_release, reason: from getter */
        public boolean getCollectingParameterInformation() {
            return this.collectingParameterInformation;
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* renamed from: getCollectingSourceInformation$runtime_release, reason: from getter */
        public boolean getCollectingSourceInformation() {
            return this.collectingSourceInformation;
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* renamed from: getObserverHolder$runtime_release, reason: from getter */
        public androidx.compose.runtime.CompositionObserverHolder getObserverHolder() {
            return this.observerHolder;
        }

        public final java.util.Set<java.util.Set<androidx.compose.runtime.tooling.CompositionData>> getInspectionTables() {
            return this.inspectionTables;
        }

        public final void setInspectionTables(java.util.Set<java.util.Set<androidx.compose.runtime.tooling.CompositionData>> set) {
            this.inspectionTables = set;
        }

        public final java.util.Set<androidx.compose.runtime.ComposerImpl> getComposers() {
            return this.composers;
        }

        public final void dispose() {
            if (!this.composers.isEmpty()) {
                java.util.Set<java.util.Set<androidx.compose.runtime.tooling.CompositionData>> set = this.inspectionTables;
                if (set != null) {
                    for (androidx.compose.runtime.ComposerImpl composerImpl : this.composers) {
                        java.util.Iterator<java.util.Set<androidx.compose.runtime.tooling.CompositionData>> it = set.iterator();
                        while (it.hasNext()) {
                            it.next().remove(composerImpl.slotTable);
                        }
                    }
                }
                this.composers.clear();
            }
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposer$runtime_release(androidx.compose.runtime.Composer composer) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(composer, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
            super.registerComposer$runtime_release((androidx.compose.runtime.ComposerImpl) composer);
            this.composers.add(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposer$runtime_release(androidx.compose.runtime.Composer composer) {
            java.util.Set<java.util.Set<androidx.compose.runtime.tooling.CompositionData>> set = this.inspectionTables;
            if (set != null) {
                java.util.Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    java.util.Set set2 = (java.util.Set) it.next();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(composer, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                    set2.remove(((androidx.compose.runtime.ComposerImpl) composer).slotTable);
                }
            }
            kotlin.jvm.internal.TypeIntrinsics.asMutableCollection(this.composers).remove(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposition$runtime_release(androidx.compose.runtime.ControlledComposition composition) {
            androidx.compose.runtime.ComposerImpl.this.parentContext.registerComposition$runtime_release(composition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposition$runtime_release(androidx.compose.runtime.ControlledComposition composition) {
            androidx.compose.runtime.ComposerImpl.this.parentContext.unregisterComposition$runtime_release(composition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public kotlin.coroutines.CoroutineContext getEffectCoroutineContext() {
            return androidx.compose.runtime.ComposerImpl.this.parentContext.getEffectCoroutineContext();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public kotlin.coroutines.CoroutineContext getRecomposeCoroutineContext$runtime_release() {
            return androidx.compose.runtime.CompositionKt.getRecomposeCoroutineContext(androidx.compose.runtime.ComposerImpl.this.getComposition());
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void composeInitial$runtime_release(androidx.compose.runtime.ControlledComposition composition, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content) {
            androidx.compose.runtime.ComposerImpl.this.parentContext.composeInitial$runtime_release(composition, content);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidate$runtime_release(androidx.compose.runtime.ControlledComposition composition) {
            androidx.compose.runtime.ComposerImpl.this.parentContext.invalidate$runtime_release(androidx.compose.runtime.ComposerImpl.this.getComposition());
            androidx.compose.runtime.ComposerImpl.this.parentContext.invalidate$runtime_release(composition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidateScope$runtime_release(androidx.compose.runtime.RecomposeScopeImpl scope) {
            androidx.compose.runtime.ComposerImpl.this.parentContext.invalidateScope$runtime_release(scope);
        }

        private final androidx.compose.runtime.PersistentCompositionLocalMap getCompositionLocalScope() {
            return (androidx.compose.runtime.PersistentCompositionLocalMap) this.compositionLocalScope.getValue();
        }

        private final void setCompositionLocalScope(androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap) {
            this.compositionLocalScope.setValue(persistentCompositionLocalMap);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public androidx.compose.runtime.PersistentCompositionLocalMap getCompositionLocalScope$runtime_release() {
            return getCompositionLocalScope();
        }

        public final void updateCompositionLocalScope(androidx.compose.runtime.PersistentCompositionLocalMap scope) {
            setCompositionLocalScope(scope);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void recordInspectionTable$runtime_release(java.util.Set<androidx.compose.runtime.tooling.CompositionData> table) {
            java.util.HashSet hashSet = this.inspectionTables;
            if (hashSet == null) {
                hashSet = new java.util.HashSet();
                this.inspectionTables = hashSet;
            }
            hashSet.add(table);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void startComposing$runtime_release() {
            androidx.compose.runtime.ComposerImpl.this.childrenComposing++;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void doneComposing$runtime_release() {
            androidx.compose.runtime.ComposerImpl composerImpl = androidx.compose.runtime.ComposerImpl.this;
            composerImpl.childrenComposing--;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void insertMovableContent$runtime_release(androidx.compose.runtime.MovableContentStateReference reference) {
            androidx.compose.runtime.ComposerImpl.this.parentContext.insertMovableContent$runtime_release(reference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void deletedMovableContent$runtime_release(androidx.compose.runtime.MovableContentStateReference reference) {
            androidx.compose.runtime.ComposerImpl.this.parentContext.deletedMovableContent$runtime_release(reference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public androidx.compose.runtime.MovableContentState movableContentStateResolve$runtime_release(androidx.compose.runtime.MovableContentStateReference reference) {
            return androidx.compose.runtime.ComposerImpl.this.parentContext.movableContentStateResolve$runtime_release(reference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void movableContentStateReleased$runtime_release(androidx.compose.runtime.MovableContentStateReference reference, androidx.compose.runtime.MovableContentState data) {
            androidx.compose.runtime.ComposerImpl.this.parentContext.movableContentStateReleased$runtime_release(reference, data);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void reportRemovedComposition$runtime_release(androidx.compose.runtime.ControlledComposition composition) {
            androidx.compose.runtime.ComposerImpl.this.parentContext.reportRemovedComposition$runtime_release(composition);
        }
    }

    private final void updateCompoundKeyWhenWeEnterGroup(int groupKey, java.lang.Object dataKey, java.lang.Object data) {
        if (dataKey == null) {
            if (data != null && groupKey == 207 && !kotlin.jvm.internal.Intrinsics.areEqual(data, androidx.compose.runtime.Composer.INSTANCE.getEmpty())) {
                updateCompoundKeyWhenWeEnterGroupKeyHash(data.hashCode());
                return;
            } else {
                updateCompoundKeyWhenWeEnterGroupKeyHash(groupKey);
                return;
            }
        }
        if (dataKey instanceof java.lang.Enum) {
            updateCompoundKeyWhenWeEnterGroupKeyHash(((java.lang.Enum) dataKey).ordinal());
        } else {
            updateCompoundKeyWhenWeEnterGroupKeyHash(dataKey.hashCode());
        }
    }

    private final void updateCompoundKeyWhenWeEnterGroupKeyHash(int keyHash) {
        this.compoundKeyHash = keyHash ^ java.lang.Integer.rotateLeft(getCompoundKeyHash(), 3);
    }

    private final void updateCompoundKeyWhenWeExitGroup(int groupKey, java.lang.Object dataKey, java.lang.Object data) {
        if (dataKey == null) {
            if (data != null && groupKey == 207 && !kotlin.jvm.internal.Intrinsics.areEqual(data, androidx.compose.runtime.Composer.INSTANCE.getEmpty())) {
                updateCompoundKeyWhenWeExitGroupKeyHash(data.hashCode());
                return;
            } else {
                updateCompoundKeyWhenWeExitGroupKeyHash(groupKey);
                return;
            }
        }
        if (dataKey instanceof java.lang.Enum) {
            updateCompoundKeyWhenWeExitGroupKeyHash(((java.lang.Enum) dataKey).ordinal());
        } else {
            updateCompoundKeyWhenWeExitGroupKeyHash(dataKey.hashCode());
        }
    }

    private final void updateCompoundKeyWhenWeExitGroupKeyHash(int groupKey) {
        this.compoundKeyHash = java.lang.Integer.rotateRight(groupKey ^ getCompoundKeyHash(), 3);
    }

    @Override // androidx.compose.runtime.Composer
    public androidx.compose.runtime.RecomposeScope getRecomposeScope() {
        return getCurrentRecomposeScope$runtime_release();
    }

    @Override // androidx.compose.runtime.Composer
    public java.lang.Object getRecomposeScopeIdentity() {
        androidx.compose.runtime.RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release != null) {
            return currentRecomposeScope$runtime_release.getAnchor();
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public java.lang.Object rememberedValue() {
        return nextSlotForCache();
    }

    @Override // androidx.compose.runtime.Composer
    public void updateRememberedValue(java.lang.Object value) {
        updateCachedValue(value);
    }

    @Override // androidx.compose.runtime.Composer
    public void recordUsed(androidx.compose.runtime.RecomposeScope scope) {
        androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl = scope instanceof androidx.compose.runtime.RecomposeScopeImpl ? (androidx.compose.runtime.RecomposeScopeImpl) scope : null;
        if (recomposeScopeImpl == null) {
            return;
        }
        recomposeScopeImpl.setUsed(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.runtime.PersistentCompositionLocalMap, java.lang.Object] */
    private final androidx.compose.runtime.PersistentCompositionLocalMap updateProviderMapGroup(androidx.compose.runtime.PersistentCompositionLocalMap parentScope, androidx.compose.runtime.PersistentCompositionLocalMap currentProviders) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder<androidx.compose.runtime.CompositionLocal<java.lang.Object>, androidx.compose.runtime.State<? extends java.lang.Object>> builder2 = parentScope.builder2();
        builder2.putAll(currentProviders);
        ?? build2 = builder2.build2();
        startGroup(204, androidx.compose.runtime.ComposerKt.getProviderMaps());
        updateSlot(build2);
        updateSlot(currentProviders);
        endGroup();
        return build2;
    }
}
