package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000§\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\f\n\u0002\u0010\u0005\n\u0002\u0010\n\n\u0002\u0010\u0007\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001;\b\u0001\u0018\u00002\u00020\u0001:\u0004\u0081\u0003\u0082\u0003BQ\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010n\u001a\u00020o2\u0006\u0010p\u001a\u00020\u001eH\u0017J\b\u0010q\u001a\u00020oH\u0017J\u0010\u0010r\u001a\u00020o2\u0006\u0010p\u001a\u00020\u001eH\u0017J\b\u0010s\u001a\u00020oH\u0017J\b\u0010t\u001a\u00020oH\u0017J\b\u0010u\u001a\u00020oH\u0017J\u001a\u0010z\u001a\u00020o2\u0006\u0010p\u001a\u00020\u001e2\b\u0010{\u001a\u0004\u0018\u00010|H\u0017J\b\u0010}\u001a\u00020oH\u0017J\b\u0010~\u001a\u00020oH\u0002J\b\u0010\u007f\u001a\u00020oH\u0002J\t\u0010\u0080\u0001\u001a\u00020oH\u0002J\u000f\u0010\u0081\u0001\u001a\u00020oH\u0000¢\u0006\u0003\b\u0082\u0001J\t\u0010\u0090\u0001\u001a\u00020oH\u0016J\u001a\u0010\u0091\u0001\u001a\u00030\u0092\u00012\u000e\u0010\u0093\u0001\u001a\t\u0012\u0004\u0012\u00020o0\u0094\u0001H\u0016J\u000f\u0010\u0095\u0001\u001a\u00020oH\u0000¢\u0006\u0003\b\u0096\u0001J\u000f\u0010\u0097\u0001\u001a\u00020oH\u0000¢\u0006\u0003\b\u0098\u0001J\u000e\u0010'\u001a\u00020(H\u0000¢\u0006\u0003\b\u0099\u0001J\u0011\u0010\u009a\u0001\u001a\u00020o2\u0006\u0010p\u001a\u00020\u001eH\u0002J\u001b\u0010\u009a\u0001\u001a\u00020o2\u0006\u0010p\u001a\u00020\u001e2\b\u0010{\u001a\u0004\u0018\u00010|H\u0002J\t\u0010\u009b\u0001\u001a\u00020oH\u0002J\t\u0010\u009c\u0001\u001a\u00020oH\u0002J\t\u0010\u009d\u0001\u001a\u00020oH\u0016J\t\u0010\u009e\u0001\u001a\u00020oH\u0016J!\u0010\u009f\u0001\u001a\u00020o\"\u0005\b\u0000\u0010 \u00012\u000f\u0010¡\u0001\u001a\n\u0012\u0005\u0012\u0003H \u00010\u0094\u0001H\u0016J\t\u0010¢\u0001\u001a\u00020oH\u0016J\t\u0010£\u0001\u001a\u00020oH\u0016J\u001b\u0010¤\u0001\u001a\u00020o2\u0006\u0010p\u001a\u00020\u001e2\b\u0010{\u001a\u0004\u0018\u00010|H\u0016J\t\u0010¥\u0001\u001a\u00020oH\u0016J\t\u0010¦\u0001\u001a\u00020oH\u0016J\t\u0010§\u0001\u001a\u00020oH\u0016J\u0007\u0010¨\u0001\u001a\u00020oJ\u0007\u0010©\u0001\u001a\u00020oJ\u0012\u0010\u00ad\u0001\u001a\u00020o2\u0007\u0010®\u0001\u001a\u00020\u001eH\u0016JJ\u0010¯\u0001\u001a\u00020o\"\u0005\b\u0000\u0010°\u0001\"\u0005\b\u0001\u0010 \u00012\u0007\u0010?\u001a\u0003H°\u00012\"\u0010±\u0001\u001a\u001d\u0012\u0005\u0012\u0003H \u0001\u0012\u0005\u0012\u0003H°\u0001\u0012\u0004\u0012\u00020o0²\u0001¢\u0006\u0003\b³\u0001H\u0016¢\u0006\u0003\u0010´\u0001J\u001f\u0010µ\u0001\u001a\u00020|2\t\u0010¶\u0001\u001a\u0004\u0018\u00010|2\t\u0010·\u0001\u001a\u0004\u0018\u00010|H\u0017J\u000b\u0010¸\u0001\u001a\u0004\u0018\u00010|H\u0001J\u000b\u0010¹\u0001\u001a\u0004\u0018\u00010|H\u0001J\u0013\u0010º\u0001\u001a\u00020(2\b\u0010?\u001a\u0004\u0018\u00010|H\u0017J\u0013\u0010»\u0001\u001a\u00020(2\b\u0010?\u001a\u0004\u0018\u00010|H\u0017J\u0012\u0010º\u0001\u001a\u00020(2\u0007\u0010?\u001a\u00030¼\u0001H\u0017J\u0012\u0010º\u0001\u001a\u00020(2\u0007\u0010?\u001a\u00030½\u0001H\u0017J\u0012\u0010º\u0001\u001a\u00020(2\u0007\u0010?\u001a\u00030¾\u0001H\u0017J\u0011\u0010º\u0001\u001a\u00020(2\u0006\u0010?\u001a\u00020(H\u0017J\u0012\u0010º\u0001\u001a\u00020(2\u0007\u0010?\u001a\u00030¿\u0001H\u0017J\u0012\u0010º\u0001\u001a\u00020(2\u0007\u0010?\u001a\u00030\u0089\u0001H\u0017J\u0012\u0010º\u0001\u001a\u00020(2\u0007\u0010?\u001a\u00030À\u0001H\u0017J\u0011\u0010º\u0001\u001a\u00020(2\u0006\u0010?\u001a\u00020\u001eH\u0017J2\u0010Á\u0001\u001a\u0003H \u0001\"\u0005\b\u0000\u0010 \u00012\u0007\u0010Â\u0001\u001a\u00020(2\u000f\u0010±\u0001\u001a\n\u0012\u0005\u0012\u0003H \u00010\u0094\u0001H\u0087\b¢\u0006\u0003\u0010Ã\u0001J\u0013\u0010Ä\u0001\u001a\u00020o2\b\u0010?\u001a\u0004\u0018\u00010|H\u0002J\u0013\u0010Å\u0001\u001a\u00020o2\b\u0010?\u001a\u0004\u0018\u00010|H\u0001J\u0013\u0010Æ\u0001\u001a\u00020o2\b\u0010?\u001a\u0004\u0018\u00010|H\u0001J\t\u0010Ç\u0001\u001a\u00020\u001eH\u0002J\u0019\u0010Í\u0001\u001a\u00020o2\u000e\u0010Î\u0001\u001a\t\u0012\u0004\u0012\u00020o0\u0094\u0001H\u0016J\t\u0010Ï\u0001\u001a\u000200H\u0002J\u0012\u0010Ï\u0001\u001a\u0002002\u0007\u0010Ô\u0001\u001a\u00020\u001eH\u0002J\u001b\u0010Õ\u0001\u001a\u0002002\u0007\u0010Ö\u0001\u001a\u0002002\u0007\u0010×\u0001\u001a\u000200H\u0002J\u0016\u0010Ø\u0001\u001a\u00020o2\u000b\u0010?\u001a\u0007\u0012\u0002\b\u00030Ù\u0001H\u0017J\u0012\u0010Ú\u0001\u001a\u00020o2\u0007\u0010Û\u0001\u001a\u000200H\u0002J\t\u0010Ü\u0001\u001a\u00020oH\u0017J&\u0010Ý\u0001\u001a\u00020o2\u0015\u0010Þ\u0001\u001a\u0010\u0012\u000b\b\u0001\u0012\u0007\u0012\u0002\b\u00030Ù\u00010ß\u0001H\u0017¢\u0006\u0003\u0010à\u0001J\t\u0010á\u0001\u001a\u00020oH\u0017J'\u0010â\u0001\u001a\u0003H \u0001\"\u0005\b\u0000\u0010 \u00012\u000e\u0010p\u001a\n\u0012\u0005\u0012\u0003H \u00010ã\u0001H\u0017¢\u0006\u0003\u0010ä\u0001J\t\u0010å\u0001\u001a\u00020\u0005H\u0016J\t\u0010ë\u0001\u001a\u00020oH\u0002J\t\u0010ì\u0001\u001a\u00020oH\u0002J\t\u0010í\u0001\u001a\u00020oH\u0002J\u001d\u0010î\u0001\u001a\u00020o2\u0007\u0010ï\u0001\u001a\u00020(2\t\u0010ð\u0001\u001a\u0004\u0018\u00010|H\u0002J:\u0010ñ\u0001\u001a\u00020o2\u0006\u0010p\u001a\u00020\u001e2\t\u0010ò\u0001\u001a\u0004\u0018\u00010|2\b\u0010ó\u0001\u001a\u00030ô\u00012\t\u0010ð\u0001\u001a\u0004\u0018\u00010|H\u0002¢\u0006\u0006\bõ\u0001\u0010ö\u0001J\u001d\u0010÷\u0001\u001a\u00020o2\u0007\u0010ï\u0001\u001a\u00020(2\t\u0010ø\u0001\u001a\u0004\u0018\u00010\u001aH\u0002J\u001b\u0010ù\u0001\u001a\u00020o2\u0007\u0010ú\u0001\u001a\u00020\u001e2\u0007\u0010\u0083\u0001\u001a\u00020(H\u0002J\u0012\u0010û\u0001\u001a\u00020o2\u0007\u0010ï\u0001\u001a\u00020(H\u0002J\t\u0010ü\u0001\u001a\u00020oH\u0002J\u0012\u0010ý\u0001\u001a\u00020\u001e2\u0007\u0010þ\u0001\u001a\u00020\u001eH\u0002J\u001b\u0010ÿ\u0001\u001a\u00020o2\u0007\u0010Ô\u0001\u001a\u00020\u001e2\u0007\u0010\u0080\u0002\u001a\u00020\u001eH\u0002J-\u0010\u0081\u0002\u001a\u00020\u001e2\u0007\u0010\u0082\u0002\u001a\u00020\u001e2\u0007\u0010Ô\u0001\u001a\u00020\u001e2\u0007\u0010\u0083\u0002\u001a\u00020\u001e2\u0007\u0010\u0084\u0002\u001a\u00020\u001eH\u0002J\u0012\u0010\u0085\u0002\u001a\u00020\u001e2\u0007\u0010Ô\u0001\u001a\u00020\u001eH\u0002J\u0012\u0010\u0086\u0002\u001a\u00020\u001e2\u0007\u0010Ô\u0001\u001a\u00020\u001eH\u0002J\u001b\u0010\u0087\u0002\u001a\u00020o2\u0007\u0010Ô\u0001\u001a\u00020\u001e2\u0007\u0010\u0088\u0002\u001a\u00020\u001eH\u0002J\t\u0010\u0089\u0002\u001a\u00020oH\u0002J$\u0010\u008a\u0002\u001a\u00020o2\u0007\u0010\u008b\u0002\u001a\u00020\u001e2\u0007\u0010\u008c\u0002\u001a\u00020\u001e2\u0007\u0010\u008d\u0002\u001a\u00020\u001eH\u0002J\u001b\u0010\u008e\u0002\u001a\u00020o2\u0007\u0010Ô\u0001\u001a\u00020\u001e2\u0007\u0010\u008f\u0002\u001a\u00020\u001eH\u0002J6\u0010\u0090\u0002\u001a\b0\u0089\u0001j\u0003`\u008a\u00012\u0007\u0010Ô\u0001\u001a\u00020\u001e2\u0007\u0010\u0083\u0002\u001a\u00020\u001e2\r\u0010\u0091\u0002\u001a\b0\u0089\u0001j\u0003`\u008a\u0001H\u0002¢\u0006\u0003\u0010\u0092\u0002J\u0016\u0010\u0093\u0002\u001a\u00020\u001e*\u00020J2\u0007\u0010Ô\u0001\u001a\u00020\u001eH\u0002J#\u0010\u0094\u0002\u001a\u00020(2\u0007\u0010\u0095\u0002\u001a\u00020>2\t\u0010\u0096\u0002\u001a\u0004\u0018\u00010|H\u0000¢\u0006\u0003\b\u0097\u0002J\u000f\u0010\u0098\u0002\u001a\u00020\u001eH\u0001¢\u0006\u0003\b\u0099\u0002J\t\u0010\u009a\u0002\u001a\u00020oH\u0017J\t\u0010\u009b\u0002\u001a\u00020oH\u0002J\u001b\u0010\u009c\u0002\u001a\u00020(2\u0007\u0010\u009d\u0002\u001a\u00020(2\u0007\u0010\u009e\u0002\u001a\u00020\u001eH\u0017J\t\u0010\u009f\u0002\u001a\u00020oH\u0017J\u0012\u0010 \u0002\u001a\u00020o2\u0007\u0010º\u0001\u001a\u00020(H\u0017J\u0011\u0010¡\u0002\u001a\u00020\u00012\u0006\u0010p\u001a\u00020\u001eH\u0017J\t\u0010¢\u0002\u001a\u00020oH\u0002J\u0012\u0010£\u0002\u001a\u00020o2\u0007\u0010\u0095\u0002\u001a\u00020>H\u0002J\f\u0010¤\u0002\u001a\u0005\u0018\u00010¥\u0002H\u0017J\"\u0010¦\u0002\u001a\u0012\u0012\u0005\u0012\u00030¨\u0002\u0012\u0004\u0012\u00020o\u0018\u00010§\u00022\u0007\u0010\u0095\u0002\u001a\u00020>H\u0002J!\u0010©\u0002\u001a\u00020o2\u000b\u0010?\u001a\u0007\u0012\u0002\b\u00030ª\u00022\t\u0010«\u0002\u001a\u0004\u0018\u00010|H\u0017J8\u0010¬\u0002\u001a\u00020o2\u0010\u0010\u00ad\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010|0ª\u00022\u0007\u0010®\u0002\u001a\u0002002\t\u0010«\u0002\u001a\u0004\u0018\u00010|2\u0007\u0010¯\u0002\u001a\u00020(H\u0002J*\u0010°\u0002\u001a\u00020o2\u001f\u0010±\u0002\u001a\u001a\u0012\u0015\u0012\u0013\u0012\u0005\u0012\u00030´\u0002\u0012\u0007\u0012\u0005\u0018\u00010´\u00020³\u00020²\u0002H\u0017J*\u0010µ\u0002\u001a\u00020o2\u001f\u0010±\u0002\u001a\u001a\u0012\u0015\u0012\u0013\u0012\u0005\u0012\u00030´\u0002\u0012\u0007\u0012\u0005\u0018\u00010´\u00020³\u00020²\u0002H\u0002J1\u0010¶\u0002\u001a\u0003H·\u0002\"\u0005\b\u0000\u0010·\u00022\u0006\u0010I\u001a\u00020J2\u000f\u0010±\u0001\u001a\n\u0012\u0005\u0012\u0003H·\u00020\u0094\u0001H\u0082\b¢\u0006\u0003\u0010¸\u0002Jq\u0010¹\u0002\u001a\u0003H·\u0002\"\u0005\b\u0000\u0010·\u00022\f\b\u0002\u0010º\u0002\u001a\u0005\u0018\u00010»\u00022\f\b\u0002\u0010¼\u0002\u001a\u0005\u0018\u00010»\u00022\u000b\b\u0002\u0010þ\u0001\u001a\u0004\u0018\u00010\u001e2\u001e\b\u0002\u0010+\u001a\u0018\u0012\u0013\u0012\u0011\u0012\u0004\u0012\u00020>\u0012\u0006\u0012\u0004\u0018\u00010|0³\u00020²\u00022\u000f\u0010±\u0001\u001a\n\u0012\u0005\u0012\u0003H·\u00020\u0094\u0001H\u0002¢\u0006\u0003\u0010½\u0002J\u0013\u0010¾\u0002\u001a\u00020o2\b\u0010¾\u0002\u001a\u00030¿\u0002H\u0017J\u001b\u0010À\u0002\u001a\u00020o2\u0006\u0010p\u001a\u00020\u001e2\b\u0010¾\u0002\u001a\u00030¿\u0002H\u0017J\t\u0010Á\u0002\u001a\u00020oH\u0017J\t\u0010Â\u0002\u001a\u00020oH\u0016J\u001a\u0010Ã\u0002\u001a\u00030Ä\u00022\b\u0010?\u001a\u0004\u0018\u00010|H\u0000¢\u0006\u0003\bÅ\u0002J\f\u0010Æ\u0002\u001a\u0005\u0018\u00010Ä\u0002H\u0002J+\u0010Ç\u0002\u001a\n\u0012\u0005\u0012\u00030È\u00020²\u00022\u0007\u0010Ô\u0001\u001a\u00020\u001e2\t\u0010É\u0002\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0003\u0010Ê\u0002J\u000f\u0010Ë\u0002\u001a\n\u0012\u0005\u0012\u00030È\u00020²\u0002JI\u0010Ì\u0002\u001a\u00020o2\u0014\u0010Í\u0002\u001a\u000f\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020|0Î\u00022\u0014\u0010\u00ad\u0002\u001a\u000f\u0012\u0004\u0012\u00020o0\u0094\u0001¢\u0006\u0003\bÏ\u00022\t\u0010Ð\u0002\u001a\u0004\u0018\u00010eH\u0000¢\u0006\u0006\bÑ\u0002\u0010Ò\u0002J\u001f\u0010Ó\u0002\u001a\u00020o2\u000e\u0010±\u0001\u001a\t\u0012\u0004\u0012\u00020o0\u0094\u0001H\u0000¢\u0006\u0003\bÔ\u0002J3\u0010Õ\u0002\u001a\u00020(2\u0014\u0010Í\u0002\u001a\u000f\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020|0Î\u00022\t\u0010Ð\u0002\u001a\u0004\u0018\u00010eH\u0000¢\u0006\u0006\bÖ\u0002\u0010×\u0002J&\u0010Ø\u0002\u001a\u00020o2\u0014\u0010Í\u0002\u001a\u000f\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020|0Î\u0002¢\u0006\u0006\bÙ\u0002\u0010Ú\u0002J@\u0010Û\u0002\u001a\u00020o2\u0014\u0010Í\u0002\u001a\u000f\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020|0Î\u00022\u0016\u0010\u00ad\u0002\u001a\u0011\u0012\u0004\u0012\u00020o\u0018\u00010\u0094\u0001¢\u0006\u0003\bÏ\u0002H\u0002¢\u0006\u0006\bÜ\u0002\u0010Ý\u0002J\u0018\u0010ã\u0002\u001a\u0004\u0018\u00010|*\u00020J2\u0007\u0010þ\u0001\u001a\u00020\u001eH\u0002J\t\u0010ä\u0002\u001a\u00020oH\u0002J\t\u0010å\u0002\u001a\u00020oH\u0002J\u0012\u0010æ\u0002\u001a\u00020o2\u0007\u0010ç\u0002\u001a\u00020`H\u0002J\t\u0010è\u0002\u001a\u00020oH\u0002J\u0012\u0010é\u0002\u001a\u00020o2\u0007\u0010ê\u0002\u001a\u00020\u001eH\u0002J\t\u0010ë\u0002\u001a\u00020oH\u0002J\t\u0010ì\u0002\u001a\u00020oH\u0002J\t\u0010í\u0002\u001a\u00020oH\u0002J\u000f\u0010î\u0002\u001a\u00020oH\u0000¢\u0006\u0003\bï\u0002J0\u0010ð\u0002\u001a\u00020o2\u0007\u0010ñ\u0002\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\b\u0010{\u001a\u0004\u0018\u00010|2\t\u0010ð\u0001\u001a\u0004\u0018\u00010|H\u0082\bJ\u001b\u0010ò\u0002\u001a\u00020o2\u0007\u0010ñ\u0002\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0082\bJ0\u0010ó\u0002\u001a\u00020o2\u0007\u0010ñ\u0002\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\b\u0010{\u001a\u0004\u0018\u00010|2\t\u0010ð\u0001\u001a\u0004\u0018\u00010|H\u0082\bJ\u001b\u0010ô\u0002\u001a\u00020o2\u0007\u0010ñ\u0002\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0082\bJ\u000f\u0010õ\u0002\u001a\u00020\u001eH\u0000¢\u0006\u0003\bö\u0002J\u000b\u0010þ\u0002\u001a\u0004\u0018\u00010|H\u0016J\u0013\u0010ÿ\u0002\u001a\u00020o2\b\u0010?\u001a\u0004\u0018\u00010|H\u0016J\u0013\u0010\u0080\u0003\u001a\u00020o2\b\u0010\u0095\u0002\u001a\u00030ø\u0002H\u0016R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00101\u001a\n\u0012\u0004\u0012\u000200\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u00020;X\u0082\u0004¢\u0006\u0004\n\u0002\u0010<R\u0016\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001bR\u001e\u0010@\u001a\u00020(2\u0006\u0010?\u001a\u00020(@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u001e\u0010C\u001a\u00020(2\u0006\u0010?\u001a\u00020(@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bD\u0010BR\u0014\u0010E\u001a\u00020(8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bF\u0010BR\u0014\u0010G\u001a\u00020(8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bH\u0010BR\u001a\u0010I\u001a\u00020JX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001a\u0010O\u001a\u00020\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u000e\u0010T\u001a\u00020UX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010W\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010X\u001a\u0004\u0018\u00010\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u000e\u0010]\u001a\u00020^X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010_\u001a\u00020`X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010a\u001a\u00020bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010c\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010d\u001a\u0004\u0018\u00010eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010f\u001a\u0004\u0018\u00010g8@X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010iR\u0014\u0010j\u001a\u00020kX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bl\u0010mR\u001a\u0010v\u001a\u00020(8VX\u0097\u0004¢\u0006\f\u0012\u0004\bw\u0010x\u001a\u0004\by\u0010BR)\u0010\u0083\u0001\u001a\u00020(2\u0006\u0010?\u001a\u00020(8\u0016@RX\u0097\u000e¢\u0006\u0010\n\u0000\u0012\u0005\b\u0084\u0001\u0010x\u001a\u0005\b\u0085\u0001\u0010BR\u001d\u0010\u0086\u0001\u001a\u00020(8VX\u0097\u0004¢\u0006\u000e\u0012\u0005\b\u0087\u0001\u0010x\u001a\u0005\b\u0088\u0001\u0010BR9\u0010\u008b\u0001\u001a\b0\u0089\u0001j\u0003`\u008a\u00012\f\u0010?\u001a\b0\u0089\u0001j\u0003`\u008a\u00018\u0016@RX\u0097\u000e¢\u0006\u0014\n\u0003\u0010\u008f\u0001\u0012\u0005\b\u008c\u0001\u0010x\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0017\u0010ª\u0001\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\b\u001a\u0006\b«\u0001\u0010¬\u0001R\u0012\u0010È\u0001\u001a\u0005\u0018\u00010É\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010Ê\u0001\u001a\u00030É\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bË\u0001\u0010Ì\u0001R\u0018\u0010Ð\u0001\u001a\u00030Ñ\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÒ\u0001\u0010Ó\u0001R\u0017\u0010æ\u0001\u001a\u00020\u001e8@X\u0080\u0004¢\u0006\b\u001a\u0006\bç\u0001\u0010¬\u0001R\u0019\u0010è\u0001\u001a\u0004\u0018\u00010>8@X\u0080\u0004¢\u0006\b\u001a\u0006\bé\u0001\u0010ê\u0001R\u0013\u0010Þ\u0002\u001a\u00020(8F¢\u0006\u0007\u001a\u0005\bß\u0002\u0010BR\u001d\u0010à\u0002\u001a\u0004\u0018\u00010|*\u00020J8BX\u0082\u0004¢\u0006\b\u001a\u0006\bá\u0002\u0010â\u0002R\u001a\u0010÷\u0002\u001a\u0005\u0018\u00010ø\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bù\u0002\u0010ú\u0002R\u0019\u0010û\u0002\u001a\u0004\u0018\u00010|8VX\u0096\u0004¢\u0006\b\u001a\u0006\bü\u0002\u0010ý\u0002¨\u0006\u0083\u0003"}, d2 = {"Landroidx/compose/runtime/ComposerImpl;", "Landroidx/compose/runtime/Composer;", "applier", "Landroidx/compose/runtime/Applier;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", "slotTable", "Landroidx/compose/runtime/SlotTable;", "abandonSet", "", "Landroidx/compose/runtime/RememberObserver;", "changes", "Landroidx/compose/runtime/changelist/ChangeList;", "lateChanges", "observerHolder", "Landroidx/compose/runtime/CompositionObserverHolder;", "composition", "Landroidx/compose/runtime/CompositionImpl;", "<init>", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/SlotTable;Ljava/util/Set;Landroidx/compose/runtime/changelist/ChangeList;Landroidx/compose/runtime/changelist/ChangeList;Landroidx/compose/runtime/CompositionObserverHolder;Landroidx/compose/runtime/CompositionImpl;)V", "getApplier", "()Landroidx/compose/runtime/Applier;", "getComposition", "()Landroidx/compose/runtime/CompositionImpl;", "pendingStack", "Landroidx/compose/runtime/Stack;", "Landroidx/compose/runtime/Pending;", "Ljava/util/ArrayList;", "pending", "nodeIndex", "", "groupNodeCount", "rGroupIndex", "parentStateStack", "Landroidx/compose/runtime/IntStack;", "nodeCountOverrides", "", "nodeCountVirtualOverrides", "Landroidx/collection/MutableIntIntMap;", "forceRecomposeScopes", "", "forciblyRecompose", "nodeExpected", "invalidations", "", "Landroidx/compose/runtime/Invalidation;", "entersStack", "rootProvider", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "providerUpdates", "Landroidx/collection/MutableIntObjectMap;", "providersInvalid", "providersInvalidStack", "reusing", "reusingGroup", "childrenComposing", "compositionToken", "sourceMarkersEnabled", "derivedStateObserver", "androidx/compose/runtime/ComposerImpl$derivedStateObserver$1", "Landroidx/compose/runtime/ComposerImpl$derivedStateObserver$1;", "invalidateStack", "Landroidx/compose/runtime/RecomposeScopeImpl;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "isComposing", "isComposing$runtime", "()Z", "isDisposed", "isDisposed$runtime", "areChildrenComposing", "getAreChildrenComposing$runtime", "hasPendingChanges", "getHasPendingChanges$runtime", "reader", "Landroidx/compose/runtime/SlotReader;", "getReader$runtime", "()Landroidx/compose/runtime/SlotReader;", "setReader$runtime", "(Landroidx/compose/runtime/SlotReader;)V", "insertTable", "getInsertTable$runtime", "()Landroidx/compose/runtime/SlotTable;", "setInsertTable$runtime", "(Landroidx/compose/runtime/SlotTable;)V", "writer", "Landroidx/compose/runtime/SlotWriter;", "writerHasAProvider", "providerCache", "deferredChanges", "getDeferredChanges$runtime", "()Landroidx/compose/runtime/changelist/ChangeList;", "setDeferredChanges$runtime", "(Landroidx/compose/runtime/changelist/ChangeList;)V", "changeListWriter", "Landroidx/compose/runtime/changelist/ComposerChangeListWriter;", "insertAnchor", "Landroidx/compose/runtime/Anchor;", "insertFixups", "Landroidx/compose/runtime/changelist/FixupList;", "pausable", "shouldPauseCallback", "Landroidx/compose/runtime/ShouldPauseCallback;", "errorContext", "Landroidx/compose/runtime/tooling/CompositionErrorContextImpl;", "getErrorContext$runtime", "()Landroidx/compose/runtime/tooling/CompositionErrorContextImpl;", "applyCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "startReplaceableGroup", "", "key", "endReplaceableGroup", "startReplaceGroup", "endReplaceGroup", "startDefaults", "endDefaults", "defaultsInvalid", "getDefaultsInvalid$annotations", "()V", "getDefaultsInvalid", "startMovableGroup", "dataKey", "", "endMovableGroup", "startRoot", "endRoot", "abortRoot", "changesApplied", "changesApplied$runtime", "inserting", "getInserting$annotations", "getInserting", "skipping", "getSkipping$annotations", "getSkipping", "", "Landroidx/compose/runtime/CompositeKeyHashCode;", "compositeKeyHashCode", "getCompositeKeyHashCode$annotations", "getCompositeKeyHashCode", "()J", "J", "collectParameterInformation", "scheduleFrameEndCallback", "Landroidx/compose/runtime/CancellationHandle;", "action", "Lkotlin/Function0;", "dispose", "dispose$runtime", "deactivate", "deactivate$runtime", "forceRecomposeScopes$runtime", "startGroup", "endGroup", "skipGroup", "startNode", "startReusableNode", "createNode", "T", "factory", "useNode", "endNode", "startReusableGroup", "endReusableGroup", "disableReusing", "enableReusing", "startReuseFromRoot", "endReuseFromRoot", "currentMarker", "getCurrentMarker", "()I", "endToMarker", "marker", com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConstants.APPLY_PROMO_CARD_STATUS, "V", "block", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "joinKey", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, "nextSlot", "nextSlotForCache", "changed", "changedInstance", "", "", "", "", "", com.datadog.trace.api.DDSpanTypes.CACHE, "invalid", "(ZLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "updateSlot", "updateValue", "updateCachedValue", "rememberObserverGroupIndex", "_compositionData", "Landroidx/compose/runtime/tooling/CompositionData;", "compositionData", "getCompositionData", "()Landroidx/compose/runtime/tooling/CompositionData;", "recordSideEffect", "effect", "currentCompositionLocalScope", "currentCompositionLocalMap", "Landroidx/compose/runtime/CompositionLocalMap;", "getCurrentCompositionLocalMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "group", "updateProviderMapGroup", "parentScope", "currentProviders", "startProvider", "Landroidx/compose/runtime/ProvidedValue;", "recordProviderUpdate", "providers", "endProvider", "startProviders", "values", "", "([Landroidx/compose/runtime/ProvidedValue;)V", "endProviders", "consume", "Landroidx/compose/runtime/CompositionLocal;", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "buildContext", "changeCount", "getChangeCount$runtime", "currentRecomposeScope", "getCurrentRecomposeScope$runtime", "()Landroidx/compose/runtime/RecomposeScopeImpl;", "ensureWriter", "createFreshInsertTable", "forceFreshInsertTable", "startReaderGroup", "isNode", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "objectKey", "kind", "Landroidx/compose/runtime/GroupKind;", "start-BaiHCIY", "(ILjava/lang/Object;ILjava/lang/Object;)V", "enterGroup", "newPending", "exitGroup", "expectedNodeCount", "end", "recomposeToGroupEnd", "insertedGroupVirtualIndex", "index", "updateNodeCountOverrides", "newCount", "nodeIndexOf", "groupLocation", "recomposeGroup", "recomposeIndex", "rGroupIndexOf", "updatedNodeCount", "updateNodeCount", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "clearUpdatedNodeCounts", "recordUpsAndDowns", "oldGroup", "newGroup", "commonRoot", "doRecordDownsFor", "nearestCommonRoot", "compositeKeyOf", "recomposeKey", "(IIJ)J", "groupCompositeKeyPart", "tryImminentInvalidation", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "instance", "tryImminentInvalidation$runtime", "parentKey", "parentKey$runtime", "skipCurrentGroup", "skipReaderToGroupEnd", "shouldExecute", "parametersChanged", "flags", "skipToGroupEnd", "deactivateToEndGroup", "startRestartGroup", "addRecomposeScope", "enterRecomposeScope", "endRestartGroup", "Landroidx/compose/runtime/ScopeUpdateScope;", "exitRecomposeScope", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "insertMovableContent", "Landroidx/compose/runtime/MovableContent;", "parameter", "invokeMovableContentLambda", "content", "locals", "force", "insertMovableContentReferences", "references", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "insertMovableContentGuarded", "withReader", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "(Landroidx/compose/runtime/SlotReader;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "recomposeMovableContent", "from", "Landroidx/compose/runtime/ControlledComposition;", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ControlledComposition;Ljava/lang/Integer;Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "sourceInformation", "", "sourceInformationMarkerStart", "sourceInformationMarkerEnd", "disableSourceInformation", "stackTraceForValue", "Landroidx/compose/runtime/tooling/ComposeStackTrace;", "stackTraceForValue$runtime", "currentStackTrace", "stackTraceForGroup", "Landroidx/compose/runtime/tooling/ComposeStackTraceFrame;", "dataOffset", "(ILjava/lang/Integer;)Ljava/util/List;", "parentStackTrace", "composeContent", "invalidationsRequested", "Landroidx/compose/runtime/collection/ScopeMap;", "Landroidx/compose/runtime/Composable;", "shouldPause", "composeContent--ZbOJvo$runtime", "(Landroidx/collection/MutableScatterMap;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/ShouldPauseCallback;)V", "prepareCompose", "prepareCompose$runtime", "recompose", "recompose-aFTiNEg$runtime", "(Landroidx/collection/MutableScatterMap;Landroidx/compose/runtime/ShouldPauseCallback;)Z", "updateComposerInvalidations", "updateComposerInvalidations-RY85e9Y", "(Landroidx/collection/MutableScatterMap;)V", "doCompose", "doCompose-aFTiNEg", "(Landroidx/collection/MutableScatterMap;Lkotlin/jvm/functions/Function2;)V", "hasInvalidations", "getHasInvalidations", "node", "getNode", "(Landroidx/compose/runtime/SlotReader;)Ljava/lang/Object;", "nodeAt", "validateNodeExpected", "validateNodeNotExpected", "recordInsert", io.ktor.http.LinkHeader.Parameters.Anchor, "recordDelete", "reportFreeMovableContent", "groupBeingRemoved", "reportAllMovableContent", "finalizeCompose", "cleanUpCompose", "verifyConsistent", "verifyConsistent$runtime", "updateCompositeKeyWhenWeEnterGroup", "groupKey", "updateCompositeKeyWhenWeEnterGroupKeyHash", "updateCompositeKeyWhenWeExitGroup", "updateCompositeKeyWhenWeExitGroupKeyHash", "stacksSize", "stacksSize$runtime", "recomposeScope", "Landroidx/compose/runtime/RecomposeScope;", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "recomposeScopeIdentity", "getRecomposeScopeIdentity", "()Ljava/lang/Object;", "rememberedValue", "updateRememberedValue", "recordUsed", "CompositionContextHolder", "CompositionContextImpl", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerImpl implements androidx.compose.runtime.Composer {
    public static final int $stable = 8;
    private final androidx.compose.runtime.CompositionContext ArtificialStackFrames;
    private final androidx.compose.runtime.changelist.ComposerChangeListWriter Camera2StreamConfigurationMap;
    private androidx.collection.MutableIntObjectMap<androidx.compose.runtime.PersistentCompositionLocalMap> _BOUNDARY;
    private int _CREATION;

    /* renamed from: a, reason: collision with root package name */
    private boolean f2681a;
    private androidx.compose.runtime.Pending accessartificialFrame;
    private final androidx.compose.runtime.Applier<?> applier;
    private final kotlin.coroutines.CoroutineContext applyCoroutineContext;
    private androidx.compose.runtime.PersistentCompositionLocalMap b;
    private androidx.compose.runtime.ShouldPauseCallback c;
    private long compositeKeyHashCode;
    private final androidx.compose.runtime.CompositionImpl composition;
    private final androidx.compose.runtime.CompositionObserverHolder coroutineBoundary;
    private androidx.compose.runtime.changelist.ChangeList deferredChanges;
    private final androidx.compose.runtime.tooling.CompositionErrorContextImpl errorContext;
    private boolean exchange;
    private androidx.compose.runtime.tooling.CompositionData getHighResolutionOutputSizeshNQ4ISI;
    private androidx.compose.runtime.changelist.ChangeList getHighSpeedVideoFpsRanges;
    private final java.util.Set<androidx.compose.runtime.RememberObserver> getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private final androidx.compose.runtime.ComposerImpl$derivedStateObserver$1 getHighSpeedVideoSizesFor;
    private boolean getInputFormats;
    private int getInputSizeshNQ4ISI;
    private boolean getOutputFormats;
    private androidx.compose.runtime.changelist.FixupList getOutputMinFrameDurationlomOqCM;
    private int getOutputSizeshNQ4ISI;
    private androidx.compose.runtime.Anchor getOutputStallDuration;
    private final java.util.ArrayList<androidx.compose.runtime.RecomposeScopeImpl> getOutputStallDurationlomOqCM;
    private int[] getValidOutputFormatsForInputhNQ4ISI;
    private boolean init;
    private androidx.compose.runtime.SlotTable insertTable;
    private boolean inserting;
    private boolean isComposing;
    private boolean isDisposed;
    private int isOutputSupportedFor;
    private androidx.compose.runtime.changelist.ChangeList isOutputSupportedForhNQ4ISI;
    private final androidx.compose.runtime.SlotTable kernelVersion;
    private androidx.compose.runtime.SlotReader reader;
    private boolean release;
    private androidx.compose.runtime.SlotWriter startTransaction;
    private boolean toString;
    private androidx.collection.MutableIntIntMap unwrapAs;
    private final java.util.ArrayList<androidx.compose.runtime.Pending> coroutineCreation = androidx.compose.runtime.Stack.m5282constructorimpl$default(null, 1, null);
    private final androidx.compose.runtime.IntStack CoroutineDebuggingKt = new androidx.compose.runtime.IntStack();
    private final java.util.List<androidx.compose.runtime.Invalidation> getOutputSizes = new java.util.ArrayList();
    private final androidx.compose.runtime.IntStack getOutputMinFrameDuration = new androidx.compose.runtime.IntStack();
    private androidx.compose.runtime.PersistentCompositionLocalMap AMEXKernel = androidx.compose.runtime.internal.PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf();
    private final androidx.compose.runtime.IntStack getARTIFICIAL_FRAME_PACKAGE_NAME = new androidx.compose.runtime.IntStack();
    private int d = -1;

    public static /* synthetic */ void getCompositeKeyHashCode$annotations() {
    }

    @androidx.compose.runtime.ComposeCompilerApi
    public static /* synthetic */ void getDefaultsInvalid$annotations() {
    }

    private static int getHighResolutionOutputSizeshNQ4ISI(int i) {
        return (-2) - i;
    }

    @androidx.compose.runtime.ComposeCompilerApi
    public static /* synthetic */ void getInserting$annotations() {
    }

    @androidx.compose.runtime.ComposeCompilerApi
    public static /* synthetic */ void getSkipping$annotations() {
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [androidx.compose.runtime.ComposerImpl$derivedStateObserver$1] */
    public ComposerImpl(androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.CompositionContext compositionContext, androidx.compose.runtime.SlotTable slotTable, java.util.Set<androidx.compose.runtime.RememberObserver> set, androidx.compose.runtime.changelist.ChangeList changeList, androidx.compose.runtime.changelist.ChangeList changeList2, androidx.compose.runtime.CompositionObserverHolder compositionObserverHolder, androidx.compose.runtime.CompositionImpl compositionImpl) {
        this.applier = applier;
        this.ArtificialStackFrames = compositionContext;
        this.kernelVersion = slotTable;
        this.getHighSpeedVideoFpsRangesFor = set;
        this.getHighSpeedVideoFpsRanges = changeList;
        this.isOutputSupportedForhNQ4ISI = changeList2;
        this.coroutineBoundary = compositionObserverHolder;
        this.composition = compositionImpl;
        this.exchange = compositionContext.getCollectingSourceInformation() || compositionContext.getCollectingCallByInformation$runtime();
        this.getHighSpeedVideoSizesFor = new androidx.compose.runtime.DerivedStateObserver() { // from class: androidx.compose.runtime.ComposerImpl$derivedStateObserver$1
            @Override // androidx.compose.runtime.DerivedStateObserver
            public final void start(androidx.compose.runtime.DerivedState<?> derivedState) {
                androidx.compose.runtime.ComposerImpl.this.getHighSpeedVideoSizes++;
            }

            @Override // androidx.compose.runtime.DerivedStateObserver
            public final void done(androidx.compose.runtime.DerivedState<?> derivedState) {
                androidx.compose.runtime.ComposerImpl.this.getHighSpeedVideoSizes--;
            }
        };
        this.getOutputStallDurationlomOqCM = androidx.compose.runtime.Stack.m5282constructorimpl$default(null, 1, null);
        androidx.compose.runtime.SlotReader openReader = slotTable.openReader();
        openReader.close();
        this.reader = openReader;
        androidx.compose.runtime.SlotTable slotTable2 = new androidx.compose.runtime.SlotTable();
        if (compositionContext.getCollectingSourceInformation()) {
            slotTable2.collectSourceInformation();
        }
        if (compositionContext.getCollectingCallByInformation$runtime()) {
            slotTable2.collectCalledByInformation();
        }
        this.insertTable = slotTable2;
        androidx.compose.runtime.SlotWriter openWriter = slotTable2.openWriter();
        openWriter.close(true);
        this.startTransaction = openWriter;
        this.Camera2StreamConfigurationMap = new androidx.compose.runtime.changelist.ComposerChangeListWriter(this, this.getHighSpeedVideoFpsRanges);
        androidx.compose.runtime.SlotReader openReader2 = this.insertTable.openReader();
        try {
            androidx.compose.runtime.Anchor anchor = openReader2.anchor(0);
            openReader2.close();
            this.getOutputStallDuration = anchor;
            this.getOutputMinFrameDurationlomOqCM = new androidx.compose.runtime.changelist.FixupList();
            this.errorContext = new androidx.compose.runtime.tooling.CompositionErrorContextImpl(this);
            kotlin.coroutines.CoroutineContext effectCoroutineContext = compositionContext.getEffectCoroutineContext();
            kotlin.coroutines.CoroutineContext errorContext$runtime = getErrorContext$runtime();
            this.applyCoroutineContext = effectCoroutineContext.plus(errorContext$runtime == null ? kotlin.coroutines.EmptyCoroutineContext.INSTANCE : errorContext$runtime);
        } catch (java.lang.Throwable th) {
            openReader2.close();
            throw th;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public final androidx.compose.runtime.Applier<?> getApplier() {
        return this.applier;
    }

    @Override // androidx.compose.runtime.Composer
    public final androidx.compose.runtime.CompositionImpl getComposition() {
        return this.composition;
    }

    /* renamed from: isComposing$runtime, reason: from getter */
    public final boolean getIsComposing() {
        return this.isComposing;
    }

    /* renamed from: isDisposed$runtime, reason: from getter */
    public final boolean getIsDisposed() {
        return this.isDisposed;
    }

    public final boolean getAreChildrenComposing$runtime() {
        return this.getHighSpeedVideoSizes > 0;
    }

    public final boolean getHasPendingChanges$runtime() {
        return this.getHighSpeedVideoFpsRanges.isNotEmpty();
    }

    /* renamed from: getReader$runtime, reason: from getter */
    public final androidx.compose.runtime.SlotReader getReader() {
        return this.reader;
    }

    public final void setReader$runtime(androidx.compose.runtime.SlotReader slotReader) {
        this.reader = slotReader;
    }

    /* renamed from: getInsertTable$runtime, reason: from getter */
    public final androidx.compose.runtime.SlotTable getInsertTable() {
        return this.insertTable;
    }

    public final void setInsertTable$runtime(androidx.compose.runtime.SlotTable slotTable) {
        this.insertTable = slotTable;
    }

    /* renamed from: getDeferredChanges$runtime, reason: from getter */
    public final androidx.compose.runtime.changelist.ChangeList getDeferredChanges() {
        return this.deferredChanges;
    }

    public final void setDeferredChanges$runtime(androidx.compose.runtime.changelist.ChangeList changeList) {
        this.deferredChanges = changeList;
    }

    public final androidx.compose.runtime.tooling.CompositionErrorContextImpl getErrorContext$runtime() {
        if (this.ArtificialStackFrames.getStackTraceEnabled$runtime()) {
            return this.errorContext;
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public final kotlin.coroutines.CoroutineContext getApplyCoroutineContext() {
        return this.applyCoroutineContext;
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public final void startReplaceableGroup(int key) {
        getHighSpeedVideoFpsRanges(key, null, androidx.compose.runtime.GroupKind.INSTANCE.m5243getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public final void endReplaceableGroup() {
        getInputSizeshNQ4ISI();
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public final void startReplaceGroup(int key) {
        if (this.accessartificialFrame != null) {
            getHighSpeedVideoFpsRanges(key, null, androidx.compose.runtime.GroupKind.INSTANCE.m5243getGroupULZAiWs(), null);
            return;
        }
        coroutineCreation();
        this.compositeKeyHashCode = java.lang.Long.rotateLeft(java.lang.Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ key, 3) ^ this._CREATION;
        this._CREATION++;
        androidx.compose.runtime.SlotReader slotReader = this.reader;
        if (getInserting()) {
            slotReader.beginEmpty();
            this.startTransaction.startGroup(key, androidx.compose.runtime.Composer.INSTANCE.getEmpty());
            getHighSpeedVideoFpsRangesFor(false, (androidx.compose.runtime.Pending) null);
            return;
        }
        if (slotReader.getGroupKey() == key && !slotReader.getHasObjectKey()) {
            slotReader.startGroup();
            getHighSpeedVideoFpsRangesFor(false, (androidx.compose.runtime.Pending) null);
            return;
        }
        if (!slotReader.isGroupEnd()) {
            int i = this.isOutputSupportedFor;
            int currentGroup = slotReader.getCurrentGroup();
            getOutputSizeshNQ4ISI();
            this.Camera2StreamConfigurationMap.removeNode(i, slotReader.skipGroup());
            androidx.compose.runtime.ComposerImplKt.getHighResolutionOutputSizeshNQ4ISI((java.util.List<androidx.compose.runtime.Invalidation>) this.getOutputSizes, currentGroup, slotReader.getCurrentGroup());
        }
        slotReader.beginEmpty();
        this.inserting = true;
        this.b = null;
        getOutputMinFrameDuration();
        androidx.compose.runtime.SlotWriter slotWriter = this.startTransaction;
        slotWriter.beginInsert();
        int currentGroup2 = slotWriter.getCurrentGroup();
        slotWriter.startGroup(key, androidx.compose.runtime.Composer.INSTANCE.getEmpty());
        this.getOutputStallDuration = slotWriter.anchor(currentGroup2);
        getHighSpeedVideoFpsRangesFor(false, (androidx.compose.runtime.Pending) null);
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public final void endReplaceGroup() {
        getInputSizeshNQ4ISI();
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public final void startDefaults() {
        getHighSpeedVideoFpsRanges(androidx.compose.runtime.ComposerKt.defaultsKey, null, androidx.compose.runtime.GroupKind.INSTANCE.m5243getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public final void endDefaults() {
        getInputSizeshNQ4ISI();
        androidx.compose.runtime.RecomposeScopeImpl currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime();
        if (currentRecomposeScope$runtime == null || !currentRecomposeScope$runtime.getUsed()) {
            return;
        }
        currentRecomposeScope$runtime.setDefaultsInScope(true);
    }

    @Override // androidx.compose.runtime.Composer
    public final boolean getDefaultsInvalid() {
        androidx.compose.runtime.RecomposeScopeImpl currentRecomposeScope$runtime;
        return !getSkipping() || this.f2681a || ((currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime()) != null && currentRecomposeScope$runtime.getDefaultsInvalid());
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public final void startMovableGroup(int key, java.lang.Object dataKey) {
        getHighSpeedVideoFpsRanges(key, dataKey, androidx.compose.runtime.GroupKind.INSTANCE.m5243getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public final void endMovableGroup() {
        getInputSizeshNQ4ISI();
    }

    private final void getValidOutputFormatsForInputhNQ4ISI() {
        int Camera2StreamConfigurationMap;
        this._CREATION = 0;
        this.reader = this.kernelVersion.openReader();
        Camera2StreamConfigurationMap(100);
        this.ArtificialStackFrames.startComposing$runtime();
        androidx.compose.runtime.PersistentCompositionLocalMap compositionLocalScope$runtime = this.ArtificialStackFrames.getCompositionLocalScope$runtime();
        androidx.compose.runtime.IntStack intStack = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
        Camera2StreamConfigurationMap = androidx.compose.runtime.ComposerImplKt.Camera2StreamConfigurationMap(this.f2681a);
        intStack.push(Camera2StreamConfigurationMap);
        this.f2681a = changed(compositionLocalScope$runtime);
        this.b = null;
        if (!this.getOutputFormats) {
            this.getOutputFormats = this.ArtificialStackFrames.getCollectingParameterInformation();
        }
        if (!this.exchange) {
            this.exchange = this.ArtificialStackFrames.getCollectingSourceInformation();
        }
        if (this.exchange) {
            androidx.compose.runtime.CompositionLocal<androidx.compose.runtime.tooling.CompositionErrorContext> localCompositionErrorContext = androidx.compose.runtime.tooling.CompositionErrorContextKt.getLocalCompositionErrorContext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(localCompositionErrorContext, "");
            compositionLocalScope$runtime = compositionLocalScope$runtime.putValue(localCompositionErrorContext, new androidx.compose.runtime.StaticValueHolder(getErrorContext$runtime()));
        }
        this.AMEXKernel = compositionLocalScope$runtime;
        java.util.Set<androidx.compose.runtime.tooling.CompositionData> set = (java.util.Set) androidx.compose.runtime.CompositionLocalMapKt.read(compositionLocalScope$runtime, androidx.compose.runtime.tooling.InspectionTablesKt.getLocalInspectionTables());
        if (set != null) {
            set.add(getCompositionData());
            this.ArtificialStackFrames.recordInspectionTable$runtime(set);
        }
        Camera2StreamConfigurationMap(java.lang.Long.hashCode(this.ArtificialStackFrames.getCompositeKeyHashCode()));
    }

    private final void getOutputFormats() {
        boolean Camera2StreamConfigurationMap;
        getInputSizeshNQ4ISI();
        this.ArtificialStackFrames.doneComposing$runtime();
        getInputSizeshNQ4ISI();
        this.Camera2StreamConfigurationMap.endRoot();
        getOutputMinFrameDurationlomOqCM();
        this.reader.close();
        this.getInputFormats = false;
        Camera2StreamConfigurationMap = androidx.compose.runtime.ComposerImplKt.Camera2StreamConfigurationMap(this.getARTIFICIAL_FRAME_PACKAGE_NAME.pop());
        this.f2681a = Camera2StreamConfigurationMap;
    }

    private final void getHighSpeedVideoFpsRanges() {
        getHighSpeedVideoFpsRangesFor();
        androidx.compose.runtime.Stack.m5280clearimpl(this.coroutineCreation);
        this.CoroutineDebuggingKt.clear();
        this.getOutputMinFrameDuration.clear();
        this.getARTIFICIAL_FRAME_PACKAGE_NAME.clear();
        this._BOUNDARY = null;
        this.getOutputMinFrameDurationlomOqCM.clear();
        this.compositeKeyHashCode = 0L;
        this.getHighSpeedVideoSizes = 0;
        this.toString = false;
        this.inserting = false;
        this.init = false;
        this.isComposing = false;
        this.getInputFormats = false;
        this.d = -1;
        if (!this.reader.getClosed()) {
            this.reader.close();
        }
        if (this.startTransaction.getClosed()) {
            return;
        }
        getOutputStallDurationlomOqCM();
    }

    public final void changesApplied$runtime() {
        this._BOUNDARY = null;
    }

    @Override // androidx.compose.runtime.Composer
    public final boolean getInserting() {
        return this.inserting;
    }

    @Override // androidx.compose.runtime.Composer
    public final boolean getSkipping() {
        androidx.compose.runtime.RecomposeScopeImpl currentRecomposeScope$runtime;
        return (getInserting() || this.init || this.f2681a || (currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime()) == null || currentRecomposeScope$runtime.getRequiresRecompose() || this.getInputFormats) ? false : true;
    }

    @Override // androidx.compose.runtime.Composer
    public final long getCompositeKeyHashCode() {
        return this.compositeKeyHashCode;
    }

    @Override // androidx.compose.runtime.Composer
    public final void collectParameterInformation() {
        this.getOutputFormats = true;
        this.exchange = true;
        this.kernelVersion.collectSourceInformation();
        this.insertTable.collectSourceInformation();
        this.startTransaction.updateToTableMaps();
    }

    @Override // androidx.compose.runtime.Composer
    public final androidx.compose.runtime.CancellationHandle scheduleFrameEndCallback(kotlin.jvm.functions.Function0<kotlin.Unit> action) {
        return this.ArtificialStackFrames.scheduleFrameEndCallback(action);
    }

    public final void deactivate$runtime() {
        androidx.compose.runtime.Stack.m5280clearimpl(this.getOutputStallDurationlomOqCM);
        this.getOutputSizes.clear();
        this.getHighSpeedVideoFpsRanges.clear();
        this._BOUNDARY = null;
    }

    public final boolean forceRecomposeScopes$runtime() {
        if (this.getOutputFormats) {
            return false;
        }
        this.getOutputFormats = true;
        this.getInputFormats = true;
        return true;
    }

    private final void Camera2StreamConfigurationMap(int i) {
        getHighSpeedVideoFpsRanges(i, null, androidx.compose.runtime.GroupKind.INSTANCE.m5243getGroupULZAiWs(), null);
    }

    private final void getHighSpeedVideoFpsRangesFor(int i, java.lang.Object obj) {
        getHighSpeedVideoFpsRanges(i, obj, androidx.compose.runtime.GroupKind.INSTANCE.m5243getGroupULZAiWs(), null);
    }

    private final void getInputSizeshNQ4ISI() {
        getHighSpeedVideoFpsRangesFor(false);
    }

    private final void isOutputSupportedForhNQ4ISI() {
        this.getOutputSizeshNQ4ISI += this.reader.skipGroup();
    }

    @Override // androidx.compose.runtime.Composer
    public final void startNode() {
        getHighSpeedVideoFpsRanges(125, null, androidx.compose.runtime.GroupKind.INSTANCE.m5244getNodeULZAiWs(), null);
        this.toString = true;
    }

    @Override // androidx.compose.runtime.Composer
    public final void startReusableNode() {
        getHighSpeedVideoFpsRanges(125, null, androidx.compose.runtime.GroupKind.INSTANCE.m5245getReusableNodeULZAiWs(), null);
        this.toString = true;
    }

    @Override // androidx.compose.runtime.Composer
    public final <T> void createNode(kotlin.jvm.functions.Function0<? extends T> factory) {
        accessartificialFrame();
        if (!getInserting()) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("createNode() can only be called when inserting");
        }
        int peek = this.CoroutineDebuggingKt.peek();
        androidx.compose.runtime.SlotWriter slotWriter = this.startTransaction;
        androidx.compose.runtime.Anchor anchor = slotWriter.anchor(slotWriter.getParent());
        this.getOutputSizeshNQ4ISI++;
        this.getOutputMinFrameDurationlomOqCM.createAndInsertNode(factory, peek, anchor);
    }

    @Override // androidx.compose.runtime.Composer
    public final void useNode() {
        accessartificialFrame();
        if (getInserting()) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("useNode() called while inserting");
        }
        java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(this.reader);
        this.Camera2StreamConfigurationMap.moveDown(highResolutionOutputSizeshNQ4ISI);
        if (this.init && (highResolutionOutputSizeshNQ4ISI instanceof androidx.compose.runtime.ComposeNodeLifecycleCallback)) {
            this.Camera2StreamConfigurationMap.useNode(highResolutionOutputSizeshNQ4ISI);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public final void endNode() {
        getHighSpeedVideoFpsRangesFor(true);
    }

    @Override // androidx.compose.runtime.Composer
    public final void startReusableGroup(int key, java.lang.Object dataKey) {
        if (!getInserting() && this.reader.getGroupKey() == key && !kotlin.jvm.internal.Intrinsics.areEqual(this.reader.getGroupAux(), dataKey) && this.d < 0) {
            this.d = this.reader.getCurrentGroup();
            this.init = true;
        }
        getHighSpeedVideoFpsRanges(key, null, androidx.compose.runtime.GroupKind.INSTANCE.m5243getGroupULZAiWs(), dataKey);
    }

    @Override // androidx.compose.runtime.Composer
    public final void endReusableGroup() {
        if (this.init && this.reader.getParent() == this.d) {
            this.d = -1;
            this.init = false;
        }
        getHighSpeedVideoFpsRangesFor(false);
    }

    @Override // androidx.compose.runtime.Composer
    public final void disableReusing() {
        this.init = false;
    }

    @Override // androidx.compose.runtime.Composer
    public final void enableReusing() {
        this.init = this.d >= 0;
    }

    public final void startReuseFromRoot() {
        this.d = 0;
        this.init = true;
    }

    public final void endReuseFromRoot() {
        if (this.isComposing || this.d != 0) {
            androidx.compose.runtime.PreconditionsKt.throwIllegalArgumentException("Cannot disable reuse from root if it was caused by other groups");
        }
        this.d = -1;
        this.init = false;
    }

    @Override // androidx.compose.runtime.Composer
    public final int getCurrentMarker() {
        return getInserting() ? -this.startTransaction.getParent() : this.reader.getParent();
    }

    @Override // androidx.compose.runtime.Composer
    public final void endToMarker(int marker) {
        if (marker < 0) {
            int i = -marker;
            androidx.compose.runtime.SlotWriter slotWriter = this.startTransaction;
            while (true) {
                int parent = slotWriter.getParent();
                if (parent <= i) {
                    return;
                } else {
                    getHighSpeedVideoFpsRangesFor(slotWriter.isNode(parent));
                }
            }
        } else {
            if (getInserting()) {
                androidx.compose.runtime.SlotWriter slotWriter2 = this.startTransaction;
                while (getInserting()) {
                    getHighSpeedVideoFpsRangesFor(slotWriter2.isNode(slotWriter2.getParent()));
                }
            }
            androidx.compose.runtime.SlotReader slotReader = this.reader;
            while (true) {
                int parent2 = slotReader.getParent();
                if (parent2 <= marker) {
                    return;
                } else {
                    getHighSpeedVideoFpsRangesFor(slotReader.isNode(parent2));
                }
            }
        }
    }

    @Override // androidx.compose.runtime.Composer
    public final <V, T> void apply(V value, kotlin.jvm.functions.Function2<? super T, ? super V, kotlin.Unit> block) {
        if (getInserting()) {
            this.getOutputMinFrameDurationlomOqCM.updateNode(value, block);
        } else {
            this.Camera2StreamConfigurationMap.updateNode(value, block);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public final java.lang.Object joinKey(java.lang.Object left, java.lang.Object right) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        highResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.ComposerImplKt.getHighResolutionOutputSizeshNQ4ISI(this.reader.getGroupObjectKey(), left, right);
        return highResolutionOutputSizeshNQ4ISI == null ? new androidx.compose.runtime.JoinedKey(left, right) : highResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.Object nextSlot() {
        if (getInserting()) {
            coroutineCreation();
            return androidx.compose.runtime.Composer.INSTANCE.getEmpty();
        }
        java.lang.Object next = this.reader.next();
        return (!this.init || (next instanceof androidx.compose.runtime.ReusableRememberObserverHolder)) ? next : androidx.compose.runtime.Composer.INSTANCE.getEmpty();
    }

    public final java.lang.Object nextSlotForCache() {
        if (getInserting()) {
            coroutineCreation();
            return androidx.compose.runtime.Composer.INSTANCE.getEmpty();
        }
        java.lang.Object next = this.reader.next();
        return (!this.init || (next instanceof androidx.compose.runtime.ReusableRememberObserverHolder)) ? next instanceof androidx.compose.runtime.RememberObserverHolder ? ((androidx.compose.runtime.RememberObserverHolder) next).getWrapped() : next : androidx.compose.runtime.Composer.INSTANCE.getEmpty();
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public final boolean changed(java.lang.Object value) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(nextSlot(), value)) {
            return false;
        }
        updateValue(value);
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public final boolean changedInstance(java.lang.Object value) {
        if (nextSlot() == value) {
            return false;
        }
        updateValue(value);
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public final boolean changed(char value) {
        java.lang.Object nextSlot = nextSlot();
        if ((nextSlot instanceof java.lang.Character) && value == ((java.lang.Character) nextSlot).charValue()) {
            return false;
        }
        updateValue(java.lang.Character.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public final boolean changed(byte value) {
        java.lang.Object nextSlot = nextSlot();
        if ((nextSlot instanceof java.lang.Byte) && value == ((java.lang.Number) nextSlot).byteValue()) {
            return false;
        }
        updateValue(java.lang.Byte.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public final boolean changed(short value) {
        java.lang.Object nextSlot = nextSlot();
        if ((nextSlot instanceof java.lang.Short) && value == ((java.lang.Number) nextSlot).shortValue()) {
            return false;
        }
        updateValue(java.lang.Short.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public final boolean changed(boolean value) {
        java.lang.Object nextSlot = nextSlot();
        if ((nextSlot instanceof java.lang.Boolean) && value == ((java.lang.Boolean) nextSlot).booleanValue()) {
            return false;
        }
        updateValue(java.lang.Boolean.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public final boolean changed(float value) {
        java.lang.Object nextSlot = nextSlot();
        if ((nextSlot instanceof java.lang.Float) && value == ((java.lang.Number) nextSlot).floatValue()) {
            return false;
        }
        updateValue(java.lang.Float.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public final boolean changed(long value) {
        java.lang.Object nextSlot = nextSlot();
        if ((nextSlot instanceof java.lang.Long) && value == ((java.lang.Number) nextSlot).longValue()) {
            return false;
        }
        updateValue(java.lang.Long.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public final boolean changed(double value) {
        java.lang.Object nextSlot = nextSlot();
        if ((nextSlot instanceof java.lang.Double) && value == ((java.lang.Number) nextSlot).doubleValue()) {
            return false;
        }
        updateValue(java.lang.Double.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public final boolean changed(int value) {
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

    private final void getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj) {
        nextSlot();
        updateValue(obj);
    }

    public final void updateValue(java.lang.Object value) {
        if (getInserting()) {
            this.startTransaction.update(value);
            return;
        }
        if (this.reader.getHadNext()) {
            int groupSlotIndex = this.reader.getGroupSlotIndex() - 1;
            if (this.Camera2StreamConfigurationMap.getPastParent()) {
                androidx.compose.runtime.changelist.ComposerChangeListWriter composerChangeListWriter = this.Camera2StreamConfigurationMap;
                androidx.compose.runtime.SlotReader slotReader = this.reader;
                composerChangeListWriter.updateAnchoredValue(value, slotReader.anchor(slotReader.getParent()), groupSlotIndex);
                return;
            }
            this.Camera2StreamConfigurationMap.updateValue(value, groupSlotIndex);
            return;
        }
        androidx.compose.runtime.changelist.ComposerChangeListWriter composerChangeListWriter2 = this.Camera2StreamConfigurationMap;
        androidx.compose.runtime.SlotReader slotReader2 = this.reader;
        composerChangeListWriter2.appendValue(slotReader2.anchor(slotReader2.getParent()), value);
    }

    public final void updateCachedValue(java.lang.Object value) {
        if (value instanceof androidx.compose.runtime.RememberObserver) {
            androidx.compose.runtime.RememberObserverHolder rememberObserverHolder = new androidx.compose.runtime.RememberObserverHolder((androidx.compose.runtime.RememberObserver) value, getOutputStallDuration());
            if (getInserting()) {
                this.Camera2StreamConfigurationMap.remember(rememberObserverHolder);
            }
            this.getHighSpeedVideoFpsRangesFor.add(value);
            value = rememberObserverHolder;
        }
        updateValue(value);
    }

    private final int getOutputStallDuration() {
        return this._CREATION - 1;
    }

    @Override // androidx.compose.runtime.Composer
    public final androidx.compose.runtime.tooling.CompositionData getCompositionData() {
        androidx.compose.runtime.tooling.CompositionData compositionData = this.getHighResolutionOutputSizeshNQ4ISI;
        if (compositionData != null) {
            return compositionData;
        }
        androidx.compose.runtime.CompositionDataImpl compositionDataImpl = new androidx.compose.runtime.CompositionDataImpl(getComposition());
        this.getHighResolutionOutputSizeshNQ4ISI = compositionDataImpl;
        return compositionDataImpl;
    }

    @Override // androidx.compose.runtime.Composer
    public final void recordSideEffect(kotlin.jvm.functions.Function0<kotlin.Unit> effect) {
        this.Camera2StreamConfigurationMap.sideEffect(effect);
    }

    private final androidx.compose.runtime.PersistentCompositionLocalMap getInputFormats() {
        androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap = this.b;
        return persistentCompositionLocalMap != null ? persistentCompositionLocalMap : getHighSpeedVideoFpsRangesFor(this.reader.getParent());
    }

    @Override // androidx.compose.runtime.Composer
    public final androidx.compose.runtime.CompositionLocalMap getCurrentCompositionLocalMap() {
        return getInputFormats();
    }

    private final androidx.compose.runtime.PersistentCompositionLocalMap getHighSpeedVideoFpsRangesFor(int i) {
        androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap;
        if (getInserting() && this.release) {
            int parent = this.startTransaction.getParent();
            while (parent > 0) {
                if (this.startTransaction.groupKey(parent) == 202 && kotlin.jvm.internal.Intrinsics.areEqual(this.startTransaction.groupObjectKey(parent), androidx.compose.runtime.ComposerKt.getCompositionLocalMap())) {
                    java.lang.Object groupAux = this.startTransaction.groupAux(parent);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(groupAux, "");
                    androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap2 = (androidx.compose.runtime.PersistentCompositionLocalMap) groupAux;
                    this.b = persistentCompositionLocalMap2;
                    return persistentCompositionLocalMap2;
                }
                parent = this.startTransaction.parent(parent);
            }
        }
        if (this.reader.getGetHighSpeedVideoFpsRanges() > 0) {
            while (i > 0) {
                if (this.reader.groupKey(i) == 202 && kotlin.jvm.internal.Intrinsics.areEqual(this.reader.groupObjectKey(i), androidx.compose.runtime.ComposerKt.getCompositionLocalMap())) {
                    androidx.collection.MutableIntObjectMap<androidx.compose.runtime.PersistentCompositionLocalMap> mutableIntObjectMap = this._BOUNDARY;
                    if (mutableIntObjectMap == null || (persistentCompositionLocalMap = mutableIntObjectMap.get(i)) == null) {
                        java.lang.Object groupAux2 = this.reader.groupAux(i);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(groupAux2, "");
                        persistentCompositionLocalMap = (androidx.compose.runtime.PersistentCompositionLocalMap) groupAux2;
                    }
                    this.b = persistentCompositionLocalMap;
                    return persistentCompositionLocalMap;
                }
                i = this.reader.parent(i);
            }
        }
        androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap3 = this.AMEXKernel;
        this.b = persistentCompositionLocalMap3;
        return persistentCompositionLocalMap3;
    }

    @Override // androidx.compose.runtime.Composer
    public final void startProvider(androidx.compose.runtime.ProvidedValue<?> value) {
        androidx.compose.runtime.ValueHolder<?> valueHolder;
        int Camera2StreamConfigurationMap;
        androidx.compose.runtime.PersistentCompositionLocalMap inputFormats = getInputFormats();
        getHighSpeedVideoFpsRangesFor(201, androidx.compose.runtime.ComposerKt.getProvider());
        java.lang.Object rememberedValue = rememberedValue();
        if (kotlin.jvm.internal.Intrinsics.areEqual(rememberedValue, androidx.compose.runtime.Composer.INSTANCE.getEmpty())) {
            valueHolder = null;
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNull(rememberedValue, "");
            valueHolder = (androidx.compose.runtime.ValueHolder) rememberedValue;
        }
        androidx.compose.runtime.CompositionLocal<?> compositionLocal = value.getCompositionLocal();
        kotlin.jvm.internal.Intrinsics.checkNotNull(compositionLocal, "");
        kotlin.jvm.internal.Intrinsics.checkNotNull(value, "");
        androidx.compose.runtime.ValueHolder<?> updatedStateOf$runtime = compositionLocal.updatedStateOf$runtime(value, valueHolder);
        boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(updatedStateOf$runtime, valueHolder);
        if (!areEqual) {
            updateRememberedValue(updatedStateOf$runtime);
        }
        boolean z = false;
        if (getInserting()) {
            if (value.getCanOverride() || !androidx.compose.runtime.CompositionLocalMapKt.contains(inputFormats, compositionLocal)) {
                inputFormats = inputFormats.putValue(compositionLocal, updatedStateOf$runtime);
            }
            this.release = true;
        } else {
            androidx.compose.runtime.SlotReader slotReader = this.reader;
            java.lang.Object groupAux = slotReader.groupAux(slotReader.getCurrentGroup());
            kotlin.jvm.internal.Intrinsics.checkNotNull(groupAux, "");
            androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap = (androidx.compose.runtime.PersistentCompositionLocalMap) groupAux;
            if ((!getSkipping() || !areEqual) && (value.getCanOverride() || !androidx.compose.runtime.CompositionLocalMapKt.contains(inputFormats, compositionLocal))) {
                inputFormats = inputFormats.putValue(compositionLocal, updatedStateOf$runtime);
            } else if ((areEqual && !this.f2681a) || !this.f2681a) {
                inputFormats = persistentCompositionLocalMap;
            }
            if (this.init || persistentCompositionLocalMap != inputFormats) {
                z = true;
            }
        }
        if (z && !getInserting()) {
            getHighResolutionOutputSizeshNQ4ISI(inputFormats);
        }
        androidx.compose.runtime.IntStack intStack = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
        Camera2StreamConfigurationMap = androidx.compose.runtime.ComposerImplKt.Camera2StreamConfigurationMap(this.f2681a);
        intStack.push(Camera2StreamConfigurationMap);
        this.f2681a = z;
        this.b = inputFormats;
        getHighSpeedVideoFpsRanges(202, androidx.compose.runtime.ComposerKt.getCompositionLocalMap(), androidx.compose.runtime.GroupKind.INSTANCE.m5243getGroupULZAiWs(), inputFormats);
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap) {
        androidx.collection.MutableIntObjectMap<androidx.compose.runtime.PersistentCompositionLocalMap> mutableIntObjectMap = this._BOUNDARY;
        if (mutableIntObjectMap == null) {
            mutableIntObjectMap = new androidx.collection.MutableIntObjectMap<>(0, 1, null);
            this._BOUNDARY = mutableIntObjectMap;
        }
        mutableIntObjectMap.set(this.reader.getCurrentGroup(), persistentCompositionLocalMap);
    }

    @Override // androidx.compose.runtime.Composer
    public final void endProvider() {
        boolean Camera2StreamConfigurationMap;
        getInputSizeshNQ4ISI();
        getInputSizeshNQ4ISI();
        Camera2StreamConfigurationMap = androidx.compose.runtime.ComposerImplKt.Camera2StreamConfigurationMap(this.getARTIFICIAL_FRAME_PACKAGE_NAME.pop());
        this.f2681a = Camera2StreamConfigurationMap;
        this.b = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7, r1) != false) goto L5;
     */
    @Override // androidx.compose.runtime.Composer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void startProviders(androidx.compose.runtime.ProvidedValue<?>[] values) {
        androidx.compose.runtime.PersistentCompositionLocalMap highSpeedVideoFpsRangesFor;
        int Camera2StreamConfigurationMap;
        androidx.compose.runtime.PersistentCompositionLocalMap inputFormats = getInputFormats();
        getHighSpeedVideoFpsRangesFor(201, androidx.compose.runtime.ComposerKt.getProvider());
        boolean z = true;
        if (getInserting()) {
            highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(inputFormats, androidx.compose.runtime.CompositionLocalMapKt.updateCompositionMap$default(values, inputFormats, null, 4, null));
            this.release = true;
        } else {
            java.lang.Object groupGet = this.reader.groupGet(0);
            kotlin.jvm.internal.Intrinsics.checkNotNull(groupGet, "");
            androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap = (androidx.compose.runtime.PersistentCompositionLocalMap) groupGet;
            java.lang.Object groupGet2 = this.reader.groupGet(1);
            kotlin.jvm.internal.Intrinsics.checkNotNull(groupGet2, "");
            androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap2 = (androidx.compose.runtime.PersistentCompositionLocalMap) groupGet2;
            androidx.compose.runtime.PersistentCompositionLocalMap updateCompositionMap = androidx.compose.runtime.CompositionLocalMapKt.updateCompositionMap(values, inputFormats, persistentCompositionLocalMap2);
            if (!getSkipping() || this.init || !kotlin.jvm.internal.Intrinsics.areEqual(persistentCompositionLocalMap2, updateCompositionMap)) {
                highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(inputFormats, updateCompositionMap);
                if (!this.init) {
                }
                if (z && !getInserting()) {
                    getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor);
                }
                androidx.compose.runtime.IntStack intStack = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
                Camera2StreamConfigurationMap = androidx.compose.runtime.ComposerImplKt.Camera2StreamConfigurationMap(this.f2681a);
                intStack.push(Camera2StreamConfigurationMap);
                this.f2681a = z;
                this.b = highSpeedVideoFpsRangesFor;
                getHighSpeedVideoFpsRanges(202, androidx.compose.runtime.ComposerKt.getCompositionLocalMap(), androidx.compose.runtime.GroupKind.INSTANCE.m5243getGroupULZAiWs(), highSpeedVideoFpsRangesFor);
            }
            isOutputSupportedForhNQ4ISI();
            highSpeedVideoFpsRangesFor = persistentCompositionLocalMap;
        }
        z = false;
        if (z) {
            getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor);
        }
        androidx.compose.runtime.IntStack intStack2 = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
        Camera2StreamConfigurationMap = androidx.compose.runtime.ComposerImplKt.Camera2StreamConfigurationMap(this.f2681a);
        intStack2.push(Camera2StreamConfigurationMap);
        this.f2681a = z;
        this.b = highSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges(202, androidx.compose.runtime.ComposerKt.getCompositionLocalMap(), androidx.compose.runtime.GroupKind.INSTANCE.m5243getGroupULZAiWs(), highSpeedVideoFpsRangesFor);
    }

    @Override // androidx.compose.runtime.Composer
    public final void endProviders() {
        boolean Camera2StreamConfigurationMap;
        getInputSizeshNQ4ISI();
        getInputSizeshNQ4ISI();
        Camera2StreamConfigurationMap = androidx.compose.runtime.ComposerImplKt.Camera2StreamConfigurationMap(this.getARTIFICIAL_FRAME_PACKAGE_NAME.pop());
        this.f2681a = Camera2StreamConfigurationMap;
        this.b = null;
    }

    @Override // androidx.compose.runtime.Composer
    public final <T> T consume(androidx.compose.runtime.CompositionLocal<T> key) {
        return (T) androidx.compose.runtime.CompositionLocalMapKt.read(getInputFormats(), key);
    }

    @Override // androidx.compose.runtime.Composer
    public final androidx.compose.runtime.CompositionContext buildContext() {
        getHighSpeedVideoFpsRangesFor(206, androidx.compose.runtime.ComposerKt.getReference());
        if (getInserting()) {
            androidx.compose.runtime.SlotWriter.markGroup$default(this.startTransaction, 0, 1, null);
        }
        java.lang.Object nextSlot = nextSlot();
        androidx.compose.runtime.ReusableRememberObserverHolder reusableRememberObserverHolder = nextSlot instanceof androidx.compose.runtime.RememberObserverHolder ? (androidx.compose.runtime.RememberObserverHolder) nextSlot : null;
        if (reusableRememberObserverHolder == null) {
            reusableRememberObserverHolder = new androidx.compose.runtime.ReusableRememberObserverHolder(new androidx.compose.runtime.ComposerImpl.CompositionContextHolder(new androidx.compose.runtime.ComposerImpl.CompositionContextImpl(getCompositeKeyHashCode(), this.getOutputFormats, this.exchange, getComposition().getObserverHolder())), -1);
            updateValue(reusableRememberObserverHolder);
        }
        androidx.compose.runtime.RememberObserver wrapped = reusableRememberObserverHolder.getWrapped();
        kotlin.jvm.internal.Intrinsics.checkNotNull(wrapped, "");
        androidx.compose.runtime.ComposerImpl.CompositionContextHolder compositionContextHolder = (androidx.compose.runtime.ComposerImpl.CompositionContextHolder) wrapped;
        compositionContextHolder.getRef().updateCompositionLocalScope(getInputFormats());
        getInputSizeshNQ4ISI();
        return compositionContextHolder.getRef();
    }

    public final int getChangeCount$runtime() {
        return this.getHighSpeedVideoFpsRanges.getSize();
    }

    public final androidx.compose.runtime.RecomposeScopeImpl getCurrentRecomposeScope$runtime() {
        java.util.ArrayList<androidx.compose.runtime.RecomposeScopeImpl> arrayList = this.getOutputStallDurationlomOqCM;
        if (this.getHighSpeedVideoSizes == 0 && androidx.compose.runtime.Stack.m5288isNotEmptyimpl(arrayList)) {
            return (androidx.compose.runtime.RecomposeScopeImpl) androidx.compose.runtime.Stack.m5289peekimpl(arrayList);
        }
        return null;
    }

    private final void getOutputMinFrameDuration() {
        if (this.startTransaction.getClosed()) {
            androidx.compose.runtime.SlotWriter openWriter = this.insertTable.openWriter();
            this.startTransaction = openWriter;
            openWriter.skipToGroupEnd();
            this.release = false;
            this.b = null;
        }
    }

    private final void getHighSpeedVideoSizes() {
        if (!this.startTransaction.getClosed()) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        getOutputStallDurationlomOqCM();
    }

    private final void getOutputStallDurationlomOqCM() {
        androidx.compose.runtime.SlotTable slotTable = new androidx.compose.runtime.SlotTable();
        if (this.exchange) {
            slotTable.collectSourceInformation();
        }
        if (this.ArtificialStackFrames.getCollectingCallByInformation$runtime()) {
            slotTable.collectCalledByInformation();
        }
        this.insertTable = slotTable;
        androidx.compose.runtime.SlotWriter openWriter = slotTable.openWriter();
        openWriter.close(true);
        this.startTransaction = openWriter;
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(boolean z, java.lang.Object obj) {
        if (z) {
            this.reader.startNode();
            return;
        }
        if (obj != null && this.reader.getGroupAux() != obj) {
            this.Camera2StreamConfigurationMap.updateAuxData(obj);
        }
        this.reader.startGroup();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void getHighSpeedVideoFpsRanges(int i, java.lang.Object obj, int i2, java.lang.Object obj2) {
        long rotateLeft;
        java.lang.Object obj3 = obj;
        coroutineCreation();
        int i3 = this._CREATION;
        if (obj3 == null) {
            if (obj2 != null && i == 207 && !kotlin.jvm.internal.Intrinsics.areEqual(obj2, androidx.compose.runtime.Composer.INSTANCE.getEmpty())) {
                this.compositeKeyHashCode = i3 ^ java.lang.Long.rotateLeft(java.lang.Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ obj2.hashCode(), 3);
                if (obj3 == null) {
                    this._CREATION++;
                }
                boolean z = i2 == androidx.compose.runtime.GroupKind.INSTANCE.m5243getGroupULZAiWs();
                androidx.compose.runtime.Pending pending = null;
                if (!getInserting()) {
                    this.reader.beginEmpty();
                    int currentGroup = this.startTransaction.getCurrentGroup();
                    if (z) {
                        this.startTransaction.startNode(i, androidx.compose.runtime.Composer.INSTANCE.getEmpty());
                    } else if (obj2 != null) {
                        androidx.compose.runtime.SlotWriter slotWriter = this.startTransaction;
                        if (obj3 == null) {
                            obj3 = androidx.compose.runtime.Composer.INSTANCE.getEmpty();
                        }
                        slotWriter.startData(i, obj3, obj2);
                    } else {
                        androidx.compose.runtime.SlotWriter slotWriter2 = this.startTransaction;
                        if (obj3 == null) {
                            obj3 = androidx.compose.runtime.Composer.INSTANCE.getEmpty();
                        }
                        slotWriter2.startGroup(i, obj3);
                    }
                    androidx.compose.runtime.Pending pending2 = this.accessartificialFrame;
                    if (pending2 != null) {
                        androidx.compose.runtime.KeyInfo keyInfo = new androidx.compose.runtime.KeyInfo(i, -1, getHighResolutionOutputSizeshNQ4ISI(currentGroup), -1, 0);
                        pending2.getHighResolutionOutputSizeshNQ4ISI(keyInfo, this.isOutputSupportedFor - pending2.getGetHighSpeedVideoFpsRangesFor());
                        pending2.Camera2StreamConfigurationMap(keyInfo);
                    }
                    getHighSpeedVideoFpsRangesFor(z, (androidx.compose.runtime.Pending) null);
                    return;
                }
                boolean z2 = i2 == androidx.compose.runtime.GroupKind.INSTANCE.m5244getNodeULZAiWs() && this.init;
                if (this.accessartificialFrame == null) {
                    int groupKey = this.reader.getGroupKey();
                    if (!z2 && groupKey == i && kotlin.jvm.internal.Intrinsics.areEqual(obj, this.reader.getGroupObjectKey())) {
                        getHighResolutionOutputSizeshNQ4ISI(z, obj2);
                    } else {
                        this.accessartificialFrame = new androidx.compose.runtime.Pending(this.reader.extractKeys(), this.isOutputSupportedFor);
                    }
                }
                androidx.compose.runtime.Pending pending3 = this.accessartificialFrame;
                if (pending3 != null) {
                    androidx.compose.runtime.KeyInfo Camera2StreamConfigurationMap = pending3.Camera2StreamConfigurationMap(i, obj);
                    if (!z2 && Camera2StreamConfigurationMap != null) {
                        pending3.Camera2StreamConfigurationMap(Camera2StreamConfigurationMap);
                        int location = Camera2StreamConfigurationMap.getLocation();
                        this.isOutputSupportedFor = pending3.getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap) + pending3.getGetHighSpeedVideoFpsRangesFor();
                        int highSpeedVideoSizes = pending3.getHighSpeedVideoSizes(Camera2StreamConfigurationMap);
                        int camera2StreamConfigurationMap = highSpeedVideoSizes - pending3.getCamera2StreamConfigurationMap();
                        pending3.getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes, pending3.getCamera2StreamConfigurationMap());
                        this.Camera2StreamConfigurationMap.moveReaderRelativeTo(location);
                        this.reader.reposition(location);
                        if (camera2StreamConfigurationMap > 0) {
                            this.Camera2StreamConfigurationMap.moveCurrentGroup(camera2StreamConfigurationMap);
                        }
                        getHighResolutionOutputSizeshNQ4ISI(z, obj2);
                    } else {
                        this.reader.beginEmpty();
                        this.inserting = true;
                        this.b = null;
                        getOutputMinFrameDuration();
                        this.startTransaction.beginInsert();
                        int currentGroup2 = this.startTransaction.getCurrentGroup();
                        if (z) {
                            this.startTransaction.startNode(i, androidx.compose.runtime.Composer.INSTANCE.getEmpty());
                        } else if (obj2 != null) {
                            androidx.compose.runtime.SlotWriter slotWriter3 = this.startTransaction;
                            if (obj3 == null) {
                                obj3 = androidx.compose.runtime.Composer.INSTANCE.getEmpty();
                            }
                            slotWriter3.startData(i, obj3, obj2);
                        } else {
                            androidx.compose.runtime.SlotWriter slotWriter4 = this.startTransaction;
                            if (obj3 == null) {
                                obj3 = androidx.compose.runtime.Composer.INSTANCE.getEmpty();
                            }
                            slotWriter4.startGroup(i, obj3);
                        }
                        this.getOutputStallDuration = this.startTransaction.anchor(currentGroup2);
                        androidx.compose.runtime.KeyInfo keyInfo2 = new androidx.compose.runtime.KeyInfo(i, -1, getHighResolutionOutputSizeshNQ4ISI(currentGroup2), -1, 0);
                        pending3.getHighResolutionOutputSizeshNQ4ISI(keyInfo2, this.isOutputSupportedFor - pending3.getGetHighSpeedVideoFpsRangesFor());
                        pending3.Camera2StreamConfigurationMap(keyInfo2);
                        pending = new androidx.compose.runtime.Pending(new java.util.ArrayList(), z ? 0 : this.isOutputSupportedFor);
                    }
                }
                getHighSpeedVideoFpsRangesFor(z, pending);
                return;
            }
            rotateLeft = i3 ^ java.lang.Long.rotateLeft(java.lang.Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ i, 3);
        } else {
            rotateLeft = java.lang.Long.rotateLeft(java.lang.Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ (obj3 instanceof java.lang.Enum ? ((java.lang.Enum) obj3).ordinal() : obj.hashCode()), 3);
        }
        this.compositeKeyHashCode = rotateLeft;
        if (obj3 == null) {
        }
        if (i2 == androidx.compose.runtime.GroupKind.INSTANCE.m5243getGroupULZAiWs()) {
        }
        androidx.compose.runtime.Pending pending4 = null;
        if (!getInserting()) {
        }
    }

    private final void getHighSpeedVideoFpsRangesFor(boolean z, androidx.compose.runtime.Pending pending) {
        androidx.compose.runtime.Stack.m5292pushimpl(this.coroutineCreation, this.accessartificialFrame);
        this.accessartificialFrame = pending;
        this.CoroutineDebuggingKt.push(this.getOutputSizeshNQ4ISI);
        this.CoroutineDebuggingKt.push(this._CREATION);
        this.CoroutineDebuggingKt.push(this.isOutputSupportedFor);
        if (z) {
            this.isOutputSupportedFor = 0;
        }
        this.getOutputSizeshNQ4ISI = 0;
        this._CREATION = 0;
    }

    private final void getHighSpeedVideoSizes(int i, boolean z) {
        androidx.compose.runtime.Pending pending = (androidx.compose.runtime.Pending) androidx.compose.runtime.Stack.m5291popimpl(this.coroutineCreation);
        if (pending != null && !z) {
            pending.getHighResolutionOutputSizeshNQ4ISI(pending.getCamera2StreamConfigurationMap() + 1);
        }
        this.accessartificialFrame = pending;
        this.isOutputSupportedFor = this.CoroutineDebuggingKt.pop() + i;
        this._CREATION = this.CoroutineDebuggingKt.pop();
        this.getOutputSizeshNQ4ISI = this.CoroutineDebuggingKt.pop() + i;
    }

    private final void getHighSpeedVideoFpsRangesFor(boolean z) {
        long rotateRight;
        long j;
        int remainingSlots;
        java.util.Set set;
        java.util.List<androidx.compose.runtime.KeyInfo> list;
        long rotateRight2;
        long j2;
        int peek2 = this.CoroutineDebuggingKt.peek2() - 1;
        if (getInserting()) {
            int parent = this.startTransaction.getParent();
            int groupKey = this.startTransaction.groupKey(parent);
            java.lang.Object groupObjectKey = this.startTransaction.groupObjectKey(parent);
            java.lang.Object groupAux = this.startTransaction.groupAux(parent);
            if (groupObjectKey == null) {
                if (groupAux != null && groupKey == 207 && !kotlin.jvm.internal.Intrinsics.areEqual(groupAux, androidx.compose.runtime.Composer.INSTANCE.getEmpty())) {
                    this.compositeKeyHashCode = java.lang.Long.rotateRight(groupAux.hashCode() ^ java.lang.Long.rotateRight(getCompositeKeyHashCode() ^ peek2, 3), 3);
                } else {
                    rotateRight2 = java.lang.Long.rotateRight(getCompositeKeyHashCode() ^ peek2, 3);
                    j2 = groupKey;
                }
            } else {
                int ordinal = groupObjectKey instanceof java.lang.Enum ? ((java.lang.Enum) groupObjectKey).ordinal() : groupObjectKey.hashCode();
                rotateRight2 = java.lang.Long.rotateRight(getCompositeKeyHashCode(), 3);
                j2 = ordinal;
            }
            this.compositeKeyHashCode = java.lang.Long.rotateRight(rotateRight2 ^ j2, 3);
        } else {
            int parent2 = this.reader.getParent();
            int groupKey2 = this.reader.groupKey(parent2);
            java.lang.Object groupObjectKey2 = this.reader.groupObjectKey(parent2);
            java.lang.Object groupAux2 = this.reader.groupAux(parent2);
            if (groupObjectKey2 == null) {
                if (groupAux2 != null && groupKey2 == 207 && !kotlin.jvm.internal.Intrinsics.areEqual(groupAux2, androidx.compose.runtime.Composer.INSTANCE.getEmpty())) {
                    this.compositeKeyHashCode = java.lang.Long.rotateRight(groupAux2.hashCode() ^ java.lang.Long.rotateRight(getCompositeKeyHashCode() ^ peek2, 3), 3);
                } else {
                    rotateRight = java.lang.Long.rotateRight(getCompositeKeyHashCode() ^ peek2, 3);
                    j = groupKey2;
                }
            } else {
                int ordinal2 = groupObjectKey2 instanceof java.lang.Enum ? ((java.lang.Enum) groupObjectKey2).ordinal() : groupObjectKey2.hashCode();
                rotateRight = java.lang.Long.rotateRight(getCompositeKeyHashCode(), 3);
                j = ordinal2;
            }
            this.compositeKeyHashCode = java.lang.Long.rotateRight(rotateRight ^ j, 3);
        }
        int i = this.getOutputSizeshNQ4ISI;
        androidx.compose.runtime.Pending pending = this.accessartificialFrame;
        if (pending != null && pending.getHighSpeedVideoSizes().size() > 0) {
            java.util.List<androidx.compose.runtime.KeyInfo> highSpeedVideoSizes = pending.getHighSpeedVideoSizes();
            java.util.List<androidx.compose.runtime.KeyInfo> highSpeedVideoFpsRanges = pending.getHighSpeedVideoFpsRanges();
            java.util.Set fastToSet = androidx.compose.runtime.snapshots.ListUtilsKt.fastToSet(highSpeedVideoFpsRanges);
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            int size = highSpeedVideoFpsRanges.size();
            int size2 = highSpeedVideoSizes.size();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < size2) {
                androidx.compose.runtime.KeyInfo keyInfo = highSpeedVideoSizes.get(i2);
                if (!fastToSet.contains(keyInfo)) {
                    this.Camera2StreamConfigurationMap.removeNode(pending.getHighSpeedVideoFpsRanges(keyInfo) + pending.getGetHighSpeedVideoFpsRangesFor(), keyInfo.getNodes());
                    pending.getHighResolutionOutputSizeshNQ4ISI(keyInfo.getLocation(), 0);
                    this.Camera2StreamConfigurationMap.moveReaderRelativeTo(keyInfo.getLocation());
                    this.reader.reposition(keyInfo.getLocation());
                    getOutputSizeshNQ4ISI();
                    this.reader.skipGroup();
                    set = fastToSet;
                    androidx.compose.runtime.ComposerImplKt.getHighResolutionOutputSizeshNQ4ISI((java.util.List<androidx.compose.runtime.Invalidation>) this.getOutputSizes, keyInfo.getLocation(), keyInfo.getLocation() + this.reader.groupSize(keyInfo.getLocation()));
                } else {
                    set = fastToSet;
                    if (!linkedHashSet.contains(keyInfo)) {
                        if (i3 < size) {
                            androidx.compose.runtime.KeyInfo keyInfo2 = highSpeedVideoFpsRanges.get(i3);
                            if (keyInfo2 != keyInfo) {
                                int highSpeedVideoFpsRanges2 = pending.getHighSpeedVideoFpsRanges(keyInfo2);
                                linkedHashSet.add(keyInfo2);
                                if (highSpeedVideoFpsRanges2 != i4) {
                                    int highResolutionOutputSizeshNQ4ISI = pending.getHighResolutionOutputSizeshNQ4ISI(keyInfo2);
                                    list = highSpeedVideoFpsRanges;
                                    this.Camera2StreamConfigurationMap.moveNode(pending.getGetHighSpeedVideoFpsRangesFor() + highSpeedVideoFpsRanges2, i4 + pending.getGetHighSpeedVideoFpsRangesFor(), highResolutionOutputSizeshNQ4ISI);
                                    pending.getHighSpeedVideoSizes(highSpeedVideoFpsRanges2, i4, highResolutionOutputSizeshNQ4ISI);
                                } else {
                                    list = highSpeedVideoFpsRanges;
                                }
                            } else {
                                list = highSpeedVideoFpsRanges;
                                i2++;
                            }
                            i3++;
                            i4 += pending.getHighResolutionOutputSizeshNQ4ISI(keyInfo2);
                        } else {
                            list = highSpeedVideoFpsRanges;
                        }
                        fastToSet = set;
                        highSpeedVideoFpsRanges = list;
                    }
                }
                list = highSpeedVideoFpsRanges;
                i2++;
                fastToSet = set;
                highSpeedVideoFpsRanges = list;
            }
            this.Camera2StreamConfigurationMap.endNodeMovement();
            if (highSpeedVideoSizes.size() > 0) {
                this.Camera2StreamConfigurationMap.moveReaderRelativeTo(this.reader.getGroupEnd());
                this.reader.skipToGroupEnd();
            }
        }
        boolean inserting = getInserting();
        if (!inserting && (remainingSlots = this.reader.getRemainingSlots()) > 0) {
            this.Camera2StreamConfigurationMap.trimValues(remainingSlots);
        }
        int i5 = this.isOutputSupportedFor;
        while (!this.reader.isGroupEnd()) {
            int currentGroup = this.reader.getCurrentGroup();
            getOutputSizeshNQ4ISI();
            this.Camera2StreamConfigurationMap.removeNode(i5, this.reader.skipGroup());
            androidx.compose.runtime.ComposerImplKt.getHighResolutionOutputSizeshNQ4ISI((java.util.List<androidx.compose.runtime.Invalidation>) this.getOutputSizes, currentGroup, this.reader.getCurrentGroup());
        }
        if (inserting) {
            if (z) {
                this.getOutputMinFrameDurationlomOqCM.endNodeInsert();
                i = 1;
            }
            this.reader.endEmpty();
            int parent3 = this.startTransaction.getParent();
            this.startTransaction.endGroup();
            if (!this.reader.getInEmpty()) {
                int highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(parent3);
                this.startTransaction.endInsert();
                this.startTransaction.close(true);
                getHighSpeedVideoFpsRangesFor(this.getOutputStallDuration);
                this.inserting = false;
                if (!this.kernelVersion.isEmpty()) {
                    getHighSpeedVideoFpsRanges(highResolutionOutputSizeshNQ4ISI2, 0);
                    getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI2, i);
                }
            }
        } else {
            if (z) {
                this.Camera2StreamConfigurationMap.moveUp();
            }
            this.Camera2StreamConfigurationMap.endCurrentGroup();
            int parent4 = this.reader.getParent();
            if (i != getHighSpeedVideoSizesFor(parent4)) {
                getHighResolutionOutputSizeshNQ4ISI(parent4, i);
            }
            if (z) {
                i = 1;
            }
            this.reader.endGroup();
            this.Camera2StreamConfigurationMap.endNodeMovement();
        }
        getHighSpeedVideoSizes(i, inserting);
    }

    private final void getOutputSizes() {
        androidx.compose.runtime.Invalidation highSpeedVideoSizes;
        boolean z = this.isComposing;
        this.isComposing = true;
        int parent = this.reader.getParent();
        int groupSize = this.reader.groupSize(parent) + parent;
        int i = this.isOutputSupportedFor;
        long compositeKeyHashCode = getCompositeKeyHashCode();
        int i2 = this.getOutputSizeshNQ4ISI;
        int i3 = this._CREATION;
        highSpeedVideoSizes = androidx.compose.runtime.ComposerImplKt.getHighSpeedVideoSizes((java.util.List<androidx.compose.runtime.Invalidation>) this.getOutputSizes, this.reader.getCurrentGroup(), groupSize);
        boolean z2 = false;
        int i4 = parent;
        while (highSpeedVideoSizes != null) {
            int getHighResolutionOutputSizeshNQ4ISI = highSpeedVideoSizes.getGetHighResolutionOutputSizeshNQ4ISI();
            androidx.compose.runtime.RecomposeScopeImpl camera2StreamConfigurationMap = highSpeedVideoSizes.getCamera2StreamConfigurationMap();
            androidx.compose.runtime.ComposerImplKt.getHighSpeedVideoFpsRangesFor(this.getOutputSizes, getHighResolutionOutputSizeshNQ4ISI);
            if (highSpeedVideoSizes.getHighSpeedVideoSizes()) {
                this.reader.reposition(getHighResolutionOutputSizeshNQ4ISI);
                int currentGroup = this.reader.getCurrentGroup();
                Camera2StreamConfigurationMap(i4, currentGroup, parent);
                this.isOutputSupportedFor = getHighSpeedVideoFpsRangesFor(getHighResolutionOutputSizeshNQ4ISI, currentGroup, parent, i);
                this._CREATION = getHighSpeedVideoFpsRanges(currentGroup);
                this.compositeKeyHashCode = getHighResolutionOutputSizeshNQ4ISI(this.reader.parent(currentGroup), parent, compositeKeyHashCode);
                this.b = null;
                camera2StreamConfigurationMap.compose(this);
                this.b = null;
                this.reader.restoreParent(parent);
                z2 = true;
                i4 = currentGroup;
            } else {
                androidx.compose.runtime.Stack.m5292pushimpl(this.getOutputStallDurationlomOqCM, camera2StreamConfigurationMap);
                androidx.compose.runtime.tooling.CompositionObserver current = this.coroutineBoundary.current();
                if (current != null) {
                    try {
                        current.onScopeEnter(camera2StreamConfigurationMap);
                        camera2StreamConfigurationMap.rereadTrackedInstances();
                    } finally {
                        current.onScopeExit(camera2StreamConfigurationMap);
                    }
                } else {
                    camera2StreamConfigurationMap.rereadTrackedInstances();
                }
                androidx.compose.runtime.Stack.m5291popimpl(this.getOutputStallDurationlomOqCM);
            }
            highSpeedVideoSizes = androidx.compose.runtime.ComposerImplKt.getHighSpeedVideoSizes((java.util.List<androidx.compose.runtime.Invalidation>) this.getOutputSizes, this.reader.getCurrentGroup(), groupSize);
        }
        if (z2) {
            Camera2StreamConfigurationMap(i4, parent, parent);
            this.reader.skipToGroupEnd();
            int highSpeedVideoSizesFor = getHighSpeedVideoSizesFor(parent);
            this.isOutputSupportedFor = i + highSpeedVideoSizesFor;
            this.getOutputSizeshNQ4ISI = i2 + highSpeedVideoSizesFor;
            this._CREATION = i3;
        } else {
            isOutputSupportedFor();
        }
        this.compositeKeyHashCode = compositeKeyHashCode;
        this.isComposing = z;
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(int i, int i2) {
        int highSpeedVideoSizesFor = getHighSpeedVideoSizesFor(i);
        if (highSpeedVideoSizesFor != i2) {
            int m5285getSizeimpl = androidx.compose.runtime.Stack.m5285getSizeimpl(this.coroutineCreation) - 1;
            while (i != -1) {
                int highSpeedVideoSizesFor2 = getHighSpeedVideoSizesFor(i) + (i2 - highSpeedVideoSizesFor);
                getHighSpeedVideoFpsRanges(i, highSpeedVideoSizesFor2);
                int i3 = m5285getSizeimpl;
                while (true) {
                    if (i3 >= 0) {
                        androidx.compose.runtime.Pending pending = (androidx.compose.runtime.Pending) androidx.compose.runtime.Stack.m5290peekimpl(this.coroutineCreation, i3);
                        if (pending != null && pending.getHighResolutionOutputSizeshNQ4ISI(i, highSpeedVideoSizesFor2)) {
                            m5285getSizeimpl = i3 - 1;
                            break;
                        }
                        i3--;
                    } else {
                        break;
                    }
                }
                if (i < 0) {
                    i = this.reader.getParent();
                } else if (this.reader.isNode(i)) {
                    return;
                } else {
                    i = this.reader.parent(i);
                }
            }
        }
    }

    private final int getHighSpeedVideoFpsRangesFor(int i, int i2, int i3, int i4) {
        int parent = this.reader.parent(i2);
        while (parent != i3 && !this.reader.isNode(parent)) {
            parent = this.reader.parent(parent);
        }
        if (this.reader.isNode(parent)) {
            i4 = 0;
        }
        if (parent == i2) {
            return i4;
        }
        int highSpeedVideoSizesFor = getHighSpeedVideoSizesFor(parent);
        int nodeCount = this.reader.nodeCount(i2);
        int i5 = i4;
        loop1: while (i5 < (highSpeedVideoSizesFor - nodeCount) + i4 && parent != i) {
            parent++;
            while (parent < i) {
                int groupSize = this.reader.groupSize(parent) + parent;
                if (i >= groupSize) {
                    i5 += this.reader.isNode(parent) ? 1 : getHighSpeedVideoSizesFor(parent);
                    parent = groupSize;
                }
            }
        }
        return i5;
    }

    private final int getHighSpeedVideoFpsRanges(int i) {
        int parent = this.reader.parent(i) + 1;
        int i2 = 0;
        while (parent < i) {
            if (!this.reader.hasObjectKey(parent)) {
                i2++;
            }
            parent += this.reader.groupSize(parent);
        }
        return i2;
    }

    private final int getHighSpeedVideoSizesFor(int i) {
        int i2;
        if (i < 0) {
            androidx.collection.MutableIntIntMap mutableIntIntMap = this.unwrapAs;
            if (mutableIntIntMap == null || !mutableIntIntMap.containsKey(i)) {
                return 0;
            }
            return mutableIntIntMap.get(i);
        }
        int[] iArr = this.getValidOutputFormatsForInputhNQ4ISI;
        return (iArr == null || (i2 = iArr[i]) < 0) ? this.reader.nodeCount(i) : i2;
    }

    private final void getHighSpeedVideoFpsRanges(int i, int i2) {
        if (getHighSpeedVideoSizesFor(i) != i2) {
            if (i < 0) {
                androidx.collection.MutableIntIntMap mutableIntIntMap = this.unwrapAs;
                if (mutableIntIntMap == null) {
                    mutableIntIntMap = new androidx.collection.MutableIntIntMap(0, 1, null);
                    this.unwrapAs = mutableIntIntMap;
                }
                mutableIntIntMap.set(i, i2);
                return;
            }
            int[] iArr = this.getValidOutputFormatsForInputhNQ4ISI;
            if (iArr == null) {
                iArr = new int[this.reader.getGetHighSpeedVideoFpsRanges()];
                kotlin.collections.ArraysKt.fill$default(iArr, -1, 0, 0, 6, (java.lang.Object) null);
                this.getValidOutputFormatsForInputhNQ4ISI = iArr;
            }
            iArr[i] = i2;
        }
    }

    private final void Camera2StreamConfigurationMap() {
        this.getValidOutputFormatsForInputhNQ4ISI = null;
        this.unwrapAs = null;
    }

    private final void Camera2StreamConfigurationMap(int i, int i2, int i3) {
        int highSpeedVideoFpsRangesFor;
        androidx.compose.runtime.SlotReader slotReader = this.reader;
        highSpeedVideoFpsRangesFor = androidx.compose.runtime.ComposerImplKt.getHighSpeedVideoFpsRangesFor(slotReader, i, i2, i3);
        while (i > 0 && i != highSpeedVideoFpsRangesFor) {
            if (slotReader.isNode(i)) {
                this.Camera2StreamConfigurationMap.moveUp();
            }
            i = slotReader.parent(i);
        }
        Camera2StreamConfigurationMap(i2, highSpeedVideoFpsRangesFor);
    }

    private final void Camera2StreamConfigurationMap(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        Camera2StreamConfigurationMap(this.reader.parent(i), i2);
        if (this.reader.isNode(i)) {
            this.Camera2StreamConfigurationMap.moveDown(getHighSpeedVideoFpsRangesFor(this.reader, i));
        }
    }

    private static int getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.SlotReader slotReader, int i) {
        java.lang.Object groupAux;
        if (slotReader.hasObjectKey(i)) {
            java.lang.Object groupObjectKey = slotReader.groupObjectKey(i);
            if (groupObjectKey != null) {
                return groupObjectKey instanceof java.lang.Enum ? ((java.lang.Enum) groupObjectKey).ordinal() : groupObjectKey instanceof androidx.compose.runtime.MovableContent ? androidx.compose.runtime.MovableContentKt.movableContentKey : groupObjectKey.hashCode();
            }
            return 0;
        }
        int groupKey = slotReader.groupKey(i);
        return (groupKey != 207 || (groupAux = slotReader.groupAux(i)) == null || kotlin.jvm.internal.Intrinsics.areEqual(groupAux, androidx.compose.runtime.Composer.INSTANCE.getEmpty())) ? groupKey : groupAux.hashCode();
    }

    public final boolean tryImminentInvalidation$runtime(androidx.compose.runtime.RecomposeScopeImpl scope, java.lang.Object instance) {
        androidx.compose.runtime.Anchor anchor = scope.getAnchor();
        if (anchor == null) {
            return false;
        }
        int indexFor = anchor.toIndexFor(this.reader.getTable());
        if (!this.isComposing || indexFor < this.reader.getCurrentGroup()) {
            return false;
        }
        androidx.compose.runtime.ComposerImplKt.getHighSpeedVideoFpsRanges(this.getOutputSizes, indexFor, scope, instance);
        return true;
    }

    public final int parentKey$runtime() {
        if (getInserting()) {
            androidx.compose.runtime.SlotWriter slotWriter = this.startTransaction;
            return slotWriter.groupKey(slotWriter.getParent());
        }
        androidx.compose.runtime.SlotReader slotReader = this.reader;
        return slotReader.groupKey(slotReader.getParent());
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public final void skipCurrentGroup() {
        long rotateLeft;
        long j;
        if (this.getOutputSizes.isEmpty()) {
            isOutputSupportedForhNQ4ISI();
            return;
        }
        androidx.compose.runtime.SlotReader slotReader = this.reader;
        int groupKey = slotReader.getGroupKey();
        java.lang.Object groupObjectKey = slotReader.getGroupObjectKey();
        java.lang.Object groupAux = slotReader.getGroupAux();
        int i = this._CREATION;
        if (groupObjectKey == null) {
            rotateLeft = java.lang.Long.rotateLeft((groupAux == null || groupKey != 207 || kotlin.jvm.internal.Intrinsics.areEqual(groupAux, androidx.compose.runtime.Composer.INSTANCE.getEmpty())) ? java.lang.Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ groupKey : java.lang.Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ groupAux.hashCode(), 3);
            j = i;
        } else {
            rotateLeft = java.lang.Long.rotateLeft(java.lang.Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ (groupObjectKey instanceof java.lang.Enum ? ((java.lang.Enum) groupObjectKey).ordinal() : groupObjectKey.hashCode()), 3);
            j = 0;
        }
        this.compositeKeyHashCode = rotateLeft ^ j;
        getHighResolutionOutputSizeshNQ4ISI(slotReader.isNode(), (java.lang.Object) null);
        getOutputSizes();
        slotReader.endGroup();
        if (groupObjectKey != null) {
            if (groupObjectKey instanceof java.lang.Enum) {
                this.compositeKeyHashCode = java.lang.Long.rotateRight(java.lang.Long.rotateRight(getCompositeKeyHashCode(), 3) ^ ((java.lang.Enum) groupObjectKey).ordinal(), 3);
                return;
            } else {
                this.compositeKeyHashCode = java.lang.Long.rotateRight(java.lang.Long.rotateRight(getCompositeKeyHashCode(), 3) ^ groupObjectKey.hashCode(), 3);
                return;
            }
        }
        if (groupAux == null || groupKey != 207 || kotlin.jvm.internal.Intrinsics.areEqual(groupAux, androidx.compose.runtime.Composer.INSTANCE.getEmpty())) {
            this.compositeKeyHashCode = java.lang.Long.rotateRight(groupKey ^ java.lang.Long.rotateRight(getCompositeKeyHashCode() ^ i, 3), 3);
        } else {
            this.compositeKeyHashCode = java.lang.Long.rotateRight(java.lang.Long.rotateRight(getCompositeKeyHashCode() ^ i, 3) ^ groupAux.hashCode(), 3);
        }
    }

    private final void isOutputSupportedFor() {
        this.getOutputSizeshNQ4ISI = this.reader.getParentNodes();
        this.reader.skipToGroupEnd();
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public final boolean shouldExecute(boolean parametersChanged, int flags) {
        androidx.compose.runtime.RecomposeScopeImpl currentRecomposeScope$runtime;
        if ((flags & 1) != 0 || (!getInserting() && !this.init)) {
            return parametersChanged || !getSkipping();
        }
        androidx.compose.runtime.ShouldPauseCallback shouldPauseCallback = this.c;
        if (shouldPauseCallback == null || (currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime()) == null || !shouldPauseCallback.shouldPause() || currentRecomposeScope$runtime.getResuming()) {
            return true;
        }
        currentRecomposeScope$runtime.setUsed(true);
        currentRecomposeScope$runtime.setReusing(this.init);
        currentRecomposeScope$runtime.setPaused(true);
        this.Camera2StreamConfigurationMap.rememberPausingScope(currentRecomposeScope$runtime);
        this.ArtificialStackFrames.reportPausedScope$runtime(currentRecomposeScope$runtime);
        return false;
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public final void skipToGroupEnd() {
        if (this.getOutputSizeshNQ4ISI != 0) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (getInserting()) {
            return;
        }
        androidx.compose.runtime.RecomposeScopeImpl currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime();
        if (currentRecomposeScope$runtime != null) {
            currentRecomposeScope$runtime.scopeSkipped();
        }
        if (this.getOutputSizes.isEmpty()) {
            isOutputSupportedFor();
        } else {
            getOutputSizes();
        }
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public final void deactivateToEndGroup(boolean changed) {
        if (this.getOutputSizeshNQ4ISI != 0) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("No nodes can be emitted before calling deactivateToEndGroup");
        }
        if (getInserting()) {
            return;
        }
        if (!changed) {
            isOutputSupportedFor();
            return;
        }
        int currentGroup = this.reader.getCurrentGroup();
        int currentEnd = this.reader.getCurrentEnd();
        this.Camera2StreamConfigurationMap.deactivateCurrentGroup();
        androidx.compose.runtime.ComposerImplKt.getHighResolutionOutputSizeshNQ4ISI((java.util.List<androidx.compose.runtime.Invalidation>) this.getOutputSizes, currentGroup, currentEnd);
        this.reader.skipToGroupEnd();
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public final androidx.compose.runtime.Composer startRestartGroup(int key) {
        startReplaceGroup(key);
        getHighResolutionOutputSizeshNQ4ISI();
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void getHighResolutionOutputSizeshNQ4ISI() {
        androidx.compose.runtime.Invalidation highSpeedVideoFpsRangesFor;
        androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl;
        boolean z;
        if (!getInserting()) {
            highSpeedVideoFpsRangesFor = androidx.compose.runtime.ComposerImplKt.getHighSpeedVideoFpsRangesFor(this.getOutputSizes, this.reader.getParent());
            java.lang.Object next = this.reader.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(next, androidx.compose.runtime.Composer.INSTANCE.getEmpty())) {
                androidx.compose.runtime.CompositionImpl composition = getComposition();
                kotlin.jvm.internal.Intrinsics.checkNotNull(composition, "");
                recomposeScopeImpl = new androidx.compose.runtime.RecomposeScopeImpl(composition);
                updateValue(recomposeScopeImpl);
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNull(next, "");
                recomposeScopeImpl = (androidx.compose.runtime.RecomposeScopeImpl) next;
            }
            if (highSpeedVideoFpsRangesFor == null) {
                boolean forcedRecompose = recomposeScopeImpl.getForcedRecompose();
                if (forcedRecompose) {
                    recomposeScopeImpl.setForcedRecompose(false);
                }
                if (!forcedRecompose) {
                    z = false;
                    recomposeScopeImpl.setRequiresRecompose(z);
                    androidx.compose.runtime.Stack.m5292pushimpl(this.getOutputStallDurationlomOqCM, recomposeScopeImpl);
                    getHighResolutionOutputSizeshNQ4ISI(recomposeScopeImpl);
                    if (recomposeScopeImpl.getPaused()) {
                        return;
                    }
                    recomposeScopeImpl.setPaused(false);
                    recomposeScopeImpl.setResuming(true);
                    this.Camera2StreamConfigurationMap.startResumingScope(recomposeScopeImpl);
                    if (this.init || !recomposeScopeImpl.getReusing()) {
                        return;
                    }
                    this.init = true;
                    this.d = this.reader.getParent();
                    recomposeScopeImpl.setResetReusing(true);
                    return;
                }
            }
            z = true;
            recomposeScopeImpl.setRequiresRecompose(z);
            androidx.compose.runtime.Stack.m5292pushimpl(this.getOutputStallDurationlomOqCM, recomposeScopeImpl);
            getHighResolutionOutputSizeshNQ4ISI(recomposeScopeImpl);
            if (recomposeScopeImpl.getPaused()) {
            }
        } else {
            androidx.compose.runtime.CompositionImpl composition2 = getComposition();
            kotlin.jvm.internal.Intrinsics.checkNotNull(composition2, "");
            androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl2 = new androidx.compose.runtime.RecomposeScopeImpl(composition2);
            androidx.compose.runtime.Stack.m5292pushimpl(this.getOutputStallDurationlomOqCM, recomposeScopeImpl2);
            updateValue(recomposeScopeImpl2);
            getHighResolutionOutputSizeshNQ4ISI(recomposeScopeImpl2);
        }
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl) {
        recomposeScopeImpl.start(this.getInputSizeshNQ4ISI);
        androidx.compose.runtime.tooling.CompositionObserver current = this.coroutineBoundary.current();
        if (current != null) {
            current.onScopeEnter(recomposeScopeImpl);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public final androidx.compose.runtime.ScopeUpdateScope endRestartGroup() {
        androidx.compose.runtime.Anchor anchor;
        androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl = null;
        androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl2 = androidx.compose.runtime.Stack.m5288isNotEmptyimpl(this.getOutputStallDurationlomOqCM) ? (androidx.compose.runtime.RecomposeScopeImpl) androidx.compose.runtime.Stack.m5291popimpl(this.getOutputStallDurationlomOqCM) : null;
        if (recomposeScopeImpl2 != null) {
            recomposeScopeImpl2.setRequiresRecompose(false);
            kotlin.jvm.functions.Function1<androidx.compose.runtime.Composition, kotlin.Unit> Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(recomposeScopeImpl2);
            if (Camera2StreamConfigurationMap != null) {
                this.Camera2StreamConfigurationMap.endCompositionScope(Camera2StreamConfigurationMap, getComposition());
            }
            if (recomposeScopeImpl2.getResuming()) {
                recomposeScopeImpl2.setResuming(false);
                this.Camera2StreamConfigurationMap.endResumingScope(recomposeScopeImpl2);
                recomposeScopeImpl2.setReusing(false);
                if (recomposeScopeImpl2.getResetReusing()) {
                    recomposeScopeImpl2.setResetReusing(false);
                    if (this.d == this.reader.getParent()) {
                        this.init = false;
                        this.d = -1;
                    }
                }
            }
        }
        if (recomposeScopeImpl2 != null && !recomposeScopeImpl2.getSkipped$runtime() && (recomposeScopeImpl2.getUsed() || this.getOutputFormats)) {
            if (recomposeScopeImpl2.getAnchor() == null) {
                if (getInserting()) {
                    androidx.compose.runtime.SlotWriter slotWriter = this.startTransaction;
                    anchor = slotWriter.anchor(slotWriter.getParent());
                } else {
                    androidx.compose.runtime.SlotReader slotReader = this.reader;
                    anchor = slotReader.anchor(slotReader.getParent());
                }
                recomposeScopeImpl2.setAnchor(anchor);
            }
            recomposeScopeImpl2.setDefaultsInvalid(false);
            recomposeScopeImpl = recomposeScopeImpl2;
        }
        getHighSpeedVideoFpsRangesFor(false);
        return recomposeScopeImpl;
    }

    private final kotlin.jvm.functions.Function1<androidx.compose.runtime.Composition, kotlin.Unit> Camera2StreamConfigurationMap(androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl) {
        androidx.compose.runtime.tooling.CompositionObserver current = this.coroutineBoundary.current();
        if (current != null) {
            current.onScopeExit(recomposeScopeImpl);
        }
        return recomposeScopeImpl.end(this.getInputSizeshNQ4ISI);
    }

    @Override // androidx.compose.runtime.Composer
    public final void insertMovableContent(androidx.compose.runtime.MovableContent<?> value, java.lang.Object parameter) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(value, "");
        getHighSpeedVideoFpsRangesFor((androidx.compose.runtime.MovableContent<java.lang.Object>) value, getInputFormats(), parameter, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        getHighResolutionOutputSizeshNQ4ISI(r17);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void getHighSpeedVideoFpsRangesFor(final androidx.compose.runtime.MovableContent<java.lang.Object> movableContent, androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap, final java.lang.Object obj, boolean z) {
        startMovableGroup(androidx.compose.runtime.MovableContentKt.movableContentKey, movableContent);
        getHighResolutionOutputSizeshNQ4ISI(obj);
        long compositeKeyHashCode = getCompositeKeyHashCode();
        try {
            this.compositeKeyHashCode = 126665345L;
            boolean z2 = false;
            if (getInserting()) {
                androidx.compose.runtime.SlotWriter.markGroup$default(this.startTransaction, 0, 1, null);
            }
            if (!getInserting() && !kotlin.jvm.internal.Intrinsics.areEqual(this.reader.getGroupAux(), persistentCompositionLocalMap)) {
                z2 = true;
            }
            getHighSpeedVideoFpsRanges(202, androidx.compose.runtime.ComposerKt.getCompositionLocalMap(), androidx.compose.runtime.GroupKind.INSTANCE.m5243getGroupULZAiWs(), persistentCompositionLocalMap);
            this.b = null;
            if (getInserting() && !z && (!androidx.compose.runtime.ComposeRuntimeFlags.isMovableContentUsageTrackingEnabled || movableContent.getUsed())) {
                this.release = true;
                androidx.compose.runtime.SlotWriter slotWriter = this.startTransaction;
                this.ArtificialStackFrames.insertMovableContent$runtime(new androidx.compose.runtime.MovableContentStateReference(movableContent, obj, getComposition(), this.insertTable, slotWriter.anchor(slotWriter.parent(slotWriter.getParent())), kotlin.collections.CollectionsKt.emptyList(), getInputFormats(), null));
            } else {
                boolean z3 = this.f2681a;
                this.f2681a = z2;
                movableContent.setUsed$runtime(true);
                androidx.compose.runtime.internal.Expect_jvmKt.invokeComposable(this, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1436390959, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.runtime.ComposerImpl$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                        highResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.ComposerImpl.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.MovableContent.this, obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                        return highResolutionOutputSizeshNQ4ISI;
                    }
                }));
                this.f2681a = z3;
            }
        } catch (java.lang.Throwable th) {
            try {
                throw androidx.compose.runtime.tooling.ComposeStackTraceKt.attachComposeStackTrace(th, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.runtime.ComposerImpl$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        androidx.compose.runtime.tooling.ComposeStackTrace highSpeedVideoFpsRanges;
                        highSpeedVideoFpsRanges = androidx.compose.runtime.ComposerImpl.getHighSpeedVideoFpsRanges(androidx.compose.runtime.ComposerImpl.this);
                        return highSpeedVideoFpsRanges;
                    }
                });
            } finally {
                getInputSizeshNQ4ISI();
                this.b = null;
                this.compositeKeyHashCode = compositeKeyHashCode;
                endMovableGroup();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.MovableContent movableContent, java.lang.Object obj, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1436390959, i, -1, "androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.<anonymous> (ComposerImpl.kt:2283)");
            }
            movableContent.getContent().invoke(obj, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.tooling.ComposeStackTrace getHighSpeedVideoFpsRanges(androidx.compose.runtime.ComposerImpl composerImpl) {
        return composerImpl.getHighSpeedVideoSizesFor();
    }

    @Override // androidx.compose.runtime.Composer
    public final void insertMovableContentReferences(java.util.List<kotlin.Pair<androidx.compose.runtime.MovableContentStateReference, androidx.compose.runtime.MovableContentStateReference>> references) {
        try {
            getHighResolutionOutputSizeshNQ4ISI(references);
            getHighSpeedVideoFpsRangesFor();
        } catch (java.lang.Throwable th) {
            getHighSpeedVideoFpsRanges();
            throw th;
        }
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(java.util.List<kotlin.Pair<androidx.compose.runtime.MovableContentStateReference, androidx.compose.runtime.MovableContentStateReference>> list) {
        androidx.compose.runtime.changelist.ComposerChangeListWriter composerChangeListWriter;
        androidx.compose.runtime.changelist.ChangeList changeList;
        androidx.compose.runtime.changelist.ComposerChangeListWriter composerChangeListWriter2;
        androidx.compose.runtime.changelist.ChangeList changeList2;
        androidx.compose.runtime.SlotTable slotTable;
        androidx.compose.runtime.Anchor anchor;
        java.util.List<? extends java.lang.Object> Camera2StreamConfigurationMap;
        androidx.compose.runtime.SlotReader slotReader;
        androidx.collection.MutableIntObjectMap<androidx.compose.runtime.PersistentCompositionLocalMap> mutableIntObjectMap;
        int[] iArr;
        androidx.compose.runtime.changelist.ChangeList changeList3;
        androidx.compose.runtime.changelist.ComposerChangeListWriter composerChangeListWriter3;
        int i;
        androidx.compose.runtime.changelist.ComposerChangeListWriter composerChangeListWriter4;
        int i2;
        androidx.compose.runtime.SlotTable slotTable2;
        java.util.List<kotlin.Pair<androidx.compose.runtime.MovableContentStateReference, androidx.compose.runtime.MovableContentStateReference>> list2 = list;
        androidx.compose.runtime.changelist.ComposerChangeListWriter composerChangeListWriter5 = this.Camera2StreamConfigurationMap;
        androidx.compose.runtime.changelist.ChangeList changeList4 = this.isOutputSupportedForhNQ4ISI;
        androidx.compose.runtime.changelist.ChangeList changeList5 = composerChangeListWriter5.getChangeList();
        try {
            composerChangeListWriter5.setChangeList(changeList4);
            this.Camera2StreamConfigurationMap.resetSlots();
            int size = list2.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size) {
                try {
                    kotlin.Pair<androidx.compose.runtime.MovableContentStateReference, androidx.compose.runtime.MovableContentStateReference> pair = list2.get(i4);
                    final androidx.compose.runtime.MovableContentStateReference component1 = pair.component1();
                    androidx.compose.runtime.MovableContentStateReference component2 = pair.component2();
                    androidx.compose.runtime.Anchor anchor2 = component1.getAnchor();
                    int anchorIndex = component1.getSlotTable().anchorIndex(anchor2);
                    androidx.compose.runtime.internal.IntRef intRef = new androidx.compose.runtime.internal.IntRef(i3, 1, null);
                    this.Camera2StreamConfigurationMap.determineMovableContentNodeIndex(intRef, anchor2);
                    if (component2 == null) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(component1.getSlotTable(), this.insertTable)) {
                            getHighSpeedVideoSizes();
                        }
                        final androidx.compose.runtime.SlotReader openReader = component1.getSlotTable().openReader();
                        try {
                            openReader.reposition(anchorIndex);
                            this.Camera2StreamConfigurationMap.moveReaderToAbsolute(anchorIndex);
                            final androidx.compose.runtime.changelist.ChangeList changeList6 = new androidx.compose.runtime.changelist.ChangeList();
                            getHighSpeedVideoFpsRanges(this, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.runtime.ComposerImpl$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit highSpeedVideoFpsRangesFor;
                                    highSpeedVideoFpsRangesFor = androidx.compose.runtime.ComposerImpl.getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.ComposerImpl.this, changeList6, openReader, component1);
                                    return highSpeedVideoFpsRangesFor;
                                }
                            });
                            this.Camera2StreamConfigurationMap.includeOperationsIn(changeList6, intRef);
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            openReader.close();
                            composerChangeListWriter2 = composerChangeListWriter5;
                            changeList2 = changeList5;
                            i = size;
                            i2 = i4;
                        } finally {
                        }
                    } else {
                        androidx.compose.runtime.MovableContentState movableContentStateResolve$runtime = this.ArtificialStackFrames.movableContentStateResolve$runtime(component2);
                        if (movableContentStateResolve$runtime == null || (slotTable = movableContentStateResolve$runtime.getSlotTable()) == null) {
                            slotTable = component2.getSlotTable();
                        }
                        if (movableContentStateResolve$runtime == null || (slotTable2 = movableContentStateResolve$runtime.getSlotTable()) == null || (anchor = slotTable2.anchor(i3)) == null) {
                            anchor = component2.getAnchor();
                        }
                        Camera2StreamConfigurationMap = androidx.compose.runtime.ComposerImplKt.Camera2StreamConfigurationMap(slotTable, anchor);
                        if (!Camera2StreamConfigurationMap.isEmpty()) {
                            this.Camera2StreamConfigurationMap.copyNodesToNewAnchorLocation(Camera2StreamConfigurationMap, intRef);
                            if (kotlin.jvm.internal.Intrinsics.areEqual(component1.getSlotTable(), this.kernelVersion)) {
                                int anchorIndex2 = this.kernelVersion.anchorIndex(anchor2);
                                getHighSpeedVideoFpsRanges(anchorIndex2, getHighSpeedVideoSizesFor(anchorIndex2) + Camera2StreamConfigurationMap.size());
                            }
                        }
                        this.Camera2StreamConfigurationMap.copySlotTableToAnchorLocation(movableContentStateResolve$runtime, this.ArtificialStackFrames, component2, component1);
                        androidx.compose.runtime.SlotReader openReader2 = slotTable.openReader();
                        try {
                            androidx.compose.runtime.SlotReader slotReader2 = this.reader;
                            int[] iArr2 = this.getValidOutputFormatsForInputhNQ4ISI;
                            androidx.collection.MutableIntObjectMap<androidx.compose.runtime.PersistentCompositionLocalMap> mutableIntObjectMap2 = this._BOUNDARY;
                            this.getValidOutputFormatsForInputhNQ4ISI = null;
                            this._BOUNDARY = null;
                            try {
                                this.reader = openReader2;
                                int anchorIndex3 = slotTable.anchorIndex(anchor);
                                openReader2.reposition(anchorIndex3);
                                this.Camera2StreamConfigurationMap.moveReaderToAbsolute(anchorIndex3);
                                androidx.compose.runtime.changelist.ChangeList changeList7 = new androidx.compose.runtime.changelist.ChangeList();
                                androidx.compose.runtime.changelist.ComposerChangeListWriter composerChangeListWriter6 = this.Camera2StreamConfigurationMap;
                                androidx.compose.runtime.changelist.ChangeList changeList8 = composerChangeListWriter6.getChangeList();
                                try {
                                    composerChangeListWriter6.setChangeList(changeList7);
                                    i = size;
                                    composerChangeListWriter4 = this.Camera2StreamConfigurationMap;
                                    composerChangeListWriter2 = composerChangeListWriter5;
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    mutableIntObjectMap = mutableIntObjectMap2;
                                    iArr = iArr2;
                                }
                                try {
                                    boolean implicitRootStart = composerChangeListWriter4.getImplicitRootStart();
                                    try {
                                        composerChangeListWriter4.setImplicitRootStart(false);
                                        androidx.compose.runtime.ControlledComposition composition = component2.getComposition();
                                        androidx.compose.runtime.ControlledComposition composition2 = component1.getComposition();
                                        int currentGroup = openReader2.getCurrentGroup();
                                        changeList2 = changeList5;
                                        changeList3 = changeList8;
                                        i2 = i4;
                                        slotReader = openReader2;
                                        composerChangeListWriter3 = composerChangeListWriter6;
                                        iArr = iArr2;
                                        try {
                                            getHighSpeedVideoFpsRangesFor(composition, composition2, java.lang.Integer.valueOf(currentGroup), component2.getInvalidations$runtime(), new kotlin.jvm.functions.Function0() { // from class: androidx.compose.runtime.ComposerImpl$$ExternalSyntheticLambda3
                                                @Override // kotlin.jvm.functions.Function0
                                                public final java.lang.Object invoke() {
                                                    kotlin.Unit highSpeedVideoFpsRangesFor;
                                                    highSpeedVideoFpsRangesFor = androidx.compose.runtime.ComposerImpl.getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.ComposerImpl.this, component1);
                                                    return highSpeedVideoFpsRangesFor;
                                                }
                                            });
                                            try {
                                                composerChangeListWriter4.setImplicitRootStart(implicitRootStart);
                                                try {
                                                    composerChangeListWriter3.setChangeList(changeList3);
                                                    this.Camera2StreamConfigurationMap.includeOperationsIn(changeList7, intRef);
                                                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                                    try {
                                                        this.reader = slotReader2;
                                                        this.getValidOutputFormatsForInputhNQ4ISI = iArr;
                                                        this._BOUNDARY = mutableIntObjectMap2;
                                                        kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                                                        try {
                                                            slotReader.close();
                                                        } catch (java.lang.Throwable th2) {
                                                            th = th2;
                                                            composerChangeListWriter = composerChangeListWriter2;
                                                            changeList = changeList2;
                                                            composerChangeListWriter.setChangeList(changeList);
                                                            throw th;
                                                        }
                                                    } catch (java.lang.Throwable th3) {
                                                        th = th3;
                                                        slotReader.close();
                                                        throw th;
                                                    }
                                                } catch (java.lang.Throwable th4) {
                                                    th = th4;
                                                    mutableIntObjectMap = mutableIntObjectMap2;
                                                    this.reader = slotReader2;
                                                    this.getValidOutputFormatsForInputhNQ4ISI = iArr;
                                                    this._BOUNDARY = mutableIntObjectMap;
                                                    throw th;
                                                }
                                            } catch (java.lang.Throwable th5) {
                                                th = th5;
                                                mutableIntObjectMap = mutableIntObjectMap2;
                                                try {
                                                    composerChangeListWriter3.setChangeList(changeList3);
                                                    throw th;
                                                } catch (java.lang.Throwable th6) {
                                                    th = th6;
                                                    this.reader = slotReader2;
                                                    this.getValidOutputFormatsForInputhNQ4ISI = iArr;
                                                    this._BOUNDARY = mutableIntObjectMap;
                                                    throw th;
                                                }
                                            }
                                        } catch (java.lang.Throwable th7) {
                                            th = th7;
                                            mutableIntObjectMap = mutableIntObjectMap2;
                                            try {
                                                composerChangeListWriter4.setImplicitRootStart(implicitRootStart);
                                                throw th;
                                            } catch (java.lang.Throwable th8) {
                                                th = th8;
                                                composerChangeListWriter3.setChangeList(changeList3);
                                                throw th;
                                            }
                                        }
                                    } catch (java.lang.Throwable th9) {
                                        th = th9;
                                        mutableIntObjectMap = mutableIntObjectMap2;
                                        iArr = iArr2;
                                        slotReader = openReader2;
                                        changeList3 = changeList8;
                                        composerChangeListWriter3 = composerChangeListWriter6;
                                    }
                                } catch (java.lang.Throwable th10) {
                                    th = th10;
                                    mutableIntObjectMap = mutableIntObjectMap2;
                                    iArr = iArr2;
                                    slotReader = openReader2;
                                    changeList3 = changeList8;
                                    composerChangeListWriter3 = composerChangeListWriter6;
                                    composerChangeListWriter3.setChangeList(changeList3);
                                    throw th;
                                }
                            } catch (java.lang.Throwable th11) {
                                th = th11;
                                mutableIntObjectMap = mutableIntObjectMap2;
                                iArr = iArr2;
                                slotReader = openReader2;
                            }
                        } catch (java.lang.Throwable th12) {
                            th = th12;
                            slotReader = openReader2;
                        }
                    }
                    this.Camera2StreamConfigurationMap.skipToEndOfCurrentGroup();
                    i4 = i2 + 1;
                    list2 = list;
                    size = i;
                    composerChangeListWriter5 = composerChangeListWriter2;
                    changeList5 = changeList2;
                    i3 = 0;
                } catch (java.lang.Throwable th13) {
                    th = th13;
                    composerChangeListWriter2 = composerChangeListWriter5;
                    changeList2 = changeList5;
                }
            }
            androidx.compose.runtime.changelist.ComposerChangeListWriter composerChangeListWriter7 = composerChangeListWriter5;
            androidx.compose.runtime.changelist.ChangeList changeList9 = changeList5;
            this.Camera2StreamConfigurationMap.endMovableContentPlacement();
            this.Camera2StreamConfigurationMap.moveReaderToAbsolute(0);
            composerChangeListWriter7.setChangeList(changeList9);
        } catch (java.lang.Throwable th14) {
            th = th14;
            composerChangeListWriter = composerChangeListWriter5;
            changeList = changeList5;
            composerChangeListWriter.setChangeList(changeList);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.ComposerImpl composerImpl, androidx.compose.runtime.changelist.ChangeList changeList, androidx.compose.runtime.SlotReader slotReader, androidx.compose.runtime.MovableContentStateReference movableContentStateReference) {
        androidx.compose.runtime.changelist.ComposerChangeListWriter composerChangeListWriter = composerImpl.Camera2StreamConfigurationMap;
        androidx.compose.runtime.changelist.ChangeList changeList2 = composerChangeListWriter.getChangeList();
        try {
            composerChangeListWriter.setChangeList(changeList);
            androidx.compose.runtime.SlotReader slotReader2 = composerImpl.reader;
            int[] iArr = composerImpl.getValidOutputFormatsForInputhNQ4ISI;
            androidx.collection.MutableIntObjectMap<androidx.compose.runtime.PersistentCompositionLocalMap> mutableIntObjectMap = composerImpl._BOUNDARY;
            composerImpl.getValidOutputFormatsForInputhNQ4ISI = null;
            composerImpl._BOUNDARY = null;
            try {
                composerImpl.reader = slotReader;
                androidx.compose.runtime.changelist.ComposerChangeListWriter composerChangeListWriter2 = composerImpl.Camera2StreamConfigurationMap;
                boolean implicitRootStart = composerChangeListWriter2.getImplicitRootStart();
                try {
                    composerChangeListWriter2.setImplicitRootStart(false);
                    composerImpl.getHighSpeedVideoFpsRangesFor(movableContentStateReference.getContent$runtime(), movableContentStateReference.getLocals(), movableContentStateReference.getParameter(), true);
                    composerChangeListWriter2.setImplicitRootStart(implicitRootStart);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    composerChangeListWriter.setChangeList(changeList2);
                    return kotlin.Unit.INSTANCE;
                } catch (java.lang.Throwable th) {
                    composerChangeListWriter2.setImplicitRootStart(implicitRootStart);
                    throw th;
                }
            } finally {
                composerImpl.reader = slotReader2;
                composerImpl.getValidOutputFormatsForInputhNQ4ISI = iArr;
                composerImpl._BOUNDARY = mutableIntObjectMap;
            }
        } catch (java.lang.Throwable th2) {
            composerChangeListWriter.setChangeList(changeList2);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.ComposerImpl composerImpl, androidx.compose.runtime.MovableContentStateReference movableContentStateReference) {
        composerImpl.getHighSpeedVideoFpsRangesFor(movableContentStateReference.getContent$runtime(), movableContentStateReference.getLocals(), movableContentStateReference.getParameter(), true);
        return kotlin.Unit.INSTANCE;
    }

    private static /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges(androidx.compose.runtime.ComposerImpl composerImpl, kotlin.jvm.functions.Function0 function0) {
        return composerImpl.getHighSpeedVideoFpsRangesFor(null, null, null, kotlin.collections.CollectionsKt.emptyList(), function0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        if (r7 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final <R> R getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.ControlledComposition controlledComposition, androidx.compose.runtime.ControlledComposition controlledComposition2, java.lang.Integer num, java.util.List<? extends kotlin.Pair<androidx.compose.runtime.RecomposeScopeImpl, ? extends java.lang.Object>> list, kotlin.jvm.functions.Function0<? extends R> function0) {
        R invoke;
        boolean z = this.isComposing;
        int i = this.isOutputSupportedFor;
        try {
            this.isComposing = true;
            this.isOutputSupportedFor = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                kotlin.Pair<androidx.compose.runtime.RecomposeScopeImpl, ? extends java.lang.Object> pair = list.get(i2);
                androidx.compose.runtime.RecomposeScopeImpl component1 = pair.component1();
                java.lang.Object component2 = pair.component2();
                if (component2 != null) {
                    tryImminentInvalidation$runtime(component1, component2);
                } else {
                    tryImminentInvalidation$runtime(component1, null);
                }
            }
            if (controlledComposition != null) {
                invoke = (R) controlledComposition.delegateInvalidations(controlledComposition2, num != null ? num.intValue() : -1, function0);
            }
            invoke = function0.invoke();
            return invoke;
        } finally {
            this.isComposing = z;
            this.isOutputSupportedFor = i;
        }
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public final void sourceInformation(java.lang.String sourceInformation) {
        if (getInserting() && this.exchange) {
            this.startTransaction.recordGroupSourceInformation(sourceInformation);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public final void sourceInformationMarkerStart(int key, java.lang.String sourceInformation) {
        if (getInserting() && this.exchange) {
            this.startTransaction.recordGrouplessCallSourceInformationStart(key, sourceInformation);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    public final void sourceInformationMarkerEnd() {
        if (getInserting() && this.exchange) {
            this.startTransaction.recordGrouplessCallSourceInformationEnd();
        }
    }

    @Override // androidx.compose.runtime.Composer
    public final void disableSourceInformation() {
        this.exchange = false;
    }

    public final androidx.compose.runtime.tooling.ComposeStackTrace stackTraceForValue$runtime(final java.lang.Object value) {
        java.util.List emptyList;
        androidx.compose.runtime.tooling.ObjectLocation findLocation = androidx.compose.runtime.tooling.ComposeStackTraceBuilderKt.findLocation(this.kernelVersion, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.runtime.ComposerImpl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                boolean highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.ComposerImpl.getHighResolutionOutputSizeshNQ4ISI(value, obj);
                return java.lang.Boolean.valueOf(highResolutionOutputSizeshNQ4ISI);
            }
        });
        if (findLocation == null || (emptyList = kotlin.collections.CollectionsKt.plus((java.util.Collection) Camera2StreamConfigurationMap(findLocation.getGroup(), findLocation.getDataOffset()), (java.lang.Iterable) parentStackTrace())) == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        return new androidx.compose.runtime.tooling.ComposeStackTrace(emptyList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj, java.lang.Object obj2) {
        if (obj2 == obj) {
            return true;
        }
        androidx.compose.runtime.RememberObserverHolder rememberObserverHolder = obj2 instanceof androidx.compose.runtime.RememberObserverHolder ? (androidx.compose.runtime.RememberObserverHolder) obj2 : null;
        return (rememberObserverHolder != null ? rememberObserverHolder.getWrapped() : null) == obj;
    }

    private final androidx.compose.runtime.tooling.ComposeStackTrace getHighSpeedVideoSizesFor() {
        if (!this.ArtificialStackFrames.getStackTraceEnabled$runtime()) {
            return null;
        }
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        createListBuilder.addAll(androidx.compose.runtime.tooling.ComposeStackTraceBuilderKt.buildTrace$default(this.startTransaction, null, 0, null, 7, null));
        createListBuilder.addAll(androidx.compose.runtime.tooling.ComposeStackTraceBuilderKt.buildTrace(this.reader));
        createListBuilder.addAll(parentStackTrace());
        return new androidx.compose.runtime.tooling.ComposeStackTrace(kotlin.collections.CollectionsKt.build(createListBuilder));
    }

    private final java.util.List<androidx.compose.runtime.tooling.ComposeStackTraceFrame> Camera2StreamConfigurationMap(int i, java.lang.Integer num) {
        androidx.compose.runtime.SlotReader openReader = this.kernelVersion.openReader();
        try {
            return androidx.compose.runtime.tooling.ComposeStackTraceBuilderKt.traceForGroup(openReader, i, num);
        } finally {
            openReader.close();
        }
    }

    public final java.util.List<androidx.compose.runtime.tooling.ComposeStackTraceFrame> parentStackTrace() {
        androidx.compose.runtime.Composition composition$runtime = this.ArtificialStackFrames.getComposition$runtime();
        androidx.compose.runtime.CompositionImpl compositionImpl = composition$runtime instanceof androidx.compose.runtime.CompositionImpl ? (androidx.compose.runtime.CompositionImpl) composition$runtime : null;
        if (compositionImpl == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.lang.Integer findSubcompositionContextGroup = androidx.compose.runtime.tooling.ComposeStackTraceBuilderKt.findSubcompositionContextGroup(compositionImpl.getSlotTable(), this.ArtificialStackFrames);
        if (findSubcompositionContextGroup == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        androidx.compose.runtime.SlotReader openReader = compositionImpl.getSlotTable().openReader();
        try {
            java.util.List<androidx.compose.runtime.tooling.ComposeStackTraceFrame> traceForGroup = androidx.compose.runtime.tooling.ComposeStackTraceBuilderKt.traceForGroup(openReader, findSubcompositionContextGroup.intValue(), 0);
            openReader.close();
            return kotlin.collections.CollectionsKt.plus((java.util.Collection) traceForGroup, (java.lang.Iterable) compositionImpl.getComposer().parentStackTrace());
        } catch (java.lang.Throwable th) {
            openReader.close();
            throw th;
        }
    }

    /* renamed from: composeContent--ZbOJvo$runtime, reason: not valid java name */
    public final void m5237composeContentZbOJvo$runtime(androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> invalidationsRequested, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content, androidx.compose.runtime.ShouldPauseCallback shouldPause) {
        if (!this.getHighSpeedVideoFpsRanges.isEmpty()) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Expected applyChanges() to have been called");
        }
        this.c = shouldPause;
        try {
            getHighSpeedVideoFpsRangesFor(invalidationsRequested, content);
        } finally {
            this.c = null;
        }
    }

    public final void prepareCompose$runtime(kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        if (this.isComposing) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Preparing a composition while composing is not supported");
        }
        this.isComposing = true;
        try {
            block.invoke();
        } finally {
            this.isComposing = false;
        }
    }

    /* renamed from: recompose-aFTiNEg$runtime, reason: not valid java name */
    public final boolean m5238recomposeaFTiNEg$runtime(androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> invalidationsRequested, androidx.compose.runtime.ShouldPauseCallback shouldPause) {
        if (!this.getHighSpeedVideoFpsRanges.isEmpty()) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Expected applyChanges() to have been called");
        }
        if (androidx.compose.runtime.collection.ScopeMap.m5408getSizeimpl(invalidationsRequested) <= 0 && this.getOutputSizes.isEmpty() && !this.getInputFormats) {
            return false;
        }
        this.c = shouldPause;
        try {
            getHighSpeedVideoFpsRangesFor(invalidationsRequested, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null);
            this.c = null;
            return this.getHighSpeedVideoFpsRanges.isNotEmpty();
        } catch (java.lang.Throwable th) {
            this.c = null;
            throw th;
        }
    }

    /* renamed from: updateComposerInvalidations-RY85e9Y, reason: not valid java name */
    public final void m5239updateComposerInvalidationsRY85e9Y(androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> invalidationsRequested) {
        java.util.Comparator comparator;
        for (int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(this.getOutputSizes); lastIndex >= 0; lastIndex--) {
            androidx.compose.runtime.Invalidation invalidation = this.getOutputSizes.get(lastIndex);
            androidx.compose.runtime.Anchor anchor = invalidation.getCamera2StreamConfigurationMap().getAnchor();
            if (anchor != null && anchor.getValid()) {
                if (invalidation.getGetHighResolutionOutputSizeshNQ4ISI() != anchor.getLocation()) {
                    invalidation.getHighSpeedVideoSizes(anchor.getLocation());
                }
            } else {
                this.getOutputSizes.remove(lastIndex);
            }
        }
        androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> mutableScatterMap = invalidationsRequested;
        java.lang.Object[] objArr = mutableScatterMap.keys;
        java.lang.Object[] objArr2 = mutableScatterMap.values;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            java.lang.Object obj = objArr[i4];
                            java.lang.Object obj2 = objArr2[i4];
                            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                            androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl = (androidx.compose.runtime.RecomposeScopeImpl) obj;
                            androidx.compose.runtime.Anchor anchor2 = recomposeScopeImpl.getAnchor();
                            if (anchor2 != null) {
                                int location = anchor2.getLocation();
                                java.util.List<androidx.compose.runtime.Invalidation> list = this.getOutputSizes;
                                if (obj2 == androidx.compose.runtime.ScopeInvalidated.INSTANCE) {
                                    obj2 = null;
                                }
                                list.add(new androidx.compose.runtime.Invalidation(recomposeScopeImpl, location, obj2));
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
                } else {
                    i++;
                }
            }
        }
        java.util.List<androidx.compose.runtime.Invalidation> list2 = this.getOutputSizes;
        comparator = androidx.compose.runtime.ComposerImplKt.getHighSpeedVideoFpsRangesFor;
        kotlin.collections.CollectionsKt.sortWith(list2, comparator);
    }

    private final void getHighSpeedVideoFpsRangesFor(androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> mutableScatterMap, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2) {
        if (this.isComposing) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Reentrant composition is not supported");
        }
        androidx.compose.runtime.tooling.CompositionObserver current = this.coroutineBoundary.current();
        java.lang.Object beginSection = androidx.compose.runtime.internal.Trace.INSTANCE.beginSection("Compose:recompose");
        try {
            this.getInputSizeshNQ4ISI = java.lang.Long.hashCode(androidx.compose.runtime.snapshots.SnapshotKt.currentSnapshot().getSnapshotId());
            this._BOUNDARY = null;
            m5239updateComposerInvalidationsRY85e9Y(mutableScatterMap);
            this.isOutputSupportedFor = 0;
            this.isComposing = true;
            if (current != null) {
                current.onBeginComposition(getComposition());
            }
            try {
                getValidOutputFormatsForInputhNQ4ISI();
                java.lang.Object nextSlot = nextSlot();
                if (nextSlot != function2 && function2 != null) {
                    updateValue(function2);
                }
                androidx.compose.runtime.ComposerImpl$derivedStateObserver$1 composerImpl$derivedStateObserver$1 = this.getHighSpeedVideoSizesFor;
                androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.DerivedStateObserver> derivedStateObservers = androidx.compose.runtime.SnapshotStateKt.derivedStateObservers();
                try {
                    derivedStateObservers.add(composerImpl$derivedStateObserver$1);
                    if (function2 != null) {
                        getHighSpeedVideoFpsRangesFor(200, androidx.compose.runtime.ComposerKt.getInvocation());
                        androidx.compose.runtime.internal.Expect_jvmKt.invokeComposable(this, function2);
                        getInputSizeshNQ4ISI();
                    } else if ((this.getInputFormats || this.f2681a) && nextSlot != null && !kotlin.jvm.internal.Intrinsics.areEqual(nextSlot, androidx.compose.runtime.Composer.INSTANCE.getEmpty())) {
                        getHighSpeedVideoFpsRangesFor(200, androidx.compose.runtime.ComposerKt.getInvocation());
                        androidx.compose.runtime.internal.Expect_jvmKt.invokeComposable(this, (kotlin.jvm.functions.Function2) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(nextSlot, 2));
                        getInputSizeshNQ4ISI();
                    } else {
                        skipCurrentGroup();
                    }
                    derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                    getOutputFormats();
                    if (current != null) {
                        current.onEndComposition(getComposition());
                    }
                    this.isComposing = false;
                    this.getOutputSizes.clear();
                    getHighSpeedVideoSizes();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                } catch (java.lang.Throwable th) {
                    derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                    throw th;
                }
            } finally {
            }
        } finally {
            androidx.compose.runtime.internal.Trace.INSTANCE.endSection(beginSection);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.tooling.ComposeStackTrace Camera2StreamConfigurationMap(androidx.compose.runtime.ComposerImpl composerImpl) {
        return composerImpl.getHighSpeedVideoSizesFor();
    }

    public final boolean getHasInvalidations() {
        return !this.getOutputSizes.isEmpty();
    }

    private static java.lang.Object getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.SlotReader slotReader) {
        return slotReader.node(slotReader.getParent());
    }

    private static java.lang.Object getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.SlotReader slotReader, int i) {
        return slotReader.node(i);
    }

    private final void accessartificialFrame() {
        if (!this.toString) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.toString = false;
    }

    private final void coroutineCreation() {
        if (this.toString) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected");
        }
    }

    private final void getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.Anchor anchor) {
        if (this.getOutputMinFrameDurationlomOqCM.isEmpty()) {
            this.Camera2StreamConfigurationMap.insertSlots(anchor, this.insertTable);
        } else {
            this.Camera2StreamConfigurationMap.insertSlots(anchor, this.insertTable, this.getOutputMinFrameDurationlomOqCM);
            this.getOutputMinFrameDurationlomOqCM = new androidx.compose.runtime.changelist.FixupList();
        }
    }

    private final void getOutputSizeshNQ4ISI() {
        getHighSpeedVideoSizes(this.reader.getCurrentGroup());
        this.Camera2StreamConfigurationMap.removeCurrentGroup();
    }

    private static final androidx.compose.runtime.MovableContentStateReference Camera2StreamConfigurationMap(androidx.compose.runtime.ComposerImpl composerImpl, int i, java.util.List<androidx.compose.runtime.MovableContentStateReference> list) {
        int highResolutionOutputSizeshNQ4ISI;
        java.lang.Object groupObjectKey = composerImpl.reader.groupObjectKey(i);
        kotlin.jvm.internal.Intrinsics.checkNotNull(groupObjectKey, "");
        androidx.compose.runtime.MovableContent movableContent = (androidx.compose.runtime.MovableContent) groupObjectKey;
        java.lang.Object groupGet = composerImpl.reader.groupGet(i, 0);
        androidx.compose.runtime.Anchor anchor = composerImpl.reader.anchor(i);
        int groupSize = composerImpl.reader.groupSize(i);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<androidx.compose.runtime.Invalidation> list2 = composerImpl.getOutputSizes;
        for (highResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.ComposerImplKt.getHighResolutionOutputSizeshNQ4ISI((java.util.List<androidx.compose.runtime.Invalidation>) list2, i); highResolutionOutputSizeshNQ4ISI < list2.size(); highResolutionOutputSizeshNQ4ISI++) {
            androidx.compose.runtime.Invalidation invalidation = list2.get(highResolutionOutputSizeshNQ4ISI);
            if (invalidation.getGetHighResolutionOutputSizeshNQ4ISI() >= groupSize + i) {
                break;
            }
            arrayList.add(kotlin.TuplesKt.to(invalidation.getCamera2StreamConfigurationMap(), invalidation.getGetHighSpeedVideoSizes()));
        }
        return new androidx.compose.runtime.MovableContentStateReference(movableContent, groupGet, composerImpl.getComposition(), composerImpl.kernelVersion, anchor, arrayList, composerImpl.getHighSpeedVideoFpsRangesFor(i), list);
    }

    private static final androidx.compose.runtime.MovableContentStateReference getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.ComposerImpl composerImpl, int i) {
        int groupKey = composerImpl.reader.groupKey(i);
        java.lang.Object groupObjectKey = composerImpl.reader.groupObjectKey(i);
        java.util.ArrayList arrayList = null;
        if (groupKey != 126665345 || !(groupObjectKey instanceof androidx.compose.runtime.MovableContent)) {
            return null;
        }
        if (composerImpl.reader.containsMark(i)) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            Camera2StreamConfigurationMap(composerImpl, arrayList2, i);
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return Camera2StreamConfigurationMap(composerImpl, i, arrayList);
    }

    private static final void Camera2StreamConfigurationMap(androidx.compose.runtime.ComposerImpl composerImpl, java.util.List<androidx.compose.runtime.MovableContentStateReference> list, int i) {
        int groupSize = composerImpl.reader.groupSize(i);
        int i2 = i + 1;
        while (i2 < groupSize + i) {
            if (composerImpl.reader.hasMark(i2)) {
                androidx.compose.runtime.MovableContentStateReference highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(composerImpl, i2);
                if (highResolutionOutputSizeshNQ4ISI != null) {
                    list.add(highResolutionOutputSizeshNQ4ISI);
                }
            } else if (composerImpl.reader.containsMark(i2)) {
                Camera2StreamConfigurationMap(composerImpl, list, i2);
            }
            i2 += composerImpl.reader.groupSize(i2);
        }
    }

    private static final int getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.ComposerImpl composerImpl, int i, int i2, boolean z, int i3) {
        androidx.compose.runtime.SlotReader slotReader = composerImpl.reader;
        if (slotReader.hasMark(i2)) {
            int groupKey = slotReader.groupKey(i2);
            java.lang.Object groupObjectKey = slotReader.groupObjectKey(i2);
            if (groupKey == 126665345 && (groupObjectKey instanceof androidx.compose.runtime.MovableContent)) {
                androidx.compose.runtime.MovableContentStateReference highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(composerImpl, i2);
                if (highResolutionOutputSizeshNQ4ISI != null) {
                    composerImpl.ArtificialStackFrames.deletedMovableContent$runtime(highResolutionOutputSizeshNQ4ISI);
                    composerImpl.Camera2StreamConfigurationMap.recordSlotEditing();
                    composerImpl.Camera2StreamConfigurationMap.releaseMovableGroupAtCurrent(composerImpl.getComposition(), composerImpl.ArtificialStackFrames, highResolutionOutputSizeshNQ4ISI);
                }
                if (z && i2 != i) {
                    composerImpl.Camera2StreamConfigurationMap.endNodeMovementAndDeleteNode(i3, i2);
                    return 0;
                }
                return slotReader.nodeCount(i2);
            }
            if (groupKey == 206 && kotlin.jvm.internal.Intrinsics.areEqual(groupObjectKey, androidx.compose.runtime.ComposerKt.getReference())) {
                java.lang.Object groupGet = slotReader.groupGet(i2, 0);
                androidx.compose.runtime.RememberObserverHolder rememberObserverHolder = groupGet instanceof androidx.compose.runtime.RememberObserverHolder ? (androidx.compose.runtime.RememberObserverHolder) groupGet : null;
                java.lang.Object wrapped = rememberObserverHolder != null ? rememberObserverHolder.getWrapped() : null;
                androidx.compose.runtime.ComposerImpl.CompositionContextHolder compositionContextHolder = wrapped instanceof androidx.compose.runtime.ComposerImpl.CompositionContextHolder ? (androidx.compose.runtime.ComposerImpl.CompositionContextHolder) wrapped : null;
                if (compositionContextHolder != null) {
                    for (androidx.compose.runtime.ComposerImpl composerImpl2 : compositionContextHolder.getRef().getComposers()) {
                        composerImpl2.unwrapAs();
                        composerImpl.ArtificialStackFrames.reportRemovedComposition$runtime(composerImpl2.getComposition());
                    }
                }
                return slotReader.nodeCount(i2);
            }
            if (slotReader.isNode(i2)) {
                return 1;
            }
            return slotReader.nodeCount(i2);
        }
        if (slotReader.containsMark(i2)) {
            int groupSize = slotReader.groupSize(i2);
            int i4 = 0;
            for (int i5 = i2 + 1; i5 < groupSize + i2; i5 += slotReader.groupSize(i5)) {
                boolean isNode = slotReader.isNode(i5);
                if (isNode) {
                    composerImpl.Camera2StreamConfigurationMap.endNodeMovement();
                    composerImpl.Camera2StreamConfigurationMap.moveDown(slotReader.node(i5));
                }
                i4 += getHighResolutionOutputSizeshNQ4ISI(composerImpl, i, i5, isNode || z, isNode ? 0 : i3 + i4);
                if (isNode) {
                    composerImpl.Camera2StreamConfigurationMap.endNodeMovement();
                    composerImpl.Camera2StreamConfigurationMap.moveUp();
                }
            }
            if (slotReader.isNode(i2)) {
                return 1;
            }
            return i4;
        }
        if (slotReader.isNode(i2)) {
            return 1;
        }
        return slotReader.nodeCount(i2);
    }

    private final void getHighSpeedVideoSizes(int i) {
        boolean isNode = this.reader.isNode(i);
        if (isNode) {
            this.Camera2StreamConfigurationMap.endNodeMovement();
            this.Camera2StreamConfigurationMap.moveDown(this.reader.node(i));
        }
        getHighResolutionOutputSizeshNQ4ISI(this, i, i, isNode, 0);
        this.Camera2StreamConfigurationMap.endNodeMovement();
        if (isNode) {
            this.Camera2StreamConfigurationMap.moveUp();
        }
    }

    private final void unwrapAs() {
        if (this.kernelVersion.containsMark()) {
            getComposition().updateMovingInvalidations$runtime();
            androidx.compose.runtime.changelist.ChangeList changeList = new androidx.compose.runtime.changelist.ChangeList();
            this.deferredChanges = changeList;
            androidx.compose.runtime.SlotReader openReader = this.kernelVersion.openReader();
            try {
                this.reader = openReader;
                androidx.compose.runtime.changelist.ComposerChangeListWriter composerChangeListWriter = this.Camera2StreamConfigurationMap;
                androidx.compose.runtime.changelist.ChangeList changeList2 = composerChangeListWriter.getChangeList();
                try {
                    composerChangeListWriter.setChangeList(changeList);
                    getHighSpeedVideoSizes(0);
                    this.Camera2StreamConfigurationMap.releaseMovableContent();
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

    private final void getOutputMinFrameDurationlomOqCM() {
        this.Camera2StreamConfigurationMap.finalizeComposition();
        if (!androidx.compose.runtime.Stack.m5287isEmptyimpl(this.coroutineCreation)) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Start/end imbalance");
        }
        getHighSpeedVideoFpsRangesFor();
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        this.accessartificialFrame = null;
        this.isOutputSupportedFor = 0;
        this.getOutputSizeshNQ4ISI = 0;
        this.compositeKeyHashCode = 0L;
        this.toString = false;
        this.Camera2StreamConfigurationMap.resetTransientState();
        androidx.compose.runtime.Stack.m5280clearimpl(this.getOutputStallDurationlomOqCM);
        Camera2StreamConfigurationMap();
    }

    public final void verifyConsistent$runtime() {
        this.insertTable.verifyWellFormed();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tR\u001b\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextHolder;", "Landroidx/compose/runtime/RememberObserver;", "Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/ComposerImpl;", "ref", "<init>", "(Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;)V", "", "onRemembered", "()V", "onAbandoned", "onForgotten", "Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "getRef", "()Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CompositionContextHolder implements androidx.compose.runtime.RememberObserver {
        public static final int $stable = 8;
        private final androidx.compose.runtime.ComposerImpl.CompositionContextImpl ref;

        @Override // androidx.compose.runtime.RememberObserver
        public final void onRemembered() {
        }

        public CompositionContextHolder(androidx.compose.runtime.ComposerImpl.CompositionContextImpl compositionContextImpl) {
            this.ref = compositionContextImpl;
        }

        public final androidx.compose.runtime.ComposerImpl.CompositionContextImpl getRef() {
            return this.ref;
        }

        @Override // androidx.compose.runtime.RememberObserver
        public final void onAbandoned() {
            this.ref.dispose();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public final void onForgotten() {
            this.ref.dispose();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B-\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0010¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ*\u0010 \u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0011\u0010\u001f\u001a\r\u0012\u0004\u0012\u00020\f0\u001d¢\u0006\u0002\b\u001eH\u0010¢\u0006\u0004\b \u0010!J8\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00190$2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\"2\u0011\u0010\u001f\u001a\r\u0012\u0004\u0012\u00020\f0\u001d¢\u0006\u0002\b\u001eH\u0010¢\u0006\u0004\b%\u0010&J3\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00190$2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\"2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00190$H\u0010¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0010¢\u0006\u0004\b*\u0010\u0017J\u0017\u0010+\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0010¢\u0006\u0004\b+\u0010\u001cJ\u000f\u0010-\u001a\u00020,H\u0010¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020,¢\u0006\u0004\b/\u00100J\u001d\u00104\u001a\u00020\f2\f\u00103\u001a\b\u0012\u0004\u0012\u00020201H\u0010¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\fH\u0010¢\u0006\u0004\b6\u0010\u000eJ\u000f\u00107\u001a\u00020\fH\u0010¢\u0006\u0004\b7\u0010\u000eJ\u0017\u0010:\u001a\u00020\f2\u0006\u00109\u001a\u000208H\u0010¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\f2\u0006\u00109\u001a\u000208H\u0010¢\u0006\u0004\b<\u0010;J\u0019\u0010>\u001a\u0004\u0018\u00010=2\u0006\u00109\u001a\u000208H\u0010¢\u0006\u0004\b>\u0010?J+\u0010C\u001a\u00020\f2\u0006\u00109\u001a\u0002082\u0006\u0010@\u001a\u00020=2\n\u0010B\u001a\u0006\u0012\u0002\b\u00030AH\u0010¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0010¢\u0006\u0004\bE\u0010\u0017J\u001d\u0010H\u001a\u00020G2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\f0\u001dH\u0016¢\u0006\u0004\bH\u0010IR\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0011X\u0090\u0004¢\u0006\f\n\u0004\b\u0004\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010\u0006\u001a\u00020\u00058\u0011X\u0091\u0004¢\u0006\f\n\u0004\b\u0006\u0010M\u001a\u0004\bN\u0010OR\u001a\u0010\u0007\u001a\u00020\u00058\u0011X\u0091\u0004¢\u0006\f\n\u0004\b\u0007\u0010M\u001a\u0004\bP\u0010OR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0011X\u0091\u0004¢\u0006\f\n\u0004\b\t\u0010Q\u001a\u0004\bR\u0010SR0\u0010T\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020201\u0018\u0001018\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u00105R \u0010Z\u001a\b\u0012\u0004\u0012\u00020Y018\u0007X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010U\u001a\u0004\b[\u0010WR\u0014\u0010]\u001a\u00020\u00058QX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010OR\u0014\u0010_\u001a\u00020\u00058QX\u0090\u0004¢\u0006\u0006\u001a\u0004\b^\u0010OR\u0014\u0010c\u001a\u00020`8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u001a\u0010f\u001a\u00020`8QX\u0090\u0004¢\u0006\f\u0012\u0004\be\u0010\u000e\u001a\u0004\bd\u0010bR+\u0010l\u001a\u00020,2\u0006\u0010g\u001a\u00020,8C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010.\"\u0004\bk\u00100R\u0014\u0010\u0015\u001a\u00020m8QX\u0090\u0004¢\u0006\u0006\u001a\u0004\bn\u0010o"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/CompositionContext;", "", "Landroidx/compose/runtime/CompositeKeyHashCode;", "compositeKeyHashCode", "", "collectingParameterInformation", "collectingSourceInformation", "Landroidx/compose/runtime/CompositionObserverHolder;", "observerHolder", "<init>", "(Landroidx/compose/runtime/ComposerImpl;JZZLandroidx/compose/runtime/CompositionObserverHolder;)V", "", "dispose", "()V", "Landroidx/compose/runtime/Composer;", "composer", "registerComposer$runtime", "(Landroidx/compose/runtime/Composer;)V", "unregisterComposer$runtime", "Landroidx/compose/runtime/ControlledComposition;", "composition", "registerComposition$runtime", "(Landroidx/compose/runtime/ControlledComposition;)V", "unregisterComposition$runtime", "Landroidx/compose/runtime/RecomposeScopeImpl;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "reportPausedScope$runtime", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "composeInitial$runtime", "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/runtime/ShouldPauseCallback;", "shouldPause", "Landroidx/collection/ScatterSet;", "composeInitialPaused$runtime", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ShouldPauseCallback;Lkotlin/jvm/functions/Function2;)Landroidx/collection/ScatterSet;", "invalidScopes", "recomposePaused$runtime", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ShouldPauseCallback;Landroidx/collection/ScatterSet;)Landroidx/collection/ScatterSet;", "invalidate$runtime", "invalidateScope$runtime", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "getCompositionLocalScope$runtime", "()Landroidx/compose/runtime/PersistentCompositionLocalMap;", "updateCompositionLocalScope", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;)V", "", "Landroidx/compose/runtime/tooling/CompositionData;", "table", "recordInspectionTable$runtime", "(Ljava/util/Set;)V", "startComposing$runtime", "doneComposing$runtime", "Landroidx/compose/runtime/MovableContentStateReference;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_REFERENCE, "insertMovableContent$runtime", "(Landroidx/compose/runtime/MovableContentStateReference;)V", "deletedMovableContent$runtime", "Landroidx/compose/runtime/MovableContentState;", "movableContentStateResolve$runtime", "(Landroidx/compose/runtime/MovableContentStateReference;)Landroidx/compose/runtime/MovableContentState;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroidx/compose/runtime/Applier;", "applier", "movableContentStateReleased$runtime", "(Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentState;Landroidx/compose/runtime/Applier;)V", "reportRemovedComposition$runtime", "action", "Landroidx/compose/runtime/CancellationHandle;", "scheduleFrameEndCallback", "(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", "J", "getCompositeKeyHashCode$runtime", "()J", "Z", "getCollectingParameterInformation$runtime", "()Z", "getCollectingSourceInformation$runtime", "Landroidx/compose/runtime/CompositionObserverHolder;", "getObserverHolder$runtime", "()Landroidx/compose/runtime/CompositionObserverHolder;", "inspectionTables", "Ljava/util/Set;", "getInspectionTables", "()Ljava/util/Set;", "setInspectionTables", "Landroidx/compose/runtime/ComposerImpl;", "composers", "getComposers", "getCollectingCallByInformation$runtime", "collectingCallByInformation", "getStackTraceEnabled$runtime", "stackTraceEnabled", "Lkotlin/coroutines/CoroutineContext;", "getEffectCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "getRecomposeCoroutineContext$runtime", "getRecomposeCoroutineContext$runtime$annotations", "recomposeCoroutineContext", "p0", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/MutableState;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/Composition;", "getComposition$runtime", "()Landroidx/compose/runtime/Composition;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class CompositionContextImpl extends androidx.compose.runtime.CompositionContext {
        private final boolean collectingParameterInformation;
        private final boolean collectingSourceInformation;
        private final long compositeKeyHashCode;
        private java.util.Set<java.util.Set<androidx.compose.runtime.tooling.CompositionData>> inspectionTables;
        private final androidx.compose.runtime.CompositionObserverHolder observerHolder;
        private final java.util.Set<androidx.compose.runtime.ComposerImpl> composers = new java.util.LinkedHashSet();

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final androidx.compose.runtime.MutableState Camera2StreamConfigurationMap = androidx.compose.runtime.SnapshotStateKt.mutableStateOf(androidx.compose.runtime.internal.PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf(), androidx.compose.runtime.SnapshotStateKt.referentialEqualityPolicy());

        public static /* synthetic */ void getRecomposeCoroutineContext$runtime$annotations() {
        }

        public CompositionContextImpl(long j, boolean z, boolean z2, androidx.compose.runtime.CompositionObserverHolder compositionObserverHolder) {
            this.compositeKeyHashCode = j;
            this.collectingParameterInformation = z;
            this.collectingSourceInformation = z2;
            this.observerHolder = compositionObserverHolder;
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* renamed from: getCompositeKeyHashCode$runtime, reason: from getter */
        public final long getCompositeKeyHashCode() {
            return this.compositeKeyHashCode;
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* renamed from: getCollectingParameterInformation$runtime, reason: from getter */
        public final boolean getCollectingParameterInformation() {
            return this.collectingParameterInformation;
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* renamed from: getCollectingSourceInformation$runtime, reason: from getter */
        public final boolean getCollectingSourceInformation() {
            return this.collectingSourceInformation;
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* renamed from: getObserverHolder$runtime, reason: from getter */
        public final androidx.compose.runtime.CompositionObserverHolder getObserverHolder() {
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

        @Override // androidx.compose.runtime.CompositionContext
        public final boolean getCollectingCallByInformation$runtime() {
            return androidx.compose.runtime.ComposerImpl.this.ArtificialStackFrames.getCollectingCallByInformation$runtime();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final boolean getStackTraceEnabled$runtime() {
            return androidx.compose.runtime.ComposerImpl.this.ArtificialStackFrames.getStackTraceEnabled$runtime();
        }

        public final void dispose() {
            if (this.composers.isEmpty()) {
                return;
            }
            java.util.Set<java.util.Set<androidx.compose.runtime.tooling.CompositionData>> set = this.inspectionTables;
            if (set != null) {
                for (androidx.compose.runtime.ComposerImpl composerImpl : this.composers) {
                    java.util.Iterator<java.util.Set<androidx.compose.runtime.tooling.CompositionData>> it = set.iterator();
                    while (it.hasNext()) {
                        it.next().remove(composerImpl.getCompositionData());
                    }
                }
            }
            this.composers.clear();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void registerComposer$runtime(androidx.compose.runtime.Composer composer) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(composer, "");
            super.registerComposer$runtime((androidx.compose.runtime.ComposerImpl) composer);
            this.composers.add(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void unregisterComposer$runtime(androidx.compose.runtime.Composer composer) {
            java.util.Set<java.util.Set<androidx.compose.runtime.tooling.CompositionData>> set = this.inspectionTables;
            if (set != null) {
                java.util.Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    java.util.Set set2 = (java.util.Set) it.next();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(composer, "");
                    set2.remove(((androidx.compose.runtime.ComposerImpl) composer).getCompositionData());
                }
            }
            kotlin.jvm.internal.TypeIntrinsics.asMutableCollection(this.composers).remove(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void registerComposition$runtime(androidx.compose.runtime.ControlledComposition composition) {
            androidx.compose.runtime.ComposerImpl.this.ArtificialStackFrames.registerComposition$runtime(composition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void unregisterComposition$runtime(androidx.compose.runtime.ControlledComposition composition) {
            androidx.compose.runtime.ComposerImpl.this.ArtificialStackFrames.unregisterComposition$runtime(composition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void reportPausedScope$runtime(androidx.compose.runtime.RecomposeScopeImpl scope) {
            androidx.compose.runtime.ComposerImpl.this.ArtificialStackFrames.reportPausedScope$runtime(scope);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final kotlin.coroutines.CoroutineContext getEffectCoroutineContext() {
            return androidx.compose.runtime.ComposerImpl.this.ArtificialStackFrames.getEffectCoroutineContext();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final kotlin.coroutines.CoroutineContext getRecomposeCoroutineContext$runtime() {
            return androidx.compose.runtime.CompositionKt.getRecomposeCoroutineContext(androidx.compose.runtime.ComposerImpl.this.getComposition());
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void composeInitial$runtime(androidx.compose.runtime.ControlledComposition composition, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content) {
            androidx.compose.runtime.ComposerImpl.this.ArtificialStackFrames.composeInitial$runtime(composition, content);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final androidx.collection.ScatterSet<androidx.compose.runtime.RecomposeScopeImpl> composeInitialPaused$runtime(androidx.compose.runtime.ControlledComposition composition, androidx.compose.runtime.ShouldPauseCallback shouldPause, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content) {
            return androidx.compose.runtime.ComposerImpl.this.ArtificialStackFrames.composeInitialPaused$runtime(composition, shouldPause, content);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final androidx.collection.ScatterSet<androidx.compose.runtime.RecomposeScopeImpl> recomposePaused$runtime(androidx.compose.runtime.ControlledComposition composition, androidx.compose.runtime.ShouldPauseCallback shouldPause, androidx.collection.ScatterSet<androidx.compose.runtime.RecomposeScopeImpl> invalidScopes) {
            return androidx.compose.runtime.ComposerImpl.this.ArtificialStackFrames.recomposePaused$runtime(composition, shouldPause, invalidScopes);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void invalidate$runtime(androidx.compose.runtime.ControlledComposition composition) {
            androidx.compose.runtime.ComposerImpl.this.ArtificialStackFrames.invalidate$runtime(androidx.compose.runtime.ComposerImpl.this.getComposition());
            androidx.compose.runtime.ComposerImpl.this.ArtificialStackFrames.invalidate$runtime(composition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void invalidateScope$runtime(androidx.compose.runtime.RecomposeScopeImpl scope) {
            androidx.compose.runtime.ComposerImpl.this.ArtificialStackFrames.invalidateScope$runtime(scope);
        }

        private final androidx.compose.runtime.PersistentCompositionLocalMap getHighResolutionOutputSizeshNQ4ISI() {
            return (androidx.compose.runtime.PersistentCompositionLocalMap) this.Camera2StreamConfigurationMap.getValue();
        }

        private final void getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap) {
            this.Camera2StreamConfigurationMap.setValue(persistentCompositionLocalMap);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final androidx.compose.runtime.PersistentCompositionLocalMap getCompositionLocalScope$runtime() {
            return getHighResolutionOutputSizeshNQ4ISI();
        }

        public final void updateCompositionLocalScope(androidx.compose.runtime.PersistentCompositionLocalMap scope) {
            getHighSpeedVideoFpsRangesFor(scope);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void recordInspectionTable$runtime(java.util.Set<androidx.compose.runtime.tooling.CompositionData> table) {
            java.util.HashSet hashSet = this.inspectionTables;
            if (hashSet == null) {
                hashSet = new java.util.HashSet();
                this.inspectionTables = hashSet;
            }
            hashSet.add(table);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void startComposing$runtime() {
            androidx.compose.runtime.ComposerImpl.this.getHighSpeedVideoSizes++;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void doneComposing$runtime() {
            androidx.compose.runtime.ComposerImpl.this.getHighSpeedVideoSizes--;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void insertMovableContent$runtime(androidx.compose.runtime.MovableContentStateReference reference) {
            androidx.compose.runtime.ComposerImpl.this.ArtificialStackFrames.insertMovableContent$runtime(reference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void deletedMovableContent$runtime(androidx.compose.runtime.MovableContentStateReference reference) {
            androidx.compose.runtime.ComposerImpl.this.ArtificialStackFrames.deletedMovableContent$runtime(reference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final androidx.compose.runtime.MovableContentState movableContentStateResolve$runtime(androidx.compose.runtime.MovableContentStateReference reference) {
            return androidx.compose.runtime.ComposerImpl.this.ArtificialStackFrames.movableContentStateResolve$runtime(reference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void movableContentStateReleased$runtime(androidx.compose.runtime.MovableContentStateReference reference, androidx.compose.runtime.MovableContentState data, androidx.compose.runtime.Applier<?> applier) {
            androidx.compose.runtime.ComposerImpl.this.ArtificialStackFrames.movableContentStateReleased$runtime(reference, data, applier);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void reportRemovedComposition$runtime(androidx.compose.runtime.ControlledComposition composition) {
            androidx.compose.runtime.ComposerImpl.this.ArtificialStackFrames.reportRemovedComposition$runtime(composition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final androidx.compose.runtime.Composition getComposition$runtime() {
            return androidx.compose.runtime.ComposerImpl.this.getComposition();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final androidx.compose.runtime.CancellationHandle scheduleFrameEndCallback(kotlin.jvm.functions.Function0<kotlin.Unit> action) {
            return androidx.compose.runtime.ComposerImpl.this.ArtificialStackFrames.scheduleFrameEndCallback(action);
        }
    }

    public final int stacksSize$runtime() {
        int i = this.getOutputMinFrameDuration.tos;
        int m5285getSizeimpl = androidx.compose.runtime.Stack.m5285getSizeimpl(this.getOutputStallDurationlomOqCM);
        int i2 = this.getARTIFICIAL_FRAME_PACKAGE_NAME.tos;
        return i + m5285getSizeimpl + i2 + androidx.compose.runtime.Stack.m5285getSizeimpl(this.coroutineCreation) + this.CoroutineDebuggingKt.tos;
    }

    @Override // androidx.compose.runtime.Composer
    public final androidx.compose.runtime.RecomposeScope getRecomposeScope() {
        return getCurrentRecomposeScope$runtime();
    }

    @Override // androidx.compose.runtime.Composer
    public final java.lang.Object getRecomposeScopeIdentity() {
        androidx.compose.runtime.RecomposeScopeImpl currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime();
        if (currentRecomposeScope$runtime != null) {
            return currentRecomposeScope$runtime.getAnchor();
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public final java.lang.Object rememberedValue() {
        return nextSlotForCache();
    }

    @Override // androidx.compose.runtime.Composer
    public final void updateRememberedValue(java.lang.Object value) {
        updateCachedValue(value);
    }

    @Override // androidx.compose.runtime.Composer
    public final void recordUsed(androidx.compose.runtime.RecomposeScope scope) {
        androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl = scope instanceof androidx.compose.runtime.RecomposeScopeImpl ? (androidx.compose.runtime.RecomposeScopeImpl) scope : null;
        if (recomposeScopeImpl != null) {
            recomposeScopeImpl.setUsed(true);
        }
    }

    public final void dispose$runtime() {
        java.lang.Object beginSection = androidx.compose.runtime.internal.Trace.INSTANCE.beginSection("Compose:Composer.dispose");
        try {
            this.ArtificialStackFrames.unregisterComposer$runtime(this);
            deactivate$runtime();
            getApplier().clear();
            this.isDisposed = true;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            androidx.compose.runtime.internal.Trace.INSTANCE.endSection(beginSection);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.runtime.PersistentCompositionLocalMap, java.lang.Object] */
    private final androidx.compose.runtime.PersistentCompositionLocalMap getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap, androidx.compose.runtime.PersistentCompositionLocalMap persistentCompositionLocalMap2) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder<androidx.compose.runtime.CompositionLocal<java.lang.Object>, androidx.compose.runtime.ValueHolder<java.lang.Object>> builder2 = persistentCompositionLocalMap.builder2();
        builder2.putAll(persistentCompositionLocalMap2);
        ?? build2 = builder2.build2();
        getHighSpeedVideoFpsRangesFor(204, androidx.compose.runtime.ComposerKt.getProviderMaps());
        getHighResolutionOutputSizeshNQ4ISI((java.lang.Object) build2);
        getHighResolutionOutputSizeshNQ4ISI((java.lang.Object) persistentCompositionLocalMap2);
        getInputSizeshNQ4ISI();
        return build2;
    }

    private final long getHighResolutionOutputSizeshNQ4ISI(int i, int i2, long j) {
        long rotateLeft;
        long j2 = 0;
        int i3 = 3;
        int i4 = 0;
        while (i >= 0) {
            if (i != i2) {
                int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(this.reader, i);
                if (highResolutionOutputSizeshNQ4ISI != 126665345) {
                    j2 = (j2 ^ java.lang.Long.rotateLeft(highResolutionOutputSizeshNQ4ISI, i3)) ^ java.lang.Long.rotateLeft(this.reader.hasObjectKey(i) ? 0 : getHighSpeedVideoFpsRanges(i), i4);
                    i3 = (i3 + 6) % 64;
                    i4 = (i4 + 6) % 64;
                    i = this.reader.parent(i);
                } else {
                    rotateLeft = java.lang.Long.rotateLeft(highResolutionOutputSizeshNQ4ISI, i4);
                }
            } else {
                rotateLeft = java.lang.Long.rotateLeft(j, i4);
            }
            return rotateLeft ^ j2;
        }
        return j2;
    }
}
